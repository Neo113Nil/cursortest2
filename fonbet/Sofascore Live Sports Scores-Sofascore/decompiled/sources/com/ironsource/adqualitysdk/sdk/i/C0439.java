package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ւ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0439 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1247 = StringFog.decrypt("MDeRmC49YnsaIL2DDiZ4ZDQgmp8cJn5mFxebgBg8Ymw=\n", "eUX+9n1SFwk=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0558 f1248;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1249;

    static {
        StringFog.decrypt("3Wkx9tmkOSPeIjrx+6UjON9hB/rO\n", "sAxVn7jQUEw=\n");
        StringFog.decrypt("wreDQeDlDjDB/IhGzfQROsOCi0n4wwIp\n", "r9LnKIGRZ18=\n");
        StringFog.decrypt("37GsJuIInwzc+qsj5h2YIMenvCDuLpMV\n", "stTIT4N89mM=\n");
    }

    public C0439(C0558 c0558) {
        this.f1248 = c0558;
        C0469 c0469 = new C0469(this);
        AbstractC0430 m262 = AbstractC0430.m262();
        synchronized (m262) {
            m262.f1224.add(c0469);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m271(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        return iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB ? StringFog.decrypt("dZlR/0w=\n", "FP08kC7py/Q=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID ? StringFog.decrypt("N1vNx9BI4A==\n", "UTqktbIhhCo=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM ? StringFog.decrypt("rTbsMPf9\n", "xVOAWYKQg7A=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY ? StringFog.decrypt("4GJbeZFJCeD6dA==\n", "kxcrHOM6Zo4=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX ? StringFog.decrypt("RjyS/+87ZUQ=\n", "J0zik4BNDCo=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY ? StringFog.decrypt("HldNlS7BXoU=\n", "azkk4VegOvY=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED ? StringFog.decrypt("BshNbG01PwQU2URu\n", "da0hCgBQW20=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER ? StringFog.decrypt("F1UWERc=\n", "eCF+dGXr3JM=\n") : "";
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m272(C0439 c0439, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        c0439.getClass();
        C0503 c0503 = new C0503();
        c0503.f1645 = true;
        c0503.f1648 = iSAdQualityCustomMediationRevenue.getRevenue();
        c0503.f1650 = m271(iSAdQualityCustomMediationRevenue.getMediationNetwork());
        c0503.f1646 = iSAdQualityCustomMediationRevenue.getPlacement();
        c0503.f1644 = iSAdQualityCustomMediationRevenue.getCustomData();
        return c0503.m327();
    }
}
