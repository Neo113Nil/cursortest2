package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c18 extends zt9 {
    public final uae a;
    public final s18 b;
    public final String c;
    public final Closeable d;
    public boolean e;
    public lof f;

    public c18(uae uaeVar, s18 s18Var, String str, Closeable closeable) {
        this.a = uaeVar;
        this.b = s18Var;
        this.c = str;
        this.d = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.e = true;
            lof lofVar = this.f;
            if (lofVar != null) {
                l.a(lofVar);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                l.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.zt9
    public final n4o h() {
        return null;
    }

    @Override // defpackage.zt9
    public final synchronized l62 source() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        lof lofVar = this.f;
        if (lofVar != null) {
            return lofVar;
        }
        lof o = o6a.o(this.b.M(this.a));
        this.f = o;
        return o;
    }
}
