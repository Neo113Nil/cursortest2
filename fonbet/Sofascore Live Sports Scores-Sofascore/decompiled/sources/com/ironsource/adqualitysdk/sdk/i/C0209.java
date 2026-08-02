package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C4427z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.mbridge.msdk.newreward.player.BaseActivity;
import com.mbridge.msdk.newreward.player.MBRewardVideoActivity;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mintegral.msdk.MIntegralConstans;
import com.mintegral.msdk.MIntegralSDK;
import com.mintegral.msdk.activity.DomainMTGCommonActivity;
import com.mintegral.msdk.activity.MTGCommonActivity;
import com.mintegral.msdk.appwall.BottomRefreshListView;
import com.mintegral.msdk.appwall.MintegralAdActivity;
import com.mintegral.msdk.appwall.ShuffleFragment;
import com.mintegral.msdk.appwall.TabListFragment;
import com.mintegral.msdk.appwall.WallFragment;
import com.mintegral.msdk.appwall.report.eventcache.ImpressionCampaignExModel;
import com.mintegral.msdk.appwall.service.WallService;
import com.mintegral.msdk.appwall.view.WallViewPager;
import com.mintegral.msdk.appwall.viewpager.indicater.TabPageIndicator;
import com.mintegral.msdk.appwallex.TabListView;
import com.mintegral.msdk.appwallex.WallView;
import com.mintegral.msdk.base.entity.CampaignEx;
import com.mintegral.msdk.base.entity.CampaignUnit;
import com.mintegral.msdk.base.fragment.BaseFragment;
import com.mintegral.msdk.base.webview.BrowserView;
import com.mintegral.msdk.base.webview.WebViewFragment;
import com.mintegral.msdk.click.AppReceiver;
import com.mintegral.msdk.click.CommonJumpLoader;
import com.mintegral.msdk.interstitial.jscommon.interstitial;
import com.mintegral.msdk.interstitial.view.MTGInterstitialActivity;
import com.mintegral.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mintegral.msdk.interstitialvideo.out.MTGBidInterstitialVideoHandler;
import com.mintegral.msdk.interstitialvideo.out.MTGInterstitialVideoHandler;
import com.mintegral.msdk.mtgbanner.view.MTGBannerWebView;
import com.mintegral.msdk.mtgbid.out.BidManager;
import com.mintegral.msdk.mtgbid.out.BidResponsed;
import com.mintegral.msdk.mtgjscommon.authority.activity.MTGAuthorityActivity;
import com.mintegral.msdk.mtgjscommon.base.BaseWebView;
import com.mintegral.msdk.mtgjscommon.windvane.WindVaneWebView;
import com.mintegral.msdk.out.AppWallTrackingListener;
import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.Campaign;
import com.mintegral.msdk.out.IDownloadListener;
import com.mintegral.msdk.out.InterstitialListener;
import com.mintegral.msdk.out.LoadingActivity;
import com.mintegral.msdk.out.MIntegralSDKFactory;
import com.mintegral.msdk.out.MTGBannerView;
import com.mintegral.msdk.out.MTGBidRewardVideoHandler;
import com.mintegral.msdk.out.MTGConfiguration;
import com.mintegral.msdk.out.MTGInterstitialHandler;
import com.mintegral.msdk.out.MTGOfferWallHandler;
import com.mintegral.msdk.out.MTGRewardVideoHandler;
import com.mintegral.msdk.out.MtgBidCommonHandler;
import com.mintegral.msdk.out.MtgWallHandler;
import com.mintegral.msdk.out.NativeListener;
import com.mintegral.msdk.out.OnMTGMediaViewListener;
import com.mintegral.msdk.out.RewardVideoListener;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import com.mintegral.msdk.rover.RoverCampaignUnit;
import com.mintegral.msdk.shell.MTGActivity;
import com.mintegral.msdk.video.js.activity.AbstractActivity;
import com.mintegral.msdk.video.js.activity.AbstractJSActivity;
import com.mintegral.msdk.video.js.activity.VideoWebViewActivity;
import com.mintegral.msdk.video.module.MintegralBaseView;
import com.mintegral.msdk.video.module.MintegralClickCTAView;
import com.mintegral.msdk.video.module.MintegralClickMiniCardView;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralH5EndCardView;
import com.mintegral.msdk.video.module.MintegralLandingPageView;
import com.mintegral.msdk.video.module.MintegralNativeEndCardView;
import com.mintegral.msdk.video.module.MintegralPlayableView;
import com.mintegral.msdk.video.module.MintegralVastEndCardView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.videocommon.dialog.MTGAlertDialog;
import com.mintegral.msdk.videocommon.listener.InterVideoOutListener;
import com.mintegral.msdk.widget.MTGImageView;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.į, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0209 extends AbstractC0838 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f364 = StringFog.decrypt("aIL51HKJRQhmgOPSaw==\n", "D+eNlxPkNWk=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f363 = StringFog.decrypt("vBzXgUzYVPk=\n", "23mjwCiuHZ0=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f362 = StringFog.decrypt("0ZkCpnHVw8/7uDeEatLKyA==\n", "nM1F5R67paY=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f361 = StringFog.decrypt("0TCcVeEw3Yf4MrJj4Sj9lugNrW7wPg==\n", "nGTbB4RHvPU=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f360 = StringFog.decrypt("fzTKH9b70TBbFPQ=\n", "MmCNXrWPuEY=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f359 = StringFog.decrypt("242zPNWBZXH4mJcL05phau8=\n", "ltn0f7rsCB4=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f358 = StringFog.decrypt("ZtgxLsHHf4hZ5QIW9dBjjl3lAhY=\n", "K4x2b7SzF+c=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f357 = StringFog.decrypt("Tl0Rx3k3M4xwfT/6fiI6tmJnMuJyMQ==\n", "AwlWjhdDVv4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f356 = StringFog.decrypt("aeWKebiQM3hXxaREv4U6XE3VqF+ehThuSNS/\n", "JLHNMNbkVgo=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f355 = StringFog.decrypt("7jcTZMDR6vLHNT1SwMnD4c0HOFPX\n", "o2NUNqWmi4A=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f354 = StringFog.decrypt("kW5YEuKYOWqoX20j/5UEbb1WSTnvmR9MvVR7PO6O\n", "3DofUIv8cAQ=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f353 = StringFog.decrypt("2bCxAYkGfYnjhYQntgtLifusly2EDkqe\n", "lOT2Q+BiL+w=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f352 = StringFog.decrypt("nMVMpD6+r56jx2KDKA==\n", "0ZEL5l/Qwfs=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f351 = StringFog.decrypt("HAR+9E5iUD0aDGG7TyVTOhsAPbVWfxAEKyxRu01lWzspAnat\n", "f2sT2iMLPkk=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f350 = StringFog.decrypt("bqXmAMuytCxRpsQg/LW/Pg==\n", "I/GhQqrc2kk=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f349 = StringFog.decrypt("UJMeqFyt9I5WmwHnXer3iVeXXetFo/ibXZIW9B+y859E0j7Sdob7lF2ZAdFUpsyTVos=\n", "M/xzhjHEmvo=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f348 = StringFog.decrypt("HhLhOIIz7/skFuMg\n", "SXONVMRBjpw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f347 = StringFog.decrypt("4YBdoaahnvbniELup+ad8eaEHu67uIfj7oMe2KqknMTwjlfirqaE\n", "gu8wj8vI8II=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f346 = StringFog.decrypt("+59pnWPfqnjIjnqha92hYNOcba9s1rQ=\n", "uu8ZygKzxiw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f345 = StringFog.decrypt("P/8MGGYV6PAZ/wk5agjo\n", "a55uVA9mnLY=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f344 = StringFog.decrypt("gb7BwSKwxRmgt9PKIbLU\n", "0ta0p0TcoF8=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f343 = StringFog.decrypt("TBIMD/HB2ShoDx0I9uDiPnorER7p\n", "Dn14e56si00=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f342 = StringFog.decrypt("W9EwMfqZ9FBh1DsC+or+aw==\n", "D7BSYZv+kRk=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f341 = StringFog.decrypt("TmivP1jlYPdJaKQ2fA==\n", "GQnDUw6MBYA=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f340 = StringFog.decrypt("wJC5BdIoQOLGmKZK029D5ceU+krPMVn3z5P6XdYkWbj0nrhH6ShL4fOes07N\n", "o//UK79BLpY=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f339 = StringFog.decrypt("1Nj6FyVkwzvq2vM=\n", "g7mWe3YBsU0=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f338 = StringFog.decrypt("cgWbwzHKlNBUBqjQOcmG0FwGrskZ1oPcVw==\n", "O2jrsVS557k=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f337 = StringFog.decrypt("y6V3YAhti032oWI=\n", "n8QVLGEe/xs=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f336 = StringFog.decrypt("d8AWYjbZY40=\n", "IKF6DmCwBvo=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f335 = StringFog.decrypt("1YRYWK/ZAOnTjEcXrp4D7tKAGxeywBn82odQDuznD/HavVwTtQ==\n", "tus1dsKwbp0=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f334 = StringFog.decrypt("deCIqMM60r9z6Jfnwn3RuHLky+TPINnlYeqH8Mc2y+VU/Yrx3TbOnX/qkg==\n", "Fo/lhq5TvMs=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f333 = StringFog.decrypt("ZqeiD52KJ7x9moAx\n", "K/PlRvDrQNk=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f332 = StringFog.decrypt("xSnBlvgqXuXDId7Z+W1d4sItgs/8J1f00mjh7NIKXfDBI/rR8DQ=\n", "pkasuJVDMJE=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f331 = StringFog.decrypt("qUAs2R+5XOqLTjPbA69T7o8=\n", "+y9avG36PYc=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f330 = StringFog.decrypt("w6++zC0TE5nvtb33KQ0=\n", "jtvZm0x/f9E=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f329 = StringFog.decrypt("UnBZv1eOa6hIRXKceYlgvnNBbA==\n", "HyQe8DHoDto=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f328 = StringFog.decrypt("sKt2eVCKCESQsn5VcY8lT5G6Yw==\n", "/d8ROznuSys=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f327 = StringFog.decrypt("WjwsfuvaPER9Jw==\n", "GFVIM4q0XSM=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f326 = StringFog.decrypt("5mcoKYcbdeTKfSkf\n", "pA5Me+JoBYs=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f325 = StringFog.decrypt("n/cPXEyjMtiZ/xATTeQx35jzTB9VrTbfn/cPH06kcs6d6wdcY6svyav9ACRIrys=\n", "/JhiciHKXKw=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f324 = StringFog.decrypt("wh0WKedV8ArEFQlm5hLzDcUZVWr+W/QNwh0WauVSsAnIHB9x61L7UPYbFWPcXfAb9hcZUeNZ6Q==\n", "oXJ7B4o8nn4=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f323 = StringFog.decrypt("WorFZvbiiSlTt+NL9eA=\n", "F96CJ5qH+10=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f322 = StringFog.decrypt("f5Jzom4UO/95mmztb1M4+HiWMPpqGTDkf5Jz4WwTe+91nHLjZFMY31u8culxCRHifZFx6w==\n", "HP0ejAN9VYs=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f321 = StringFog.decrypt("eeA7l4rS/ZR/6CTYi5X+k37keM+O3/aPNOI53ZLX9s5X5jjNgtzhgXbZP92C1MWJf/g=\n", "Go9Wuee7k+A=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f320 = StringFog.decrypt("oRvYVRD3Uf+nE8caEbBS+KYfmw0U+lrk7BnaHwjyWqWPHdsPGPlN6q4i1AgJ21HvgRXHHyv3Wvw=\n", "wnS1e32eP4s=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f319 = StringFog.decrypt("/Jbp1ZsChvD6nvaamkWF9/uSqo2fD43rsZTrn4MHjarSkOqPkwya5fO35Y+fHY3B8Z3HmoQPvu36\njg==\n", "n/mE+/Zr6IQ=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f318 = StringFog.decrypt("87TwVnOp++v1vO8Zcu747PSwsw53pPDwvrbyHGus8LHdsvMMe6fn/vyY8RF9q9bL0Y30HWk=\n", "kNudeB7AlZ8=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f317 = StringFog.decrypt("zS4XPkYyrJLLJghxR3WvlcoqVGZCP6eJgCwVdF43p8jjKBRkTjywh8IDG2NODauD2Q==\n", "rkF6ECtbwuY=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f316 = StringFog.decrypt("cxb8rIgAZ551HuPjiUdkmXQSv/SMDWyFPhT+5pAFbMRdEP/2gA57i3w6/euGAkSDfhDS45cNX4N1\nDg==\n", "EHmRguVpCeo=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f315 = StringFog.decrypt("2R24Y4SclZzfFacshduWm94Z+zuAkZ6HlB+6KZyZnsb3G7s5jJKJidYxuiOdlJKG3wCDJIyC\n", "unLVTen1++g=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f314 = StringFog.decrypt("hRs9eY4m72qDEyI2j2HsbYIffiGKK+RxyBk/M5Yj5DCrHT4jhijzf4o8ZRKNK8J/lBAGPoY4\n", "5nRQV+NPgR4=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f313 = StringFog.decrypt("IZZpK6T+Mk4nnnZkpbkxSSaSKnOg8zlVbJRrYbz7ORQPkGpxrPAuWy61ZWut/jJdEphjYJ/+OU0=\n", "QvkEBcmXXDo=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f312 = StringFog.decrypt("oBm1coVGAmOmEao9hAEBZKcd9iqBSwl47Ru3OJ1DCTmOH7YojUgedq8mtD2RTg57piCxOZ8=\n", "w3bYXOgvbBc=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f311 = StringFog.decrypt("LbQmHXZkU/ELuz0gVF56/BGuDidUWw==\n", "YtprSTEpNpU=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f310 = StringFog.decrypt("7DE16CBOENLvHTfkJE8zx8sqMf8gVCQ=\n", "qF5YiUkgXYY=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f309 = StringFog.decrypt("2IZOW0E83k/ejlEUQHvdSN+CDRRPIdlN0p1aW2g63VrSh24haxbfVtaGTTRPIdlN0p1a\n", "u+kjdSxVsDs=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f308 = StringFog.decrypt("yhavSFgbYzjRPZlIQDtyKO4ilFlW\n", "h1T9LS96EVw=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f307 = StringFog.decrypt("51NDvF2L8gfgW0u8XZrkBapSS+VCjPcP9lgA4lyI+Qv2EmPQYoz3D/ZYePtUjO8v50hH5Fmd+Q==\n", "hDwukjDpgG4=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f306 = StringFog.decrypt("TXG807oih7J5ebvP\n", "DxDPtvtB89s=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f305 = StringFog.decrypt("cdMD7cBGe4d22wvtwFdthTzSC7TfQX6PYNhAs8FFcItgkiyi3kFIjWbVGKrZXQ==\n", "Erxuw60kCe4=\n");

    public C0209(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("fecmhdGJ/nV98DOk66PB\n", "GoJSyLjnihA=\n"), new C0294(this));
        hashMap.put(f364, new C0293(this));
        hashMap.put(StringFog.decrypt("yg2/CdwfeTbKDYU40Bk=\n", "rWjLWb18Elc=\n"), new C0292(this));
        hashMap.put(StringFog.decrypt("zwOVHZ0ZUZ39FI0=\n", "qGbhXvFwMvY=\n"), new C0291(this));
        hashMap.put(StringFog.decrypt("9HfM/2v0IdjqYt0=\n", "kxK4swKaSow=\n"), new C0278(this));
        hashMap.put(StringFog.decrypt("0VCgKlztaf3jR7g=\n", "tjXUYzGMDpg=\n"), new C0275(this));
        hashMap.put(StringFog.decrypt("kLkM7QvmWwyFsA==\n", "99x4pGiJNVk=\n"), new C0258(this));
        hashMap.put(StringFog.decrypt("6JFInZwEXg==\n", "j/Q83PhNOjs=\n"), new C0254(this));
        hashMap.put(f363, new C0226(this));
        hashMap.put(StringFog.decrypt("gauFi1vQN+WDmJihX8sK4YetmqxUww3nlKefog==\n", "5s7xxTqkXpM=\n"), new C0341(this));
        hashMap.put(StringFog.decrypt("Vm19gzuKEQNXXmCkLaUbKkx7faQ0gQ0=\n", "JQgJwVrkf2Y=\n"), new C0340(this));
        hashMap.put(StringFog.decrypt("C830zSIw1HkJ\n", "bKiAjEZkrQk=\n"), new C0308(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2128525576:
                if (str.equals(f337)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -2127096804:
                if (str.equals(f347)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -2107186802:
                if (str.equals(StringFog.decrypt("CPs1mdvd7qgK8zKEyNbKvg==\n", "RppB8K24r8w=\n"))) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2088438133:
                if (str.equals(f316)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -2083223016:
                if (str.equals(f354)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2030516682:
                if (str.equals(f318)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case -1980005015:
                if (str.equals(StringFog.decrypt("vdyn41Qdz6CY2KLYWBbM\n", "6rnFtT14uOY=\n"))) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -1978654101:
                if (str.equals(f332)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -1969670564:
                if (str.equals(f312)) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case -1940754118:
                if (str.equals(StringFog.decrypt("Sx40VyBv4V1ALwZAJmf0QH4F\n", "CnxHI1IOgik=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1919192581:
                if (str.equals(StringFog.decrypt("SWl5rSXdI1R3SVeQIsgqZ2dJV5Ii3T8=\n", "BD0+5EupRiY=\n"))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1876403509:
                if (str.equals(f342)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1874906197:
                if (str.equals(StringFog.decrypt("cDW2Hb97z5lRCrkarlnTnH49qg2MddiP\n", "PVzYadocvfg=\n"))) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -1812546352:
                if (str.equals(f319)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1766796574:
                if (str.equals(StringFog.decrypt("8GQmY0RPSMjfZjljXE1Q081xN2RXWA==\n", "vgVSCjIqHLo=\n"))) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1702626105:
                if (str.equals(StringFog.decrypt("1ZAgYMeW4Ev0rydwx57EQ/2O\n", "mPlOFKLxkio=\n"))) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -1674303146:
                if (str.equals(f362)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1656370481:
                if (str.equals(StringFog.decrypt("5Yd56i2ZVlXli3XYEp1P\n", "su4Xjnv4ODA=\n"))) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -1537112313:
                if (str.equals(StringFog.decrypt("VrUMlxGKbbJruD2YHoNtvmeKApwH\n", "Bdxr+XDmOts=\n"))) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case -1522474666:
                if (str.equals(f310)) {
                    c = '`';
                    break;
                }
                c = 65535;
                break;
            case -1507367077:
                if (str.equals(f353)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1458291270:
                if (str.equals(f359)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1325137233:
                if (str.equals(f360)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1265212384:
                if (str.equals(StringFog.decrypt("FQh48FV2W041BEj7VkxwSjE=\n", "RmEfnjQaGS8=\n"))) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case -1077685820:
                if (str.equals(f329)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -1061727315:
                if (str.equals(f350)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1058625022:
                if (str.equals(StringFog.decrypt("PSdeAoxuhhwdOksNjnaNLS8tTQWba7MH\n", "bk45bO0Cx34=\n"))) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case -931831919:
                if (str.equals(f352)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -920590771:
                if (str.equals(StringFog.decrypt("Fg/yC3hg0KA3JfMRaWbLrz4UyhZ4cA==\n", "W2acfx0HosE=\n"))) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -894298414:
                if (str.equals(StringFog.decrypt("XrYQ4qVC+7d/kx/4pEznsUO+GfOWTOyh\n", "E99+lsAlidY=\n"))) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case -811615267:
                if (str.equals(f315)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -667901878:
                if (str.equals(StringFog.decrypt("FFDgDTrzP5k1cbs8MfAOmStd2BA64w==\n", "WTmOeV+UTfg=\n"))) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case -558926374:
                if (str.equals(f314)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case -495785498:
                if (str.equals(f308)) {
                    c = 'b';
                    break;
                }
                c = 65535;
                break;
            case -464794090:
                if (str.equals(f346)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -461263347:
                if (str.equals(f340)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -396369642:
                if (str.equals(f309)) {
                    c = 'a';
                    break;
                }
                c = 65535;
                break;
            case -249445036:
                if (str.equals(f341)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -228661957:
                if (str.equals(f320)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -201859056:
                if (str.equals(f327)) {
                    c = C4427z5.U;
                    break;
                }
                c = 65535;
                break;
            case -156796625:
                if (str.equals(StringFog.decrypt("PyZIodBoXEAeDUem0FlHRAU=\n", "ck8m1bUPLiE=\n"))) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -126256187:
                if (str.equals(StringFog.decrypt("u2+GSIkocLyWZ4BMkyFxuIA=\n", "8ivpP+dEH90=\n"))) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -121577375:
                if (str.equals(StringFog.decrypt("RRPE0ApBKklkCe7v\n", "CFqqpG8mWCg=\n"))) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -75274960:
                if (str.equals(StringFog.decrypt("p7bUfc7W1ck=\n", "5Ne5Da+/sqc=\n"))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -33766813:
                if (str.equals(StringFog.decrypt("5f+bxdKLRNrY+I7M9pFU1sPdhtPUnV7W3g==\n", "rJHvoKD4MLM=\n"))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 148631506:
                if (str.equals(f358)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 154057692:
                if (str.equals(StringFog.decrypt("rg0zKDuHAbuPBzIyLZQStJA=\n", "40RdXF7gc9o=\n"))) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 329817920:
                if (str.equals(StringFog.decrypt("CzFC4oz19ao9MVrPl+LXpjcxRw==\n", "WVQ1g/6Ro8M=\n"))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 336960212:
                if (str.equals(StringFog.decrypt("W1MBSBQUxJVNXAVM\n", "GDJsOHV9o/s=\n"))) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 388542383:
                if (str.equals(f336)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 522506349:
                if (str.equals(StringFog.decrypt("DIWBGOtIBkgMhYAKxXwXQyyFkQQ=\n", "WuzlfYQfYyo=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(StringFog.decrypt("T7NWQNA4jAhStENJ\n", "Jt0iJaJL+GE=\n"))) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 675209731:
                if (str.equals(StringFog.decrypt("OrN0DuweWZo8qg==\n", "edIZfo13PvQ=\n"))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 713779451:
                if (str.equals(StringFog.decrypt("qWO3iZyX+W6ISbWUmpvGZopjmpyLlN1mgX0=\n", "5ArZ/fnwiw8=\n"))) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(StringFog.decrypt("t/l+9r2gqKuK7G/xrrc=\n", "+ZgKn8vF5MI=\n"))) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 751945826:
                if (str.equals(f313)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case 787683072:
                if (str.equals(f333)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 824636291:
                if (str.equals(StringFog.decrypt("XDeiC+NFVr1wNpkb5V9WqmE8uAvj\n", "FVnWbpETP9k=\n"))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 830238336:
                if (str.equals(f330)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 849576491:
                if (str.equals(StringFog.decrypt("aEKSEAjeT4RJapglDs1Uk0xfhQ==\n", "JSv8ZG25PeU=\n"))) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 879499863:
                if (str.equals(f321)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 888727913:
                if (str.equals(StringFog.decrypt("tLcgpeq7vOCVrQqayb2t9ZaMNw==\n", "+f5O0Y/czoE=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 892841421:
                if (str.equals(StringFog.decrypt("0NLWNUVSXYb7xc4=\n", "kqC5QjY3L9A=\n"))) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 897829864:
                if (str.equals(StringFog.decrypt("LFadF4iJNGMHUpk=\n", "bjfuct/sVjU=\n"))) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 923005467:
                if (str.equals(f361)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 963675317:
                if (str.equals(f349)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 985183301:
                if (str.equals(StringFog.decrypt("w20/OrwnqqrFZSB1vWCprcRpfHmlKbe3x2wzeLIhqbPPbHx2sD2h8OJjIXGGK6aIyWcl\n", "oAJSFNFOxN4=\n"))) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case 989671232:
                if (str.equals(StringFog.decrypt("D37oUScElyEuWedRKxWABSxzxUQwB7MpJ2A=\n", "QheGJUJj5UA=\n"))) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 1014009286:
                if (str.equals(StringFog.decrypt("sdvzdboWBSiQ8fFovBo0Hb3k9GSo\n", "/LKdAd9xd0k=\n"))) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 1027072306:
                if (str.equals(f351)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1031717908:
                if (str.equals(f307)) {
                    c = 'c';
                    break;
                }
                c = 65535;
                break;
            case 1074855404:
                if (str.equals(StringFog.decrypt("CqP1OrlRzs4rmvcvpVfewyKc8iur\n", "R8qbTtw2vK8=\n"))) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case 1079743836:
                if (str.equals(f311)) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case 1090486275:
                if (str.equals(f322)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 1134055712:
                if (str.equals(f306)) {
                    c = 'd';
                    break;
                }
                c = 65535;
                break;
            case 1138147458:
                if (str.equals(f328)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 1139753057:
                if (str.equals(StringFog.decrypt("TOE/kDLTFPNj5SKB\n", "DoBM9XShdZQ=\n"))) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1163838042:
                if (str.equals(f348)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1164173445:
                if (str.equals(StringFog.decrypt("ofFJGqpYcDyn+VZVqx9zO6b1ClmzVm0hpfBFWKRecyWt8ApDrl96PqPwQRqQWHAslP9KUZBUfB6r\n+1M=\n", "wp4kNMcxHkg=\n"))) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case 1194888483:
                if (str.equals(f345)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1253985693:
                if (str.equals(f338)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(StringFog.decrypt("kvlkfOQ1uKyv/nF12i+/sb75dWs=\n", "25cQGZZGzMU=\n"))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1306792763:
                if (str.equals(f356)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1331885131:
                if (str.equals(StringFog.decrypt("0sBW5n03YNj92170fS1+\n", "nq83ghRZB5k=\n"))) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 1355875652:
                if (str.equals(f324)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 1357502028:
                if (str.equals(StringFog.decrypt("WdSZ8Ww8k4l3y7jzYja8jg==\n", "Grv0nANS2fw=\n"))) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1448823153:
                if (str.equals(StringFog.decrypt("6+TmBynrqrnr5eEaLeO9tA==\n", "qoaVc1uKyc0=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1491724830:
                if (str.equals(f335)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(StringFog.decrypt("XLbjmRx6qapSvv6DHGaNvA==\n", "HteN93kI6M4=\n"))) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 1541095059:
                if (str.equals(f343)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1607057168:
                if (str.equals(StringFog.decrypt("tDNhulqWNeGDJmM=\n", "9UMR6D/1UIg=\n"))) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1658563378:
                if (str.equals(f305)) {
                    c = 'e';
                    break;
                }
                c = 65535;
                break;
            case 1659288939:
                if (str.equals(f339)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1704806948:
                if (str.equals(f323)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 1746536452:
                if (str.equals(f325)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 1792690910:
                if (str.equals(f357)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1884374718:
                if (str.equals(f355)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1991923194:
                if (str.equals(f331)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 2004707743:
                if (str.equals(f317)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case 2038381641:
                if (str.equals(f344)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2095560678:
                if (str.equals(f326)) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 2118015322:
                if (str.equals(f334)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return MTGConfiguration.class;
            case 1:
                return MIntegralSDKFactory.class;
            case 2:
                return MTGRewardVideoActivity.class;
            case 3:
                return VideoWebViewActivity.class;
            case 4:
                return AbstractActivity.class;
            case 5:
                return AbstractJSActivity.class;
            case 6:
                return MTGActivity.class;
            case 7:
                return MTGCommonActivity.class;
            case '\b':
                return MTGAuthorityActivity.class;
            case '\t':
                return Campaign.class;
            case '\n':
                return CampaignEx.class;
            case 11:
                return InterVideoOutListener.class;
            case '\f':
                return InterstitialVideoListener.class;
            case '\r':
                return RewardVideoListener.class;
            case 14:
                return MTGInterstitialActivity.class;
            case 15:
                return InterstitialListener.class;
            case 16:
            case 17:
                return MTGBannerView.class;
            case 18:
            case 19:
                return MTGBannerWebView.class;
            case 20:
                return MTGInterstitialHandler.class;
            case 21:
                return MTGInterstitialVideoHandler.class;
            case 22:
                return MTGRewardVideoHandler.class;
            case 23:
                return MTGBidInterstitialVideoHandler.class;
            case 24:
                return MTGBidRewardVideoHandler.class;
            case 25:
            case 26:
                return WallFragment.class;
            case 27:
                return NativeListener.class;
            case 28:
                return NativeListener.NativeTrackingListener.class;
            case 29:
                return NativeListener.NativeAdListener.class;
            case 30:
                return AppWallTrackingListener.class;
            case 31:
                return TabListFragment.class;
            case ' ':
                return ShuffleFragment.class;
            case '!':
                return MintegralAdActivity.class;
            case '\"':
                return BottomRefreshListView.class;
            case '#':
                return TabPageIndicator.class;
            case '$':
            case '%':
                return WallViewPager.class;
            case '&':
                return WallService.class;
            case '\'':
                return ImpressionCampaignExModel.class;
            case '(':
                return TabListView.class;
            case ')':
            case '*':
                return WallView.class;
            case '+':
                return CampaignUnit.class;
            case ',':
                return BaseFragment.class;
            case '-':
            case '.':
                return BrowserView.class;
            case '/':
                return WebViewFragment.class;
            case '0':
                return AppReceiver.class;
            case '1':
                return CommonJumpLoader.class;
            case '2':
            case '3':
                return MTGImageView.class;
            case '4':
                return MIntegralSDK.class;
            case '5':
                return MIntegralConstans.class;
            case '6':
                return RoverCampaignUnit.class;
            case '7':
                return MtgWallHandler.class;
            case '8':
                return MTGOfferWallHandler.class;
            case '9':
                return MtgBidCommonHandler.class;
            case ':':
                return LoadingActivity.class;
            case ';':
                return IDownloadListener.class;
            case '<':
                return interstitial.class;
            case '=':
                return BidManager.class;
            case '>':
                return BidResponsed.class;
            case '?':
            case '@':
                return BaseWebView.class;
            case 'A':
            case 'B':
                return WindVaneWebView.class;
            case 'C':
            case 'D':
                return MTGAlertDialog.class;
            case 'E':
            case 'F':
                return MintegralVideoView.class;
            case 'G':
            case 'H':
                return MintegralVastEndCardView.class;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return MintegralNativeEndCardView.class;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return MintegralClickCTAView.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return MintegralBaseView.class;
            case 'O':
            case 'P':
                return MintegralClickMiniCardView.class;
            case 'Q':
            case 'R':
                return MintegralContainerView.class;
            case 'S':
            case 'T':
                return MintegralH5EndCardView.class;
            case 'U':
            case 'V':
                return MintegralLandingPageView.class;
            case 'W':
            case 'X':
                return MintegralPlayableView.class;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return OnMTGMediaViewListener.class;
            case 'Z':
                return BannerAdListener.class;
            case '[':
                return com.mintegral.msdk.video.signal.activity.AbstractJSActivity.class;
            case '\\':
            case ']':
                return com.mintegral.msdk.mtgsignalcommon.base.BaseWebView.class;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case '_':
                return com.mintegral.msdk.mtgsignalcommon.windvane.WindVaneWebView.class;
            case '`':
            case 'a':
                return DomainMTGCommonActivity.class;
            case 'b':
            case 'c':
                return MBRewardVideoActivity.class;
            case 'd':
            case 'e':
                return BaseActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final String mo118() {
        C1050 c1050 = C0267.m139().f487;
        String decrypt = StringFog.decrypt("rDB7oTf/dj7mMXvrI/88SKww\n", "ghonxRyjWGI=\n");
        c1050.getClass();
        return C1050.m621((Object) null, MTGConfiguration.class, decrypt);
    }
}
