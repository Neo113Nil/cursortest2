package ru.ozon.app.android.ui.widgets.textWidget.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TextWidgetViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, TextWidgetVO, TextWidgetVO> {
    final /* synthetic */ TextWidgetViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextWidgetViewMapper$updateConsumer$1(TextWidgetViewMapper textWidgetViewMapper) {
        super(2);
        this.this$0 = textWidgetViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TextWidgetVO invoke(a.J.InterfaceC0007a update, TextWidgetVO oldVO) {
        TextWidgetVO updateStateVO;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if ((update instanceof ExpandableTextStateChangedUpdateKey ? (ExpandableTextStateChangedUpdateKey) update : null) == null) {
            return null;
        }
        updateStateVO = this.this$0.updateStateVO((ExpandableTextStateChangedUpdateKey) update, oldVO);
        return updateStateVO;
    }
}
