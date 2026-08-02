package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.braze.Constants;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* loaded from: classes2.dex */
public class x2 {
    private final StringBuilder a = new StringBuilder();

    public x2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public x2 b(String str) {
        this.a.append(str);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public x2 a(String str, Object obj, String str2) {
        this.a.append("\n").append(str).append(": ").append(obj).append(str2);
        return this;
    }

    public x2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.Z()).a("close_style", bVar.q()).a("close_delay_graphic", Long.valueOf(bVar.s()), Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.h1().substring(0, Math.min(aVar.h1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.f0()), Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY).a("skip_style", bVar.X()).a("Streaming", Boolean.valueOf(bVar.D0())).a("Video Location", bVar.K());
        }
        return this;
    }

    public x2 a(String str) {
        this.a.append("\n").append(str);
        return this;
    }

    public x2 a() {
        this.a.append("\n========================================");
        return this;
    }

    public x2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z = bVar instanceof r7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((r7) bVar).n1());
        }
        return this;
    }

    public x2 a(a3 a3Var) {
        return a(AndroidInitializeBoldSDK.MSG_NETWORK, a3Var.c()).a("Adapter Version", a3Var.A()).a("Format", a3Var.getFormat().getLabel()).a("Ad Unit ID", a3Var.getAdUnitId()).a("Placement", a3Var.getPlacement()).a("Network Placement", a3Var.U()).a("Serve ID", a3Var.T()).a("Creative ID", StringUtils.isValidString(a3Var.getCreativeId()) ? a3Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(a3Var.v()) ? a3Var.v() : "None").a("DSP Name", StringUtils.isValidString(a3Var.getDspName()) ? a3Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(a3Var.getDspId()) ? a3Var.getDspId() : "None").a("Server Parameters", a3Var.l());
    }

    public x2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", g8.a(appLovinAdView.getVisibility()));
    }

    public x2 a(com.applovin.impl.sdk.l lVar) {
        return a("Muted", Boolean.valueOf(lVar.p0().isMuted()));
    }

    public x2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
