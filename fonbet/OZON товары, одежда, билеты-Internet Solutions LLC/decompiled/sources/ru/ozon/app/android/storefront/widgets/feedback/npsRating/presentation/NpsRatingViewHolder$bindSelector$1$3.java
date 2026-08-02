package ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.databinding.WidgetNpsRatingBinding;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingSelectorUpdate;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NpsRatingViewHolder$bindSelector$1$3 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ NpsRatingVO.Selector $selectorVO;
    final /* synthetic */ WidgetNpsRatingBinding $this_with;
    final /* synthetic */ NpsRatingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NpsRatingViewHolder$bindSelector$1$3(NpsRatingVO.Selector selector, NpsRatingViewHolder npsRatingViewHolder, WidgetNpsRatingBinding widgetNpsRatingBinding) {
        super(1);
        this.$selectorVO = selector;
        this.this$0 = npsRatingViewHolder;
        this.$this_with = widgetNpsRatingBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ComposerReferences composerReferences;
        if (i11 < this.$selectorVO.getImagesUrl().size()) {
            this.this$0.loadImage(this.$selectorVO.getImagesUrl().get(i11), this.$selectorVO.getImagesUrl());
        }
        this.$this_with.buttonNext.setEnabled(true);
        composerReferences = this.this$0.ref;
        composerReferences.getController().d(new NpsRatingSelectorUpdate(i11));
    }
}
