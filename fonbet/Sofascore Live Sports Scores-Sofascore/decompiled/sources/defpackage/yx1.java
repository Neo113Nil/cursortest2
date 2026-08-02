package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.blaze.blazesdk.features.videos.inline.BlazeVideosInlinePlayer;
import com.blaze.blazesdk.features.videos.models.args.b;
import com.blaze.blazesdk.players.models.B;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yx1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yx1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0246  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit createPlayerViewAndAddToWrapper$lambda$1$lambda$0;
        Object value;
        n4 z63Var;
        r9k r9kVar;
        r9k m9kVar;
        String str;
        String alpha2;
        String n;
        int i = this.a;
        int i2 = 0;
        int i3 = 17;
        String str2 = null;
        boolean z = false;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                createPlayerViewAndAddToWrapper$lambda$1$lambda$0 = BlazeVideosInlinePlayer.createPlayerViewAndAddToWrapper$lambda$1$lambda$0((rpl) obj7, (b) obj6, (BlazeVideosInlinePlayer) obj5, (Context) obj4, (u6b) obj3, (ttk) obj2, (B) obj);
                break;
            case 1:
                int i4 = 0;
                qhe[] qheVarArr = (qhe[]) obj7;
                List list = (List) obj6;
                m1c m1cVar = (m1c) obj5;
                dsf dsfVar = (dsf) obj4;
                dsf dsfVar2 = (dsf) obj3;
                g12 g12Var = (g12) obj2;
                phe pheVar = (phe) obj;
                int length = qheVarArr.length;
                while (i2 < length) {
                    qhe qheVar = qheVarArr[i2];
                    qheVar.getClass();
                    e12.d(pheVar, qheVar, (g1c) list.get(i4), m1cVar.getLayoutDirection(), dsfVar.a, dsfVar2.a, g12Var.a);
                    i2++;
                    i4++;
                }
                break;
            case 2:
                wb7 wb7Var = (wb7) obj7;
                t97 t97Var = (t97) obj6;
                FantasyOnboardingActivity fantasyOnboardingActivity = (FantasyOnboardingActivity) obj5;
                e1d e1dVar = (e1d) obj4;
                Function1 function1 = (Function1) obj3;
                et8 et8Var = (et8) obj2;
                c97 c97Var = (c97) obj;
                c97Var.getClass();
                if (!c97Var.equals(b97.a)) {
                    if (!(c97Var instanceof x87)) {
                        if (!c97Var.equals(y87.a)) {
                            if (!c97Var.equals(v87.a)) {
                                if (!c97Var.equals(w87.a)) {
                                    if (!c97Var.equals(a97.a)) {
                                        if (!(c97Var instanceof z87)) {
                                            zzl.b();
                                            break;
                                        } else {
                                            ev6 ev6Var = ((pb7) e1dVar.getValue()).f;
                                            mj7 mj7Var = ((pb7) e1dVar.getValue()).g;
                                            if (ev6Var != null && mj7Var != null) {
                                                oz6 oz6Var = ((z87) c97Var).a;
                                                if (oz6Var instanceof FantasyRoundPlayerUiModel) {
                                                    t97Var.k(new f97((FantasyRoundPlayerUiModel) oz6Var));
                                                } else {
                                                    wb7Var.v(oz6Var);
                                                    et8Var.invoke(Integer.valueOf(ev6Var.c), Integer.valueOf(mj7Var.a), oz6Var.getA().b, null);
                                                }
                                            }
                                        }
                                    } else {
                                        ia0 ia0Var = ia0.q;
                                        if (ok3.p().e().getIsLoggedIn()) {
                                            ev6 ev6Var2 = ((pb7) wb7Var.k.a.getValue()).f;
                                            if (ev6Var2 != null) {
                                                function1.invoke(Integer.valueOf(ev6Var2.c));
                                            }
                                        } else {
                                            t97Var.k(g97.a);
                                        }
                                    }
                                } else {
                                    nv.A(fantasyOnboardingActivity, "reset", null);
                                    wb7Var.t();
                                }
                            } else {
                                nv.A(fantasyOnboardingActivity, "auto_select", ((pb7) e1dVar.getValue()).k > 0 ? "partiel" : "empty");
                                fdi fdiVar = wb7Var.j;
                                Integer num = ((pb7) fdiVar.getValue()).e;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    do {
                                        value = fdiVar.getValue();
                                    } while (!fdiVar.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, true, null, false, null, false, null, null, 8355839)));
                                    xw3.L(un0.z(wb7Var), null, null, new ok0((q8) wb7Var, intValue, (rq3) (z ? 1 : 0), 22), 3);
                                }
                            }
                        } else {
                            t97Var.k(e97.a);
                        }
                    } else {
                        x87 x87Var = (x87) c97Var;
                        t97Var.k(new d97(new FantasySectionedInfoType.CreateSquadInfo(x87Var.a, x87Var.b)));
                    }
                } else {
                    Integer num2 = ((pb7) wb7Var.j.getValue()).e;
                    if (num2 != null) {
                        wb7Var.n(num2.intValue());
                    }
                }
                break;
            case 3:
                axb axbVar = (axb) obj6;
                mwb N = vha.N(axbVar.i(), (Event) obj7);
                String string = axbVar.i().getString(R.string.match_of_the_week_cta_pick);
                string.getClass();
                break;
            case 4:
                ComponentActivity componentActivity = (ComponentActivity) obj7;
                Function2 function2 = (Function2) obj6;
                rgh rghVar = (rgh) obj5;
                ku3 ku3Var = (ku3) obj4;
                dfh dfhVar = (dfh) obj3;
                Function0 function0 = (Function0) obj2;
                ((o55) obj).getClass();
                ArrayList arrayList = new ArrayList();
                ad2 ad2Var = qv5.a;
                e6b e6bVar = e6b.a;
                LinkedHashMap linkedHashMap = qv5.b;
                fuf fufVar = duf.a;
                KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(m42.class);
                Object obj8 = linkedHashMap.get(orCreateKotlinClass);
                Object obj9 = obj8;
                if (obj8 == null) {
                    aeh b = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass, b);
                    obj9 = b;
                }
                arrayList.add(xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new urd(componentActivity, (b1d) obj9, (rq3) null, function2, rghVar, componentActivity, 1), 3));
                KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(k42.class);
                Object obj10 = linkedHashMap.get(orCreateKotlinClass2);
                Object obj11 = obj10;
                if (obj10 == null) {
                    aeh b2 = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass2, b2);
                    obj11 = b2;
                }
                arrayList.add(xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new urd(componentActivity, (b1d) obj11, (rq3) null, function2, rghVar, componentActivity, 3), 3));
                KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(l42.class);
                Object obj12 = linkedHashMap.get(orCreateKotlinClass3);
                Object obj13 = obj12;
                if (obj12 == null) {
                    aeh b3 = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass3, b3);
                    obj13 = b3;
                }
                arrayList.add(xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new urd(componentActivity, (b1d) obj13, (rq3) null, function2, rghVar, componentActivity, 5), 3));
                KClass orCreateKotlinClass4 = fufVar.getOrCreateKotlinClass(g52.class);
                Object obj14 = linkedHashMap.get(orCreateKotlinClass4);
                Object obj15 = obj14;
                if (obj14 == null) {
                    aeh b4 = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass4, b4);
                    obj15 = b4;
                }
                arrayList.add(xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new urd(componentActivity, (b1d) obj15, (rq3) null, function2, rghVar, componentActivity, 7), 3));
                KClass orCreateKotlinClass5 = fufVar.getOrCreateKotlinClass(h52.class);
                Object obj16 = linkedHashMap.get(orCreateKotlinClass5);
                Object obj17 = obj16;
                if (obj16 == null) {
                    aeh b5 = beh.b(0, 0, null, 7);
                    linkedHashMap.put(orCreateKotlinClass5, b5);
                    obj17 = b5;
                }
                arrayList.add(xw3.L(wca.x(componentActivity.getLifecycle()), null, null, new vrd(componentActivity, (b1d) obj17, (rq3) null, rghVar, componentActivity, ku3Var, dfhVar, function0), 3));
                break;
            case 5:
                pyg pygVar = (pyg) obj6;
                e93 e93Var = (e93) obj5;
                m93 m93Var = (m93) obj4;
                ComparisonSeasonInfo comparisonSeasonInfo = (ComparisonSeasonInfo) obj3;
                y83 y83Var = (y83) obj2;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                qo2 qo2Var = ((x63) obj7).a;
                Context i5 = pygVar.i();
                String str3 = pygVar.m;
                String str4 = qyg.a;
                if (!(qo2Var instanceof a73)) {
                    if (!(qo2Var instanceof b73)) {
                        zzl.b();
                        break;
                    } else {
                        String str5 = (String) qo2Var.b;
                        int i6 = qo2Var.a;
                        Team team = ((b73) qo2Var).c;
                        String A = tba.A(i5, team);
                        String str6 = A == null ? str5 : A;
                        Country country = team.getCountry();
                        String alpha22 = wyh.e(str3) ? country != null ? country.getAlpha2() : null : null;
                        String R = pco.R(qo2Var.a);
                        str5.getClass();
                        str6.getClass();
                        z63Var = new z63(i6, str5, str6, alpha22, R);
                    }
                } else {
                    String str7 = (String) qo2Var.b;
                    Player player = ((a73) qo2Var).c;
                    Team team2 = player.getTeam();
                    if (team2 == null || Intrinsics.c(team2.getName(), "No team")) {
                        team2 = null;
                    }
                    int i7 = qo2Var.a;
                    String C = tba.C(player);
                    String str8 = C == null ? str7 : C;
                    Country country2 = player.getCountry();
                    String alpha23 = country2 != null ? country2.getAlpha2() : null;
                    if (team2 != null) {
                        n = pco.R(team2.getId());
                    } else {
                        Country country3 = player.getCountry();
                        if (country3 == null || (alpha2 = country3.getAlpha2()) == null) {
                            str = null;
                            str7.getClass();
                            str8.getClass();
                            z63Var = new y63(i7, str7, str8, alpha23, str);
                        } else {
                            n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                        }
                    }
                    str = n;
                    str7.getClass();
                    str8.getClass();
                    z63Var = new y63(i7, str7, str8, alpha23, str);
                }
                q9k B = pygVar.B(e93Var);
                int i8 = i73Var.c;
                Integer num3 = i73Var.d;
                Integer num4 = m93Var != null ? m93Var.a : null;
                boolean z2 = comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo;
                if (!z2) {
                    if (y83Var == null) {
                        r9kVar = null;
                        gv9 t = pygVar.t(comparisonSeasonInfo, y83Var, m93Var == null ? m93Var.c : null);
                        if (!z2) {
                            str2 = ((ComparisonSeasonInfo.TennisYearInfo) comparisonSeasonInfo).a;
                        } else if (!(comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                            if (comparisonSeasonInfo != null) {
                                zzl.b();
                                break;
                            }
                        } else {
                            str2 = ((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo).c;
                        }
                        break;
                    } else {
                        m9kVar = new m9k(y83Var.d);
                    }
                } else {
                    m9kVar = new q9k(R.string.all);
                }
                r9kVar = m9kVar;
                gv9 t2 = pygVar.t(comparisonSeasonInfo, y83Var, m93Var == null ? m93Var.c : null);
                if (!z2) {
                }
                break;
            case 6:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var = ((tzj) obj7).a;
                esaVar.a(gv9Var.size(), new wsd(16, new crj(9), gv9Var), new wsd(i3, new crj(10), gv9Var), new tc3(802480018, new qzj(gv9Var, (Function1) obj6, (h4d) obj5, (wla) obj4, (Function2) obj3, (cdi) obj2), true));
                break;
            default:
                String str9 = (String) obj7;
                String str10 = (String) obj6;
                String str11 = (String) obj5;
                String str12 = (String) obj4;
                String str13 = (String) obj3;
                String str14 = (String) obj2;
                t89 t89Var = (t89) obj;
                t89Var.getClass();
                StringBuilder sb = new StringBuilder();
                if (str9 != null) {
                    sb.append("AppBundle/" + str9 + ';');
                }
                if (str10 != null) {
                    sb.append("AppVersion/" + str10 + ';');
                }
                if (str11 != null) {
                    sb.append("AppKey/" + str11 + ';');
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                if (str12 != null) {
                    sb3.append("SdkVersion/" + str12 + ';');
                }
                if (str13 != null) {
                    sb3.append("Mediator/" + str13 + ';');
                }
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder("OS/Android;");
                if (str14 != null) {
                    sb5.append("osv/" + str14 + ';');
                }
                String sb6 = sb5.toString();
                t89Var.i("X-Moloco-App-Info", sb2);
                t89Var.i("X-Moloco-Device-Info", sb6);
                t89Var.i("X-Moloco-SDK-Info", sb4);
                break;
        }
        return Unit.a;
    }
}
