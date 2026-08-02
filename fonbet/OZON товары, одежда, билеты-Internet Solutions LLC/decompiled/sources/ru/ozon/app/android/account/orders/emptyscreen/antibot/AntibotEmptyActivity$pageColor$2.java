package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AntibotEmptyActivity$pageColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ AntibotEmptyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AntibotEmptyActivity$pageColor$2(AntibotEmptyActivity antibotEmptyActivity) {
        super(0);
        this.this$0 = antibotEmptyActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        boolean isSelect;
        isSelect = this.this$0.isSelect();
        UniColors uniColors = isSelect ? UniColors.LAYER_FLOOR_1 : UniColors.LAYER_FLOOR_0;
        return Integer.valueOf(StyleParser.INSTANCE.parseColor(this.this$0, uniColors.getToken(), uniColors.getResId()));
    }
}
