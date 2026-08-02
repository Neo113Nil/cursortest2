package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonViewMapper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TranslateButtonVH$bind$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ TranslateButtonVO $this_with;
    final /* synthetic */ TranslateButtonVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateButtonVH$bind$1$1(TranslateButtonVO translateButtonVO, TranslateButtonVH translateButtonVH) {
        super(1);
        this.$this_with = translateButtonVO;
        this.this$0 = translateButtonVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean d11 = Intrinsics.d(this.$this_with.getBindButton(), this.$this_with.getInitialButton());
        boolean z11 = (d11 && this.$this_with.getFinalAtoms() != null) || !d11;
        if (!(action instanceof AtomAction.Click) || !z11) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
            return;
        }
        composerReferences = this.this$0.refs;
        InterfaceC7851b controller = composerReferences.getController();
        long reviewId = this.$this_with.getReviewId();
        TranslateButtonVO translateButtonVO = this.$this_with;
        List<SingleReviewDTO.BodySectionDTO> finalAtoms = d11 ? translateButtonVO.getFinalAtoms() : translateButtonVO.getInitialAtoms();
        if (finalAtoms == null) {
            return;
        }
        controller.update(new TranslateButtonViewMapper.TranslatedUpdateKey(reviewId, finalAtoms, d11));
    }
}
