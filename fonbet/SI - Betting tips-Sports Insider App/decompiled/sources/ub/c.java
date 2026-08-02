package ub;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24169a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f24174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f24176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24177i;
    public final /* synthetic */ String j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f24178k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f24179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Integer f24180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f24181n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f24182o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f24183p;
    public final /* synthetic */ String q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f24184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f24185s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f24186t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f24187u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f24188v;

    public /* synthetic */ c(int i5, int i10, int i11, int i12, String str, String str2, String str3, int i13, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f24170b = i5;
        this.f24171c = i10;
        this.f24172d = i11;
        this.f24173e = i12;
        this.f24174f = str;
        this.f24175g = str2;
        this.f24176h = str3;
        this.f24177i = i13;
        this.j = str4;
        this.f24178k = str5;
        this.f24179l = str6;
        this.f24180m = num;
        this.f24181n = num2;
        this.f24182o = str7;
        this.f24183p = str8;
        this.q = str9;
        this.f24184r = str10;
        this.f24185s = num3;
        this.f24186t = num4;
        this.f24187u = num5;
        this.f24188v = num6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f24169a) {
            case 0:
                int i5 = this.f24170b;
                int i10 = this.f24171c;
                int i11 = this.f24172d;
                String str = this.f24174f;
                int i12 = this.f24173e;
                int i13 = this.f24177i;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("\n        UPDATE table_prediction_preview \n        SET startTime = ?, publication = ?, type = ?, status = ?,\n        imageBackground = ? ,odds = ?, purchased = ?,\n        forecasts = ?, arrayKind = ?,\n        oddsForecast = ?, forecast = ?,\n        teamHomeId = ?, teamGuestId = ?,\n        teamHomeFlag = ?, teamGuestFlag = ?,\n        teamHomeName = ?, teamGuestName = ?,\n        scoreHome = ?, scoreGuest = ?,\n        scoreHomeExtra = ?, scoreGuestExtra = ?\n        WHERE id == ? ");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.f(3, i11);
                    r02.B(4, str);
                    String str2 = this.f24175g;
                    if (str2 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str2);
                    }
                    String str3 = this.f24176h;
                    if (str3 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str3);
                    }
                    r02.f(7, i12);
                    r02.h(8);
                    String str4 = this.j;
                    if (str4 == null) {
                        r02.h(9);
                    } else {
                        r02.B(9, str4);
                    }
                    String str5 = this.f24178k;
                    if (str5 == null) {
                        r02.h(10);
                    } else {
                        r02.B(10, str5);
                    }
                    String str6 = this.f24179l;
                    if (str6 == null) {
                        r02.h(11);
                    } else {
                        r02.B(11, str6);
                    }
                    if (this.f24180m == null) {
                        r02.h(12);
                    } else {
                        r02.f(12, r0.intValue());
                    }
                    if (this.f24181n == null) {
                        r02.h(13);
                    } else {
                        r02.f(13, r0.intValue());
                    }
                    String str7 = this.f24182o;
                    if (str7 == null) {
                        r02.h(14);
                    } else {
                        r02.B(14, str7);
                    }
                    String str8 = this.f24183p;
                    if (str8 == null) {
                        r02.h(15);
                    } else {
                        r02.B(15, str8);
                    }
                    String str9 = this.q;
                    if (str9 == null) {
                        r02.h(16);
                    } else {
                        r02.B(16, str9);
                    }
                    String str10 = this.f24184r;
                    if (str10 == null) {
                        r02.h(17);
                    } else {
                        r02.B(17, str10);
                    }
                    if (this.f24185s == null) {
                        r02.h(18);
                    } else {
                        r02.f(18, r0.intValue());
                    }
                    if (this.f24186t == null) {
                        r02.h(19);
                    } else {
                        r02.f(19, r0.intValue());
                    }
                    if (this.f24187u == null) {
                        r02.h(20);
                    } else {
                        r02.f(20, r0.intValue());
                    }
                    if (this.f24188v == null) {
                        r02.h(21);
                    } else {
                        r02.f(21, r0.intValue());
                    }
                    r02.f(22, i13);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
            default:
                int i14 = this.f24170b;
                int i15 = this.f24171c;
                int i16 = this.f24172d;
                int i17 = this.f24173e;
                String str11 = this.f24174f;
                int i18 = this.f24177i;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT INTO table_prediction_preview (id, startTime, publication, type, status, \n        imageBackground, odds, purchased, forecasts, arrayKind, oddsForecast, forecast, \n        teamHomeId, teamGuestId, teamHomeFlag, teamGuestFlag, teamHomeName, teamGuestName, \n        scoreHome, scoreGuest, scoreHomeExtra, scoreGuestExtra) \n    VALUES (?, ?, ?, ?, ?, ?, ?, ?,\n            ?, ?, \n            ?, ?, ?, ?, ?, ?, \n            ?, ?, ?, ?, ?, ?)");
                try {
                    r02.f(1, i14);
                    r02.f(2, i15);
                    r02.f(3, i16);
                    r02.f(4, i17);
                    r02.B(5, str11);
                    String str12 = this.f24175g;
                    if (str12 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str12);
                    }
                    String str13 = this.f24176h;
                    if (str13 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str13);
                    }
                    r02.f(8, i18);
                    r02.h(9);
                    String str14 = this.j;
                    if (str14 == null) {
                        r02.h(10);
                    } else {
                        r02.B(10, str14);
                    }
                    String str15 = this.f24178k;
                    if (str15 == null) {
                        r02.h(11);
                    } else {
                        r02.B(11, str15);
                    }
                    String str16 = this.f24179l;
                    if (str16 == null) {
                        r02.h(12);
                    } else {
                        r02.B(12, str16);
                    }
                    if (this.f24180m == null) {
                        r02.h(13);
                    } else {
                        r02.f(13, r0.intValue());
                    }
                    if (this.f24181n == null) {
                        r02.h(14);
                    } else {
                        r02.f(14, r0.intValue());
                    }
                    String str17 = this.f24182o;
                    if (str17 == null) {
                        r02.h(15);
                    } else {
                        r02.B(15, str17);
                    }
                    String str18 = this.f24183p;
                    if (str18 == null) {
                        r02.h(16);
                    } else {
                        r02.B(16, str18);
                    }
                    String str19 = this.q;
                    if (str19 == null) {
                        r02.h(17);
                    } else {
                        r02.B(17, str19);
                    }
                    String str20 = this.f24184r;
                    if (str20 == null) {
                        r02.h(18);
                    } else {
                        r02.B(18, str20);
                    }
                    if (this.f24185s == null) {
                        r02.h(19);
                    } else {
                        r02.f(19, r0.intValue());
                    }
                    if (this.f24186t == null) {
                        r02.h(20);
                    } else {
                        r02.f(20, r0.intValue());
                    }
                    if (this.f24187u == null) {
                        r02.h(21);
                    } else {
                        r02.f(21, r0.intValue());
                    }
                    if (this.f24188v == null) {
                        r02.h(22);
                    } else {
                        r02.f(22, r0.intValue());
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
        }
    }

    public /* synthetic */ c(int i5, int i10, int i11, String str, String str2, String str3, int i12, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, Integer num3, Integer num4, Integer num5, Integer num6, int i13) {
        this.f24170b = i5;
        this.f24171c = i10;
        this.f24172d = i11;
        this.f24174f = str;
        this.f24175g = str2;
        this.f24176h = str3;
        this.f24173e = i12;
        this.j = str4;
        this.f24178k = str5;
        this.f24179l = str6;
        this.f24180m = num;
        this.f24181n = num2;
        this.f24182o = str7;
        this.f24183p = str8;
        this.q = str9;
        this.f24184r = str10;
        this.f24185s = num3;
        this.f24186t = num4;
        this.f24187u = num5;
        this.f24188v = num6;
        this.f24177i = i13;
    }
}
