package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class g5 {
    private final WeakHashMap a = new WeakHashMap();
    private final Object b = new Object();
    private final Handler c = new Handler();
    private boolean d = false;
    private final WeakReference e;
    private final ViewTreeObserver.OnPreDrawListener f;
    private a g;

    public interface a {
        void a(int i, int i2);
    }

    public g5(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.g5$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean b;
                b = g5.this.b();
                return b;
            }
        };
        this.f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.b) {
            this.d = false;
            int i = -1;
            int i2 = -1;
            for (Map.Entry entry : this.a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i == -1 && i2 == -1) {
                        i = num.intValue();
                        i2 = num.intValue();
                    } else {
                        i = Math.min(i, ((Integer) entry.getValue()).intValue());
                        i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(i, i2);
            }
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.postDelayed(new Runnable() { // from class: com.applovin.impl.g5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g5.this.c();
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.b) {
            this.a.remove(view);
        }
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(View view, int i) {
        synchronized (this.b) {
            this.a.put(view, Integer.valueOf(i));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
