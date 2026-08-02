package o5;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.K;
import sf.p;

/* renamed from: o5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8647e extends p {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<IOException, Unit> f77750b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77751c;

    /* JADX WARN: Multi-variable type inference failed */
    public C8647e(@NotNull K k11, @NotNull Function1<? super IOException, Unit> function1) {
        super(k11);
        this.f77750b = function1;
    }

    @Override // sf.p, sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e11) {
            this.f77751c = true;
            this.f77750b.invoke(e11);
        }
    }

    @Override // sf.p, sf.K, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e11) {
            this.f77751c = true;
            this.f77750b.invoke(e11);
        }
    }

    @Override // sf.p, sf.K
    public final void z0(@NotNull C9681g c9681g, long j11) {
        if (this.f77751c) {
            c9681g.skip(j11);
            return;
        }
        try {
            super.z0(c9681g, j11);
        } catch (IOException e11) {
            this.f77751c = true;
            ((C8646d) this.f77750b).invoke(e11);
        }
    }
}
