package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.databinding.WidgetNewQuestionFormBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NewQuestionFormViewImpl$1$2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ WidgetNewQuestionFormBinding $this_with;
    final /* synthetic */ NewQuestionFormViewImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewQuestionFormViewImpl$1$2(NewQuestionFormViewImpl newQuestionFormViewImpl, WidgetNewQuestionFormBinding widgetNewQuestionFormBinding) {
        super(1);
        this.this$0 = newQuestionFormViewImpl;
        this.$this_with = widgetNewQuestionFormBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        NewQuestionFormVO newQuestionFormVO;
        NewQuestionFormVO newQuestionFormVO2;
        NewQuestionFormVO newQuestionFormVO3;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.ComposerAction) {
            newQuestionFormVO = this.this$0.vo;
            if (newQuestionFormVO == null) {
                Intrinsics.n("vo");
                throw null;
            }
            Map<String, TokenizedTrackingInfo> trackingInfo = newQuestionFormVO.getSendButton().getTrackingInfo();
            if (trackingInfo != null) {
                newQuestionFormVO3 = this.this$0.vo;
                if (newQuestionFormVO3 == null) {
                    Intrinsics.n("vo");
                    throw null;
                }
                t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(newQuestionFormVO3.getId()), null, 2, null);
                if (mapToTokenizedEvent$default != null) {
                    lVar = this.this$0.tokenizedAnalytics;
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
                }
            }
            Function2<String, Boolean, Unit> onSubmit = this.this$0.getOnSubmit();
            if (onSubmit != null) {
                String valueOf = String.valueOf(this.$this_with.inputEt.getText());
                newQuestionFormVO2 = this.this$0.vo;
                if (newQuestionFormVO2 == null) {
                    Intrinsics.n("vo");
                    throw null;
                }
                CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell = newQuestionFormVO2.getAnonymousCell();
                onSubmit.invoke(valueOf, anonymousCell != null ? Boolean.valueOf(anonymousCell.isSelected()) : null);
            }
        }
    }
}
