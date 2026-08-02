package sf;

import I0.C3173b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class E implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9683i f98656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9681g f98657b;

    /* renamed from: c, reason: collision with root package name */
    private H f98658c;

    /* renamed from: d, reason: collision with root package name */
    private int f98659d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f98660e;

    /* renamed from: f, reason: collision with root package name */
    private long f98661f;

    public E(@NotNull InterfaceC9683i upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f98656a = upstream;
        C9681g f7 = upstream.f();
        this.f98657b = f7;
        H h11 = f7.f98708a;
        this.f98658c = h11;
        this.f98659d = h11 != null ? h11.f98671b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f98660e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f98671b) goto L15;
     */
    @Override // sf.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(@NotNull C9681g sink, long j11) {
        H h11;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        if (this.f98660e) {
            throw new IllegalStateException("closed");
        }
        H h12 = this.f98658c;
        C9681g c9681g = this.f98657b;
        if (h12 != null) {
            H h13 = c9681g.f98708a;
            if (h12 == h13) {
                int i11 = this.f98659d;
                Intrinsics.f(h13);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j11 == 0) {
            return 0L;
        }
        if (!this.f98656a.n(this.f98661f + 1)) {
            return -1L;
        }
        if (this.f98658c == null && (h11 = c9681g.f98708a) != null) {
            this.f98658c = h11;
            this.f98659d = h11.f98671b;
        }
        long min = Math.min(j11, c9681g.size() - this.f98661f);
        this.f98657b.k(sink, this.f98661f, min);
        this.f98661f += min;
        return min;
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f98656a.timeout();
    }
}
