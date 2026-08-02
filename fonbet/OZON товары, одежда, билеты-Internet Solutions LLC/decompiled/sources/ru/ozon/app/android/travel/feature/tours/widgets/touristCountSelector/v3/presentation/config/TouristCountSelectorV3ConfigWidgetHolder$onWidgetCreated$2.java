package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import l10.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ TouristCountSelectorV3ConfigWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$2(TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder) {
        super(1);
        this.this$0 = touristCountSelectorV3ConfigWidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        boolean z11;
        InterfaceC7851b interfaceC7851b;
        i iVar;
        if (aVar instanceof a.C2372m) {
            z11 = this.this$0.shouldScrollToBottom;
            if (z11) {
                interfaceC7851b = this.this$0.composerController;
                iVar = this.this$0.container;
                interfaceC7851b.l(iVar.I().getShimmersCount() - 1);
                this.this$0.shouldScrollToBottom = false;
            }
        }
    }
}
