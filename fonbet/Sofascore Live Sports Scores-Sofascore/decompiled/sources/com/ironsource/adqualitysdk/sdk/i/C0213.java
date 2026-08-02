package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ĵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0213 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f416 = StringFog.decrypt("CgwfDYMcDs4DHTs8mQ0Z2B4MDxyTHwnOHh0=\n", "bWlrTvZufKs=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f415 = StringFog.decrypt("jtXP7JbjjNuN\n", "6bC7v+aM+JI=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f414 = StringFog.decrypt("2nsDeLcLyx7JexlN\n", "vR53OdNIpHA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f413 = StringFog.decrypt("S3aVVUbgHIlQYLZOa+g=\n", "IgXTICqMb+o=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f412 = StringFog.decrypt("TMC68vFZpbNB\n", "JbPsm5U8yvI=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f411 = StringFog.decrypt("vIaLhw1CF3WPi42rFEwcS6mP\n", "2+P/xGErdB4=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f410 = StringFog.decrypt("JYtlBXinLk82\n", "Qu4RSRneQTo=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f409 = StringFog.decrypt("qJUmFsROoa27lTYQz0uwjaCeJjfOTqirvQ==\n", "z/BSRaEixM4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f408 = StringFog.decrypt("g6f9fn25QxuQp+1ud7tSHYq2ykJ2oVQXiK7sXw==\n", "5MKJLRjVJng=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f407 = StringFog.decrypt("2TxVFwLbDF3NFUghANsMTMw=\n", "vlkhUnS+Yik=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f406 = StringFog.decrypt("VMBlXekili1U6Xhr6yKWPFU=\n", "J6URGJ9H+Fk=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f405 = StringFog.decrypt("Pz5fE36UBNgs\n", "WFsrUhrHdLc=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f404 = StringFog.decrypt("5o4o21WG1MHomCziWpb0/PGOGeBOgg==\n", "getcjjvvoIU=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f403 = StringFog.decrypt("gHirnbv1XVSlfLG+rOZiWYJqlrQ=\n", "5x3f0MmUNDA=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f402 = StringFog.decrypt("XGhwYk5Hqu5Ifm1ETXO5/1pJa0ZCXrY=\n", "Ow0EKyM32Is=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f401 = StringFog.decrypt("0ozCskxPvjjylMmeUFq4PvWDwJVMQao//pDttEpHqyXvmw==\n", "m+Ks1z4u3Uw=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f400 = StringFog.decrypt("YRek8uRxVu1wVqCy7G1G6WEMoKrnJkfsaVaov/ZhQuF2EayvrEFa5mcKqL/2YULtSxa9ufBmVeRA\nCqar8W1GyWEMoKrrfE0=\n", "AnjJ3IIINIg=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f399 = StringFog.decrypt("089JL+2jH9vz10IM6q4Q3PnTQi/xgxju+dVOPPa2BQ==\n", "mqEnSp/CfK8=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f398 = StringFog.decrypt("F/En8eV+We0GsCOx7WJJ6RfqI6nmKUjsH7ArvPduTeEA9y+srU5V5hHsK7z3bk3tMusms/BkSe0R\n8Au7wmRP4QL3PqY=\n", "dJ5K34MHO4g=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f397 = StringFog.decrypt("bWt9p3drOalNc3aQbGkykEFheqNTYz64S1V/o3xvKJxHcXq0bH4jnkt3dg==\n", "JAUTwgUKWt0=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f396 = StringFog.decrypt("IPGR/0GU7WgxsJW/SYj9bCDqladCw/xpKLCdslOE+WQ395miCaThYybsnbJThPloEfefuWqI62Qi\nyJW1QoLfYSLnmaNmjvtkNfeIqGSC/Wg=\n", "Q5780Sftjw0=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f395 = StringFog.decrypt("jEsmtspu5sOsUy2S3Fz12LE=\n", "xSVI07gPhbc=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f394 = StringFog.decrypt("mBensDxVcr+4D6yUKmZ0uqQcuqE=\n", "0XnJ1U40Ecs=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f393 = StringFog.decrypt("qUQHvZabC+CJXAyZgKgN+oRPG72W\n", "4Cpp2OT6aJQ=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f392 = StringFog.decrypt("F72IaDAyXTw3pYNAJzdXKSq6iWMMMlMt\n", "XtPmDUJTPkg=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f391 = StringFog.decrypt("ZDuB3pZHuZdgG6zQn0Si\n", "LXrCsfgh0PA=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f390 = StringFog.decrypt("YayuJjYrhhJBtKUAKySRA0a2gywqPpcJRK6lMQ==\n", "KMLAQ0RK5WY=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f389 = StringFog.decrypt("9U9Mqx9osNHVV0ebA2Cn5tNPVrwCZb/Azg==\n", "vCEizm0J06U=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f388 = StringFog.decrypt("TpziBPnNBbluhOkg7/oPqHCn4gj/7wmjc4DjDefJFA==\n", "B/KMYYusZs0=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f387 = StringFog.decrypt("e1953SKkEYRCUGn9H70H\n", "LjEQqWbNYvQ=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f386 = StringFog.decrypt("2/xCqlUgfXHt/kKqRCE=\n", "noonxCFTMRg=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f385 = StringFog.decrypt("cA==\n", "IsMbvGSAuLU=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f384 = StringFog.decrypt("7f4e4IsVpoDN5hXDjBiph8fiFeCXIqyQwf8z6pcAoJrQ0x/rjQaqmMj1Ag==\n", "pJBwhfl0xfQ=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f383 = StringFog.decrypt("LB6ZAvHbkO0MBpIh9taf6gYCkgLt+5fcExWZE/D2muoRFZkC8Q==\n", "ZXD3Z4O685k=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f382 = StringFog.decrypt("d2TqjUzZKu1VaOCcb/M290Rj65o=\n", "IQ2O6COaRYM=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f381 = StringFog.decrypt("i68F46DUqBGAsx7xod+7MauyBeO837s=\n", "wsFxhtK6yX0=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f380 = StringFog.decrypt("In63kp0Wnc4PSa2SvDOQ2BR6qpK5\n", "YB/E98t/+as=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f379 = StringFog.decrypt("WY2R\n", "DezhSmefkg0=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f378 = StringFog.decrypt("fycKrZoEnuxfPwGOnQmR61U7Aa2GJJndQCwKvJsplOtCLAqtmiSZ+UY9Abo=\n", "NklkyOhl/Zg=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f377 = StringFog.decrypt("JJkWoFD944wEgR2DV/Dsiw6FHaBMye6RGbQXq1bu75QBkgo=\n", "bfd4xSKcgPg=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f376 = StringFog.decrypt("7slHVneUILXO0UxyYaMqpNDxQFdgmgCuydNMXXG2LK/T1UZfaZAx\n", "p6cpMwX1Q8E=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f375 = StringFog.decrypt("lYdP77Fb0sujhU/voFrfxrGBXuS3\n", "0PEqgcUonqI=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f374 = StringFog.decrypt("IDXlFvUrUyQCOe8H1gFPPhMy5AHbDF06Ajnz\n", "dlyBc5poPEo=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f373 = StringFog.decrypt("/ynUSo01ZZbfHA==\n", "tmiZOOxcAd0=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f372 = StringFog.decrypt("ceZhoVn59XddxVq6XefST1bTfrxU/PRS\n", "OKcM0ziQkSA=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f371 = StringFog.decrypt("kIuEZnvi4Kywvg==\n", "2crSDx+Hj+c=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f370 = StringFog.decrypt("Sj4Frlua4xlsPTG9Sog=\n", "A1N13D7pkHA=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f369 = StringFog.decrypt("RQ2ovZ+y4uJoJbuClb7K6Folv6M=\n", "DEza1Pzar4c=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f368 = StringFog.decrypt("oPE7MXmCQDaA6TASfo9PMYrtMDFlokcHn/o7IHivSjGd+jsxebRKNoHWOCR5hlAxgPA7EGqXQg==\n", "6Z9VVAvjI0I=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f367 = StringFog.decrypt("99zNdu9u743XxMZS+VnlnMn31Xbze/+118HXdvNq/q7Xxsta8H/+nM3BynzzS+2N3w==\n", "vrKjE50PjPk=\n");

    public C0213(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f416, new C0288(this));
        hashMap.put(f415, new C0286(this));
        hashMap.put(f414, new C0273(this));
        hashMap.put(f413, new C0252(this));
        hashMap.put(f412, new C0228(this));
        hashMap.put(f411, new C0221(this));
        hashMap.put(f410, new C0217(this));
        hashMap.put(f409, new C0215(this));
        hashMap.put(f408, new C0214(this));
        hashMap.put(f407, new C0410(this));
        hashMap.put(f406, new C0407(this));
        hashMap.put(f405, new C0406(this));
        hashMap.put(f404, new C0376(this));
        hashMap.put(f403, new C0369(this));
        hashMap.put(f402, new C0347(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(f371)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1757761411:
                if (str.equals(f374)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1751837367:
                if (str.equals(f399)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1661930846:
                if (str.equals(f396)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1611796569:
                if (str.equals(f383)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1452673136:
                if (str.equals(f394)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1264220508:
                if (str.equals(f388)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1205203919:
                if (str.equals(f384)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1190251081:
                if (str.equals(f377)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f370)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -955341033:
                if (str.equals(f373)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -758374370:
                if (str.equals(f376)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -587023626:
                if (str.equals(f372)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -312786562:
                if (str.equals(f401)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -233888832:
                if (str.equals(f368)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -50587944:
                if (str.equals(f387)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 82:
                if (str.equals(f385)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 83843:
                if (str.equals(f379)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 114221977:
                if (str.equals(f390)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 218220615:
                if (str.equals(f392)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 294386593:
                if (str.equals(f395)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 305774826:
                if (str.equals(f367)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 334157136:
                if (str.equals(f369)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 598324252:
                if (str.equals(f389)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 652259752:
                if (str.equals(f378)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 778319234:
                if (str.equals(f375)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 809010015:
                if (str.equals(f381)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 986039922:
                if (str.equals(f382)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 996606931:
                if (str.equals(f391)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1840053850:
                if (str.equals(f400)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1945237502:
                if (str.equals(f397)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1956883725:
                if (str.equals(f386)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2019288557:
                if (str.equals(f398)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2082429859:
                if (str.equals(f380)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2110184418:
                if (str.equals(f393)) {
                    c = '\b';
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
            case 1:
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case '\b':
                return InneractiveAdRenderer.class;
            case '\t':
                return InneractiveMediationName.class;
            case '\n':
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case '\f':
                return InneractiveUnitController.class;
            case '\r':
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case ' ':
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case '!':
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case '\"':
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }
}
