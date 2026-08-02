package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5053b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f5055d;

    public g1(j1 j1Var, boolean z5) {
        Objects.requireNonNull(j1Var);
        this.f5055d = j1Var;
        this.f5052a = System.currentTimeMillis();
        this.f5053b = SystemClock.elapsedRealtime();
        this.f5054c = z5;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.f5055d;
        if (j1Var.f5094d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e7) {
            j1Var.d(e7, false, this.f5054c);
            b();
        }
    }

    public void b() {
    }
}
