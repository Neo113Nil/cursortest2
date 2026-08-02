package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20356c;

    public /* synthetic */ p(String str, long j, int i5) {
        this.f20354a = i5;
        this.f20355b = j;
        this.f20356c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f20354a) {
            case 0:
                long j = this.f20355b;
                String str = this.f20356c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    r02.f(1, j);
                    r02.B(2, str);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            default:
                long j6 = this.f20355b;
                String str2 = this.f20356c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    r02.f(1, j6);
                    r02.B(2, str2);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
        }
    }
}
