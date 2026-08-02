package mf;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9676b;
import sf.C9681g;
import sf.C9684j;
import sf.C9685k;
import sf.z;

/* renamed from: mf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8138a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final C9681g f74751a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f74752b;

    /* renamed from: c, reason: collision with root package name */
    private final C9685k f74753c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f74754d;

    public C8138a(boolean z11) {
        this.f74754d = z11;
        C9681g sink = new C9681g();
        this.f74751a = sink;
        Deflater deflater = new Deflater(-1, true);
        this.f74752b = deflater;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f74753c = new C9685k(z.c(sink), deflater);
    }

    public final void c(@NotNull C9681g buffer) throws IOException {
        C9684j c9684j;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        C9681g c9681g = this.f74751a;
        if (c9681g.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f74754d) {
            this.f74752b.reset();
        }
        long size = buffer.size();
        C9685k c9685k = this.f74753c;
        c9685k.z0(buffer, size);
        c9685k.flush();
        c9684j = b.f74755a;
        if (c9681g.w1(c9681g.size() - c9684j.g(), c9684j)) {
            long size2 = c9681g.size() - 4;
            C9681g.a t2 = c9681g.t(C9676b.d());
            try {
                t2.c(size2);
                t2.close();
            } finally {
            }
        } else {
            c9681g.d0(0);
        }
        buffer.z0(c9681g, c9681g.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f74753c.close();
    }
}
