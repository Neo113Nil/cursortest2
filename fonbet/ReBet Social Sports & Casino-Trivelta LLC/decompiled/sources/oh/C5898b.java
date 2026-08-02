package oh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import ph.AbstractC6072c;

/* renamed from: oh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5898b extends AbstractC6072c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f61231b = Comparator.comparing(new Function() { // from class: oh.a
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((e) obj).getKey();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final g f61232c = g.builder().build();

    public C5898b(Object[] objArr, Comparator comparator) {
        super(objArr, comparator);
    }

    public static g l(Object... objArr) {
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            e eVar = (e) objArr[i10];
            if (eVar != null && eVar.getKey().isEmpty()) {
                objArr[i10] = null;
            }
        }
        return new C5898b(objArr, f61231b);
    }

    @Override // oh.g
    public Object a(e eVar) {
        return super.g(eVar);
    }

    @Override // oh.g
    public h toBuilder() {
        return new d(new ArrayList(e()));
    }

    public C5898b(Object[] objArr) {
        super(objArr);
    }
}
