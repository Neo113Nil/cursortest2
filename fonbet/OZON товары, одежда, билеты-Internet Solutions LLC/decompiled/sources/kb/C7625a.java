package kb;

import Eb.i;
import Sh.b;
import org.jetbrains.annotations.NotNull;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7625a {

    /* renamed from: a, reason: collision with root package name */
    private final long f71189a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71190b;

    /* renamed from: c, reason: collision with root package name */
    private long f71191c;

    /* renamed from: kb.a$a, reason: collision with other inner class name */
    public static final class C1162a {

        /* renamed from: a, reason: collision with root package name */
        private long f71192a = 100;

        /* renamed from: b, reason: collision with root package name */
        private long f71193b = 600000;

        @NotNull
        public final C7625a a() {
            return new C7625a(this.f71192a, this.f71193b);
        }

        @NotNull
        public final void b(long j11) {
            if (j11 <= 0) {
                throw new IllegalStateException(b.b(j11, "initial back off should be positive: ", " < 0").toString());
            }
            this.f71192a = j11;
        }

        @NotNull
        public final void c(long j11) {
            if (j11 <= 0) {
                throw new IllegalStateException(b.b(j11, "max back off should be positive: ", " < 0").toString());
            }
            this.f71193b = j11;
        }
    }

    public C7625a(long j11, long j12) {
        this.f71189a = j11;
        this.f71190b = j12;
        this.f71191c = j11;
    }

    public final long a() {
        double a11 = (i.a() * 100) + 1000;
        long j11 = (long) (this.f71191c * 2.0d);
        long j12 = this.f71190b;
        if (j11 > j12) {
            j11 = j12;
        }
        long j13 = j11 + ((long) a11);
        this.f71191c = j13;
        return j13;
    }

    public final void b() {
        this.f71191c = this.f71189a;
    }
}
