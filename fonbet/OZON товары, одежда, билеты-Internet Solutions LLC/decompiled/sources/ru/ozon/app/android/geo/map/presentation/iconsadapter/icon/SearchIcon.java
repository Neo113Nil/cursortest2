package ru.ozon.app.android.geo.map.presentation.iconsadapter.icon;

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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/icon/SearchIcon;", "", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "Lkotlin/Function1;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "icon", "", "isSelectApp", "bind", "(Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;Z)V", "Lkotlin/jvm/functions/Function1;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchIcon {

    @NotNull
    private final Function1<AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions, Unit> onAction;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchIcon(@NotNull Function1<? super AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }

    public void bind(@NotNull MapControlsV2Binding binding, AddressEditMapVO.MapIcon icon, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout searchButton = binding.searchButton;
        Intrinsics.checkNotNullExpressionValue(searchButton, "searchButton");
        if (icon == null) {
            ViewExtKt.gone(searchButton);
            return;
        }
        ViewExtKt.show(searchButton);
        AddressEditMapVO.MapIcon.SearchIcon searchIcon = (AddressEditMapVO.MapIcon.SearchIcon) icon;
        ViewExtKt.setOnClickListenerThrottle$default(searchButton, 0L, new SearchIcon$bind$1(searchIcon, this), 1, null);
        ImageView imageView = binding.searchIconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, searchIcon.getIcon(), null, null, null, null, false, null, 126, null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicPrimary)));
        if (isSelectApp) {
            imageView.setBackgroundResource(R$drawable.bg_white_ripple_blue_rounded_select);
        }
    }
}
