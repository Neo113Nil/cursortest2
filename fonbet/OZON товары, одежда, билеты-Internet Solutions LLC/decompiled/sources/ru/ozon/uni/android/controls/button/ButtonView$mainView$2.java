package ru.ozon.uni.android.controls.button;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ButtonView$mainView$2 extends AbstractC7737t implements Function0<TitleSubtitleCellView> {
    final /* synthetic */ AttributeSet $attrs;
    final /* synthetic */ Context $context;
    final /* synthetic */ ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonView$mainView$2(Context context, AttributeSet attributeSet, ButtonView buttonView) {
        super(0);
        this.$context = context;
        this.$attrs = attributeSet;
        this.this$0 = buttonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TitleSubtitleCellView invoke() {
        TitleSubtitleCellView titleSubtitleCellView = new TitleSubtitleCellView(this.$context, this.$attrs, 0, 0, this.this$0.getPreset().getMainViewPreset(), false, 44, null);
        titleSubtitleCellView.setTitleNumberOfLines(1);
        titleSubtitleCellView.setSubtitleNumberOfLines(1);
        return titleSubtitleCellView;
    }
}
