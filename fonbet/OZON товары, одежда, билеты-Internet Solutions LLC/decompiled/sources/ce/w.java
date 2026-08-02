package ce;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9831W;

/* loaded from: classes10.dex */
final class w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f57062a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9831W selectMostSpecificInEachOverridableGroup = (InterfaceC9831W) obj;
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
