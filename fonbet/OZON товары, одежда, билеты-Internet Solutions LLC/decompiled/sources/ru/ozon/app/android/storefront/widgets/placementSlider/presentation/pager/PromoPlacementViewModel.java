package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "initialState", "<init>", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;)V", "", "bannerId", "", "isVisible", "tryTrackBannerView", "(JZ)Z", "other", "hasSameBannersAs", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;)Z", "", "page", "isWidgetVisible", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "item", "Lru/ozon/uni/atoms/af/AtomAction;", "onPageChanged", "(IZLru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;)Lru/ozon/uni/atoms/af/AtomAction;", "onBannerViewed", "(ZLru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;)Lru/ozon/uni/atoms/af/AtomAction;", "newState", "", "updateState", "LAe/x0;", "mutableState", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentPage", "Ljava/lang/Integer;", "getCurrentPage", "()Ljava/lang/Integer;", "visibleBannerId", "Ljava/lang/Long;", "", "viewActionSendCounts", "Ljava/util/Map;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPlacementViewModel extends w0 {
    private Integer currentPage;

    @NotNull
    private final x0<PromoPlacementVO> mutableState;

    @NotNull
    private final M0<PromoPlacementVO> state;

    @NotNull
    private final Map<Long, Integer> viewActionSendCounts;
    private Long visibleBannerId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel$Companion;", "", "<init>", "()V", "MAX_VIEW_ACTION_SEND_COUNT_PER_BANNER", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PromoPlacementViewModel(@NotNull PromoPlacementVO initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        x0<PromoPlacementVO> a11 = O0.a(initialState);
        this.mutableState = a11;
        this.state = C2399j.b(a11);
        this.viewActionSendCounts = new LinkedHashMap();
    }

    private final boolean hasSameBannersAs(PromoPlacementVO promoPlacementVO, PromoPlacementVO promoPlacementVO2) {
        if (promoPlacementVO.getItems().size() != promoPlacementVO2.getItems().size()) {
            return false;
        }
        Iterable O11 = C7714v.O(promoPlacementVO.getItems());
        if ((O11 instanceof Collection) && ((Collection) O11).isEmpty()) {
            return true;
        }
        Iterator it = O11.iterator();
        while (it.hasNext()) {
            int b11 = ((Q) it).b();
            if (!Intrinsics.d(promoPlacementVO.getItems().get(b11).getImageURL(), promoPlacementVO2.getItems().get(b11).getImageURL())) {
                return false;
            }
        }
        return true;
    }

    private final boolean tryTrackBannerView(long bannerId, boolean isVisible) {
        if (!isVisible) {
            Long l11 = this.visibleBannerId;
            if (l11 != null && l11.longValue() == bannerId) {
                this.visibleBannerId = null;
            }
            return false;
        }
        Long l12 = this.visibleBannerId;
        if (l12 != null && l12.longValue() == bannerId) {
            return false;
        }
        this.visibleBannerId = Long.valueOf(bannerId);
        Integer num = this.viewActionSendCounts.get(Long.valueOf(bannerId));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue >= 10) {
            return false;
        }
        this.viewActionSendCounts.put(Long.valueOf(bannerId), Integer.valueOf(intValue + 1));
        return true;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final M0<PromoPlacementVO> getState() {
        return this.state;
    }

    public final AtomAction onBannerViewed(boolean isWidgetVisible, @NotNull BannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomAction viewAction = item.getViewAction();
        if (viewAction != null && tryTrackBannerView(item.getId(), isWidgetVisible)) {
            return viewAction;
        }
        return null;
    }

    public final AtomAction onPageChanged(int page, boolean isWidgetVisible, @NotNull BannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentPage = Integer.valueOf(page);
        return onBannerViewed(isWidgetVisible, item);
    }

    public final void updateState(@NotNull PromoPlacementVO newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (hasSameBannersAs(newState, this.mutableState.getValue())) {
            return;
        }
        this.viewActionSendCounts.clear();
        this.currentPage = null;
        this.mutableState.setValue(newState);
    }
}
