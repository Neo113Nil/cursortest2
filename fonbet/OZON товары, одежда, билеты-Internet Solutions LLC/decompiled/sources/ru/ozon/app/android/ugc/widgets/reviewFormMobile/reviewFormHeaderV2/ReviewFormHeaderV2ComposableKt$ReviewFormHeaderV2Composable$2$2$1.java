package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<ViewIntent.OnBackPressed, Unit> $onBackPressed;
    final /* synthetic */ ReviewFormHeaderV2VO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$2$1(Function1<? super ViewIntent.OnBackPressed, Unit> function1, ReviewFormHeaderV2VO reviewFormHeaderV2VO, Function1<? super AtomAction, Unit> function12) {
        super(1);
        this.$onBackPressed = function1;
        this.$state = reviewFormHeaderV2VO;
        this.$onAction = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click) && !(action instanceof AtomAction.Dismiss)) {
            this.$onAction.invoke(action);
            return;
        }
        Function1<ViewIntent.OnBackPressed, Unit> function1 = this.$onBackPressed;
        ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig = this.$state.getSubmitOnBackConfig();
        function1.invoke(new ViewIntent.OnBackPressed(action, submitOnBackConfig != null ? Integer.valueOf(submitOnBackConfig.getMinRating()) : null, this.$state.getSubmitOnBackConfig()));
    }
}
