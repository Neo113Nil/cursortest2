package ib;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11042a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11047f;

    public /* synthetic */ a(int i5, int i10, String str, String str2, String str3) {
        this.f11043b = i5;
        this.f11047f = i10;
        this.f11044c = str;
        this.f11045d = str2;
        this.f11046e = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f11042a) {
            case 0:
                int i5 = this.f11043b;
                int i10 = this.f11047f;
                String str = this.f11044c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("\n            INSERT OR REPLACE INTO news_table (id, dateTime, title, picture, text)\n            VALUES (?, ?, ?, ?, ?)");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.B(3, str);
                    String str2 = this.f11045d;
                    if (str2 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str2);
                    }
                    String str3 = this.f11046e;
                    if (str3 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str3);
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                int i11 = this.f11043b;
                String str4 = this.f11044c;
                int i12 = this.f11047f;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("\n            UPDATE news_table \n            SET dateTime = ?, title = ?, picture = ?, text = ?\n            WHERE id == ?");
                try {
                    r02.f(1, i11);
                    r02.B(2, str4);
                    String str5 = this.f11045d;
                    if (str5 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str5);
                    }
                    String str6 = this.f11046e;
                    if (str6 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str6);
                    }
                    r02.f(5, i12);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection2);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
        }
    }

    public /* synthetic */ a(int i5, String str, String str2, String str3, int i10) {
        this.f11043b = i5;
        this.f11044c = str;
        this.f11045d = str2;
        this.f11046e = str3;
        this.f11047f = i10;
    }
}
