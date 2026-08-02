package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d5 extends d3 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5428b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5429c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5430d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5431e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5432f;

    public d5(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f5428b = atomicReferenceFieldUpdater;
        this.f5429c = atomicReferenceFieldUpdater2;
        this.f5430d = atomicReferenceFieldUpdater3;
        this.f5431e = atomicReferenceFieldUpdater4;
        this.f5432f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean B(r5 r5Var, q5 q5Var, q5 q5Var2) {
        return d3.m(this.f5430d, r5Var, q5Var, q5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void j(q5 q5Var, q5 q5Var2) {
        this.f5429c.lazySet(q5Var, q5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void s(q5 q5Var, Thread thread) {
        this.f5428b.lazySet(q5Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean u(r5 r5Var, f4 f4Var, f4 f4Var2) {
        return d3.m(this.f5431e, r5Var, f4Var, f4Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean w(r5 r5Var, Object obj, Object obj2) {
        return d3.m(this.f5432f, r5Var, obj, obj2);
    }
}
