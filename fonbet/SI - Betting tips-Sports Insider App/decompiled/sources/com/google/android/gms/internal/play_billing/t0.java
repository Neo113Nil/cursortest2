package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f5588c;

    public t0(u0 u0Var) {
        this.f5588c = u0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        u0 u0Var = this.f5588c;
        d3.h(i5, u0Var.f5596e);
        Object[] objArr = u0Var.f5595d;
        int i10 = i5 + i5;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5588c.f5596e;
    }
}
