package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerActionsPreviewVO$WithCorners$cornerRadius$2 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ boolean $isSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionsPreviewVO$WithCorners$cornerRadius$2(boolean z11) {
        super(0);
        this.$isSelect = z11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$isSelect ? SellerActionsPreviewVO.WithCorners.dp20 : SellerActionsPreviewVO.WithCorners.dp16);
    }
}
