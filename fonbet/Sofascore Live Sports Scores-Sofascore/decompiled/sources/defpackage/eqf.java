package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eqf {
    public fqf a;
    public int b;
    public vu8 c;
    public Function2 d;
    public int e;
    public h0d f;
    public x0d g;

    public eqf(fqf fqfVar) {
        this.a = fqfVar;
    }

    public final boolean a() {
        if (this.a != null) {
            vu8 vu8Var = this.c;
            if (vu8Var != null ? vu8Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final raa b(Object obj) {
        raa f;
        fqf fqfVar = this.a;
        return (fqfVar == null || (f = fqfVar.f(this, obj)) == null) ? raa.a : f;
    }

    public final void c() {
        fqf fqfVar = this.a;
        if (fqfVar != null) {
            fqfVar.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
