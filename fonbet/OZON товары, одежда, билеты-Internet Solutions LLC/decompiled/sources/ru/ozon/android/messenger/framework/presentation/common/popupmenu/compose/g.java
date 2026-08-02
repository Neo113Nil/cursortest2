package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f90838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(float f7) {
        super(1);
        this.f90838b = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        InterfaceC7825i0 graphicsLayer = interfaceC7825i0;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(this.f90838b);
        return Unit.f71690a;
    }
}
