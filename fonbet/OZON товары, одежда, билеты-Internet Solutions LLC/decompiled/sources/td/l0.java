package td;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class l0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f99397a = new l0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9845k it = (InterfaceC9845k) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        List<i0> typeParameters = ((InterfaceC9835a) it).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return C7714v.w(typeParameters);
    }
}
