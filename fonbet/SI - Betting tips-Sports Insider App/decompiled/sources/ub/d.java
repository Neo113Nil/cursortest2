package ub;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import java.util.ArrayList;
import k2.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24190b;

    public /* synthetic */ d(int i5, int i10) {
        this.f24189a = i10;
        this.f24190b = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ja.c] */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.sports.insider.data.room.general.table.predictions.PredictionTable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
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
        switch (this.f24189a) {
            case 0:
                int i18 = this.f24190b;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT * FROM table_prediction_preview WHERE id == ?");
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
                    if (r02.n0()) {
                        r23 = new ja.c((int) r02.getLong(r5), (int) r02.getLong(r6), (int) r02.getLong(r10), (int) r02.getLong(r11), r02.isNull(r12) ? null : r02.V(r12), r02.isNull(r14) ? null : r02.V(r14), r02.isNull(r13) ? null : r02.V(r13), r02.isNull(r18) ? null : r02.V(r18), r02.isNull(r19) ? null : r02.V(r19), (int) r02.getLong(r15), r02.isNull(r17) ? null : r02.V(r17), r02.isNull(r16) ? null : r02.V(r16), r02.isNull(r26) ? null : Integer.valueOf((int) r02.getLong(r26)), r02.isNull(r27) ? null : Integer.valueOf((int) r02.getLong(r27)), r02.isNull(r28) ? null : Integer.valueOf((int) r02.getLong(r28)), r02.isNull(r29) ? null : Integer.valueOf((int) r02.getLong(r29)), r02.isNull(r20) ? null : Integer.valueOf((int) r02.getLong(r20)), r02.isNull(r21) ? null : Integer.valueOf((int) r02.getLong(r21)), r02.isNull(r22) ? null : r02.V(r22), r02.isNull(r23) ? null : r02.V(r23), r02.isNull(r24) ? null : r02.V(r24), r02.isNull(r25) ? null : r02.V(r25));
                    }
                    return r23;
                } finally {
                }
            case 1:
                int i19 = this.f24190b;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT COUNT(*) FROM favorite_table WHERE idPrediction == ?");
                try {
                    r02.f(1, i19);
                    int i20 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i20);
                } finally {
                }
            case 2:
                int i21 = this.f24190b;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT COUNT(id) FROM table_prediction WHERE id == ?");
                try {
                    r02.f(1, i21);
                    int i22 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i22);
                } finally {
                }
            case 3:
                int i23 = this.f24190b;
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT idPrediction FROM favorite_table WHERE idPrediction==?");
                try {
                    r02.f(1, i23);
                    Integer num = null;
                    if (r02.n0() && !r02.isNull(0)) {
                        num = Integer.valueOf((int) r02.getLong(0));
                    }
                    return num;
                } finally {
                }
            case 4:
                int i24 = this.f24190b;
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("DELETE FROM table_prediction_preview  WHERE id == ?");
                try {
                    r02.f(1, i24);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 5:
                int i25 = this.f24190b;
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("DELETE  FROM prediction_meeting_table WHERE idPrediction == ? ");
                try {
                    r02.f(1, i25);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection6);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 6:
                int i26 = this.f24190b;
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE publication != 0 AND id in (SELECT PK.idPrediction FROM prediction_kind_table PK WHERE PK.idKind == ?) ORDER BY startTime DESC");
                try {
                    r02.f(1, i26);
                    int r30 = x.r(r02, "id");
                    int r31 = x.r(r02, PredictionTable.startTimeColumn);
                    int r32 = x.r(r02, PredictionTable.publicationColumn);
                    int r33 = x.r(r02, "type");
                    int r34 = x.r(r02, PredictionTable.statusColumn);
                    int r35 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r36 = x.r(r02, PredictionTable.oddsColumn);
                    int r37 = x.r(r02, "purchased");
                    int r38 = x.r(r02, PredictionTable.forecastsColumn);
                    int r39 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r40 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r41 = x.r(r02, PredictionTable.forecastColumn);
                    int r42 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r43 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r44 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r45 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r46 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r47 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r48 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r49 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r50 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r51 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        int i27 = r42;
                        int i28 = r43;
                        int i29 = (int) r02.getLong(r30);
                        int i30 = (int) r02.getLong(r31);
                        int i31 = (int) r02.getLong(r32);
                        int i32 = r31;
                        int i33 = r32;
                        int i34 = (int) r02.getLong(r33);
                        Integer num2 = null;
                        String V = r02.isNull(r34) ? null : r02.V(r34);
                        String V2 = r02.isNull(r35) ? null : r02.V(r35);
                        String V3 = r02.isNull(r36) ? null : r02.V(r36);
                        int i35 = (int) r02.getLong(r37);
                        String V4 = r02.isNull(r38) ? null : r02.V(r38);
                        String V5 = r02.isNull(r39) ? null : r02.V(r39);
                        String V6 = r02.isNull(r40) ? null : r02.V(r40);
                        String V7 = r02.isNull(r41) ? null : r02.V(r41);
                        if (r02.isNull(i27)) {
                            i5 = r33;
                            i10 = r34;
                            valueOf = null;
                        } else {
                            i5 = r33;
                            i10 = r34;
                            valueOf = Integer.valueOf((int) r02.getLong(i27));
                        }
                        if (r02.isNull(i28)) {
                            i11 = i35;
                            i12 = i27;
                            valueOf2 = null;
                        } else {
                            i11 = i35;
                            i12 = i27;
                            valueOf2 = Integer.valueOf((int) r02.getLong(i28));
                        }
                        int i36 = r44;
                        String V8 = r02.isNull(i36) ? null : r02.V(i36);
                        int i37 = r45;
                        String V9 = r02.isNull(i37) ? null : r02.V(i37);
                        int i38 = r30;
                        int i39 = r46;
                        String V10 = r02.isNull(i39) ? null : r02.V(i39);
                        r46 = i39;
                        int i40 = r47;
                        String V11 = r02.isNull(i40) ? null : r02.V(i40);
                        r47 = i40;
                        int i41 = r48;
                        if (r02.isNull(i41)) {
                            i13 = i36;
                            i14 = i37;
                            valueOf3 = null;
                        } else {
                            i13 = i36;
                            i14 = i37;
                            valueOf3 = Integer.valueOf((int) r02.getLong(i41));
                        }
                        int i42 = r49;
                        if (r02.isNull(i42)) {
                            i15 = i28;
                            valueOf4 = null;
                        } else {
                            i15 = i28;
                            valueOf4 = Integer.valueOf((int) r02.getLong(i42));
                        }
                        int i43 = r50;
                        if (r02.isNull(i43)) {
                            i16 = i12;
                            valueOf5 = null;
                        } else {
                            i16 = i12;
                            valueOf5 = Integer.valueOf((int) r02.getLong(i43));
                        }
                        int i44 = r51;
                        if (r02.isNull(i44)) {
                            i17 = i42;
                            r50 = i43;
                        } else {
                            i17 = i42;
                            r50 = i43;
                            num2 = Integer.valueOf((int) r02.getLong(i44));
                        }
                        arrayList.add(new ja.c(i29, i30, i31, i34, V, V3, V2, V6, V7, i11, V5, V4, valueOf3, valueOf4, valueOf5, num2, valueOf, valueOf2, V8, V9, V10, V11));
                        r30 = i38;
                        r44 = i13;
                        r45 = i14;
                        r48 = i41;
                        r51 = i44;
                        r31 = i32;
                        r42 = i16;
                        r33 = i5;
                        r43 = i15;
                        r32 = i33;
                        r49 = i17;
                        r34 = i10;
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                int i45 = this.f24190b;
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("SELECT * FROM table_prediction WHERE id == ?");
                try {
                    r02.f(1, i45);
                    int r52 = x.r(r02, "id");
                    int r53 = x.r(r02, PredictionTable.startTimeColumn);
                    int r54 = x.r(r02, PredictionTable.publicationColumn);
                    int r55 = x.r(r02, "type");
                    int r56 = x.r(r02, PredictionTable.statusColumn);
                    int r57 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r58 = x.r(r02, PredictionTable.oddsColumn);
                    int r59 = x.r(r02, PredictionTable.resultsIsViewedColumn);
                    int r60 = x.r(r02, PredictionTable.analyticsFullColumn);
                    int r61 = x.r(r02, PredictionTable.analyticsShortColumn);
                    int r62 = x.r(r02, PredictionTable.leagueColumn);
                    int r63 = x.r(r02, PredictionTable.forecastsColumn);
                    int r64 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r65 = x.r(r02, PredictionTable.arrayPredictionColumn);
                    int r66 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r67 = x.r(r02, PredictionTable.forecastColumn);
                    int r68 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r69 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r70 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r71 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r72 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r73 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r74 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r75 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r76 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r77 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    if (r02.n0()) {
                        r27 = new PredictionTable((int) r02.getLong(r52), (int) r02.getLong(r53), (int) r02.getLong(r54), (int) r02.getLong(r55), r02.isNull(r56) ? null : r02.V(r56), r02.isNull(r57) ? null : r02.V(r57), r02.isNull(r58) ? null : r02.V(r58), (int) r02.getLong(r59), r02.isNull(r60) ? null : r02.V(r60), r02.isNull(r61) ? null : r02.V(r61), r02.isNull(r62) ? null : r02.V(r62), r02.isNull(r63) ? null : r02.V(r63), r02.isNull(r64) ? null : r02.V(r64), r02.isNull(r65) ? null : r02.V(r65), r02.isNull(r66) ? null : r02.V(r66), r02.isNull(r67) ? null : r02.V(r67), r02.isNull(r68) ? null : Integer.valueOf((int) r02.getLong(r68)), r02.isNull(r69) ? null : Integer.valueOf((int) r02.getLong(r69)), r02.isNull(r70) ? null : r02.V(r70), r02.isNull(r71) ? null : r02.V(r71), r02.isNull(r72) ? null : r02.V(r72), r02.isNull(r73) ? null : r02.V(r73), r02.isNull(r74) ? null : Integer.valueOf((int) r02.getLong(r74)), r02.isNull(r75) ? null : Integer.valueOf((int) r02.getLong(r75)), r02.isNull(r76) ? null : Integer.valueOf((int) r02.getLong(r76)), r02.isNull(r77) ? null : Integer.valueOf((int) r02.getLong(r77)));
                    }
                    return r27;
                } finally {
                }
            case 8:
                int i46 = this.f24190b;
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("SELECT jsonObject FROM prediction_meeting_table WHERE idPrediction == ?");
                try {
                    r02.f(1, i46);
                    String str = null;
                    if (r02.n0() && !r02.isNull(0)) {
                        str = r02.V(0);
                    }
                    return str;
                } finally {
                }
            case 9:
                int i47 = this.f24190b;
                s2.a _connection10 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection10, "_connection");
                r02 = _connection10.r0("UPDATE table_prediction SET  resultsIsViewed = 1 WHERE id == ?");
                try {
                    r02.f(1, i47);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection10);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
            default:
                int i48 = this.f24190b;
                s2.a _connection11 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection11, "_connection");
                r02 = _connection11.r0("DELETE FROM table_prediction  WHERE id == ?");
                try {
                    r02.f(1, i48);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
        }
    }
}
