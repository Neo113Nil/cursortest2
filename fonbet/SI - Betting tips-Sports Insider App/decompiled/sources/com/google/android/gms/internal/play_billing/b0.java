package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient d0 f5400c;

    public b0(d0 d0Var) {
        this.f5400c = d0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5400c.contains(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final boolean e() {
        return this.f5400c.e();
    }

    @Override // com.google.android.gms.internal.play_billing.d0
    public final d0 g() {
        return this.f5400c;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d0 d0Var = this.f5400c;
        d3.h(i5, d0Var.size());
        return d0Var.get((d0Var.size() - 1) - i5);
    }

    @Override // com.google.android.gms.internal.play_billing.d0, java.util.List
    /* renamed from: h */
    public final d0 subList(int i5, int i10) {
        d0 d0Var = this.f5400c;
        d3.y(i5, i10, d0Var.size());
        return d0Var.subList(d0Var.size() - i10, d0Var.size() - i5).g();
    }

    @Override // com.google.android.gms.internal.play_billing.d0, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f5400c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.d0, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f5400c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5400c.size();
    }
}
