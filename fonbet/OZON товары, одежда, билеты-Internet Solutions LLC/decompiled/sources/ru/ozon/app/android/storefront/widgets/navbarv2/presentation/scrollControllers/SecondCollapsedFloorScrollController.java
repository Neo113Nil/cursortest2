package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.scrollControllers;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/scrollControllers/SecondCollapsedFloorScrollController;", "", "<init>", "()V", "Landroid/view/View;", "collapsedView", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "secondFloorConfig", "findRegularSecondFloorView", "(Landroid/view/View;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)Landroid/view/View;", "floorConfig", "", "onFloorConfigured", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "", "offset", "onOffsetChanged", "(I)V", "floor", "clear", "(Landroid/view/View;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecondCollapsedFloorScrollController {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    private final View findRegularSecondFloorView(View collapsedView, FloorConfigurator.FloorConfigurationParam secondFloorConfig) {
        if (secondFloorConfig == null) {
            return null;
        }
        ViewParent parent = collapsedView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getChildCount() > 1) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (!Intrinsics.d(childAt, collapsedView)) {
                    return childAt;
                }
            }
        }
        return secondFloorConfig.getFloorView();
    }

    public final void clear(View floor) {
        if (floor != null) {
            floor.setAlpha(1.0f);
        }
        this.floorConfig = null;
    }

    public void onFloorConfigured(@NotNull FloorConfigurator.FloorConfigurationParam floorConfig) {
        Intrinsics.checkNotNullParameter(floorConfig, "floorConfig");
        this.floorConfig = floorConfig;
    }

    public void onOffsetChanged(int offset) {
        View floorView;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam;
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam2 = this.floorConfig;
        if (floorConfigurationParam2 == null || (floorView = floorConfigurationParam2.getFloorView()) == null || (floorConfigurationParam = this.floorConfig) == null) {
            return;
        }
        int minTopMargin = floorConfigurationParam.getMinTopMargin();
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam3 = this.floorConfig;
        if (floorConfigurationParam3 != null) {
            int defaultTopMargin = floorConfigurationParam3.getDefaultTopMargin();
            FloorConfigurator.FloorConfigurationParam floorConfigurationParam4 = this.floorConfig;
            View findRegularSecondFloorView = findRegularSecondFloorView(floorView, floorConfigurationParam4 != null ? floorConfigurationParam4.getPrevFloorConfig() : null);
            float measuredHeight = floorView.getMeasuredHeight();
            if (measuredHeight <= 0.0f) {
                floorView.setAlpha(0.0f);
                if (findRegularSecondFloorView != null) {
                    findRegularSecondFloorView.setAlpha(1.0f);
                    return;
                }
                return;
            }
            float f7 = (defaultTopMargin + offset) - minTopMargin;
            float d11 = 1.0f - h.d(f7 / measuredHeight, 0.0f, 1.0f);
            floorView.setAlpha(d11);
            if (findRegularSecondFloorView != null) {
                findRegularSecondFloorView.setAlpha(h.d(1.0f - d11, 0.0f, 1.0f));
            }
            floorView.setTranslationY((-measuredHeight) * (h.d(f7, 0.0f, measuredHeight) / measuredHeight));
        }
    }
}
