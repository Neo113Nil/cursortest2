package ce;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9835a;

/* loaded from: classes10.dex */
final class x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f57063a = new x();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9835a selectMostSpecificInEachOverridableGroup = (InterfaceC9835a) obj;
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
