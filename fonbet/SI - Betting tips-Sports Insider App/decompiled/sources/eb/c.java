package eb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8804c;

    public /* synthetic */ c(String str, String str2, int i5) {
        this.f8802a = i5;
        this.f8803b = str;
        this.f8804c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f8802a) {
            case 0:
                String str = this.f8803b;
                String str2 = this.f8804c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("UPDATE sku_details_table SET jsonString = ? WHERE sku == ?");
                try {
                    r02.B(1, str);
                    r02.B(2, str2);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 1:
                String str3 = this.f8803b;
                String str4 = this.f8804c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT OR IGNORE INTO sku_details_table (sku, jsonString)  VALUES (?, ?)");
                try {
                    r02.B(1, str3);
                    r02.B(2, str4);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                String str5 = this.f8803b;
                String str6 = this.f8804c;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT COUNT(name) FROM events_table WHERE name == ? AND content == ? ");
                try {
                    r02.B(1, str5);
                    r02.B(2, str6);
                    int i5 = r02.n0() ? (int) r02.getLong(0) : 0;
                    r02.close();
                    return Integer.valueOf(i5);
                } finally {
                }
        }
    }
}
