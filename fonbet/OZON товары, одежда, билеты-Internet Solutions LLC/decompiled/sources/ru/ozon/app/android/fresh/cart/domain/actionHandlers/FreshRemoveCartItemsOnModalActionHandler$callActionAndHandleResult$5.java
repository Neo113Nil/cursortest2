package ru.ozon.app.android.fresh.cart.domain.actionHandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$5 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshRemoveCartItemsOnModalActionHandler$callActionAndHandleResult$5(InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$controller.hideLoader();
    }
}
