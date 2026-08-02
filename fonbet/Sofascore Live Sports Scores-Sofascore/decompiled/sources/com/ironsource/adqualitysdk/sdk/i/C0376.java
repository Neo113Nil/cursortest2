package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ѓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0376 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0213 f1115;

    public C0376(C0213 c0213) {
        this.f1115 = c0213;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0213 c0213 = this.f1115;
        String str = (String) arrayList.get(0);
        c0213.getClass();
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(StringFog.decrypt("PyGk/LeObQ==\n", "e2TiveLCORc=\n"))) {
                    return UnitDisplayType.DEFAULT;
                }
                return null;
            case -1841345251:
                if (str.equals(StringFog.decrypt("QQZUVOIN\n", "ElcBFbBI5cA=\n"))) {
                    return UnitDisplayType.SQUARE;
                }
                return null;
            case -1372958932:
                if (str.equals(StringFog.decrypt("RkDs+DN4LXxbR/nx\n", "Dw64vWEreTU=\n"))) {
                    return UnitDisplayType.INTERSTITIAL;
                }
                return null;
            case -1201514634:
                if (str.equals(StringFog.decrypt("8LTUCwsMhFE=\n", "pvGGX0JPxR0=\n"))) {
                    return UnitDisplayType.VERTICAL;
                }
                return null;
            case -77725029:
                if (str.equals(StringFog.decrypt("lAuk1QfDn3Od\n", "2ErqkVSA3iM=\n"))) {
                    return UnitDisplayType.LANDSCAPE;
                }
                return null;
            case 73622449:
                if (str.equals(StringFog.decrypt("gGK5dTE=\n", "zTD8NmVwbzo=\n"))) {
                    return UnitDisplayType.MRECT;
                }
                return null;
            case 543046670:
                if (str.equals(StringFog.decrypt("LoGbS0N3iR4=\n", "fMTMChEzzFo=\n"))) {
                    return UnitDisplayType.REWARDED;
                }
                return null;
            case 1951953708:
                if (str.equals(StringFog.decrypt("hUli325v\n", "xwgskSs9D5o=\n"))) {
                    return UnitDisplayType.BANNER;
                }
                return null;
            default:
                return null;
        }
    }
}
