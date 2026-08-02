package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/random/c;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f71821b = Yc.b.f34892a.b();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/random/c$a;", "Lkotlin/random/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "defaultRandom", "Lkotlin/random/c;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.c$a, reason: from kotlin metadata */
    public static final class Companion extends c implements Serializable {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/random/c$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.random.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        private static final class C1190a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1190a f71822a = new C1190a();

            private final Object readResolve() {
                return c.INSTANCE;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final Object writeReplace() {
            return C1190a.f71822a;
        }

        @Override // kotlin.random.c
        public final int b(int i11) {
            return c.f71821b.b(i11);
        }

        @Override // kotlin.random.c
        public final int d() {
            return c.f71821b.d();
        }

        @Override // kotlin.random.c
        public final int e(int i11) {
            return c.f71821b.e(i11);
        }

        @Override // kotlin.random.c
        public final int f(int i11, int i12) {
            return c.f71821b.f(i11, i12);
        }

        @Override // kotlin.random.c
        public final long g() {
            return c.f71821b.g();
        }

        @Override // kotlin.random.c
        public final long h(long j11, long j12) {
            return c.f71821b.h(j11, j12);
        }
    }

    public abstract int b(int i11);

    public int d() {
        return b(32);
    }

    public int e(int i11) {
        return f(0, i11);
    }

    public int f(int i11, int i12) {
        int d11;
        int i13;
        int i14;
        if (i12 <= i11) {
            throw new IllegalArgumentException(d.a(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
        int i15 = i12 - i11;
        if (i15 > 0 || i15 == Integer.MIN_VALUE) {
            if (((-i15) & i15) == i15) {
                i14 = b(31 - Integer.numberOfLeadingZeros(i15));
            } else {
                do {
                    d11 = d() >>> 1;
                    i13 = d11 % i15;
                } while ((i15 - 1) + (d11 - i13) < 0);
                i14 = i13;
            }
            return i11 + i14;
        }
        while (true) {
            int d12 = d();
            if (i11 <= d12 && d12 < i12) {
                return d12;
            }
        }
    }

    public long g() {
        return (d() << 32) + d();
    }

    public long h(long j11, long j12) {
        long g10;
        long j13;
        long j14;
        int d11;
        if (j12 <= j11) {
            throw new IllegalArgumentException(d.a(Long.valueOf(j11), Long.valueOf(j12)).toString());
        }
        long j15 = j12 - j11;
        if (j15 > 0) {
            if (((-j15) & j15) == j15) {
                int i11 = (int) j15;
                int i12 = (int) (j15 >>> 32);
                if (i11 != 0) {
                    d11 = b(31 - Integer.numberOfLeadingZeros(i11));
                } else if (i12 == 1) {
                    d11 = d();
                } else {
                    j14 = (b(31 - Integer.numberOfLeadingZeros(i12)) << 32) + (d() & 4294967295L);
                }
                j14 = d11 & 4294967295L;
            } else {
                do {
                    g10 = g() >>> 1;
                    j13 = g10 % j15;
                } while ((j15 - 1) + (g10 - j13) < 0);
                j14 = j13;
            }
            return j11 + j14;
        }
        while (true) {
            long g11 = g();
            if (j11 <= g11 && g11 < j12) {
                return g11;
            }
        }
    }
}
