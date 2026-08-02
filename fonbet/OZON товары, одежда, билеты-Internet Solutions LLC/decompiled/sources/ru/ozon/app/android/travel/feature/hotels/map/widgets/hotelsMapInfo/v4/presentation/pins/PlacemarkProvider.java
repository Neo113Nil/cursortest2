package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.BitmapContainer;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.PointPinProvider;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.PricePinProvider;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\nJ\r\u00100\u001a\u00020\u001f¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PlacemarkProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pin", "Lwe0/u;", "providePricePin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)Lwe0/u;", "providePointPin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;", "view", "Landroid/graphics/Bitmap;", "getPriceBitmap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PricePinProvider;)Landroid/graphics/Bitmap;", "", "cacheKey", "getPointBitmap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;I)Landroid/graphics/Bitmap;", "cacheHash", "getPriceBitmapFromCache", "(I)Landroid/graphics/Bitmap;", "getPointBitmapFromCache", "mapPointPinToKey", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)I", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "pricePinStates", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "pointPinStates", "", "setPinTypes", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPinClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "isEnabled", "toggleIndivisibleClusters", "(Z)V", "", "singlePinTemplateTitle", "clusterPinTemplateTitle", "setPinTitleTemplates", "(Ljava/lang/String;Ljava/lang/String;)V", "provide", "onDestroy", "()V", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "pricePinCache", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "pointPinCache", "onPinClickListener", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PriceViewPool;", "priceViewPool", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PriceViewPool;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PointViewPool;", "pointViewPool", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PointViewPool;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlacemarkProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;
    private Function1<? super HotelsMapInfoV4VO.Pin, Unit> onPinClickListener;

    @NotNull
    private final DescriptorCache pointPinCache;

    @NotNull
    private final PointViewPool pointViewPool;

    @NotNull
    private final DescriptorCache pricePinCache;

    @NotNull
    private final PriceViewPool priceViewPool;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PlacemarkProvider$Companion;", "", "<init>", "()V", "SELECTED_POINT_KEY", "", "VIEWED_POINT_KEY", "WITHOUT_PRICE_KEY", "USUAL_POINT_KEY", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlacemarkProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.pricePinCache = new DescriptorCache();
        this.pointPinCache = new DescriptorCache();
        this.priceViewPool = new PriceViewPool(new PricePinProvider(context), new PricePinProvider(context), new PricePinProvider(context));
        this.pointViewPool = new PointViewPool(new PointPinProvider(context), new PointPinProvider(context), new PointPinProvider(context));
    }

    private final Bitmap getPointBitmap(HotelsMapInfoV4VO.Pin pin, int cacheKey) {
        Bitmap pointBitmapFromCache = getPointBitmapFromCache(cacheKey);
        if (pointBitmapFromCache != null) {
            return pointBitmapFromCache;
        }
        Bitmap provide = (pin.getIsSelected() ? this.pointViewPool.getSelectedPin() : (pin.getIsViewed() || (pin.getTitle() == null && pin.getPrice() == null)) ? this.pointViewPool.getViewedPin() : this.pointViewPool.getDefaultPin()).provide();
        this.pointPinCache.put(new BitmapContainer(provide), cacheKey);
        return provide;
    }

    private final Bitmap getPointBitmapFromCache(int cacheHash) {
        BitmapContainer bitmapContainer = this.pointPinCache.get(cacheHash);
        if (bitmapContainer != null) {
            return bitmapContainer.getBitmap();
        }
        return null;
    }

    private final Bitmap getPriceBitmap(HotelsMapInfoV4VO.Pin pin, PricePinProvider view) {
        Bitmap priceBitmapFromCache = getPriceBitmapFromCache(pin.getCacheHash());
        if (priceBitmapFromCache != null) {
            return priceBitmapFromCache;
        }
        Bitmap provide = view.provide(pin);
        this.pricePinCache.put(new BitmapContainer(provide), pin.getCacheHash());
        return provide;
    }

    private final Bitmap getPriceBitmapFromCache(int cacheHash) {
        BitmapContainer bitmapContainer = this.pricePinCache.get(cacheHash);
        if (bitmapContainer != null) {
            return bitmapContainer.getBitmap();
        }
        return null;
    }

    private final int mapPointPinToKey(HotelsMapInfoV4VO.Pin pin) {
        if (pin.getIsSelected()) {
            return 0;
        }
        if (pin.getIsViewed()) {
            return 1;
        }
        return (pin.getPrice() == null && pin.getTitle() == null) ? 2 : 3;
    }

    private final u providePointPin(HotelsMapInfoV4VO.Pin pin) {
        int mapPointPinToKey = mapPointPinToKey(pin);
        return new u(pin.getCoords(), new z(new InterfaceC10542A.c(getPointBitmap(pin, mapPointPinToKey), String.valueOf(mapPointPinToKey)), null, false, false, 0.0f, pin.getZIndex(), 0.0f, 222), Integer.valueOf(pin.getCacheHash()), pin.getId(), new PlacemarkProvider$providePointPin$1$1(this, pin), 992);
    }

    private final u providePricePin(HotelsMapInfoV4VO.Pin pin) {
        return new u(pin.getCoords(), new z(new InterfaceC10542A.c(getPriceBitmap(pin, pin.getIsSelected() ? this.priceViewPool.getSelectedPin() : pin.getIsViewed() ? this.priceViewPool.getViewedPin() : this.priceViewPool.getDefaultPin()), String.valueOf(pin.getCacheHash())), null, false, false, 0.0f, pin.getZIndex(), 0.0f, 222), Integer.valueOf(pin.getCacheHash()), pin.getId(), new PlacemarkProvider$providePricePin$1$1(this, pin), 992);
    }

    public final void onDestroy() {
        this.onPinClickListener = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001e, code lost:
    
        if (r2.getPrice() == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u provide(@NotNull HotelsMapInfoV4VO.Pin pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        try {
            if (!pin.getIsTop()) {
                if (pin.getIsSelected()) {
                }
                return pin.getIsFavorite() ? providePricePin(pin) : providePointPin(pin);
            }
            if (pin.getTitle() == null) {
            }
        } catch (Throwable th2) {
            ThrowableExtKt.log(th2, "Error while provide mapPlacemark");
            return null;
        }
    }

    public final void setOnPinClickListener(@NotNull Function1<? super HotelsMapInfoV4VO.Pin, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPinClickListener = listener;
    }

    public final void setPinTitleTemplates(String singlePinTemplateTitle, String clusterPinTemplateTitle) {
        this.priceViewPool.setPinTitleTemplates(singlePinTemplateTitle, clusterPinTemplateTitle);
    }

    public final void setPinTypes(@NotNull HotelsMapInfoV4VO.PricePinStates pricePinStates, @NotNull HotelsMapInfoV4VO.PointPinStates pointPinStates) {
        Intrinsics.checkNotNullParameter(pricePinStates, "pricePinStates");
        Intrinsics.checkNotNullParameter(pointPinStates, "pointPinStates");
        this.pointViewPool.setPinTypes(pointPinStates);
        this.priceViewPool.setPinTypes(pricePinStates);
    }

    public final void toggleIndivisibleClusters(boolean isEnabled) {
        this.priceViewPool.toggleIndivisibleClusters(isEnabled);
    }
}
