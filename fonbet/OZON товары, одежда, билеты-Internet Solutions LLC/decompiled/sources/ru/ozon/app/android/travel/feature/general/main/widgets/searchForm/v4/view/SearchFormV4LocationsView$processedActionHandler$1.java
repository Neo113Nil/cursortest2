package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.app.android.travel.utils.animator.LinearFloatAnimator;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SearchFormV4LocationsView$processedActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ SearchFormV4LocationsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4LocationsView$processedActionHandler$1(SearchFormV4LocationsView searchFormV4LocationsView) {
        super(1);
        this.this$0 = searchFormV4LocationsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        LinearFloatAnimator linearFloatAnimator;
        Function1 function1;
        TextAtomV2View textAtomV2View;
        SearchFormV4VO.Content.Locations locations;
        SearchFormV4VO.Content.TextField destination;
        Intrinsics.checkNotNullParameter(action, "action");
        linearFloatAnimator = this.this$0.destinationAnimator;
        if (linearFloatAnimator != null && !(action instanceof AtomAction.ViewAction)) {
            this.this$0.stopTypingTextAnimation();
            textAtomV2View = this.this$0.destinationTextView;
            locations = this.this$0.item;
            TextHolderKt.bindOrGone$default(textAtomV2View, (locations == null || (destination = locations.getDestination()) == null) ? null : destination.getText(), null, 2, null);
        }
        function1 = this.this$0.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }
}
