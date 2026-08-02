package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.C4427z5;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.activity.DomainMBCommonActivity;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.config.activity.BaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.WebViewFragment;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newout.IMBRRewardVideoHandler;
import com.mbridge.msdk.newout.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.IDownloadListener;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBInterstitialHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeH5EndCardView;
import com.mbridge.msdk.video.module.MBridgeLandingPageView;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.MBridgePlayableView;
import com.mbridge.msdk.video.module.MBridgeVastEndCardView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.widget.MBImageView;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵑ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0847 extends AbstractC0838 {

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f2799;

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2800;

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f2801;

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f2802;

    /* renamed from: น, reason: contains not printable characters */
    public static final String f2803;

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f2804;

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f2805;

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f2806;

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f2807;

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f2808;

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2856 = StringFog.decrypt("FzCCsraoLWICMJOZjb4S\n", "cFX299jMfgE=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2855 = StringFog.decrypt("Jryn2H3CTRcovr3OcsZJPyU=\n", "QdnTmxyvPXY=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2854 = StringFog.decrypt("TYDqtRJO3rtHgPCRN0s=\n", "KuWe5X4vvd4=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2853 = StringFog.decrypt("ALf8cXEoL9sVh/pf\n", "Z9KIMxBGQb4=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2852 = StringFog.decrypt("LLkknWVmT0o=\n", "S9xQ3AE8Jjo=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2851 = StringFog.decrypt("MalD1eG1waYDvlvG5rLLrTM=\n", "Vsw3g4jRpMk=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2850 = StringFog.decrypt("ZzcDTMSt52VpJBJG0g==\n", "AFJ3D7bIhhE=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2849 = StringFog.decrypt("CLMeFTk0JY0D\n", "b9ZqVF18UeA=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2848 = StringFog.decrypt("xQa5reYUrBTQK7mC6w==\n", "omPN74d6wnE=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2847 = StringFog.decrypt("RTR8+P5IqVJXI2vN\n", "IlEIqJUv+j0=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2846 = StringFog.decrypt("KSO1wZfOxnM8Kg==\n", "TkbBieOjqiY=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2845 = StringFog.decrypt("WezuabTQdYRh3Mxys9ly\n", "FK6tBtq2HOM=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2844 = StringFog.decrypt("yuWZrSPnnz/Rzq+tO8eOL+7Rorwt\n", "h6fLyFSG7Vs=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2843 = StringFog.decrypt("TtGvU8/10ZJ36g==\n", "A5PuMLucp/s=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2842 = StringFog.decrypt("kbEj1TYV6k6dkBTTLRHxWQ==\n", "3PNgult4hSA=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2841 = StringFog.decrypt("VaxDaFzccItsh35vSdVDm2yHfG9cwA==\n", "GO4KBii5Avg=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2840 = StringFog.decrypt("2L50UBVDOpLhlUlXAEoAgPuYUVsT\n", "lfw9PmEmSOE=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2839 = StringFog.decrypt("CMz4WaJsxJox58Vet2XggCHr3n+3Z9KFIPw=\n", "RY6xN9YJtuk=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2838 = StringFog.decrypt("78r3WihmXuvGyNlsKH53+Mz63G0/\n", "op6wCE0RP5k=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2837 = StringFog.decrypt("8RZAqvsXd/fqPWe8\n", "vFQCy5V5EoU=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2836 = StringFog.decrypt("7F2B/LOS6RrrVYn8s4P/GKFdmabwvdkx7lyCt6ym8hb4\n", "jzLs0t7wm3M=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2835 = StringFog.decrypt("qJDVr5xo8Yj0ivKPq2/6mg==\n", "ht2X7f0Gn+0=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2834 = StringFog.decrypt("O8w5yfRKbAM8xDHJ9Ft6AXbONoX4RnAPKo0ijvxfMCca4TWJ901sPT3BAo78Xw==\n", "WKNU55koHmo=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2833 = StringFog.decrypt("cSe6Xu+ekBV3L6UR7tmTEnYj+RLjhJtPZS21BuuSiU9QOrgH8ZKMN3stoA==\n", "EkjXcIL3/mE=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2832 = StringFog.decrypt("zwSzLb6m8DDrI40=\n", "gkb6QN/BlWY=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2831 = StringFog.decrypt("AGVkZROjUmEHbWxlE7JEY019YC8ZpFQmLkhAJh+mRV4Kb34=\n", "YwoJS37BIAg=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2830 = StringFog.decrypt("HGvOK0sG+m8bY8YrSxfsbVFpwXZPA+ZnE2fMaEsL5igdZdBgCCbpdRpTxmdwDe1x\n", "fwSjBSZkiAY=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2829 = StringFog.decrypt("SLj/Oh6b/ftPsPc6Horr+QW68GcanuHzR7T9eR6W4bxcvvxwBZjh9wWA+3oXr+78ToD3diWQ6uU=\n", "K9eSFHP5j5I=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2828 = StringFog.decrypt("jlgfr5Gk/6uJUBevkbXpqcNBG+WZqaOvglMH7ZnowICfXhbmmZDkpohYJOiZsQ==\n", "7TdygfzGjcI=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2827 = StringFog.decrypt("7JpgVlJh5GfrkmhWUnDyZaGDZBxabLhj4JF4FFot20z9nGkfWlX3ffuwYxx8YuRq2ZxoDw==\n", "j/UNeD8Dlg4=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2826 = StringFog.decrypt("idmF7P3oil2O0Y3s/fmcX8TAgab15dZZhdKdrvWktXaY34yl9cSZQIPAjYf+7rtVmNK+q/X9\n", "6rbowpCK+DQ=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2825 = StringFog.decrypt("cLL2+36xobw5tf7zfrGwqjv/7/80uazgPb794zy57YMSo/DyN7mAojmy8tUEnZWnNaY=\n", "UNGZllDcw84=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2824 = StringFog.decrypt("xkCmEs6ANqHBSK4SzpEgo4tZoljGjWqlyku+UMbMCYrXRq9bxqAlu8B5olnU\n", "pS/LPKPiRMg=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2823 = StringFog.decrypt("5WKyByPCAjDiaroHI9MUMqh7tk0rz1406WmqRSuOPRv0ZLtOK+McMOVmkkAgyTM49GmJQCvX\n", "hg3fKU6gcFk=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2822 = StringFog.decrypt("3FuMDcJ0n7jbU4QNwmWJupFCiEfKecO80FCUT8o4oJPNXYVEylWCv8tViE3KZLu42kM=\n", "vzThI68W7dE=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2821 = StringFog.decrypt("wV17nejOjy/GVXOd6N+ZLYxEf9fgw9MrzVZj3+CCsATQW3LU4OTIA8xWVdL3yKsvx0U=\n", "ojIWs4Ws/UY=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2820 = StringFog.decrypt("l8lInvDrUPqQwUCe8PpG+NrQTNT45gz+m8JQ3Pinb9GGz0HX+MVD/ZDPS9fN6EX2os9Axw==\n", "9KYlsJ2JIpM=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2819 = StringFog.decrypt("8xEH+qVHJMf0GQ/6pVYyxb4IA7CtSnjD/xofuK0LG+ziFw6zrXU6z+kfCLitcz/L\n", "kH5q1MglVq4=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2818 = StringFog.decrypt("ZHXZfo/PRcJKTf1ZteZI2F9++lmw\n", "KxuUPMKqIas=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2817 = StringFog.decrypt("oKGkvgf/9iqnoaSyAf/6K5Cnv7Ya6A==\n", "5M7J326Ru0g=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2816 = StringFog.decrypt("BTRGujHaIgoCPE66Mcs0CEg6SOA1zjkXH3Vv+zHZOQ0rGWj7MdU/DSc4X/0q0SQa\n", "ZlsrlFy4UGM=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2815 = StringFog.decrypt("Eai45TJ0kFcRqJzEEWWcXhOjuOEU\n", "ds3MqHAG+TM=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2814 = StringFog.decrypt("i/IaVoK9x8eL8jt1qbvnxw==\n", "7JduG8DPrqM=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2813 = StringFog.decrypt("rHwXWRFtIOaGYChMCmkm55NmIEs=\n", "xQ9FPGYMUoI=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2812 = StringFog.decrypt("2MqOtg6M3LXb4ZuJDg==\n", "v6/65Gv7vcc=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2811 = StringFog.decrypt("n3y9ohy7lO2cWKSfDKKB\n", "+BnJ8HnM9Z8=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2810 = StringFog.decrypt("j+5say+xpoqm3w==\n", "wqweAkvWw8M=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2809 = StringFog.decrypt("DwQMS9/lsBw7Dg==\n", "XWF7Kq2B+XI=\n");

    static {
        StringFog.decrypt("JojljXm/cH8Pisu7eadZbAW4zrpu\n", "a9yi3xzIEQ0=\n");
        f2808 = StringFog.decrypt("8E/34ld9XBPcf9HdWktcC/Vs2+9fSks=\n", "vQ21izMvOWQ=\n");
        f2807 = StringFog.decrypt("5YpbbhWHh4jeo09VI4efoc2pfVAikA==\n", "rMcZPEfi8Ok=\n");
        f2806 = StringFog.decrypt("w5MMzVn/v7zpoBL7WeeSp/6CHvFZ+g==\n", "jfZ7nzyI3s4=\n");
        f2805 = StringFog.decrypt("0SZUeJTD28/+MUdjv/Xb194gV1yg+MrB\n", "n0MjNdaRvrg=\n");
        f2804 = StringFog.decrypt("gTx/ipl7ZR6GNHeKmWpzHMwwfcqScHBZgzBmzYJwYw7MHXfTuVtFEpUyYMCicHMSjRJx0J1vfgOb\n", "4lMSpPQZF3c=\n");
        f2803 = StringFog.decrypt("UkYDzLmVzU1/Vx34sZLR\n", "HCN0jtjmqAw=\n");
        f2802 = StringFog.decrypt("wb68qcV17knGtrSpxWT4S4yyvunOfvsOw7Kl7t5+6FmMn7Tw6nbvReOype7efuhZ\n", "otHRh6gXnCA=\n");
        f2801 = StringFog.decrypt("ZQpMU5H9LytNMQ==\n", "KEMBHvCTTkw=\n");
        f2800 = StringFog.decrypt("3ilmDhyy\n", "mEgVelfklro=\n");
        f2799 = StringFog.decrypt("4+mj6YI5Dw==\n", "sIjOjM99Os0=\n");
    }

    public C0847(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("tueqy0BdzXO28L/qenfy\n", "0YLehikzuRY=\n"), new C1045(this));
        hashMap.put(StringFog.decrypt("GqRi6CmgIC4apFjZJaY=\n", "fcEWuEjDS08=\n"), new C0941(this));
        hashMap.put(StringFog.decrypt("KPpCvlnDpmca7Vo=\n", "T582/TWqxQw=\n"), new C0940(this));
        hashMap.put(StringFog.decrypt("bStmi3IUm5ZzPnc=\n", "Ck4Sxxt68MI=\n"), new C0939(this));
        hashMap.put(StringFog.decrypt("lBzuAlJAe2umC/Y=\n", "83maSz8hHA4=\n"), new C0938(this));
        hashMap.put(StringFog.decrypt("189R+tmU+O7Cxg==\n", "sKols7r7lrs=\n"), new C0921(this));
        hashMap.put(StringFog.decrypt("Azn/uORVFQ==\n", "ZFyL+YAccWU=\n"), new C0920(this));
        hashMap.put(StringFog.decrypt("rg5mTiDrww6vPXtpNsTJJ7QYZmkv4N8=\n", "3WsSDEGFrWs=\n"), new C0876(this));
        hashMap.put(StringFog.decrypt("O//piB/R8h85\n", "XJqdyXuFi28=\n"), new C0869(this));
        hashMap.put(f2856, new C0208(this));
        hashMap.put(f2855, new C0206(this));
        hashMap.put(f2854, new C0204(this));
        hashMap.put(f2853, new C1158(this));
        hashMap.put(f2852, new C1141(this));
        hashMap.put(f2851, new C1111(this));
        hashMap.put(f2850, new C1108(this));
        hashMap.put(f2849, new C1090(this));
        hashMap.put(f2848, new C1076(this));
        hashMap.put(f2847, new C1054(this));
        hashMap.put(f2846, new C1040(this));
        hashMap.put(f2815, new C1016(this));
        hashMap.put(f2814, new C1012(this));
        hashMap.put(f2813, new C1009(this));
        hashMap.put(f2812, new C0967(this));
        hashMap.put(f2811, new C0965(this));
        hashMap.put(StringFog.decrypt("rNYW41a3NKyu5QvJUqwJqKrQCcRZpA6uudoMyg==\n", "y7NirTfDXdo=\n"), new C0954(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(StringFog.decrypt("jpzOo6V0UzyMlMm+tn93Kg==\n", "wP26ytMRElg=\n"))) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1980005015:
                if (str.equals(StringFog.decrypt("dLlQY+4iTHZRvVVY4ilP\n", "I9wyNYdHOzA=\n"))) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1945308362:
                if (str.equals(f2826)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1940754118:
                if (str.equals(StringFog.decrypt("XPBu1m6z9wZXwVzBaLviG2nr\n", "HZIdohzSlHI=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1874906197:
                if (str.equals(StringFog.decrypt("RO+jz+BuRZNl0KzI8UxZlkrnv9/TYFKF\n", "CYbNu4UJN/I=\n"))) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1850171958:
                if (str.equals(f2835)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1766796574:
                if (str.equals(StringFog.decrypt("DJLg6RuDanEjkP/pA4FyajGH8e4IlA==\n", "QvOUgG3mPgM=\n"))) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1728440643:
                if (str.equals(f2828)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1702626105:
                if (str.equals(StringFog.decrypt("pTA9OmiyJ9SEDzoqaLoD3I0u\n", "6FlTTg3VVbU=\n"))) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1679044855:
                if (str.equals(f2818)) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case -1656370481:
                if (str.equals(StringFog.decrypt("dwGNmt++kL93DYGo4LqJ\n", "IGjj/onf/to=\n"))) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -1358506046:
                if (str.equals(f2836)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1355055839:
                if (str.equals(f2827)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1346045035:
                if (str.equals(f2830)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1119480813:
                if (str.equals(f2817)) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1091491584:
                if (str.equals(f2834)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1058625022:
                if (str.equals(StringFog.decrypt("rC9B+Z38bX6MMlT2n+RmT74lUv6K+Vhl\n", "/0Yml/yQLBw=\n"))) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -920590771:
                if (str.equals(StringFog.decrypt("7l0VH1VNYQnPdxQFREt6BsZGLQJVXQ==\n", "ozR7azAqE2g=\n"))) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -894298414:
                if (str.equals(StringFog.decrypt("UMYaw2RKRGJx4xXZZURYZE3OE9JXRFN0\n", "Ha90twEtNgM=\n"))) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -667901878:
                if (str.equals(StringFog.decrypt("tOiXnBxsM9SVycytF28C1Ivlr4EcfA==\n", "+YH56HkLQbU=\n"))) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -610610019:
                if (str.equals(f2809)) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -495785498:
                if (str.equals(f2844)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -453012127:
                if (str.equals(f2845)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -374448056:
                if (str.equals(f2820)) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -323393690:
                if (str.equals(f2837)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -239039370:
                if (str.equals(f2816)) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -156796625:
                if (str.equals(StringFog.decrypt("NTs2aXqauNwUEDluequj2A8=\n", "eFJYHR/9yr0=\n"))) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -126256187:
                if (str.equals(StringFog.decrypt("TTyQ5ZDytU9gNJbhivu0S3Y=\n", "BHj/kv6e2i4=\n"))) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -121577375:
                if (str.equals(StringFog.decrypt("JrWgigxjW14Hr4q1\n", "a/zO/mkEKT8=\n"))) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -75274960:
                if (str.equals(StringFog.decrypt("aOCDqASkoFk=\n", "K4Hu2GXNxzc=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -33766813:
                if (str.equals(StringFog.decrypt("1PTciB4Q2BHp88mBOgrIHfLWwZ4YBsId7w==\n", "nZqo7WxjrHg=\n"))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 114573451:
                if (str.equals(f2832)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 154057692:
                if (str.equals(StringFog.decrypt("aMOa9uZ9mIJJyZvs8G6LjVY=\n", "JYr0goMa6uM=\n"))) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 174921027:
                if (str.equals(f2822)) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 329817920:
                if (str.equals(StringFog.decrypt("xoJ7fpjp6orwgmNTg/7IhvqCfg==\n", "lOcMH+qNvOM=\n"))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 336960212:
                if (str.equals(StringFog.decrypt("FsJKF8O2MI8AzU4T\n", "VaMnZ6LfV+E=\n"))) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 373899945:
                if (str.equals(f2840)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 427609920:
                if (str.equals(f2821)) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(StringFog.decrypt("53P277ZDYI76dOPm\n", "jh2CisQwFOc=\n"))) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 675209731:
                if (str.equals(StringFog.decrypt("wPcRa319rXfG7g==\n", "g5Z8GxwUyhk=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 713779451:
                if (str.equals(StringFog.decrypt("nRtCvO0Ds3W8MUCh6w+Mfb4bb6n6AJd9tQU=\n", "0HIsyIhkwRQ=\n"))) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(StringFog.decrypt("Zae2TGXSnEpYsqdLdsU=\n", "K8bCJRO30CM=\n"))) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 824636291:
                if (str.equals(StringFog.decrypt("m+jHHb1T2TC36fwNu0nZJ6bj3R29\n", "0oazeM8FsFQ=\n"))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 858158177:
                if (str.equals(f2819)) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 888727913:
                if (str.equals(StringFog.decrypt("M7Y4DPb4w4wSrBIz1f7SmRGNLw==\n", "fv9WeJOfse0=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 892841421:
                if (str.equals(StringFog.decrypt("tyX/bcfei3qcMuc=\n", "9VeQGrS7+Sw=\n"))) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 897829864:
                if (str.equals(StringFog.decrypt("U3cfzzG5QWB4cxs=\n", "ERZsqmbcIzY=\n"))) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 950749305:
                if (str.equals(f2824)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 989671232:
                if (str.equals(StringFog.decrypt("camWt5VteyBQjpm3mXxsBFKku6KCbl8oWbc=\n", "PMD4w/AKCUE=\n"))) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1014009286:
                if (str.equals(StringFog.decrypt("PSMJhJ5X48QcCQuZmFvS8TEcDpWM\n", "cEpn8PswkaU=\n"))) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 1050400725:
                if (str.equals(f2829)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 1074855404:
                if (str.equals(StringFog.decrypt("ui3U82RAnZqbFNbmeEaNl5IS0+J2\n", "90S6hwEn7/s=\n"))) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 1118286493:
                if (str.equals(f2831)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1139753057:
                if (str.equals(StringFog.decrypt("mfOBWSBAFlu295xI\n", "25LyPGYydzw=\n"))) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(StringFog.decrypt("XhYfpHIE3SBjEQqtTB7aPXIWDrM=\n", "F3hrwQB3qUk=\n"))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1331885131:
                if (str.equals(StringFog.decrypt("p9O2XpgrkGqIyL5MmDGO\n", "67zXOvFF9ys=\n"))) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1342927760:
                if (str.equals(f2841)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1357502028:
                if (str.equals(StringFog.decrypt("OYRLnkduOZAXm2qcSWQWlw==\n", "eusm8ygAc+U=\n"))) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1424096196:
                if (str.equals(f2843)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1492060322:
                if (str.equals(f2810)) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(StringFog.decrypt("55QyD0AuozfpnC8VQDKHIQ==\n", "pfVcYSVc4lM=\n"))) {
                    c = C4427z5.U;
                    break;
                }
                c = 65535;
                break;
            case 1664904176:
                if (str.equals(f2825)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 1855930960:
                if (str.equals(f2839)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1884374718:
                if (str.equals(f2838)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2041991951:
                if (str.equals(f2842)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2073767153:
                if (str.equals(f2823)) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 2118015322:
                if (str.equals(f2833)) {
                    c = 26;
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
                return MBConfiguration.class;
            case 1:
                return MBridgeSDKFactory.class;
            case 2:
                return MBRewardVideoActivity.class;
            case 3:
                return AbstractJSActivity.class;
            case 4:
                return MBBaseActivity.class;
            case 5:
                return MBCommonActivity.class;
            case 6:
                return Campaign.class;
            case 7:
                return CampaignEx.class;
            case '\b':
                return InterVideoOutListener.class;
            case '\t':
                return InterstitialVideoListener.class;
            case '\n':
                return RewardVideoListener.class;
            case 11:
                return MBInterstitialActivity.class;
            case '\f':
                return InterstitialListener.class;
            case '\r':
            case 14:
                return MBBannerView.class;
            case 15:
            case 16:
                return MBBannerWebView.class;
            case 17:
                return MBInterstitialHandler.class;
            case 18:
                return MBInterstitialVideoHandler.class;
            case 19:
                return MBRewardVideoHandler.class;
            case 20:
                return NativeListener.class;
            case 21:
                return NativeListener.NativeTrackingListener.class;
            case 22:
                return NativeListener.NativeAdListener.class;
            case 23:
                return CampaignUnit.class;
            case 24:
                return BaseFragment.class;
            case 25:
            case 26:
                return BrowserView.class;
            case 27:
                return WebViewFragment.class;
            case 28:
                return CommonJumpLoader.class;
            case 29:
            case 30:
                return MBImageView.class;
            case 31:
                return MBridgeSDK.class;
            case ' ':
                return MBridgeConstans.class;
            case '!':
                return LoadingActivity.class;
            case '\"':
                return IDownloadListener.class;
            case '#':
                return interstitial.class;
            case '$':
            case '%':
                return BaseWebView.class;
            case '&':
            case '\'':
                return WindVaneWebView.class;
            case '(':
            case ')':
                return MBridgeVideoView.class;
            case '*':
            case '+':
                return MBridgeVastEndCardView.class;
            case ',':
            case '-':
                return MBridgeNativeEndCardView.class;
            case '.':
            case '/':
                return MBridgeClickCTAView.class;
            case '0':
            case '1':
                return MBridgeBaseView.class;
            case '2':
            case '3':
                return MBridgeClickMiniCardView.class;
            case '4':
            case '5':
                return MBridgeContainerView.class;
            case '6':
            case '7':
                return MBridgeH5EndCardView.class;
            case '8':
            case '9':
                return MBridgeLandingPageView.class;
            case ':':
            case ';':
                return MBridgePlayableView.class;
            case '<':
                return OnMBMediaViewListener.class;
            case '=':
                return BannerAdListener.class;
            case '>':
                return AbstractJSActivity.class;
            case '?':
            case '@':
                return DomainMBCommonActivity.class;
            case 'A':
                return MBridgeIds.class;
            case 'B':
                return RewardInfo.class;
            default:
                switch (str.hashCode()) {
                    case -1789471684:
                        if (str.equals(f2801)) {
                            return MIMManager.class;
                        }
                        return null;
                    case -1613020512:
                        if (str.equals(f2803)) {
                            return BaseActivity.class;
                        }
                        return null;
                    case -1258619456:
                        if (str.equals(f2806)) {
                            return com.mbridge.msdk.newout.RewardVideoListener.class;
                        }
                        return null;
                    case -828904331:
                        if (str.equals(f2804)) {
                            return com.mbridge.msdk.config.activity.MBRewardVideoActivity.class;
                        }
                        return null;
                    case -765829320:
                        if (str.equals(f2799)) {
                            return SameMD5.class;
                        }
                        return null;
                    case 450781617:
                        if (str.equals(f2802)) {
                            return BaseActivity.class;
                        }
                        return null;
                    case 834115686:
                        if (str.equals(f2808)) {
                            return MBBidRewardVideoHandler.class;
                        }
                        return null;
                    case 1499766450:
                        if (str.equals(f2807)) {
                            return IMBRRewardVideoHandler.class;
                        }
                        return null;
                    case 1884374718:
                        if (str.equals(f2838)) {
                            return com.mbridge.msdk.newout.MBRewardVideoHandler.class;
                        }
                        return null;
                    case 2024253542:
                        if (str.equals(f2805)) {
                            return com.mbridge.msdk.config.activity.MBRewardVideoActivity.class;
                        }
                        return null;
                    case 2097161959:
                        if (str.equals(f2800)) {
                            return FastKV.class;
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final String mo118() {
        C1050 c1050 = C0267.m139().f487;
        String decrypt = StringFog.decrypt("2JVAyrVJpAqSlECAoUnufNiV\n", "9r8crp4VilY=\n");
        c1050.getClass();
        return C1050.m621((Object) null, MBConfiguration.class, decrypt);
    }
}
