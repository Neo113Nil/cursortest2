package defpackage;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class kn8 implements cwh {

    @NotNull
    private final cwh delegate;

    public kn8(cwh cwhVar) {
        cwhVar.getClass();
        this.delegate = cwhVar;
    }

    @wx4
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final cwh m880deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final cwh delegate() {
        return this.delegate;
    }

    @Override // defpackage.cwh
    public long read(x52 x52Var, long j) {
        x52Var.getClass();
        return this.delegate.read(x52Var, j);
    }

    @Override // defpackage.cwh
    @NotNull
    public pij timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
