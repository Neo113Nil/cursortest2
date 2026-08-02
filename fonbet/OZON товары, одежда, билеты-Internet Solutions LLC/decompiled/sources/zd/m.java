package zd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f108839a = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return Boolean.valueOf(simpleName.length() == 0);
    }
}
