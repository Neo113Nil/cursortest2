package eb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8791a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8799i;
    public final /* synthetic */ String j;

    public /* synthetic */ a(int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f8792b = i5;
        this.f8793c = str;
        this.f8794d = str2;
        this.f8795e = str3;
        this.f8796f = str4;
        this.f8797g = str5;
        this.f8798h = str6;
        this.f8799i = str7;
        this.j = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f8791a) {
            case 0:
                String str = this.f8793c;
                String str2 = this.f8795e;
                int i5 = this.f8792b;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("UPDATE prices_table SET type = ?, currentPrice = ?, standardPrice = ?, currentPlanId = ?, standardPlanId = ?, currentOfferId = ?, standardOfferId = ?, endTime = ? WHERE typePrice == ?");
                try {
                    r02.B(1, str);
                    String str3 = this.f8794d;
                    if (str3 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str3);
                    }
                    r02.B(3, str2);
                    String str4 = this.f8796f;
                    if (str4 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str4);
                    }
                    String str5 = this.f8797g;
                    if (str5 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str5);
                    }
                    String str6 = this.f8798h;
                    if (str6 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str6);
                    }
                    String str7 = this.f8799i;
                    if (str7 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str7);
                    }
                    String str8 = this.j;
                    if (str8 == null) {
                        r02.h(8);
                    } else {
                        r02.B(8, str8);
                    }
                    r02.f(9, i5);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            default:
                int i10 = this.f8792b;
                String str9 = this.f8793c;
                String str10 = this.f8795e;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT INTO prices_table (typePrice, type, currentPrice, standardPrice, currentPlanId, standardPlanId, currentOfferId, standardOfferId, endTime) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    r02.f(1, i10);
                    r02.B(2, str9);
                    String str11 = this.f8794d;
                    if (str11 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str11);
                    }
                    r02.B(4, str10);
                    String str12 = this.f8796f;
                    if (str12 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str12);
                    }
                    String str13 = this.f8797g;
                    if (str13 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str13);
                    }
                    String str14 = this.f8798h;
                    if (str14 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str14);
                    }
                    String str15 = this.f8799i;
                    if (str15 == null) {
                        r02.h(8);
                    } else {
                        r02.B(8, str15);
                    }
                    String str16 = this.j;
                    if (str16 == null) {
                        r02.h(9);
                    } else {
                        r02.B(9, str16);
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i5) {
        this.f8793c = str;
        this.f8794d = str2;
        this.f8795e = str3;
        this.f8796f = str4;
        this.f8797g = str5;
        this.f8798h = str6;
        this.f8799i = str7;
        this.j = str8;
        this.f8792b = i5;
    }
}
