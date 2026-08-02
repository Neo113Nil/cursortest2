package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c45 implements AutoCloseable {
    public final y35 a;
    public boolean b;
    public final /* synthetic */ j45 c;

    public c45(j45 j45Var, y35 y35Var) {
        this.c = j45Var;
        this.a = y35Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        j45 j45Var = this.c;
        synchronized (j45Var.h) {
            try {
                y35 y35Var = this.a;
                int i = y35Var.h - 1;
                y35Var.h = i;
                if (i == 0 && y35Var.f) {
                    j45Var.t(y35Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
