package defpackage;

import android.content.Context;
import android.os.Build;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z00 implements k29 {
    public static boolean f = true;
    public final xy a;
    public final Object b = new Object();
    public jtk c;
    public boolean d;
    public final x00 e;

    public z00(xy xyVar) {
        this.a = xyVar;
        x00 x00Var = new x00();
        this.e = x00Var;
        if (xyVar.isAttachedToWindow()) {
            Context context = xyVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(x00Var);
                this.d = true;
            }
        }
        xyVar.addOnAttachStateChangeListener(new y00(this, 0));
    }

    @Override // defpackage.k29
    public final void a(n29 n29Var) {
        synchronized (this.b) {
            if (!n29Var.s) {
                n29Var.s = true;
                n29Var.b();
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.k29
    public final n29 b() {
        p29 v29Var;
        p29 p29Var;
        n29 n29Var;
        synchronized (this.b) {
            try {
                xy xyVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    eq3.A(xyVar);
                }
                if (i >= 29) {
                    p29Var = new t29();
                } else {
                    if (f) {
                        try {
                            v29Var = new s29(this.a, new xj2(), new wj2());
                        } catch (Throwable unused) {
                            f = false;
                            v29Var = new v29(c(this.a));
                        }
                    } else {
                        v29Var = new v29(c(this.a));
                    }
                    p29Var = v29Var;
                }
                n29Var = new n29(p29Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return n29Var;
    }

    public final ba5 c(xy xyVar) {
        jtk jtkVar = this.c;
        if (jtkVar != null) {
            return jtkVar;
        }
        jtk jtkVar2 = new jtk(xyVar.getContext());
        jtkVar2.setClipChildren(false);
        jtkVar2.setClipToPadding(false);
        jtkVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        xyVar.addView(jtkVar2, -1);
        this.c = jtkVar2;
        return jtkVar2;
    }
}
