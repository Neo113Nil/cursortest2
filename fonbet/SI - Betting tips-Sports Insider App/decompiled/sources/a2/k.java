package a2;

import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.data.repository.room.billing.SkuDetailsTable;
import e3.f0;
import e3.i0;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import k2.x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43b;

    public /* synthetic */ k(String str, int i5) {
        this.f42a = i5;
        this.f43b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        boolean z5;
        boolean z7;
        m3.o oVar;
        Boolean bool;
        i0 i0Var;
        int i5 = this.f42a;
        String str = this.f43b;
        switch (i5) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.f19192a, str));
            case 1:
                return Boolean.valueOf(Intrinsics.areEqual((String) obj, str));
            case 2:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT COUNT(*)  FROM account_setting_table WHERE account_setting_id_name == ?");
                try {
                    r02.B(1, str);
                    int i10 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i10);
                } finally {
                }
            case 3:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT account_setting_value_name FROM account_setting_table WHERE account_setting_id_name == ?");
                try {
                    r02.B(1, str);
                    return (!r02.n0() || r02.isNull(0)) ? null : Integer.valueOf((int) r02.getLong(0));
                } finally {
                }
            case 4:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT COUNT(*) FROM sku_details_table  WHERE sku ==?");
                try {
                    r02.B(1, str);
                    int i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 5:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT id FROM sku_id_content_type_table WHERE id == ?");
                try {
                    r02.B(1, str);
                    return (!r02.n0() || r02.isNull(0)) ? null : r02.V(0);
                } finally {
                }
            case 6:
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("SELECT * FROM sku_details_table  WHERE sku ==?");
                try {
                    r02.B(1, str);
                    return r02.n0() ? new SkuDetailsTable(r02.V(x.r(r02, PurchaseSubsTable.skuColumn)), r02.V(x.r(r02, PurchaseSubsTable.jsonStringColumn))) : null;
                } finally {
                }
            case 7:
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    r02.B(1, str);
                    if (r02.n0()) {
                        if (((int) r02.getLong(0)) != 0) {
                            z5 = true;
                            r02.close();
                            return Boolean.valueOf(z5);
                        }
                    }
                    z5 = false;
                    r02.close();
                    return Boolean.valueOf(z5);
                } finally {
                }
            case 8:
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    r02.B(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        arrayList.add(r02.V(0));
                    }
                    return arrayList;
                } finally {
                }
            case 9:
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    r02.B(1, str);
                    if (r02.n0()) {
                        if (((int) r02.getLong(0)) != 0) {
                            z7 = true;
                            r02.close();
                            return Boolean.valueOf(z7);
                        }
                    }
                    z7 = false;
                    r02.close();
                    return Boolean.valueOf(z7);
                } finally {
                }
            case 10:
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("SELECT long_value FROM Preference where `key`=?");
                try {
                    r02.B(1, str);
                    return (!r02.n0() || r02.isNull(0)) ? null : Long.valueOf(r02.getLong(0));
                } finally {
                }
            case 11:
                s2.a _connection10 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection10, "_connection");
                r02 = _connection10.r0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 12:
                s2.a _connection11 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection11, "_connection");
                r02 = _connection11.r0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    r02.B(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (r02.n0()) {
                        arrayList2.add(r02.V(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                s2.a _connection12 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection12, "_connection");
                r02 = _connection12.r0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 14:
                s2.a _connection13 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection13, "_connection");
                r02 = _connection13.r0("SELECT * FROM workspec WHERE id=?");
                try {
                    r02.B(1, str);
                    int r5 = x.r(r02, "id");
                    int r6 = x.r(r02, "state");
                    int r10 = x.r(r02, "worker_class_name");
                    int r11 = x.r(r02, "input_merger_class_name");
                    int r12 = x.r(r02, "input");
                    int r13 = x.r(r02, "output");
                    int r14 = x.r(r02, "initial_delay");
                    int r15 = x.r(r02, "interval_duration");
                    int r16 = x.r(r02, "flex_duration");
                    int r17 = x.r(r02, "run_attempt_count");
                    int r18 = x.r(r02, "backoff_policy");
                    int r19 = x.r(r02, "backoff_delay_duration");
                    int r20 = x.r(r02, "last_enqueue_time");
                    int r21 = x.r(r02, "minimum_retention_duration");
                    int r22 = x.r(r02, "schedule_requested_at");
                    int r23 = x.r(r02, "run_in_foreground");
                    int r24 = x.r(r02, "out_of_quota_policy");
                    int r25 = x.r(r02, "period_count");
                    int r26 = x.r(r02, "generation");
                    int r27 = x.r(r02, "next_schedule_time_override");
                    int r28 = x.r(r02, "next_schedule_time_override_generation");
                    int r29 = x.r(r02, "stop_reason");
                    int r30 = x.r(r02, "trace_tag");
                    int r31 = x.r(r02, "backoff_on_system_interruptions");
                    int r32 = x.r(r02, "required_network_type");
                    int r33 = x.r(r02, "required_network_request");
                    int r34 = x.r(r02, "requires_charging");
                    int r35 = x.r(r02, "requires_device_idle");
                    int r36 = x.r(r02, "requires_battery_not_low");
                    int r37 = x.r(r02, "requires_storage_not_low");
                    int r38 = x.r(r02, "trigger_content_update_delay");
                    int r39 = x.r(r02, "trigger_max_content_delay");
                    int r40 = x.r(r02, "content_uri_triggers");
                    if (r02.n0()) {
                        String V = r02.V(r5);
                        i0 A = rh.g.A((int) r02.getLong(r6));
                        String V2 = r02.V(r10);
                        String V3 = r02.V(r11);
                        byte[] blob = r02.getBlob(r12);
                        e3.j jVar = e3.j.f8531b;
                        e3.j k6 = rh.g.k(blob);
                        e3.j k9 = rh.g.k(r02.getBlob(r13));
                        long j = r02.getLong(r14);
                        long j6 = r02.getLong(r15);
                        long j10 = r02.getLong(r16);
                        int i12 = (int) r02.getLong(r17);
                        e3.a v5 = rh.g.v((int) r02.getLong(r18));
                        long j11 = r02.getLong(r19);
                        long j12 = r02.getLong(r20);
                        long j13 = r02.getLong(r21);
                        long j14 = r02.getLong(r22);
                        boolean z10 = ((int) r02.getLong(r23)) != 0;
                        f0 z11 = rh.g.z((int) r02.getLong(r24));
                        int i13 = (int) r02.getLong(r25);
                        int i14 = (int) r02.getLong(r26);
                        long j15 = r02.getLong(r27);
                        int i15 = (int) r02.getLong(r28);
                        int i16 = (int) r02.getLong(r29);
                        String V4 = r02.isNull(r30) ? null : r02.V(r30);
                        Integer valueOf = r02.isNull(r31) ? null : Integer.valueOf((int) r02.getLong(r31));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        oVar = new m3.o(V, A, V2, V3, k6, k9, j, j6, j10, new e3.f(rh.g.N(r02.getBlob(r33)), rh.g.y((int) r02.getLong(r32)), ((int) r02.getLong(r34)) != 0, ((int) r02.getLong(r35)) != 0, ((int) r02.getLong(r36)) != 0, ((int) r02.getLong(r37)) != 0, r02.getLong(r38), r02.getLong(r39), rh.g.b(r02.getBlob(r40))), i12, v5, j11, j12, j13, j14, z10, z11, i13, i14, j15, i15, i16, V4, bool);
                    } else {
                        oVar = null;
                    }
                    return oVar;
                } finally {
                }
            case 15:
                s2.a _connection14 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection14, "_connection");
                r02 = _connection14.r0("SELECT state FROM workspec WHERE id=?");
                try {
                    r02.B(1, str);
                    if (r02.n0()) {
                        Integer valueOf2 = r02.isNull(0) ? null : Integer.valueOf((int) r02.getLong(0));
                        if (valueOf2 != null) {
                            i0Var = rh.g.A(valueOf2.intValue());
                            return i0Var;
                        }
                    }
                    i0Var = null;
                    return i0Var;
                } finally {
                }
            case 16:
                s2.a _connection15 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection15, "_connection");
                r02 = _connection15.r0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    r02.B(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        arrayList3.add(r02.V(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                s2.a _connection16 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection16, "_connection");
                r02 = _connection16.r0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection16);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 18:
                s2.a _connection17 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection17, "_connection");
                r02 = _connection17.r0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection17);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
            case 19:
                s2.a _connection18 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection18, "_connection");
                r02 = _connection18.r0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 20:
                s2.a _connection19 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection19, "_connection");
                r02 = _connection19.r0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    r02.B(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (r02.n0()) {
                        byte[] blob2 = r02.getBlob(0);
                        e3.j jVar2 = e3.j.f8531b;
                        arrayList4.add(rh.g.k(blob2));
                    }
                    return arrayList4;
                } finally {
                }
            case 21:
                s2.a _connection20 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection20, "_connection");
                r02 = _connection20.r0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    int q10 = io.sentry.config.a.q(_connection20);
                    r02.close();
                    return Integer.valueOf(q10);
                } finally {
                }
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                s2.a _connection21 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection21, "_connection");
                r02 = _connection21.r0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    r02.B(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (r02.n0()) {
                        arrayList5.add(r02.V(0));
                    }
                    return arrayList5;
                } finally {
                }
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                s2.a _connection22 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection22, "_connection");
                r02 = _connection22.r0("DELETE FROM workspec WHERE id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                s2.a _connection23 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection23, "_connection");
                r02 = _connection23.r0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    r02.B(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (r02.n0()) {
                        String id2 = r02.V(0);
                        i0 state = rh.g.A((int) r02.getLong(1));
                        Intrinsics.checkNotNullParameter(id2, "id");
                        Intrinsics.checkNotNullParameter(state, "state");
                        m3.n nVar = new m3.n();
                        nVar.f20328a = id2;
                        nVar.f20329b = state;
                        arrayList6.add(nVar);
                    }
                    return arrayList6;
                } finally {
                }
            case C0122e9.F /* 25 */:
                s2.a _connection24 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection24, "_connection");
                r02 = _connection24.r0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    r02.B(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (r02.n0()) {
                        arrayList7.add(r02.V(0));
                    }
                    return arrayList7;
                } finally {
                }
            case C0122e9.G /* 26 */:
                s2.a _connection25 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection25, "_connection");
                r02 = _connection25.r0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    r02.B(1, str);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case C0122e9.H /* 27 */:
                s2.a _connection26 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection26, "_connection");
                r02 = _connection26.r0("SELECT COUNT(*) FROM order_table  WHERE `order` ==?");
                try {
                    r02.B(1, str);
                    int i17 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i17);
                } finally {
                }
            default:
                s2.a _connection27 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection27, "_connection");
                r02 = _connection27.r0("UPDATE account_table SET token = ? WHERE idUser =='user'");
                try {
                    if (str == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str);
                    }
                    r02.n0();
                    int q11 = io.sentry.config.a.q(_connection27);
                    r02.close();
                    return Integer.valueOf(q11);
                } finally {
                }
        }
    }
}
