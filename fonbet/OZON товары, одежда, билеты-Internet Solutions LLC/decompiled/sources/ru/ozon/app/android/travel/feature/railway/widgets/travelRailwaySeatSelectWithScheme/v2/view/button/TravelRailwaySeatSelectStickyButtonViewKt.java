package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"travelRailwaySeatSelectStickyButtonView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "context", "Landroid/content/Context;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectStickyButtonViewKt {
    @NotNull
    public static final SingleAtom travelRailwaySeatSelectStickyButtonView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(20, context);
        int px = ResourceExtKt.toPx(-2, context);
        int px2 = ResourceExtKt.toPx(1, context);
        int color = context.getColor(UniColors.GRAPHIC_STROKE_STICKY.getResId());
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setStroke(px2, color);
        gradientDrawable.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f});
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, px, 0, px, px);
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setBackground(insetDrawable);
        singleAtom.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int px3 = ResourceExtKt.toPx(8, context);
        singleAtom.setPadding(px3, px3, px3, px3);
        return singleAtom;
    }
}
