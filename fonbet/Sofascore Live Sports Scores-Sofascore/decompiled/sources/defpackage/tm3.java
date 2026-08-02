package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tm3 {
    public HashMap a;
    public HashMap b;
    public HashMap c;

    public float a(dd2 dd2Var) {
        HashMap hashMap = this.a;
        HashMap hashMap2 = this.b;
        if (!(dd2Var instanceof kd2)) {
            return dd2Var instanceof fd2 ? ((fd2) dd2Var).m() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        String e = ((kd2) dd2Var).e();
        return hashMap2.containsKey(e) ? ((rm3) hashMap2.get(e)).value() : hashMap.containsKey(e) ? ((Integer) hashMap.get(e)).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void b(int i, String str, String str2) {
        this.a.put(str, str2);
        this.b.put(str2, str);
        this.c.put(str, Integer.valueOf(i));
    }
}
