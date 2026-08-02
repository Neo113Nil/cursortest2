package db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8361a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f8362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8363c;

    public /* synthetic */ d(Integer num, String str) {
        this.f8362b = num;
        this.f8363c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f8361a) {
            case 0:
                String str = this.f8363c;
                Integer num = this.f8362b;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("INSERT INTO account_setting_table (account_setting_id_name, account_setting_value_name) VALUES (?,? )");
                try {
                    r02.B(1, str);
                    r02.f(2, num.intValue());
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                Integer num2 = this.f8362b;
                String str2 = this.f8363c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("UPDATE account_setting_table SET account_setting_value_name = ? WHERE account_setting_id_name == ?");
                try {
                    r02.f(1, num2.intValue());
                    r02.B(2, str2);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection2);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
        }
    }

    public /* synthetic */ d(String str, Integer num) {
        this.f8363c = str;
        this.f8362b = num;
    }
}
