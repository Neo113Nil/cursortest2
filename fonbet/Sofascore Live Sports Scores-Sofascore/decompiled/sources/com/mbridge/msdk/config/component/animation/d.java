package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    private static final ConcurrentHashMap<String, f> a = new ConcurrentHashMap<>();

    public void a(View view) {
        if (view != null) {
            ConcurrentHashMap<String, f> concurrentHashMap = a;
            if (concurrentHashMap.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, f> entry : concurrentHashMap.entrySet()) {
                f value = entry.getValue();
                if (value != null && a(view, value.c())) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((String) it.next());
            }
        }
    }

    public void b(String str) {
        f fVar = a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().pause();
    }

    public void c(String str) {
        f fVar = a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().resume();
    }

    public void d(String str) {
        f fVar = a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().start();
    }

    public void e(String str) {
        a(str, true);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            f fVar = (f) d.a.get(this.a);
            if (fVar == null || fVar.a() != animator) {
                return;
            }
            d.a.remove(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public void a(String str, g gVar, View view, Animator animator, boolean z) {
        if (animator == null || view == null) {
            return;
        }
        String a2 = a(str, gVar, view);
        if (z && a.containsKey(a2)) {
            a(a2);
        }
        f fVar = new f();
        fVar.a(a2);
        fVar.a(gVar);
        fVar.a(view);
        fVar.a(animator);
        fVar.a(i.a(view));
        a(a2, animator);
        a.put(a2, fVar);
        animator.start();
    }

    public void a(String str, boolean z) {
        f remove = a.remove(str);
        if (remove == null) {
            return;
        }
        Animator a2 = remove.a();
        if (a2 != null) {
            a2.cancel();
        }
        if (!z || remove.b() == null) {
            return;
        }
        remove.b().b(remove.c());
    }

    public void a(String str) {
        Animator a2;
        f remove = a.remove(str);
        if (remove == null || (a2 = remove.a()) == null) {
            return;
        }
        a2.cancel();
        a2.removeAllListeners();
    }

    private void a(String str, Animator animator) {
        animator.addListener(new a(str));
    }

    private String a(String str, g gVar, View view) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (gVar != null && !TextUtils.isEmpty(gVar.a())) {
            return gVar.a();
        }
        return String.valueOf(System.identityHashCode(view));
    }

    private boolean a(View view, View view2) {
        if (view != null && view2 != null) {
            if (view == view2) {
                return true;
            }
            while (view2 != null) {
                Object parent = view2.getParent();
                if (!(parent instanceof View)) {
                    return false;
                }
                if (parent == view) {
                    return true;
                }
                view2 = (View) parent;
            }
        }
        return false;
    }
}
