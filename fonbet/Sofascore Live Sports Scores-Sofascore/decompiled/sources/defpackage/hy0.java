package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hy0 extends wtc implements ga5, tkd, p3h {
    public long o;
    public n52 p;
    public float q;
    public uah r;
    public long s;
    public ema t;
    public pea u;
    public uah v;
    public pea w;

    @Override // defpackage.tkd
    public final void Z() {
        this.s = 9205357640488583168L;
        this.t = null;
        this.u = null;
        this.v = null;
        n9e.E(this);
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        y3h.k(b4hVar, this.r);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        pea peaVar;
        n52 n52Var;
        float f;
        b20 b20Var;
        yma ymaVar2;
        wj2 wj2Var = ymaVar.a;
        if (this.r == oyn.e) {
            if (!e8k.a(this.o, r13.i)) {
                ha5.o0(ymaVar, this.o, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            n52 n52Var2 = this.p;
            if (n52Var2 != null) {
                ha5.g0(ymaVar, n52Var2, 0L, 0L, this.q, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            }
        } else {
            if (njh.c(wj2Var.n(), this.s) && ymaVar.getLayoutDirection() == this.t && Intrinsics.c(this.v, this.r)) {
                peaVar = this.u;
                peaVar.getClass();
            } else {
                z1a.R(this, new j4(13, this, ymaVar));
                peaVar = this.w;
                this.w = null;
            }
            this.u = peaVar;
            this.s = wj2Var.n();
            this.t = ymaVar.getLayoutDirection();
            this.v = this.r;
            peaVar.getClass();
            if (!e8k.a(this.o, r13.i)) {
                qea.r(ymaVar, peaVar, this.o);
            }
            n52 n52Var3 = this.p;
            if (n52Var3 != null) {
                float f2 = this.q;
                boolean z = peaVar instanceof dxd;
                e28 e28Var = e28.a;
                if (z) {
                    oqf oqfVar = ((dxd) peaVar).g;
                    float f3 = oqfVar.a;
                    float f4 = oqfVar.b;
                    ymaVar.T(n52Var3, (4294967295L & Float.floatToRawIntBits(f4)) | (Float.floatToRawIntBits(f3) << 32), qea.H(oqfVar), f2, e28Var, 3);
                } else {
                    if (peaVar instanceof exd) {
                        exd exdVar = (exd) peaVar;
                        n52Var = n52Var3;
                        b20Var = exdVar.h;
                        if (b20Var != null) {
                            ymaVar2 = ymaVar;
                            f = f2;
                        } else {
                            e7g e7gVar = exdVar.g;
                            float f5 = e7gVar.b;
                            float f6 = e7gVar.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (e7gVar.h >> 32));
                            float f7 = e7gVar.c - f6;
                            float f8 = e7gVar.d - f5;
                            ymaVar.c(n52Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f2, e28Var);
                        }
                    } else {
                        if (!(peaVar instanceof cxd)) {
                            zzl.b();
                            return;
                        }
                        b20 b20Var2 = ((cxd) peaVar).g;
                        n52Var = n52Var3;
                        f = f2;
                        b20Var = b20Var2;
                        ymaVar2 = ymaVar;
                    }
                    ymaVar2.k0(b20Var, n52Var, f, e28Var, 3);
                }
            }
        }
        ymaVar.a();
    }

    @Override // defpackage.p3h
    public final boolean p() {
        return false;
    }
}
