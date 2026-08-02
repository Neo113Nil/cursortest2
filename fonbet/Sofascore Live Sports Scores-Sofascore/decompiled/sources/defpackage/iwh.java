package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iwh extends zt9 {
    public final n4o a;
    public boolean b;
    public final l62 c;
    public final Function0 d;

    public iwh(l62 l62Var, Function0 function0, n4o n4oVar) {
        this.a = n4oVar;
        this.c = l62Var;
        this.d = function0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = true;
        l62 l62Var = this.c;
        if (l62Var != null) {
            l.a(l62Var);
        }
    }

    @Override // defpackage.zt9
    public final n4o h() {
        return this.a;
    }

    @Override // defpackage.zt9
    public final synchronized l62 source() {
        l62 l62Var;
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            l62Var = this.c;
            if (l62Var == null) {
                uha uhaVar = s18.a;
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return l62Var;
    }
}
