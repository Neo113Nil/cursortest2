package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ukb extends phe {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ ukb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.phe
    public float a(gf9 gf9Var) {
        float intBitsToFloat;
        int G;
        switch (this.b) {
            case 0:
                Function2 function2 = gf9Var.a;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                tkb tkbVar = (tkb) this.c;
                if (tkbVar.k) {
                    return Float.NaN;
                }
                tkb tkbVar2 = tkbVar;
                while (true) {
                    jy0 jy0Var = tkbVar2.m;
                    if (!Float.isNaN((jy0Var == null || (G = ph0.G(gf9Var, (gf9[]) jy0Var.b)) < 0) ? Float.NaN : ((float[]) jy0Var.c)[G])) {
                        tkbVar2.n0(tkbVar.y0(), gf9Var);
                        dma w0 = tkbVar2.w0();
                        dma w02 = tkbVar.w0();
                        switch (gf9Var.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (w02.l(w0, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (w0.e() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (w02.l(w0, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (w0.e() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    tkb B0 = tkbVar2.B0();
                    if (B0 == null) {
                        tkbVar2.n0(tkbVar.y0(), gf9Var);
                        return Float.NaN;
                    }
                    tkbVar2 = B0;
                }
                break;
            default:
                return super.a(gf9Var);
        }
    }

    @Override // defpackage.phe
    public final ema b() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((tkb) obj).getLayoutDirection();
            default:
                return ((xy) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.phe
    public final int c() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((tkb) obj).V();
            default:
                return ((xy) obj).getRoot().G.p.a;
        }
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((tkb) obj).getFontScale();
            default:
                return ((xy) obj).getDensity().getFontScale();
        }
    }

    @Override // defpackage.kx4
    public final float j() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((tkb) obj).j();
            default:
                return ((xy) obj).getDensity().j();
        }
    }
}
