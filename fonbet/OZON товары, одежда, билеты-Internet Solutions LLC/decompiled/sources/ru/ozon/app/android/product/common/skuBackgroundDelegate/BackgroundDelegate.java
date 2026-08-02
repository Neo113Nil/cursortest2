package ru.ozon.app.android.product.common.skuBackgroundDelegate;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/product/common/skuBackgroundDelegate/BackgroundDelegate;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "", "gradientColors", "", "bindBackground", "(Ljava/util/List;)V", "Landroid/view/View;", "", "skuDefaultBgColor", "I", "", "defaultColorsArr", "[I", "minArraySizeToParse", "Landroid/graphics/drawable/GradientDrawable;", "background", "Landroid/graphics/drawable/GradientDrawable;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BackgroundDelegate {

    @NotNull
    private final GradientDrawable background;

    @NotNull
    private final int[] defaultColorsArr;
    private final int minArraySizeToParse;
    private final int skuDefaultBgColor;

    @NotNull
    private final View view;

    public BackgroundDelegate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.skuDefaultBgColor = themeColor;
        this.defaultColorsArr = new int[]{themeColor, themeColor};
        this.minArraySizeToParse = 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        this.background = gradientDrawable;
        view.setBackground(gradientDrawable);
    }

    public void bindBackground(@NotNull List<String> gradientColors) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        if (gradientColors.size() < this.minArraySizeToParse) {
            this.background.setColors(this.defaultColorsArr);
            return;
        }
        List<String> list = gradientColors;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (String str : list) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(Integer.valueOf(styleParser.parseColorInt(context, str, this.skuDefaultBgColor)));
        }
        this.background.setColors(C7714v.T0(arrayList));
    }
}
