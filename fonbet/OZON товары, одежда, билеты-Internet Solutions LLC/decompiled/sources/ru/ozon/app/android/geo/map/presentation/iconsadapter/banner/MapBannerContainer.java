package ru.ozon.app.android.geo.map.presentation.iconsadapter.banner;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.MapBannerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainer;", "", "bannerBinding", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "getBannerBinding", "()Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "bind", "", "bannerIcon", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "isSelectApp", "", "updateState", "bannerState", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MapBannerContainer {
    void bind(AddressEditMapVO.MapIcon.BannerIcon bannerIcon, boolean isSelectApp);

    @NotNull
    MapBannerBinding getBannerBinding();

    void updateState(@NotNull AddressEditMapViewModel.BannerState bannerState);
}
