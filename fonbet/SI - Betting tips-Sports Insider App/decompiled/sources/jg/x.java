package jg;

import eg.v1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18530a;

    public /* synthetic */ x(int i5) {
        this.f18530a = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f18530a) {
            case 0:
                v1 v1Var = (v1) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (v1Var != null) {
                    return v1Var;
                }
                if (element instanceof v1) {
                    return (v1) element;
                }
                return null;
            case 1:
                c0 c0Var = (c0) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (element2 instanceof v1) {
                    v1 v1Var2 = (v1) element2;
                    Object U = v1Var2.U(c0Var.f18490a);
                    Object[] objArr = c0Var.f18491b;
                    int i5 = c0Var.f18493d;
                    objArr[i5] = U;
                    v1[] v1VarArr = c0Var.f18492c;
                    c0Var.f18493d = i5 + 1;
                    Intrinsics.checkNotNull(v1Var2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                    v1VarArr[i5] = v1Var2;
                }
                return c0Var;
            case 2:
                String acc = (String) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element3, "element");
                if (acc.length() == 0) {
                    return element3.toString();
                }
                return acc + ", " + element3;
            default:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element4, "element");
                CoroutineContext z5 = acc2.z(element4.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
                if (z5 == gVar) {
                    return element4;
                }
                kf.d dVar = kotlin.coroutines.d.f19226f0;
                kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) z5.r(dVar);
                if (dVar2 == null) {
                    cVar = new kotlin.coroutines.c(element4, z5);
                } else {
                    CoroutineContext z7 = z5.z(dVar);
                    if (z7 == gVar) {
                        return new kotlin.coroutines.c(dVar2, element4);
                    }
                    cVar = new kotlin.coroutines.c(dVar2, new kotlin.coroutines.c(element4, z7));
                }
                return cVar;
        }
    }
}
