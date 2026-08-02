package ub;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24191a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f24196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f24198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f24199i;
    public final /* synthetic */ String j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f24200k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f24201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f24202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f24203n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f24204o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f24205p;
    public final /* synthetic */ String q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f24206r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f24207s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f24208t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f24209u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f24210v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f24211w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24212x;

    public /* synthetic */ e(int i5, int i10, int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f24192b = i5;
        this.f24193c = i10;
        this.f24194d = i11;
        this.f24212x = i12;
        this.f24195e = str;
        this.f24196f = str2;
        this.f24197g = str3;
        this.f24198h = str4;
        this.f24199i = str5;
        this.j = str6;
        this.f24200k = str7;
        this.f24201l = str8;
        this.f24202m = str9;
        this.f24203n = num;
        this.f24204o = num2;
        this.f24205p = str10;
        this.q = str11;
        this.f24206r = str12;
        this.f24207s = str13;
        this.f24208t = num3;
        this.f24209u = num4;
        this.f24210v = num5;
        this.f24211w = num6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f24191a) {
            case 0:
                int i5 = this.f24192b;
                int i10 = this.f24193c;
                int i11 = this.f24194d;
                int i12 = this.f24212x;
                String str = this.f24195e;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("INSERT INTO table_prediction (id, startTime, publication, type, status, \n        imageBackground, odds, resultsIsViewed, analyticsFull, analyticsShort, league, forecasts,\n        arrayKind, arrayPrediction, oddsForecast, forecast, teamHomeId, teamGuestId,\n        teamHomeFlag, teamGuestFlag, teamHomeName, teamGuestName, scoreHome, scoreGuest, \n        scoreHomeExtra, scoreGuestExtra) \n    VALUES (?, ?, ?, ?, ?, ?, ?, ?, \n            ?, ?, ?, ?, ?, ?, \n            ?, ?, ?, ?, ?, ?, \n            ?, ?, ?, ?, ?, ?)");
                try {
                    r02.f(1, i5);
                    r02.f(2, i10);
                    r02.f(3, i11);
                    r02.f(4, i12);
                    r02.B(5, str);
                    String str2 = this.f24196f;
                    if (str2 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str2);
                    }
                    String str3 = this.f24197g;
                    if (str3 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str3);
                    }
                    r02.f(8, 0);
                    String str4 = this.f24198h;
                    if (str4 == null) {
                        r02.h(9);
                    } else {
                        r02.B(9, str4);
                    }
                    String str5 = this.f24199i;
                    if (str5 == null) {
                        r02.h(10);
                    } else {
                        r02.B(10, str5);
                    }
                    String str6 = this.j;
                    if (str6 == null) {
                        r02.h(11);
                    } else {
                        r02.B(11, str6);
                    }
                    r02.h(12);
                    String str7 = this.f24200k;
                    if (str7 == null) {
                        r02.h(13);
                    } else {
                        r02.B(13, str7);
                    }
                    r02.h(14);
                    String str8 = this.f24201l;
                    if (str8 == null) {
                        r02.h(15);
                    } else {
                        r02.B(15, str8);
                    }
                    String str9 = this.f24202m;
                    if (str9 == null) {
                        r02.h(16);
                    } else {
                        r02.B(16, str9);
                    }
                    if (this.f24203n == null) {
                        r02.h(17);
                    } else {
                        r02.f(17, r0.intValue());
                    }
                    if (this.f24204o == null) {
                        r02.h(18);
                    } else {
                        r02.f(18, r0.intValue());
                    }
                    String str10 = this.f24205p;
                    if (str10 == null) {
                        r02.h(19);
                    } else {
                        r02.B(19, str10);
                    }
                    String str11 = this.q;
                    if (str11 == null) {
                        r02.h(20);
                    } else {
                        r02.B(20, str11);
                    }
                    String str12 = this.f24206r;
                    if (str12 == null) {
                        r02.h(21);
                    } else {
                        r02.B(21, str12);
                    }
                    String str13 = this.f24207s;
                    if (str13 == null) {
                        r02.h(22);
                    } else {
                        r02.B(22, str13);
                    }
                    if (this.f24208t == null) {
                        r02.h(23);
                    } else {
                        r02.f(23, r0.intValue());
                    }
                    if (this.f24209u == null) {
                        r02.h(24);
                    } else {
                        r02.f(24, r0.intValue());
                    }
                    if (this.f24210v == null) {
                        r02.h(25);
                    } else {
                        r02.f(25, r0.intValue());
                    }
                    if (this.f24211w == null) {
                        r02.h(26);
                    } else {
                        r02.f(26, r0.intValue());
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection);
                    r02.close();
                    return Long.valueOf(p10);
                } finally {
                }
            default:
                int i13 = this.f24192b;
                int i14 = this.f24193c;
                int i15 = this.f24194d;
                String str14 = this.f24195e;
                int i16 = this.f24212x;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("\n        UPDATE table_prediction \n        SET startTime = ?, publication = ?, type = ?, status = ?,\n        imageBackground = ? ,odds = ?,\n        analyticsFull = ?, analyticsShort = ?, league = ?,\n        forecasts = ?, arrayKind = ?, arrayPrediction = ?, \n        oddsForecast = ?, forecast = ?,\n        teamHomeId = ?, teamGuestId = ?,\n        teamHomeFlag = ?, teamGuestFlag = ?,\n        teamHomeName = ?, teamGuestName = ?,\n        scoreHome = ?, scoreGuest = ?,\n        scoreHomeExtra = ?, scoreGuestExtra = ?\n        WHERE id == ? ");
                try {
                    r02.f(1, i13);
                    r02.f(2, i14);
                    r02.f(3, i15);
                    r02.B(4, str14);
                    String str15 = this.f24196f;
                    if (str15 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str15);
                    }
                    String str16 = this.f24197g;
                    if (str16 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str16);
                    }
                    String str17 = this.f24198h;
                    if (str17 == null) {
                        r02.h(7);
                    } else {
                        r02.B(7, str17);
                    }
                    String str18 = this.f24199i;
                    if (str18 == null) {
                        r02.h(8);
                    } else {
                        r02.B(8, str18);
                    }
                    String str19 = this.j;
                    if (str19 == null) {
                        r02.h(9);
                    } else {
                        r02.B(9, str19);
                    }
                    r02.h(10);
                    String str20 = this.f24200k;
                    if (str20 == null) {
                        r02.h(11);
                    } else {
                        r02.B(11, str20);
                    }
                    r02.h(12);
                    String str21 = this.f24201l;
                    if (str21 == null) {
                        r02.h(13);
                    } else {
                        r02.B(13, str21);
                    }
                    String str22 = this.f24202m;
                    if (str22 == null) {
                        r02.h(14);
                    } else {
                        r02.B(14, str22);
                    }
                    if (this.f24203n == null) {
                        r02.h(15);
                    } else {
                        r02.f(15, r0.intValue());
                    }
                    if (this.f24204o == null) {
                        r02.h(16);
                    } else {
                        r02.f(16, r0.intValue());
                    }
                    String str23 = this.f24205p;
                    if (str23 == null) {
                        r02.h(17);
                    } else {
                        r02.B(17, str23);
                    }
                    String str24 = this.q;
                    if (str24 == null) {
                        r02.h(18);
                    } else {
                        r02.B(18, str24);
                    }
                    String str25 = this.f24206r;
                    if (str25 == null) {
                        r02.h(19);
                    } else {
                        r02.B(19, str25);
                    }
                    String str26 = this.f24207s;
                    if (str26 == null) {
                        r02.h(20);
                    } else {
                        r02.B(20, str26);
                    }
                    if (this.f24208t == null) {
                        r02.h(21);
                    } else {
                        r02.f(21, r0.intValue());
                    }
                    if (this.f24209u == null) {
                        r02.h(22);
                    } else {
                        r02.f(22, r0.intValue());
                    }
                    if (this.f24210v == null) {
                        r02.h(23);
                    } else {
                        r02.f(23, r0.intValue());
                    }
                    if (this.f24211w == null) {
                        r02.h(24);
                    } else {
                        r02.f(24, r0.intValue());
                    }
                    r02.f(25, i16);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection2);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                }
        }
    }

    public /* synthetic */ e(int i5, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, Integer num3, Integer num4, Integer num5, Integer num6, int i12) {
        this.f24192b = i5;
        this.f24193c = i10;
        this.f24194d = i11;
        this.f24195e = str;
        this.f24196f = str2;
        this.f24197g = str3;
        this.f24198h = str4;
        this.f24199i = str5;
        this.j = str6;
        this.f24200k = str7;
        this.f24201l = str8;
        this.f24202m = str9;
        this.f24203n = num;
        this.f24204o = num2;
        this.f24205p = str10;
        this.q = str11;
        this.f24206r = str12;
        this.f24207s = str13;
        this.f24208t = num3;
        this.f24209u = num4;
        this.f24210v = num5;
        this.f24211w = num6;
        this.f24212x = i12;
    }
}
