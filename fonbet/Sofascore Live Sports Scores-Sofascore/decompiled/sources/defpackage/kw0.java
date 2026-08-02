package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kw0 implements ej2 {
    public final jw0[] a;

    public kw0(jw0[] jw0VarArr) {
        this.a = jw0VarArr;
    }

    @Override // defpackage.ej2
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (jw0 jw0Var : this.a) {
            q55 q55Var = jw0Var.f;
            if (q55Var == null) {
                Intrinsics.i("handle");
                throw null;
            }
            q55Var.d();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
