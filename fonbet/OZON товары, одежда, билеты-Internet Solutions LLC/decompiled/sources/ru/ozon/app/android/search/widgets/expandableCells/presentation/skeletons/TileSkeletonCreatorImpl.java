package ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileSkeletonCreatorImpl;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileSkeletonCreator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "skeletonColor", "", "generateSkeletonView", "Landroid/view/View;", "corners", "", "lp", "Landroid/view/ViewGroup$LayoutParams;", "view", "getSkeletonBg", "Landroid/graphics/drawable/GradientDrawable;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileSkeletonCreatorImpl implements TileSkeletonCreator {

    @NotNull
    private final Context context;
    private final int skeletonColor;

    public TileSkeletonCreatorImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.skeletonColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
    }

    private final GradientDrawable getSkeletonBg(float[] corners) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.skeletonColor);
        gradientDrawable.setCornerRadii(corners);
        return gradientDrawable;
    }

    @NotNull
    public View generateSkeletonView(@NotNull float[] corners, @NotNull ViewGroup.LayoutParams lp, View view) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (view == null) {
            view = new View(this.context);
        }
        view.setBackground(getSkeletonBg(corners));
        view.setLayoutParams(lp);
        return view;
    }
}
