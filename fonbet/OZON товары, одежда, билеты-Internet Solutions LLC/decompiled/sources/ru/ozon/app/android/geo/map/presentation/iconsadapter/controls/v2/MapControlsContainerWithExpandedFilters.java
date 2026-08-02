package ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.v2;

import WZ.t;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.flags.UserLocationFlag;
import ru.ozon.app.android.geo.databinding.MapControlsV2Binding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.MapControlsContainer;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.LocationIcon;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.SearchIcon;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/v2/MapControlsContainerWithExpandedFilters;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/MapControlsContainer;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "LWZ/t;", "", "onCurrentLocationAction", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "onSearchAction", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "", "isSelectApp", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/network/abtool/FeatureService;Z)V", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "items", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "controlsBinding", "bind", "(Ljava/util/List;Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;Z)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Z", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "getControlsBinding", "()Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "isLocationButtonGone", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapControlsContainerWithExpandedFilters implements MapControlsContainer {

    @NotNull
    private final MapControlsV2Binding controlsBinding;

    @NotNull
    private final FeatureService featureService;
    private final boolean isLocationButtonGone;
    private final boolean isSelectApp;

    @NotNull
    private final Function1<t, Unit> onCurrentLocationAction;

    @NotNull
    private final Function1<AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions, Unit> onSearchAction;

    /* JADX WARN: Multi-variable type inference failed */
    public MapControlsContainerWithExpandedFilters(@NotNull ViewGroup parent, @NotNull Function1<? super t, Unit> onCurrentLocationAction, @NotNull Function1<? super AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions, Unit> onSearchAction, @NotNull FeatureService featureService, boolean z11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onCurrentLocationAction, "onCurrentLocationAction");
        Intrinsics.checkNotNullParameter(onSearchAction, "onSearchAction");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.onCurrentLocationAction = onCurrentLocationAction;
        this.onSearchAction = onSearchAction;
        this.featureService = featureService;
        this.isSelectApp = z11;
        boolean z12 = false;
        MapControlsV2Binding inflate = MapControlsV2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.controlsBinding = inflate;
        if (Intrinsics.d(featureService.getStringKey(UserLocationFlag.INSTANCE), "fake") && !z11) {
            z12 = true;
        }
        this.isLocationButtonGone = z12;
    }

    @Override // ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.MapControlsContainer
    public void bind(@NotNull List<? extends AddressEditMapVO.MapIcon> items, @NotNull MapControlsV2Binding controlsBinding, boolean isSelectApp) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(controlsBinding, "controlsBinding");
        SearchIcon searchIcon = new SearchIcon(this.onSearchAction);
        List<? extends AddressEditMapVO.MapIcon> list = items;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((AddressEditMapVO.MapIcon) obj2) instanceof AddressEditMapVO.MapIcon.SearchIcon) {
                    break;
                }
            }
        }
        searchIcon.bind(controlsBinding, (AddressEditMapVO.MapIcon) obj2, isSelectApp);
        LocationIcon locationIcon = new LocationIcon(this.onCurrentLocationAction, this.isLocationButtonGone);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((AddressEditMapVO.MapIcon) next) instanceof AddressEditMapVO.MapIcon.LocationIcon) {
                obj = next;
                break;
            }
        }
        locationIcon.bind(controlsBinding, (AddressEditMapVO.MapIcon) obj, isSelectApp);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.MapControlsContainer
    @NotNull
    public MapControlsV2Binding getControlsBinding() {
        return this.controlsBinding;
    }
}
