package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import android.content.Context;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/TextPaint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddToCartButtonView$actionButtonTextPaint$2 extends AbstractC7737t implements Function0<TextPaint> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonView$actionButtonTextPaint$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextPaint invoke() {
        TextPaint textPaint = new TextPaint(1);
        TextPaintExtKt.applyStyle(textPaint, this.$context, R$style.OzonTextAppearance_BodyControl_400small);
        return textPaint;
    }
}
