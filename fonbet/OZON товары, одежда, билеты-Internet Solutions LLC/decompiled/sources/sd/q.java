package sd;

import Gd.C3085o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
final class q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3085o f98605a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9839e f98606b;

    public q(C3085o c3085o, InterfaceC9839e interfaceC9839e) {
        this.f98605a = c3085o;
        this.f98606b = interfaceC9839e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Dd.k EMPTY = Dd.k.f6583a;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return this.f98605a.K0(this.f98606b);
    }
}
