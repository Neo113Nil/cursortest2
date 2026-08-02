package ru.ozon.app.android.initializers.lifecycle.orientation;

import NZ.d;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.product.R$dimen;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r*\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\n*\u00020\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\n*\u00020\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\n*\u00020\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\n*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010!\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/initializers/lifecycle/orientation/FragmentsAppearanceUpdater;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/m;", "fragment", "", "orientation", "", "changeFragmentAppearance", "(Landroidx/fragment/app/m;I)V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "findRecyclerView", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;", "findRootView", "(Landroid/view/View;)Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "getColor", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Integer;", "currentBackgroundColor", "changeBackgroundColor", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "changeBackgroundForPortrait", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "changeBackgroundForLandscape", "changePaddings", "Landroid/app/Activity;", "activity", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/app/Activity;Landroid/content/res/Configuration;)V", "onFragmentStarted", "bgColor", "I", "portraitHorizontalPadding", "landscapeHorizontalPadding", "", "isTablet", "Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FragmentsAppearanceUpdater {
    private final int bgColor;
    private final boolean isTablet;
    private final int landscapeHorizontalPadding;
    private final int portraitHorizontalPadding;

    public FragmentsAppearanceUpdater(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_primary);
        this.landscapeHorizontalPadding = context.getResources().getDimensionPixelSize(R$dimen.composer_list_tablet_padding);
        this.isTablet = context.getResources().getBoolean(R$bool.isTablet);
    }

    private final void changeBackgroundColor(RecyclerView recyclerView, int i11, int i12) {
        if (i12 == 1) {
            changeBackgroundForPortrait(recyclerView, i11);
        } else {
            if (i12 != 2) {
                return;
            }
            changeBackgroundForLandscape(recyclerView, i11);
        }
    }

    private final void changeBackgroundForLandscape(RecyclerView recyclerView, int i11) {
        LayerDrawable layerDrawable = new LayerDrawable(new ColorDrawable[]{new ColorDrawable(this.bgColor), new ColorDrawable(i11)});
        layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        int i12 = this.landscapeHorizontalPadding;
        layerDrawable.setLayerInset(1, i12, 0, i12, 0);
        recyclerView.setBackground(layerDrawable);
    }

    private final void changeBackgroundForPortrait(RecyclerView recyclerView, int i11) {
        recyclerView.setBackground(new ColorDrawable(i11));
    }

    private final void changeFragmentAppearance(ComponentCallbacksC5392m fragment, int orientation) {
        View view;
        RecyclerView findRecyclerView;
        boolean z11 = fragment instanceof ComposerFragment;
        boolean z12 = fragment.getParentFragment() instanceof BottomSheetComposerFragment;
        if (!z11 || z12 || (view = ((ComposerFragment) fragment).getView()) == null || (findRecyclerView = findRecyclerView(view)) == null) {
            return;
        }
        View findRootView = findRootView(view);
        Integer color = getColor(findRecyclerView.getBackground());
        if (color == null) {
            color = getColor(findRootView != null ? findRootView.getBackground() : null);
        }
        if (color != null) {
            changeBackgroundColor(findRecyclerView, color.intValue(), orientation);
            changePaddings(findRecyclerView, orientation);
        }
    }

    private final void changePaddings(RecyclerView recyclerView, int i11) {
        Integer valueOf = i11 != 1 ? i11 != 2 ? null : Integer.valueOf(this.landscapeHorizontalPadding) : Integer.valueOf(this.portraitHorizontalPadding);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ViewExtKt.updatePadding$default(recyclerView, intValue, 0, intValue, 0, 10, null);
        }
    }

    private final RecyclerView findRecyclerView(View view) {
        return (RecyclerView) view.findViewById(R$id.listRv);
    }

    private final View findRootView(View view) {
        return C10183a.f(view);
    }

    private final Integer getColor(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() == 2) {
                Drawable drawable2 = layerDrawable.getDrawable(1);
                ColorDrawable colorDrawable = drawable2 instanceof ColorDrawable ? (ColorDrawable) drawable2 : null;
                if (colorDrawable != null) {
                    return Integer.valueOf(colorDrawable.getColor());
                }
            }
        }
        return null;
    }

    public final void onConfigurationChanged(Activity activity, @NotNull Configuration newConfig) {
        G supportFragmentManager;
        ComponentCallbacksC5392m w02;
        ComponentCallbacksC5392m w03;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.isTablet) {
            r rVar = activity instanceof r ? (r) activity : null;
            if (rVar == null || (supportFragmentManager = rVar.getSupportFragmentManager()) == null || (w02 = supportFragmentManager.w0()) == null) {
                return;
            }
            if ((w02 instanceof d) && (w03 = ((d) w02).getChildFragmentManager().w0()) != null) {
                w02 = w03;
            }
            changeFragmentAppearance(w02, newConfig.orientation);
        }
    }

    public final void onFragmentStarted(@NotNull ComponentCallbacksC5392m fragment, int orientation) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.isTablet) {
            changeFragmentAppearance(fragment, orientation);
        }
    }
}
