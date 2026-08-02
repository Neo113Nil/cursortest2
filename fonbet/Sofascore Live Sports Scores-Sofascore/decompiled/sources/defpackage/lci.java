package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.foundation.controller.a;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.network.response.CurrentlyRelevantEvent;
import com.sofascore.model.network.response.CurrentlyRelevantEventsResponse;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llci;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class lci extends q8 {
    public final bfk e;
    public final s96 f;
    public final gzh g;
    public final cg4 h;
    public final zzc i;
    public final zzc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lci(bfk bfkVar, s96 s96Var, gzh gzhVar, SharedPreferences sharedPreferences, cg4 cg4Var, Application application) {
        super(application);
        bfkVar.getClass();
        s96Var.getClass();
        gzhVar.getClass();
        sharedPreferences.getClass();
        cg4Var.getClass();
        this.e = bfkVar;
        this.f = s96Var;
        this.g = gzhVar;
        this.h = cg4Var;
        Calendar calendar = ke0.a;
        zzc zzcVar = new zzc();
        this.i = zzcVar;
        this.j = zzcVar;
        Context applicationContext = application.getApplicationContext();
        String e = a5f.e(applicationContext);
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("_has_set_default_values", 0);
        if (sharedPreferences2.getBoolean("_has_set_default_values", false)) {
            return;
        }
        a5f a5fVar = new a5f(applicationContext);
        a5fVar.f = e;
        a5fVar.d = null;
        a5fVar.h(applicationContext);
        sharedPreferences2.edit().putBoolean("_has_set_default_values", true).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r5 = kotlin.text.StringsKt__StringsKt.split$default(r5, new java.lang.String[]{com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map m(String str) {
        List split$default;
        List split$default2;
        if (str == null || split$default == null) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        int c = sub.c(k13.r(split$default, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{":"}, false, 2, 2, null);
            linkedHashMap.put(StringsKt.l0((String) split$default2.get(0)).toString(), StringsKt.l0((String) split$default2.get(1)).toString());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(pa3 pa3Var, sq3 sq3Var) {
        gci gciVar;
        int i;
        bg0 bg0Var;
        if (sq3Var instanceof gci) {
            gciVar = (gci) sq3Var;
            int i2 = gciVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gciVar.u = i2 - Integer.MIN_VALUE;
                Object obj = gciVar.s;
                Object obj2 = lu3.a;
                i = gciVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    long j = mci.a;
                    w9g w9gVar = new w9g(pa3Var, rq3Var, 18);
                    gciVar.r = pa3Var;
                    gciVar.u = 1;
                    obj = wba.W(j, w9gVar, gciVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        bg0Var = (bg0) obj;
                        if (!(bg0Var instanceof zf0)) {
                            return null;
                        }
                        Uri parse = Uri.parse(((zf0) bg0Var).a);
                        parse.getClass();
                        gciVar.r = null;
                        gciVar.u = 3;
                        Object o = o(parse, gciVar);
                        return o == obj2 ? obj2 : o;
                    }
                    pa3Var = gciVar.r;
                    y6a.M(obj);
                }
                bg0Var = (bg0) obj;
                if (bg0Var == null) {
                    ((kea) pa3Var).e(null);
                    kea keaVar = (kea) pa3Var;
                    if (!keaVar.t() || keaVar.isCancelled()) {
                        bg0Var = null;
                    } else {
                        gciVar.r = null;
                        gciVar.u = 2;
                        obj = ((qa3) pa3Var).w(gciVar);
                    }
                }
                if (!(bg0Var instanceof zf0)) {
                }
            }
        }
        gciVar = new gci(this, sq3Var);
        Object obj3 = gciVar.s;
        Object obj22 = lu3.a;
        i = gciVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        bg0Var = (bg0) obj3;
        if (bg0Var == null) {
        }
        if (!(bg0Var instanceof zf0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uri uri, sq3 sq3Var) {
        hci hciVar;
        int i;
        rd6 rd6Var;
        rd6 rd6Var2;
        String str;
        CurrentlyRelevantEventsResponse currentlyRelevantEventsResponse;
        if (sq3Var instanceof hci) {
            hciVar = (hci) sq3Var;
            int i2 = hciVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hciVar.u = i2 - Integer.MIN_VALUE;
                Object obj = hciVar.s;
                lu3 lu3Var = lu3.a;
                i = hciVar.u;
                CurrentlyRelevantEvent currentlyRelevantEvent = null;
                if (i != 0) {
                    y6a.M(obj);
                    Map m = m(uri.getFragment());
                    String str2 = (String) m.get("id");
                    Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                    String str3 = (String) m.get("tab");
                    rd6[] values = rd6.values();
                    int length = values.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            rd6Var = null;
                            break;
                        }
                        rd6Var = values[i3];
                        String name = rd6Var.name();
                        Locale locale = Locale.ROOT;
                        String lowerCase = name.toLowerCase(locale);
                        lowerCase.getClass();
                        if (str3 != null) {
                            str = str3.toLowerCase(locale);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (lowerCase.equals(str)) {
                            break;
                        }
                        i3++;
                    }
                    if (intOrNull != null) {
                        return new t8d(fz8.H("open_action", "open_details"), fz8.D(intOrNull.intValue(), "event_id"), fz8.G("preselected_tab", rd6Var));
                    }
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "";
                    }
                    hciVar.r = rd6Var;
                    hciVar.u = 1;
                    s96 s96Var = this.f;
                    s96Var.getClass();
                    currentlyRelevantEvent = null;
                    obj = yaa.P(new b86(s96Var, lastPathSegment, 0 == true ? 1 : 0, 0), hciVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    rd6Var2 = rd6Var;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rd6Var2 = hciVar.r;
                    y6a.M(obj);
                }
                currentlyRelevantEventsResponse = (CurrentlyRelevantEventsResponse) yaa.x((x2g) obj);
                if (currentlyRelevantEventsResponse != null) {
                    currentlyRelevantEvent = currentlyRelevantEventsResponse.getCurrentlyRelevantEvent();
                }
                return currentlyRelevantEvent == null ? new t8d(fz8.H("open_action", "open_details"), fz8.D(currentlyRelevantEvent.getId(), "event_id"), fz8.G("preselected_tab", rd6Var2)) : u8d.a;
            }
        }
        hciVar = new hci(this, sq3Var);
        Object obj2 = hciVar.s;
        lu3 lu3Var2 = lu3.a;
        i = hciVar.u;
        CurrentlyRelevantEvent currentlyRelevantEvent2 = null;
        if (i != 0) {
        }
        currentlyRelevantEventsResponse = (CurrentlyRelevantEventsResponse) yaa.x((x2g) obj2);
        if (currentlyRelevantEventsResponse != null) {
        }
        if (currentlyRelevantEvent2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x04fc, code lost:
    
        if (r1 == r3) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Uri uri, sq3 sq3Var) {
        jci jciVar;
        int i;
        fsf g;
        ArrayList arrayList;
        Uri.Builder clearQuery;
        ArrayList arrayList2;
        String lastPathSegment;
        SharedPreferences d;
        String str;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List split$default;
        y4b y4bVar;
        String str8;
        Integer intOrNull;
        if (sq3Var instanceof jci) {
            jciVar = (jci) sq3Var;
            int i2 = jciVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jciVar.w = i2 - Integer.MIN_VALUE;
                Object obj = jciVar.u;
                Object obj2 = lu3.a;
                i = jciVar.w;
                Integer num = null;
                r7 = null;
                ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo2 = null;
                num = null;
                if (i != 0) {
                    g = lnb.g(obj);
                    g.a = uri;
                    List<String> pathSegments = uri.getPathSegments();
                    pathSegments.getClass();
                    arrayList = new ArrayList(pathSegments);
                    if (arrayList.contains("developer")) {
                        arrayList.remove("developer");
                        clearQuery = ((Uri) g.a).buildUpon().path(CollectionsKt.f0(arrayList, "/", null, null, null, 62)).clearQuery();
                        jciVar.r = g;
                        jciVar.s = arrayList;
                        jciVar.t = clearQuery;
                        jciVar.w = 1;
                        if (u8d.a != obj2) {
                            arrayList2 = arrayList;
                        }
                        return obj2;
                    }
                    lastPathSegment = ((Uri) g.a).getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "";
                    }
                    if (arrayList.contains(SearchResponseKt.SPORT_ENTITY)) {
                        return new t8d(fz8.H("open_action", "open_main"), fz8.H("sport_name", lastPathSegment));
                    }
                    if (arrayList.contains("event")) {
                        return new t8d(fz8.H("open_action", "open_details"), fz8.D(Integer.parseInt(lastPathSegment), "event_id"));
                    }
                    int i3 = 0;
                    if (arrayList.contains("tournament")) {
                        Uri uri2 = (Uri) g.a;
                        Map m = m(uri2.getFragment());
                        String lastPathSegment2 = uri2.getLastPathSegment();
                        Integer intOrNull2 = lastPathSegment2 != null ? StringsKt.toIntOrNull(lastPathSegment2) : null;
                        String str9 = (String) m.get("id");
                        int intValue = (str9 == null || (intOrNull = StringsKt.toIntOrNull(str9)) == null) ? 0 : intOrNull.intValue();
                        String str10 = (String) m.get("tab");
                        y4b[] values = y4b.values();
                        int length = values.length;
                        while (true) {
                            if (i3 >= length) {
                                y4bVar = null;
                                break;
                            }
                            y4bVar = values[i3];
                            String name = y4bVar.name();
                            Locale locale = Locale.ROOT;
                            String lowerCase = name.toLowerCase(locale);
                            lowerCase.getClass();
                            if (str10 != null) {
                                str8 = str10.toLowerCase(locale);
                                str8.getClass();
                            } else {
                                str8 = null;
                            }
                            if (lowerCase.equals(str8)) {
                                break;
                            }
                            i3++;
                        }
                        String str11 = (String) m.get(a.q);
                        String str12 = (String) m.get("pid");
                        Integer intOrNull3 = str12 != null ? StringsKt.toIntOrNull(str12) : null;
                        if (intOrNull2 != null) {
                            return new t8d(fz8.H("open_action", "open_tournament"), fz8.D(intOrNull2.intValue(), "unique_tournament_id"), fz8.D(intValue, "unique_tournament_season_id"), fz8.G("preselected_tab", y4bVar), fz8.H("unique_tournament_campaign", str11), fz8.G("team_of_the_period_id", intOrNull3));
                        }
                    } else {
                        if (arrayList.contains("team")) {
                            return new t8d(fz8.H("open_action", "open_team"), fz8.D(Integer.parseInt(lastPathSegment), "team_id"));
                        }
                        if (arrayList.contains(SearchResponseKt.PLAYER_ENTITY)) {
                            String str13 = (String) CollectionsKt.firstOrNull(arrayList);
                            boolean R = CollectionsKt.R(wyh.f, str13);
                            if (!arrayList.contains("compare")) {
                                if (R) {
                                    return new t8d(fz8.H("open_action", "open_team"), fz8.D(Integer.parseInt(lastPathSegment), "team_id"));
                                }
                                x62 H = fz8.H("open_action", "open_player");
                                x62 D = fz8.D(Integer.parseInt(lastPathSegment), "player_id");
                                zxe zxeVar = zxe.d;
                                String uri3 = ((Uri) g.a).toString();
                                uri3.getClass();
                                return new t8d(H, D, fz8.G("preselected_tab", StringsKt.J(uri3, "target=player-season", false) ? zxeVar : null));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set<String> queryParameterNames = ((Uri) g.a).getQueryParameterNames();
                            queryParameterNames.getClass();
                            for (String str14 : queryParameterNames) {
                                String queryParameter = ((Uri) g.a).getQueryParameter(str14);
                                if (queryParameter != null) {
                                    split$default = StringsKt__StringsKt.split$default(queryParameter, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                                    linkedHashMap.put(str14, split$default);
                                }
                            }
                            List list = (List) linkedHashMap.get("ids");
                            Integer intOrNull4 = (list == null || (str7 = (String) CollectionsKt.a0(0, list)) == null) ? null : StringsKt.toIntOrNull(str7);
                            List list2 = (List) linkedHashMap.get("ids");
                            Integer intOrNull5 = (list2 == null || (str6 = (String) CollectionsKt.a0(1, list2)) == null) ? null : StringsKt.toIntOrNull(str6);
                            List list3 = (List) linkedHashMap.get("ut_ids");
                            Integer intOrNull6 = (list3 == null || (str5 = (String) CollectionsKt.a0(0, list3)) == null) ? null : StringsKt.toIntOrNull(str5);
                            List list4 = (List) linkedHashMap.get("ut_ids");
                            Integer intOrNull7 = (list4 == null || (str4 = (String) CollectionsKt.a0(1, list4)) == null) ? null : StringsKt.toIntOrNull(str4);
                            List list5 = (List) linkedHashMap.get("s_ids");
                            Integer intOrNull8 = (list5 == null || (str3 = (String) CollectionsKt.a0(0, list5)) == null) ? null : StringsKt.toIntOrNull(str3);
                            List list6 = (List) linkedHashMap.get("s_ids");
                            Integer intOrNull9 = (list6 == null || (str2 = (String) CollectionsKt.a0(1, list6)) == null) ? null : StringsKt.toIntOrNull(str2);
                            List list7 = (List) linkedHashMap.get("s_types");
                            String str15 = list7 != null ? (String) CollectionsKt.a0(0, list7) : null;
                            List list8 = (List) linkedHashMap.get("s_types");
                            String str16 = list8 != null ? (String) CollectionsKt.a0(1, list8) : null;
                            if (intOrNull4 != null) {
                                x62 H2 = fz8.H("open_action", "open_player_compare");
                                x62 G = fz8.G("ENTITY_TYPE", e73.a);
                                x62 D2 = fz8.D(intOrNull4.intValue(), "ENTITY_ID_1");
                                x62 G2 = fz8.G("ENTITY_ID_2", intOrNull5);
                                int i4 = mci.b;
                                if (intOrNull6 == null || intOrNull8 == null) {
                                    uniqueTournamentSeasonInfo = null;
                                } else {
                                    int intValue2 = intOrNull6.intValue();
                                    int intValue3 = intOrNull8.intValue();
                                    if (str15 == null) {
                                        str15 = Season.SubSeasonType.OVERALL.getLabel();
                                    }
                                    uniqueTournamentSeasonInfo = new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(intValue2, intValue3, str15);
                                }
                                x62 F = fz8.F("PRESELECTED_SEASON_INFO", uniqueTournamentSeasonInfo);
                                if (intOrNull7 != null && intOrNull9 != null) {
                                    int intValue4 = intOrNull7.intValue();
                                    int intValue5 = intOrNull9.intValue();
                                    if (str16 == null) {
                                        str16 = Season.SubSeasonType.OVERALL.getLabel();
                                    }
                                    uniqueTournamentSeasonInfo2 = new ComparisonSeasonInfo.UniqueTournamentSeasonInfo(intValue4, intValue5, str16);
                                }
                                return new t8d(H2, G, D2, G2, F, fz8.F("PRESELECTED_SEASON_INFO_2", uniqueTournamentSeasonInfo2), fz8.H("SPORT", str13), fz8.H("ANALYTICS_TYPE", "deeplink"));
                            }
                        } else {
                            if (arrayList.contains("betting-tips-today")) {
                                return new t8d(fz8.H("open_action", "open_betting_tips"));
                            }
                            if (arrayList.contains("fighter")) {
                                return new t8d(fz8.H("open_action", "open_fighter"), fz8.D(Integer.parseInt(lastPathSegment), "mma_fighter_id"));
                            }
                            if (arrayList.contains("organisation")) {
                                return new t8d(fz8.H("open_action", "open_mma_organization"), fz8.D(Integer.parseInt(lastPathSegment), "mma_organization_id"));
                            }
                            if (arrayList.contains("fight-night")) {
                                return new t8d(fz8.H("open_action", "open_fight_night"), fz8.D(Integer.parseInt(lastPathSegment), "mma_fight_night_id"));
                            }
                            if (arrayList.contains("driver")) {
                                return new t8d(fz8.H("open_action", "open_driver"), fz8.D(Integer.parseInt(lastPathSegment), "driver_id"));
                            }
                            if (arrayList.contains("category")) {
                                return new t8d(fz8.H("open_action", "open_motorsport_category"), fz8.D(Integer.parseInt(lastPathSegment), "category_id"));
                            }
                            if (arrayList.contains("race")) {
                                return new t8d(fz8.H("open_action", "open_race"), fz8.D(Integer.parseInt(lastPathSegment), "race_id"));
                            }
                            if (arrayList.contains("user")) {
                                return arrayList.contains("profile") ? new t8d(fz8.H("open_action", "open_profile"), fz8.H("user_id", lastPathSegment)) : u8d.a;
                            }
                            if (arrayList.contains("favorites")) {
                                return new t8d(fz8.H("open_action", "open_editor"));
                            }
                            if (arrayList.contains("match")) {
                                Uri uri4 = (Uri) g.a;
                                jciVar.r = null;
                                jciVar.s = null;
                                jciVar.t = null;
                                jciVar.w = 2;
                                obj = l(uri4, jciVar);
                            } else {
                                if (arrayList.contains("fantasy")) {
                                    if (!arrayList.contains("competition")) {
                                        return new t8d(fz8.H("open_action", c5n.O(i()) ? "open_fantasy" : "open_main"));
                                    }
                                    Uri uri5 = (Uri) g.a;
                                    if (!c5n.O(i())) {
                                        return new t8d(fz8.H("open_action", "open_main"));
                                    }
                                    String valueOf = String.valueOf(uri5);
                                    txb b = new Regex("competition/(\\d+)").b(String.valueOf(uri5));
                                    if (b != null && (str = (String) ((sxb) b.a()).get(1)) != null) {
                                        num = StringsKt.toIntOrNull(str);
                                    }
                                    return num == null ? new t8d(fz8.H("open_action", "open_fantasy")) : StringsKt.J(valueOf, "joinCode", false) ? new s8d(String.valueOf(uri5)) : new t8d(fz8.H("open_action", "open_fantasy_onboarding"), fz8.D(num.intValue(), "event_id"));
                                }
                                if (arrayList.contains("preferences")) {
                                    return new t8d(fz8.H("open_action", "open_preferences"));
                                }
                                if (arrayList.contains("feed")) {
                                    return new t8d(fz8.H("open_action", "select_feed_tab"));
                                }
                                if (arrayList.contains("world-cup")) {
                                    return new t8d(fz8.H("open_action", "select_world_cup"));
                                }
                                if (arrayList.contains(SearchResponseKt.MANAGER_ENTITY)) {
                                    return new t8d(fz8.H("open_action", "open_manager"), fz8.D(Integer.parseInt(lastPathSegment), "manager_id"));
                                }
                                if (arrayList.contains("venue")) {
                                    return new t8d(fz8.H("open_action", "open_venue"), fz8.D(Integer.parseInt(lastPathSegment), "venue_id"));
                                }
                                if (arrayList.contains("player-of-the-season")) {
                                    return new t8d(fz8.H("open_action", "open_player_of_the_season"));
                                }
                                if (arrayList.contains("upgrade")) {
                                    Context i5 = i();
                                    SharedPreferences sharedPreferences = uic.j;
                                    if (sharedPreferences == null) {
                                        Context applicationContext = i5.getApplicationContext();
                                        synchronized (uic.i) {
                                            d = a5f.d(applicationContext);
                                            uic.j = d;
                                        }
                                        d.getClass();
                                        sharedPreferences = d;
                                    }
                                    return sharedPreferences.getBoolean("IN_APP_PURCHASE_AVAILABLE", true) ? new t8d(fz8.H("open_action", "open_upgrade")) : u8d.a;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    return (v8d) obj;
                }
                clearQuery = jciVar.t;
                arrayList2 = jciVar.s;
                g = jciVar.r;
                y6a.M(obj);
                Uri build = clearQuery.build();
                build.getClass();
                g.a = build;
                arrayList = arrayList2;
                lastPathSegment = ((Uri) g.a).getLastPathSegment();
                if (lastPathSegment == null) {
                }
                if (arrayList.contains(SearchResponseKt.SPORT_ENTITY)) {
                }
            }
        }
        jciVar = new jci(this, sq3Var);
        Object obj3 = jciVar.u;
        Object obj22 = lu3.a;
        i = jciVar.w;
        Integer num2 = null;
        uniqueTournamentSeasonInfo2 = null;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo22 = null;
        num2 = null;
        if (i != 0) {
        }
        Uri build2 = clearQuery.build();
        build2.getClass();
        g.a = build2;
        arrayList = arrayList2;
        lastPathSegment = ((Uri) g.a).getLastPathSegment();
        if (lastPathSegment == null) {
        }
        if (arrayList.contains(SearchResponseKt.SPORT_ENTITY)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:24|25))(3:26|27|(1:29))|11|12|(2:18|(1:22)(2:20|21))(1:16)))|32|6|7|(0)(0)|11|12|(1:14)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
    
        r6 = defpackage.w2g.b;
        r7 = new defpackage.u2g(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Uri uri, sq3 sq3Var) {
        kci kciVar;
        int i;
        Object u2gVar;
        Throwable a;
        if (sq3Var instanceof kci) {
            kciVar = (kci) sq3Var;
            int i2 = kciVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kciVar.t = i2 - Integer.MIN_VALUE;
                Object obj = kciVar.r;
                Object obj2 = lu3.a;
                i = kciVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    kciVar.t = 1;
                    obj = n(uri, kciVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                u2gVar = (v8d) obj;
                p2g p2gVar2 = w2g.b;
                a = w2g.a(u2gVar);
                if (a == null && (a instanceof CancellationException)) {
                    throw a;
                }
                if (u2gVar instanceof u2g) {
                    return u2gVar;
                }
                return null;
            }
        }
        kciVar = new kci(this, sq3Var);
        Object obj3 = kciVar.r;
        Object obj22 = lu3.a;
        i = kciVar.t;
        if (i != 0) {
        }
        u2gVar = (v8d) obj3;
        p2g p2gVar22 = w2g.b;
        a = w2g.a(u2gVar);
        if (a == null) {
        }
        if (u2gVar instanceof u2g) {
        }
    }
}
