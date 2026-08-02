package nd;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nd.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8576z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8504A f77058a;

    public C8576z(AbstractC8504A abstractC8504A) {
        this.f77058a = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type[] lowerBounds;
        AbstractC8504A abstractC8504A = this.f77058a;
        Type type = null;
        if (abstractC8504A.isSuspend()) {
            Object Z11 = C7714v.Z(abstractC8504A.o().a());
            ParameterizedType parameterizedType = Z11 instanceof ParameterizedType ? (ParameterizedType) Z11 : null;
            if (Intrinsics.d(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.d.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                Object Y11 = C7705l.Y(actualTypeArguments);
                WildcardType wildcardType = Y11 instanceof WildcardType ? (WildcardType) Y11 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (Type) C7705l.C(lowerBounds);
                }
            }
        }
        return type == null ? abstractC8504A.o().getReturnType() : type;
    }
}
