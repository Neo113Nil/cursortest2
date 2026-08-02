package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.e;
import com.ironsource.mediationsdk.d;
import com.sofascore.results.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cal {
    public static final WeakHashMap w = new WeakHashMap();
    public final j50 a;
    public final j50 b;
    public final j50 c;
    public final j50 d;
    public final j50 e;
    public final j50 f;
    public final j50 g;
    public final j50 h;
    public final j50 i;
    public final kkk j;
    public final e1d k;
    public final jak l;
    public final kkk m;
    public final kkk n;
    public final kkk o;
    public final kkk p;
    public final kkk q;
    public final kkk r;
    public final kkk s;
    public final boolean t;
    public int u;
    public final z4a v;

    public cal(View view) {
        j50 j50Var = new j50(4, "captionBar");
        this.a = j50Var;
        j50 j50Var2 = new j50(128, "displayCutout");
        this.b = j50Var2;
        j50 j50Var3 = new j50(8, "ime");
        this.c = j50Var3;
        j50 j50Var4 = new j50(32, "mandatorySystemGestures");
        this.d = j50Var4;
        j50 j50Var5 = new j50(2, "navigationBars");
        this.e = j50Var5;
        j50 j50Var6 = new j50(1, "statusBars");
        this.f = j50Var6;
        j50 j50Var7 = new j50(519, "systemBars");
        this.g = j50Var7;
        j50 j50Var8 = new j50(16, "systemGestures");
        this.h = j50Var8;
        j50 j50Var9 = new j50(64, "tappableElement");
        this.i = j50Var9;
        kkk kkkVar = new kkk(new e5a(0, 0, 0, 0), d.h);
        this.j = kkkVar;
        this.k = e.f(null);
        jak jakVar = new jak(new jak(j50Var7, j50Var3), j50Var2);
        this.l = jakVar;
        new jak(jakVar, new jak(new jak(new jak(j50Var9, j50Var4), j50Var8), kkkVar));
        this.m = qea.J(4, "captionBarIgnoringVisibility");
        this.n = qea.J(2, "navigationBarsIgnoringVisibility");
        this.o = qea.J(1, "statusBarsIgnoringVisibility");
        this.p = qea.J(519, "systemBarsIgnoringVisibility");
        this.q = qea.J(64, "tappableElementIgnoringVisibility");
        this.r = new kkk(new e5a(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new kkk(new e5a(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new z4a(this);
        WeakHashMap weakHashMap = bsk.a;
        x9l a = trk.a(view);
        if (a != null) {
            u9l u9lVar = a.a;
            j50Var.f(u9lVar.u(4));
            j50Var2.f(u9lVar.u(128));
            j50Var3.f(u9lVar.u(8));
            j50Var4.f(u9lVar.u(32));
            j50Var5.f(u9lVar.u(2));
            j50Var6.f(u9lVar.u(1));
            j50Var7.f(u9lVar.u(519));
            j50Var8.f(u9lVar.u(16));
            j50Var9.f(u9lVar.u(64));
        }
    }

    public static void b(cal calVar, x9l x9lVar) {
        boolean z = false;
        calVar.a.g(x9lVar, 0);
        calVar.c.g(x9lVar, 0);
        calVar.b.g(x9lVar, 0);
        calVar.e.g(x9lVar, 0);
        calVar.f.g(x9lVar, 0);
        calVar.g.g(x9lVar, 0);
        calVar.h.g(x9lVar, 0);
        calVar.i.g(x9lVar, 0);
        calVar.d.g(x9lVar, 0);
        calVar.m.f(ufa.G(x9lVar.a.j(4)));
        calVar.n.f(ufa.G(x9lVar.a.j(2)));
        calVar.o.f(ufa.G(x9lVar.a.j(1)));
        calVar.p.f(ufa.G(x9lVar.a.j(519)));
        calVar.q.f(ufa.G(x9lVar.a.j(64)));
        e55 h = x9lVar.a.h();
        calVar.j.f(ufa.G(h != null ? h.a() : u4a.e));
        b20 b20Var = null;
        if (h != null) {
            Path k = Build.VERSION.SDK_INT >= 31 ? qz.k(h.a) : null;
            if (k != null) {
                b20Var = new b20(k);
            }
        }
        ((eoh) calVar.k).setValue(b20Var);
        synchronized (snh.c) {
            y0d y0dVar = snh.j.h;
            if (y0dVar != null) {
                if (y0dVar.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            snh.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = bsk.a;
            z4a z4aVar = this.v;
            srk.c(view, z4aVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(z4aVar);
            d9l.a(view, z4aVar);
        }
        this.u++;
    }
}
