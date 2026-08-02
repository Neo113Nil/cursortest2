package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient x0 f5605c;

    /* renamed from: d, reason: collision with root package name */
    public final transient w0 f5606d;

    public v0(x0 x0Var, w0 w0Var) {
        this.f5605c = x0Var;
        this.f5606d = w0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        return this.f5606d.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5605c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, com.google.android.gms.internal.play_billing.y
    public final d0 d() {
        return this.f5606d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5606d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5605c.f5633f;
    }
}
