package sf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9678d implements K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9677c f98704a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f98705b;

    C9678d(C9677c c9677c, K k11) {
        this.f98704a = c9677c;
        this.f98705b = k11;
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        K k11 = this.f98705b;
        C9677c c9677c = this.f98704a;
        c9677c.r();
        try {
            ((C) k11).close();
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

    @Override // sf.K, java.io.Flushable
    public final void flush() {
        K k11 = this.f98705b;
        C9677c c9677c = this.f98704a;
        c9677c.r();
        try {
            ((C) k11).flush();
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

    @Override // sf.K
    public final N timeout() {
        return this.f98704a;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.sink(" + this.f98705b + ')';
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        C9676b.b(source.size(), 0L, j11);
        while (true) {
            long j12 = 0;
            if (j11 <= 0) {
                return;
            }
            H h11 = source.f98708a;
            Intrinsics.f(h11);
            while (true) {
                if (j12 >= 65536) {
                    break;
                }
                j12 += h11.f98672c - h11.f98671b;
                if (j12 >= j11) {
                    j12 = j11;
                    break;
                } else {
                    h11 = h11.f98675f;
                    Intrinsics.f(h11);
                }
            }
            K k11 = this.f98705b;
            C9677c c9677c = this.f98704a;
            c9677c.r();
            try {
                try {
                    ((C) k11).z0(source, j12);
                    Unit unit = Unit.f71690a;
                    if (c9677c.s()) {
                        throw c9677c.t(null);
                    }
                    j11 -= j12;
                } catch (IOException e11) {
                    if (!c9677c.s()) {
                        throw e11;
                    }
                    throw c9677c.t(e11);
                }
            } catch (Throwable th2) {
                c9677c.s();
                throw th2;
            }
        }
    }
}
