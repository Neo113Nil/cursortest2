package ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.PdpDescriptionAccordionUpdateKey;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DescriptionAccordionViewHolder$setupClickableArea$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ DescriptionAccordionViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DescriptionAccordionViewHolder$setupClickableArea$1$1(DescriptionAccordionViewHolder descriptionAccordionViewHolder) {
        super(1);
        this.this$0 = descriptionAccordionViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        ComposerReferences composerReferences;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        DescriptionAccordionVO descriptionAccordionVO = (DescriptionAccordionVO) this.this$0.getBoundData();
        if (descriptionAccordionVO != null) {
            DescriptionAccordionViewHolder descriptionAccordionViewHolder = this.this$0;
            if (descriptionAccordionVO.getIcon().getIsShowIcon()) {
                composerReferences = descriptionAccordionViewHolder.refs;
                composerReferences.getController().update(new PdpDescriptionAccordionUpdateKey(!descriptionAccordionVO.getIcon().getIsDisclosureOpen(), descriptionAccordionVO.getId()));
                lVar = descriptionAccordionViewHolder.tokenizedAnalytics;
                TokenizedAnalyticsExtKt.processClickEvents(lVar, descriptionAccordionVO.getTokenizedEvent());
            }
        }
    }
}
