package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 extends d3 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5465b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5466c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5467d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5468e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5469f;

    public h1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f5465b = atomicReferenceFieldUpdater;
        this.f5466c = atomicReferenceFieldUpdater2;
        this.f5467d = atomicReferenceFieldUpdater3;
        this.f5468e = atomicReferenceFieldUpdater4;
        this.f5469f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(o1 o1Var, g1 g1Var, g1 g1Var2) {
        return d3.l(this.f5468e, o1Var, g1Var, g1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(o1 o1Var, Object obj, Object obj2) {
        return d3.l(this.f5469f, o1Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(o1 o1Var, n1 n1Var, n1 n1Var2) {
        return d3.l(this.f5467d, o1Var, n1Var, n1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final g1 e(o1 o1Var) {
        return (g1) this.f5468e.getAndSet(o1Var, g1.f5456d);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final n1 p(o1 o1Var) {
        return (n1) this.f5467d.getAndSet(o1Var, n1.f5521c);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(n1 n1Var, n1 n1Var2) {
        this.f5466c.lazySet(n1Var, n1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(n1 n1Var, Thread thread) {
        this.f5465b.lazySet(n1Var, thread);
    }
}
