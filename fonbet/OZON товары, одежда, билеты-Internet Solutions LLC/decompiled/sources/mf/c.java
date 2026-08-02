package mf;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.u;

/* loaded from: classes10.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final C9681g f74756a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f74757b;

    /* renamed from: c, reason: collision with root package name */
    private final u f74758c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f74759d;

    public c(boolean z11) {
        this.f74759d = z11;
        C9681g c9681g = new C9681g();
        this.f74756a = c9681g;
        Inflater inflater = new Inflater(true);
        this.f74757b = inflater;
        this.f74758c = new u(c9681g, inflater);
    }

    public final void c(@NotNull C9681g buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        C9681g c9681g = this.f74756a;
        if (c9681g.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Inflater inflater = this.f74757b;
        if (this.f74759d) {
            inflater.reset();
        }
        c9681g.y0(buffer);
        c9681g.r0(65535);
        long size = c9681g.size() + inflater.getBytesRead();
        do {
            this.f74758c.c(buffer, Long.MAX_VALUE);
        } while (inflater.getBytesRead() < size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f74758c.close();
    }
}
