package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b18 implements yt9 {
    public final uae a;
    public final s18 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public lof g;

    public b18(uae uaeVar, s18 s18Var, String str, AutoCloseable autoCloseable) {
        this.a = uaeVar;
        this.b = s18Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.yt9
    public final uae L0() {
        uae uaeVar;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            uaeVar = this.a;
        }
        return uaeVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.f = true;
            lof lofVar = this.g;
            if (lofVar != null) {
                try {
                    lofVar.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.d;
            if (autoCloseable != null) {
                try {
                    dmi.v(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.yt9
    public final s18 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.yt9
    public final l62 source() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            lof lofVar = this.g;
            if (lofVar != null) {
                return lofVar;
            }
            lof o = o6a.o(this.b.M(this.a));
            this.g = o;
            return o;
        }
    }

    @Override // defpackage.yt9
    public final oyn x() {
        return null;
    }
}
