package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Consumer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final b6.p f5598b;

    public u1(z1 z1Var, b6.p pVar) {
        this.f5597a = z1Var;
        this.f5598b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        Throwable th2;
        b6.p pVar = this.f5598b;
        z1 z1Var = this.f5597a;
        if (z1Var instanceof l2) {
            o1 o1Var = (o1) ((l2) z1Var);
            if (o1Var instanceof k1) {
                Object obj2 = o1Var.f5532a;
                if (obj2 instanceof f1) {
                    th2 = ((f1) obj2).f5447a;
                    if (th2 != null) {
                        pVar.g(th2);
                        return;
                    }
                }
            }
            th2 = null;
            if (th2 != null) {
            }
        }
        try {
            boolean isDone = z1Var.isDone();
            boolean z5 = false;
            Future future = z1Var;
            if (!isDone) {
                throw new IllegalStateException(d3.g("Future was expected to be done: %s", z1Var));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                    future = future;
                } catch (Throwable th3) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            com.android.billingclient.api.o0 o0Var = (com.android.billingclient.api.o0) pVar.f3081d;
            if (intValue <= 0) {
                ((Runnable) pVar.f3080c).run();
                return;
            }
            int i5 = pVar.f3078a;
            com.android.billingclient.api.k a7 = com.android.billingclient.api.t0.a(num.intValue(), "Billing override value was set by a license tester.");
            o0Var.T(105, i5, a7);
            ((Consumer) pVar.f3079b).n(a7);
        } catch (ExecutionException e7) {
            pVar.g(e7.getCause());
        } catch (Throwable th4) {
            pVar.g(th4);
        }
    }

    public final String toString() {
        androidx.appcompat.app.v0 v0Var = new androidx.appcompat.app.v0(u1.class.getSimpleName(), 5);
        j jVar = new j();
        ((j) v0Var.f366d).f5485b = jVar;
        v0Var.f366d = jVar;
        jVar.f5484a = this.f5598b;
        return v0Var.toString();
    }
}
