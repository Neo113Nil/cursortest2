package com.ironsource;

import xsna.bh10;
import xsna.e630;
import xsna.epx;
import xsna.fp;

/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4260c9 {
    private final long a;
    private final a b;
    private final long c;

    /* renamed from: com.ironsource.c9$a */
    public static final class a {
        private final long a;
        private final long b;
        private final long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final long f() {
            return this.c;
        }

        public int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public String toString() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            StringBuilder b = fp.b(j, "Memory(javaHeapKb=", ", nativeHeapKb=");
            b.append(j2);
            return e630.c(b, ", sharedOtherKb=", j3, ")");
        }

        public final a a(long j, long j2, long j3) {
            return new a(j, j2, j3);
        }

        public static /* synthetic */ a a(a aVar, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.a;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = aVar.b;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = aVar.c;
            }
            return aVar.a(j4, j5, j3);
        }
    }

    public C4260c9(long j, a aVar, long j2) {
        this.a = j;
        this.b = aVar;
        this.c = j2;
    }

    public final long a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    public final a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4260c9)) {
            return false;
        }
        C4260c9 c4260c9 = (C4260c9) obj;
        return this.a == c4260c9.a && epx.f(this.b, c4260c9.b) && this.c == c4260c9.c;
    }

    public final long f() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public String toString() {
        long j = this.a;
        a aVar = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder("InitParsingMetrics(parsingDurationMs=");
        sb.append(j);
        sb.append(", memory=");
        sb.append(aVar);
        return e630.c(sb, ", initResponseJsonSizeKb=", j2, ")");
    }

    public final C4260c9 a(long j, a aVar, long j2) {
        return new C4260c9(j, aVar, j2);
    }

    public static /* synthetic */ C4260c9 a(C4260c9 c4260c9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4260c9.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c4260c9.b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c4260c9.c;
        }
        return c4260c9.a(j3, aVar2, j2);
    }
}
