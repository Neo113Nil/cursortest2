package tb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23815c;

    public /* synthetic */ b(int i5, int i10, int i11) {
        this.f23813a = i11;
        this.f23814b = i5;
        this.f23815c = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f23813a) {
            case 0:
                int i5 = this.f23814b;
                int i10 = this.f23815c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("\n        UPDATE account_table \n        SET countPremium = ?, countExpress = ?\n        WHERE idUser=='user'");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            default:
                int i11 = this.f23814b;
                int i12 = this.f23815c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT INTO prediction_kind_table (idPrediction,idKind) VALUES (?, ?)");
                try {
                    r02.f(1, i11);
                    r02.f(2, i12);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
        }
    }
}
