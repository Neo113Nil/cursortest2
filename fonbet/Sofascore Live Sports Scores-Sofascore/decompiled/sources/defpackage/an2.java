package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class an2 extends r99 {
    public float n0;
    public final HashMap o0;
    public final HashMap p0;
    public final HashMap q0;
    public HashMap r0;
    public HashMap s0;
    public xci t0;

    public an2(zci zciVar, int i) {
        super(zciVar, i);
        this.n0 = 0.5f;
        this.o0 = new HashMap();
        this.p0 = new HashMap();
        this.q0 = new HashMap();
        this.t0 = xci.a;
    }

    public final float t(String str) {
        HashMap hashMap = this.s0;
        return (hashMap == null || !hashMap.containsKey(str)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Float) this.s0.get(str)).floatValue();
    }

    public final float u(String str) {
        HashMap hashMap = this.q0;
        return hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float v(String str) {
        HashMap hashMap = this.r0;
        return (hashMap == null || !hashMap.containsKey(str)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Float) this.r0.get(str)).floatValue();
    }

    public final float w(String str) {
        HashMap hashMap = this.p0;
        return hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
