package dj0;

import A0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;

/* renamed from: dj0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6211c extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f61653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6211c(g gVar) {
        super(1);
        this.f61653b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 graphicsLayer = interfaceC7825i0;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(graphicsLayer.getAlpha());
        graphicsLayer.setShape(this.f61653b);
        graphicsLayer.x(true);
        return Unit.f71690a;
    }
}
