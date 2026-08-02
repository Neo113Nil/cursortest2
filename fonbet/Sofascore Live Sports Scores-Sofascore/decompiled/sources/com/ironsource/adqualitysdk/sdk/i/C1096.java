package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1096 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0891 f3404;

    public C1096(C0891 c0891) {
        this.f3404 = c0891;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0891 c0891 = this.f3404;
        String str = (String) arrayList.get(0);
        c0891.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("RBXkZGOkX59ZEvFt\n", "DVuwITH3C9Y=\n"))) {
                return Constants.AdType.INTERSTITIAL;
            }
            return null;
        }
        if (hashCode == 433141802) {
            if (str.equals(StringFog.decrypt("seQ7BE+4Lg==\n", "5KpwSgDvYEI=\n"))) {
                return Constants.AdType.UNKNOWN;
            }
            return null;
        }
        if (hashCode == 543046670) {
            if (str.equals(StringFog.decrypt("/wWJaGNNLqo=\n", "rUDeKTEJa+4=\n"))) {
                return Constants.AdType.REWARDED;
            }
            return null;
        }
        if (hashCode == 1951953708 && str.equals(StringFog.decrypt("2NRIUPRx\n", "mpUGHrEjMHo=\n"))) {
            return Constants.AdType.BANNER;
        }
        return null;
    }
}
