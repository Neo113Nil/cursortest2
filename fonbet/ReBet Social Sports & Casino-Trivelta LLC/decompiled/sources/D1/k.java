package D1;

import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C2223y;
import e1.AbstractC4134a;
import java.io.IOException;

/* loaded from: classes.dex */
public interface k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2444a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2445b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2446c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2447d;

        public a(int i10, int i11, int i12, int i13) {
            this.f2444a = i10;
            this.f2445b = i11;
            this.f2446c = i12;
            this.f2447d = i13;
        }

        public boolean a(int i10) {
            return i10 == 1 ? this.f2444a - this.f2445b > 1 : this.f2446c - this.f2447d > 1;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2448a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2449b;

        public b(int i10, long j10) {
            AbstractC4134a.a(j10 >= 0);
            this.f2448a = i10;
            this.f2449b = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C2223y f2450a;

        /* renamed from: b, reason: collision with root package name */
        public final B f2451b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f2452c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2453d;

        public c(C2223y c2223y, B b10, IOException iOException, int i10) {
            this.f2450a = c2223y;
            this.f2451b = b10;
            this.f2452c = iOException;
            this.f2453d = i10;
        }
    }

    b a(a aVar, c cVar);

    long b(c cVar);

    int c(int i10);

    default void d(long j10) {
    }
}
