package ru.ozon.uni.android.cell;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CellView$RightBlock$subviewsMetadata$6 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CellView.RightBlock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellView$RightBlock$subviewsMetadata$6(Context context, CellView.RightBlock rightBlock) {
        super(0);
        this.$context = context;
        this.this$0 = rightBlock;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        int i11;
        CheckBoxView checkBoxView = new CheckBoxView(this.$context, null, 0, 6, null);
        CellView.RightBlock rightBlock = this.this$0;
        i11 = rightBlock.checkBoxViewId;
        checkBoxView.setId(i11);
        checkBoxView.setClickable(false);
        rightBlock.set_checkBoxView$uni_release(checkBoxView);
        return checkBoxView;
    }
}
