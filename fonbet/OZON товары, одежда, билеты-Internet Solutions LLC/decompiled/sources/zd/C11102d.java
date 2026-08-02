package zd;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zd.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11102d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C11102d f108825a = new C11102d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        int i11 = C11104f.f108831e;
        Intrinsics.checkNotNullParameter(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
