package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"setViewPager1", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/PdpGalleryPagerIndicator;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "setViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewPagerWrapperKt {
    public static final void setViewPager1(@NotNull PdpGalleryPagerIndicator pdpGalleryPagerIndicator, @NotNull ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(pdpGalleryPagerIndicator, "<this>");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        pdpGalleryPagerIndicator.setViewPager(new ViewPagerWrapper.V1(viewPager));
    }

    public static final void setViewPager2(@NotNull PdpGalleryPagerIndicator pdpGalleryPagerIndicator, @NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(pdpGalleryPagerIndicator, "<this>");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        pdpGalleryPagerIndicator.setViewPager(new ViewPagerWrapper.V2(viewPager));
    }
}
