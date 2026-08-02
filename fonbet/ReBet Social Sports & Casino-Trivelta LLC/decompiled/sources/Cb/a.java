package Cb;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    public static final a f1568p = new C0037a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f1569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1571c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1572d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1573e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1574f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1575g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1576h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1577i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1578j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1579k;

    /* renamed from: l, reason: collision with root package name */
    public final b f1580l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1581m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1582n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1583o;

    /* renamed from: Cb.a$a, reason: collision with other inner class name */
    public static final class C0037a {

        /* renamed from: a, reason: collision with root package name */
        public long f1584a = 0;

        /* renamed from: b, reason: collision with root package name */
        public String f1585b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f1586c = "";

        /* renamed from: d, reason: collision with root package name */
        public c f1587d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        public d f1588e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        public String f1589f = "";

        /* renamed from: g, reason: collision with root package name */
        public String f1590g = "";

        /* renamed from: h, reason: collision with root package name */
        public int f1591h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f1592i = 0;

        /* renamed from: j, reason: collision with root package name */
        public String f1593j = "";

        /* renamed from: k, reason: collision with root package name */
        public long f1594k = 0;

        /* renamed from: l, reason: collision with root package name */
        public b f1595l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        public String f1596m = "";

        /* renamed from: n, reason: collision with root package name */
        public long f1597n = 0;

        /* renamed from: o, reason: collision with root package name */
        public String f1598o = "";

        public a a() {
            return new a(this.f1584a, this.f1585b, this.f1586c, this.f1587d, this.f1588e, this.f1589f, this.f1590g, this.f1591h, this.f1592i, this.f1593j, this.f1594k, this.f1595l, this.f1596m, this.f1597n, this.f1598o);
        }

        public C0037a b(String str) {
            this.f1596m = str;
            return this;
        }

        public C0037a c(String str) {
            this.f1590g = str;
            return this;
        }

        public C0037a d(String str) {
            this.f1598o = str;
            return this;
        }

        public C0037a e(b bVar) {
            this.f1595l = bVar;
            return this;
        }

        public C0037a f(String str) {
            this.f1586c = str;
            return this;
        }

        public C0037a g(String str) {
            this.f1585b = str;
            return this;
        }

        public C0037a h(c cVar) {
            this.f1587d = cVar;
            return this;
        }

        public C0037a i(String str) {
            this.f1589f = str;
            return this;
        }

        public C0037a j(int i10) {
            this.f1591h = i10;
            return this;
        }

        public C0037a k(long j10) {
            this.f1584a = j10;
            return this;
        }

        public C0037a l(d dVar) {
            this.f1588e = dVar;
            return this;
        }

        public C0037a m(String str) {
            this.f1593j = str;
            return this;
        }

        public C0037a n(int i10) {
            this.f1592i = i10;
            return this;
        }
    }

    public enum b implements com.google.firebase.encoders.proto.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f1602a;

        b(int i10) {
            this.f1602a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.f1602a;
        }
    }

    public enum c implements com.google.firebase.encoders.proto.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f1607a;

        c(int i10) {
            this.f1607a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.f1607a;
        }
    }

    public enum d implements com.google.firebase.encoders.proto.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f1612a;

        d(int i10) {
            this.f1612a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.f1612a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f1569a = j10;
        this.f1570b = str;
        this.f1571c = str2;
        this.f1572d = cVar;
        this.f1573e = dVar;
        this.f1574f = str3;
        this.f1575g = str4;
        this.f1576h = i10;
        this.f1577i = i11;
        this.f1578j = str5;
        this.f1579k = j11;
        this.f1580l = bVar;
        this.f1581m = str6;
        this.f1582n = j12;
        this.f1583o = str7;
    }

    public static C0037a p() {
        return new C0037a();
    }

    public String a() {
        return this.f1581m;
    }

    public long b() {
        return this.f1579k;
    }

    public long c() {
        return this.f1582n;
    }

    public String d() {
        return this.f1575g;
    }

    public String e() {
        return this.f1583o;
    }

    public b f() {
        return this.f1580l;
    }

    public String g() {
        return this.f1571c;
    }

    public String h() {
        return this.f1570b;
    }

    public c i() {
        return this.f1572d;
    }

    public String j() {
        return this.f1574f;
    }

    public int k() {
        return this.f1576h;
    }

    public long l() {
        return this.f1569a;
    }

    public d m() {
        return this.f1573e;
    }

    public String n() {
        return this.f1578j;
    }

    public int o() {
        return this.f1577i;
    }
}
