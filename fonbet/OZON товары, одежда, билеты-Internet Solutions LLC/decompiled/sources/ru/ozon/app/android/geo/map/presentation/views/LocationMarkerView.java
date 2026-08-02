package ru.ozon.app.android.geo.map.presentation.views;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.MapLocationMarkerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "marker", "Lkotlin/Function1;", "", "", "doOnIconLoaded", "isUserLocationMarker", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lkotlin/jvm/functions/Function1;Z)V", "isWithTooltip", "Landroid/graphics/PointF;", "getContentAnchor", "(Z)Landroid/graphics/PointF;", "getState", "(Z)Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView;", "Lru/ozon/app/android/geo/databinding/MapLocationMarkerBinding;", "binding", "Lru/ozon/app/android/geo/databinding/MapLocationMarkerBinding;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationMarkerView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float SHADOW_ELEVATION = UiExtKt.toPxF(3);

    @NotNull
    private final MapLocationMarkerBinding binding;
    private AddressEditMapVO.LocationMarker marker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/views/LocationMarkerView$Companion;", "", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocationMarkerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull AddressEditMapVO.LocationMarker marker, @NotNull Function1<? super Boolean, Unit> doOnIconLoaded, boolean isUserLocationMarker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(doOnIconLoaded, "doOnIconLoaded");
        AddressEditMapVO.LocationMarker locationMarker = this.marker;
        if (Intrinsics.d(locationMarker != null ? locationMarker.getHashId() : null, marker.getHashId())) {
            doOnIconLoaded.invoke(Boolean.valueOf(marker.getTooltip() != null));
            return;
        }
        AppCompatTextView appCompatTextView = this.binding.tooltipTV;
        AddressEditMapVO.LocationTooltip tooltip = marker.getTooltip();
        if (tooltip != null) {
            appCompatTextView.setText(tooltip.getText());
            String textColor = tooltip.getTextColor();
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseColor = styleParser.parseColor(context, textColor);
            if (parseColor != null) {
                appCompatTextView.setTextColor(parseColor.intValue());
            }
            String backgroundColor = tooltip.getBackgroundColor();
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, backgroundColor);
            if (parseColor2 != null) {
                appCompatTextView.getBackground().setTint(parseColor2.intValue());
            }
        } else {
            Intrinsics.f(appCompatTextView);
            ViewExtKt.gone(appCompatTextView);
        }
        AddressEditMapVO.LocationMarker locationMarker2 = this.marker;
        if (Intrinsics.d(locationMarker2 != null ? locationMarker2.getIcon() : null, marker.getIcon()) && isUserLocationMarker) {
            doOnIconLoaded.invoke(Boolean.FALSE);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ContextExtKt.loadAsBitmap$default(context3, marker.getIcon(), null, null, null, new LocationMarkerView$bind$2(this, doOnIconLoaded, marker), 14, null);
        }
        this.marker = marker;
    }

    public final PointF getContentAnchor(boolean isWithTooltip) {
        MapLocationMarkerBinding mapLocationMarkerBinding = this.binding;
        float height = mapLocationMarkerBinding.iconIV.getHeight() + mapLocationMarkerBinding.tooltipTV.getHeight();
        if (isWithTooltip) {
            return new PointF(0.5f, (height - (mapLocationMarkerBinding.iconIV.getHeight() / 2)) / height);
        }
        return null;
    }

    @NotNull
    public final LocationMarkerView getState(boolean isWithTooltip) {
        AppCompatTextView tooltipTV = this.binding.tooltipTV;
        Intrinsics.checkNotNullExpressionValue(tooltipTV, "tooltipTV");
        ViewExtKt.showOrGone(tooltipTV, Boolean.valueOf(isWithTooltip));
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationMarkerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        MapLocationMarkerBinding inflate = MapLocationMarkerBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.iconIV.setElevation(SHADOW_ELEVATION);
    }
}
