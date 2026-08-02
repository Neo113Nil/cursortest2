package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class n0 {
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap a = new WeakHashMap();
    public final j c = new j(16, new i0());
    public final j d = new j(16, new j0());

    public final void a(Context context, View view, m0 m0Var) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        Context applicationContext = context.getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) this.b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.b.put(applicationContext, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                    viewTreeObserver = rootView.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        k0 k0Var = new k0(this, applicationContext);
                        viewTreeObserver.addOnPreDrawListener(k0Var);
                        this.a.put(applicationContext, new Pair(viewTreeObserver, k0Var));
                    }
                }
            }
            rootView = view.getRootView();
            viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                k0 k0Var2 = new k0(this, applicationContext);
                viewTreeObserver.addOnPreDrawListener(k0Var2);
                this.a.put(applicationContext, new Pair(viewTreeObserver, k0Var2));
            }
        }
        weakHashMap.put(view, m0Var);
        b();
    }

    public final void b(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.b.get(context)) == null) {
            return;
        }
        j jVar = this.d;
        Object poll = jVar.a.poll();
        if (poll == null) {
            poll = jVar.b.a();
        }
        HashSet hashSet = (HashSet) poll;
        hashSet.addAll(weakHashMap.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            m0 m0Var = (m0) weakHashMap.get(view);
            if (m0Var != null) {
                j jVar2 = this.c;
                Object poll2 = jVar2.a.poll();
                if (poll2 == null) {
                    poll2 = jVar2.b.a();
                }
                Rect rect = (Rect) poll2;
                m0Var.a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.c.a.offer(rect);
            }
        }
        hashSet.clear();
        this.d.a.offer(hashSet);
    }

    public final void a(View view) {
        IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.b.get(context);
        if (map != null) {
            if (map.remove(view) != null) {
                if (IAlog.a <= 2) {
                    IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
                }
                if (map.isEmpty()) {
                    this.b.remove(context);
                    a(context);
                }
            }
        } else {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = (WeakHashMap) this.b.get(context2);
                if (weakHashMap != null && weakHashMap.remove(view) != null) {
                    if (IAlog.a <= 2) {
                        IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
                    }
                    if (weakHashMap.isEmpty()) {
                        this.b.remove(context2);
                        a(context2);
                    }
                }
            }
        }
        b();
    }

    public final void b() {
        for (Context context : this.b.keySet()) {
            IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    public final void a() {
        this.b.clear();
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.a.clear();
    }

    public final void a(Context context) {
        Pair pair = (Pair) this.a.get(context);
        if (pair != null) {
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
            this.a.remove(context);
        }
    }
}
