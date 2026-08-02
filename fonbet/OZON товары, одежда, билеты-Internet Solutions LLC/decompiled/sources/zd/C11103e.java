package zd;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11103e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C11103e f108826a = new C11103e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        int i11 = C11104f.f108831e;
        Intrinsics.checkNotNullParameter(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return C7705l.g(actualTypeArguments);
    }
}
