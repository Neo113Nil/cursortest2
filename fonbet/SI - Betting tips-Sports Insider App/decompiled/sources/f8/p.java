package f8;

import com.google.android.gms.internal.measurement.d5;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9525c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9526d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f9527e;

    public p(int i5, int i10, Object[] objArr) {
        this.f9525c = objArr;
        this.f9526d = i5;
        this.f9527e = i10;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d5.f(i5, this.f9527e);
        Object obj = this.f9525c[(i5 * 2) + this.f9526d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9527e;
    }
}
