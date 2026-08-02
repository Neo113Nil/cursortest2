package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.appsflyer.AppsFlyerLib;
import com.facebook.k0;
import com.facebook.w;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.LiveActionWidgetProvider;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.firebase.GoogleMobileWorker;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ga0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ia0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga0(ia0 ia0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ia0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ia0 ia0Var = this.t;
        switch (i) {
            case 0:
                return new ga0(ia0Var, rq3Var, 0);
            case 1:
                return new ga0(ia0Var, rq3Var, 1);
            case 2:
                return new ga0(ia0Var, rq3Var, 2);
            case 3:
                return new ga0(ia0Var, rq3Var, 3);
            default:
                return new ga0(ia0Var, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((ga0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x060c, code lost:
    
        if (r2.d(r50) == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03c0, code lost:
    
        if (r3 == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02dd, code lost:
    
        if (defpackage.xw3.R(r0, r2, r50) == r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02cb, code lost:
    
        if (defpackage.xw3.R(r2, r3, r50) == r5) goto L91;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Signature[] signatureArr;
        Signature signature;
        Object c;
        int i = 2;
        int i2 = 3;
        rq3 rq3Var = null;
        int i3 = 1;
        switch (this.r) {
            case 0:
                Object obj2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    boolean z = dg0.a;
                    ia0 ia0Var = this.t;
                    if (!dg0.a) {
                        dg0.a = true;
                        ia0 ia0Var2 = ia0.q;
                        if (Intrinsics.c(ok3.p().e().getDataSharingOptOut(), Boolean.TRUE)) {
                            fdi fdiVar = dg0.d;
                            cg0 cg0Var = cg0.c;
                            fdiVar.getClass();
                            fdiVar.m(null, cg0Var);
                        } else {
                            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                            appsFlyerLib.setAppInviteOneLink("nixz");
                            appsFlyerLib.setOneLinkCustomDomain("app.sofascore.com");
                            appsFlyerLib.init("HGhxakhVW3Hq64cz4PR92C", null, ia0Var);
                            appsFlyerLib.addPushNotificationDeepLinkPath("af_push_link");
                            appsFlyerLib.enableTCFDataCollection(true);
                            appsFlyerLib.subscribeForDeepLink(new yf0(ia0Var));
                            appsFlyerLib.registerSessionReadyListener(new a70(5));
                            fdi fdiVar2 = dg0.d;
                            cg0 cg0Var2 = cg0.b;
                            fdiVar2.getClass();
                            fdiVar2.m(null, cg0Var2);
                        }
                    }
                    ia0 ia0Var3 = this.t;
                    zic.l(ia0Var3, ia0Var3.p, new st(15));
                    ia0 ia0Var4 = this.t;
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new ga0(ia0Var4, rq3Var, i2), this);
                    if (R != obj2) {
                        R = Unit.a;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        PackageManager packageManager = this.t.getPackageManager();
                        packageManager.getClass();
                        String packageName = this.t.getPackageName();
                        packageName.getClass();
                        Integer.parseInt(iii.H(6, "260720003"));
                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 64);
                        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && (signature = (Signature) ph0.A(signatureArr)) != null) {
                            byte[] byteArray = signature.toByteArray();
                            byteArray.getClass();
                            String x = t6a.x(byteArray);
                            if (x != null) {
                                String H = iii.H(3, x);
                                Locale locale = Locale.US;
                                locale.getClass();
                                H.toLowerCase(locale).getClass();
                            }
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                yea yeaVar = j58.a;
                ia0 ia0Var5 = this.t;
                v38 v38Var = ia0Var5.k;
                if (v38Var == null) {
                    Intrinsics.i("firebaseInAppMessaging");
                    throw null;
                }
                e58 f = e58.f();
                f.getClass();
                h12 h12Var = new h12(2);
                if (3600 >= 0) {
                    h12Var.b = 3600L;
                } else {
                    a70.p(vxd.m("Minimum interval between fetches has to be a non-negative number. ", 3600L, " is an invalid argument"));
                }
                Unit unit = Unit.a;
                h12 h12Var2 = new h12();
                h12Var2.a = h12Var.a;
                h12Var2.b = h12Var.b;
                Tasks.call(f.c, new c00(3, f, h12Var2));
                nxf[] nxfVarArr = nxf.a;
                Pair pair = new Pair("twitter_tournaments_with_feed", "[]");
                Boolean bool = Boolean.FALSE;
                Pair pair2 = new Pair("event_analytics_count_odds_view", bool);
                Boolean bool2 = Boolean.TRUE;
                Map h = tub.h(pair, pair2, new Pair("chat_translate_sendTranslations", bool2), new Pair("chat_translate_showDialog", bool), new Pair("chat_translate_availableTranslations", "[en,de,it,fr,tr,es,pt]"), new Pair("chat_translate_confidenceThreshold", "0.15"), new Pair("vpn_countries", "[IR, RU, CO, PT, IQ, TR, ID, VN, TH, NP, GH, AZ, KE]"), new Pair("player_ratings_article", "https://www.sofascore.com/news/sofascore-player-ratings/"), new Pair("vpn_browser_host", "sofascore1.com"), new Pair("whats_new_api", "24"), new Pair("new_featured_odds_view", bool), new Pair("force_update_to_version", "0"), new Pair("chat_odds_countries", "[]"), new Pair("pickem", "[]"), new Pair("fantasy_announcements", "[]"), new Pair("use_pub_matic_ads", bool), new Pair("home_away_reversal_enabled", bool), new Pair("nats_analytics_enabled", bool2), new Pair("featured_tournament_chat_active", bool), new Pair("lower_league_filter_sports", "[\"football\", \"minifootball\", \"futsal\", \"esports\"]"), new Pair("live_action_widget_enabled_sports", "[\"football\", \"basketball\", \"baseball\"]"), new Pair("live_action_widget_football_provider", LiveActionWidgetProvider.OPTA), new Pair("nimbus_ads_enabled", bool), new Pair("fantasy_min_version", "0"), new Pair("leagues_default_tab", "A"), new Pair("should_show_feed_national_filter", bool2), new Pair("ad_inventory_config", "{\n  \"placements\": {\n    \"Banner.DefaultSticky\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/Mobile-Smart-Banner\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/Mobile-Smart-Banner_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 102446\n        }\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.BelowOdds\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/app_bellow_odds\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/app_bellow_odds_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 102446\n        }\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.MainScreenSmall\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Top_320x50\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Top_320x50_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 129099\n        }\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 15\n    },\n    \"Banner.MainScreenBig\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Mid_300x250\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Mid_300x250_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 129100\n        }\n      },\n      \"height\": 250,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.FeaturedTournamentSmall\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Euro_Top_320x50\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Euro_Top_320x50_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 129099\n        }\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.FeaturedTournamentBig\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Euro_Mid_300x250\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Homepage_Euro_Mid_300x250_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 1389898,\n          \"formatId\": 129100\n        }\n      },\n      \"height\": 250,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.StreamVideoOverlay\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Video_Overlay\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Video_Overlay_Nimbus\"\n        },\n        \"equativ\": null\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.FantasySmall\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Fantasy_320x50\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Fantasy_320x50_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 2105116,\n          \"formatId\": 129099\n        }\n      },\n      \"height\": 50,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Banner.FantasyBig\": {\n      \"configType\": \"Banner\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Fantasy_300x250\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Fantasy_300x250_Nimbus\"\n        },\n        \"equativ\": {\n          \"pageId\": 2105156,\n          \"formatId\": 129100\n        }\n      },\n      \"height\": 250,\n      \"size\": \"inline\",\n      \"refreshSeconds\": 30\n    },\n    \"Interstitial.Media\": {\n      \"configType\": \"Interstitial\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/interstitial_app\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/interstitial_app\"\n        },\n        \"equativ\": {\n          \"pageId\": 1945257,\n          \"formatId\": 129250\n        }\n      },\n      \"expirationSeconds\": 1800\n    },\n    \"Interstitial.Fantasy\": {\n      \"configType\": \"Interstitial\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Fantasy_Interstitial_320x480\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Fantasy_Interstitial_320x480\"\n        },\n        \"equativ\": {\n          \"pageId\": 1945257,\n          \"formatId\": 129250\n        }\n      },\n      \"expirationSeconds\": 1800\n    },\n    \"RewardedInterstitial.EventWhoWillWin\": {\n      \"configType\": \"RewardedInterstitial\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Event_Details_Who_Will_Win_320x480\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Event_Details_Who_Will_Win_320x480\"\n        },\n        \"equativ\": null\n      },\n      \"includePaidUsers\": false,\n      \"shouldVerify\": false\n    },\n    \"RewardedInterstitial.ProfileWhoWillWin\": {\n      \"configType\": \"RewardedInterstitial\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_User_Profile_Predictions_Who_Will_Win_320x480\"\n        },\n        \"nimbus\": {\n          \"adUnitId\": \"/21866864457/APP_Mobile_Event_Details_Who_Will_Win_320x480\"\n        },\n        \"equativ\": null\n      },\n      \"includePaidUsers\": false,\n      \"shouldVerify\": false\n    },\n    \"Preroll.EventLiveStream\": {\n      \"configType\": \"Preroll\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"https://pubads.g.doubleclick.net/gampad/live/ads?iu=/21866864457/preroll_video_app&description_url=http%3A%2F%2Fsofascore.com&tfcd=0&npa=0&sz=1x1%7C400x300%7C640x480&ciu_szs=300x250%2C336x280%2C728x90&min_ad_duration=5000&max_ad_duration=30000&gdfp_req=1&unviewed_position_start=1&output=vast&env=vp&impl=s&correlator=\"\n        },\n        \"nimbus\": null,\n        \"equativ\": null\n      }\n    },\n    \"Preroll.LiveActionWidget\": {\n      \"configType\": \"Preroll\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"https://pubads.g.doubleclick.net/gampad/live/ads?iu=/21866864457/APP_LMT_Instream_Video&description_url=https%3A%2F%2Fwww.sofascore.com&tfcd=0&npa=0&sz=400x300%7C640x480&max_ad_duration=30000&gdfp_req=1&unviewed_position_start=1&output=vast&env=vp&impl=s&correlator=\"\n        },\n        \"nimbus\": null,\n        \"equativ\": null\n      },\n      \"delaySeconds\": 5\n    },\n    \"Native.Media\": {\n      \"configType\": \"Native\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/app_native_feed\"\n        },\n        \"nimbus\": null,\n        \"equativ\": null\n      }\n    },\n    \"Native.TrendingGridMedium\": {\n      \"configType\": \"Native\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Native_Trending_Mid\"\n        },\n        \"nimbus\": null,\n        \"equativ\": null\n      }\n    },\n    \"Native.TrendingGridLarge\": {\n      \"configType\": \"Native\",\n      \"adUnit\": {\n        \"gam\": {\n          \"adUnitId\": \"/21866864457/APP_Native_Trending_Large\"\n        },\n        \"nimbus\": null,\n        \"equativ\": null\n      }\n    }\n  }\n}"), new Pair("euro_conversion_historical_rates", "{\n    \"current\": {\n    \"USD\": 1.16594333,\n    \"GBP\": 0.86830971,\n    \"AUD\": 1.74093168,\n    \"CNY\": 8.13429272\n    }\n}"), new Pair("team_matches_calendar_view", bool), new Pair("show_pick_dream_team_banner", bool2), new Pair("world_cup_rounds", "[\n  {\n    \"startTimestamp\": 1781204400,\n    \"endTimestamp\": 1782612000,\n    \"normalizedRoundDuration\": 0.44\n  },\n  {\n    \"startTimestamp\": 1782673200,\n    \"endTimestamp\": 1783128600,\n    \"normalizedRoundDuration\": 0.15\n  },\n  {\n    \"startTimestamp\": 1783184400,\n    \"endTimestamp\": 1783454400,\n    \"normalizedRoundDuration\": 0.12\n  },\n  {\n    \"startTimestamp\": 1783627200,\n    \"endTimestamp\": 1783818000,\n    \"normalizedRoundDuration\": 0.11\n  },\n  {\n    \"startTimestamp\": 1784055600,\n    \"endTimestamp\": 1784142000,\n    \"normalizedRoundDuration\": 0.08\n  },\n  {\n    \"startTimestamp\": 1784408400,\n    \"endTimestamp\": 1784408400,\n    \"normalizedRoundDuration\": 0.05\n  },\n  {\n    \"startTimestamp\": 1784487600,\n    \"endTimestamp\": 1784487600,\n    \"normalizedRoundDuration\": 0.05\n  }\n]"), new Pair("wc_enhanced_player_image", bool), new Pair("key_players_use_enhanced_image", bool), new Pair("world_cup_countries", "[\n  {\n    \"alpha2\": \"HR\",\n    \"teamId\": 4715,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"PT\",\n    \"teamId\": 4704,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"PA\",\n    \"teamId\": 5164,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"AT\",\n    \"teamId\": 4718,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"MA\",\n    \"teamId\": 4778,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"TN\",\n    \"teamId\": 4729,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"ES\",\n    \"teamId\": 4698,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"CH\",\n    \"teamId\": 4699,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"PY\",\n    \"teamId\": 4789,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"EG\",\n    \"teamId\": 4758,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"IR\",\n    \"teamId\": 4766,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"JO\",\n    \"teamId\": 4771,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"KR\",\n    \"teamId\": 4735,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"CA\",\n    \"teamId\": 4752,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"CZ\",\n    \"teamId\": 4714,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"TR\",\n    \"teamId\": 4700,\n    \"color\": \"red\"\n  },\n  {\n    \"alpha2\": \"CW\",\n    \"teamId\": 55827,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"HT\",\n    \"teamId\": 7229,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"NO\",\n    \"teamId\": 4475,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"FR\",\n    \"teamId\": 4481,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"SX\",\n    \"teamId\": 4695,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"US\",\n    \"teamId\": 4724,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"EN\",\n    \"teamId\": 4713,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"UZ\",\n    \"teamId\": 4723,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"JP\",\n    \"teamId\": 4770,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"CV\",\n    \"teamId\": 4753,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"CD\",\n    \"teamId\": 4823,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"BA\",\n    \"teamId\": 4479,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"SE\",\n    \"teamId\": 4688,\n    \"color\": \"blue\"\n  },\n  {\n    \"alpha2\": \"AU\",\n    \"teamId\": 4741,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"GH\",\n    \"teamId\": 4764,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"ZA\",\n    \"teamId\": 4736,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"EC\",\n    \"teamId\": 4757,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"BR\",\n    \"teamId\": 4748,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"CO\",\n    \"teamId\": 4820,\n    \"color\": \"yellow\"\n  },\n  {\n    \"alpha2\": \"SN\",\n    \"teamId\": 4739,\n    \"color\": \"green\"\n  },\n  {\n    \"alpha2\": \"SA\",\n    \"teamId\": 4834,\n    \"color\": \"green\"\n  },\n  {\n    \"alpha2\": \"DZ\",\n    \"teamId\": 4691,\n    \"color\": \"green\"\n  },\n  {\n    \"alpha2\": \"MX\",\n    \"teamId\": 4781,\n    \"color\": \"green\"\n  },\n  {\n    \"alpha2\": \"IQ\",\n    \"teamId\": 4767,\n    \"color\": \"green\"\n  },\n  {\n    \"alpha2\": \"UY\",\n    \"teamId\": 4725,\n    \"color\": \"lightBlue\"\n  },\n  {\n    \"alpha2\": \"AR\",\n    \"teamId\": 4819,\n    \"color\": \"lightBlue\"\n  },\n  {\n    \"alpha2\": \"NL\",\n    \"teamId\": 4705,\n    \"color\": \"orange\"\n  },\n  {\n    \"alpha2\": \"CI\",\n    \"teamId\": 4768,\n    \"color\": \"orange\"\n  },\n  {\n    \"alpha2\": \"BE\",\n    \"teamId\": 4717,\n    \"color\": \"cherry\"\n  },\n  {\n    \"alpha2\": \"QA\",\n    \"teamId\": 4792,\n    \"color\": \"cherry\"\n  },\n  {\n    \"alpha2\": \"DE\",\n    \"teamId\": 4711,\n    \"color\": \"gray\"\n  },\n  {\n    \"alpha2\": \"NZ\",\n    \"teamId\": 4784,\n    \"color\": \"gray\"\n  }\n]"), new Pair("world_cup_timestamps", "{\n    \"myTeamCollapsable\": 1782864000,\n    \"midPhaseStart\": 1780444800,\n    \"liveTournamentPhaseStart\": 1781204400,\n    \"liveTournament2PhaseStart\": 1782259200,\n    \"liveTournament3PhaseStart\": 1782691200,\n    \"afterFinalPhaseStart\": 1784419200,\n    \"endPhaseStart\": 1784505600\n}"), new Pair("trending_grid_enabled", bool), new Pair("new_box_score_enabled", bool), new Pair("fantasy_h2h_leagues_enabled", bool));
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : h.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof byte[]) {
                        hashMap.put((String) entry.getKey(), new String((byte[]) value));
                    } else {
                        hashMap.put((String) entry.getKey(), value.toString());
                    }
                }
                try {
                    ei3 d = fi3.d();
                    d.b = new JSONObject(hashMap);
                    f.f.d(d.a()).onSuccessTask(u38.a, new hg6(17));
                } catch (JSONException unused) {
                    Tasks.forResult(null);
                }
                f.a().addOnCompleteListener(new o3(22, ia0Var5, v38Var));
                jgd jgdVar = jgd.a;
                this.s = 2;
                break;
                break;
            case 1:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    ccd ccdVar = ccd.a;
                    ia0 ia0Var6 = this.t;
                    this.s = 1;
                    if (ccdVar.D(ia0Var6, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var7 = this.t;
                    ktd A = mha.A(new ktd(GoogleMobileWorker.class));
                    mha.y(A);
                    Context applicationContext = ia0Var7.getApplicationContext();
                    applicationContext.getClass();
                    xbl d2 = xbl.d(applicationContext);
                    d2.getClass();
                    d2.b("GoogleMobileWorker-".concat(""), nf6.a, (ltd) A.a());
                    z8e.U(this.t, false);
                    ia0 ia0Var8 = this.t;
                    zic.l(ia0Var8, ia0Var8.p, new w90(ia0Var8, i));
                    ia0 ia0Var9 = this.t;
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = ia0Var9.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext2);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    int i7 = sharedPreferences.getInt("version_code", Integer.MAX_VALUE);
                    boolean z2 = i7 < Integer.parseInt(iii.H(6, "260720003"));
                    boolean z3 = i7 < 250116;
                    if (z2 && z3) {
                        try {
                            f5p.E(ia0Var9, new big(new tzg(ia0Var9), ia0Var9, rq3Var, 4));
                        } catch (Exception e) {
                            s38.a().c(e);
                        }
                    }
                    ia0 ia0Var10 = this.t;
                    v38 v38Var2 = ia0Var10.k;
                    if (v38Var2 == null) {
                        Intrinsics.i("firebaseInAppMessaging");
                        throw null;
                    }
                    v38Var2.d = true;
                    hs4 hs4Var2 = z45.a;
                    hq4 hq4Var = hq4.c;
                    ga0 ga0Var = new ga0(ia0Var10, rq3Var, i3);
                    this.s = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        this.t.c = true;
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                hs4 hs4Var3 = z45.a;
                fa0 fa0Var = new fa0(this.t, rq3Var, i3);
                this.s = 2;
                break;
            case 3:
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    bfk g = this.t.g();
                    this.s = 1;
                    c = g.c(this);
                    if (c == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                String id = ((UserAccount) c).getId();
                s38 a = s38.a();
                ia0 ia0Var11 = this.t;
                Boolean dataSharingOptOut = ia0Var11.e().getDataSharingOptOut();
                Boolean bool3 = Boolean.TRUE;
                a.d(!Intrinsics.c(dataSharingOptOut, bool3));
                if (!Intrinsics.c(ia0Var11.e().getDataSharingOptOut(), bool3)) {
                    Calendar calendar = ke0.a;
                    String d3 = ke0.d(ia0Var11);
                    nw3 nw3Var = a.a;
                    ((xx3) nw3Var.o.b).g(new mc3(i2, nw3Var, d3));
                }
                int i9 = ke0.c;
                nw3 nw3Var2 = a.a;
                int i10 = 11;
                ((xx3) nw3Var2.o.b).g(new p3(i10, nw3Var2, "mcc", Integer.toString(i9)));
                String a2 = dla.a();
                nw3 nw3Var3 = a.a;
                ((xx3) nw3Var3.o.b).g(new p3(i10, nw3Var3, "app_language", a2));
                nw3 nw3Var4 = a.a;
                ((xx3) nw3Var4.o.b).g(new p3(i10, nw3Var4, "user_account_id", id));
                String str = SearchResponseKt.SPORT_ENTITY;
                Calendar calendar2 = ke0.a;
                String b = ke0.b(ia0Var11);
                nw3 nw3Var5 = a.a;
                ((xx3) nw3Var5.o.b).g(new p3(i10, nw3Var5, str, b));
                if (t62.a == null) {
                    synchronized (t62.b) {
                        try {
                            if (t62.a == null) {
                                r38 c2 = r38.c();
                                c2.a();
                                t62.a = FirebaseAnalytics.getInstance(c2.a);
                            }
                            Unit unit2 = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                FirebaseAnalytics firebaseAnalytics = t62.a;
                firebaseAnalytics.getClass();
                ia0 ia0Var12 = this.t;
                boolean z4 = !Intrinsics.c(ia0Var12.e().getDataSharingOptOut(), bool3);
                zzez zzezVar = firebaseAnalytics.a;
                Boolean valueOf = Boolean.valueOf(z4);
                zzezVar.getClass();
                zzezVar.c(new kzn(zzezVar, valueOf));
                if (!Intrinsics.c(ia0Var12.e().getDataSharingOptOut(), bool3)) {
                    String d4 = ke0.d(ia0Var12);
                    zzez zzezVar2 = firebaseAnalytics.a;
                    zzezVar2.getClass();
                    zzezVar2.c(new ezn(zzezVar2, d4, 0));
                }
                zzez zzezVar3 = firebaseAnalytics.a;
                zzezVar3.getClass();
                zzezVar3.c(new tyn(zzezVar3, (String) null, "app_store", (Object) "Google Play Store", false));
                String a3 = dla.a();
                zzez zzezVar4 = firebaseAnalytics.a;
                zzezVar4.getClass();
                zzezVar4.c(new tyn(zzezVar4, (String) null, "app_language", (Object) a3, false));
                zzez zzezVar5 = firebaseAnalytics.a;
                zzezVar5.getClass();
                zzezVar5.c(new tyn(zzezVar5, (String) null, "user_account_id", (Object) id, false));
                String valueOf2 = String.valueOf(y05.a(ia0Var12));
                zzez zzezVar6 = firebaseAnalytics.a;
                zzezVar6.getClass();
                zzezVar6.c(new tyn(zzezVar6, (String) null, "device_low_ram", (Object) valueOf2, false));
                y48 a4 = y48.a();
                a4.getClass();
                a4.b(!Intrinsics.c(this.t.e().getDataSharingOptOut(), bool3));
                w wVar = w.a;
                if (Intrinsics.c(this.t.e().getDataSharingOptOut(), bool3)) {
                    w.k();
                    k0.k();
                    String[] strArr = new String[0];
                    if (!cw3.a.contains(w.class)) {
                        try {
                            w.l(strArr);
                        } catch (Throwable th2) {
                            cw3.a(w.class, th2);
                        }
                    }
                }
                w.u = true;
                return Unit.a;
            default:
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var13 = this.t;
                    this.s = 1;
                    if (v14.a(ia0Var13, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
