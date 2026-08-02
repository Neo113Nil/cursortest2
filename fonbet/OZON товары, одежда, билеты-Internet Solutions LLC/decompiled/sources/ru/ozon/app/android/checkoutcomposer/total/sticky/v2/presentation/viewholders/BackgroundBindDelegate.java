package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import B3.D;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/BackgroundBindDelegate;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "edgedBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "dividedBackgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "colorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "updateBackgroundColor", "", "disableSeparator", "", "backgroundColor", "", "getEdgedBackgroundDrawable", "getDividedBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getColorDrawable", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BackgroundBindDelegate {
    private ColorDrawable colorDrawable;
    private LayerDrawable dividedBackgroundDrawable;
    private GradientDrawable edgedBackgroundDrawable;

    @NotNull
    private final View view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_1 = C6915b.c(ResourceExtKt.toPxF(1));
    private static final int DP_2 = (int) Math.ceil(ResourceExtKt.toPxF(2));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/BackgroundBindDelegate$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundBindDelegate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    private final ColorDrawable getColorDrawable() {
        ColorDrawable colorDrawable = this.colorDrawable;
        if (colorDrawable != null) {
            return colorDrawable;
        }
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorDrawable colorDrawable2 = new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.colorDrawable = colorDrawable2;
        return colorDrawable2;
    }

    private final Drawable getDividedBackgroundDrawable() {
        LayerDrawable layerDrawable = this.dividedBackgroundDrawable;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{getEdgedBackgroundDrawable()});
        int i11 = DP_2;
        layerDrawable2.setLayerInset(0, -i11, 0, -i11, -i11);
        this.dividedBackgroundDrawable = layerDrawable2;
        return layerDrawable2;
    }

    private final GradientDrawable getEdgedBackgroundDrawable() {
        GradientDrawable gradientDrawable = this.edgedBackgroundDrawable;
        if (gradientDrawable != null) {
            return gradientDrawable;
        }
        GradientDrawable b11 = D.b(0);
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        int i11 = DP_1;
        Context context2 = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b11.setStroke(i11, ThemeExtKt.themeColor(context2, R$attr.graphicNeutral));
        this.edgedBackgroundDrawable = b11;
        return b11;
    }

    public final void updateBackgroundColor(boolean disableSeparator, int backgroundColor) {
        Drawable drawable;
        if (disableSeparator) {
            ColorDrawable colorDrawable = getColorDrawable();
            colorDrawable.setColor(backgroundColor);
            drawable = colorDrawable;
        } else {
            getEdgedBackgroundDrawable().setColor(backgroundColor);
            drawable = getDividedBackgroundDrawable();
        }
        if (this.view.getBackground() != drawable) {
            this.view.setBackground(drawable);
        }
    }
}
