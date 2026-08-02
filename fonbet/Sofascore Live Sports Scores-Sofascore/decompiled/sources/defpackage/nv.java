package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.ProductDetails;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.appevents.k;
import com.facebook.w;
import com.google.android.gms.ads.AdValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.ChatCountry;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.branding.MatchOfTheWeekCtaType;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.chat.TournamentSeasonPair;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.start.StartActivity;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nv {
    public static k a;
    public static Boolean b;

    public static void A(Context context, String str, String str2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", str);
        if (str2 != null) {
            firebaseBundle.putString("type", str2);
        }
        N(context, firebaseBundle, "fantasy_interaction");
    }

    public static void A0(Context context, Integer num, ia9 ia9Var) {
        zu[] zuVarArr = zu.a;
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", ia9Var.a);
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "wsc");
        N(context, firebaseBundle, "video_highlights_click");
    }

    public static void B(Context context, w31 w31Var, long j, int i, boolean z) {
        context.getClass();
        w31Var.getClass();
        if (w31Var instanceof fdd) {
            return;
        }
        String str = w31Var instanceof f41 ? "main_stacked_card" : w31Var instanceof euh ? "analyst_card" : z ? "stacked_card" : "non_stacked_card";
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", w31Var.getG());
        firebaseBundle.putLong("time_on_screen", j);
        firebaseBundle.putString("position", String.valueOf(i + 1));
        firebaseBundle.putString("category", str);
        N(context, firebaseBundle, "media_post_impression");
    }

    public static void B0(Context context, Integer num, ia9 ia9Var) {
        zu[] zuVarArr = zu.a;
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", ia9Var.a);
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "wsc");
        N(context, firebaseBundle, "video_highlights_impression");
    }

    public static void C(Context context, k6c k6cVar, long j) {
        context.getClass();
        k6cVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putLong("time_on_screen", j);
        firebaseBundle.putString("type", k6cVar.b);
        N(context, firebaseBundle, "feed_list_impression");
    }

    public static void C0(int i, int i2, lv lvVar, Context context, String str) {
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("position", String.valueOf(i2));
        firebaseBundle.putString("location", lvVar.a);
        N(context, firebaseBundle, "event_vote");
        P(context, firebaseBundle, "event_vote");
    }

    public static void D(Context context, int i, String str, uk8 uk8Var) {
        context.getClass();
        uk8Var.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("action", str);
        firebaseBundle.putString("location", uk8Var.a);
        N(context, firebaseBundle, "match_shotmap");
    }

    public static void D0(ia0 ia0Var, mv mvVar) {
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", mvVar.a);
        N(ia0Var, firebaseBundle, "video_highlights_ads_click");
    }

    public static xu E(Team team) {
        team.getClass();
        return !Intrinsics.c(team.getSportSlug(), Sports.MOTORSPORT) ? xu.TEAM : team.getType() == 0 ? xu.CONSTRUCTOR : xu.TEAM;
    }

    public static void E0(ia0 ia0Var, mv mvVar) {
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", mvVar.a);
        N(ia0Var, firebaseBundle, "video_highlights_ads_impression");
    }

    public static String F(Intent intent) {
        int intExtra = intent.getIntExtra(Payload.CAMPAIGN_ID, -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return String.valueOf(valueOf.intValue());
        }
        return null;
    }

    public static hv G(Intent intent) {
        return intent.getBooleanExtra("intent_from_notification", false) ? hv.NOTIFICATION : intent.getBooleanExtra("intent_from_widget", false) ? hv.WIDGET : hv.APP;
    }

    public static void H(int i, lv lvVar, Context context, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("location", lvVar.a);
        N(context, firebaseBundle, "goat_vote");
        P(context, firebaseBundle, "goat_vote");
    }

    public static void I(Context context, String str, ProductDetails.PricingPhase pricingPhase) {
        String priceCurrencyCode;
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("product_id", str);
        if (pricingPhase != null && (priceCurrencyCode = pricingPhase.getPriceCurrencyCode()) != null) {
            firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, priceCurrencyCode);
        }
        if (pricingPhase != null) {
            firebaseBundle.putDouble(U3.i.X, pricingPhase.getPriceAmountMicros() / 1000000.0d);
        }
        ia0 ia0Var = ia0.q;
        ((f5d) me4.e()).c("in_app_purchase", firebaseBundle);
    }

    public static void J(Context context, String str, String str2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("before_change", str);
        firebaseBundle.putString("after_change", str2);
        N(context, firebaseBundle, "language_change");
    }

    public static void K(Context context, String str, String str2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("before_change", str);
        firebaseBundle.putString("after_change", str2);
        N(context, firebaseBundle, "app_theme_change");
    }

    public static void L(Context context, String str, long j, String str2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", str2);
        firebaseBundle.putString("location", str);
        firebaseBundle.putLong("time_on_screen", j);
        N(context, firebaseBundle, "chip_view");
    }

    public static void M(Context context, FirebaseBundle firebaseBundle, String str) {
        for (Map.Entry<String, Long> entry : firebaseBundle.getLongMap().entrySet()) {
            entry.getKey();
            entry.getValue().longValue();
        }
        for (Map.Entry<String, Double> entry2 : firebaseBundle.getDoubleMap().entrySet()) {
            entry2.getKey();
            new BigDecimal(String.valueOf(entry2.getValue().doubleValue())).toPlainString();
        }
        for (Map.Entry<String, String> entry3 : firebaseBundle.getStringMap().entrySet()) {
            entry3.getKey();
            entry3.getValue();
        }
        Calendar calendar = ke0.a;
        ke0.d(context);
        "country: ".concat(dv3.c());
        ugj.a.getClass();
    }

    public static void N(Context context, FirebaseBundle firebaseBundle, String str) {
        if (firebaseBundle == null) {
            firebaseBundle = new FirebaseBundle();
        }
        ia0 ia0Var = ia0.q;
        FirebaseAnalytics d = me4.d((f5d) me4.e(), str, firebaseBundle, context);
        d.a.e(n9e.K(firebaseBundle), null, str, false);
    }

    public static void O(Context context, String str, HashMap hashMap) {
        ia0 ia0Var = ia0.q;
        if (Intrinsics.c(ok3.p().g().b().getDataSharingOptOut(), Boolean.TRUE)) {
            return;
        }
        AppsFlyerLib.getInstance().logEvent(context, str, hashMap);
    }

    public static void P(Context context, FirebaseBundle firebaseBundle, String str) {
        ia0 ia0Var = ia0.q;
        if (Intrinsics.c(ok3.p().g().b().getDataSharingOptOut(), Boolean.TRUE)) {
            return;
        }
        if (!w.q.get()) {
            s38.a().c(new IllegalStateException("FacebookSdk not initialized while attempting logging. event=".concat(str)));
            return;
        }
        Bundle K = n9e.K(firebaseBundle);
        K.remove("_region");
        K.remove("_regionName");
        k kVar = a;
        if (kVar == null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            kVar = new k(applicationContext, 0);
            a = kVar;
        }
        kVar.a.d(K, str);
    }

    public static /* synthetic */ void Q(Context context, String str) {
        P(context, new FirebaseBundle(), str);
    }

    public static void R(int i, int i2, lv lvVar, Context context, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("position", String.valueOf(i2));
        firebaseBundle.putString("location", lvVar.a);
        N(context, firebaseBundle, "event_vote_impression");
    }

    public static void S(int i, lv lvVar, Context context, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("location", lvVar.a);
        N(context, firebaseBundle, "goat_vote_impression");
    }

    public static void T(Context context, String str, int i, int i2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("location", str);
        firebaseBundle.putString("type", "mma_who_deserved_to_win");
        firebaseBundle.putString("position", String.valueOf(i2));
        N(context, firebaseBundle, "post_match_vote_impression");
    }

    public static void U(BaseActivity baseActivity, String str, long j, su suVar) {
        str.getClass();
        suVar.getClass();
        if (j > 100) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            Integer num = suVar.a;
            if (num != null) {
                firebaseBundle.putInt("id", num.intValue());
            }
            Integer num2 = suVar.d;
            if (num2 != null) {
                firebaseBundle.putInt("index", num2.intValue());
            }
            firebaseBundle.putString("screen_name", baseActivity.u());
            Integer num3 = suVar.e;
            if (num3 != null) {
                firebaseBundle.putInt("size", num3.intValue());
            }
            String str2 = suVar.c;
            if (str2 != null) {
                firebaseBundle.putString("status", str2);
            }
            firebaseBundle.putString("tab_name", str);
            firebaseBundle.putLong("time_on_screen", j);
            String str3 = suVar.b;
            if (str3 != null) {
                firebaseBundle.putString("type", str3);
            }
            String str4 = suVar.f;
            if (str4 != null) {
                firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str4);
            }
            String str5 = suVar.g;
            if (str5 != null) {
                firebaseBundle.putString("source", str5);
            }
            N(baseActivity, firebaseBundle, "screen_view_custom");
        }
    }

    public static void V(Context context, String str, o0k o0kVar) {
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        String str2 = o0kVar.a;
        if (str2 != null) {
            firebaseBundle.putString("action", str2);
        }
        Integer num = o0kVar.b;
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putInt("index", o0kVar.c);
        firebaseBundle.putString("type", o0kVar.d);
        N(context, firebaseBundle, str);
    }

    public static void W(Context context, String str, Intent intent) {
        str.getClass();
        intent.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("location", G(intent).a);
        String F = F(intent);
        if (F != null) {
            firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
        }
        N(context, firebaseBundle, "login");
        O(context, "login", null);
    }

    public static void X(Context context, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("group", str);
        firebaseBundle.putString("choice", str2);
        firebaseBundle.putString("type", str3);
        N(context, firebaseBundle, "filter_activity");
    }

    public static void Y(Context context, int i, kv kvVar, int i2, MediaReactionType mediaReactionType, String str, String str2, int i3) {
        if ((i3 & 16) != 0) {
            mediaReactionType = null;
        }
        if ((i3 & 64) != 0) {
            str2 = null;
        }
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("action", kvVar.a);
        firebaseBundle.putString("position", String.valueOf(i2 + 1));
        if (mediaReactionType != null) {
            firebaseBundle.putString("type", mediaReactionType.getType());
        }
        if (str != null) {
            firebaseBundle.putString("category", str);
        }
        if (str2 != null) {
            firebaseBundle.putString("choice", str2);
        }
        N(context, firebaseBundle, "media_post_activity");
    }

    public static void Z(Context context, int i, long j, Integer num, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putLong("time_on_screen", j);
        firebaseBundle.putString("position", String.valueOf(num.intValue() + 1));
        if (str != null) {
            firebaseBundle.putString("location", str);
        }
        firebaseBundle.putString("category", "full_list_card");
        N(context, firebaseBundle, "media_post_impression");
    }

    public static void a(Context context, String str) {
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("group", str);
        firebaseBundle.putString("name", "android_appsflyer_personalized_onboarding");
        N(context, firebaseBundle, "ab_test_group");
    }

    public static void a0(Context context, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("position", str);
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "bet365");
        firebaseBundle.putString("type", "bet_boost");
        N(context, firebaseBundle, "non_monetized_odds_click");
    }

    public static void b(Context context, String str, AdType adType, String str2) {
        ru ruVar = ru.GOOGLE;
        context.getClass();
        adType.getClass();
        str2.getClass();
        if (v0(context)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (str != null) {
                firebaseBundle.putString("selection_id", str);
            }
            firebaseBundle.putString("type", y0(adType));
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, "google");
            firebaseBundle.putString("position", str2);
            N(context, firebaseBundle, "ad_completed");
            M(context, firebaseBundle, "ad_completed");
        }
    }

    public static void b0(Context context, String str, String str2, String str3, Integer num, vmd vmdVar, String str4, String str5) {
        context.getClass();
        str2.getClass();
        vmdVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("category", str);
        }
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        if (str3 != null) {
            firebaseBundle.putString("type", str3);
        }
        firebaseBundle.putString("location", vmdVar.a);
        firebaseBundle.putString("position", str4);
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str2);
        firebaseBundle.putString("group", Intrinsics.c(str5, "app-featured") ? "featured" : "regular");
        N(context, firebaseBundle, "odds_click");
    }

    public static void c(Context context, String str, AdType adType, ru ruVar, String str2) {
        context.getClass();
        adType.getClass();
        ruVar.getClass();
        str2.getClass();
        if (v0(context)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (str != null) {
                firebaseBundle.putString("selection_id", str);
            }
            firebaseBundle.putString("type", y0(adType));
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
            firebaseBundle.putString("position", str2);
            N(context, firebaseBundle, "ad_closed");
            M(context, firebaseBundle, "ad_closed");
        }
    }

    public static void c0(Context context, String str, OddsCountryProvider oddsCountryProvider, String str2, int i, vmd vmdVar, String str3) {
        List list;
        context.getClass();
        str.getClass();
        oddsCountryProvider.getClass();
        str2.getClass();
        vmdVar.getClass();
        List<OddsCountryProvider> subProviders = oddsCountryProvider.getSubProviders();
        if (subProviders != null) {
            ArrayList arrayList = new ArrayList(subProviders);
            arrayList.add(oddsCountryProvider);
            list = arrayList;
        } else {
            list = a.c(oddsCountryProvider);
        }
        Iterator it = list.iterator();
        while (true) {
            String str4 = null;
            if (!it.hasNext()) {
                break;
            }
            OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) it.next();
            double impressionCostDecrypted = oddsCountryProvider2.getImpressionCostDecrypted() / 1000000.0d;
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            firebaseBundle.putString("category", str2);
            firebaseBundle.putInt("id", i);
            firebaseBundle.putString("location", vmdVar.a);
            firebaseBundle.putDouble(U3.i.X, impressionCostDecrypted);
            firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, "EUR");
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, oddsCountryProvider2.getProvider().getSlug());
            firebaseBundle.putString("status", str);
            if (str3 != null) {
                str4 = str3;
            } else if (!oddsCountryProvider2.getBranded()) {
                str4 = "unbranded";
            }
            if (str4 != null) {
                firebaseBundle.putString("type", str4);
            }
            firebaseBundle.putString("group", Intrinsics.c(oddsCountryProvider2.getType(), "app-featured") ? "featured" : "regular");
            N(context, firebaseBundle, "odds_impression_custom");
            P(context, firebaseBundle, "odds_impression_custom");
            HashMap hashMap = new HashMap();
            hashMap.put(AFInAppEventParameterName.CURRENCY, "EUR");
            hashMap.put(AFInAppEventParameterName.REVENUE, Double.valueOf(impressionCostDecrypted));
            O(context, AFInAppEventType.CONTENT_VIEW, hashMap);
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        int i2 = sharedPreferences.getInt("ODDS_LOADED_COUNTER", 0);
        boolean z = sharedPreferences.getBoolean("first_15_odds_impression", false);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        int i3 = i2 + 1;
        edit.putInt("ODDS_LOADED_COUNTER", i3);
        edit.apply();
        if (i3 < 15 || z) {
            return;
        }
        wt3.v(sharedPreferences, "first_15_odds_impression", true);
        N(context, null, "first_15_odds_impression");
        Q(context, "first_15_odds_impression");
        O(context, "first_15_odds_impression", null);
        Unit unit = Unit.a;
    }

    public static void d(ia0 ia0Var, ru ruVar) {
        if (v0(ia0Var)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
            N(ia0Var, firebaseBundle, "ad_init_sdk");
            M(ia0Var, firebaseBundle, "ad_init_sdk");
        }
    }

    public static void d0(Context context, String str, String str2, int i) {
        context.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", str2);
        firebaseBundle.putString("name", str);
        firebaseBundle.putString("position", String.valueOf(i));
        N(context, firebaseBundle, "onboarding_step");
    }

    public static void e(Context context, String str, AdType adType, ru ruVar, String str2, Double d, String str3, Integer num, int i) {
        if ((i & 32) != 0) {
            d = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        context.getClass();
        adType.getClass();
        str2.getClass();
        if (v0(context)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (str != null) {
                firebaseBundle.putString("selection_id", str);
            }
            firebaseBundle.putString("type", y0(adType));
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
            firebaseBundle.putString("position", str2);
            if (d != null) {
                firebaseBundle.putDouble(U3.i.X, d.doubleValue());
                firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, "USD");
            }
            if (str3 != null) {
                firebaseBundle.putString("name", str3);
            }
            if (num != null) {
                firebaseBundle.putInt("index", num.intValue());
            }
            N(context, firebaseBundle, "ad_loaded");
            M(context, firebaseBundle, "ad_loaded");
        }
    }

    public static void e0(Context context, hta htaVar, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("location", str);
        firebaseBundle.putString("type", htaVar.a);
        N(context, firebaseBundle, "open_leaderboard");
    }

    public static void f(Context context, String str, AdType adType, ru ruVar, String str2, Integer num, int i) {
        if ((i & 64) != 0) {
            num = null;
        }
        context.getClass();
        adType.getClass();
        str2.getClass();
        if (v0(context)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (str != null) {
                firebaseBundle.putString("selection_id", str);
            }
            firebaseBundle.putString("type", y0(adType));
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
            firebaseBundle.putString("position", str2);
            if (num != null) {
                firebaseBundle.putInt("index", num.intValue());
            }
            N(context, firebaseBundle, "ad_requested");
            M(context, firebaseBundle, "ad_requested");
        }
    }

    public static void f0(Context context, UniqueTournament uniqueTournament, Intent intent) {
        context.getClass();
        intent.getClass();
        Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
        if (valueOf != null) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            String F = F(intent);
            if (F != null) {
                firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
            }
            h(firebaseBundle, intent);
            firebaseBundle.putInt("id", valueOf.intValue());
            firebaseBundle.putString("location", G(intent).a);
            N(context, firebaseBundle, "open_league");
        }
    }

    public static void g(FragmentActivity fragmentActivity, String str, AdType adType, ru ruVar, String str2) {
        adType.getClass();
        str2.getClass();
        if (v0(fragmentActivity)) {
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            if (str != null) {
                firebaseBundle.putString("selection_id", str);
            }
            firebaseBundle.putString("type", y0(adType));
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
            firebaseBundle.putString("position", str2);
            N(fragmentActivity, firebaseBundle, "ad_show");
            M(fragmentActivity, firebaseBundle, "ad_show");
        }
    }

    public static void g0(Context context, yu yuVar, Integer num, String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("category", yuVar.a);
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", str);
        if (str3 != null) {
            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str3);
        }
        firebaseBundle.putString("type", str2);
        N(context, firebaseBundle, "open_media");
    }

    public static void h(FirebaseBundle firebaseBundle, Intent intent) {
        String stringExtra;
        if (G(intent) == hv.NOTIFICATION || (stringExtra = intent.getStringExtra("screen_name")) == null) {
            return;
        }
        firebaseBundle.putString("screen_name", stringExtra);
        String stringExtra2 = intent.getStringExtra("tab_name");
        if (stringExtra2 == null) {
            stringExtra2 = "NoTab";
        }
        firebaseBundle.putString("tab_name", stringExtra2);
    }

    public static void h0(Context context, int i, Intent intent) {
        context.getClass();
        intent.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        String F = F(intent);
        if (F != null) {
            firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
        }
        h(firebaseBundle, intent);
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("location", G(intent).a);
        N(context, firebaseBundle, "open_team");
    }

    public static void i(Context context, String str, AdType adType, ru ruVar, String str2, String str3, Integer num, int i) {
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        context.getClass();
        adType.getClass();
        ruVar.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("selection_id", str);
        }
        firebaseBundle.putString("type", y0(adType));
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
        firebaseBundle.putString("position", str2);
        if (str3 != null) {
            firebaseBundle.putString("name", str3);
        }
        if (num != null) {
            firebaseBundle.putInt("index", num.intValue());
        }
        N(context, firebaseBundle, "ads_click_custom");
        M(context, firebaseBundle, "ads_click_custom");
    }

    public static void i0(Context context, UniqueStage uniqueStage, Intent intent) {
        context.getClass();
        intent.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        String F = F(intent);
        if (F != null) {
            firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
        }
        h(firebaseBundle, intent);
        firebaseBundle.putInt("id", uniqueStage.getId());
        firebaseBundle.putString("location", G(intent).a);
        N(context, firebaseBundle, "open_unique_stage");
    }

    public static void j(Context context, String str, AdType adType, ru ruVar, String str2, int i, String str3, qu quVar, String str4, Integer num, int i2) {
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            num = null;
        }
        context.getClass();
        adType.getClass();
        ruVar.getClass();
        str2.getClass();
        str3.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("selection_id", str);
        }
        firebaseBundle.putString("type", y0(adType));
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
        firebaseBundle.putString("position", str2);
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString(PglCryptUtils.KEY_MESSAGE, str3);
        firebaseBundle.putString("category", quVar.a);
        if (str4 != null) {
            firebaseBundle.putString("name", str4);
        }
        if (num != null) {
            firebaseBundle.putInt("index", num.intValue());
        }
        N(context, firebaseBundle, "ads_error");
        M(context, firebaseBundle, "ads_error");
    }

    public static void j0(Context context, bv bvVar, av avVar, dv dvVar, cv cvVar, Integer num) {
        context.getClass();
        bvVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", avVar.a);
        firebaseBundle.putString("source", dvVar.a);
        firebaseBundle.putString("type", bvVar.a);
        if (cvVar != null) {
            firebaseBundle.putString("choice", cvVar.a);
        }
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        N(context, firebaseBundle, "popup_click");
    }

    public static void k(Context context, String str, AdType adType, ru ruVar, String str2, String str3, Long l, Integer num) {
        context.getClass();
        adType.getClass();
        ruVar.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("selection_id", str);
        }
        if (l != null) {
            firebaseBundle.putLong("id", l.longValue());
        }
        firebaseBundle.putString("type", y0(adType));
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
        firebaseBundle.putString("position", str2);
        if (str3 != null) {
            firebaseBundle.putString("name", str3);
        }
        if (num != null) {
            firebaseBundle.putInt("index", num.intValue());
        }
        N(context, firebaseBundle, "ads_impression_custom");
        P(context, firebaseBundle, "ads_impression_custom");
        M(context, firebaseBundle, "ads_impression_custom");
    }

    public static /* synthetic */ void k0(Context context, bv bvVar, av avVar, dv dvVar, cv cvVar, Integer num, int i) {
        if ((i & 16) != 0) {
            cvVar = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        j0(context, bvVar, avVar, dvVar, cvVar, num);
    }

    public static /* synthetic */ void l(Context context, String str, AdType adType, ru ruVar, String str2, String str3, Long l, int i) {
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        k(context, str, adType, ruVar, str2, str3, l, null);
    }

    public static void l0(Context context, dv dvVar, bv bvVar, Integer num) {
        context.getClass();
        bvVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", bvVar.a);
        firebaseBundle.putString("source", dvVar.a);
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        N(context, firebaseBundle, "popup_impression");
    }

    public static void m(Context context, String str, AdType adType, ru ruVar, String str2, AdValue adValue, Integer num) {
        context.getClass();
        adType.getClass();
        ruVar.getClass();
        str2.getClass();
        adValue.getClass();
        double valueMicros = adValue.getValueMicros() / 1000000.0d;
        if (valueMicros > 1.0d) {
            valueMicros /= 1000000.0d;
            if (valueMicros > 1.0d) {
                valueMicros = 0.0d;
            }
        }
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("selection_id", str);
        }
        firebaseBundle.putString("type", y0(adType));
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
        firebaseBundle.putString("position", str2);
        firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, adValue.getCurrencyCode());
        firebaseBundle.putDouble(U3.i.X, valueMicros);
        if (num != null) {
            firebaseBundle.putInt("index", num.intValue());
        }
        M(context, firebaseBundle, "ads_value_custom");
        N(context, firebaseBundle, "ads_value_custom");
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.CURRENCY, adValue.getCurrencyCode());
        hashMap.put(AFInAppEventParameterName.REVENUE, Double.valueOf(valueMicros));
        O(context, AFInAppEventType.AD_VIEW, hashMap);
    }

    public static void m0(Context context, String str, String str2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("location", str2);
        N(context, firebaseBundle, "profile_action");
    }

    public static void n(Context context, String str, String str2, Integer num, Integer num2) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", str);
        firebaseBundle.putString("name", str2);
        if (num == null) {
            num = num2;
        }
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        N(context, firebaseBundle, "betting_tips_activity");
    }

    public static void n0(Context context, ev evVar) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("location", evVar.a);
        N(context, firebaseBundle, "user_profile_click");
    }

    public static void o(Context context, Integer num, BrandLocation brandLocation, String str, BrandType brandType) {
        context.getClass();
        brandLocation.getClass();
        str.getClass();
        brandType.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", brandLocation.getValue());
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str);
        firebaseBundle.putString("type", brandType.getValue());
        N(context, firebaseBundle, "brand_click");
    }

    public static void o0(Context context, fv fvVar, String str, String str2, Integer num) {
        context.getClass();
        fvVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", fvVar.a);
        firebaseBundle.putString("name", str);
        firebaseBundle.putString("type", str2);
        N(context, firebaseBundle, "promotion_click");
    }

    public static void p(Context context, Integer num, BrandLocation brandLocation, String str, MatchOfTheWeekCtaType matchOfTheWeekCtaType) {
        context.getClass();
        brandLocation.getClass();
        str.getClass();
        matchOfTheWeekCtaType.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", num.intValue());
        firebaseBundle.putString("location", brandLocation.getValue());
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str);
        firebaseBundle.putString("type", matchOfTheWeekCtaType.getValue());
        N(context, firebaseBundle, "brand_click");
    }

    public static void p0(Context context, fv fvVar, String str, String str2, Integer num) {
        context.getClass();
        fvVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", fvVar.a);
        firebaseBundle.putString("name", str);
        firebaseBundle.putString("type", str2);
        N(context, firebaseBundle, "promotion_impression");
    }

    public static void q(Context context, Integer num, BrandLocation brandLocation, String str, BrandType brandType) {
        context.getClass();
        brandLocation.getClass();
        str.getClass();
        brandType.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", brandLocation.getValue());
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str);
        firebaseBundle.putString("type", brandType.getValue());
        N(context, firebaseBundle, "brand_impression");
    }

    public static void q0(Context context, int i, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("category", String.valueOf(i));
        if (str != null) {
            firebaseBundle.putString(PglCryptUtils.KEY_MESSAGE, str);
        }
        N(context, firebaseBundle, "segmentation_error");
    }

    public static void r(Context context, String str, Integer num, String str2, int i, String str3, String str4, Integer num2) {
        context.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("action", str);
        }
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", str2);
        firebaseBundle.putString("position", String.valueOf(i));
        if (str3 != null) {
            firebaseBundle.putString("reason", str3);
        }
        if (str4 != null) {
            firebaseBundle.putString("status", str4);
        }
        if (num2 != null) {
            firebaseBundle.putInt("tile_id", num2.intValue());
        }
        N(context, firebaseBundle, "buzzer_click");
    }

    public static void r0(Context context, iv ivVar, String str, String str2) {
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", ivVar.a);
        firebaseBundle.putString("category", str2);
        firebaseBundle.putString("position", str);
        N(context, firebaseBundle, "season_card_activity");
    }

    public static void s(Context context, String str, Integer num, String str2, int i, String str3, String str4, Integer num2) {
        context.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        if (str != null) {
            firebaseBundle.putString("action", str);
        }
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        firebaseBundle.putString("location", str2);
        firebaseBundle.putString("position", String.valueOf(i));
        if (str3 != null) {
            firebaseBundle.putString("reason", str3);
        }
        if (str4 != null) {
            firebaseBundle.putString("status", str4);
        }
        if (num2 != null) {
            firebaseBundle.putInt("tile_id", num2.intValue());
        }
        N(context, firebaseBundle, "buzzer_tile_impression");
    }

    public static void s0(StartActivity startActivity, gv gvVar) {
        String str = gvVar.a;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = startActivity.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean(str, false)) {
            return;
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = startActivity.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences2, str, true);
        Unit unit = Unit.a;
        i.apply();
        N(startActivity, null, str);
    }

    public static void t(Context context, String str, String str2, ChatInterface chatInterface) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", str);
        firebaseBundle.putString("name", str2);
        firebaseBundle.putString("type", u(chatInterface));
        N(context, firebaseBundle, "chat_message_activity");
    }

    public static void t0(Context context, String str, String str2, int i, String str3) {
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("category", str);
        firebaseBundle.putInt("id", i);
        if (str2 != null) {
            firebaseBundle.putString("status", str2);
        }
        if (str3 != null) {
            firebaseBundle.putString("type", str3);
        }
        N(context, firebaseBundle, "share_content");
    }

    public static String u(ChatInterface chatInterface) {
        return chatInterface instanceof Event ? "event" : chatInterface instanceof Stage ? "stage" : chatInterface instanceof ChatCountry ? "country" : chatInterface instanceof Tournament ? "tournament" : chatInterface instanceof TournamentSeasonPair ? "unique_tournament" : chatInterface instanceof TeamOfTheRoundChatInterface ? "featured_tournament" : "unknown";
    }

    public static void u0(Context context, Integer num, String str) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("type", str);
        if (num != null) {
            firebaseBundle.putInt("id", num.intValue());
        }
        N(context, firebaseBundle, "share");
    }

    public static void v(Context context, int i, String str) {
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("status", str);
        N(context, firebaseBundle, "crowdsourcing_submit");
    }

    public static boolean v0(Context context) {
        context.getClass();
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Calendar calendar = ke0.a;
        boolean z = Math.abs(ke0.d(context).hashCode()) % 10 == 0 || ((Boolean) tz4.d.b.invoke(context)).booleanValue();
        b = Boolean.valueOf(z);
        return z;
    }

    public static void w(Context context, int i, String str, uu uuVar) {
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("status", str);
        firebaseBundle.putString("location", uuVar.a);
        N(context, firebaseBundle, "crowdsourcing_suggest_changes");
    }

    public static void w0(Context context, int i, vv vvVar) {
        context.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("type", vvVar.a);
        N(context, firebaseBundle, "sofa_search");
    }

    public static void x(Context context, String str, String str2, int i, String str3) {
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("category", str);
        if (str2 != null) {
            firebaseBundle.putString("status", str2);
        }
        if (str3 != null) {
            firebaseBundle.putString("type", str3);
        }
        N(context, firebaseBundle, "download_content");
    }

    public static void x0(Context context, String str, String str2) {
        vmd vmdVar = vmd.EVENT_DETAILS;
        context.getClass();
        str.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("location", "fantasy");
        firebaseBundle.putString("position", str2);
        firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, str);
        N(context, firebaseBundle, "special_odds_click");
    }

    public static void y(Context context, vu vuVar, xu xuVar, int i, wu wuVar) {
        context.getClass();
        wuVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", vuVar.a);
        firebaseBundle.putString("type", xuVar.a);
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("location", wuVar.a);
        N(context, firebaseBundle, "entity_interaction");
    }

    public static String y0(AdType adType) {
        if (adType instanceof AdType.Preroll) {
            return "preroll";
        }
        if (adType instanceof AdType.Banner) {
            return "banner";
        }
        if (adType instanceof AdType.Interstitial) {
            return "interstitial";
        }
        if (adType instanceof AdType.RewardedInterstitial) {
            return "rewarded";
        }
        if (adType instanceof AdType.Native) {
            return IronSourceConstants.EVENTS_NATIVE;
        }
        if (adType instanceof AdType.Unknown) {
            return "unknown";
        }
        zzl.b();
        return null;
    }

    public static void z(Context context, int i, lv lvVar, y3f y3fVar, int i2) {
        context.getClass();
        y3fVar.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", i);
        firebaseBundle.putString("location", lvVar.a);
        firebaseBundle.putString("type", y3fVar.b);
        firebaseBundle.putString("position", String.valueOf(i2));
        N(context, firebaseBundle, "event_vote_edit");
    }

    public static void z0(Context context, kv kvVar, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putString("action", kvVar.a);
        firebaseBundle.putString("location", str2);
        firebaseBundle.putString("type", str);
        N(context, firebaseBundle, "user_interaction");
    }
}
