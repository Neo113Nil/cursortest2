package defpackage;

import androidx.activity.ComponentActivity;
import com.moloco.sdk.publisher.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nl4 implements t70 {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public nl4(ol4 ol4Var, q4k q4kVar, Object obj, j80 j80Var) {
        rmk rmkVar = new rmk(ol4Var.a);
        this.b = rmkVar;
        this.c = q4kVar;
        this.d = obj;
        j80 j80Var2 = (j80) q4kVar.a.invoke(obj);
        this.f = j80Var2;
        this.g = j72.y(j80Var);
        Function1 function1 = q4kVar.b;
        j80 j80Var3 = rmkVar.d;
        if (j80Var3 == null) {
            j80Var3 = j80Var2.c();
            rmkVar.d = j80Var3;
        }
        int b = j80Var3.b();
        int i = 0;
        while (true) {
            j80 j80Var4 = rmkVar.d;
            y78 y78Var = rmkVar.a;
            if (i >= b) {
                if (j80Var4 == null) {
                    Intrinsics.i("targetVector");
                    throw null;
                }
                this.e = function1.invoke(j80Var4);
                j80 j80Var5 = rmkVar.c;
                if (j80Var5 == null) {
                    j80Var5 = j80Var2.c();
                    rmkVar.c = j80Var5;
                }
                int b2 = j80Var5.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    j80Var2.getClass();
                    j = Math.max(j, y78Var.t(j80Var.a(i2)));
                }
                this.a = j;
                j80 y = j72.y(((rmk) this.b).a(j, (j80) this.f, j80Var));
                this.h = y;
                int b3 = y.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    j80 j80Var6 = (j80) this.h;
                    float a = j80Var6.a(i3);
                    float f = ((rmk) this.b).e;
                    j80Var6.e(llf.b(a, -f, f), i3);
                }
                return;
            }
            if (j80Var4 == null) {
                Intrinsics.i("targetVector");
                throw null;
            }
            j80Var4.e(y78Var.w(j80Var2.a(i), j80Var.a(i)), i);
            i++;
        }
    }

    public void a() {
        l lVar = (l) this.h;
        if (lVar == null) {
            return;
        }
        lVar.c.e(null);
        lVar.d.e(null);
        lVar.b.invoke(lVar.a ? g.a : i.a);
        this.h = null;
    }

    @Override // defpackage.t70
    public boolean b() {
        return false;
    }

    @Override // defpackage.t70
    public j80 c(long j) {
        return !d(j) ? ((rmk) this.b).a(j, (j80) this.f, (j80) this.g) : (j80) this.h;
    }

    @Override // defpackage.t70
    public long e() {
        return this.a;
    }

    @Override // defpackage.t70
    public q4k f() {
        return (q4k) this.c;
    }

    @Override // defpackage.t70
    public Object g(long j) {
        if (d(j)) {
            return this.e;
        }
        Function1 function1 = ((q4k) this.c).b;
        rmk rmkVar = (rmk) this.b;
        j80 j80Var = (j80) this.f;
        j80 j80Var2 = (j80) this.g;
        j80 j80Var3 = rmkVar.b;
        if (j80Var3 == null) {
            j80Var3 = j80Var.c();
            rmkVar.b = j80Var3;
        }
        int b = j80Var3.b();
        int i = 0;
        while (true) {
            j80 j80Var4 = rmkVar.b;
            if (i >= b) {
                if (j80Var4 != null) {
                    return function1.invoke(j80Var4);
                }
                Intrinsics.i("valueVector");
                throw null;
            }
            if (j80Var4 == null) {
                Intrinsics.i("valueVector");
                throw null;
            }
            j80Var4.e(rmkVar.a.k(j80Var.a(i), j80Var2.a(i), j), i);
            i++;
        }
    }

    @Override // defpackage.t70
    public Object h() {
        return this.e;
    }

    public void i() {
        l lVar = (l) this.h;
        if (lVar != null) {
            lVar.c.e(null);
        }
        l lVar2 = (l) this.h;
        if (lVar2 != null) {
            lVar2.d.e(null);
        }
        this.h = null;
    }

    public nl4(ComponentActivity componentActivity, de deVar, k6b k6bVar, fdi fdiVar) {
        wd5 wd5Var = xd5.b;
        long R = wkn.R(60, be5.SECONDS);
        com.moloco.sdk.internal.publisher.nativead.ui.l lVar = new com.moloco.sdk.internal.publisher.nativead.ui.l(2);
        b bVar = new b(7);
        deVar.getClass();
        fdiVar.getClass();
        this.b = componentActivity;
        this.c = deVar;
        this.d = k6bVar;
        this.e = fdiVar;
        this.a = R;
        this.f = lVar;
        this.g = bVar;
    }
}
