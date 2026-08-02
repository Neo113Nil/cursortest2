package eb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8808d;

    public /* synthetic */ d(String str, int i5, int i10) {
        this.f8805a = 1;
        this.f8806b = str;
        this.f8807c = i5;
        this.f8808d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f8805a) {
            case 0:
                int i5 = this.f8807c;
                int i10 = this.f8808d;
                String str = this.f8806b;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("UPDATE sku_id_content_type_table SET typeSkuContent = ?, typeSku = ? WHERE id == ?");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.B(3, str);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            case 1:
                String str2 = this.f8806b;
                int i11 = this.f8807c;
                int i12 = this.f8808d;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT INTO sku_id_content_type_table (id, typeSkuContent, typeSku)  VALUES (?, ?, ?)");
                try {
                    r02.B(1, str2);
                    r02.f(2, i11);
                    r02.f(3, i12);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                int i13 = this.f8807c;
                int i14 = this.f8808d;
                String str3 = this.f8806b;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("UPDATE request_update_table SET timeRequestEndDownload = ? WHERE categoryId ==? AND lang == ?");
                try {
                    r02.f(1, i13);
                    r02.f(2, i14);
                    r02.B(3, str3);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection3);
                    r02.close();
                    return Integer.valueOf(q3);
                } finally {
                }
        }
    }

    public /* synthetic */ d(String str, int i5, int i10, int i11) {
        this.f8805a = i11;
        this.f8807c = i5;
        this.f8808d = i10;
        this.f8806b = str;
    }
}
