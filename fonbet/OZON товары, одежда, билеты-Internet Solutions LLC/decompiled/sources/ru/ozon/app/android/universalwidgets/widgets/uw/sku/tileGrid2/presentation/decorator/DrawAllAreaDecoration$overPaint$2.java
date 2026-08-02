package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator;

import android.content.Context;
import android.graphics.Paint;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DrawAllAreaDecoration$overPaint$2 extends AbstractC7737t implements Function0<Paint> {
    final /* synthetic */ DrawAllAreaDecoration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawAllAreaDecoration$overPaint$2(DrawAllAreaDecoration drawAllAreaDecoration) {
        super(0);
        this.this$0 = drawAllAreaDecoration;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Paint invoke() {
        Context context;
        Paint paint = new Paint();
        context = this.this$0.context;
        paint.setColor(a.getColor(context, R$color.layer_floor_1));
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }
}
