package nd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.J0;

/* renamed from: nd.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8564t implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77035a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8504A f77036b;

    public /* synthetic */ C8564t(AbstractC8504A abstractC8504A, int i11) {
        this.f77035a = i11;
        this.f77036b = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f77035a) {
            case 0:
                AbstractC8504A abstractC8504A = this.f77036b;
                List<td.i0> typeParameters = abstractC8504A.t().getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                List<td.i0> list = typeParameters;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (td.i0 i0Var : list) {
                    Intrinsics.f(i0Var);
                    arrayList.add(new T0(abstractC8504A, i0Var));
                }
                return arrayList;
            default:
                return M0.a((J0.b) this.f77036b, true);
        }
    }
}
