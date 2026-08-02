package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x45 implements Executor {
    public final au3 a;

    public x45(au3 au3Var) {
        this.a = au3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g gVar = g.a;
        au3 au3Var = this.a;
        if (t45.c(au3Var, gVar)) {
            t45.b(au3Var, gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
