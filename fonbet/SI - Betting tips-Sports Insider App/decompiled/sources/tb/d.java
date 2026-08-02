package tb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23826g;

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6, int i5) {
        this.f23820a = i5;
        this.f23821b = str;
        this.f23822c = str2;
        this.f23823d = str3;
        this.f23824e = str4;
        this.f23825f = str5;
        this.f23826g = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        s2.a _connection = (s2.a) obj;
        switch (this.f23820a) {
            case 0:
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("INSERT INTO account_table (idUser, token, email, oldDeviceId, deviceId,\n        countPremium, countExpress, name, surname, avatar,\n        endTimeLive, endTimePremium, endTimeExpress, endTimeDiamond)\n        VALUES ('user',?, ?, ?, ?,\n                        ?, ?, ?, ?, ?,\n                        ?, ?, ?, ?\n        )\n        ");
                String str = this.f23821b;
                try {
                    if (str == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str);
                    }
                    String str2 = this.f23822c;
                    if (str2 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str2);
                    }
                    r02.h(3);
                    String str3 = this.f23823d;
                    if (str3 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str3);
                    }
                    r02.f(5, 0);
                    r02.f(6, 0);
                    String str4 = this.f23824e;
                    if (str4 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str4);
                    }
                    String str5 = this.f23825f;
                    if (str5 == null) {
                        r02.h(8);
                    } else {
                        r02.B(8, str5);
                    }
                    String str6 = this.f23826g;
                    if (str6 == null) {
                        r02.h(9);
                    } else {
                        r02.B(9, str6);
                    }
                    r02.f(10, 0);
                    r02.f(11, 0);
                    r02.f(12, 0);
                    r02.f(13, 0);
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("\n            UPDATE account_table\n            SET token = ?, name = ?, surname = ?, avatar = ?, email = ?, \n                deviceId = ?, oldDeviceId = ?\n            WHERE idUser =='user'");
                String str7 = this.f23821b;
                try {
                    if (str7 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str7);
                    }
                    String str8 = this.f23822c;
                    if (str8 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str8);
                    }
                    String str9 = this.f23823d;
                    if (str9 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str9);
                    }
                    String str10 = this.f23824e;
                    if (str10 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str10);
                    }
                    String str11 = this.f23825f;
                    if (str11 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str11);
                    }
                    String str12 = this.f23826g;
                    if (str12 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str12);
                    }
                    r02.h(7);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
        }
    }
}
