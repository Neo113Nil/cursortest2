package di;

import bi.m;
import bi.n;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class G extends J0 {

    /* renamed from: j, reason: collision with root package name */
    public final bi.m f45294j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f45295k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(final String name, final int i10) {
        super(name, null, i10, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f45294j = m.b.f25229a;
        this.f45295k = LazyKt.lazy(new Function0() { // from class: di.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                bi.f[] x10;
                x10 = G.x(i10, name, this);
                return x10;
            }
        });
    }

    public static final bi.f[] x(int i10, String str, G g10) {
        bi.f[] fVarArr = new bi.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fVarArr[i11] = bi.l.h(str + '.' + g10.e(i11), n.d.f25233a, new bi.f[0], null, 8, null);
        }
        return fVarArr;
    }

    @Override // di.J0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bi.f)) {
            return false;
        }
        bi.f fVar = (bi.f) obj;
        return fVar.getKind() == m.b.f25229a && Intrinsics.areEqual(h(), fVar.h()) && Intrinsics.areEqual(E0.a(this), E0.a(fVar));
    }

    @Override // di.J0, bi.f
    public bi.f g(int i10) {
        return y()[i10];
    }

    @Override // di.J0, bi.f
    public bi.m getKind() {
        return this.f45294j;
    }

    @Override // di.J0
    public int hashCode() {
        int hashCode = h().hashCode();
        int i10 = 1;
        for (String str : bi.i.b(this)) {
            int i11 = i10 * 31;
            i10 = i11 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i10;
    }

    @Override // di.J0
    public String toString() {
        return CollectionsKt.joinToString$default(bi.i.b(this), ", ", h() + '(', ")", 0, null, null, 56, null);
    }

    public final bi.f[] y() {
        return (bi.f[]) this.f45295k.getValue();
    }
}
