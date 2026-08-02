package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient f0 f5594c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f5595d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5596e;

    public u0(f0 f0Var, Object[] objArr, int i5) {
        this.f5594c = f0Var;
        this.f5595d = objArr;
        this.f5596e = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        return d().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5594c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final d0 h() {
        return new t0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5596e;
    }
}
