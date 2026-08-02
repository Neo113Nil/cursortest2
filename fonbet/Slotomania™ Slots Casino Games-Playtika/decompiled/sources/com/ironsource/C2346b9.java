package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2346b9 {
    private final long a;
    private final a b;
    private final long c;

    /* renamed from: com.ironsource.b9$a */
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
            return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "Memory(javaHeapKb=" + this.a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
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

    public C2346b9(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.a = j;
        this.b = memory;
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
        if (!(obj instanceof C2346b9)) {
            return false;
        }
        C2346b9 c2346b9 = (C2346b9) obj;
        return this.a == c2346b9.a && Intrinsics.areEqual(this.b, c2346b9.b) && this.c == c2346b9.c;
    }

    public final long f() {
        return this.a;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.a + ", memory=" + this.b + ", initResponseJsonSizeKb=" + this.c + ")";
    }

    public final C2346b9 a(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        return new C2346b9(j, memory, j2);
    }

    public static /* synthetic */ C2346b9 a(C2346b9 c2346b9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c2346b9.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c2346b9.b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c2346b9.c;
        }
        return c2346b9.a(j3, aVar2, j2);
    }
}
