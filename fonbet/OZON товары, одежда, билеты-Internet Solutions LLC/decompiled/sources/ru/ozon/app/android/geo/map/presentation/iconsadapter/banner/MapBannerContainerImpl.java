package ru.ozon.app.android.geo.map.presentation.iconsadapter.banner;

import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.MapBannerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainerImpl;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainer;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "", "onBannerClickAction", "", "onBannerLoaded", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "bannerIcon", "", "isSelectApp", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Z)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "updateState", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;)V", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "bannerBinding", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "getBannerBinding", "()Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/icon/BannerIcon;", "bannerView", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/icon/BannerIcon;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapBannerContainerImpl implements MapBannerContainer {

    @NotNull
    private final MapBannerBinding bannerBinding;
    private AddressEditMapVO.MapIcon.BannerIcon bannerIcon;
    private BannerIcon bannerView;

    @NotNull
    private final Function1<AddressEditMapVO.MapIcon.BannerIcon, Unit> onBannerClickAction;

    @NotNull
    private final Function1<Long, Unit> onBannerLoaded;

    @NotNull
    private final ViewGroup parent;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Multi-variable type inference failed */
    public MapBannerContainerImpl(@NotNull ViewGroup parent, @NotNull Function1<? super AddressEditMapVO.MapIcon.BannerIcon, Unit> onBannerClickAction, @NotNull Function1<? super Long, Unit> onBannerLoaded, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onBannerClickAction, "onBannerClickAction");
        Intrinsics.checkNotNullParameter(onBannerLoaded, "onBannerLoaded");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.parent = parent;
        this.onBannerClickAction = onBannerClickAction;
        this.onBannerLoaded = onBannerLoaded;
        this.tokenizedAnalytics = tokenizedAnalytics;
        MapBannerBinding inflate = MapBannerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.bannerBinding = inflate;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.iconsadapter.banner.MapBannerContainer
    public void bind(AddressEditMapVO.MapIcon.BannerIcon bannerIcon, boolean isSelectApp) {
        this.bannerIcon = bannerIcon;
        if (bannerIcon != null) {
            BannerIcon bannerIcon2 = new BannerIcon(this.tokenizedAnalytics, this.onBannerClickAction, this.onBannerLoaded);
            this.bannerView = bannerIcon2;
            bannerIcon2.bind(getBannerBinding(), bannerIcon, isSelectApp);
        }
    }

    @Override // ru.ozon.app.android.geo.map.presentation.iconsadapter.banner.MapBannerContainer
    @NotNull
    public MapBannerBinding getBannerBinding() {
        return this.bannerBinding;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.iconsadapter.banner.MapBannerContainer
    public void updateState(@NotNull AddressEditMapViewModel.BannerState bannerState) {
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        BannerIcon bannerIcon = this.bannerView;
        if (bannerIcon != null) {
            BannerIcon.updateState$default(bannerIcon, getBannerBinding(), bannerState, this.bannerIcon, false, 8, null);
        }
    }
}
