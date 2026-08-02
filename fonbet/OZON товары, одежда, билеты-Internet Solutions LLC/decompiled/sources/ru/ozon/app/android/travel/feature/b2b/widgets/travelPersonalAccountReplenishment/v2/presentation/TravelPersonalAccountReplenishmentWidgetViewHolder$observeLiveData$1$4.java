package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$4 extends AbstractC7737t implements Function1<AccountReplenishmentState, Unit> {
    final /* synthetic */ TravelPersonalAccountReplenishmentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$4(TravelPersonalAccountReplenishmentWidgetViewHolder travelPersonalAccountReplenishmentWidgetViewHolder) {
        super(1);
        this.this$0 = travelPersonalAccountReplenishmentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountReplenishmentState accountReplenishmentState) {
        invoke2(accountReplenishmentState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountReplenishmentState accountReplenishmentState) {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.references;
        composerReferences.getController().update(new AccountReplenishmentTagUpdateKey(accountReplenishmentState.getNewInput(), accountReplenishmentState.getPreviousSelectedTagPosition(), accountReplenishmentState.getCurrentSelectedTagPosition(), accountReplenishmentState.getCursorPosition()));
    }
}
