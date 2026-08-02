package td;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class j0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f99395a = new j0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9845k it = (InterfaceC9845k) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof InterfaceC9835a);
    }
}
