package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C4427z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0833 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2753 = StringFog.decrypt("koA3NtwD69megC0=\n", "9eVDd6xzv7Y=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2752 = StringFog.decrypt("HlKt+H/hC84SRan0bOUW6xM=\n", "dyH/nQiAeao=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2751 = StringFog.decrypt("Sp7O5d1bYRd4n/bax0thFlyJ\n", "Ofu6s7Q/BHg=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2750 = StringFog.decrypt("AqizfkDtkBkL\n", "Zc3HPySn43Y=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2749 = StringFog.decrypt("E8hAkwjQOsIV2V2kCdos\n", "dK000myTSKc=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2748 = StringFog.decrypt("+PHCzxDR4Onr\n", "n5S2jnSHgZo=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2747 = StringFog.decrypt("yt8mn2/s6N7I8zY=\n", "rbpS3gu2h7A=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2746 = StringFog.decrypt("Emo7o8a07hIU\n", "dQ9P4qL5i2Y=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2745 = StringFog.decrypt("HuQNMcjzASwc9Q==\n", "eYF5cKyycl8=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2744 = StringFog.decrypt("ICyNsgla+hMkJpeA\n", "R0n5820Yn3I=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2743 = StringFog.decrypt("vNCXvmoGtbG+wbaNYg==\n", "27Xj/w5HxsI=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2742 = StringFog.decrypt("s2hO9lommOO1RU7aUg==\n", "1A06tz5i+Zc=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2741 = StringFog.decrypt("S0gaIDwslxlNZx0=\n", "LC1uYVho9m0=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2740 = StringFog.decrypt("MMUJWaIzHNE29Q90\n", "V6B9GMZ3faU=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2739 = StringFog.decrypt("4eQLFKJvhaLn0gsnr0WDkO/kEzE=\n", "hoF/VcYr5NY=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2738 = StringFog.decrypt("75ES0xDCLvPaihPXC+Ye/eWQA9cKwgg=\n", "jON3smSnerE=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2737 = StringFog.decrypt("giyGlp9e0uaEJIGEj3za+oI=\n", "5Uny1/sOs5Q=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2736 = StringFog.decrypt("HSbtJzHsxTAbLuovMQ==\n", "ekOZZlW8pEI=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2735 = StringFog.decrypt("uSzmEeaH+Ua/JOEG67P9W4ws9jnwsvtAizv+\n", "3kmSUILXmDQ=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2734 = StringFog.decrypt("CRmy7VlBPdsPEbXpU3UfyBwYlMlZeC7MDQiT3lE=\n", "bnzGrD0RXKk=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2733 = StringFog.decrypt("M5HT7Qx7Ah81mdT6AU8GAheYzs8DWA==\n", "VPSnrGgrY20=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2732 = StringFog.decrypt("CTJuONhBjQoPOmk80nWvGRwzWRXVcocL\n", "blcaebwR7Hg=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2731 = StringFog.decrypt("02Y1/5YerZ/VbjLomyqpgvJqLdunPKCe+Goyyg==\n", "tANBvvJOzO0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2730 = StringFog.decrypt("/TuL+tkMg3j7M4z+0ziha+g6qsnREIt57g==\n", "ml7/u71c4go=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2729 = StringFog.decrypt("Im7NLFoACBMkZso=\n", "RQu5bT5QaWE=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2728 = StringFog.decrypt("QbJGA03F3WVlu1s2T9L7Zk+0WQFM09d/Qb8=\n", "JtcyVSShuAo=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2727 = StringFog.decrypt("QQ5rwAJoKWNlB3b1AH8PYE8IdMIZbS9nTwV42gJ/OA==\n", "JmsflmsMTAw=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2726 = StringFog.decrypt("MSTrGdid6Dw4KPA09JzxPj0V9yjYhf81\n", "VkGfWrfwmF0=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2725 = StringFog.decrypt("4R6oeUNFnv7vDbl5Xk2P6+gSs1RwRIw=\n", "hnvcOjEg/4o=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2724 = StringFog.decrypt("c8TBBX5CPHVx4scpcVo8bXHS\n", "FKG1TBAuVRs=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2723 = StringFog.decrypt("eh5GPsAKD/h5KF0d0xoe+m8eUxzIDx7K\n", "HXsyaKF5e7k=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2722 = StringFog.decrypt("qictmvM2WfaLKzWywjdI4w==\n", "zUJZ15ZSMJc=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2721 = StringFog.decrypt("Wme35Q7K565eUKbFFd7hpFhWps4O\n", "PQLDtnqrk8c=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2720 = StringFog.decrypt("g6TBPoG35HCHk9AemqPieoGCxwiUovlvgZXMHZA=\n", "5MG1bfXWkBk=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2719 = StringFog.decrypt("fnLYFtakhGB8Ze8zwaSAeW9y3w==\n", "GResQaTF9BA=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2718 = StringFog.decrypt("xdKWQyx/4EbHxbRVDUrRUvbWhUEMVw==\n", "orfiFF4ekDY=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2717 = StringFog.decrypt("qOupghqXQH6m+LiRCYBAZ7zNr6QJhkh8qsq8tQk=\n", "z47dwWjyIQo=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2716 = StringFog.decrypt("DM7c7RhUnfsC3c3+C0Od4hjuxtgDQ5PhBs7G2jxQjvw=\n", "a6uormox/I8=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2715 = StringFog.decrypt("QvU588M=\n", "Cox7mqfgzhI=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2714 = StringFog.decrypt("saBwSi4T6A==\n", "8MQzK017jc8=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2713 = StringFog.decrypt("hJ9GJCjuasScjU03C+ps\n", "0ewjVmyPHqU=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2712 = StringFog.decrypt("RxtzEHI/GRVhGE4DeS0NGXw=\n", "DnYDYhdManw=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2711 = StringFog.decrypt("+Wrrd3vGKIbKYftle8c=\n", "qw+aAh61XMs=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2710 = StringFog.decrypt("eCi/rR3MHWB6I4KkAdk=\n", "OUzswmi+fgU=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2709 = StringFog.decrypt("5eJ6MxohEE/C7ko5Gw==\n", "rZs4Wn5gdBw=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2708 = StringFog.decrypt("fAu/kaIkM21OOaOQhCYx\n", "KmrM5fZFVCw=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2707 = StringFog.decrypt("sdkxsMmfGA==\n", "8KxSxKDwdvA=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2706 = StringFog.decrypt("b8aiObfL63BI1Kk5ptzJREzEuDigwA==\n", "LafMV9K5uwI=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2705 = StringFog.decrypt("v9Jcic8YBsaAxU6FxS0H5A==\n", "8qA94KtZYpY=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2704 = StringFog.decrypt("h/9+C+FVKzu07WgR1FQJ\n", "0Z4Nf6Axe0k=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2703 = StringFog.decrypt("v2Q6NAuqKGiceDQkHb0=\n", "/RZVQ3jPWiU=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2702 = StringFog.decrypt("rJh8s9jSmmSBk02u1e+dcYigWg==\n", "5OE+2ryb9BA=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2701 = StringFog.decrypt("XkpU70h/lvlzQWXyRUKR7HpxZOlNUpvsZUdE409TkftzQQ==\n", "FjMWhiw2+I0=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2700 = StringFog.decrypt("smoBoAejOdOfYTC9Cp4+xpZRMaYCjjTGiWcQrA2OMtU=\n", "+hNDyWPqV6c=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2699 = StringFog.decrypt("3h1FcriorWT6Onh1raGecw==\n", "jlMMHMzN3xc=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2698 = StringFog.decrypt("UYtbYr1R8b1sjE5rn1Dgp32LW2K9ZuC3d5dOc6BQ\n", "GOUvB88ihdQ=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2697 = StringFog.decrypt("ci3GqSyVeIpPKtOgDpRpkF4txqksoG2ATyzAtQ==\n", "O0OyzF7mDOM=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2696 = StringFog.decrypt("bdCF8rZmFU5F0Jfvu1sSW0zylv6hShVORdA=\n", "IKLkm9Ivezo=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f2695 = StringFog.decrypt("qWAOsbSn9tyNcgmsiaDj1a9zGLaYp/bcjQ==\n", "/wF9xf3Jgrk=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f2694 = StringFog.decrypt("WZqN8L0xs09Wi5CoqGq9SEOa162pL/9IWYucrL4wuFVenpXwrCelSEGWjafjDKhjXpuwsLkho1JD\nlo23rCiQQkOWj7e5PQ==\n", "N//53s1E0SE=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f2693 = StringFog.decrypt("0Bj934Ha3Dn9E8zCjOfbLPQg3MKM5ds54Q==\n", "mGG/tuWTsk0=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f2692 = StringFog.decrypt("S78hTaFvjYJErjwVtDSDhVG/exC1ccGFS64wEaJuhphMuzlNsHmbhVOzIRr/V52NTL4cDaV/nZ9R\nsyEKsHauj1GzIwqlYw==\n", "JdpVY9Ea7+w=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f2691 = StringFog.decrypt("RobQONDBxvpuhsIl3fzB72e10iXd/sH6cg==\n", "C/SxUbSIqI4=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f2690 = StringFog.decrypt("hSajJCNVqV6KN758Ng6nWZ8m+Xk3S+VZhTeyeCBUokSCIrskMkO/WZ0qo3N9dqpDnwq5fjZSuESC\nN75rP2GoRII1vn4q\n", "60PXClMgyzA=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f2689 = StringFog.decrypt("A/pLX4GdQCwn6ExCvJpVJRT4TEK+mkAw\n", "VZs4K8jzNEk=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f2688 = StringFog.decrypt("5Sg=\n", "pEwliLO54BE=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f2687 = StringFog.decrypt("B3WZ1PAC\n", "RhHdtYRjuWE=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f2686 = StringFog.decrypt("2+ikIXI=\n", "mozhWQaqWw4=\n");

    /* renamed from: پ, reason: contains not printable characters */
    public static final String f2685 = StringFog.decrypt("nvIx2FzriMms8w==\n", "35ZjvS+b56c=\n");

    /* renamed from: ٽ, reason: contains not printable characters */
    public static final String f2684 = StringFog.decrypt("HYNaXDrjv1o1iUtwJvG5\n", "XOcsOUiX1ik=\n");

    /* renamed from: ث, reason: contains not printable characters */
    public static final String f2683 = StringFog.decrypt("w0AgBTouXxv/QyQNDztsPf9DIg==\n", "kSVNak5LHHQ=\n");

    /* renamed from: ת, reason: contains not printable characters */
    public static final String f2682 = StringFog.decrypt("ngXB0Wq25g==\n", "yESShR7XgcA=\n");

    /* renamed from: ק, reason: contains not printable characters */
    public static final String f2681 = StringFog.decrypt("Di9GUdxfOOI0\n", "Q30HGJgJUYc=\n");

    /* renamed from: פ, reason: contains not printable characters */
    public static final String f2680 = StringFog.decrypt("EIgCQE04ReI4qDB9YAVC9zE=\n", "XdpDCQlxK5Y=\n");

    /* renamed from: ս, reason: contains not printable characters */
    public static final String f2679 = StringFog.decrypt("q1o56lyzIoWIbQo=\n", "5gh4oxjxQ+s=\n");

    /* renamed from: ո, reason: contains not printable characters */
    public static final String f2678 = StringFog.decrypt("NwODvOPH7WkCAqGK49fndRcTvLw=\n", "dmfTzoa0iAc=\n");

    /* renamed from: յ, reason: contains not printable characters */
    public static final String f2677 = StringFog.decrypt("wi1fFsw6ZwXgGVsG3TthGQ==\n", "kl86ZalUE2A=\n");

    /* renamed from: Ն, reason: contains not printable characters */
    public static final String f2676 = StringFog.decrypt("5UhFS3P6QB3MQ2NHc+lB\n", "rTEHIheoJWo=\n");

    /* renamed from: Ԇ, reason: contains not printable characters */
    public static final String f2675 = StringFog.decrypt("i0/7K6lxKpWiRN0nqWE9jaJS2iO+Vx2HoFPQNKhR\n", "wza5Qs0jT+I=\n");

    /* renamed from: Ӵ, reason: contains not printable characters */
    public static final String f2674 = StringFog.decrypt("N5UphzWibkkeng+LNbJ5UR6ICI8ihFhbEYgOnA==\n", "f+xr7lHwCz4=\n");

    /* renamed from: ӟ, reason: contains not printable characters */
    public static final String f2673 = StringFog.decrypt("49WLB62Ip+ThwpkVuoK25cP0mQWwnqP03sI=\n", "sbD8Zt/swoA=\n");

    /* renamed from: Ҭ, reason: contains not printable characters */
    public static final String f2672 = StringFog.decrypt("AtUQFnZk+pcAwgIEYW7rliL2BhRwb+2K\n", "ULBndwQAn/M=\n");

    /* renamed from: Ғ, reason: contains not printable characters */
    public static final String f2671 = StringFog.decrypt("LTDjsPLdBeYJNfWg8MoX9B4/5KHS\n", "e1GQxKC4coc=\n");

    /* renamed from: ѵ, reason: contains not printable characters */
    public static final String f2670 = StringFog.decrypt("e5MPw+RDOyN0ghKb8Rg1JGGTVZ7wXXc/cIEan/BTPWN0lQ+E4l8tNDu+Aq/9UgsoYpcJifFSGC5h\nnw2E4E8=\n", "FfZ77ZQ2WU0=\n");

    /* renamed from: п, reason: contains not printable characters */
    public static final String f2669 = StringFog.decrypt("mqxBjIH+8fCzp2eAge3387ujapGc\n", "0tUD5eWslIc=\n");

    /* renamed from: н, reason: contains not printable characters */
    public static final String f2668 = StringFog.decrypt("6ZDOJQ5gN+DmgdN9Gzs55/OQlHgafnv84oLbeRpwMaDmls5iCHwh96mj23gKRzD55ofebhpUNvru\ng9N/Bw==\n", "h/W6C34VVY4=\n");

    /* renamed from: У, reason: contains not printable characters */
    public static final String f2667 = StringFog.decrypt("TrqN6KgoRwtqv5v4uy5EA26yiuU=\n", "GNv+nPpNMGo=\n");

    /* renamed from: С, reason: contains not printable characters */
    public static final String f2666 = StringFog.decrypt("NlJtAcAhXyI=\n", "ZhwsZZZIOlU=\n");

    /* renamed from: Ϲ, reason: contains not printable characters */
    public static final String f2665 = StringFog.decrypt("OQFLsKR4q7oYHX4=\n", "cXgJ2cA5z+w=\n");

    /* renamed from: ϵ, reason: contains not printable characters */
    public static final String f2664 = StringFog.decrypt("c2c1U2EsgbBVewV7YTiJu0w=\n", "Ox53OgVu4N4=\n");

    /* renamed from: ϯ, reason: contains not printable characters */
    public static final String f2663 = StringFog.decrypt("q73X/qXC0auHoef1ru/GrqKgw/6k+Q==\n", "48SVl8GOtMo=\n");

    /* renamed from: Ϯ, reason: contains not printable characters */
    public static final String f2662 = StringFog.decrypt("wwRZJiazeHjoCVorFJdPag==\n", "i30bT0L+Kh0=\n");

    /* renamed from: ϝ, reason: contains not printable characters */
    public static final String f2661 = StringFog.decrypt("Z/0WIGgmvQtD1jkEaAu0CmHaMgc=\n", "N7NXcCFl0mU=\n");

    /* renamed from: ϙ, reason: contains not printable characters */
    public static final String f2660 = StringFog.decrypt("TNF1FofeFAdd+2EejMc=\n", "HJ83d+mwcXU=\n");

    /* renamed from: Λ, reason: contains not printable characters */
    public static final String f2659 = StringFog.decrypt("Z1w4flsITMVTRBxJSQ==\n", "NxJ1LD5rOIQ=\n");

    /* renamed from: Κ, reason: contains not printable characters */
    public static final String f2658 = StringFog.decrypt("eKwXycYZp49f\n", "KOJArKRPzuo=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2657 = StringFog.decrypt("GOblb7WFVw==\n", "To+BCtrEM8E=\n");

    /* renamed from: ʜ, reason: contains not printable characters */
    public static final String f2656 = StringFog.decrypt("J+Qpa0G0rGAY/jlrQJC6\n", "cY1NDi71yCw=\n");

    /* renamed from: Ȳ, reason: contains not printable characters */
    public static final String f2655 = StringFog.decrypt("+QfhhapCq9HGC/I=\n", "r26F4MUDz4c=\n");

    /* renamed from: ȝ, reason: contains not printable characters */
    public static final String f2654 = StringFog.decrypt("8DqH6MX4cqfDKIfz5w==\n", "plv0nJWKHcQ=\n");

    /* renamed from: ƈ, reason: contains not printable characters */
    public static final String f2653 = StringFog.decrypt("0/R+0FaKCjnl9w==\n", "g5gfqTP4Q1c=\n");

    /* renamed from: Ɔ, reason: contains not printable characters */
    public static final String f2652 = StringFog.decrypt("eDKPgJzzWzdVOb6dkc5cIlwKqaWRyUEmXi6/\n", "MEvN6fi6NUM=\n");

    /* renamed from: Ť, reason: contains not printable characters */
    public static final String f2651 = StringFog.decrypt("Q+vKtWUFImlq4Oy5ZRYjUmLh/LlvMjU=\n", "C5KI3AFXRx4=\n");

    /* renamed from: ţ, reason: contains not printable characters */
    public static final String f2650 = StringFog.decrypt("Y0AbJp2Ld+pCXC4DkLln2UVcKw==\n", "KzlZT/nKE7w=\n");

    /* renamed from: ō, reason: contains not printable characters */
    public static final String f2649 = StringFog.decrypt("8Wmpod65cazBZ5a7zrlwiNc=\n", "pSv/yLrcHu0=\n");

    /* renamed from: Ł, reason: contains not printable characters */
    public static final String f2648 = StringFog.decrypt("KuH4AvUYWmI=\n", "a4WoY4d5NxE=\n");

    /* renamed from: Ĵ, reason: contains not printable characters */
    public static final String f2647 = StringFog.decrypt("08BvhAcp4Ff3xmafITTYQvbd\n", "hakK80RGjiM=\n");

    /* renamed from: ﾓ, reason: contains not printable characters */
    public static final String f2772 = StringFog.decrypt("apR2QylQbMdTk2ZUKX1k4U4=\n", "PP0SJkYRCIQ=\n");

    /* renamed from: ﾊ, reason: contains not printable characters */
    public static final String f2771 = StringFog.decrypt("CPsRJE4FU309+QY=\n", "XpJ1QSFGPxQ=\n");

    /* renamed from: ﾁ, reason: contains not printable characters */
    public static final String f2770 = StringFog.decrypt("/V0GxUf8DIvRRAjO\n", "vjFvpiyoZPk=\n");

    /* renamed from: ｽ, reason: contains not printable characters */
    public static final String f2769 = StringFog.decrypt("bvKFNmJltNpO9YU7bg==\n", "LZ7sVQkxxrs=\n");

    /* renamed from: ｹ, reason: contains not printable characters */
    public static final String f2768 = StringFog.decrypt("qery7+Yl2kyE\n", "6oWfn4dLsyM=\n");

    /* renamed from: ｸ, reason: contains not printable characters */
    public static final String f2767 = StringFog.decrypt("+XQF0Nc1DlbUWgzT\n", "uhtooLZbZzk=\n");

    /* renamed from: ｷ, reason: contains not printable characters */
    public static final String f2766 = StringFog.decrypt("hZ5tGv0M03GosmwD/wnudrSedQ30\n", "xvEAapxiuh4=\n");

    /* renamed from: ｳ, reason: contains not printable characters */
    public static final String f2765 = StringFog.decrypt("0WzCwaCTaKL8QMPYopZVv/NgxNivmg==\n", "kgOvscH9Ac0=\n");

    /* renamed from: ｦ, reason: contains not printable characters */
    public static final String f2764 = StringFog.decrypt("Fb+6hrvIYgI=\n", "Vs3f58+hFGc=\n");

    /* renamed from: ｓ, reason: contains not printable characters */
    public static final String f2763 = StringFog.decrypt("+QiQ1z6Eds/J\n", "unr1tkrtAKo=\n");

    /* renamed from: ｒ, reason: contains not printable characters */
    public static final String f2762 = StringFog.decrypt("H6aEBGOr\n", "VsjIbQ3OG+s=\n");

    /* renamed from: ｎ, reason: contains not printable characters */
    public static final String f2761 = StringFog.decrypt("DNAGwpWBYwcvwxbT\n", "WrF1ttTlMGg=\n");

    /* renamed from: ｌ, reason: contains not printable characters */
    public static final String f2760 = StringFog.decrypt("zoGA9GPIKL/m\n", "g+TknQKOQdM=\n");

    /* renamed from: Ｉ, reason: contains not printable characters */
    public static final String f2759 = StringFog.decrypt("0R1eFce/ZY35Cw==\n", "nHg6fKb5DOE=\n");

    /* renamed from: Ｆ, reason: contains not printable characters */
    public static final String f2758 = StringFog.decrypt("dAygjF8KoLdUF7SKVQw=\n", "J3jB+DZp8tI=\n");

    /* renamed from: ﻢ, reason: contains not printable characters */
    public static final String f2757 = StringFog.decrypt("Zv9Ssg==\n", "MJ4hxpCJi30=\n");

    /* renamed from: ﻌ, reason: contains not printable characters */
    public static final String f2756 = StringFog.decrypt("Pgr2222q0w==\n", "aXiXqx3PoSk=\n");

    /* renamed from: ﻋ, reason: contains not printable characters */
    public static final String f2755 = StringFog.decrypt("Cel/egMQIZc4/X5n\n", "X6gsLkJ0dfY=\n");

    /* renamed from: ﺧ, reason: contains not printable characters */
    public static final String f2754 = StringFog.decrypt("pg99sTURsl21HGqxLAs=\n", "5X0Y0EF4xDg=\n");

    public C0833(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return HyBid.getHyBidVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2753, new C0207(this));
        hashMap.put(f2752, new C1039(this));
        hashMap.put(f2751, new C0907(this));
        hashMap.put(f2750, new C0906(this));
        hashMap.put(f2749, new C0877(this));
        hashMap.put(f2748, new C0871(this));
        hashMap.put(f2747, new C0862(this));
        hashMap.put(f2746, new C0840(this));
        hashMap.put(f2745, new C0839(this));
        hashMap.put(f2744, new C0251(this));
        hashMap.put(f2743, new C0250(this));
        hashMap.put(f2742, new C0242(this));
        hashMap.put(f2741, new C0241(this));
        hashMap.put(f2740, new C0236(this));
        hashMap.put(f2739, new C0227(this));
        hashMap.put(f2738, new C0224(this));
        hashMap.put(f2737, new C0222(this));
        hashMap.put(f2736, new C0218(this));
        hashMap.put(f2735, new C0216(this));
        hashMap.put(f2734, new C0205(this));
        hashMap.put(f2733, new C1132(this));
        hashMap.put(f2732, new C1109(this));
        hashMap.put(f2731, new C1100(this));
        hashMap.put(f2730, new C1089(this));
        hashMap.put(f2729, new C1083(this));
        hashMap.put(f2728, new C1070(this));
        hashMap.put(f2727, new C1066(this));
        hashMap.put(f2726, new C1044(this));
        hashMap.put(f2725, new C1043(this));
        hashMap.put(f2724, new C1035(this));
        hashMap.put(f2723, new C1029(this));
        hashMap.put(f2722, new C1025(this));
        hashMap.put(f2721, new C1019(this));
        hashMap.put(f2720, new C1015(this));
        hashMap.put(f2719, new C0992(this));
        hashMap.put(f2718, new C0990(this));
        hashMap.put(f2717, new C0989(this));
        hashMap.put(f2716, new C0977(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(f2655)) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case -2101083431:
                if (str.equals(f2762)) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -2095699225:
                if (str.equals(f2689)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -2049897434:
                if (str.equals(f2771)) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case -2030915791:
                if (str.equals(f2668)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -2022878658:
                if (str.equals(f2711)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1973009238:
                if (str.equals(f2761)) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -1867123455:
                if (str.equals(f2670)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1758764491:
                if (str.equals(f2754)) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case -1741983831:
                if (str.equals(f2648)) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -1692490108:
                if (str.equals(f2763)) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -1668741680:
                if (str.equals(f2695)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1474059205:
                if (str.equals(f2658)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1454339106:
                if (str.equals(f2700)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1305745411:
                if (str.equals(f2676)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1042733280:
                if (str.equals(f2710)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1040143378:
                if (str.equals(f2705)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1034806157:
                if (str.equals(f2756)) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case -1007287447:
                if (str.equals(f2669)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -917597044:
                if (str.equals(f2692)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -889171374:
                if (str.equals(f2691)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -844922724:
                if (str.equals(f2681)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -801627293:
                if (str.equals(f2679)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -747024196:
                if (str.equals(f2674)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -729230458:
                if (str.equals(f2654)) {
                    c = C4427z5.U;
                    break;
                }
                c = 65535;
                break;
            case -709708726:
                if (str.equals(f2709)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -617879491:
                if (str.equals(f2770)) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -594285390:
                if (str.equals(f2656)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -589715152:
                if (str.equals(f2661)) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -587420703:
                if (str.equals(f2755)) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -567645543:
                if (str.equals(f2663)) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f2685)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -514201671:
                if (str.equals(f2704)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -385055469:
                if (str.equals(f2759)) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case -348198615:
                if (str.equals(f2766)) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case -242952691:
                if (str.equals(f2699)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -232966702:
                if (str.equals(f2684)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -217201711:
                if (str.equals(f2651)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -205981873:
                if (str.equals(f2653)) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f2760)) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -133293208:
                if (str.equals(f2650)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -114588646:
                if (str.equals(f2772)) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f2688)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 2658924:
                if (str.equals(f2757)) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case 22955995:
                if (str.equals(f2659)) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 63078110:
                if (str.equals(f2686)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 70165004:
                if (str.equals(f2715)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 152629510:
                if (str.equals(f2666)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 254077974:
                if (str.equals(f2678)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 271735736:
                if (str.equals(f2713)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 282218207:
                if (str.equals(f2698)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 287435653:
                if (str.equals(f2703)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 353872196:
                if (str.equals(f2712)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 378666444:
                if (str.equals(f2708)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 424904237:
                if (str.equals(f2647)) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 441957133:
                if (str.equals(f2662)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 476474561:
                if (str.equals(f2694)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 482776408:
                if (str.equals(f2701)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 485976319:
                if (str.equals(f2714)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 504900231:
                if (str.equals(f2693)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 591135468:
                if (str.equals(f2768)) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 606183598:
                if (str.equals(f2697)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 676623548:
                if (str.equals(f2758)) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case 767767497:
                if (str.equals(f2667)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 789926062:
                if (str.equals(f2706)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 862687632:
                if (str.equals(f2672)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 956069326:
                if (str.equals(f2682)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1002796579:
                if (str.equals(f2707)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1044987291:
                if (str.equals(f2702)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1150879268:
                if (str.equals(f2767)) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 1164559907:
                if (str.equals(f2680)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1199380782:
                if (str.equals(f2671)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1228519789:
                if (str.equals(f2690)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1241891335:
                if (str.equals(f2683)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1250739860:
                if (str.equals(f2665)) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1296210799:
                if (str.equals(f2652)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 1373883333:
                if (str.equals(f2696)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1402445010:
                if (str.equals(f2660)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1506578400:
                if (str.equals(f2664)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1521679714:
                if (str.equals(f2677)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1607572150:
                if (str.equals(f2675)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1877773523:
                if (str.equals(f2765)) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 1885066191:
                if (str.equals(f2764)) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case 1955369613:
                if (str.equals(f2687)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1969459009:
                if (str.equals(f2673)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 2079062148:
                if (str.equals(f2649)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 2107600959:
                if (str.equals(f2769)) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f2657)) {
                    c = ':';
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
                return HyBid.class;
            case 1:
                return AdCache.class;
            case 2:
                return UserDataManager.class;
            case 3:
                return ImpressionManager.class;
            case 4:
                return RequestManager.class;
            case 5:
                return AdSourceConfig.class;
            case 6:
                return HyBidAdSource.class;
            case 7:
                return VastTagAdSource.class;
            case '\b':
                return Auction.class;
            case '\t':
                return BannerPresenterFactory.class;
            case '\n':
                return MraidAdPresenter.class;
            case 11:
                return VastAdPresenter.class;
            case '\f':
                return BrowserManager.class;
            case '\r':
                return HyBidInterstitialAd.class;
            case 14:
                return HyBidInterstitialBroadcastReceiver.class;
            case 15:
                return HyBidInterstitialBroadcastSender.class;
            case 16:
                return PNInterstitialAd.class;
            case 17:
                return InterstitialPresenterDecorator.class;
            case 18:
                return InterstitialPresenterFactory.class;
            case 19:
                return MraidInterstitialPresenter.class;
            case 20:
                return VastInterstitialPresenter.class;
            case 21:
            case 22:
                return HyBidInterstitialActivity.class;
            case 23:
            case 24:
                return MraidInterstitialActivity.class;
            case 25:
            case 26:
                return VastInterstitialActivity.class;
            case 27:
                return Ad.class;
            case 28:
                return AdData.class;
            case 29:
                return AdExt.class;
            case 30:
                return AdResponse.class;
            case 31:
                return AdvertisingInfo.class;
            case ' ':
                return RemoteConfigAppInfo.class;
            case '!':
                return VASTtag.class;
            case '\"':
                return MRAIDView.class;
            case '#':
                return MRAIDInterstitial.class;
            case '$':
                return MRAIDBanner.class;
            case '%':
                return AdPresenterDecorator.class;
            case '&':
                return PresenterFactory.class;
            case '\'':
                return HyBidRewardedAd.class;
            case '(':
                return HyBidRewardedBroadcastReceiver.class;
            case ')':
                return HyBidRewardedBroadcastSender.class;
            case '*':
                return RewardedPresenterDecorator.class;
            case '+':
                return RewardedPresenterFactory.class;
            case ',':
                return VastRewardedPresenter.class;
            case '-':
            case '.':
                return HyBidRewardedActivity.class;
            case '/':
            case '0':
                return VastRewardedActivity.class;
            case '1':
                return PNAdView.class;
            case '2':
                return HyBidAdView.class;
            case '3':
                return HyBidBannerAdView.class;
            case '4':
                return HyBidLeaderboardAdView.class;
            case '5':
                return HyBidMRectAdView.class;
            case '6':
                return PNAPIContentInfoView.class;
            case '7':
                return PNBannerAdView.class;
            case '8':
                return PNMRectAdView.class;
            case '9':
                return PNWebView.class;
            case ':':
                return VideoAd.class;
            case ';':
                return VideoAdListener.class;
            case '<':
                return VideoAdView.class;
            case '=':
                return VastProcessor.class;
            case '>':
                return PlayerInfo.class;
            case '?':
                return HyBidInterstitialAd.Listener.class;
            case '@':
                return HyBidRewardedAd.Listener.class;
            case 'A':
                return HyBidAdView.Listener.class;
            case 'B':
                return C0835.class;
            case 'C':
                return AdParams.class;
            case 'D':
                return ViewControllerVast.class;
            case 'E':
                return VideoAdController.class;
            case 'F':
                return VideoClicks.class;
            case 'G':
                return ClickThrough.class;
            case 'H':
                return ClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return Companion.class;
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                return CompanionAds.class;
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                return CompanionClickThrough.class;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return CompanionClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return Creative.class;
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return Creatives.class;
            case 'O':
                return InLine.class;
            case 'P':
                return VastAdSource.class;
            case 'Q':
                return MediaFile.class;
            case 'R':
                return MediaFiles.class;
            case 'S':
                return StaticResource.class;
            case 'T':
                return Vast.class;
            case 'U':
                return Wrapper.class;
            case 'V':
                return VASTAdTagURI.class;
            case 'W':
                return CreativeParams.class;
            default:
                return null;
        }
    }
}
