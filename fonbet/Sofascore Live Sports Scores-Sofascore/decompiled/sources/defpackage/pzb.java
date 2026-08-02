package defpackage;

import com.google.android.material.button.MaterialButton;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pzb extends c6o {
    public final int r;

    public pzb(int i) {
        super(26);
        this.r = i;
    }

    @Override // defpackage.c6o
    public final float M(Object obj) {
        float[] fArr = ((qzb) obj).C;
        return fArr != null ? fArr[this.r] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.c6o
    public final void e0(Object obj, float f) {
        qzb qzbVar = (qzb) obj;
        float[] fArr = qzbVar.C;
        if (fArr != null) {
            int i = this.r;
            if (fArr[i] != f) {
                fArr[i] = f;
                kr9 kr9Var = qzbVar.E;
                if (kr9Var != null) {
                    float j = qzbVar.j();
                    MaterialButton materialButton = (MaterialButton) kr9Var.b;
                    int[] iArr = MaterialButton.N;
                    int i2 = (int) (j * 0.11f);
                    if (materialButton.E != i2) {
                        materialButton.E = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                qzbVar.invalidateSelf();
            }
        }
    }
}
