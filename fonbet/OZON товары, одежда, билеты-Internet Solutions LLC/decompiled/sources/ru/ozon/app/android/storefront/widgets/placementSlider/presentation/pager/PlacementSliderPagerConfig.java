package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PlacementSliderPagerConfig;", "", "", "itemCount", "<init>", "(I)V", "savedPage", "initialPage", "(Ljava/lang/Integer;)I", "page", "toItemIndex", "(I)I", "nextPage", "I", "", "isCircular", "Z", "()Z", "canAutoScroll", "getCanAutoScroll", "pageCount", "getPageCount", "()I", "getInitialPage", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlacementSliderPagerConfig {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean canAutoScroll;
    private final int initialPage;
    private final boolean isCircular;
    private final int itemCount;
    private final int pageCount;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PlacementSliderPagerConfig$Companion;", "", "<init>", "()V", "MIN_CIRCULAR_ITEM_COUNT", "", "MIN_AUTO_SCROLL_ITEM_COUNT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlacementSliderPagerConfig(int i11) {
        this.itemCount = i11;
        boolean z11 = i11 >= 2;
        this.isCircular = z11;
        this.canAutoScroll = i11 >= 2;
        this.pageCount = z11 ? Integer.MAX_VALUE : i11;
        this.initialPage = z11 ? 1073741823 - (1073741823 % i11) : 0;
    }

    public final boolean getCanAutoScroll() {
        return this.canAutoScroll;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final int initialPage(Integer savedPage) {
        if (savedPage != null) {
            int intValue = savedPage.intValue();
            if (intValue < 0 || intValue >= this.pageCount) {
                savedPage = null;
            }
            if (savedPage != null) {
                return savedPage.intValue();
            }
        }
        return this.initialPage;
    }

    public final int nextPage(int page) {
        int i11 = page + 1;
        if (i11 < this.pageCount) {
            return i11;
        }
        return 0;
    }

    public final int toItemIndex(int page) {
        int floorMod;
        int i11 = this.itemCount;
        if (i11 == 0) {
            return 0;
        }
        floorMod = PlacementSliderPagerConfigKt.floorMod(page, i11);
        return floorMod;
    }
}
