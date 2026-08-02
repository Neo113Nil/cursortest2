package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f5480a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f5481b;

    public i1(o1 o1Var, z1 z1Var) {
        this.f5480a = o1Var;
        this.f5481b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5480a.f5532a != this) {
            return;
        }
        z1 z1Var = this.f5481b;
        if (o1.f5530f.E(this.f5480a, this, o1.f(z1Var))) {
            o1.h(this.f5480a);
        }
    }
}
