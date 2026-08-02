package defpackage;

import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cfi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ cfi(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        Integer num;
        lcl lclVar;
        Boolean bool;
        sbl sblVar;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                yhk yhkVar = lcl.z;
                qcl g = workDatabase.g();
                g.getClass();
                str.getClass();
                Object apply = yhkVar.apply((List) gz8.S(g.a, true, true, new bcl(2, str, g)));
                apply.getClass();
                return (List) apply;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                return StringsKt.R(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            case 2:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                KProperty[] kPropertyArr = y3h.a;
                ((b4h) obj).a(w3h.O, str);
                return Unit.a;
            case 4:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean("PREF_" + str + "", true));
            case 5:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT MAX(orderIndex) FROM pinned_tournaments_table WHERE category_sport_slug = ?");
                try {
                    V0.L(1, str);
                    if (V0.U0() && !V0.isNull(0)) {
                        num = Integer.valueOf((int) V0.getLong(0));
                        return num;
                    }
                    num = null;
                    return num;
                } finally {
                }
            case 6:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT id FROM pinned_tournaments_table WHERE category_sport_slug = ? ORDER BY orderIndex");
                try {
                    V0.L(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT leaderboardId FROM user_weekly_leaderboard WHERE userId=?");
                try {
                    V0.L(1, str);
                    int i2 = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 8:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    V0.L(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(V0.F0(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 9:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 10:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                V0 = glgVar7.V0("SELECT * FROM workspec WHERE id=?");
                try {
                    V0.L(1, str);
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "state");
                    int r3 = w1a.r(V0, "worker_class_name");
                    int r4 = w1a.r(V0, "input_merger_class_name");
                    int r5 = w1a.r(V0, "input");
                    int r6 = w1a.r(V0, "output");
                    int r7 = w1a.r(V0, "initial_delay");
                    int r8 = w1a.r(V0, "interval_duration");
                    int r9 = w1a.r(V0, "flex_duration");
                    int r10 = w1a.r(V0, "run_attempt_count");
                    int r11 = w1a.r(V0, "backoff_policy");
                    int r12 = w1a.r(V0, "backoff_delay_duration");
                    int r13 = w1a.r(V0, "last_enqueue_time");
                    int r14 = w1a.r(V0, "minimum_retention_duration");
                    int r15 = w1a.r(V0, "schedule_requested_at");
                    int r16 = w1a.r(V0, "run_in_foreground");
                    int r17 = w1a.r(V0, "out_of_quota_policy");
                    int r18 = w1a.r(V0, "period_count");
                    int r19 = w1a.r(V0, "generation");
                    int r20 = w1a.r(V0, "next_schedule_time_override");
                    int r21 = w1a.r(V0, "next_schedule_time_override_generation");
                    int r22 = w1a.r(V0, "stop_reason");
                    int r23 = w1a.r(V0, "trace_tag");
                    int r24 = w1a.r(V0, "backoff_on_system_interruptions");
                    int r25 = w1a.r(V0, "required_network_type");
                    int r26 = w1a.r(V0, "required_network_request");
                    int r27 = w1a.r(V0, "requires_charging");
                    int r28 = w1a.r(V0, "requires_device_idle");
                    int r29 = w1a.r(V0, "requires_battery_not_low");
                    int r30 = w1a.r(V0, "requires_storage_not_low");
                    int r31 = w1a.r(V0, "trigger_content_update_delay");
                    int r32 = w1a.r(V0, "trigger_max_content_delay");
                    int r33 = w1a.r(V0, "content_uri_triggers");
                    if (V0.U0()) {
                        String F0 = V0.F0(r);
                        sbl E = sha.E((int) V0.getLong(r2));
                        String F02 = V0.F0(r3);
                        String F03 = V0.F0(r4);
                        byte[] blob = V0.getBlob(r5);
                        md4 md4Var = md4.b;
                        md4 y = ww9.y(blob);
                        md4 y2 = ww9.y(V0.getBlob(r6));
                        long j = V0.getLong(r7);
                        long j2 = V0.getLong(r8);
                        long j3 = V0.getLong(r9);
                        int i3 = (int) V0.getLong(r10);
                        zy0 B = sha.B((int) V0.getLong(r11));
                        long j4 = V0.getLong(r12);
                        long j5 = V0.getLong(r13);
                        long j6 = V0.getLong(r14);
                        long j7 = V0.getLong(r15);
                        boolean z = ((int) V0.getLong(r16)) != 0;
                        pwd D = sha.D((int) V0.getLong(r17));
                        int i4 = (int) V0.getLong(r18);
                        int i5 = (int) V0.getLong(r19);
                        long j8 = V0.getLong(r20);
                        int i6 = (int) V0.getLong(r21);
                        int i7 = (int) V0.getLong(r22);
                        String F04 = V0.isNull(r23) ? null : V0.F0(r23);
                        Integer valueOf = V0.isNull(r24) ? null : Integer.valueOf((int) V0.getLong(r24));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        lclVar = new lcl(F0, E, F02, F03, y, y2, j, j2, j3, new zm3(sha.Y(V0.getBlob(r26)), sha.C((int) V0.getLong(r25)), ((int) V0.getLong(r27)) != 0, ((int) V0.getLong(r28)) != 0, ((int) V0.getLong(r29)) != 0, ((int) V0.getLong(r30)) != 0, V0.getLong(r31), V0.getLong(r32), sha.o(V0.getBlob(r33))), i3, B, j4, j5, j6, j7, z, D, i4, i5, j8, i6, i7, F04, bool);
                    } else {
                        lclVar = null;
                    }
                    return lclVar;
                } finally {
                }
            case 11:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                V0 = glgVar8.V0("SELECT state FROM workspec WHERE id=?");
                try {
                    V0.L(1, str);
                    if (V0.U0()) {
                        Integer valueOf2 = V0.isNull(0) ? null : Integer.valueOf((int) V0.getLong(0));
                        if (valueOf2 != null) {
                            sblVar = sha.E(valueOf2.intValue());
                            return sblVar;
                        }
                    }
                    sblVar = null;
                    return sblVar;
                } finally {
                }
            case 12:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                V0 = glgVar9.V0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    V0.L(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(V0.F0(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 13:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                V0 = glgVar10.V0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    int y3 = u0a.y(glgVar10);
                    V0.close();
                    return Integer.valueOf(y3);
                } finally {
                }
            case 14:
                glg glgVar11 = (glg) obj;
                glgVar11.getClass();
                V0 = glgVar11.V0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    int y4 = u0a.y(glgVar11);
                    V0.close();
                    return Integer.valueOf(y4);
                } finally {
                }
            case 15:
                glg glgVar12 = (glg) obj;
                glgVar12.getClass();
                V0 = glgVar12.V0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 16:
                glg glgVar13 = (glg) obj;
                glgVar13.getClass();
                V0 = glgVar13.V0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    V0.L(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        byte[] blob2 = V0.getBlob(0);
                        md4 md4Var2 = md4.b;
                        arrayList4.add(ww9.y(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 17:
                glg glgVar14 = (glg) obj;
                glgVar14.getClass();
                V0 = glgVar14.V0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    int y5 = u0a.y(glgVar14);
                    V0.close();
                    return Integer.valueOf(y5);
                } finally {
                }
            case 18:
                glg glgVar15 = (glg) obj;
                glgVar15.getClass();
                V0 = glgVar15.V0("DELETE FROM workspec WHERE id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 19:
                glg glgVar16 = (glg) obj;
                glgVar16.getClass();
                V0 = glgVar16.V0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    V0.L(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (V0.U0()) {
                        String F05 = V0.F0(0);
                        sbl E2 = sha.E((int) V0.getLong(1));
                        F05.getClass();
                        jcl jclVar = new jcl();
                        jclVar.a = F05;
                        jclVar.b = E2;
                        arrayList5.add(jclVar);
                    }
                    return arrayList5;
                } finally {
                }
            case 20:
                glg glgVar17 = (glg) obj;
                glgVar17.getClass();
                V0 = glgVar17.V0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    V0.L(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (V0.U0()) {
                        arrayList6.add(V0.F0(0));
                    }
                    return arrayList6;
                } finally {
                }
            case 21:
                glg glgVar18 = (glg) obj;
                glgVar18.getClass();
                V0 = glgVar18.V0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    V0.L(1, str);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 22:
                v4m v4mVar = (v4m) obj;
                v4mVar.getClass();
                return Boolean.valueOf(Intrinsics.c(v4mVar.a, str));
            default:
                v4m v4mVar2 = (v4m) obj;
                v4mVar2.getClass();
                return Boolean.valueOf(Intrinsics.c(v4mVar2.a, str));
        }
    }
}
