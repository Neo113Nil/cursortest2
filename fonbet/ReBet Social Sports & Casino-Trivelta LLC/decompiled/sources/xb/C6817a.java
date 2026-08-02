package xb;

import xb.C6819c;
import xb.d;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6817a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f68093b;

    /* renamed from: c, reason: collision with root package name */
    public final C6819c.a f68094c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68096e;

    /* renamed from: f, reason: collision with root package name */
    public final long f68097f;

    /* renamed from: g, reason: collision with root package name */
    public final long f68098g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68099h;

    /* renamed from: xb.a$b */
    public static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f68100a;

        /* renamed from: b, reason: collision with root package name */
        public C6819c.a f68101b;

        /* renamed from: c, reason: collision with root package name */
        public String f68102c;

        /* renamed from: d, reason: collision with root package name */
        public String f68103d;

        /* renamed from: e, reason: collision with root package name */
        public long f68104e;

        /* renamed from: f, reason: collision with root package name */
        public long f68105f;

        /* renamed from: g, reason: collision with root package name */
        public String f68106g;

        /* renamed from: h, reason: collision with root package name */
        public byte f68107h;

        @Override // xb.d.a
        public d a() {
            if (this.f68107h == 3 && this.f68101b != null) {
                return new C6817a(this.f68100a, this.f68101b, this.f68102c, this.f68103d, this.f68104e, this.f68105f, this.f68106g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f68101b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f68107h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f68107h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // xb.d.a
        public d.a b(String str) {
            this.f68102c = str;
            return this;
        }

        @Override // xb.d.a
        public d.a c(long j10) {
            this.f68104e = j10;
            this.f68107h = (byte) (this.f68107h | 1);
            return this;
        }

        @Override // xb.d.a
        public d.a d(String str) {
            this.f68100a = str;
            return this;
        }

        @Override // xb.d.a
        public d.a e(String str) {
            this.f68106g = str;
            return this;
        }

        @Override // xb.d.a
        public d.a f(String str) {
            this.f68103d = str;
            return this;
        }

        @Override // xb.d.a
        public d.a g(C6819c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f68101b = aVar;
            return this;
        }

        @Override // xb.d.a
        public d.a h(long j10) {
            this.f68105f = j10;
            this.f68107h = (byte) (this.f68107h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f68100a = dVar.d();
            this.f68101b = dVar.g();
            this.f68102c = dVar.b();
            this.f68103d = dVar.f();
            this.f68104e = dVar.c();
            this.f68105f = dVar.h();
            this.f68106g = dVar.e();
            this.f68107h = (byte) 3;
        }
    }

    @Override // xb.d
    public String b() {
        return this.f68095d;
    }

    @Override // xb.d
    public long c() {
        return this.f68097f;
    }

    @Override // xb.d
    public String d() {
        return this.f68093b;
    }

    @Override // xb.d
    public String e() {
        return this.f68099h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f68093b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f68094c.equals(dVar.g()) && ((str = this.f68095d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f68096e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f68097f == dVar.c() && this.f68098g == dVar.h() && ((str3 = this.f68099h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xb.d
    public String f() {
        return this.f68096e;
    }

    @Override // xb.d
    public C6819c.a g() {
        return this.f68094c;
    }

    @Override // xb.d
    public long h() {
        return this.f68098g;
    }

    public int hashCode() {
        String str = this.f68093b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f68094c.hashCode()) * 1000003;
        String str2 = this.f68095d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f68096e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f68097f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f68098g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f68099h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // xb.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f68093b + ", registrationStatus=" + this.f68094c + ", authToken=" + this.f68095d + ", refreshToken=" + this.f68096e + ", expiresInSecs=" + this.f68097f + ", tokenCreationEpochInSecs=" + this.f68098g + ", fisError=" + this.f68099h + "}";
    }

    public C6817a(String str, C6819c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f68093b = str;
        this.f68094c = aVar;
        this.f68095d = str2;
        this.f68096e = str3;
        this.f68097f = j10;
        this.f68098g = j11;
        this.f68099h = str4;
    }
}
