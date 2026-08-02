package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.sofascore.model.Colors;
import com.sofascore.model.WearMessagingAction;
import com.sofascore.model.mvvm.model.WeatherConditionType;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.wc26.WorldCupCountry;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g0l implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent a;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _init_$_anonymous_3;
        KSerializer _init_$_anonymous_4;
        KSerializer _init_$_anonymous_5;
        KSerializer _init_$_anonymous_6;
        WebViewEvent sendActivityDestroyed$lambda$17;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _init_$_anonymous_7;
        KSerializer _init_$_anonymous_8;
        Object u2gVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                _init_$_anonymous_ = WearMessagingAction._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                _childSerializers$_anonymous_ = WearMessagingAction.EventData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _init_$_anonymous_2 = WearMessagingAction.OpenApp._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 3:
                _init_$_anonymous_3 = WearMessagingAction.OpenAppConfirmation._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 4:
                _init_$_anonymous_4 = WearMessagingAction.OpenEventConfirmation._init_$_anonymous_();
                return _init_$_anonymous_4;
            case 5:
                _init_$_anonymous_5 = WearMessagingAction.RefreshData._init_$_anonymous_();
                return _init_$_anonymous_5;
            case 6:
                _init_$_anonymous_6 = WeatherConditionType._init_$_anonymous_();
                return _init_$_anonymous_6;
            case 7:
                sendActivityDestroyed$lambda$17 = WebViewAdPlayer.sendActivityDestroyed$lambda$17();
                return sendActivityDestroyed$lambda$17;
            case 8:
                _childSerializers$_anonymous_2 = WeeklyChallengeAssetsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 9:
                _childSerializers$_anonymous_3 = WeeklyChallengeLeaderboardResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                _init_$_anonymous_7 = WhoWillWinOptions._init_$_anonymous_();
                return _init_$_anonymous_7;
            case 14:
                return new xg0(v6l.Companion.serializer(), 0);
            case 15:
                _init_$_anonymous_8 = WillBothTeamsScoreOptions._init_$_anonymous_();
                return _init_$_anonymous_8;
            case 16:
                return new Handler(Looper.getMainLooper());
            case 17:
                try {
                    ClassLoader classLoader = v8l.class.getClassLoader();
                    apg apgVar = classLoader != null ? new apg(classLoader, new hpo(classLoader)) : null;
                    if (apgVar == null || (a = apgVar.a()) == null) {
                        return null;
                    }
                    hpo hpoVar = new hpo(classLoader);
                    int a2 = bl6.a();
                    return a2 >= 9 ? new al6(a, hpoVar) : a2 >= 6 ? new zk6(a, hpoVar) : a2 >= 2 ? new yk6(a, hpoVar) : a2 == 1 ? new xk6(a, hpoVar) : new vk6();
                } catch (Throwable unused) {
                    return null;
                }
            case 18:
                return new tnf(r7);
            case 19:
                long w = yaa.w() + 10;
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Float valueOf2 = Float.valueOf(0.45f);
                Float valueOf3 = Float.valueOf(0.7f);
                Float valueOf4 = Float.valueOf(0.82f);
                Float valueOf5 = Float.valueOf(0.9f);
                Float valueOf6 = Float.valueOf(0.95f);
                Float valueOf7 = Float.valueOf(1.0f);
                ejl ejlVar = new ejl(l6g.K(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7), l6g.K(valueOf7, valueOf2, valueOf, valueOf, valueOf, valueOf));
                r7 = (1 & 96) == 0 ? 16 : 0;
                String str = (96 & 2) != 0 ? "" : "FIFA World Cup 2026";
                if ((96 & 4) != 0) {
                    w = 0;
                }
                String str2 = (96 & 8) != 0 ? "" : "11 Jun";
                String str3 = (96 & 16) != 0 ? "" : "19 Jul";
                if ((96 & 128) != 0) {
                    rlh rlhVar = rlh.b;
                    ejlVar = new ejl(rlhVar, rlhVar);
                }
                return new iel(r7, str, w, str2, str3, "", "", ejlVar);
            case 20:
                vel velVar = vel.a;
                List<WorldCupCountry> list = (List) vel.g.getValue();
                int c = sub.c(k13.r(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(c >= 16 ? c : 16);
                for (WorldCupCountry worldCupCountry : list) {
                    linkedHashMap.put(worldCupCountry.getAlpha2(), Integer.valueOf(worldCupCountry.getTeamId()));
                }
                return linkedHashMap;
            case 21:
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                String g = f.g("world_cup_countries");
                if (g.length() != 0) {
                    try {
                        p2g p2gVar = w2g.b;
                        yeaVar.getClass();
                        u2gVar = yeaVar.b(l98.W(new xg0(WorldCupCountry.INSTANCE.serializer(), 0)), g);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    Throwable a3 = w2g.a(u2gVar);
                    if (a3 != null) {
                        s38.a().c(a3);
                    }
                    if (!(u2gVar instanceof u2g)) {
                        obj = u2gVar;
                    }
                }
                List list2 = (List) obj;
                return list2 == null ? km5.a : list2;
            case 22:
                vel velVar2 = vel.a;
                List<WorldCupCountry> list3 = (List) vel.g.getValue();
                int c2 = sub.c(k13.r(list3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                for (WorldCupCountry worldCupCountry2 : list3) {
                    String alpha2 = worldCupCountry2.getAlpha2();
                    zdl zdlVar = (zdl) vel.c.get(worldCupCountry2.getColor());
                    if (zdlVar == null) {
                        zdlVar = vel.b;
                    }
                    linkedHashMap2.put(alpha2, zdlVar);
                }
                return linkedHashMap2;
            case 23:
                vel velVar3 = vel.a;
                List<WorldCupCountry> list4 = (List) vel.g.getValue();
                int c3 = sub.c(k13.r(list4, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(c3 >= 16 ? c3 : 16);
                for (WorldCupCountry worldCupCountry3 : list4) {
                    Integer valueOf8 = Integer.valueOf(worldCupCountry3.getTeamId());
                    zdl zdlVar2 = (zdl) vel.c.get(worldCupCountry3.getColor());
                    if (zdlVar2 == null) {
                        zdlVar2 = vel.b;
                    }
                    linkedHashMap3.put(valueOf8, zdlVar2);
                }
                return linkedHashMap3;
            case 24:
                return new and(new old(new yld(1406, new Colors("#017b5b", null, null), "bet365-italy"), "https://www.bet365.com/hub/aff/sofascore?affiliate=365_01301314", true, Double.valueOf(0.0d), null, "app-odds", null), new fgf(258034349, (r9k) new m9k("Full time"), 1, false, l6g.W(b.j(new dld(false, new m9k("1"), 0, "1/1", "https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs=189848974-634006072~1/1~10&bet=1", null), new dld(false, new m9k("X"), 1, "11/5", "https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs=189848974-634006074~11/5~10&bet=1", null), new dld(false, new m9k("2"), -1, "23/10", "https://www.bet365.com/dl/sportsbookredirect/?affiliate=365_842809&bs=189848974-634006076~23/10~10&bet=1", null))), ProviderOdds.Type.STANDARD, (String) null, 128));
            case 25:
                wn1 wn1Var = (wn1) wn1.w.getValue();
                m9k m9kVar = new m9k("Group A");
                m9k m9kVar2 = new m9k("Final");
                m9k m9kVar3 = new m9k("11 Jun");
                joa joaVar = xel.i;
                return new xel(wn1Var, m9kVar, m9kVar2, "Mexico City", m9kVar3, false, false, d2a.v());
            case 26:
                wn1 wn1Var2 = (wn1) wn1.v.getValue();
                m9k m9kVar4 = new m9k("Group A");
                m9k m9kVar5 = new m9k("");
                m9k m9kVar6 = new m9k("11 Jun");
                joa joaVar2 = xel.i;
                return new xel(wn1Var2, m9kVar4, m9kVar5, "Mexico City", m9kVar6, false, false, d2a.v());
            case 27:
                wn1 wn1Var3 = (wn1) wn1.x.getValue();
                m9k m9kVar7 = new m9k("Group D");
                m9k m9kVar8 = new m9k("");
                m9k m9kVar9 = new m9k("11 Jun");
                joa joaVar3 = xel.i;
                return new xel(wn1Var3, m9kVar7, m9kVar8, "San Francisco", m9kVar9, false, false, d2a.v());
            case 28:
                wn1 wn1Var4 = (wn1) wn1.y.getValue();
                m9k m9kVar10 = new m9k("Group D");
                m9k m9kVar11 = new m9k("");
                m9k m9kVar12 = new m9k("11 Jun");
                joa joaVar4 = xel.i;
                return new xel(wn1Var4, m9kVar10, m9kVar11, "San Francisco", m9kVar12, false, false, d2a.v());
            default:
                wn1 wn1Var5 = (wn1) wn1.w.getValue();
                m9k m9kVar13 = new m9k("Group A");
                m9k m9kVar14 = new m9k("");
                m9k m9kVar15 = new m9k("11 Jun");
                joa joaVar5 = xel.i;
                return l6g.K(new xel(wn1Var5, m9kVar13, m9kVar14, "Mexico City", m9kVar15, false, false, d2a.v()), new xel(wn1.a((wn1) wn1.v.getValue(), 2), new m9k("Group A"), new m9k(""), "Mexico City", null, false, false, d2a.v()));
        }
    }

    public /* synthetic */ g0l(int i) {
        this.a = i;
    }
}
