package ru.ozon.app.android.geo.map.presentation.iconsadapter.icon;

import WZ.t;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$drawable;
import ru.ozon.app.android.geo.databinding.MapControlsV2Binding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/icon/LocationIcon;", "", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "Lkotlin/Function1;", "LWZ/t;", "", "onAction", "", "isGone", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "binding", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "icon", "isSelectApp", "bind", "(Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;Z)V", "Lkotlin/jvm/functions/Function1;", "Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationIcon {
    private final boolean isGone;

    @NotNull
    private final Function1<t, Unit> onAction;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationIcon(@NotNull Function1<? super t, Unit> onAction, boolean z11) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.isGone = z11;
    }

    public void bind(@NotNull MapControlsV2Binding binding, AddressEditMapVO.MapIcon icon, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout locationButton = binding.locationButton;
        Intrinsics.checkNotNullExpressionValue(locationButton, "locationButton");
        if (icon == null || this.isGone) {
            ViewExtKt.gone(locationButton);
            return;
        }
        ViewExtKt.show(locationButton);
        AddressEditMapVO.MapIcon.LocationIcon locationIcon = (AddressEditMapVO.MapIcon.LocationIcon) icon;
        ImageView imageView = binding.locationIconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, locationIcon.getIcon(), null, null, null, null, false, null, 126, null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicPrimary)));
        ViewExtKt.setOnClickListenerThrottle$default(imageView, 0L, new LocationIcon$bind$1$1(locationIcon, this), 1, null);
        if (isSelectApp) {
            imageView.setBackgroundResource(R$drawable.bg_white_ripple_blue_rounded_select);
        }
    }
}
