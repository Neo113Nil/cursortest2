package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealApplyFilterUpdateKey;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealClearFilterUpdateKey;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursMealStickyTopWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ToursMealStickyTopWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursMealStickyTopWidgetViewHolder$actionHandler$1(ToursMealStickyTopWidgetViewHolder toursMealStickyTopWidgetViewHolder) {
        super(1);
        this.this$0 = toursMealStickyTopWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r2 = r4.this$0.getComposerContainer();
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction.Click action) {
        InterfaceC7851b interfaceC7851b;
        InterfaceC7851b interfaceC7851b2;
        boolean isBottomSheet;
        View composerContainer;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (!Intrinsics.d(id2, "applyFilter")) {
            if (Intrinsics.d(id2, "clearFilter")) {
                interfaceC7851b = this.this$0.composerController;
                interfaceC7851b.update(ToursMealClearFilterUpdateKey.INSTANCE);
                return;
            }
            return;
        }
        interfaceC7851b2 = this.this$0.composerController;
        String link = action.getLink();
        isBottomSheet = this.this$0.isBottomSheet();
        Integer num = null;
        if (isBottomSheet && composerContainer != null) {
            num = Integer.valueOf(composerContainer.getHeight());
        }
        interfaceC7851b2.update(new ToursMealApplyFilterUpdateKey(link, num));
    }
}
