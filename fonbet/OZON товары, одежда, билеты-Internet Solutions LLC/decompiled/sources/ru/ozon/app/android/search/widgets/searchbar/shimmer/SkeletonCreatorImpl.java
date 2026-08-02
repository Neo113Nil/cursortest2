package ru.ozon.app.android.search.widgets.searchbar.shimmer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J*\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreatorImpl;", "Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "skeletonColor", "", "generateSkeletonView", "Landroid/view/View;", "radius", "", "lp", "Landroid/view/ViewGroup$LayoutParams;", "view", "topRadius", "bottomRadius", "getSkeletonBg", "Landroid/graphics/drawable/GradientDrawable;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkeletonCreatorImpl implements SkeletonCreator {

    @NotNull
    private final Context context;
    private final int skeletonColor;

    public SkeletonCreatorImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.skeletonColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
    }

    private final GradientDrawable getSkeletonBg(float topRadius, float bottomRadius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.skeletonColor);
        gradientDrawable.setCornerRadii(new float[]{topRadius, topRadius, topRadius, topRadius, bottomRadius, bottomRadius, bottomRadius, bottomRadius});
        return gradientDrawable;
    }

    @Override // ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonCreator
    @NotNull
    public View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (view == null) {
            view = new View(this.context);
        }
        view.setBackground(getSkeletonBg(radius));
        view.setLayoutParams(lp);
        return view;
    }

    @NotNull
    public View generateSkeletonView(float topRadius, float bottomRadius, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (view == null) {
            view = new View(this.context);
        }
        view.setBackground(getSkeletonBg(topRadius, bottomRadius));
        view.setLayoutParams(lp);
        return view;
    }

    private final GradientDrawable getSkeletonBg(float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.skeletonColor);
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(radius));
        return gradientDrawable;
    }
}
