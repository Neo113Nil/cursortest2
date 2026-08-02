package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.location.GeofenceStatusCodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.ViewMapPinContainerBinding;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.ViewMapPinPriceContainerBinding;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.BitmapContainer;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ve0.b;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/MapIconProviderV2;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "pin", "Lve0/b;", "mapController", "Lkotlin/Function0;", "", "onPinTap", "addPin", "(Landroid/graphics/Bitmap;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;Lve0/b;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "createUserPinMarker", "(Lve0/b;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;)V", "createPinMarker", "(Lve0/b;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "cache", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapIconProviderV2 {

    @NotNull
    private final DescriptorCache cache;

    @NotNull
    private final Context context;

    public MapIconProviderV2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cache = new DescriptorCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPin(Bitmap bitmap, HotelsMapInfoV2VO.Pin pin, b mapController, Function0<Unit> onPinTap) {
        mapController.b().insertPlacemark(new u(pin.getCoordinate(), new z(new InterfaceC10542A.c(bitmap, String.valueOf(pin.getCacheHash())), pin.getAnchorPoint(), false, false, 0.0f, 0.0f, 0.0f, 252), null, null, onPinTap, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void addPin$default(MapIconProviderV2 mapIconProviderV2, Bitmap bitmap, HotelsMapInfoV2VO.Pin pin, b bVar, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        mapIconProviderV2.addPin(bitmap, pin, bVar, function0);
    }

    @SuppressLint({"InflateParams"})
    public final void createPinMarker(@NotNull final b mapController, @NotNull final HotelsMapInfoV2VO.Pin pin, final Function0<Unit> onPinTap) {
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (pin instanceof HotelsMapInfoV2VO.Pin.UserPin) {
            return;
        }
        BitmapContainer bitmapContainer = this.cache.get(pin.getCacheHash());
        Bitmap bitmap = bitmapContainer != null ? bitmapContainer.getBitmap() : null;
        if (bitmap != null) {
            addPin(bitmap, pin, mapController, onPinTap);
            Unit unit = Unit.f71690a;
            return;
        }
        if (pin instanceof HotelsMapInfoV2VO.Pin.IconPin) {
            final ViewMapPinContainerBinding inflate = ViewMapPinContainerBinding.inflate(LayoutInflater.from(this.context));
            TextAtomView pinTitle = inflate.pinTitle;
            Intrinsics.checkNotNullExpressionValue(pinTitle, "pinTitle");
            pinTitle.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = inflate.pinIcon.getLayoutParams();
            HotelsMapInfoV2VO.Pin.IconPin iconPin = (HotelsMapInfoV2VO.Pin.IconPin) pin;
            layoutParams.width = iconPin.getSize().getWidth();
            layoutParams.height = iconPin.getSize().getHeight();
            AppCompatImageView pinIcon = inflate.pinIcon;
            Intrinsics.checkNotNullExpressionValue(pinIcon, "pinIcon");
            ImageViewExtKt.loadAsBitmap$default(pinIcon, iconPin.getIcon().getImage(), null, new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.MapIconProviderV2$createPinMarker$1$2
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Bitmap resource) {
                    DescriptorCache descriptorCache;
                    ViewMapPinContainerBinding.this.pinIcon.setImageBitmap(resource);
                    FrameLayout constraintLayout = ViewMapPinContainerBinding.this.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    Bitmap bitmap2 = MapExtKt.getBitmap(constraintLayout);
                    descriptorCache = this.cache;
                    descriptorCache.put(new BitmapContainer(bitmap2), ((HotelsMapInfoV2VO.Pin.IconPin) pin).getCacheHash());
                    this.addPin(bitmap2, (HotelsMapInfoV2VO.Pin.IconPin) pin, mapController, onPinTap);
                }
            }, null, 10, null);
            Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
            return;
        }
        if (!(pin instanceof HotelsMapInfoV2VO.Pin.TitlePin)) {
            Unit unit2 = Unit.f71690a;
            return;
        }
        ViewMapPinPriceContainerBinding inflate2 = ViewMapPinPriceContainerBinding.inflate(LayoutInflater.from(this.context));
        Drawable background = inflate2.pinPriceTitle.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = inflate2.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HotelsMapInfoV2VO.Pin.TitlePin titlePin = (HotelsMapInfoV2VO.Pin.TitlePin) pin;
            gradientDrawable.setColor(styleParser.parseColor(context, titlePin.getBackgroundColor(), R$color.bg_action_primary));
            Context context2 = inflate2.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int px = ResourceExtKt.toPx(1, context2);
            Context context3 = inflate2.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            gradientDrawable.setStroke(px, styleParser.parseColor(context3, titlePin.getBorderColor(), R$color.bg_action_primary));
        }
        Drawable background2 = inflate2.pinPriceIcon.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.mutate();
            Context context4 = inflate2.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int px2 = ResourceExtKt.toPx(1, context4);
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context5 = inflate2.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            gradientDrawable2.setStroke(px2, styleParser2.parseColor(context5, ((HotelsMapInfoV2VO.Pin.TitlePin) pin).getBorderColor(), R$color.bg_action_primary));
        }
        TextAtomView pinPriceTitle = inflate2.pinPriceTitle;
        Intrinsics.checkNotNullExpressionValue(pinPriceTitle, "pinPriceTitle");
        HotelsMapInfoV2VO.Pin.TitlePin titlePin2 = (HotelsMapInfoV2VO.Pin.TitlePin) pin;
        TextAtomHolderKt.bind$default(pinPriceTitle, titlePin2.getTitle(), null, 2, null);
        ConstraintLayout constraintLayout = inflate2.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        Bitmap bitmap2 = MapExtKt.getBitmap(constraintLayout);
        this.cache.put(new BitmapContainer(bitmap2), titlePin2.getCacheHash());
        addPin(bitmap2, titlePin2, mapController, onPinTap);
        Intrinsics.checkNotNullExpressionValue(inflate2, "apply(...)");
    }

    public final void createUserPinMarker(@NotNull b mapController, @NotNull HotelsMapInfoV2VO.Pin.UserPin pin) {
        Intrinsics.checkNotNullParameter(mapController, "mapController");
        Intrinsics.checkNotNullParameter(pin, "pin");
        pin.getCoordinate();
        BitmapContainer bitmapContainer = this.cache.get(pin.getCacheHash());
        Bitmap bitmap = bitmapContainer != null ? bitmapContainer.getBitmap() : null;
        if (bitmap != null) {
            addPin$default(this, bitmap, pin, mapController, null, 8, null);
        } else {
            ContextExtKt.loadAsBitmap$default(this.context, pin.getIcon().getImage(), null, new ImageSize(pin.getSize().getWidth(), pin.getSize().getHeight()), null, new MapIconProviderV2$createUserPinMarker$1(this, pin, mapController), 10, null);
        }
    }
}
