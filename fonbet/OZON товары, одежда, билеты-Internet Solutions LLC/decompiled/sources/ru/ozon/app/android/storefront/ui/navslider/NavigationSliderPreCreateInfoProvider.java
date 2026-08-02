package ru.ozon.app.android.storefront.ui.navslider;

import android.content.Context;
import gk0.n;
import gk0.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/ui/navslider/NavigationSliderPreCreateInfoProvider;", "", "<init>", "()V", "Landroid/content/Context;", "activity", "", "Lgk0/n;", "getPreCreateInfoList", "(Landroid/content/Context;)Ljava/util/List;", "navslider_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderPreCreateInfoProvider {

    @NotNull
    public static final NavigationSliderPreCreateInfoProvider INSTANCE = new NavigationSliderPreCreateInfoProvider();

    private NavigationSliderPreCreateInfoProvider() {
    }

    @NotNull
    public final List<n> getPreCreateInfoList(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C7714v.b0(new o(R$layout.widget_navigation_slider_layout, 1, activity), new o(R$layout.item_navigation_block, 1, activity), new o(R$layout.item_navigation_block_element, 5, activity));
    }
}
