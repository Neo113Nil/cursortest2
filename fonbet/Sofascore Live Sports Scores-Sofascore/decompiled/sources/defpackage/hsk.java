package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface hsk {
    long a();

    long b();

    default float c() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    default float d() {
        return 2.0f;
    }

    default long e() {
        return hz8.i(48.0f, 48.0f);
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}
