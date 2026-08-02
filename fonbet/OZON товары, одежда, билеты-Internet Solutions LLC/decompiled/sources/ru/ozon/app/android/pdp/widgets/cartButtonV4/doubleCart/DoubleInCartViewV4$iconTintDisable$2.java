package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import android.content.Context;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleInCartViewV4$iconTintDisable$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DoubleInCartViewV4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleInCartViewV4$iconTintDisable$2(DoubleInCartViewV4 doubleInCartViewV4, Context context) {
        super(0);
        this.this$0 = doubleInCartViewV4;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(g.b(this.this$0.getResources(), R$color.graphic_neutral_on_light, this.$context.getTheme()));
    }
}
