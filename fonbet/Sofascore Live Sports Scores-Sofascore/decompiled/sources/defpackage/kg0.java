package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kg0 implements mg0 {
    public final /* synthetic */ int a;

    public /* synthetic */ kg0(int i) {
        this.a = i;
    }

    @Override // defpackage.pg0
    public final void b(kx4 kx4Var, int i, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                ww9.E(i, iArr, iArr2, false);
                break;
            case 1:
                ww9.F(i, iArr, iArr2, false);
                break;
            case 2:
                ww9.G(i, iArr, iArr2, false);
                break;
            default:
                ww9.H(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.lg0, defpackage.pg0
    public final float e() {
        switch (this.a) {
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.lg0
    public final void j(kx4 kx4Var, int i, int[] iArr, ema emaVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (emaVar != ema.a) {
                    ww9.E(i, iArr, iArr2, true);
                    break;
                } else {
                    ww9.E(i, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (emaVar != ema.a) {
                    ww9.F(i, iArr, iArr2, true);
                    break;
                } else {
                    ww9.F(i, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (emaVar != ema.a) {
                    ww9.G(i, iArr, iArr2, true);
                    break;
                } else {
                    ww9.G(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (emaVar != ema.a) {
                    ww9.H(i, iArr, iArr2, true);
                    break;
                } else {
                    ww9.H(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
