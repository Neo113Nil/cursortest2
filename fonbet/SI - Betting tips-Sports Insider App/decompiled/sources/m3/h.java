package m3;

import k2.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20318c;

    public /* synthetic */ h(int i5, String str, int i10) {
        this.f20316a = i10;
        this.f20318c = i5;
        this.f20317b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f20316a) {
            case 0:
                String str = this.f20317b;
                int i5 = this.f20318c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    r02.B(1, str);
                    r02.f(2, i5);
                    return r02.n0() ? new g(r02.V(x.r(r02, "work_spec_id")), (int) r02.getLong(x.r(r02, "generation")), (int) r02.getLong(x.r(r02, "system_id"))) : null;
                } finally {
                }
            case 1:
                String str2 = this.f20317b;
                int i10 = this.f20318c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    r02.B(1, str2);
                    r02.f(2, i10);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 2:
                int i11 = this.f20318c;
                String str3 = this.f20317b;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    r02.f(1, i11);
                    r02.B(2, str3);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 3:
                int i12 = this.f20318c;
                String str4 = this.f20317b;
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("INSERT INTO support_table (dateCreate, text, content, mime, sendDate, \n        dateUpdate, operatorName, remoteId, readDate, stateRead, type) \n        VALUES (?, ?, null, null, ?, ?, \"FAQ\", 0, ?, 2, 2)\n        ");
                long j = i12;
                try {
                    r02.f(1, j);
                    r02.B(2, str4);
                    r02.f(3, j);
                    r02.f(4, j);
                    r02.f(5, j);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection4);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            case 4:
                int i13 = this.f20318c;
                String str5 = this.f20317b;
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("INSERT INTO support_table (dateCreate, text, content, mime, sendDate, \n        dateUpdate, operatorName, remoteId, readDate, stateRead, type) \n        VALUES (?, ?, null, null, 0, ?, null, 0, 0, 0, 0)\n        ");
                long j6 = i13;
                try {
                    r02.f(1, j6);
                    r02.B(2, str5);
                    r02.f(3, j6);
                    r02.n0();
                    long p11 = io.sentry.config.a.p(_connection5);
                    r02.close();
                    return Long.valueOf(p11);
                } finally {
                }
            case 5:
                int i14 = this.f20318c;
                String str6 = this.f20317b;
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("SELECT COUNT(*) FROM request_update_table WHERE categoryId ==? AND lang == ?");
                try {
                    r02.f(1, i14);
                    r02.B(2, str6);
                    int i15 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i15);
                } finally {
                }
            case 6:
                int i16 = this.f20318c;
                String str7 = this.f20317b;
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("UPDATE order_table SET id = ? WHERE `order` == ?");
                try {
                    r02.f(1, i16);
                    r02.B(2, str7);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection7);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 7:
                int i17 = this.f20318c;
                String str8 = this.f20317b;
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("SELECT categoryId, lang, timeRequestStart, timeRequestEnd, timeRequestEndDownload FROM request_update_table WHERE categoryId ==? AND lang == ?");
                try {
                    r02.f(1, i17);
                    r02.B(2, str8);
                    return r02.n0() ? new ja.d((int) r02.getLong(0), (int) r02.getLong(2), (int) r02.getLong(3), (int) r02.getLong(4), r02.V(1)) : null;
                } finally {
                }
            case 8:
                int i18 = this.f20318c;
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("INSERT INTO prediction_meeting_table ( idPrediction, jsonObject ) VALUES ( ?, ?)");
                try {
                    r02.f(1, i18);
                    String str9 = this.f20317b;
                    if (str9 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str9);
                    }
                    r02.n0();
                    long p12 = io.sentry.config.a.p(_connection9);
                    r02.close();
                    return Long.valueOf(p12);
                } finally {
                }
            default:
                int i19 = this.f20318c;
                s2.a _connection10 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection10, "_connection");
                r02 = _connection10.r0("UPDATE prediction_meeting_table SET jsonObject = ? WHERE idPrediction == ?");
                String str10 = this.f20317b;
                try {
                    if (str10 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str10);
                    }
                    r02.f(2, i19);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection10);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
        }
    }

    public /* synthetic */ h(String str, int i5, int i10) {
        this.f20316a = i10;
        this.f20317b = str;
        this.f20318c = i5;
    }
}
