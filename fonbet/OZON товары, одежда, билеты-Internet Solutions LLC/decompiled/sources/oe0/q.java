package oe0;

import ag.InterfaceC5020b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import oe0.p;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function1<InterfaceC5020b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p.c f78237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(p.c cVar) {
        super(1);
        this.f78237b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC5020b interfaceC5020b) {
        InterfaceC5020b safeCallLocationRequest = interfaceC5020b;
        Intrinsics.checkNotNullParameter(safeCallLocationRequest, "$this$safeCallLocationRequest");
        safeCallLocationRequest.a(this.f78237b);
        return Unit.f71690a;
    }
}
