package com.ironsource;

import defpackage.fn0;
import defpackage.ljg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4019c9 {
    private final long a;

    @NotNull
    private final a b;
    private final long c;

    public C4019c9(long j, @NotNull a aVar, long j2) {
        aVar.getClass();
        this.a = j;
        this.b = aVar;
        this.c = j2;
    }

    public static /* synthetic */ C4019c9 a(C4019c9 c4019c9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4019c9.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c4019c9.b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c4019c9.c;
        }
        return c4019c9.a(j3, aVar2, j2);
    }

    @NotNull
    public final a b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    @NotNull
    public final a e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4019c9)) {
            return false;
        }
        C4019c9 c4019c9 = (C4019c9) obj;
        return this.a == c4019c9.a && Intrinsics.c(this.b, c4019c9.b) && this.c == c4019c9.c;
    }

    public final long f() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.a;
        a aVar = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder("InitParsingMetrics(parsingDurationMs=");
        sb.append(j);
        sb.append(", memory=");
        sb.append(aVar);
        return fn0.l(j2, ", initResponseJsonSizeKb=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

        public boolean equals(@Nullable Object obj) {
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
            return Long.hashCode(this.c) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public String toString() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            StringBuilder o = ljg.o("Memory(javaHeapKb=", j, ", nativeHeapKb=");
            o.append(j2);
            return fn0.l(j3, ", sharedOtherKb=", ")", o);
        }

        @NotNull
        public final a a(long j, long j2, long j3) {
            return new a(j, j2, j3);
        }

        public final long a() {
            return this.a;
        }
    }

    @NotNull
    public final C4019c9 a(long j, @NotNull a aVar, long j2) {
        aVar.getClass();
        return new C4019c9(j, aVar, j2);
    }

    public final long a() {
        return this.a;
    }
}
