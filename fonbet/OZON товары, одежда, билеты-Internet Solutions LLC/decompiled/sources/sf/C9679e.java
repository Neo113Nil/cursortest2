package sf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9679e implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9677c f98706a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f98707b;

    C9679e(C9677c c9677c, M m11) {
        this.f98706a = c9677c;
        this.f98707b = m11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        M m11 = this.f98707b;
        C9677c c9677c = this.f98706a;
        c9677c.r();
        try {
            ((v) m11).close();
            Unit unit = Unit.f71690a;
            if (c9677c.s()) {
                throw c9677c.t(null);
            }
        } catch (IOException e11) {
            if (!c9677c.s()) {
                throw e11;
            }
            throw c9677c.t(e11);
        } finally {
            c9677c.s();
        }
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        M m11 = this.f98707b;
        C9677c c9677c = this.f98706a;
        c9677c.r();
        try {
            long read = ((v) m11).read(sink, j11);
            if (c9677c.s()) {
                throw c9677c.t(null);
            }
            return read;
        } catch (IOException e11) {
            if (c9677c.s()) {
                throw c9677c.t(e11);
            }
            throw e11;
        } finally {
            c9677c.s();
        }
    }

    @Override // sf.M
    public final N timeout() {
        return this.f98706a;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.source(" + this.f98707b + ')';
    }
}
