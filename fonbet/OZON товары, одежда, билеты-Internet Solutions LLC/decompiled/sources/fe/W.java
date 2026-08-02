package fe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class W implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final W f63189a = new W();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Nd.p it = (Nd.p) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.Q());
    }
}
