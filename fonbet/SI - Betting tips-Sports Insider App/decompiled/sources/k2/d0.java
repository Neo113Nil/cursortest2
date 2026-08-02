package k2;

import android.view.View;
import com.sports.insider.data.entity.signin.UserProfile;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.data.repository.room.news.NewsTable;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable;
import com.sports.insider.data.repository.room.support.dp.impl.SupportTable;
import com.sports.insider.data.room.general.table.AccountTable;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18653a;

    public /* synthetic */ d0(int i5) {
        this.f18653a = i5;
    }

    private final Object a(Object obj) {
        int i5;
        Integer valueOf;
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            r02.f(1, 200);
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
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                String V = r02.V(r5);
                int i10 = r20;
                int i11 = r21;
                e3.i0 A = rh.g.A((int) r02.getLong(r6));
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
                int i13 = r5;
                int i14 = r6;
                e3.a v5 = rh.g.v((int) r02.getLong(r18));
                long j11 = r02.getLong(r19);
                long j12 = r02.getLong(i10);
                long j13 = r02.getLong(i11);
                int i15 = r22;
                long j14 = r02.getLong(i15);
                r22 = i15;
                int i16 = r23;
                int i17 = r10;
                boolean z5 = ((int) r02.getLong(i16)) != 0;
                int i18 = r24;
                int i19 = r11;
                e3.f0 z7 = rh.g.z((int) r02.getLong(i18));
                int i20 = r25;
                int i21 = (int) r02.getLong(i20);
                int i22 = r26;
                int i23 = (int) r02.getLong(i22);
                int i24 = r27;
                long j15 = r02.getLong(i24);
                int i25 = r28;
                int i26 = (int) r02.getLong(i25);
                r28 = i25;
                int i27 = r29;
                int i28 = (int) r02.getLong(i27);
                int i29 = r30;
                Boolean bool = null;
                String V4 = r02.isNull(i29) ? null : r02.V(i29);
                int i30 = r31;
                if (r02.isNull(i30)) {
                    i5 = i29;
                    r29 = i27;
                    valueOf = null;
                } else {
                    i5 = i29;
                    r29 = i27;
                    valueOf = Integer.valueOf((int) r02.getLong(i30));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i31 = r32;
                e3.y y5 = rh.g.y((int) r02.getLong(i31));
                int i32 = r33;
                n3.i N = rh.g.N(r02.getBlob(i32));
                int i33 = r34;
                boolean z10 = ((int) r02.getLong(i33)) != 0;
                int i34 = r35;
                boolean z11 = ((int) r02.getLong(i34)) != 0;
                int i35 = r36;
                boolean z12 = ((int) r02.getLong(i35)) != 0;
                r36 = i35;
                int i36 = r37;
                int i37 = r38;
                int i38 = r39;
                r38 = i37;
                int i39 = r40;
                arrayList.add(new m3.o(V, A, V2, V3, k6, k9, j, j6, j10, new e3.f(N, y5, z10, z11, z12, ((int) r02.getLong(i36)) != 0, r02.getLong(i37), r02.getLong(i38), rh.g.b(r02.getBlob(i39))), i12, v5, j11, j12, j13, j14, z5, z7, i21, i23, j15, i26, i28, V4, bool2));
                r35 = i34;
                r11 = i19;
                r24 = i18;
                r25 = i20;
                r26 = i22;
                r27 = i24;
                r30 = i5;
                r31 = i30;
                r32 = i31;
                r33 = i32;
                r34 = i33;
                r40 = i39;
                r39 = i38;
                r37 = i36;
                r5 = i13;
                r10 = i17;
                r20 = i10;
                r21 = i11;
                r6 = i14;
                r23 = i16;
            }
            r02.close();
            return arrayList;
        } catch (Throwable th2) {
            r02.close();
            throw th2;
        }
    }

    private final Object b(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT idCategory, nameCategoryEn, nameCategoryRu, logoCategory FROM sports_table ORDER BY idCategory DESC LIMIT 100");
        try {
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                arrayList.add(new SportsTable((int) r02.getLong(0), r02.V(1), r02.V(2), r02.isNull(3) ? null : r02.V(3)));
            }
            return arrayList;
        } finally {
            r02.close();
        }
    }

    private final Object c(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM frequent_questions_table WHERE question != '' OR answer != '' ");
        try {
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, FrequentQuestionsTable.columnQuestion);
            int r10 = x.r(r02, FrequentQuestionsTable.columnAnswer);
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                arrayList.add(new FrequentQuestionsTable((int) r02.getLong(r5), r02.V(r6), r02.V(r10)));
            }
            return arrayList;
        } finally {
            r02.close();
        }
    }

    private final Object d(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM support_table ORDER BY dateCreate DESC LIMIT ? OFFSET ?");
        try {
            r02.f(1, 100);
            r02.f(2, 0);
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, "remoteId");
            int r10 = x.r(r02, "dateCreate");
            int r11 = x.r(r02, "dateUpdate");
            int r12 = x.r(r02, "stateRead");
            int r13 = x.r(r02, "readDate");
            int r14 = x.r(r02, "sendDate");
            int r15 = x.r(r02, "operatorName");
            int r16 = x.r(r02, NewsTable.TEXT_COLUMN);
            int r17 = x.r(r02, "type");
            int r18 = x.r(r02, "mime");
            int r19 = x.r(r02, EventsTable.contentColumn);
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                int i5 = r6;
                int i10 = r10;
                arrayList.add(new SupportTable((int) r02.getLong(r5), (int) r02.getLong(r6), (int) r02.getLong(r10), (int) r02.getLong(r11), (int) r02.getLong(r12), (int) r02.getLong(r13), (int) r02.getLong(r14), r02.isNull(r15) ? null : r02.V(r15), r02.isNull(r16) ? null : r02.V(r16), (int) r02.getLong(r17), r02.isNull(r18) ? null : r02.V(r18), r02.isNull(r19) ? null : r02.V(r19)));
                r6 = i5;
                r10 = i10;
            }
            return arrayList;
        } finally {
            r02.close();
        }
    }

    private final Object e(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT endTimeLive, endTimePremium, endTimeExpress, endTimeDiamond  FROM account_table WHERE idUser =='user'");
        try {
            return r02.n0() ? new sb.a((int) r02.getLong(0), (int) r02.getLong(1), (int) r02.getLong(2), (int) r02.getLong(3)) : null;
        } finally {
            r02.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.sports.insider.data.room.general.table.AccountTable] */
    private final Object f(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM account_table WHERE idUser =='user'");
        try {
            int r5 = x.r(r02, AccountTable.idUserColumn);
            int r6 = x.r(r02, AccountTable.tokenColumn);
            int r10 = x.r(r02, AccountTable.oldDeviceIdColumn);
            int r11 = x.r(r02, AccountTable.deviceIdColumn);
            int r12 = x.r(r02, AccountTable.countPremiumColumn);
            int r13 = x.r(r02, AccountTable.countExpressColumn);
            int r14 = x.r(r02, AccountTable.emailColumn);
            int r15 = x.r(r02, "name");
            int r16 = x.r(r02, AccountTable.surnameColumn);
            int r17 = x.r(r02, AccountTable.avatarColumn);
            int r18 = x.r(r02, AccountTable.endTimeLiveColumn);
            int r19 = x.r(r02, AccountTable.endTimePremiumColumn);
            int r20 = x.r(r02, AccountTable.endTimeExpressColumn);
            int r21 = x.r(r02, AccountTable.endTimeDiamondColumn);
            if (r02.n0()) {
                r16 = new AccountTable(r02.V(r5), r02.isNull(r6) ? null : r02.V(r6), r02.isNull(r10) ? null : r02.V(r10), r02.isNull(r11) ? null : r02.V(r11), (int) r02.getLong(r12), (int) r02.getLong(r13), r02.isNull(r14) ? null : r02.V(r14), r02.isNull(r15) ? null : r02.V(r15), r02.isNull(r16) ? null : r02.V(r16), r02.isNull(r17) ? null : r02.V(r17), (int) r02.getLong(r18), (int) r02.getLong(r19), (int) r02.getLong(r20), (int) r02.getLong(r21));
            }
            return r16;
        } finally {
            r02.close();
        }
    }

    private final Object g(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT token FROM account_table WHERE idUser =='user'");
        try {
            String str = null;
            if (r02.n0() && !r02.isNull(0)) {
                str = r02.V(0);
            }
            return str;
        } finally {
            r02.close();
        }
    }

    private final Object h(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT deviceId FROM account_table WHERE idUser =='user'");
        try {
            String str = null;
            if (r02.n0() && !r02.isNull(0)) {
                str = r02.V(0);
            }
            return str;
        } finally {
            r02.close();
        }
    }

    private final Object i(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("UPDATE account_table SET name = null, surname = null, avatar = null, email = null WHERE idUser =='user'");
        try {
            r02.n0();
            int q = io.sentry.config.a.q(_connection);
            r02.close();
            return Integer.valueOf(q);
        } catch (Throwable th2) {
            r02.close();
            throw th2;
        }
    }

    private final Object j(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT COUNT(*) FROM account_table WHERE idUser =='user'");
        try {
            int i5 = r02.n0() ? (int) r02.getLong(0) : 0;
            r02.close();
            return Integer.valueOf(i5);
        } catch (Throwable th2) {
            r02.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.sports.insider.data.entity.signin.UserProfile] */
    private final Object k(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT avatar, email, name, surname  FROM account_table WHERE idUser =='user'");
        try {
            String str = null;
            if (r02.n0()) {
                String V = r02.isNull(0) ? null : r02.V(0);
                String V2 = r02.isNull(1) ? null : r02.V(1);
                String V3 = r02.isNull(2) ? null : r02.V(2);
                if (!r02.isNull(3)) {
                    str = r02.V(3);
                }
                str = new UserProfile(V, V2, V3, str);
            }
            return str;
        } finally {
            r02.close();
        }
    }

    private final Object l(Object obj) {
        qg.a buildSerialDescriptor = (qg.a) obj;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        qg.a.a(buildSerialDescriptor, "JsonPrimitive", new tg.p(new pd.v(13)));
        qg.a.a(buildSerialDescriptor, "JsonNull", new tg.p(new pd.v(14)));
        qg.a.a(buildSerialDescriptor, "JsonLiteral", new tg.p(new pd.v(15)));
        qg.a.a(buildSerialDescriptor, "JsonObject", new tg.p(new pd.v(16)));
        qg.a.a(buildSerialDescriptor, "JsonArray", new tg.p(new pd.v(17)));
        return Unit.f19194a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        Integer valueOf3;
        Boolean bool3;
        boolean z5;
        boolean jarRoot$lambda$0;
        boolean openZip$lambda$0;
        switch (this.f18653a) {
            case 0:
                s2.c it = (s2.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.n0());
            case 1:
                s2.c statement = (s2.c) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                hf.r rVar = new hf.r();
                while (statement.n0()) {
                    rVar.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return u0.a(rVar);
            case 2:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return StringsKt.H(it2) ? it2.length() < 4 ? "    " : it2 : "    ".concat(it2);
            case 3:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        arrayList.add(r02.V(0));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("DELETE FROM WorkProgress");
                try {
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 5:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
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
                    ArrayList arrayList2 = new ArrayList();
                    while (r02.n0()) {
                        String V = r02.V(r5);
                        int i5 = r21;
                        int i10 = r20;
                        e3.i0 A = rh.g.A((int) r02.getLong(r6));
                        String V2 = r02.V(r10);
                        String V3 = r02.V(r11);
                        byte[] blob = r02.getBlob(r12);
                        e3.j jVar = e3.j.f8531b;
                        e3.j k6 = rh.g.k(blob);
                        e3.j k9 = rh.g.k(r02.getBlob(r13));
                        long j = r02.getLong(r14);
                        long j6 = r02.getLong(r15);
                        long j10 = r02.getLong(r16);
                        int i11 = (int) r02.getLong(r17);
                        int i12 = r11;
                        int i13 = r10;
                        e3.a v5 = rh.g.v((int) r02.getLong(r18));
                        long j11 = r02.getLong(r19);
                        long j12 = r02.getLong(i10);
                        long j13 = r02.getLong(i5);
                        int i14 = r22;
                        long j14 = r02.getLong(i14);
                        r22 = i14;
                        int i15 = r23;
                        int i16 = r6;
                        boolean z7 = ((int) r02.getLong(i15)) != 0;
                        int i17 = r24;
                        int i18 = r5;
                        e3.f0 z10 = rh.g.z((int) r02.getLong(i17));
                        int i19 = r25;
                        int i20 = (int) r02.getLong(i19);
                        int i21 = r26;
                        int i22 = (int) r02.getLong(i21);
                        int i23 = r27;
                        long j15 = r02.getLong(i23);
                        int i24 = r28;
                        int i25 = (int) r02.getLong(i24);
                        r28 = i24;
                        int i26 = r29;
                        int i27 = (int) r02.getLong(i26);
                        int i28 = r30;
                        String V4 = r02.isNull(i28) ? null : r02.V(i28);
                        int i29 = r31;
                        if (r02.isNull(i29)) {
                            r30 = i28;
                            r29 = i26;
                            valueOf = null;
                        } else {
                            r30 = i28;
                            r29 = i26;
                            valueOf = Integer.valueOf((int) r02.getLong(i29));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i30 = r32;
                        e3.y y5 = rh.g.y((int) r02.getLong(i30));
                        int i31 = r33;
                        n3.i N = rh.g.N(r02.getBlob(i31));
                        int i32 = r34;
                        boolean z11 = ((int) r02.getLong(i32)) != 0;
                        int i33 = r35;
                        boolean z12 = ((int) r02.getLong(i33)) != 0;
                        int i34 = r36;
                        boolean z13 = ((int) r02.getLong(i34)) != 0;
                        r36 = i34;
                        int i35 = r37;
                        int i36 = r38;
                        int i37 = r39;
                        r38 = i36;
                        int i38 = r40;
                        arrayList2.add(new m3.o(V, A, V2, V3, k6, k9, j, j6, j10, new e3.f(N, y5, z11, z12, z13, ((int) r02.getLong(i35)) != 0, r02.getLong(i36), r02.getLong(i37), rh.g.b(r02.getBlob(i38))), i11, v5, j11, j12, j13, j14, z7, z10, i20, i22, j15, i25, i27, V4, bool));
                        r35 = i33;
                        r5 = i18;
                        r24 = i17;
                        r25 = i19;
                        r26 = i21;
                        r27 = i23;
                        r31 = i29;
                        r32 = i30;
                        r33 = i31;
                        r34 = i32;
                        r40 = i38;
                        r39 = i37;
                        r37 = i35;
                        r10 = i13;
                        r6 = i16;
                        r20 = i10;
                        r21 = i5;
                        r11 = i12;
                        r23 = i15;
                    }
                    return arrayList2;
                } finally {
                }
            case 6:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT * FROM workspec WHERE state=1");
                try {
                    int r41 = x.r(r02, "id");
                    int r42 = x.r(r02, "state");
                    int r43 = x.r(r02, "worker_class_name");
                    int r44 = x.r(r02, "input_merger_class_name");
                    int r45 = x.r(r02, "input");
                    int r46 = x.r(r02, "output");
                    int r47 = x.r(r02, "initial_delay");
                    int r48 = x.r(r02, "interval_duration");
                    int r49 = x.r(r02, "flex_duration");
                    int r50 = x.r(r02, "run_attempt_count");
                    int r51 = x.r(r02, "backoff_policy");
                    int r52 = x.r(r02, "backoff_delay_duration");
                    int r53 = x.r(r02, "last_enqueue_time");
                    int r54 = x.r(r02, "minimum_retention_duration");
                    int r55 = x.r(r02, "schedule_requested_at");
                    int r56 = x.r(r02, "run_in_foreground");
                    int r57 = x.r(r02, "out_of_quota_policy");
                    int r58 = x.r(r02, "period_count");
                    int r59 = x.r(r02, "generation");
                    int r60 = x.r(r02, "next_schedule_time_override");
                    int r61 = x.r(r02, "next_schedule_time_override_generation");
                    int r62 = x.r(r02, "stop_reason");
                    int r63 = x.r(r02, "trace_tag");
                    int r64 = x.r(r02, "backoff_on_system_interruptions");
                    int r65 = x.r(r02, "required_network_type");
                    int r66 = x.r(r02, "required_network_request");
                    int r67 = x.r(r02, "requires_charging");
                    int r68 = x.r(r02, "requires_device_idle");
                    int r69 = x.r(r02, "requires_battery_not_low");
                    int r70 = x.r(r02, "requires_storage_not_low");
                    int r71 = x.r(r02, "trigger_content_update_delay");
                    int r72 = x.r(r02, "trigger_max_content_delay");
                    int r73 = x.r(r02, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        String V5 = r02.V(r41);
                        int i39 = r54;
                        int i40 = r53;
                        e3.i0 A2 = rh.g.A((int) r02.getLong(r42));
                        String V6 = r02.V(r43);
                        String V7 = r02.V(r44);
                        byte[] blob2 = r02.getBlob(r45);
                        e3.j jVar2 = e3.j.f8531b;
                        e3.j k10 = rh.g.k(blob2);
                        e3.j k11 = rh.g.k(r02.getBlob(r46));
                        long j16 = r02.getLong(r47);
                        long j17 = r02.getLong(r48);
                        long j18 = r02.getLong(r49);
                        int i41 = (int) r02.getLong(r50);
                        int i42 = r44;
                        int i43 = r43;
                        e3.a v10 = rh.g.v((int) r02.getLong(r51));
                        long j19 = r02.getLong(r52);
                        long j20 = r02.getLong(i40);
                        long j21 = r02.getLong(i39);
                        int i44 = r55;
                        long j22 = r02.getLong(i44);
                        int i45 = r42;
                        int i46 = r56;
                        boolean z14 = ((int) r02.getLong(i46)) != 0;
                        int i47 = r41;
                        int i48 = r57;
                        e3.f0 z15 = rh.g.z((int) r02.getLong(i48));
                        r57 = i48;
                        int i49 = r58;
                        int i50 = (int) r02.getLong(i49);
                        r58 = i49;
                        int i51 = r59;
                        int i52 = (int) r02.getLong(i51);
                        int i53 = r60;
                        long j23 = r02.getLong(i53);
                        int i54 = r61;
                        int i55 = (int) r02.getLong(i54);
                        r61 = i54;
                        int i56 = r62;
                        int i57 = (int) r02.getLong(i56);
                        int i58 = r63;
                        String V8 = r02.isNull(i58) ? null : r02.V(i58);
                        int i59 = r64;
                        if (r02.isNull(i59)) {
                            r63 = i58;
                            r62 = i56;
                            valueOf2 = null;
                        } else {
                            r63 = i58;
                            r62 = i56;
                            valueOf2 = Integer.valueOf((int) r02.getLong(i59));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        int i60 = r65;
                        e3.y y10 = rh.g.y((int) r02.getLong(i60));
                        int i61 = r66;
                        n3.i N2 = rh.g.N(r02.getBlob(i61));
                        int i62 = r67;
                        boolean z16 = ((int) r02.getLong(i62)) != 0;
                        int i63 = r68;
                        boolean z17 = ((int) r02.getLong(i63)) != 0;
                        int i64 = r69;
                        boolean z18 = ((int) r02.getLong(i64)) != 0;
                        r69 = i64;
                        int i65 = r70;
                        int i66 = r71;
                        int i67 = r72;
                        r71 = i66;
                        int i68 = r73;
                        arrayList3.add(new m3.o(V5, A2, V6, V7, k10, k11, j16, j17, j18, new e3.f(N2, y10, z16, z17, z18, ((int) r02.getLong(i65)) != 0, r02.getLong(i66), r02.getLong(i67), rh.g.b(r02.getBlob(i68))), i41, v10, j19, j20, j21, j22, z14, z15, i50, i52, j23, i55, i57, V8, bool2));
                        r68 = i63;
                        r41 = i47;
                        r56 = i46;
                        r59 = i51;
                        r60 = i53;
                        r64 = i59;
                        r65 = i60;
                        r66 = i61;
                        r67 = i62;
                        r73 = i68;
                        r72 = i67;
                        r70 = i65;
                        r54 = i39;
                        r43 = i43;
                        r44 = i42;
                        r42 = i45;
                        r55 = i44;
                        r53 = i40;
                    }
                    return arrayList3;
                } finally {
                }
            case 7:
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int r74 = x.r(r02, "id");
                    int r75 = x.r(r02, "state");
                    int r76 = x.r(r02, "worker_class_name");
                    int r77 = x.r(r02, "input_merger_class_name");
                    int r78 = x.r(r02, "input");
                    int r79 = x.r(r02, "output");
                    int r80 = x.r(r02, "initial_delay");
                    int r81 = x.r(r02, "interval_duration");
                    int r82 = x.r(r02, "flex_duration");
                    int r83 = x.r(r02, "run_attempt_count");
                    int r84 = x.r(r02, "backoff_policy");
                    int r85 = x.r(r02, "backoff_delay_duration");
                    int r86 = x.r(r02, "last_enqueue_time");
                    int r87 = x.r(r02, "minimum_retention_duration");
                    int r88 = x.r(r02, "schedule_requested_at");
                    int r89 = x.r(r02, "run_in_foreground");
                    int r90 = x.r(r02, "out_of_quota_policy");
                    int r91 = x.r(r02, "period_count");
                    int r92 = x.r(r02, "generation");
                    int r93 = x.r(r02, "next_schedule_time_override");
                    int r94 = x.r(r02, "next_schedule_time_override_generation");
                    int r95 = x.r(r02, "stop_reason");
                    int r96 = x.r(r02, "trace_tag");
                    int r97 = x.r(r02, "backoff_on_system_interruptions");
                    int r98 = x.r(r02, "required_network_type");
                    int r99 = x.r(r02, "required_network_request");
                    int r100 = x.r(r02, "requires_charging");
                    int r101 = x.r(r02, "requires_device_idle");
                    int r102 = x.r(r02, "requires_battery_not_low");
                    int r103 = x.r(r02, "requires_storage_not_low");
                    int r104 = x.r(r02, "trigger_content_update_delay");
                    int r105 = x.r(r02, "trigger_max_content_delay");
                    int r106 = x.r(r02, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (r02.n0()) {
                        String V9 = r02.V(r74);
                        int i69 = r87;
                        int i70 = r86;
                        e3.i0 A3 = rh.g.A((int) r02.getLong(r75));
                        String V10 = r02.V(r76);
                        String V11 = r02.V(r77);
                        byte[] blob3 = r02.getBlob(r78);
                        e3.j jVar3 = e3.j.f8531b;
                        e3.j k12 = rh.g.k(blob3);
                        e3.j k13 = rh.g.k(r02.getBlob(r79));
                        long j24 = r02.getLong(r80);
                        long j25 = r02.getLong(r81);
                        long j26 = r02.getLong(r82);
                        int i71 = (int) r02.getLong(r83);
                        int i72 = r77;
                        int i73 = r76;
                        e3.a v11 = rh.g.v((int) r02.getLong(r84));
                        long j27 = r02.getLong(r85);
                        long j28 = r02.getLong(i70);
                        long j29 = r02.getLong(i69);
                        int i74 = r88;
                        long j30 = r02.getLong(i74);
                        int i75 = r75;
                        int i76 = r89;
                        boolean z19 = ((int) r02.getLong(i76)) != 0;
                        int i77 = r74;
                        int i78 = r90;
                        e3.f0 z20 = rh.g.z((int) r02.getLong(i78));
                        r90 = i78;
                        int i79 = r91;
                        int i80 = (int) r02.getLong(i79);
                        r91 = i79;
                        int i81 = r92;
                        int i82 = (int) r02.getLong(i81);
                        int i83 = r93;
                        long j31 = r02.getLong(i83);
                        int i84 = r94;
                        int i85 = (int) r02.getLong(i84);
                        r94 = i84;
                        int i86 = r95;
                        int i87 = (int) r02.getLong(i86);
                        int i88 = r96;
                        String V12 = r02.isNull(i88) ? null : r02.V(i88);
                        int i89 = r97;
                        if (r02.isNull(i89)) {
                            r96 = i88;
                            r95 = i86;
                            valueOf3 = null;
                        } else {
                            r96 = i88;
                            r95 = i86;
                            valueOf3 = Integer.valueOf((int) r02.getLong(i89));
                        }
                        if (valueOf3 != null) {
                            bool3 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool3 = null;
                        }
                        int i90 = r98;
                        e3.y y11 = rh.g.y((int) r02.getLong(i90));
                        int i91 = r99;
                        n3.i N3 = rh.g.N(r02.getBlob(i91));
                        int i92 = r100;
                        boolean z21 = ((int) r02.getLong(i92)) != 0;
                        int i93 = r101;
                        boolean z22 = ((int) r02.getLong(i93)) != 0;
                        int i94 = r102;
                        boolean z23 = ((int) r02.getLong(i94)) != 0;
                        r102 = i94;
                        int i95 = r103;
                        int i96 = r104;
                        int i97 = r105;
                        r104 = i96;
                        int i98 = r106;
                        arrayList4.add(new m3.o(V9, A3, V10, V11, k12, k13, j24, j25, j26, new e3.f(N3, y11, z21, z22, z23, ((int) r02.getLong(i95)) != 0, r02.getLong(i96), r02.getLong(i97), rh.g.b(r02.getBlob(i98))), i71, v11, j27, j28, j29, j30, z19, z20, i80, i82, j31, i85, i87, V12, bool3));
                        r101 = i93;
                        r74 = i77;
                        r89 = i76;
                        r92 = i81;
                        r93 = i83;
                        r97 = i89;
                        r98 = i90;
                        r99 = i91;
                        r100 = i92;
                        r106 = i98;
                        r105 = i97;
                        r103 = i95;
                        r87 = i69;
                        r76 = i73;
                        r77 = i72;
                        r75 = i75;
                        r88 = i74;
                        r86 = i70;
                    }
                    return arrayList4;
                } finally {
                }
            case 8:
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i99 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i99);
                } finally {
                }
            case 9:
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (r02.n0()) {
                        z5 = ((int) r02.getLong(0)) != 0;
                    } else {
                        z5 = false;
                    }
                    r02.close();
                    return Boolean.valueOf(z5);
                } finally {
                }
            case 10:
                return a(obj);
            case 11:
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection8);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 12:
                View view = (View) obj;
                Object context = view != null ? view.getContext() : null;
                com.sports.insider.ui.activities.a aVar = context instanceof com.sports.insider.ui.activities.a ? (com.sports.insider.ui.activities.a) context : null;
                if (aVar != null) {
                    com.sports.insider.ui.activities.a.u(aVar, 2);
                }
                return Unit.f19194a;
            case 13:
                jarRoot$lambda$0 = ResourceFileSystem.toJarRoot$lambda$0((ZipEntry) obj);
                return Boolean.valueOf(jarRoot$lambda$0);
            case 14:
                openZip$lambda$0 = ZipFilesKt.openZip$lambda$0((ZipEntry) obj);
                return Boolean.valueOf(openZip$lambda$0);
            case 15:
                return b(obj);
            case 16:
                Intrinsics.checkNotNullParameter((qg.a) obj, "<this>");
                return Unit.f19194a;
            case 17:
                return c(obj);
            case 18:
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("DELETE FROM support_table WHERE type == 1");
                try {
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection9);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
            case 19:
                s2.a _connection10 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection10, "_connection");
                r02 = _connection10.r0("DELETE FROM support_table WHERE type == 2");
                try {
                    r02.n0();
                    int q10 = io.sentry.config.a.q(_connection10);
                    r02.close();
                    return Integer.valueOf(q10);
                } finally {
                }
            case 20:
                return d(obj);
            case 21:
                return e(obj);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return f(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return h(obj);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return i(obj);
            case C0122e9.F /* 25 */:
                return j(obj);
            case C0122e9.G /* 26 */:
                return g(obj);
            case C0122e9.H /* 27 */:
                return k(obj);
            case 28:
                return l(obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                tg.m mVar = (tg.m) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                ug.v.a(sb2, str);
                sb2.append(':');
                sb2.append(mVar);
                return sb2.toString();
        }
    }
}
