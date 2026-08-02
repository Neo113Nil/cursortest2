package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f16387a;

    /* renamed from: b, reason: collision with root package name */
    public int f16388b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f16390d;

    public f(g gVar) {
        this.f16390d = gVar;
        this.f16387a = gVar.f16419b;
        this.f16389c = gVar.f16421d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16389c || this.f16387a != this.f16390d.f16420c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16389c = false;
        int i5 = this.f16387a;
        this.f16388b = i5;
        int i10 = i5 + 1;
        g gVar = this.f16390d;
        this.f16387a = i10 < gVar.f16422e ? i10 : 0;
        return gVar.f16418a[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i5;
        g gVar = this.f16390d;
        int i10 = gVar.f16422e;
        int i11 = this.f16388b;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        int i12 = gVar.f16419b;
        if (i11 == i12) {
            gVar.remove();
            this.f16388b = -1;
            return;
        }
        int i13 = i11 + 1;
        if (i12 >= i11 || i13 >= (i5 = gVar.f16420c)) {
            while (i13 != gVar.f16420c) {
                if (i13 >= i10) {
                    Object[] objArr = gVar.f16418a;
                    objArr[i13 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = gVar.f16418a;
                    int i14 = i13 - 1;
                    if (i14 < 0) {
                        i14 = i10 - 1;
                    }
                    objArr2[i14] = objArr2[i13];
                    i13++;
                    if (i13 >= i10) {
                    }
                }
                i13 = 0;
            }
        } else {
            Object[] objArr3 = gVar.f16418a;
            System.arraycopy(objArr3, i13, objArr3, i11, i5 - i13);
        }
        this.f16388b = -1;
        int i15 = gVar.f16420c - 1;
        if (i15 < 0) {
            i15 = i10 - 1;
        }
        gVar.f16420c = i15;
        gVar.f16418a[i15] = null;
        gVar.f16421d = false;
        int i16 = this.f16387a - 1;
        if (i16 < 0) {
            i16 = i10 - 1;
        }
        this.f16387a = i16;
    }
}
