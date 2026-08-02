package nd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class a1 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f76950a = new a1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = b1.f76953b;
        je.N type = ((td.p0) obj).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return b1.f(type);
    }
}
