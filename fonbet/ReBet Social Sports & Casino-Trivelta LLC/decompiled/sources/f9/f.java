package f9;

import f9.l;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f46513a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f46514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46515c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46516d;

    /* renamed from: e, reason: collision with root package name */
    public final long f46517e;

    /* renamed from: f, reason: collision with root package name */
    public final o f46518f;
    private final byte[] sourceExtension;

    public static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f46519a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f46520b;

        /* renamed from: c, reason: collision with root package name */
        public Long f46521c;

        /* renamed from: d, reason: collision with root package name */
        public String f46522d;

        /* renamed from: e, reason: collision with root package name */
        public Long f46523e;

        /* renamed from: f, reason: collision with root package name */
        public o f46524f;
        private byte[] sourceExtension;

        @Override // f9.l.a
        public l a() {
            String str = "";
            if (this.f46519a == null) {
                str = " eventTimeMs";
            }
            if (this.f46521c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f46523e == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f46519a.longValue(), this.f46520b, this.f46521c.longValue(), this.sourceExtension, this.f46522d, this.f46523e.longValue(), this.f46524f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f9.l.a
        public l.a b(Integer num) {
            this.f46520b = num;
            return this;
        }

        @Override // f9.l.a
        public l.a c(long j10) {
            this.f46519a = Long.valueOf(j10);
            return this;
        }

        @Override // f9.l.a
        public l.a d(long j10) {
            this.f46521c = Long.valueOf(j10);
            return this;
        }

        @Override // f9.l.a
        public l.a e(o oVar) {
            this.f46524f = oVar;
            return this;
        }

        @Override // f9.l.a
        public l.a f(byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        @Override // f9.l.a
        public l.a g(String str) {
            this.f46522d = str;
            return this;
        }

        @Override // f9.l.a
        public l.a h(long j10) {
            this.f46523e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f9.l
    public Integer b() {
        return this.f46514b;
    }

    @Override // f9.l
    public long c() {
        return this.f46513a;
    }

    @Override // f9.l
    public long d() {
        return this.f46515c;
    }

    @Override // f9.l
    public o e() {
        return this.f46518f;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f46513a == lVar.c() && ((num = this.f46514b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f46515c == lVar.d()) {
                if (Arrays.equals(this.sourceExtension, lVar instanceof f ? ((f) lVar).sourceExtension : lVar.f()) && ((str = this.f46516d) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f46517e == lVar.h() && ((oVar = this.f46518f) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f9.l
    public byte[] f() {
        return this.sourceExtension;
    }

    @Override // f9.l
    public String g() {
        return this.f46516d;
    }

    @Override // f9.l
    public long h() {
        return this.f46517e;
    }

    public int hashCode() {
        long j10 = this.f46513a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f46514b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f46515c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.f46516d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f46517e;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f46518f;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f46513a + ", eventCode=" + this.f46514b + ", eventUptimeMs=" + this.f46515c + ", sourceExtension=" + Arrays.toString(this.sourceExtension) + ", sourceExtensionJsonProto3=" + this.f46516d + ", timezoneOffsetSeconds=" + this.f46517e + ", networkConnectionInfo=" + this.f46518f + "}";
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f46513a = j10;
        this.f46514b = num;
        this.f46515c = j11;
        this.sourceExtension = bArr;
        this.f46516d = str;
        this.f46517e = j12;
        this.f46518f = oVar;
    }
}
