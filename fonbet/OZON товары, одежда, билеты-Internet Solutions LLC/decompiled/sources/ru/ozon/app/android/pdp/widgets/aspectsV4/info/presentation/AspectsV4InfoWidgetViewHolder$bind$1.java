package ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.d;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV4InfoWidgetViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ d $info;
    final /* synthetic */ AspectsV4InfoVO $item;
    final /* synthetic */ AspectsV4InfoWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4InfoWidgetViewHolder$bind$1(AspectsV4InfoWidgetViewHolder aspectsV4InfoWidgetViewHolder, d dVar, AspectsV4InfoVO aspectsV4InfoVO) {
        super(0);
        this.this$0 = aspectsV4InfoWidgetViewHolder;
        this.$info = dVar;
        this.$item = aspectsV4InfoVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AspectsV4InfoView aspectsV4InfoView;
        ComposerReferences composerReferences;
        t moreClickAnalytics;
        l lVar;
        Integer numberOfLines;
        aspectsV4InfoView = this.this$0.view;
        ExpandableTextAtomView textView = aspectsV4InfoView.getTextView();
        AspectsV4InfoWidgetViewHolder aspectsV4InfoWidgetViewHolder = this.this$0;
        d dVar = this.$info;
        AspectsV4InfoVO aspectsV4InfoVO = this.$item;
        aspectsV4InfoWidgetViewHolder.afterUpdateStateId = dVar.d();
        composerReferences = aspectsV4InfoWidgetViewHolder.refs;
        composerReferences.getController().update(new AspectsV4InfoUpdate(textView.getIsExpanded(), dVar.d()));
        if (textView.getIsExpanded()) {
            int lineCount = textView.getLineCount();
            ExpandableTextDTO expandableText = aspectsV4InfoVO.getExpandableText();
            if (lineCount <= ((expandableText == null || (numberOfLines = expandableText.getNumberOfLines()) == null) ? 1 : numberOfLines.intValue()) || (moreClickAnalytics = aspectsV4InfoVO.getMoreClickAnalytics()) == null) {
                return;
            }
            lVar = aspectsV4InfoWidgetViewHolder.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, moreClickAnalytics, null, 2, null);
        }
    }
}
