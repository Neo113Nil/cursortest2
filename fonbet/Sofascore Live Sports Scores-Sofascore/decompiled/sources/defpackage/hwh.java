package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hwh implements yt9 {
    public final s18 a;
    public final oyn b;
    public final Object c = new Object();
    public boolean d;
    public final l62 e;

    public hwh(l62 l62Var, s18 s18Var, oyn oynVar) {
        this.a = s18Var;
        this.b = oynVar;
        this.e = l62Var;
    }

    @Override // defpackage.yt9
    public final uae L0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            l62 l62Var = this.e;
            if (l62Var != null) {
                try {
                    l62Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.yt9
    public final s18 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.yt9
    public final l62 source() {
        l62 l62Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                l62Var = this.e;
                if (l62Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l62Var;
    }

    @Override // defpackage.yt9
    public final oyn x() {
        return this.b;
    }
}
