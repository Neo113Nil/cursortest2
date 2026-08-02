package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f5395c;

    public a1(Object obj) {
        this.f5395c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        objArr[0] = this.f5395c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5395c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, com.google.android.gms.internal.play_billing.y
    public final d0 d() {
        Object[] objArr = {this.f5395c};
        for (int i5 = 0; i5 < 1; i5++) {
            a0 a0Var = d0.f5420b;
            if (objArr[i5] == null) {
                throw new NullPointerException(androidx.appcompat.widget.c1.i(i5, "at index "));
            }
        }
        return d0.i(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5395c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new m0(this.f5395c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return androidx.appcompat.widget.c1.n("[", this.f5395c.toString(), "]");
    }
}
