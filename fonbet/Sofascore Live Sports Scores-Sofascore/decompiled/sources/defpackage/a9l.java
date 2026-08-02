package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a9l extends WindowInsetsAnimation$Callback {
    public final qo2 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public a9l(qo2 qo2Var) {
        super(qo2Var.a);
        this.d = new HashMap();
        this.a = qo2Var;
    }

    public final d9l a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        d9l d9lVar = (d9l) hashMap.get(windowInsetsAnimation);
        if (d9lVar != null) {
            return d9lVar;
        }
        d9l d9lVar2 = new d9l(0, null, 0L);
        d9lVar2.a = new b9l(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, d9lVar2);
        return d9lVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            d9l a = a(windowInsetsAnimation);
            a.a.e(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.f(x9l.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        c0l g = this.a.g(a(windowInsetsAnimation), new c0l(bounds));
        g.getClass();
        fx.e();
        return fx.a(((u4a) g.b).e(), ((u4a) g.c).e());
    }
}
