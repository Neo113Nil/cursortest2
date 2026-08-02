package tf;

import C.C2702w;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.M;
import sf.q;

/* loaded from: classes10.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    private final long f99494a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f99495b;

    /* renamed from: c, reason: collision with root package name */
    private long f99496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull M delegate, long j11, boolean z11) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99494a = j11;
        this.f99495b = z11;
    }

    @Override // sf.q, sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j12 = this.f99496c;
        long j13 = this.f99494a;
        if (j12 > j13) {
            j11 = 0;
        } else if (this.f99495b) {
            long j14 = j13 - j12;
            if (j14 == 0) {
                return -1L;
            }
            j11 = Math.min(j11, j14);
        }
        long read = super.read(sink, j11);
        if (read != -1) {
            this.f99496c += read;
        }
        long j15 = this.f99496c;
        if ((j15 >= j13 || read != -1) && j15 <= j13) {
            return read;
        }
        if (read > 0 && j15 > j13) {
            long size = sink.size() - (this.f99496c - j13);
            C9681g c9681g = new C9681g();
            c9681g.y0(sink);
            sink.z0(c9681g, size);
            c9681g.c();
        }
        StringBuilder d11 = C2702w.d(j13, "expected ", " bytes but got ");
        d11.append(this.f99496c);
        throw new IOException(d11.toString());
    }
}
