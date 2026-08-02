package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.network.f1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {
    public AdmParametersOuterClass$AdmParameters a;
    public final String b;
    public String c;
    public final String d;

    public y(String str, String str2) {
        this.b = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032e  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        String str;
        String str2;
        String str3;
        com.fyber.inneractive.sdk.ignite.m mVar;
        String igniteLauncherActivity;
        Boolean valueOf;
        String brandBidderCtaText;
        Boolean valueOf2;
        bVar.a.A = true;
        IAConfigManager.N.w.f = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int a = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.a.hasErrorMessage()) {
            this.a.getErrorMessage();
        }
        String sessionId = this.a.hasSessionId() ? this.a.getSessionId() : null;
        Long valueOf3 = this.a.hasContentId() ? Long.valueOf(this.a.getContentId()) : null;
        if (this.a.hasPublisherId()) {
            this.a.getPublisherId();
        }
        Integer valueOf4 = this.a.hasAdWidth() ? Integer.valueOf(this.a.getAdWidth()) : null;
        Integer valueOf5 = this.a.hasAdHeight() ? Integer.valueOf(this.a.getAdHeight()) : null;
        String sdkImpressionUrl = this.a.hasSdkImpressionUrl() ? this.a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.a.hasSdkClickUrl() ? this.a.getSdkClickUrl() : null;
        Integer valueOf6 = this.a.hasAdExpirationInterval() ? Integer.valueOf(this.a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.a.hasAdCompletionUrl() ? this.a.getAdCompletionUrl() : null;
        bVar.b = this.a.hasAdUnitId() ? this.a.getAdUnitId() : null;
        String name = this.a.getAdUnitType().name();
        Locale locale = Locale.US;
        name.toLowerCase(locale);
        String lowerCase = this.a.hasAdUnitId() ? this.a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        String adNetworkName = this.a.hasAdNetworkName() ? this.a.getAdNetworkName() : null;
        Long valueOf7 = this.a.hasAdNetworkId() ? Long.valueOf(this.a.getAdNetworkId()) : null;
        String creativeId = this.a.hasCreativeId() ? this.a.getCreativeId() : null;
        Long l = valueOf3;
        String adDomain = this.a.hasAdDomain() ? this.a.getAdDomain() : null;
        Integer num = valueOf4;
        String appBundleId = this.a.hasAppBundleId() ? this.a.getAppBundleId() : null;
        Integer num2 = valueOf5;
        String campaignId = this.a.hasCampaignId() ? this.a.getCampaignId() : null;
        Integer num3 = valueOf6;
        String d = this.a.hasPricingValue() ? Double.toString(this.a.getPricingValue()) : null;
        String str4 = lowerCase;
        String valueOf8 = this.a.hasSpotId() ? String.valueOf(this.a.getSpotId()) : null;
        impressionData.setCpmValue(d);
        impressionData.setCurrency("USD");
        if (this.a.hasMrcData()) {
            int pixelPercent = this.a.getMrcData().hasPixelPercent() ? this.a.getMrcData().getPixelPercent() : 0;
            str3 = campaignId;
            int pixelDuration = this.a.getMrcData().hasPixelDuration() ? this.a.getMrcData().getPixelDuration() : -1;
            str2 = adDomain;
            String pixelImpressionUrl = this.a.getMrcData().hasPixelImpressionUrl() ? this.a.getMrcData().getPixelImpressionUrl() : null;
            str = creativeId;
            com.fyber.inneractive.sdk.response.e eVar = bVar.a;
            eVar.s = pixelPercent;
            eVar.t = pixelDuration;
            eVar.u = pixelImpressionUrl;
        } else {
            str = creativeId;
            str2 = adDomain;
            str3 = campaignId;
        }
        Boolean valueOf9 = this.a.hasSkipMode() ? Boolean.valueOf(this.a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.a.q = this.a.toString();
        }
        bVar.a.a(num3 != null ? num3.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.a.d = l != null ? l.toString() : "";
        bVar.a.getClass();
        bVar.a.getClass();
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.a;
        eVar2.x = appBundleId;
        eVar2.y = this.d;
        eVar2.z = valueOf8;
        if (valueOf7 != null) {
            impressionData.setDemandId(valueOf7);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.a;
        eVar3.g = a;
        if (num != null) {
            eVar3.e = num.intValue();
        }
        if (num2 != null) {
            bVar.a.f = num2.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.a;
        eVar4.k = sdkImpressionUrl;
        eVar4.l = sdkClickUrl;
        eVar4.o = adCompletionUrl;
        eVar4.m = bVar.b;
        try {
            eVar4.n = UnitDisplayType.fromValue(str4);
        } catch (IllegalArgumentException unused) {
            bVar.a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(str)) {
            impressionData.setCreativeId(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            impressionData.setAdvertiserDomain(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            impressionData.setCampaignId(str3);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        bVar.a.r = impressionData;
        bVar.a.v = valueOf9 == null ? -1 : valueOf9.booleanValue() ? 1 : 0;
        String igniteInstallUrl = this.a.hasIgniteInstallUrl() ? this.a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.a.D = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.a;
        if (admParametersOuterClass$AdmParameters2 != null) {
            n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.a.getIgniteMode() : null;
            if (igniteMode != null && !igniteMode.equals(n.NONE)) {
                mVar = igniteMode.equals(n.SINGLETAP) ? com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP;
                if (mVar == null) {
                    mVar2 = mVar;
                } else {
                    eVar5.getClass();
                }
                eVar5.E = mVar2;
                igniteLauncherActivity = !this.a.hasIgniteLauncherActivity() ? this.a.getIgniteLauncherActivity() : null;
                if (!TextUtils.isEmpty(igniteLauncherActivity)) {
                    bVar.a.F = igniteLauncherActivity;
                }
                valueOf = !this.a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.a.getBrandBidderDontShowEndcard()) : null;
                if (valueOf != null) {
                    bVar.a.B = valueOf.booleanValue() ? "1" : "0";
                }
                brandBidderCtaText = this.a.getBrandBidderCtaText();
                if (!TextUtils.isEmpty(brandBidderCtaText)) {
                    bVar.a.C = brandBidderCtaText;
                }
                valueOf2 = !this.a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.a.getMraidVideoOMSignal()) : null;
                if (valueOf2 != null) {
                    bVar.a.G = valueOf2.booleanValue();
                }
                bVar.a.J = CreativeType.fromValue(this.a.getCreativeType());
                if (this.a.hasSkipDelay()) {
                    com.fyber.inneractive.sdk.response.e eVar6 = bVar.a;
                    double skipDelay = this.a.getSkipDelay();
                    eVar6.getClass();
                    eVar6.L = (int) Math.round(skipDelay);
                }
                if (this.a.hasSkipEndcardDelay()) {
                    return;
                }
                com.fyber.inneractive.sdk.response.e eVar7 = bVar.a;
                double skipEndcardDelay = this.a.getSkipEndcardDelay();
                eVar7.getClass();
                eVar7.K = (int) Math.round(skipEndcardDelay);
                return;
            }
        }
        mVar = mVar2;
        if (mVar == null) {
        }
        eVar5.E = mVar2;
        if (!this.a.hasIgniteLauncherActivity()) {
        }
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
        }
        if (!this.a.hasBrandBidderDontShowEndcard()) {
        }
        if (valueOf != null) {
        }
        brandBidderCtaText = this.a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
        }
        if (!this.a.hasMraidVideoOMSignal()) {
        }
        if (valueOf2 != null) {
        }
        bVar.a.J = CreativeType.fromValue(this.a.getCreativeType());
        if (this.a.hasSkipDelay()) {
        }
        if (this.a.hasSkipEndcardDelay()) {
        }
    }

    public final void b(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.b.post(new x(c0Var));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.a;
            int a = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : c.OTHER.a();
            com.fyber.inneractive.sdk.response.a a2 = com.fyber.inneractive.sdk.response.a.a(a);
            if (a2 == null) {
                a2 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.a.a.get(a2);
            com.fyber.inneractive.sdk.response.b b = eVar2 != null ? eVar2.b() : null;
            if (b != null) {
                b.a = b.a();
                a(b);
                eVar = b.a;
            } else {
                IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(a));
            }
        } catch (Exception e) {
            IAlog.a("failed parse adm network request with no input stream", e, new Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        f1 f1Var = new f1(new v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.d = new w(this);
        IAConfigManager.N.r.a(f1Var);
    }

    public final void a(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            AdmParametersOuterClass$AdmParameters parseFrom = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.b, 0));
            this.a = parseFrom;
            if (parseFrom != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (Exception e) {
            IAlog.f("failed to parse ad markup payload %s", e.getMessage());
            com.fyber.inneractive.sdk.util.r.b.post(new u(c0Var, e));
        }
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.c;
    }
}
