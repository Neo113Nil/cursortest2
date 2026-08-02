package defpackage;

import android.graphics.Bitmap;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wlk extends ujk {
    public final u39 b;
    public String c;
    public boolean d;
    public final aa5 e;
    public Function0 f;
    public final e1d g;
    public ay1 h;
    public final e1d i;
    public long j;
    public float k;
    public float l;
    public final vlk m;

    public wlk(u39 u39Var) {
        this.b = u39Var;
        u39Var.i = new vlk(this, 0);
        this.c = "";
        this.d = true;
        this.e = new aa5();
        this.f = ptj.t;
        this.g = e.f(null);
        this.i = e.f(new njh(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new vlk(this, 1);
    }

    @Override // defpackage.ujk
    public final void a(ha5 ha5Var) {
        e(ha5Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ha5 ha5Var, float f, ay1 ay1Var) {
        int i;
        boolean z;
        aa5 aa5Var;
        ay1 ay1Var2;
        a10 a10Var;
        char c;
        long j;
        ay1 ay1Var3;
        a10 a10Var2;
        int i2;
        int i3;
        u39 u39Var = this.b;
        boolean z2 = u39Var.d;
        e1d e1dVar = this.g;
        if (z2 && u39Var.e != 16) {
            ay1 ay1Var4 = (ay1) ((eoh) e1dVar).getValue();
            km5 km5Var = jmk.a;
            if (!(ay1Var4 instanceof ay1) ? ay1Var4 == null : !((i3 = ay1Var4.c) != 5 && i3 != 3)) {
                if (!(ay1Var instanceof ay1) ? ay1Var == null : !((i2 = ay1Var.c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    aa5Var = this.e;
                    if (!z && njh.c(this.j, ha5Var.n())) {
                        a10 a10Var3 = aa5Var.a;
                    }
                    if (i != 1) {
                        long j2 = u39Var.e;
                        km5 km5Var2 = jmk.a;
                        if (r13.d(j2) != 1.0f) {
                            j2 = r13.c(j2, 1.0f);
                        }
                        ay1Var2 = new ay1(j2, 5);
                    } else {
                        ay1Var2 = null;
                    }
                    this.h = ay1Var2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                    e1d e1dVar2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar2).getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar2).getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)))) & 4294967295L);
                    ema layoutDirection = ha5Var.getLayoutDirection();
                    a10Var = aa5Var.a;
                    wx wxVar = aa5Var.b;
                    if (a10Var != null || wxVar == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i4 = (int) (ceil >> 32);
                        Bitmap bitmap = a10Var.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i4 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    a10Var = tgj.k((int) (ceil >> c), (int) (ceil & j), i, 24);
                    wxVar = xx.a(a10Var);
                    aa5Var.a = a10Var;
                    aa5Var.b = wxVar;
                    aa5Var.d = i;
                    aa5Var.c = ceil;
                    wj2 wj2Var = aa5Var.e;
                    vj2 vj2Var = wj2Var.a;
                    long I = d7a.I(ceil);
                    kx4 kx4Var = vj2Var.a;
                    ema emaVar = vj2Var.b;
                    uj2 uj2Var = vj2Var.c;
                    wx wxVar2 = wxVar;
                    long j3 = vj2Var.d;
                    vj2Var.a = ha5Var;
                    vj2Var.b = layoutDirection;
                    vj2Var.c = wxVar2;
                    vj2Var.d = I;
                    wxVar2.o();
                    ha5.o0(wj2Var, r13.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 62);
                    this.m.invoke(wj2Var);
                    wxVar2.h();
                    vj2Var.a = kx4Var;
                    vj2Var.b = emaVar;
                    vj2Var.c = uj2Var;
                    vj2Var.d = j3;
                    a10Var.a.prepareToDraw();
                    this.d = false;
                    this.j = ha5Var.n();
                    if (ay1Var == null) {
                        ay1Var3 = ay1Var;
                    } else {
                        ay1Var3 = ((ay1) ((eoh) e1dVar).getValue()) != null ? (ay1) ((eoh) e1dVar).getValue() : this.h;
                    }
                    a10Var2 = aa5Var.a;
                    if (a10Var2 == null) {
                        r3a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    ha5.H(ha5Var, a10Var2, aa5Var.c, 0L, f, ay1Var3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        aa5Var = this.e;
        if (!z) {
            a10 a10Var32 = aa5Var.a;
        }
        if (i != 1) {
        }
        this.h = ay1Var2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
        e1d e1dVar22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar22).getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar22).getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)))) & 4294967295L);
        ema layoutDirection2 = ha5Var.getLayoutDirection();
        a10Var = aa5Var.a;
        wx wxVar3 = aa5Var.b;
        if (a10Var != null) {
        }
        c = ' ';
        j = 4294967295L;
        a10Var = tgj.k((int) (ceil2 >> c), (int) (ceil2 & j), i, 24);
        wxVar3 = xx.a(a10Var);
        aa5Var.a = a10Var;
        aa5Var.b = wxVar3;
        aa5Var.d = i;
        aa5Var.c = ceil2;
        wj2 wj2Var2 = aa5Var.e;
        vj2 vj2Var2 = wj2Var2.a;
        long I2 = d7a.I(ceil2);
        kx4 kx4Var2 = vj2Var2.a;
        ema emaVar2 = vj2Var2.b;
        uj2 uj2Var2 = vj2Var2.c;
        wx wxVar22 = wxVar3;
        long j32 = vj2Var2.d;
        vj2Var2.a = ha5Var;
        vj2Var2.b = layoutDirection2;
        vj2Var2.c = wxVar22;
        vj2Var2.d = I2;
        wxVar22.o();
        ha5.o0(wj2Var2, r13.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 62);
        this.m.invoke(wj2Var2);
        wxVar22.h();
        vj2Var2.a = kx4Var2;
        vj2Var2.b = emaVar2;
        vj2Var2.c = uj2Var2;
        vj2Var2.d = j32;
        a10Var.a.prepareToDraw();
        this.d = false;
        this.j = ha5Var.n();
        if (ay1Var == null) {
        }
        a10Var2 = aa5Var.a;
        if (a10Var2 == null) {
        }
        ha5.H(ha5Var, a10Var2, aa5Var.c, 0L, f, ay1Var3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        e1d e1dVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar).getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((njh) ((eoh) e1dVar).getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
