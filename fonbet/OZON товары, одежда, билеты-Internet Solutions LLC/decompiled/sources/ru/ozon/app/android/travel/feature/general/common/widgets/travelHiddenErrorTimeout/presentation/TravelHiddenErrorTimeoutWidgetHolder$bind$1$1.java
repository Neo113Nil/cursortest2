package ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.presentation;

import GZ.g;
import LZ.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelHiddenErrorTimeoutWidgetHolder$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TravelHiddenErrorTimeoutVO $this_with;
    final /* synthetic */ TravelHiddenErrorTimeoutWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelHiddenErrorTimeoutWidgetHolder$bind$1$1(TravelHiddenErrorTimeoutWidgetHolder travelHiddenErrorTimeoutWidgetHolder, TravelHiddenErrorTimeoutVO travelHiddenErrorTimeoutVO) {
        super(0);
        this.this$0 = travelHiddenErrorTimeoutWidgetHolder;
        this.$this_with = travelHiddenErrorTimeoutVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        b provideDialogRequest;
        InterfaceC7851b interfaceC7851b;
        gVar = this.this$0.ozonRouter;
        provideDialogRequest = this.this$0.provideDialogRequest(this.$this_with);
        gVar.c(provideDialogRequest, null);
        interfaceC7851b = this.this$0.composerController;
        interfaceC7851b.m(this.$this_with.getId());
    }
}
