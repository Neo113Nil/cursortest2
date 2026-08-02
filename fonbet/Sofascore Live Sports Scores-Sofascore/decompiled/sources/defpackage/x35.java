package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x35 extends kn8 {
    public boolean b;
    public final /* synthetic */ l45 c;
    public final /* synthetic */ a45 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x35(cwh cwhVar, l45 l45Var, a45 a45Var) {
        super(cwhVar);
        this.c = l45Var;
        this.d = a45Var;
    }

    @Override // defpackage.kn8, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        l45 l45Var = this.c;
        a45 a45Var = this.d;
        synchronized (l45Var) {
            try {
                int i = a45Var.h - 1;
                a45Var.h = i;
                if (i == 0 && a45Var.f) {
                    l45Var.M(a45Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
