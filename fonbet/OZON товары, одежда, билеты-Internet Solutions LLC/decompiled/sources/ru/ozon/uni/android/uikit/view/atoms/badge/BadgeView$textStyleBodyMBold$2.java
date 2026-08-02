package ru.ozon.uni.android.uikit.view.atoms.badge;

import android.content.Context;
import android.text.TextPaint;
import androidx.core.content.a;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/TextPaint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class BadgeView$textStyleBodyMBold$2 extends AbstractC7737t implements Function0<TextPaint> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BadgeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeView$textStyleBodyMBold$2(BadgeView badgeView, Context context) {
        super(0);
        this.this$0 = badgeView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextPaint invoke() {
        TextPaint baseTextPaint;
        baseTextPaint = this.this$0.getBaseTextPaint();
        Context context = this.$context;
        baseTextPaint.setTextSize(ResourceExtKt.toSpF(14));
        baseTextPaint.setLetterSpacing(0.014f);
        baseTextPaint.setColor(a.getColor(context, R$color.selector_oz_black_text));
        baseTextPaint.setTypeface(g.e(R$font.onest_semibold, context));
        return baseTextPaint;
    }
}
