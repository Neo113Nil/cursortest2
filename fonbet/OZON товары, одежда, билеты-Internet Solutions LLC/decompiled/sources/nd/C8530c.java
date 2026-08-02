package nd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8530c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8530c f76955a = new C8530c();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        int i11 = C8540h.f76981e;
        Intrinsics.checkNotNullParameter(it, "it");
        return new X(it);
    }
}
