package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/LayerDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV4ImageListViewHolder$fgImageDrawable$1 extends AbstractC7737t implements Function0<LayerDrawable> {
    final /* synthetic */ AspectsV4ImageListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4ImageListViewHolder$fgImageDrawable$1(AspectsV4ImageListViewHolder aspectsV4ImageListViewHolder) {
        super(0);
        this.this$0 = aspectsV4ImageListViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LayerDrawable invoke() {
        AspectsV4ImageConst aspectsV4ImageConst;
        AspectsV4ImageConst aspectsV4ImageConst2;
        AspectsV4ImageConst aspectsV4ImageConst3;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        AspectsV4ImageListViewHolder aspectsV4ImageListViewHolder = this.this$0;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            aspectsV4ImageConst3 = aspectsV4ImageListViewHolder.imageSizes;
            fArr[i11] = aspectsV4ImageConst3.getImageRadius();
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(a.getColor(aspectsV4ImageListViewHolder.getContext(), UniColors.LAYER_FLOOR_2.getResId()));
        Paint paint = shapeDrawable.getPaint();
        aspectsV4ImageConst = aspectsV4ImageListViewHolder.imageSizes;
        paint.setStrokeWidth(aspectsV4ImageConst.getStrokeBorderWidth());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        GradientDrawable gradientDrawable = new GradientDrawable();
        AspectsV4ImageListViewHolder aspectsV4ImageListViewHolder2 = this.this$0;
        aspectsV4ImageConst2 = aspectsV4ImageListViewHolder2.imageSizes;
        gradientDrawable.setCornerRadius(aspectsV4ImageConst2.getImageRadius());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = aspectsV4ImageListViewHolder2.getContext();
        AspectsV4ImageVO boundData = aspectsV4ImageListViewHolder2.getBoundData();
        gradientDrawable.setStroke(Dimens.INSTANCE.getDP_2(), styleParser.parseColor(context, boundData != null ? boundData.getSelectedColor() : null, UniColors.GRAPHIC_ACTION_PRIMARY.getResId()));
        return new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable});
    }
}
