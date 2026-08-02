package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tb {
    public final int a;
    public final float b;
    public final jii c;

    public tb(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = new jii(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
    }
}
