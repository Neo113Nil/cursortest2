package f8;

import com.google.android.gms.internal.measurement.d5;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final l f9516e = new l(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9517c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9518d;

    public l(int i5, Object[] objArr) {
        this.f9517c = objArr;
        this.f9518d = i5;
    }

    @Override // f8.e, f8.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f9517c;
        int i5 = this.f9518d;
        System.arraycopy(objArr2, 0, objArr, 0, i5);
        return i5;
    }

    @Override // f8.a
    public final Object[] b() {
        return this.f9517c;
    }

    @Override // f8.a
    public final int c() {
        return this.f9518d;
    }

    @Override // f8.a
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        d5.f(i5, this.f9518d);
        Object obj = this.f9517c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9518d;
    }
}
