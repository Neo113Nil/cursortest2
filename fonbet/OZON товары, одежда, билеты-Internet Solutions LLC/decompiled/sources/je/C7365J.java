package je;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.J, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7365J implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f69842a;

    public C7365J(Function1 function1) {
        this.f69842a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N n11 = (N) obj;
        Intrinsics.f(n11);
        return this.f69842a.invoke(n11).toString();
    }
}
