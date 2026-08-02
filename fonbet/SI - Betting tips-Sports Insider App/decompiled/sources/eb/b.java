package eb;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.repository.room.billing.PricesTable;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.data.repository.room.news.NewsTable;
import com.sports.insider.data.repository.room.support.dp.impl.SupportTable;
import com.sports.insider.data.room.general.table.OrdersTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import e3.f0;
import e3.i0;
import e3.y;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import k2.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8801b;

    public /* synthetic */ b(int i5, int i10) {
        this.f8800a = i10;
        this.f8801b = i5;
    }

    private final Object a(Object obj) {
        int i5;
        int i10;
        Integer valueOf;
        int i11;
        int i12;
        Integer valueOf2;
        int i13;
        int i14;
        Integer valueOf3;
        int i15;
        Integer valueOf4;
        int i16;
        Integer valueOf5;
        int i17;
        int i18 = this.f8801b;
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE publication != 0 AND id in (SELECT PK.idPrediction FROM prediction_kind_table PK WHERE PK.idKind == ?) ORDER BY startTime DESC");
        try {
            r02.f(1, i18);
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, PredictionTable.startTimeColumn);
            int r10 = x.r(r02, PredictionTable.publicationColumn);
            int r11 = x.r(r02, "type");
            int r12 = x.r(r02, PredictionTable.statusColumn);
            int r13 = x.r(r02, PredictionTable.imageBackgroundColumn);
            int r14 = x.r(r02, PredictionTable.oddsColumn);
            int r15 = x.r(r02, "purchased");
            int r16 = x.r(r02, PredictionTable.forecastsColumn);
            int r17 = x.r(r02, PredictionTable.arrayKindColumn);
            int r18 = x.r(r02, PredictionTable.oddsForecastColumn);
            int r19 = x.r(r02, PredictionTable.forecastColumn);
            int r20 = x.r(r02, PredictionTable.teamHomeIdColumn);
            int r21 = x.r(r02, PredictionTable.teamGuestIdColumn);
            int r22 = x.r(r02, PredictionTable.teamHomeFlagColumn);
            int r23 = x.r(r02, PredictionTable.teamGuestFlagColumn);
            int r24 = x.r(r02, PredictionTable.teamHomeNameColumn);
            int r25 = x.r(r02, PredictionTable.teamGuestNameColumn);
            int r26 = x.r(r02, PredictionTable.scoreHomeColumn);
            int r27 = x.r(r02, PredictionTable.scoreGuestColumn);
            int r28 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
            int r29 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                int i19 = r20;
                int i20 = r21;
                int i21 = (int) r02.getLong(r5);
                int i22 = (int) r02.getLong(r6);
                int i23 = (int) r02.getLong(r10);
                int i24 = r6;
                int i25 = r10;
                int i26 = (int) r02.getLong(r11);
                Integer num = null;
                String V = r02.isNull(r12) ? null : r02.V(r12);
                String V2 = r02.isNull(r13) ? null : r02.V(r13);
                String V3 = r02.isNull(r14) ? null : r02.V(r14);
                int i27 = (int) r02.getLong(r15);
                String V4 = r02.isNull(r16) ? null : r02.V(r16);
                String V5 = r02.isNull(r17) ? null : r02.V(r17);
                String V6 = r02.isNull(r18) ? null : r02.V(r18);
                String V7 = r02.isNull(r19) ? null : r02.V(r19);
                if (r02.isNull(i19)) {
                    i5 = r11;
                    i10 = r12;
                    valueOf = null;
                } else {
                    i5 = r11;
                    i10 = r12;
                    valueOf = Integer.valueOf((int) r02.getLong(i19));
                }
                if (r02.isNull(i20)) {
                    i11 = i27;
                    i12 = i19;
                    valueOf2 = null;
                } else {
                    i11 = i27;
                    i12 = i19;
                    valueOf2 = Integer.valueOf((int) r02.getLong(i20));
                }
                int i28 = r22;
                String V8 = r02.isNull(i28) ? null : r02.V(i28);
                int i29 = r23;
                String V9 = r02.isNull(i29) ? null : r02.V(i29);
                int i30 = r5;
                int i31 = r24;
                String V10 = r02.isNull(i31) ? null : r02.V(i31);
                r24 = i31;
                int i32 = r25;
                String V11 = r02.isNull(i32) ? null : r02.V(i32);
                r25 = i32;
                int i33 = r26;
                if (r02.isNull(i33)) {
                    i13 = i28;
                    i14 = i29;
                    valueOf3 = null;
                } else {
                    i13 = i28;
                    i14 = i29;
                    valueOf3 = Integer.valueOf((int) r02.getLong(i33));
                }
                int i34 = r27;
                if (r02.isNull(i34)) {
                    i15 = i20;
                    valueOf4 = null;
                } else {
                    i15 = i20;
                    valueOf4 = Integer.valueOf((int) r02.getLong(i34));
                }
                int i35 = r28;
                if (r02.isNull(i35)) {
                    i16 = i12;
                    valueOf5 = null;
                } else {
                    i16 = i12;
                    valueOf5 = Integer.valueOf((int) r02.getLong(i35));
                }
                int i36 = r29;
                if (r02.isNull(i36)) {
                    i17 = i34;
                    r28 = i35;
                } else {
                    i17 = i34;
                    r28 = i35;
                    num = Integer.valueOf((int) r02.getLong(i36));
                }
                arrayList.add(new ja.c(i21, i22, i23, i26, V, V3, V2, V6, V7, i11, V5, V4, valueOf3, valueOf4, valueOf5, num, valueOf, valueOf2, V8, V9, V10, V11));
                r5 = i30;
                r22 = i13;
                r23 = i14;
                r26 = i33;
                r29 = i36;
                r6 = i24;
                r20 = i16;
                r11 = i5;
                r21 = i15;
                r10 = i25;
                r27 = i17;
                r12 = i10;
            }
            return arrayList;
        } finally {
            r02.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ja.c] */
    private final Object b(Object obj) {
        int i5 = this.f8801b;
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM table_prediction_preview WHERE id == ?");
        try {
            r02.f(1, i5);
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, PredictionTable.startTimeColumn);
            int r10 = x.r(r02, PredictionTable.publicationColumn);
            int r11 = x.r(r02, "type");
            int r12 = x.r(r02, PredictionTable.statusColumn);
            int r13 = x.r(r02, PredictionTable.imageBackgroundColumn);
            int r14 = x.r(r02, PredictionTable.oddsColumn);
            int r15 = x.r(r02, "purchased");
            int r16 = x.r(r02, PredictionTable.forecastsColumn);
            int r17 = x.r(r02, PredictionTable.arrayKindColumn);
            int r18 = x.r(r02, PredictionTable.oddsForecastColumn);
            int r19 = x.r(r02, PredictionTable.forecastColumn);
            int r20 = x.r(r02, PredictionTable.teamHomeIdColumn);
            int r21 = x.r(r02, PredictionTable.teamGuestIdColumn);
            int r22 = x.r(r02, PredictionTable.teamHomeFlagColumn);
            int r23 = x.r(r02, PredictionTable.teamGuestFlagColumn);
            int r24 = x.r(r02, PredictionTable.teamHomeNameColumn);
            int r25 = x.r(r02, PredictionTable.teamGuestNameColumn);
            int r26 = x.r(r02, PredictionTable.scoreHomeColumn);
            int r27 = x.r(r02, PredictionTable.scoreGuestColumn);
            int r28 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
            int r29 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
            if (r02.n0()) {
                int i10 = (int) r02.getLong(r5);
                int i11 = (int) r02.getLong(r6);
                int i12 = (int) r02.getLong(r10);
                int i13 = (int) r02.getLong(r11);
                String V = r02.isNull(r12) ? null : r02.V(r12);
                String V2 = r02.isNull(r13) ? null : r02.V(r13);
                String V3 = r02.isNull(r14) ? null : r02.V(r14);
                int i14 = (int) r02.getLong(r15);
                String V4 = r02.isNull(r16) ? null : r02.V(r16);
                r23 = new ja.c(i10, i11, i12, i13, V, V3, V2, r02.isNull(r18) ? null : r02.V(r18), r02.isNull(r19) ? null : r02.V(r19), i14, r02.isNull(r17) ? null : r02.V(r17), V4, r02.isNull(r26) ? null : Integer.valueOf((int) r02.getLong(r26)), r02.isNull(r27) ? null : Integer.valueOf((int) r02.getLong(r27)), r02.isNull(r28) ? null : Integer.valueOf((int) r02.getLong(r28)), r02.isNull(r29) ? null : Integer.valueOf((int) r02.getLong(r29)), r02.isNull(r20) ? null : Integer.valueOf((int) r02.getLong(r20)), r02.isNull(r21) ? null : Integer.valueOf((int) r02.getLong(r21)), r02.isNull(r22) ? null : r02.V(r22), r02.isNull(r23) ? null : r02.V(r23), r02.isNull(r24) ? null : r02.V(r24), r02.isNull(r25) ? null : r02.V(r25));
            }
            return r23;
        } finally {
            r02.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.sports.insider.data.room.general.table.predictions.PredictionTable] */
    private final Object c(Object obj) {
        int i5 = this.f8801b;
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT * FROM table_prediction WHERE id == ?");
        try {
            r02.f(1, i5);
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, PredictionTable.startTimeColumn);
            int r10 = x.r(r02, PredictionTable.publicationColumn);
            int r11 = x.r(r02, "type");
            int r12 = x.r(r02, PredictionTable.statusColumn);
            int r13 = x.r(r02, PredictionTable.imageBackgroundColumn);
            int r14 = x.r(r02, PredictionTable.oddsColumn);
            int r15 = x.r(r02, PredictionTable.resultsIsViewedColumn);
            int r16 = x.r(r02, PredictionTable.analyticsFullColumn);
            int r17 = x.r(r02, PredictionTable.analyticsShortColumn);
            int r18 = x.r(r02, PredictionTable.leagueColumn);
            int r19 = x.r(r02, PredictionTable.forecastsColumn);
            int r20 = x.r(r02, PredictionTable.arrayKindColumn);
            int r21 = x.r(r02, PredictionTable.arrayPredictionColumn);
            int r22 = x.r(r02, PredictionTable.oddsForecastColumn);
            int r23 = x.r(r02, PredictionTable.forecastColumn);
            int r24 = x.r(r02, PredictionTable.teamHomeIdColumn);
            int r25 = x.r(r02, PredictionTable.teamGuestIdColumn);
            int r26 = x.r(r02, PredictionTable.teamHomeFlagColumn);
            int r27 = x.r(r02, PredictionTable.teamGuestFlagColumn);
            int r28 = x.r(r02, PredictionTable.teamHomeNameColumn);
            int r29 = x.r(r02, PredictionTable.teamGuestNameColumn);
            int r30 = x.r(r02, PredictionTable.scoreHomeColumn);
            int r31 = x.r(r02, PredictionTable.scoreGuestColumn);
            int r32 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
            int r33 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
            if (r02.n0()) {
                r27 = new PredictionTable((int) r02.getLong(r5), (int) r02.getLong(r6), (int) r02.getLong(r10), (int) r02.getLong(r11), r02.isNull(r12) ? null : r02.V(r12), r02.isNull(r13) ? null : r02.V(r13), r02.isNull(r14) ? null : r02.V(r14), (int) r02.getLong(r15), r02.isNull(r16) ? null : r02.V(r16), r02.isNull(r17) ? null : r02.V(r17), r02.isNull(r18) ? null : r02.V(r18), r02.isNull(r19) ? null : r02.V(r19), r02.isNull(r20) ? null : r02.V(r20), r02.isNull(r21) ? null : r02.V(r21), r02.isNull(r22) ? null : r02.V(r22), r02.isNull(r23) ? null : r02.V(r23), r02.isNull(r24) ? null : Integer.valueOf((int) r02.getLong(r24)), r02.isNull(r25) ? null : Integer.valueOf((int) r02.getLong(r25)), r02.isNull(r26) ? null : r02.V(r26), r02.isNull(r27) ? null : r02.V(r27), r02.isNull(r28) ? null : r02.V(r28), r02.isNull(r29) ? null : r02.V(r29), r02.isNull(r30) ? null : Integer.valueOf((int) r02.getLong(r30)), r02.isNull(r31) ? null : Integer.valueOf((int) r02.getLong(r31)), r02.isNull(r32) ? null : Integer.valueOf((int) r02.getLong(r32)), r02.isNull(r33) ? null : Integer.valueOf((int) r02.getLong(r33)));
            }
            return r27;
        } finally {
            r02.close();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        PricesTable pricesTable;
        ia.a aVar;
        int i5;
        int i10;
        Integer valueOf;
        Boolean bool;
        int i11;
        int i12 = this.f8800a;
        int i13 = this.f8801b;
        switch (i12) {
            case 0:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT * FROM prices_table WHERE typePrice == ?");
                try {
                    r02.f(1, i13);
                    int r5 = x.r(r02, PricesTable.typePriceColumn);
                    int r6 = x.r(r02, "type");
                    int r10 = x.r(r02, PricesTable.currentPriceColumn);
                    int r11 = x.r(r02, PricesTable.standardPriceColumn);
                    int r12 = x.r(r02, PricesTable.currentPlanIdColumn);
                    int r13 = x.r(r02, PricesTable.standardPlanIdColumn);
                    int r14 = x.r(r02, PricesTable.currentOfferIdColumn);
                    int r15 = x.r(r02, PricesTable.standardOfferIdColumn);
                    int r16 = x.r(r02, PricesTable.endTimeColumn);
                    if (r02.n0()) {
                        pricesTable = new PricesTable((int) r02.getLong(r5), r02.V(r6), r02.isNull(r10) ? null : r02.V(r10), r02.isNull(r11) ? null : r02.V(r11), r02.isNull(r12) ? null : r02.V(r12), r02.isNull(r13) ? null : r02.V(r13), r02.isNull(r14) ? null : r02.V(r14), r02.isNull(r15) ? null : r02.V(r15), r02.isNull(r16) ? null : r02.V(r16));
                    } else {
                        pricesTable = null;
                    }
                    return pricesTable;
                } finally {
                }
            case 1:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT typePrice FROM prices_table WHERE typePrice == ?");
                try {
                    r02.f(1, i13);
                    return (!r02.n0() || r02.isNull(0)) ? null : Integer.valueOf((int) r02.getLong(0));
                } finally {
                }
            case 2:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("UPDATE live_table SET isViewed = 1 WHERE id == ?");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection3);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 3:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT COUNT(id) FROM live_table WHERE id == ?");
                try {
                    r02.f(1, i13);
                    int i14 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i14);
                } finally {
                }
            case 4:
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("SELECT isViewed FROM live_table WHERE id == ?");
                try {
                    r02.f(1, i13);
                    int i15 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i15);
                } finally {
                }
            case 5:
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("SELECT * FROM news_table  WHERE id ==?");
                try {
                    r02.f(1, i13);
                    int r17 = x.r(r02, "id");
                    int r18 = x.r(r02, NewsTable.DATE_TIME_COLUMN);
                    int r19 = x.r(r02, "title");
                    int r20 = x.r(r02, NewsTable.PICTURE_COLUMN);
                    int r21 = x.r(r02, NewsTable.TEXT_COLUMN);
                    if (r02.n0()) {
                        aVar = new ia.a((int) r02.getLong(r17), (int) r02.getLong(r18), r02.isNull(r19) ? null : r02.V(r19), r02.isNull(r20) ? null : r02.V(r20), r02.isNull(r21) ? null : r02.V(r21));
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                }
            case 6:
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("SELECT id FROM news_table  WHERE id ==?");
                try {
                    r02.f(1, i13);
                    return (!r02.n0() || r02.isNull(0)) ? null : Integer.valueOf((int) r02.getLong(0));
                } finally {
                }
            case 7:
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    r02.f(1, i13);
                    int r22 = x.r(r02, "id");
                    int r23 = x.r(r02, "state");
                    int r24 = x.r(r02, "worker_class_name");
                    int r25 = x.r(r02, "input_merger_class_name");
                    int r26 = x.r(r02, "input");
                    int r27 = x.r(r02, "output");
                    int r28 = x.r(r02, "initial_delay");
                    int r29 = x.r(r02, "interval_duration");
                    int r30 = x.r(r02, "flex_duration");
                    int r31 = x.r(r02, "run_attempt_count");
                    int r32 = x.r(r02, "backoff_policy");
                    int r33 = x.r(r02, "backoff_delay_duration");
                    int r34 = x.r(r02, "last_enqueue_time");
                    int r35 = x.r(r02, "minimum_retention_duration");
                    int r36 = x.r(r02, "schedule_requested_at");
                    int r37 = x.r(r02, "run_in_foreground");
                    int r38 = x.r(r02, "out_of_quota_policy");
                    int r39 = x.r(r02, "period_count");
                    int r40 = x.r(r02, "generation");
                    int r41 = x.r(r02, "next_schedule_time_override");
                    int r42 = x.r(r02, "next_schedule_time_override_generation");
                    int r43 = x.r(r02, "stop_reason");
                    int r44 = x.r(r02, "trace_tag");
                    int r45 = x.r(r02, "backoff_on_system_interruptions");
                    int r46 = x.r(r02, "required_network_type");
                    int r47 = x.r(r02, "required_network_request");
                    int r48 = x.r(r02, "requires_charging");
                    int r49 = x.r(r02, "requires_device_idle");
                    int r50 = x.r(r02, "requires_battery_not_low");
                    int r51 = x.r(r02, "requires_storage_not_low");
                    int r52 = x.r(r02, "trigger_content_update_delay");
                    int r53 = x.r(r02, "trigger_max_content_delay");
                    int r54 = x.r(r02, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        String V = r02.V(r22);
                        int i16 = r35;
                        ArrayList arrayList2 = arrayList;
                        i0 A = rh.g.A((int) r02.getLong(r23));
                        String V2 = r02.V(r24);
                        String V3 = r02.V(r25);
                        byte[] blob = r02.getBlob(r26);
                        e3.j jVar = e3.j.f8531b;
                        e3.j k6 = rh.g.k(blob);
                        e3.j k9 = rh.g.k(r02.getBlob(r27));
                        long j = r02.getLong(r28);
                        long j6 = r02.getLong(r29);
                        long j10 = r02.getLong(r30);
                        int i17 = (int) r02.getLong(r31);
                        int i18 = r23;
                        int i19 = r24;
                        e3.a v5 = rh.g.v((int) r02.getLong(r32));
                        long j11 = r02.getLong(r33);
                        long j12 = r02.getLong(r34);
                        long j13 = r02.getLong(i16);
                        int i20 = r36;
                        long j14 = r02.getLong(i20);
                        int i21 = r22;
                        int i22 = r37;
                        boolean z5 = ((int) r02.getLong(i22)) != 0;
                        int i23 = r38;
                        int i24 = r25;
                        f0 z7 = rh.g.z((int) r02.getLong(i23));
                        int i25 = r39;
                        int i26 = r26;
                        int i27 = (int) r02.getLong(i25);
                        int i28 = r40;
                        int i29 = (int) r02.getLong(i28);
                        int i30 = r41;
                        long j15 = r02.getLong(i30);
                        int i31 = r42;
                        int i32 = (int) r02.getLong(i31);
                        int i33 = r43;
                        int i34 = (int) r02.getLong(i33);
                        int i35 = r44;
                        String V4 = r02.isNull(i35) ? null : r02.V(i35);
                        int i36 = r45;
                        if (r02.isNull(i36)) {
                            i5 = i32;
                            i10 = i33;
                            valueOf = null;
                        } else {
                            i5 = i32;
                            i10 = i33;
                            valueOf = Integer.valueOf((int) r02.getLong(i36));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i37 = r46;
                        y y5 = rh.g.y((int) r02.getLong(i37));
                        int i38 = r47;
                        n3.i N = rh.g.N(r02.getBlob(i38));
                        r46 = i37;
                        r47 = i38;
                        int i39 = r48;
                        boolean z10 = ((int) r02.getLong(i39)) != 0;
                        r48 = i39;
                        int i40 = r49;
                        boolean z11 = ((int) r02.getLong(i40)) != 0;
                        int i41 = r50;
                        boolean z12 = ((int) r02.getLong(i41)) != 0;
                        r50 = i41;
                        int i42 = r51;
                        int i43 = r52;
                        int i44 = r53;
                        int i45 = r54;
                        r54 = i45;
                        arrayList2.add(new m3.o(V, A, V2, V3, k6, k9, j, j6, j10, new e3.f(N, y5, z10, z11, z12, ((int) r02.getLong(i42)) != 0, r02.getLong(i43), r02.getLong(i44), rh.g.b(r02.getBlob(i45))), i17, v5, j11, j12, j13, j14, z5, z7, i27, i29, j15, i5, i34, V4, bool));
                        r51 = i42;
                        r25 = i24;
                        r38 = i23;
                        r40 = i28;
                        r43 = i10;
                        r45 = i36;
                        r52 = i43;
                        r53 = i44;
                        r23 = i18;
                        r35 = i16;
                        r24 = i19;
                        arrayList = arrayList2;
                        r22 = i21;
                        r36 = i20;
                        r37 = i22;
                        r41 = i30;
                        r42 = i31;
                        r44 = i35;
                        r49 = i40;
                        r26 = i26;
                        r39 = i25;
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("SELECT COUNT(*)  FROM sports_table WHERE idCategory == ?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 9:
                return c4.p.c(y3.o(((q4.h) obj).f21976a, i13));
            case 10:
                return c4.p.c(y3.o(((q4.h) obj).f21976a, i13));
            case 11:
                s2.a _connection10 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection10, "_connection");
                r02 = _connection10.r0("SELECT COUNT() FROM support_table WHERE id == ?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 12:
                s2.a _connection11 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection11, "_connection");
                r02 = _connection11.r0("DELETE FROM support_table WHERE id == ?");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection11);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
            case 13:
                s2.a _connection12 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection12, "_connection");
                r02 = _connection12.r0("SELECT * FROM support_table ORDER BY dateCreate DESC LIMIT ? OFFSET ?");
                try {
                    r02.f(1, i13);
                    r02.f(2, 0);
                    int r55 = x.r(r02, "id");
                    int r56 = x.r(r02, "remoteId");
                    int r57 = x.r(r02, "dateCreate");
                    int r58 = x.r(r02, "dateUpdate");
                    int r59 = x.r(r02, "stateRead");
                    int r60 = x.r(r02, "readDate");
                    int r61 = x.r(r02, "sendDate");
                    int r62 = x.r(r02, "operatorName");
                    int r63 = x.r(r02, NewsTable.TEXT_COLUMN);
                    int r64 = x.r(r02, "type");
                    int r65 = x.r(r02, "mime");
                    int r66 = x.r(r02, EventsTable.contentColumn);
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        int i46 = r58;
                        int i47 = r55;
                        int i48 = r56;
                        int i49 = r57;
                        arrayList3.add(new SupportTable((int) r02.getLong(r55), (int) r02.getLong(r56), (int) r02.getLong(r57), (int) r02.getLong(i46), (int) r02.getLong(r59), (int) r02.getLong(r60), (int) r02.getLong(r61), r02.isNull(r62) ? null : r02.V(r62), r02.isNull(r63) ? null : r02.V(r63), (int) r02.getLong(r64), r02.isNull(r65) ? null : r02.V(r65), r02.isNull(r66) ? null : r02.V(r66)));
                        r56 = i48;
                        r55 = i47;
                        r58 = i46;
                        r57 = i49;
                    }
                    return arrayList3;
                } finally {
                }
            case 14:
                s2.a _connection13 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection13, "_connection");
                r02 = _connection13.r0("SELECT answer FROM frequent_questions_table WHERE id == ? ");
                try {
                    r02.f(1, i13);
                    return (!r02.n0() || r02.isNull(0)) ? null : r02.V(0);
                } finally {
                }
            case 15:
                s2.a _connection14 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection14, "_connection");
                r02 = _connection14.r0("SELECT COUNT() FROM support_table WHERE remoteId == ?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 16:
                s2.a _connection15 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection15, "_connection");
                r02 = _connection15.r0("UPDATE order_table SET success = ? WHERE id==?");
                try {
                    r02.f(1, 1);
                    r02.f(2, i13);
                    r02.n0();
                    int q10 = io.sentry.config.a.q(_connection15);
                    r02.close();
                    return Integer.valueOf(q10);
                } finally {
                }
            case 17:
                s2.a _connection16 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection16, "_connection");
                r02 = _connection16.r0("UPDATE account_table SET countExpress = ? WHERE idUser=='user'");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    int q11 = io.sentry.config.a.q(_connection16);
                    r02.close();
                    return Integer.valueOf(q11);
                } finally {
                }
            case 18:
                s2.a _connection17 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection17, "_connection");
                r02 = _connection17.r0("UPDATE account_table SET countPremium = ? WHERE idUser=='user'");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    int q12 = io.sentry.config.a.q(_connection17);
                    r02.close();
                    return Integer.valueOf(q12);
                } finally {
                }
            case 19:
                s2.a _connection18 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection18, "_connection");
                r02 = _connection18.r0("SELECT * FROM order_table  WHERE id ==?");
                try {
                    r02.f(1, i13);
                    return r02.n0() ? new ja.a(r02.V(x.r(r02, OrdersTable.orderColumn)), r02.V(x.r(r02, OrdersTable.productPayColumn)), (int) r02.getLong(x.r(r02, "id")), (int) r02.getLong(x.r(r02, "success"))) : null;
                } finally {
                }
            case 20:
                s2.a _connection19 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection19, "_connection");
                r02 = _connection19.r0("SELECT success FROM order_table  WHERE id ==?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 21:
                return a(obj);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return b(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                s2.a _connection20 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection20, "_connection");
                r02 = _connection20.r0("SELECT COUNT(id) FROM table_prediction_preview WHERE id == ?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                s2.a _connection21 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection21, "_connection");
                r02 = _connection21.r0("INSERT INTO favorite_table (idPrediction) VALUES (?)");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection21);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            case C0122e9.F /* 25 */:
                s2.a _connection22 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection22, "_connection");
                r02 = _connection22.r0("SELECT jsonObject FROM prediction_meeting_table WHERE idPrediction == ?");
                try {
                    r02.f(1, i13);
                    return (!r02.n0() || r02.isNull(0)) ? null : r02.V(0);
                } finally {
                }
            case C0122e9.G /* 26 */:
                s2.a _connection23 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection23, "_connection");
                r02 = _connection23.r0("SELECT COUNT(*) FROM prediction_meeting_table WHERE idPrediction == ?");
                try {
                    r02.f(1, i13);
                    i11 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case C0122e9.H /* 27 */:
                s2.a _connection24 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection24, "_connection");
                r02 = _connection24.r0("DELETE FROM favorite_table WHERE idPrediction == ?");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    int q13 = io.sentry.config.a.q(_connection24);
                    r02.close();
                    return Integer.valueOf(q13);
                } finally {
                }
            case 28:
                return c(obj);
            default:
                s2.a _connection25 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection25, "_connection");
                r02 = _connection25.r0("DELETE FROM prediction_kind_table  WHERE idPrediction == ?");
                try {
                    r02.f(1, i13);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
        }
    }
}
