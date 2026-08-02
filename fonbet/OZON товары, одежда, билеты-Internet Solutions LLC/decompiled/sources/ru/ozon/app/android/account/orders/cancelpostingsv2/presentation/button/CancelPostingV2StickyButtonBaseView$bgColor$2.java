package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CancelPostingV2StickyButtonBaseView$bgColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CancelPostingV2StickyButtonBaseView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelPostingV2StickyButtonBaseView$bgColor$2(Context context, CancelPostingV2StickyButtonBaseView cancelPostingV2StickyButtonBaseView) {
        super(0);
        this.$context = context;
        this.this$0 = cancelPostingV2StickyButtonBaseView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(StyleParser.INSTANCE.parseColor(this.$context, this.this$0.getBgColorUniColors().getToken(), this.this$0.getBgColorUniColors().getResId()));
    }
}
