package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.CricketSupportStaff;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d9b {
    public static final Set a = ph0.a0(new String[]{Sports.MINI_FOOTBALL, Sports.FUTSAL});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v1, types: [r9k] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Number] */
    public static gv9 a(List list, List list2, List list3, Manager manager, ArrayList arrayList, boolean z, i9b i9bVar, i9b i9bVar2, g9b g9bVar, Function2 function2, dk8 dk8Var, xt3 xt3Var, int i) {
        Throwable th;
        List list4 = (i & 2) != 0 ? null : list2;
        List list5 = (i & 4) != 0 ? null : list3;
        Manager manager2 = (i & 8) != 0 ? null : manager;
        ArrayList arrayList2 = (i & 16) != 0 ? null : arrayList;
        boolean z2 = (i & 32) != 0 ? false : z;
        g9b g9bVar2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : g9bVar;
        Function2 function22 = (i & 1024) != 0 ? function2 : dk8Var;
        xt3 xt3Var2 = (i & a.o) != 0 ? null : xt3Var;
        list.getClass();
        xbb b = kotlin.collections.a.b();
        if (manager2 != null) {
            b.add(new h9b(Integer.valueOf(manager2.getId()), tba.s(manager2), x8b.a(arrayList2), null, false, 56));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.c(((PlayerData) obj).getSubstitute(), Boolean.TRUE)) {
                arrayList3.add(obj);
            } else {
                arrayList4.add(obj);
            }
        }
        if (z2) {
            th = null;
        } else {
            ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                arrayList5.add((p9b) function2.invoke((PlayerData) next, Boolean.valueOf(i2 == arrayList4.size() + (-1))));
                i2 = i3;
            }
            th = null;
            if (!arrayList5.isEmpty()) {
                b.add(i9bVar);
                b.addAll(arrayList5);
            }
        }
        ArrayList arrayList6 = new ArrayList(k13.r(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                b.q();
                throw th;
            }
            arrayList6.add((p9b) function22.invoke((PlayerData) next2, Boolean.valueOf(i4 == arrayList3.size() + (-1))));
            i4 = i5;
        }
        if (!arrayList6.isEmpty()) {
            if (!arrayList4.isEmpty()) {
                b.add(i9bVar2);
            }
            b.addAll(arrayList6);
        }
        if (g9bVar2 != null) {
            b.add(g9bVar2);
        }
        if (list4 != null) {
            ArrayList arrayList7 = new ArrayList(k13.r(list4, 10));
            int i6 = 0;
            for (Object obj2 : list4) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw th;
                }
                MissingPlayerData missingPlayerData = (MissingPlayerData) obj2;
                boolean z3 = i6 == list4.size() - 1;
                int id = missingPlayerData.getPlayer().getId();
                String t = tba.t(missingPlayerData.getPlayer());
                q9k q9kVar = new q9k(wib.t(missingPlayerData.getReason(), R.string.injury_status_out, missingPlayerData.getType(), missingPlayerData.getDescription()));
                int reason = missingPlayerData.getReason();
                String type = missingPlayerData.getType();
                String description = missingPlayerData.getDescription();
                type.getClass();
                ?? h = (type.equals("doubtful") || reason == 1 || reason == 2) ? wib.h(description) : th;
                Object q9kVar2 = h != 0 ? new q9k(h.intValue()) : th;
                int s = wib.s(missingPlayerData.getReason());
                String type2 = missingPlayerData.getType();
                type2.getClass();
                arrayList7.add(new p9b(id, t, null, false, null, null, null, null, new n9b(s, type2.equals("missing") ? R.color.error : R.color.alert, q9kVar, q9kVar2, wib.v(missingPlayerData.getReason())), null, !z3, 1788));
                i6 = i7;
            }
            if (!arrayList7.isEmpty()) {
                b.add(new i9b(new q9k(R.string.injuries_and_suspensions)));
                b.addAll(arrayList7);
            }
        }
        if (list5 != null && xt3Var2 != null) {
            ArrayList arrayList8 = new ArrayList(k13.r(list5, 10));
            int i8 = 0;
            for (Object obj3 : list5) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw th;
                }
                arrayList8.add((h9b) xt3Var2.invoke((CricketSupportStaff) obj3, Boolean.valueOf(i8 == list5.size() - 1)));
                i8 = i9;
            }
            if (!arrayList8.isEmpty()) {
                b.add(new i9b(new q9k(R.string.support_staff)));
                b.addAll(arrayList8);
            }
        }
        return l6g.W(kotlin.collections.a.a(b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r4 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (r6 > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r4 > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 b(PlayerData playerData, String str) {
        Integer num;
        Integer num2;
        Integer num3;
        List<Incident.GoalIncident> goalIncidents;
        int i;
        int i2;
        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
        str.getClass();
        List<Incident.GoalIncident> goalIncidents2 = playerData.getGoalIncidents();
        int i3 = 0;
        Integer num4 = null;
        if (goalIncidents2 != null) {
            if (goalIncidents2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (Incident.GoalIncident goalIncident : goalIncidents2) {
                    if (Intrinsics.c(goalIncident.getIncidentClass(), "regular") || Intrinsics.c(goalIncident.getIncidentClass(), "penalty")) {
                        i2++;
                        if (i2 < 0) {
                            b.p();
                            throw null;
                        }
                    }
                }
            }
            num = Integer.valueOf(i2);
        }
        num = null;
        List<Incident.GoalIncident> assistIncidents = playerData.getAssistIncidents();
        if (assistIncidents != null) {
            int size = assistIncidents.size();
            num2 = Integer.valueOf(size);
        }
        num2 = null;
        List<Incident.GoalIncident> goalIncidents3 = playerData.getGoalIncidents();
        if (goalIncidents3 != null) {
            if (goalIncidents3.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = goalIncidents3.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (Intrinsics.c(((Incident.GoalIncident) it.next()).getIncidentClass(), Incident.GoalIncident.TYPE_OWN_GOAL) && (i = i + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            num3 = Integer.valueOf(i);
        }
        num3 = null;
        if (Boolean.valueOf(a.contains(str)).equals(Boolean.TRUE) && (goalIncidents = playerData.getGoalIncidents()) != null) {
            if (!goalIncidents.isEmpty()) {
                Iterator<T> it2 = goalIncidents.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.c(((Incident.GoalIncident) it2.next()).getIncidentClass(), Incident.GoalIncident.TYPE_ACCUMULATED_PENALTY) && (i3 = i3 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            Integer valueOf2 = Integer.valueOf(i3);
            if (i3 > 0) {
                num4 = valueOf2;
            }
        }
        xbb b = kotlin.collections.a.b();
        if (num != null) {
            b.add(new f9b(str.equals(Sports.HANDBALL) ? R.drawable.ic_handball_goal_16 : R.drawable.ic_goal_incidents, num.intValue(), valueOf));
        }
        if (num4 != null) {
            b.add(new f9b(R.drawable.ic_accumulated_penalty, num4.intValue(), valueOf));
        }
        if (num2 != null) {
            b.add(new f9b(R.drawable.ic_football_assist_16, num2.intValue(), valueOf));
        }
        if (num3 != null) {
            b.add(new f9b(R.drawable.ic_autogoal_16, num3.intValue(), Integer.valueOf(R.color.error)));
        }
        fk2 a2 = x8b.a(playerData.getCardIncidents());
        if (a2 != null) {
            b.add(new f9b(a2.a));
        }
        return l6g.W(kotlin.collections.a.a(b));
    }

    public static String c(PlayerData playerData) {
        String t = tba.t(playerData.getPlayer());
        String str = Intrinsics.c(playerData.getCaptain(), Boolean.TRUE) ? " (c) " : null;
        if (str == null) {
            str = "";
        }
        return dmi.y(t, str);
    }

    public static String d(Context context, String str, boolean z, Gender gender) {
        if (str == null) {
            return "";
        }
        return String.format(Locale.getDefault(), "%s: %s", Arrays.copyOf(new Object[]{hkg.Q(context, z ? R.string.substituted_out : R.string.substituted_in, gender, new Object[0]), str}, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2, types: [o9b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o9b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 e(PlayerData playerData, Context context) {
        Gender gender;
        List<Incident.SubstitutionIncident> substitutionIncidents = playerData.getSubstitutionIncidents();
        if (substitutionIncidents == null) {
            substitutionIncidents = km5.a;
        }
        List<Incident.SubstitutionIncident> B0 = CollectionsKt.B0(substitutionIncidents);
        ArrayList arrayList = new ArrayList();
        for (Incident.SubstitutionIncident substitutionIncident : B0) {
            int id = playerData.getPlayer().getId();
            Player playerIn = substitutionIncident.getPlayerIn();
            if (playerIn == null || id != playerIn.getId()) {
                Player playerOut = substitutionIncident.getPlayerOut();
                if (playerOut != null && id == playerOut.getId()) {
                    String format = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{qz9.a(context, substitutionIncident)}, 1));
                    Player playerIn2 = substitutionIncident.getPlayerIn();
                    String t = playerIn2 != null ? tba.t(playerIn2) : null;
                    Player playerIn3 = substitutionIncident.getPlayerIn();
                    gender = new o9b(format, d(context, t, false, playerIn3 != null ? playerIn3.getGender() : null), false, substitutionIncident.getInjury());
                }
                if (r8 == null) {
                    arrayList.add(r8);
                }
            } else {
                String format2 = String.format(Locale.getDefault(), "%s", Arrays.copyOf(new Object[]{qz9.a(context, substitutionIncident)}, 1));
                Player playerOut2 = substitutionIncident.getPlayerOut();
                String t2 = playerOut2 != null ? tba.t(playerOut2) : null;
                Player playerOut3 = substitutionIncident.getPlayerOut();
                gender = new o9b(format2, d(context, t2, true, playerOut3 != null ? playerOut3.getGender() : null), true, false);
            }
            r8 = gender;
            if (r8 == null) {
            }
        }
        return l6g.W(arrayList);
    }
}
