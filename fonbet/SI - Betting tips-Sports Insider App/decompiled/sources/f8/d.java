package f8;

import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f9499c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f9501e;

    public d(e eVar, int i5, int i10) {
        this.f9501e = eVar;
        this.f9499c = i5;
        this.f9500d = i10;
    }

    @Override // f8.a
    public final Object[] b() {
        return this.f9501e.b();
    }

    @Override // f8.a
    public final int c() {
        return this.f9501e.d() + this.f9499c + this.f9500d;
    }

    @Override // f8.a
    public final int d() {
        return this.f9501e.d() + this.f9499c;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d5.f(i5, this.f9500d);
        return this.f9501e.get(i5 + this.f9499c);
    }

    @Override // f8.e, java.util.List
    /* renamed from: h */
    public final e subList(int i5, int i10) {
        d5.h(i5, i10, this.f9500d);
        int i11 = this.f9499c;
        return this.f9501e.subList(i5 + i11, i10 + i11);
    }

    @Override // f8.e, f8.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // f8.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9500d;
    }

    @Override // f8.e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i5) {
        return listIterator(i5);
    }
}
