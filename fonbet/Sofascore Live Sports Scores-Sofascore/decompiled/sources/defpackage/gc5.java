package defpackage;

import android.os.Looper;
import androidx.media3.common.b;
import com.facebook.ads.AdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gc5 implements kc5 {
    @Override // defpackage.kc5
    public final xb5 d(cc5 cc5Var, b bVar) {
        if (bVar.s == null) {
            return null;
        }
        return new hq5(new wb5(AdError.MEDIAVIEW_MISSING_ERROR_CODE, new cdk()));
    }

    @Override // defpackage.kc5
    public final int e(b bVar) {
        return bVar.s != null ? 1 : 0;
    }

    @Override // defpackage.kc5
    public final void c(Looper looper, cse cseVar) {
    }
}
