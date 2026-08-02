package ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate;

import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.FavoriteReserveButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteReserveButtonDelegateImpl$createActionHandler$4 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ AnalyticData $analyticData;
    final /* synthetic */ FavoriteReserveButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonDelegateImpl$createActionHandler$4(FavoriteReserveButtonDelegateImpl favoriteReserveButtonDelegateImpl, AnalyticData analyticData) {
        super(1);
        this.this$0 = favoriteReserveButtonDelegateImpl;
        this.$analyticData = analyticData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        boolean z11;
        FavoriteReserveButtonViewModel favoriteReserveButtonViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        z11 = this.this$0.processingAction;
        if (z11) {
            return;
        }
        favoriteReserveButtonViewModel = this.this$0.viewModel;
        c trackingData = this.$analyticData.getTrackingData();
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        favoriteReserveButtonViewModel.onReserveClick(it, trackingData);
    }
}
