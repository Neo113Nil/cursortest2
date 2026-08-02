package nd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.C7925f;

/* renamed from: nd.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8534e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8534e f76962a = new C8534e();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        int i11 = C8540h.f76981e;
        Intrinsics.checkNotNullParameter(it, "it");
        X b11 = C8540h.b(it);
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        return C7925f.a(b11, k11, false, k11);
    }
}
