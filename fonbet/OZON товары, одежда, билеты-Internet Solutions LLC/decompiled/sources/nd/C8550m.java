package nd;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zd.C11104f;

/* renamed from: nd.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8550m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8550m f77000a = new C8550m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class<?> returnType = ((Method) obj).getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return C11104f.b(returnType);
    }
}
