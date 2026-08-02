package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ uh2 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ fdb(AtomicBoolean atomicBoolean, uh2 uh2Var, Function0 function0, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = uh2Var;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Function0 function0 = this.d;
        uh2 uh2Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        uh2Var.a(function0.invoke());
                        break;
                    } catch (Throwable th) {
                        uh2Var.c(th);
                        return;
                    }
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        uh2Var.a(function0.invoke());
                        break;
                    } catch (Throwable th2) {
                        uh2Var.c(th2);
                    }
                }
                break;
        }
    }
}
