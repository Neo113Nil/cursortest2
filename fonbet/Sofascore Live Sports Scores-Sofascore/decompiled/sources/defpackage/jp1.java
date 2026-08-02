package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.notifications.NotificationSetting;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jp1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ jp1(d99 d99Var, String str) {
        this.a = 17;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sport sport;
        String slug;
        int i = this.a;
        String str = "showCareerStatsInfoBanner";
        Long l = null;
        boolean z = false;
        r5 = false;
        r5 = false;
        boolean z2 = false;
        r5 = false;
        boolean z3 = false;
        z = false;
        String str2 = this.b;
        switch (i) {
            case 0:
                b4h b4hVar = (b4h) obj;
                y3h.g(b4hVar, 1);
                y3h.h(b4hVar, str2);
                return Unit.a;
            case 1:
                y3h.e((b4h) obj, str2);
                return Unit.a;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                if (str2 != null && !str2.equals(Sports.FOOTBALL)) {
                    str = "showCareerStatsInfoBanner".concat(str2);
                }
                return Boolean.valueOf(sharedPreferences.getBoolean(str, true));
            case 3:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                if (str2 != null && !str2.equals(Sports.FOOTBALL)) {
                    str = "showCareerStatsInfoBanner".concat(str2);
                }
                editor.putBoolean(str, false);
                return Unit.a;
            case 4:
                b4h b4hVar2 = (b4h) obj;
                q80 q80Var = new q80(str2);
                KProperty[] kPropertyArr = y3h.a;
                b4hVar2.a(w3h.C, a.c(q80Var));
                y3h.j(b4hVar2, 0);
                return Unit.a;
            case 5:
                b4h b4hVar3 = (b4h) obj;
                q80 q80Var2 = new q80(str2);
                KProperty[] kPropertyArr2 = y3h.a;
                b4hVar3.a(w3h.C, a.c(q80Var2));
                y3h.j(b4hVar3, 0);
                return Unit.a;
            case 6:
                y3h.h((b4h) obj, str2);
                return Unit.a;
            case 7:
                b4h b4hVar4 = (b4h) obj;
                y3h.g(b4hVar4, 0);
                y3h.e(b4hVar4, str2);
                return Unit.a;
            case 8:
                ((String) obj).getClass();
                return DateTimeFormatter.ofPattern(str2, dla.d()).withZone(ZoneId.systemDefault());
            case 9:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    V0.L(1, str2);
                    if (V0.U0()) {
                        if (((int) V0.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    V0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 10:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    V02.L(1, str2);
                    ArrayList arrayList = new ArrayList();
                    while (V02.U0()) {
                        arrayList.add(V02.F0(0));
                    }
                    return arrayList;
                } finally {
                }
            case 11:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V03 = glgVar3.V0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    V03.L(1, str2);
                    if (V03.U0()) {
                        if (((int) V03.getLong(0)) != 0) {
                            z3 = true;
                        }
                    }
                    V03.close();
                    return Boolean.valueOf(z3);
                } finally {
                }
            case 12:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                nlg V04 = glgVar4.V0("SELECT DISTINCT e.startTimestamp FROM events_table e JOIN tournament t ON e.uniqueTournamentId = t.unique_tournament_id WHERE t.category_sport_slug = ?");
                try {
                    V04.L(1, str2);
                    ArrayList arrayList2 = new ArrayList();
                    while (V04.U0()) {
                        arrayList2.add(Long.valueOf(V04.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                n77 n77Var = (n77) obj;
                return n77.a(n77Var, do7.a(n77Var.a, str2, null, 4093), false, false, false, false, 286);
            case 14:
                Team team = (Team) obj;
                team.getClass();
                if (str2 == null || ((sport = team.getSport()) != null && (slug = sport.getSlug()) != null && j31.k(slug, str2))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 15:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                sharedPreferences2.getClass();
                return Boolean.valueOf(sharedPreferences2.getBoolean("FAVORITES_LEAGUES_OPENED" + str2, true));
            case 16:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Boolean.valueOf(Intrinsics.c(pair.a, str2));
            case 17:
                p0d p0dVar = (p0d) obj;
                p0dVar.e(d99.d, str2);
                d99.d(p0dVar, str2);
                return null;
            case 18:
                b4h b4hVar5 = (b4h) obj;
                y3h.e(b4hVar5, str2);
                y3h.j(b4hVar5, 5);
                return Unit.a;
            case 19:
                b4h b4hVar6 = (b4h) obj;
                y3h.e(b4hVar6, str2);
                y3h.j(b4hVar6, 5);
                return Unit.a;
            case 20:
                b4h b4hVar7 = (b4h) obj;
                y3h.e(b4hVar7, str2);
                y3h.j(b4hVar7, 5);
                return Unit.a;
            case 21:
                b4h b4hVar8 = (b4h) obj;
                y3h.h(b4hVar8, str2);
                a4h a4hVar = w3h.u;
                KProperty kProperty = y3h.a[11];
                b4hVar8.a(a4hVar, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return Unit.a;
            case 22:
                return Boolean.valueOf(Intrinsics.c((String) obj, str2));
            case 23:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                nlg V05 = glgVar5.V0("SELECT COUNT(*) FROM pending_notifications WHERE updatableNotificationId LIKE ?");
                try {
                    V05.L(1, str2);
                    int i2 = V05.U0() ? (int) V05.getLong(0) : 0;
                    V05.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 24:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                nlg V06 = glgVar6.V0("SELECT * FROM notification_settings WHERE groupInSettingsScreen = ?");
                try {
                    V06.L(1, str2);
                    int r = w1a.r(V06, "group");
                    int r2 = w1a.r(V06, "name");
                    int r3 = w1a.r(V06, "enabled");
                    int r4 = w1a.r(V06, "channelId");
                    int r5 = w1a.r(V06, "groupInSettingsScreen");
                    ArrayList arrayList3 = new ArrayList();
                    while (V06.U0()) {
                        arrayList3.add(new NotificationSetting(V06.F0(r), V06.F0(r2), ((int) V06.getLong(r3)) != 0, V06.F0(r4), V06.F0(r5)));
                    }
                    return arrayList3;
                } finally {
                }
            case 25:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                nlg V07 = glgVar7.V0("SELECT long_value FROM Preference where `key`=?");
                try {
                    V07.L(1, str2);
                    if (V07.U0() && !V07.isNull(0)) {
                        l = Long.valueOf(V07.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 26:
                gyg gygVar = (gyg) obj;
                gygVar.getClass();
                return gyg.a(gygVar, null, null, null, null, this.b, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            case 27:
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                return i73.a(i73Var, null, null, false, null, this.b, 255);
            case 28:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                nlg V08 = glgVar8.V0("UPDATE sport_order SET isSelected = CASE WHEN sportName = ? THEN 1 ELSE 0 END");
                try {
                    V08.L(1, str2);
                    V08.U0();
                    V08.close();
                    return Unit.a;
                } finally {
                }
            default:
                SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                sharedPreferences3.getClass();
                cai caiVar = cai.b;
                String string = sharedPreferences3.getString("STANDINGS_VIEW_MODE_v2", "Short");
                cai caiVar2 = cai.c;
                if (!Intrinsics.c(string, "Full") || Intrinsics.c(str2, Sports.AMERICAN_FOOTBALL)) {
                    caiVar2 = cai.d;
                    if (!Intrinsics.c(string, "Form")) {
                        return caiVar;
                    }
                }
                return caiVar2;
        }
    }

    public /* synthetic */ jp1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ jp1(String str, rr7 rr7Var) {
        this.a = 14;
        this.b = str;
    }
}
