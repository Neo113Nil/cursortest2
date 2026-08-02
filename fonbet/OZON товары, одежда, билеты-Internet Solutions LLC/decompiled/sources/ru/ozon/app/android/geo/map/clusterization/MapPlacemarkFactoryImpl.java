package ru.ozon.app.android.geo.map.clusterization;

import BZ.e;
import BZ.f;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.appcompat.view.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.mapicons.ClusterizationPinIcon;
import ru.ozon.app.android.geo.map.presentation.mapicons.DefaultPinIconView;
import ru.ozon.app.android.geo.map.presentation.mapicons.ExpandedPinIconView;
import ru.ozon.app.android.geo.map.presentation.mapicons.SelectedPinIconView;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\"\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactoryImpl;", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkFactory;", "Lru/ozon/app/android/geo/map/clusterization/PinImageLoader;", "imageLoader", "LBZ/e;", "miniAppConfigHolder", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/geo/map/clusterization/PinImageLoader;LBZ/e;Landroid/content/Context;)V", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;", "pin", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "getOrCreateDefaultStateBitmap", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;)Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "createDefaultStateBitmap", "", "prepareSelectedStateBitmap", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;)V", "Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterizationPinIcon;", "createDefaultStateView", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;)Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterizationPinIcon;", "view", "", "cacheKey", "renderAndCacheBitmap", "(Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterizationPinIcon;Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;I)Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "bitmapContainer", "Lwe0/u;", "createMapPlacemark", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;)Lwe0/u;", "", "", "images", "preloadImages", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "hasAdditionalContent", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;)Z", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;", "data", "createMapPlacemarks", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getBitmapContainer", "(I)Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "Lru/ozon/app/android/geo/map/clusterization/PinImageLoader;", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkBitmapCache;", "bitmapCache", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkBitmapCache;", "Landroidx/appcompat/view/d;", "themedContext", "Landroidx/appcompat/view/d;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPlacemarkFactoryImpl implements MapPlacemarkFactory {

    @NotNull
    private final MapPlacemarkBitmapCache bitmapCache;

    @NotNull
    private final PinImageLoader imageLoader;

    @NotNull
    private final d themedContext;

    public MapPlacemarkFactoryImpl(@NotNull PinImageLoader imageLoader, @NotNull e miniAppConfigHolder, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageLoader = imageLoader;
        this.bitmapCache = new MapPlacemarkBitmapCache();
        this.themedContext = new d(context, f.b(miniAppConfigHolder));
    }

    private final BitmapContainer createDefaultStateBitmap(ClusterizationPin pin) {
        return renderAndCacheBitmap(createDefaultStateView(pin), pin, pin.getPinMetadata().getDefaultStateCacheHash());
    }

    private final ClusterizationPinIcon createDefaultStateView(ClusterizationPin pin) {
        if (hasAdditionalContent(pin)) {
            return new ExpandedPinIconView(this.themedContext, null, 0, 0, 14, null);
        }
        return new DefaultPinIconView(this.themedContext, null, 0, 0, 14, null);
    }

    private final u createMapPlacemark(ClusterizationPin pin, BitmapContainer bitmapContainer) {
        return new u(new m(pin.getCoordinates().getLatitude(), pin.getCoordinates().getLongitude()), new z(new InterfaceC10542A.c(bitmapContainer.getBitmap(), String.valueOf(bitmapContainer.hashCode())), bitmapContainer.getAnchor(), false, false, 0.0f, pin.getZPriority(), 0.0f, 220), pin.getPinMetadata(), pin.getId(), null, 752);
    }

    private final BitmapContainer getOrCreateDefaultStateBitmap(ClusterizationPin pin) {
        BitmapContainer bitmapContainer = getBitmapContainer(pin.getPinMetadata().getDefaultStateCacheHash());
        return bitmapContainer == null ? createDefaultStateBitmap(pin) : bitmapContainer;
    }

    private final boolean hasAdditionalContent(ClusterizationPin clusterizationPin) {
        return clusterizationPin.getAdditionalContent() != null;
    }

    private final Object preloadImages(List<String> list, kotlin.coroutines.d<? super Unit> dVar) {
        Object loadImages = this.imageLoader.loadImages(list, dVar);
        return loadImages == a.COROUTINE_SUSPENDED ? loadImages : Unit.f71690a;
    }

    private final void prepareSelectedStateBitmap(ClusterizationPin pin) {
        if (this.bitmapCache.get(pin.getPinMetadata().getSelectedStateCacheHash()) != null) {
            return;
        }
        renderAndCacheBitmap(new SelectedPinIconView(this.themedContext, null, 0, 0, 14, null), pin, pin.getPinMetadata().getSelectedStateCacheHash());
    }

    private final BitmapContainer renderAndCacheBitmap(ClusterizationPinIcon view, ClusterizationPin pin, int cacheKey) {
        String image = pin.getImage();
        return this.bitmapCache.put(view.bindAndGetBitmap(pin, image != null ? this.imageLoader.getImage(image) : null), cacheKey, view.getAnchor());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.geo.map.clusterization.MapPlacemarkFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createMapPlacemarks(@NotNull ClusterizationData clusterizationData, @NotNull kotlin.coroutines.d<? super List<u>> dVar) {
        MapPlacemarkFactoryImpl$createMapPlacemarks$1 mapPlacemarkFactoryImpl$createMapPlacemarks$1;
        int i11;
        MapPlacemarkFactoryImpl mapPlacemarkFactoryImpl;
        if (dVar instanceof MapPlacemarkFactoryImpl$createMapPlacemarks$1) {
            mapPlacemarkFactoryImpl$createMapPlacemarks$1 = (MapPlacemarkFactoryImpl$createMapPlacemarks$1) dVar;
            int i12 = mapPlacemarkFactoryImpl$createMapPlacemarks$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mapPlacemarkFactoryImpl$createMapPlacemarks$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mapPlacemarkFactoryImpl$createMapPlacemarks$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = mapPlacemarkFactoryImpl$createMapPlacemarks$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    List<String> images = clusterizationData.getImages();
                    mapPlacemarkFactoryImpl$createMapPlacemarks$1.L$0 = this;
                    mapPlacemarkFactoryImpl$createMapPlacemarks$1.L$1 = clusterizationData;
                    mapPlacemarkFactoryImpl$createMapPlacemarks$1.label = 1;
                    if (preloadImages(images, mapPlacemarkFactoryImpl$createMapPlacemarks$1) == aVar) {
                        return aVar;
                    }
                    mapPlacemarkFactoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    clusterizationData = (ClusterizationData) mapPlacemarkFactoryImpl$createMapPlacemarks$1.L$1;
                    mapPlacemarkFactoryImpl = (MapPlacemarkFactoryImpl) mapPlacemarkFactoryImpl$createMapPlacemarks$1.L$0;
                    s.b(obj);
                }
                List<ClusterizationPin> pinsList = clusterizationData.getPinsList();
                ArrayList arrayList = new ArrayList(C7714v.z(pinsList, 10));
                for (ClusterizationPin clusterizationPin : pinsList) {
                    mapPlacemarkFactoryImpl.prepareSelectedStateBitmap(clusterizationPin);
                    arrayList.add(mapPlacemarkFactoryImpl.createMapPlacemark(clusterizationPin, mapPlacemarkFactoryImpl.getOrCreateDefaultStateBitmap(clusterizationPin)));
                }
                return arrayList;
            }
        }
        mapPlacemarkFactoryImpl$createMapPlacemarks$1 = new MapPlacemarkFactoryImpl$createMapPlacemarks$1(this, dVar);
        Object obj2 = mapPlacemarkFactoryImpl$createMapPlacemarks$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = mapPlacemarkFactoryImpl$createMapPlacemarks$1.label;
        if (i11 != 0) {
        }
        List<ClusterizationPin> pinsList2 = clusterizationData.getPinsList();
        ArrayList arrayList2 = new ArrayList(C7714v.z(pinsList2, 10));
        while (r5.hasNext()) {
        }
        return arrayList2;
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.MapPlacemarkFactory
    public BitmapContainer getBitmapContainer(int cacheKey) {
        return this.bitmapCache.get(cacheKey);
    }
}
