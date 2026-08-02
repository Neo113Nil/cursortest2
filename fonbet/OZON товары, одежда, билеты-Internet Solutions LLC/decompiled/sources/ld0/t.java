package ld0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class t extends AbstractC7737t implements Function1<Ic0.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f73234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Jb0.i f73235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(x xVar, Jb0.i iVar) {
        super(1);
        this.f73234b = xVar;
        this.f73235c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Ic0.b bVar) {
        Ic0.b it = bVar;
        Intrinsics.checkNotNullParameter(it, "it");
        x.I(this.f73234b, this.f73235c);
        return Unit.f71690a;
    }
}
