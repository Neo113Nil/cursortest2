package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public i2 f5460a;

    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var;
        f1 f1Var;
        i2 i2Var = this.f5460a;
        if (i2Var == null || (z1Var = i2Var.f5482h) == null) {
            return;
        }
        this.f5460a = null;
        if (z1Var.isDone()) {
            Object obj = i2Var.f5532a;
            if (obj == null) {
                if (z1Var.isDone()) {
                    if (o1.f5530f.E(i2Var, null, o1.f(z1Var))) {
                        o1.h(i2Var);
                        return;
                    }
                    return;
                }
                i1 i1Var = new i1(i2Var, z1Var);
                if (o1.f5530f.E(i2Var, null, i1Var)) {
                    try {
                        z1Var.b(i1Var, s1.f5570a);
                        return;
                    } catch (Throwable th2) {
                        try {
                            f1Var = new f1(th2);
                        } catch (Error | Exception unused) {
                            f1Var = f1.f5446b;
                        }
                        o1.f5530f.E(i2Var, i1Var, f1Var);
                        return;
                    }
                }
                obj = i2Var.f5532a;
            }
            if (obj instanceof d1) {
                z1Var.cancel(((d1) obj).f5423a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = i2Var.f5483i;
            i2Var.f5483i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    i2Var.e(new h2(str));
                    throw th3;
                }
            }
            i2Var.e(new h2(str + ": " + z1Var.toString()));
        } finally {
            z1Var.cancel(true);
        }
    }
}
