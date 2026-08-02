package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import defpackage.a70;
import defpackage.fgb;
import defpackage.uk0;
import defpackage.wt3;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zbc implements SignInConnectionListener {
    public fgb a;
    public Context b;
    public Executor g;
    public volatile uk0 h;
    public volatile uk0 i;
    public final Set k;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public final Semaphore j = new Semaphore(0);

    public zbc(SignInHubActivity signInHubActivity, Set set) {
        this.b = signInHubActivity.getApplicationContext();
        this.k = set;
    }

    public final void a() {
        if (this.i != null || this.h == null) {
            return;
        }
        this.h.getClass();
        if (this.g == null) {
            this.g = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        uk0 uk0Var = this.h;
        Executor executor = this.g;
        if (uk0Var.b == 1) {
            uk0Var.b = 2;
            executor.execute(uk0Var.a);
            return;
        }
        int C = wt3.C(uk0Var.b);
        if (C == 1) {
            a70.r("Cannot execute task: the task is already running.");
        } else if (C != 2) {
            a70.r("We should never reach this state");
        } else {
            a70.r("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final boolean b() {
        if (this.h == null) {
            return false;
        }
        boolean z = this.c;
        if (!z) {
            if (z) {
                c();
            } else {
                this.f = true;
            }
        }
        uk0 uk0Var = this.i;
        uk0 uk0Var2 = this.h;
        if (uk0Var != null) {
            uk0Var2.getClass();
            this.h = null;
            return false;
        }
        uk0Var2.getClass();
        uk0 uk0Var3 = this.h;
        uk0Var3.c.set(true);
        boolean cancel = uk0Var3.a.cancel(false);
        if (cancel) {
            this.i = this.h;
        }
        this.h = null;
        return cancel;
    }

    public final void c() {
        b();
        this.h = new uk0(this);
        a();
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.j.release();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
