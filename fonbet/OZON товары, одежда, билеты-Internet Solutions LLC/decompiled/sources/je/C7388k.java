package je;

import java.util.List;
import je.AbstractC7394n;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7388k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7394n f69896a;

    public C7388k(AbstractC7394n abstractC7394n) {
        this.f69896a = abstractC7394n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC7394n.a supertypes = (AbstractC7394n.a) obj;
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        AbstractC7394n abstractC7394n = this.f69896a;
        td.g0 g10 = abstractC7394n.g();
        List a11 = supertypes.a();
        g10.a(abstractC7394n, a11, new C7390l(abstractC7394n), new C7392m(abstractC7394n));
        if (a11.isEmpty()) {
            N e11 = abstractC7394n.e();
            List a02 = e11 != null ? C7714v.a0(e11) : null;
            if (a02 == null) {
                a02 = kotlin.collections.K.f71697a;
            }
            a11 = a02;
        }
        List<N> list = a11 instanceof List ? (List) a11 : null;
        if (list == null) {
            list = C7714v.U0(a11);
        }
        supertypes.c(abstractC7394n.i(list));
        return Unit.f71690a;
    }
}
