package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f5407c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f5409e;

    public c0(d0 d0Var, int i5, int i10) {
        this.f5409e = d0Var;
        this.f5407c = i5;
        this.f5408d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int b() {
        return this.f5409e.c() + this.f5407c + this.f5408d;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int c() {
        return this.f5409e.c() + this.f5407c;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final Object[] f() {
        return this.f5409e.f();
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d3.h(i5, this.f5408d);
        return this.f5409e.get(i5 + this.f5407c);
    }

    @Override // com.google.android.gms.internal.play_billing.d0, java.util.List
    /* renamed from: h */
    public final d0 subList(int i5, int i10) {
        d3.y(i5, i10, this.f5408d);
        int i11 = this.f5407c;
        return this.f5409e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5408d;
    }
}
