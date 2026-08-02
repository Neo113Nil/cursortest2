package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f40 extends TextPaint {
    public gtj a;
    public v8j b;
    public int c;
    public qah d;
    public r13 e;
    public n52 f;
    public ay4 g;
    public njh h;
    public ja5 i;

    public final gtj a() {
        gtj gtjVar = this.a;
        if (gtjVar != null) {
            return gtjVar;
        }
        gtj gtjVar2 = new gtj(this);
        this.a = gtjVar2;
        return gtjVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().u(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : defpackage.njh.c(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(n52 n52Var, long j, float f) {
        if (n52Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (n52Var instanceof pvh) {
            d(yfa.v(((pvh) n52Var).a, f));
            return;
        }
        if (!(n52Var instanceof oah)) {
            zzl.b();
            return;
        }
        int i = 0;
        if (Intrinsics.c(this.f, n52Var)) {
            njh njhVar = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = n52Var;
            this.h = new njh(j);
            this.g = goh.b(new e40(n52Var, j, i));
        }
        gtj a = a();
        ay4 ay4Var = this.g;
        a.z(ay4Var != null ? (Shader) ay4Var.getValue() : null);
        this.e = null;
        kik.Y(this, f);
    }

    public final void d(long j) {
        r13 r13Var = this.e;
        if ((r13Var == null ? false : e8k.a(r13Var.a, j)) || j == 16) {
            return;
        }
        this.e = new r13(j);
        setColor(hkg.s0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(ja5 ja5Var) {
        if (ja5Var == null || Intrinsics.c(this.i, ja5Var)) {
            return;
        }
        this.i = ja5Var;
        if (ja5Var.equals(e28.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(ja5Var instanceof jii)) {
            zzl.b();
            return;
        }
        a().E(1);
        jii jiiVar = (jii) ja5Var;
        a().D(jiiVar.a);
        gtj a = a();
        ((Paint) a.d).setStrokeMiter(jiiVar.b);
        a().C(jiiVar.d);
        a().B(jiiVar.c);
        a().y(jiiVar.e);
    }

    public final void f(qah qahVar) {
        if (qahVar == null || Intrinsics.c(this.d, qahVar)) {
            return;
        }
        this.d = qahVar;
        if (qahVar.equals(qah.d)) {
            clearShadowLayer();
            return;
        }
        qah qahVar2 = this.d;
        float f = qahVar2.c;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (qahVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), hkg.s0(this.d.a));
    }

    public final void g(v8j v8jVar) {
        if (v8jVar == null || Intrinsics.c(this.b, v8jVar)) {
            return;
        }
        this.b = v8jVar;
        int i = v8jVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
