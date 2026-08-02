package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9919a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f9924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f9925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9926h;

    public /* synthetic */ a(int i5, int i10, String str, String str2, String str3, String str4, String str5) {
        this.f9920b = i5;
        this.f9926h = i10;
        this.f9921c = str;
        this.f9922d = str2;
        this.f9923e = str3;
        this.f9924f = str4;
        this.f9925g = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f9919a) {
            case 0:
                int i5 = this.f9920b;
                int i10 = this.f9926h;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("INSERT OR REPLACE INTO live_table ( \n            id, createDate,isViewed, imageUrl, title, message, btnUrl, btnText ) \n        VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.f(3, 0);
                    String str = this.f9921c;
                    if (str == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str);
                    }
                    String str2 = this.f9922d;
                    if (str2 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str2);
                    }
                    String str3 = this.f9923e;
                    if (str3 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str3);
                    }
                    String str4 = this.f9924f;
                    if (str4 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str4);
                    }
                    String str5 = this.f9925g;
                    if (str5 == null) {
                        r02.h(8);
                    } else {
                        r02.B(8, str5);
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                int i11 = this.f9920b;
                int i12 = this.f9926h;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("UPDATE live_table \n        SET createDate = ?, imageUrl = ?, title = ?, message = ?, \n        btnUrl = ?, btnText = ?\n        WHERE id == ?");
                try {
                    r02.f(1, i11);
                    String str6 = this.f9921c;
                    if (str6 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str6);
                    }
                    String str7 = this.f9922d;
                    if (str7 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str7);
                    }
                    String str8 = this.f9923e;
                    if (str8 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str8);
                    }
                    String str9 = this.f9924f;
                    if (str9 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str9);
                    }
                    String str10 = this.f9925g;
                    if (str10 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str10);
                    }
                    r02.f(7, i12);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection2);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
        }
    }

    public /* synthetic */ a(int i5, String str, String str2, String str3, String str4, String str5, int i10) {
        this.f9920b = i5;
        this.f9921c = str;
        this.f9922d = str2;
        this.f9923e = str3;
        this.f9924f = str4;
        this.f9925g = str5;
        this.f9926h = i10;
    }
}
