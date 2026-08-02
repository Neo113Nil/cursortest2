package oe0;

import ag.InterfaceC5020b;
import ag.e;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class x extends AbstractC7737t implements Function1<InterfaceC5020b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f78254b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f78255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(o oVar, y yVar) {
        super(1);
        this.f78254b = oVar;
        this.f78255c = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC5020b interfaceC5020b) {
        InterfaceC5020b interfaceC5020b2;
        InterfaceC5020b safeCallLocationRequest = interfaceC5020b;
        Intrinsics.checkNotNullParameter(safeCallLocationRequest, "$this$safeCallLocationRequest");
        interfaceC5020b2 = this.f78254b.f78224d;
        ((ag.d) interfaceC5020b2).b(new e.a(1L).d(), this.f78255c, Looper.getMainLooper());
        return Unit.f71690a;
    }
}
