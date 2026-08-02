package f8;

import com.google.android.gms.internal.measurement.d5;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f9519c;

    public m(n nVar) {
        this.f9519c = nVar;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        n nVar = this.f9519c;
        d5.f(i5, nVar.f9522f);
        Object[] objArr = nVar.f9521e;
        int i10 = i5 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9519c.f9522f;
    }
}
