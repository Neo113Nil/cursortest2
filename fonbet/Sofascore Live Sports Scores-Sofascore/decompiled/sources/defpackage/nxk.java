package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.VoteTypeConverter;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nxk implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ nxk(int i) {
        this.a = i;
    }

    private final Object a(Object obj) {
        int i;
        Integer valueOf;
        glg glgVar = (glg) obj;
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        try {
            V0.q(1, 20L);
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
            ArrayList arrayList = new ArrayList();
            while (V0.U0()) {
                String F0 = V0.F0(r);
                int i2 = r13;
                int i3 = r14;
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
                int i4 = (int) V0.getLong(r10);
                int i5 = r;
                int i6 = r2;
                zy0 B = sha.B((int) V0.getLong(r11));
                long j4 = V0.getLong(r12);
                long j5 = V0.getLong(i2);
                long j6 = V0.getLong(i3);
                int i7 = r15;
                long j7 = V0.getLong(i7);
                r15 = i7;
                int i8 = r16;
                int i9 = r3;
                boolean z = ((int) V0.getLong(i8)) != 0;
                int i10 = r17;
                int i11 = r4;
                pwd D = sha.D((int) V0.getLong(i10));
                int i12 = r18;
                int i13 = (int) V0.getLong(i12);
                int i14 = r19;
                int i15 = (int) V0.getLong(i14);
                int i16 = r20;
                long j8 = V0.getLong(i16);
                int i17 = r21;
                int i18 = (int) V0.getLong(i17);
                r21 = i17;
                int i19 = r22;
                int i20 = (int) V0.getLong(i19);
                int i21 = r23;
                Boolean bool = null;
                String F04 = V0.isNull(i21) ? null : V0.F0(i21);
                int i22 = r24;
                if (V0.isNull(i22)) {
                    i = i21;
                    r22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    r22 = i19;
                    valueOf = Integer.valueOf((int) V0.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = r25;
                jbd C = sha.C((int) V0.getLong(i23));
                int i24 = r26;
                nad Y = sha.Y(V0.getBlob(i24));
                int i25 = r27;
                boolean z2 = ((int) V0.getLong(i25)) != 0;
                int i26 = r28;
                boolean z3 = ((int) V0.getLong(i26)) != 0;
                int i27 = r29;
                boolean z4 = ((int) V0.getLong(i27)) != 0;
                r29 = i27;
                int i28 = r30;
                int i29 = r31;
                int i30 = r32;
                r31 = i29;
                int i31 = r33;
                arrayList.add(new lcl(F0, E, F02, F03, y, y2, j, j2, j3, new zm3(Y, C, z2, z3, z4, ((int) V0.getLong(i28)) != 0, V0.getLong(i29), V0.getLong(i30), sha.o(V0.getBlob(i31))), i4, B, j4, j5, j6, j7, z, D, i13, i15, j8, i18, i20, F04, bool2));
                r28 = i26;
                r4 = i11;
                r17 = i10;
                r18 = i12;
                r19 = i14;
                r20 = i16;
                r23 = i;
                r24 = i22;
                r25 = i23;
                r26 = i24;
                r27 = i25;
                r33 = i31;
                r32 = i30;
                r30 = i28;
                r = i5;
                r3 = i9;
                r13 = i2;
                r14 = i3;
                r2 = i6;
                r16 = i8;
            }
            V0.close();
            return arrayList;
        } catch (Throwable th) {
            V0.close();
            throw th;
        }
    }

    private final Object b(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        glg glgVar = (glg) obj;
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT * FROM workspec WHERE state=1");
        try {
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
            ArrayList arrayList = new ArrayList();
            while (V0.U0()) {
                String F0 = V0.F0(r);
                int i3 = r14;
                ArrayList arrayList2 = arrayList;
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
                int i4 = (int) V0.getLong(r10);
                int i5 = r2;
                int i6 = r3;
                zy0 B = sha.B((int) V0.getLong(r11));
                long j4 = V0.getLong(r12);
                long j5 = V0.getLong(r13);
                long j6 = V0.getLong(i3);
                int i7 = r15;
                long j7 = V0.getLong(i7);
                int i8 = r;
                int i9 = r16;
                boolean z = ((int) V0.getLong(i9)) != 0;
                int i10 = r17;
                int i11 = r4;
                pwd D = sha.D((int) V0.getLong(i10));
                int i12 = r18;
                int i13 = r5;
                int i14 = (int) V0.getLong(i12);
                int i15 = r19;
                int i16 = (int) V0.getLong(i15);
                int i17 = r20;
                long j8 = V0.getLong(i17);
                int i18 = r21;
                int i19 = (int) V0.getLong(i18);
                int i20 = r22;
                int i21 = (int) V0.getLong(i20);
                int i22 = r23;
                Boolean bool = null;
                String F04 = V0.isNull(i22) ? null : V0.F0(i22);
                int i23 = r24;
                if (V0.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) V0.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = r25;
                Boolean bool2 = bool;
                jbd C = sha.C((int) V0.getLong(i24));
                int i25 = r26;
                nad Y = sha.Y(V0.getBlob(i25));
                r25 = i24;
                r26 = i25;
                int i26 = r27;
                boolean z2 = ((int) V0.getLong(i26)) != 0;
                r27 = i26;
                int i27 = r28;
                boolean z3 = ((int) V0.getLong(i27)) != 0;
                int i28 = r29;
                boolean z4 = ((int) V0.getLong(i28)) != 0;
                r29 = i28;
                int i29 = r30;
                int i30 = r31;
                int i31 = r32;
                int i32 = r33;
                r33 = i32;
                arrayList2.add(new lcl(F0, E, F02, F03, y, y2, j, j2, j3, new zm3(Y, C, z2, z3, z4, ((int) V0.getLong(i29)) != 0, V0.getLong(i30), V0.getLong(i31), sha.o(V0.getBlob(i32))), i4, B, j4, j5, j6, j7, z, D, i14, i16, j8, i, i21, F04, bool2));
                r30 = i29;
                r4 = i11;
                r17 = i10;
                r19 = i15;
                r22 = i2;
                r24 = i23;
                r31 = i30;
                r32 = i31;
                r2 = i5;
                r14 = i3;
                r3 = i6;
                arrayList = arrayList2;
                r = i8;
                r15 = i7;
                r16 = i9;
                r20 = i17;
                r21 = i18;
                r23 = i22;
                r28 = i27;
                r5 = i13;
                r18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            V0.close();
            return arrayList3;
        } catch (Throwable th) {
            V0.close();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3;
        Integer valueOf2;
        Boolean bool2;
        switch (this.a) {
            case 0:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                return yid.j(playerMatchesEventStatistics != null ? Integer.valueOf(playerMatchesEventStatistics.getBlockPoints()) : null);
            case 1:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM vote_table");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT * FROM vote_table");
                try {
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "userChoice");
                    int r3 = w1a.r(V0, "eventTimestamp");
                    int r4 = w1a.r(V0, "success");
                    int r5 = w1a.r(V0, "voteType");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbVote((int) V0.getLong(r), V0.F0(r2), V0.getLong(r3), ((int) V0.getLong(r4)) != 0, VoteTypeConverter.stringToVoteType(V0.F0(r5))));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("DELETE FROM user_weekly_leaderboard");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                return vxd.i((SharedPreferences) obj, "PREF_WEEKLY_CHALLENGE_MUTED", false);
            case 5:
                Context context = (Context) obj;
                context.getClass();
                return new wy1(context);
            case 6:
                ((dma) obj).getClass();
                return Unit.a;
            case 7:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 8:
                int intValue = ((Integer) obj).intValue();
                return Boolean.valueOf(46 <= intValue && intValue < 61);
            case 9:
                return Boolean.valueOf(((Integer) obj).intValue() >= 60);
            case 10:
                return Boolean.valueOf(((Integer) obj).intValue() > 60);
            case 11:
                int intValue2 = ((Integer) obj).intValue();
                return Boolean.valueOf(intValue2 >= 0 && intValue2 < 16);
            case 12:
                int intValue3 = ((Integer) obj).intValue();
                return Boolean.valueOf(intValue3 >= 0 && intValue3 < 16);
            case 13:
                int intValue4 = ((Integer) obj).intValue();
                return Boolean.valueOf(15 <= intValue4 && intValue4 < 31);
            case 14:
                int intValue5 = ((Integer) obj).intValue();
                return Boolean.valueOf(16 <= intValue5 && intValue5 < 31);
            case 15:
                int intValue6 = ((Integer) obj).intValue();
                return Boolean.valueOf(30 <= intValue6 && intValue6 < 46);
            case 16:
                int intValue7 = ((Integer) obj).intValue();
                return Boolean.valueOf(31 <= intValue7 && intValue7 < 46);
            case 17:
                int intValue8 = ((Integer) obj).intValue();
                return Boolean.valueOf(45 <= intValue8 && intValue8 < 61);
            case 18:
                return ((cal) obj).g;
            case 19:
                return ((cal) obj).b;
            case 20:
                return ((cal) obj).f;
            case 21:
                return ((cal) obj).c;
            case 22:
                return ((cal) obj).e;
            case 23:
                kal kalVar = (kal) obj;
                kalVar.getClass();
                return kalVar;
            case 24:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("DELETE FROM WorkProgress");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 25:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int r6 = w1a.r(V0, "id");
                    int r7 = w1a.r(V0, "state");
                    int r8 = w1a.r(V0, "worker_class_name");
                    int r9 = w1a.r(V0, "input_merger_class_name");
                    int r10 = w1a.r(V0, "input");
                    int r11 = w1a.r(V0, "output");
                    int r12 = w1a.r(V0, "initial_delay");
                    int r13 = w1a.r(V0, "interval_duration");
                    int r14 = w1a.r(V0, "flex_duration");
                    int r15 = w1a.r(V0, "run_attempt_count");
                    int r16 = w1a.r(V0, "backoff_policy");
                    int r17 = w1a.r(V0, "backoff_delay_duration");
                    int r18 = w1a.r(V0, "last_enqueue_time");
                    int r19 = w1a.r(V0, "minimum_retention_duration");
                    int r20 = w1a.r(V0, "schedule_requested_at");
                    int r21 = w1a.r(V0, "run_in_foreground");
                    int r22 = w1a.r(V0, "out_of_quota_policy");
                    int r23 = w1a.r(V0, "period_count");
                    int r24 = w1a.r(V0, "generation");
                    int r25 = w1a.r(V0, "next_schedule_time_override");
                    int r26 = w1a.r(V0, "next_schedule_time_override_generation");
                    int r27 = w1a.r(V0, "stop_reason");
                    int r28 = w1a.r(V0, "trace_tag");
                    int r29 = w1a.r(V0, "backoff_on_system_interruptions");
                    int r30 = w1a.r(V0, "required_network_type");
                    int r31 = w1a.r(V0, "required_network_request");
                    int r32 = w1a.r(V0, "requires_charging");
                    int r33 = w1a.r(V0, "requires_device_idle");
                    int r34 = w1a.r(V0, "requires_battery_not_low");
                    int r35 = w1a.r(V0, "requires_storage_not_low");
                    int r36 = w1a.r(V0, "trigger_content_update_delay");
                    int r37 = w1a.r(V0, "trigger_max_content_delay");
                    int r38 = w1a.r(V0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        String F0 = V0.F0(r6);
                        int i4 = r19;
                        int i5 = r18;
                        sbl E = sha.E((int) V0.getLong(r7));
                        String F02 = V0.F0(r8);
                        String F03 = V0.F0(r9);
                        byte[] blob = V0.getBlob(r10);
                        md4 md4Var = md4.b;
                        md4 y = ww9.y(blob);
                        md4 y2 = ww9.y(V0.getBlob(r11));
                        long j = V0.getLong(r12);
                        long j2 = V0.getLong(r13);
                        long j3 = V0.getLong(r14);
                        int i6 = (int) V0.getLong(r15);
                        int i7 = r7;
                        int i8 = r6;
                        zy0 B = sha.B((int) V0.getLong(r16));
                        long j4 = V0.getLong(r17);
                        long j5 = V0.getLong(i5);
                        long j6 = V0.getLong(i4);
                        int i9 = r20;
                        long j7 = V0.getLong(i9);
                        r20 = i9;
                        int i10 = r21;
                        int i11 = r8;
                        boolean z = ((int) V0.getLong(i10)) != 0;
                        int i12 = r22;
                        pwd D = sha.D((int) V0.getLong(i12));
                        r22 = i12;
                        int i13 = r23;
                        int i14 = (int) V0.getLong(i13);
                        r23 = i13;
                        int i15 = r24;
                        int i16 = (int) V0.getLong(i15);
                        int i17 = r25;
                        long j8 = V0.getLong(i17);
                        int i18 = r26;
                        int i19 = (int) V0.getLong(i18);
                        int i20 = r27;
                        int i21 = (int) V0.getLong(i20);
                        int i22 = r28;
                        String F04 = V0.isNull(i22) ? null : V0.F0(i22);
                        int i23 = r29;
                        if (V0.isNull(i23)) {
                            i = i22;
                            i2 = i20;
                            valueOf = null;
                        } else {
                            i = i22;
                            i2 = i20;
                            valueOf = Integer.valueOf((int) V0.getLong(i23));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i24 = r30;
                        jbd C = sha.C((int) V0.getLong(i24));
                        int i25 = r31;
                        nad Y = sha.Y(V0.getBlob(i25));
                        int i26 = r32;
                        boolean z2 = ((int) V0.getLong(i26)) != 0;
                        int i27 = r33;
                        boolean z3 = ((int) V0.getLong(i27)) != 0;
                        int i28 = r34;
                        boolean z4 = ((int) V0.getLong(i28)) != 0;
                        r34 = i28;
                        int i29 = r35;
                        int i30 = r36;
                        int i31 = r37;
                        r36 = i30;
                        int i32 = r38;
                        r38 = i32;
                        arrayList2.add(new lcl(F0, E, F02, F03, y, y2, j, j2, j3, new zm3(Y, C, z2, z3, z4, ((int) V0.getLong(i29)) != 0, V0.getLong(i30), V0.getLong(i31), sha.o(V0.getBlob(i32))), i6, B, j4, j5, j6, j7, z, D, i14, i16, j8, i19, i21, F04, bool));
                        r8 = i11;
                        r21 = i10;
                        r24 = i15;
                        r26 = i18;
                        r27 = i2;
                        r28 = i;
                        r29 = i23;
                        r30 = i24;
                        r31 = i25;
                        r37 = i31;
                        r35 = i29;
                        r6 = i8;
                        r25 = i17;
                        r32 = i26;
                        r19 = i4;
                        r7 = i7;
                        r33 = i27;
                        r18 = i5;
                    }
                    return arrayList2;
                } finally {
                }
            case 26:
                return a(obj);
            case 27:
                return b(obj);
            case 28:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    V0.L(1, "offline_ping_sender_work");
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(V0.F0(0));
                    }
                    return arrayList3;
                } finally {
                }
            default:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                V0 = glgVar7.V0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int r39 = w1a.r(V0, "id");
                    int r40 = w1a.r(V0, "state");
                    int r41 = w1a.r(V0, "worker_class_name");
                    int r42 = w1a.r(V0, "input_merger_class_name");
                    int r43 = w1a.r(V0, "input");
                    int r44 = w1a.r(V0, "output");
                    int r45 = w1a.r(V0, "initial_delay");
                    int r46 = w1a.r(V0, "interval_duration");
                    int r47 = w1a.r(V0, "flex_duration");
                    int r48 = w1a.r(V0, "run_attempt_count");
                    int r49 = w1a.r(V0, "backoff_policy");
                    int r50 = w1a.r(V0, "backoff_delay_duration");
                    int r51 = w1a.r(V0, "last_enqueue_time");
                    int r52 = w1a.r(V0, "minimum_retention_duration");
                    int r53 = w1a.r(V0, "schedule_requested_at");
                    int r54 = w1a.r(V0, "run_in_foreground");
                    int r55 = w1a.r(V0, "out_of_quota_policy");
                    int r56 = w1a.r(V0, "period_count");
                    int r57 = w1a.r(V0, "generation");
                    int r58 = w1a.r(V0, "next_schedule_time_override");
                    int r59 = w1a.r(V0, "next_schedule_time_override_generation");
                    int r60 = w1a.r(V0, "stop_reason");
                    int r61 = w1a.r(V0, "trace_tag");
                    int r62 = w1a.r(V0, "backoff_on_system_interruptions");
                    int r63 = w1a.r(V0, "required_network_type");
                    int r64 = w1a.r(V0, "required_network_request");
                    int r65 = w1a.r(V0, "requires_charging");
                    int r66 = w1a.r(V0, "requires_device_idle");
                    int r67 = w1a.r(V0, "requires_battery_not_low");
                    int r68 = w1a.r(V0, "requires_storage_not_low");
                    int r69 = w1a.r(V0, "trigger_content_update_delay");
                    int r70 = w1a.r(V0, "trigger_max_content_delay");
                    int r71 = w1a.r(V0, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        String F05 = V0.F0(r39);
                        int i33 = r52;
                        int i34 = r51;
                        sbl E2 = sha.E((int) V0.getLong(r40));
                        String F06 = V0.F0(r41);
                        String F07 = V0.F0(r42);
                        byte[] blob2 = V0.getBlob(r43);
                        md4 md4Var2 = md4.b;
                        md4 y3 = ww9.y(blob2);
                        md4 y4 = ww9.y(V0.getBlob(r44));
                        long j9 = V0.getLong(r45);
                        long j10 = V0.getLong(r46);
                        long j11 = V0.getLong(r47);
                        int i35 = (int) V0.getLong(r48);
                        int i36 = r40;
                        int i37 = r39;
                        zy0 B2 = sha.B((int) V0.getLong(r49));
                        long j12 = V0.getLong(r50);
                        long j13 = V0.getLong(i34);
                        long j14 = V0.getLong(i33);
                        int i38 = r53;
                        long j15 = V0.getLong(i38);
                        int i39 = r41;
                        int i40 = r54;
                        boolean z5 = ((int) V0.getLong(i40)) != 0;
                        r54 = i40;
                        int i41 = r55;
                        pwd D2 = sha.D((int) V0.getLong(i41));
                        r55 = i41;
                        int i42 = r56;
                        int i43 = (int) V0.getLong(i42);
                        r56 = i42;
                        int i44 = r57;
                        int i45 = (int) V0.getLong(i44);
                        long j16 = V0.getLong(r58);
                        int i46 = r59;
                        int i47 = (int) V0.getLong(i46);
                        r57 = i44;
                        r59 = i46;
                        int i48 = r60;
                        int i49 = (int) V0.getLong(i48);
                        int i50 = r61;
                        String F08 = V0.isNull(i50) ? null : V0.F0(i50);
                        int i51 = r62;
                        if (V0.isNull(i51)) {
                            i3 = i49;
                            r61 = i50;
                            valueOf2 = null;
                        } else {
                            i3 = i49;
                            r61 = i50;
                            valueOf2 = Integer.valueOf((int) V0.getLong(i51));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        r62 = i51;
                        r60 = i48;
                        int i52 = r63;
                        jbd C2 = sha.C((int) V0.getLong(i52));
                        int i53 = r64;
                        nad Y2 = sha.Y(V0.getBlob(i53));
                        r63 = i52;
                        int i54 = r65;
                        boolean z6 = ((int) V0.getLong(i54)) != 0;
                        r64 = i53;
                        r65 = i54;
                        int i55 = r66;
                        boolean z7 = ((int) V0.getLong(i55)) != 0;
                        r66 = i55;
                        int i56 = r67;
                        boolean z8 = ((int) V0.getLong(i56)) != 0;
                        int i57 = r68;
                        int i58 = r69;
                        int i59 = r70;
                        r67 = i56;
                        int i60 = r71;
                        r71 = i60;
                        arrayList4.add(new lcl(F05, E2, F06, F07, y3, y4, j9, j10, j11, new zm3(Y2, C2, z6, z7, z8, ((int) V0.getLong(i57)) != 0, V0.getLong(i58), V0.getLong(i59), sha.o(V0.getBlob(i60))), i35, B2, j12, j13, j14, j15, z5, D2, i43, i45, j16, i47, i3, F08, bool2));
                        r68 = i57;
                        r69 = i58;
                        r70 = i59;
                        r52 = i33;
                        r39 = i37;
                        r40 = i36;
                        r41 = i39;
                        r53 = i38;
                        r51 = i34;
                    }
                    return arrayList4;
                } finally {
                }
        }
    }
}
