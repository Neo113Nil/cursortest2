package H7;

import v7.C6650e;
import v7.InterfaceC6648c;

/* loaded from: classes2.dex */
public class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public C6650e f4845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4846e;

    public c(C6650e c6650e, boolean z10) {
        this.f4845d = c6650e;
        this.f4846e = z10;
    }

    @Override // H7.a, H7.e
    public boolean V1() {
        return this.f4846e;
    }

    public synchronized InterfaceC6648c Y1() {
        C6650e c6650e;
        c6650e = this.f4845d;
        return c6650e == null ? null : c6650e.d();
    }

    public synchronized C6650e Z1() {
        return this.f4845d;
    }

    @Override // H7.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                C6650e c6650e = this.f4845d;
                if (c6650e == null) {
                    return;
                }
                this.f4845d = null;
                c6650e.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // H7.e, H7.m
    public synchronized int getHeight() {
        C6650e c6650e;
        c6650e = this.f4845d;
        return c6650e == null ? 0 : c6650e.d().getHeight();
    }

    @Override // H7.e, H7.m
    public synchronized int getWidth() {
        C6650e c6650e;
        c6650e = this.f4845d;
        return c6650e == null ? 0 : c6650e.d().getWidth();
    }

    @Override // H7.e
    public synchronized boolean isClosed() {
        return this.f4845d == null;
    }

    @Override // H7.e
    public synchronized int o() {
        C6650e c6650e;
        c6650e = this.f4845d;
        return c6650e == null ? 0 : c6650e.d().o();
    }
}
