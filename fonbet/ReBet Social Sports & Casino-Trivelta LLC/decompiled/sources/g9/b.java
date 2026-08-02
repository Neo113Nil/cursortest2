package g9;

import g9.i;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f47163a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f47164b;

    /* renamed from: c, reason: collision with root package name */
    public final h f47165c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47166d;

    /* renamed from: e, reason: collision with root package name */
    public final long f47167e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f47168f;

    /* renamed from: g9.b$b, reason: collision with other inner class name */
    public static final class C0688b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f47169a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f47170b;

        /* renamed from: c, reason: collision with root package name */
        public h f47171c;

        /* renamed from: d, reason: collision with root package name */
        public Long f47172d;

        /* renamed from: e, reason: collision with root package name */
        public Long f47173e;

        /* renamed from: f, reason: collision with root package name */
        public Map f47174f;

        @Override // g9.i.a
        public i d() {
            String str = "";
            if (this.f47169a == null) {
                str = " transportName";
            }
            if (this.f47171c == null) {
                str = str + " encodedPayload";
            }
            if (this.f47172d == null) {
                str = str + " eventMillis";
            }
            if (this.f47173e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f47174f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f47169a, this.f47170b, this.f47171c, this.f47172d.longValue(), this.f47173e.longValue(), this.f47174f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g9.i.a
        public Map e() {
            Map map = this.f47174f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // g9.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f47174f = map;
            return this;
        }

        @Override // g9.i.a
        public i.a g(Integer num) {
            this.f47170b = num;
            return this;
        }

        @Override // g9.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f47171c = hVar;
            return this;
        }

        @Override // g9.i.a
        public i.a i(long j10) {
            this.f47172d = Long.valueOf(j10);
            return this;
        }

        @Override // g9.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f47169a = str;
            return this;
        }

        @Override // g9.i.a
        public i.a k(long j10) {
            this.f47173e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // g9.i
    public Map c() {
        return this.f47168f;
    }

    @Override // g9.i
    public Integer d() {
        return this.f47164b;
    }

    @Override // g9.i
    public h e() {
        return this.f47165c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f47163a.equals(iVar.j()) && ((num = this.f47164b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f47165c.equals(iVar.e()) && this.f47166d == iVar.f() && this.f47167e == iVar.k() && this.f47168f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.i
    public long f() {
        return this.f47166d;
    }

    public int hashCode() {
        int hashCode = (this.f47163a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f47164b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f47165c.hashCode()) * 1000003;
        long j10 = this.f47166d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47167e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47168f.hashCode();
    }

    @Override // g9.i
    public String j() {
        return this.f47163a;
    }

    @Override // g9.i
    public long k() {
        return this.f47167e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f47163a + ", code=" + this.f47164b + ", encodedPayload=" + this.f47165c + ", eventMillis=" + this.f47166d + ", uptimeMillis=" + this.f47167e + ", autoMetadata=" + this.f47168f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f47163a = str;
        this.f47164b = num;
        this.f47165c = hVar;
        this.f47166d = j10;
        this.f47167e = j11;
        this.f47168f = map;
    }
}
