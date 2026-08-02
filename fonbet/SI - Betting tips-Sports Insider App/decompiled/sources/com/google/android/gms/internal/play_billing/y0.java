package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f5644h;

    /* renamed from: i, reason: collision with root package name */
    public static final y0 f5645i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5646c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5647d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5648e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5649f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f5650g;

    static {
        Object[] objArr = new Object[0];
        f5644h = objArr;
        f5645i = new y0(0, 0, 0, objArr, objArr);
    }

    public y0(int i5, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f5646c = objArr;
        this.f5647d = i5;
        this.f5648e = objArr2;
        this.f5649f = i10;
        this.f5650g = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f5646c;
        int i5 = this.f5650g;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int b() {
        return this.f5650g;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5648e;
            if (objArr.length != 0) {
                int c2 = d3.c(obj.hashCode());
                while (true) {
                    int i5 = c2 & this.f5649f;
                    Object obj2 = objArr[i5];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    c2 = i5 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final Object[] f() {
        return this.f5646c;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final d0 h() {
        return d0.i(this.f5650g, this.f5646c);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5647d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5650g;
    }
}
