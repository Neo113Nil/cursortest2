package sf;

import I0.C3173b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class u implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f98758a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Inflater f98759b;

    /* renamed from: c, reason: collision with root package name */
    private int f98760c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f98761d;

    public u(@NotNull G source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f98758a = source;
        this.f98759b = inflater;
    }

    public final long c(@NotNull C9681g sink, long j11) throws IOException {
        Inflater inflater = this.f98759b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        if (this.f98761d) {
            throw new IllegalStateException("closed");
        }
        if (j11 != 0) {
            try {
                H W11 = sink.W(1);
                int min = (int) Math.min(j11, 8192 - W11.f98672c);
                boolean needsInput = inflater.needsInput();
                G g10 = this.f98758a;
                if (needsInput && !g10.c()) {
                    H h11 = g10.f98667b.f98708a;
                    Intrinsics.f(h11);
                    int i11 = h11.f98672c;
                    int i12 = h11.f98671b;
                    int i13 = i11 - i12;
                    this.f98760c = i13;
                    inflater.setInput(h11.f98670a, i12, i13);
                }
                int inflate = inflater.inflate(W11.f98670a, W11.f98672c, min);
                int i14 = this.f98760c;
                if (i14 != 0) {
                    int remaining = i14 - inflater.getRemaining();
                    this.f98760c -= remaining;
                    g10.skip(remaining);
                }
                if (inflate > 0) {
                    W11.f98672c += inflate;
                    long j12 = inflate;
                    sink.O(sink.size() + j12);
                    return j12;
                }
                if (W11.f98671b == W11.f98672c) {
                    sink.f98708a = W11.a();
                    I.a(W11);
                }
            } catch (DataFormatException e11) {
                throw new IOException(e11);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f98761d) {
            return;
        }
        this.f98759b.end();
        this.f98761d = true;
        this.f98758a.close();
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long c11 = c(sink, j11);
            if (c11 > 0) {
                return c11;
            }
            Inflater inflater = this.f98759b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f98758a.c());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return this.f98758a.f98666a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull M source, @NotNull Inflater inflater) {
        this(z.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
