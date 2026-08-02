package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button;

import Sc.o;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySeatSelectStickyButtonWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TravelRailwaySeatSelectWidgetViewModel.Action, Unit> {
    final /* synthetic */ TravelRailwaySeatSelectStickyButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySeatSelectStickyButtonWidgetViewHolder$observeAction$1(TravelRailwaySeatSelectStickyButtonWidgetViewHolder travelRailwaySeatSelectStickyButtonWidgetViewHolder) {
        super(1);
        this.this$0 = travelRailwaySeatSelectStickyButtonWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelRailwaySeatSelectWidgetViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelRailwaySeatSelectWidgetViewModel.Action action) {
        i iVar;
        J j11;
        InterfaceC7851b interfaceC7851b;
        if (action instanceof TravelRailwaySeatSelectWidgetViewModel.Action.Update) {
            interfaceC7851b = this.this$0.composerController;
            interfaceC7851b.update(((TravelRailwaySeatSelectWidgetViewModel.Action.Update) action).getUpdate());
        } else {
            if (!(action instanceof TravelRailwaySeatSelectWidgetViewModel.Action.Error)) {
                throw new o();
            }
            iVar = this.this$0.container;
            ViewGroup rootView = ContextExtKt.getRootView(iVar.K().b());
            if (rootView != null) {
                TravelRailwaySeatSelectStickyButtonWidgetViewHolder travelRailwaySeatSelectStickyButtonWidgetViewHolder = this.this$0;
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                j11 = travelRailwaySeatSelectStickyButtonWidgetViewHolder.viewOwner;
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, j11, 62, null).show();
            }
        }
    }
}
