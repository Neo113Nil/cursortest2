package ru.ozon.uni.android.uikit.view.atoms.price;

import android.content.Context;
import android.text.TextPaint;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/TextPaint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PriceView$caption$2 extends AbstractC7737t implements Function0<TextPaint> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PriceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceView$caption$2(PriceView priceView, Context context) {
        super(0);
        this.this$0 = priceView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextPaint invoke() {
        TextPaint baseTextPaint;
        baseTextPaint = this.this$0.getBaseTextPaint();
        Context context = this.$context;
        baseTextPaint.setTextSize(ResourceExtKt.toSpF(12));
        baseTextPaint.setLetterSpacing(0.02f);
        baseTextPaint.setTypeface(g.e(R$font.onest_regular, context));
        return baseTextPaint;
    }
}
