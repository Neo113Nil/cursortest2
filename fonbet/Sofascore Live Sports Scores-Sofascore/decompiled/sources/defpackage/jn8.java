package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class jn8 implements ejh {
    public final ejh a;

    public jn8(ejh ejhVar) {
        ejhVar.getClass();
        this.a = ejhVar;
    }

    @Override // defpackage.ejh
    public void W(x52 x52Var, long j) {
        x52Var.getClass();
        this.a.W(x52Var, j);
    }

    @Override // defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.ejh, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.ejh
    public final pij timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
