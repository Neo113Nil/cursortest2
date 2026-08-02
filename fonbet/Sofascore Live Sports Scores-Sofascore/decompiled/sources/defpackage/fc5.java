package defpackage;

import android.os.Looper;
import com.facebook.ads.AdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fc5 implements jc5 {
    @Override // defpackage.jc5
    public final hpo c(bc5 bc5Var, sm8 sm8Var) {
        if (sm8Var.o == null) {
            return null;
        }
        return new hpo(new vb5(AdError.MEDIAVIEW_MISSING_ERROR_CODE, new bdk()));
    }

    @Override // defpackage.jc5
    public final int d(sm8 sm8Var) {
        return sm8Var.o != null ? 1 : 0;
    }

    @Override // defpackage.jc5
    public final void b(Looper looper, bse bseVar) {
    }
}
