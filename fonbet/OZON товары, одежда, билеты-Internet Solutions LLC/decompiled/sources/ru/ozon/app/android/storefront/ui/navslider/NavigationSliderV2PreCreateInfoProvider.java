package ru.ozon.app.android.storefront.ui.navslider;

import android.content.Context;
import gk0.n;
import gk0.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/ui/navslider/NavigationSliderV2PreCreateInfoProvider;", "", "<init>", "()V", "Landroid/content/Context;", "activity", "", "shouldOptimization", "", "Lgk0/n;", "getPreCreateInfoList", "(Landroid/content/Context;Z)Ljava/util/List;", "navslider_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV2PreCreateInfoProvider {

    @NotNull
    public static final NavigationSliderV2PreCreateInfoProvider INSTANCE = new NavigationSliderV2PreCreateInfoProvider();

    private NavigationSliderV2PreCreateInfoProvider() {
    }

    @NotNull
    public final List<n> getPreCreateInfoList(@NotNull Context activity, boolean shouldOptimization) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C7714v.b0(new o(R$layout.widget_navigation_slider_v2_layout, 1, activity), shouldOptimization ? new o(R$layout.item_navigation_block_element_v2_optimized, 6, activity) : new o(R$layout.item_navigation_block_element_v2, 6, activity));
    }
}
