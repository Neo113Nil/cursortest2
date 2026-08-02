package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0936 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0888 f3145;

    public C0936(C0888 c0888) {
        this.f3145 = c0888;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0888 c0888 = this.f3145;
        String str = (String) arrayList.get(0);
        c0888.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1617199657) {
            if (str.equals(StringFog.decrypt("+XoZRZAfxw==\n", "sDRPBNxWg+s=\n"))) {
                return PlacementType.INVALID;
            }
            return null;
        }
        if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("AJVQi7X4JpwdkkWC\n", "SdsEzuerctU=\n"))) {
                return PlacementType.INTERSTITIAL;
            }
            return null;
        }
        if (hashCode == -65580248) {
            if (str.equals(StringFog.decrypt("PURN+Ls95kY6SlXuqDbr\n", "cwsZp/JzrxI=\n"))) {
                return PlacementType.NOT_INITIALIZED;
            }
            return null;
        }
        if (hashCode == 543046670 && str.equals(StringFog.decrypt("rCfDvD/jbiE=\n", "/mKU/W2nK2U=\n"))) {
            return PlacementType.REWARDED;
        }
        return null;
    }
}
