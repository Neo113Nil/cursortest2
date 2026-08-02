package zd;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
final /* synthetic */ class t extends C7734p implements Function1<Method, C11096D> {

    /* renamed from: a, reason: collision with root package name */
    public static final t f108846a = new t(1);

    @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final kotlin.reflect.g getOwner() {
        return N.b(C11096D.class);
    }

    @Override // kotlin.jvm.internal.AbstractC7724f
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11096D invoke(Method method) {
        Method p02 = method;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return new C11096D(p02);
    }
}
