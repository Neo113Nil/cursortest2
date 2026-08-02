package ru.ozon.app.android.geo.map.presentation.mapicons;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.LruCache;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$drawable;
import ru.ozon.app.android.geo.flags.PlacemarksCacheSizeFlag;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOKt;
import ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider;
import ru.ozon.app.android.geo.map.presentation.utils.LocationMarkerProvider;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pinlocator.PinLocator;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 S2\u00020\u0001:\u0004STUVB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0019\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150 ¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00172\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b)\u0010*J/\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u001e¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0015¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0018\u0010@\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u00060KR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006W"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/mapcommon/map/OzonMapController;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "id", "Lwe0/m;", "coordinate", "Lwe0/A;", "content", "Landroid/graphics/PointF;", "anchor", "Lkotlin/Function0;", "", "onPinTap", "", "zIndex", "addPlacemark", "(Ljava/lang/String;Lwe0/m;Lwe0/A;Landroid/graphics/PointF;Lkotlin/jvm/functions/Function0;F)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "target", "Lkotlin/Pair;", "", "pinSize", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onBitmapReady", "createCenterPinMarkerBitmap", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "mapObject", "zoom", "onTap", "createMapObject", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;FLkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "userLocationMarker", "onUserLocationAction", "", "showTooltip", "createUserLocationMarker", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;)V", "itemsCount", "setMarkerItemsCount", "(I)V", "cancelUserLocationSwapRunnable", "()Lkotlin/Unit;", "clearPlacemarksCache", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;", "cache", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;", "Lru/ozon/app/android/geo/map/presentation/utils/LocationMarkerProvider;", "locationMarkerProvider", "Lru/ozon/app/android/geo/map/presentation/utils/LocationMarkerProvider;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapObjectFactory;", "mapObjectFactory", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapObjectFactory;", "LAe/x0;", "initItemsCounterStateFlow", "LAe/x0;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$PlacemarksCache;", "placemarksCache", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$PlacemarksCache;", "LAe/h;", "initItemsCounterState", "LAe/h;", "getInitItemsCounterState", "()LAe/h;", "Companion", "DescriptorCache", "BitmapContainer", "PlacemarksCache", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapIconProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final PointF defaultAnchor = new PointF(0.5f, 0.5f);

    @NotNull
    private final DescriptorCache cache;

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final InterfaceC2395h<Integer> initItemsCounterState;

    @NotNull
    private final x0<Integer> initItemsCounterStateFlow;

    @NotNull
    private final LocationMarkerProvider locationMarkerProvider;

    @NotNull
    private final OzonMapController mapController;

    @NotNull
    private final MapObjectFactory mapObjectFactory;

    @NotNull
    private final PlacemarksCache placemarksCache;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$BitmapContainer;", "", "bitmap", "Landroid/graphics/Bitmap;", "anchor", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getAnchor", "()Landroid/graphics/PointF;", "size", "", "getSize", "()I", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BitmapContainer {
        private final PointF anchor;

        @NotNull
        private final Bitmap bitmap;
        private final int size;

        public BitmapContainer(@NotNull Bitmap bitmap, PointF pointF) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.anchor = pointF;
            this.size = bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
        }

        public final PointF getAnchor() {
            return this.anchor;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$Companion;", "", "<init>", "()V", "", "COLLAPSED_STATE_ZOOM", "F", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache;", "", "<init>", "(Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;)V", "cacheMap", "ru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache$cacheMap$1", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$DescriptorCache$cacheMap$1;", "get", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$BitmapContainer;", "key", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$CacheKey;", "put", "", "bitmap", "Landroid/graphics/Bitmap;", "anchor", "Landroid/graphics/PointF;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DescriptorCache {

        @NotNull
        private final MapIconProvider$DescriptorCache$cacheMap$1 cacheMap;

        /* JADX WARN: Type inference failed for: r0v3, types: [ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider$DescriptorCache$cacheMap$1] */
        public DescriptorCache() {
            final int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL) / 8);
            this.cacheMap = new LruCache<AddressEditMapVO.CacheKey, BitmapContainer>(maxMemory) { // from class: ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider$DescriptorCache$cacheMap$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                public int sizeOf(AddressEditMapVO.CacheKey key, MapIconProvider.BitmapContainer bitmap) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    return bitmap.getSize();
                }
            };
        }

        public static /* synthetic */ String put$default(DescriptorCache descriptorCache, Bitmap bitmap, AddressEditMapVO.CacheKey cacheKey, PointF pointF, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                pointF = null;
            }
            return descriptorCache.put(bitmap, cacheKey, pointF);
        }

        public final BitmapContainer get(@NotNull AddressEditMapVO.CacheKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return get(key);
        }

        @NotNull
        public final String put(@NotNull Bitmap bitmap, @NotNull AddressEditMapVO.CacheKey key, PointF anchor) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(key, "key");
            BitmapContainer bitmapContainer = new BitmapContainer(bitmap, anchor);
            synchronized (this.cacheMap) {
                put(key, bitmapContainer);
            }
            return String.valueOf(bitmapContainer.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$PlacemarksCache;", "", "", "placemarksCacheSize", "<init>", "(Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;I)V", "Lwe0/u;", "pin", "", "put", "(Lwe0/u;)V", "clear", "()V", "ru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$PlacemarksCache$cacheMap$1", "cacheMap", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider$PlacemarksCache$cacheMap$1;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class PlacemarksCache {

        @NotNull
        private final MapIconProvider$PlacemarksCache$cacheMap$1 cacheMap;

        /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider$PlacemarksCache$cacheMap$1] */
        public PlacemarksCache(final int i11) {
            this.cacheMap = new LruCache<String, u>(i11) { // from class: ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider$PlacemarksCache$cacheMap$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                public void entryRemoved(boolean evicted, String key, u oldValue, u newValue) {
                    OzonMapController ozonMapController;
                    z d11;
                    z d12;
                    super.entryRemoved(evicted, (boolean) key, oldValue, newValue);
                    InterfaceC10542A interfaceC10542A = null;
                    if (Intrinsics.d(oldValue != null ? oldValue.e() : null, newValue != null ? newValue.e() : null)) {
                        InterfaceC10542A d13 = (oldValue == null || (d12 = oldValue.d()) == null) ? null : d12.d();
                        if (newValue != null && (d11 = newValue.d()) != null) {
                            interfaceC10542A = d11.d();
                        }
                        if (Intrinsics.d(d13, interfaceC10542A)) {
                            return;
                        }
                    }
                    if (key != null) {
                        ozonMapController = r2.mapController;
                        ozonMapController.removePlacemark(key);
                    }
                }
            };
        }

        public final void clear() {
            evictAll();
        }

        public final void put(@NotNull u pin) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            put(pin.e(), pin);
        }
    }

    public MapIconProvider(@NotNull Context context, @NotNull OzonMapController mapController, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.context = context;
        this.mapController = mapController;
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        DescriptorCache descriptorCache = new DescriptorCache();
        this.cache = descriptorCache;
        this.locationMarkerProvider = new LocationMarkerProvider(context, descriptorCache, mapController);
        this.mapObjectFactory = new MapObjectFactory(context, featureChecker);
        x0<Integer> a11 = O0.a(0);
        this.initItemsCounterStateFlow = a11;
        this.placemarksCache = new PlacemarksCache(featureService.getIntKey(PlacemarksCacheSizeFlag.INSTANCE));
        this.initItemsCounterState = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPlacemark(String id2, m coordinate, InterfaceC10542A content, PointF anchor, Function0<Unit> onPinTap, float zIndex) {
        if (anchor == null) {
            anchor = defaultAnchor;
        }
        u uVar = new u(coordinate, new z(content, anchor, false, false, 0.0f, zIndex, 0.0f, 220), PinLocator.Placemark.INSTANCE, id2, onPinTap, 992);
        this.placemarksCache.put(uVar);
        this.mapController.insertPlacemark(uVar);
    }

    public final Unit cancelUserLocationSwapRunnable() {
        return this.locationMarkerProvider.cancelUserLocationSwapRunnable();
    }

    public final void clearPlacemarksCache() {
        this.placemarksCache.clear();
    }

    public final void createCenterPinMarkerBitmap(@NotNull AddressEditMapVO.Pin target, @NotNull Pair<Integer, Integer> pinSize, @NotNull Function1<? super Bitmap, Unit> onBitmapReady) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(pinSize, "pinSize");
        Intrinsics.checkNotNullParameter(onBitmapReady, "onBitmapReady");
        MapCenterPinIconView mapCenterPinIconView = new MapCenterPinIconView(this.context, null, 0, 0, 14, null);
        mapCenterPinIconView.bind(target, null, e.a(this.context.getResources(), R$drawable.new_courier_pin_drawable, this.context.getTheme()), pinSize);
        View rootView = mapCenterPinIconView.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        onBitmapReady.invoke(UtilsKt.getBitmap(rootView));
    }

    public final void createMapObject(@NotNull final AddressEditMapVO.MapObject mapObject, float zoom, final Function0<Unit> onTap) {
        Integer value;
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        boolean z11 = !mapObject.getIgnoreCollapsedState() && zoom <= 15.0f;
        final AddressEditMapVO.MapObjectCacheKey cacheHash = (mapObject.getType() != AddressEditMapDTO.MapObject.Type.PIN || mapObject.getIsSelected()) ? mapObject.getCacheHash() : AddressEditMapVO.MapObjectCacheKey.copy$default(mapObject.getCacheHash(), null, null, null, null, null, null, null, null, null, Boolean.valueOf(z11), 511, null);
        BitmapContainer bitmapContainer = this.cache.get(cacheHash);
        Bitmap bitmap = bitmapContainer != null ? bitmapContainer.getBitmap() : null;
        if (bitmap == null) {
            final PinIcon createView = this.mapObjectFactory.createView(mapObject, z11);
            createView.bind(mapObject, new OnBitmapReadyCallback() { // from class: ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider$createMapObject$2
                @Override // ru.ozon.app.android.geo.map.presentation.mapicons.OnBitmapReadyCallback
                public void onBitmapReady(Bitmap bitmap2) {
                    MapIconProvider.DescriptorCache descriptorCache;
                    x0 x0Var;
                    Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
                    descriptorCache = MapIconProvider.this.cache;
                    MapIconProvider.this.addPlacemark(mapObject.getUid(), AddressEditMapVOKt.toSdkPoint(mapObject.getCoordinates()), new InterfaceC10542A.c(bitmap2, descriptorCache.put(bitmap2, cacheHash, createView.getAnchor())), createView.getAnchor(), onTap, mapObject.getZPriority());
                    x0Var = MapIconProvider.this.initItemsCounterStateFlow;
                    do {
                    } while (!x0Var.b(x0Var.getValue(), Integer.valueOf(((Number) r0).intValue() - 1)));
                }

                @Override // ru.ozon.app.android.geo.map.presentation.mapicons.OnBitmapReadyCallback
                public void onError() {
                    x0 x0Var;
                    x0Var = MapIconProvider.this.initItemsCounterStateFlow;
                    do {
                    } while (!x0Var.b(x0Var.getValue(), Integer.valueOf(((Number) r1).intValue() - 1)));
                }
            });
        } else {
            addPlacemark(mapObject.getUid(), AddressEditMapVOKt.toSdkPoint(mapObject.getCoordinates()), new InterfaceC10542A.c(bitmap, String.valueOf(bitmapContainer.hashCode())), bitmapContainer.getAnchor(), onTap, mapObject.getZPriority());
            x0<Integer> x0Var = this.initItemsCounterStateFlow;
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, Integer.valueOf(value.intValue() - 1)));
        }
    }

    public final void createUserLocationMarker(@NotNull AddressEditMapVO.LocationMarker userLocationMarker, @NotNull Function0<Unit> onUserLocationAction, Boolean showTooltip) {
        Intrinsics.checkNotNullParameter(userLocationMarker, "userLocationMarker");
        Intrinsics.checkNotNullParameter(onUserLocationAction, "onUserLocationAction");
        this.locationMarkerProvider.createUserLocationMarker(userLocationMarker, onUserLocationAction, showTooltip);
    }

    @NotNull
    public final InterfaceC2395h<Integer> getInitItemsCounterState() {
        return this.initItemsCounterState;
    }

    public final void setMarkerItemsCount(int itemsCount) {
        this.initItemsCounterStateFlow.setValue(Integer.valueOf(itemsCount));
    }
}
