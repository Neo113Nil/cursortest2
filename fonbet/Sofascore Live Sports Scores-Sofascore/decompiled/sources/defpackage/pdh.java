package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pdh extends lmj {
    public final boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdh(Context context) {
        super(context);
        context.getClass();
        this.u = true;
    }

    @Override // defpackage.lmj
    /* renamed from: getHorizontalPadding-D9Ej5fM */
    public float mo904getHorizontalPaddingD9Ej5fM() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.lmj
    public final boolean m() {
        return this.u;
    }
}
