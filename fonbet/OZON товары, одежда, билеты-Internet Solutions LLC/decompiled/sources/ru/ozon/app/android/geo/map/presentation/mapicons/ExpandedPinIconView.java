package ru.ozon.app.android.geo.map.presentation.mapicons;

import B3.D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.ExpandedPinIconContainerBinding;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPin;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/ExpandedPinIconView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterizationPinIcon;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/geo/databinding/ExpandedPinIconContainerBinding;", "pinImageBackground", "Landroid/graphics/drawable/GradientDrawable;", "pinDotDrawable", "additionalContentBackground", "Landroid/graphics/drawable/PaintDrawable;", "bind", "", "mapObject", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "onBitmapReadyCallback", "Lru/ozon/app/android/geo/map/presentation/mapicons/OnBitmapReadyCallback;", "getAnchor", "Landroid/graphics/PointF;", "bindAndGetBitmap", "Landroid/graphics/Bitmap;", "pin", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;", "imageBitmap", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpandedPinIconView extends LinearLayout implements ClusterizationPinIcon {

    @NotNull
    private final PaintDrawable additionalContentBackground;

    @NotNull
    private final ExpandedPinIconContainerBinding binding;

    @NotNull
    private final GradientDrawable pinDotDrawable;

    @NotNull
    private final GradientDrawable pinImageBackground;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float SHADOW_DY = UiExtKt.toPxF(2);
    private static final float SHADOW_RADIUS = UiExtKt.toPxF(2);
    private static final float SHADOW_ELEVATION = UiExtKt.toPxF(3);
    private static final float CONTAINER_CORNER_RADIUS = UiExtKt.toPxF(20);
    private static final int PIN_DOT_SIZE = UiExtKt.toPx(10);
    private static final int PIN_DOT_STROKE = UiExtKt.toPx(2);

    @NotNull
    private static final PointF ANCHOR = new PointF(0.5f, 0.91f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/ExpandedPinIconView$Companion;", "", "<init>", "()V", "", "SHADOW_DX", "F", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExpandedPinIconView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    public void bind(@NotNull AddressEditMapVO.MapObject mapObject, final OnBitmapReadyCallback onBitmapReadyCallback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        final ExpandedPinIconContainerBinding expandedPinIconContainerBinding = this.binding;
        String tintColor = mapObject.getTintColor();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(context, tintColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            this.pinImageBackground.setTint(intValue);
            this.pinDotDrawable.setColor(intValue);
        }
        String borderColor = mapObject.getBorderColor();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, borderColor);
        if (parseColor2 != null) {
            int intValue2 = parseColor2.intValue();
            this.additionalContentBackground.getPaint().setColor(intValue2);
            ElevationImageView pinPointer = expandedPinIconContainerBinding.pinPointer;
            Intrinsics.checkNotNullExpressionValue(pinPointer, "pinPointer");
            ThemeExtKt.tint(pinPointer, Integer.valueOf(intValue2));
            this.pinDotDrawable.setStroke(PIN_DOT_STROKE, intValue2);
        }
        AddressEditMapDTO.AdditionalPinContent additionalContent = mapObject.getAdditionalContent();
        if (additionalContent != null) {
            expandedPinIconContainerBinding.additionalContentText.setText(additionalContent.getText());
            String textColor = additionalContent.getTextColor();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser.parseColor(context3, textColor);
            if (parseColor3 != null) {
                expandedPinIconContainerBinding.additionalContentText.setTextColor(parseColor3.intValue());
            }
            if (additionalContent.getIcon() != null) {
                AppCompatImageView additionalContentIcon = expandedPinIconContainerBinding.additionalContentIcon;
                Intrinsics.checkNotNullExpressionValue(additionalContentIcon, "additionalContentIcon");
                ViewExtKt.show(additionalContentIcon);
                AppCompatImageView appCompatImageView = expandedPinIconContainerBinding.additionalContentIcon;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                appCompatImageView.setImageDrawable(ContextExtKt.loadIconByString(context4, additionalContent.getIcon()));
                String iconTintColor = additionalContent.getIconTintColor();
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                Integer parseColor4 = styleParser.parseColor(context5, iconTintColor);
                if (parseColor4 != null) {
                    int intValue3 = parseColor4.intValue();
                    AppCompatImageView additionalContentIcon2 = expandedPinIconContainerBinding.additionalContentIcon;
                    Intrinsics.checkNotNullExpressionValue(additionalContentIcon2, "additionalContentIcon");
                    ThemeExtKt.tint(additionalContentIcon2, Integer.valueOf(intValue3));
                }
            } else {
                AppCompatImageView additionalContentIcon3 = expandedPinIconContainerBinding.additionalContentIcon;
                Intrinsics.checkNotNullExpressionValue(additionalContentIcon3, "additionalContentIcon");
                ViewExtKt.gone(additionalContentIcon3);
            }
        }
        String pinsCount = mapObject.getPinsCount();
        if (pinsCount != null) {
            expandedPinIconContainerBinding.pinsCount.setText(pinsCount);
            String pinsCountColor = mapObject.getPinsCountColor();
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            Integer parseColor5 = styleParser.parseColor(context6, pinsCountColor);
            if (parseColor5 != null) {
                expandedPinIconContainerBinding.pinsCount.setTextColor(parseColor5.intValue());
            }
            if (onBitmapReadyCallback != null) {
                View rootView = getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                onBitmapReadyCallback.onBitmapReady(UtilsKt.getBitmap(rootView));
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        String imageTintColor = mapObject.getImageTintColor();
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        Integer parseColor6 = styleParser.parseColor(context7, imageTintColor);
        if (parseColor6 != null) {
            int intValue4 = parseColor6.intValue();
            AppCompatImageView pinImage = expandedPinIconContainerBinding.pinImage;
            Intrinsics.checkNotNullExpressionValue(pinImage, "pinImage");
            ThemeExtKt.tint(pinImage, Integer.valueOf(intValue4));
        }
        AppCompatImageView pinImage2 = expandedPinIconContainerBinding.pinImage;
        Intrinsics.checkNotNullExpressionValue(pinImage2, "pinImage");
        ImageViewExtKt.loadAsBitmap$default(pinImage2, mapObject.getImage(), null, new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.geo.map.presentation.mapicons.ExpandedPinIconView$bind$1$5$2
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                OnBitmapReadyCallback onBitmapReadyCallback2 = onBitmapReadyCallback;
                if (onBitmapReadyCallback2 != null) {
                    onBitmapReadyCallback2.onError();
                }
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Bitmap resource) {
                ExpandedPinIconContainerBinding.this.pinImage.setImageBitmap(resource);
                OnBitmapReadyCallback onBitmapReadyCallback2 = onBitmapReadyCallback;
                if (onBitmapReadyCallback2 != null) {
                    View rootView2 = this.getRootView();
                    Intrinsics.checkNotNullExpressionValue(rootView2, "getRootView(...)");
                    onBitmapReadyCallback2.onBitmapReady(UtilsKt.getBitmap(rootView2));
                }
            }
        }, null, 10, null);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.ClusterizationPinIcon
    @NotNull
    public Bitmap bindAndGetBitmap(@NotNull ClusterizationPin pin, Bitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ClusterizationPin.CustomPinStyle customStyle = pin.getCustomStyle();
        if (customStyle != null) {
            String tintColor = customStyle.getTintColor();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseColor = styleParser.parseColor(context, tintColor);
            if (parseColor != null) {
                int intValue = parseColor.intValue();
                this.pinImageBackground.setTint(intValue);
                this.pinDotDrawable.setColor(intValue);
            }
            String borderColor = customStyle.getBorderColor();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context2, borderColor);
            if (parseColor2 != null) {
                int intValue2 = parseColor2.intValue();
                this.additionalContentBackground.getPaint().setColor(intValue2);
                ElevationImageView pinPointer = this.binding.pinPointer;
                Intrinsics.checkNotNullExpressionValue(pinPointer, "pinPointer");
                ThemeExtKt.tint(pinPointer, Integer.valueOf(intValue2));
                this.pinDotDrawable.setStroke(PIN_DOT_STROKE, intValue2);
            }
            String textColor = customStyle.getTextColor();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser.parseColor(context3, textColor);
            if (parseColor3 != null) {
                this.binding.additionalContentText.setTextColor(parseColor3.intValue());
            }
            String iconTintColor = customStyle.getIconTintColor();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer parseColor4 = styleParser.parseColor(context4, iconTintColor);
            if (parseColor4 != null) {
                int intValue3 = parseColor4.intValue();
                AppCompatImageView additionalContentIcon = this.binding.additionalContentIcon;
                Intrinsics.checkNotNullExpressionValue(additionalContentIcon, "additionalContentIcon");
                ThemeExtKt.tint(additionalContentIcon, Integer.valueOf(intValue3));
            }
        }
        ClusterizationPin.AdditionalPinContent additionalContent = pin.getAdditionalContent();
        if (additionalContent != null) {
            this.binding.additionalContentText.setText(additionalContent.getText());
            String icon = additionalContent.getIcon();
            if (icon != null) {
                AppCompatImageView appCompatImageView = this.binding.additionalContentIcon;
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                appCompatImageView.setImageDrawable(ContextExtKt.loadIconByString(context5, icon));
            }
        }
        if (imageBitmap != null) {
            this.binding.pinImage.setImageBitmap(imageBitmap);
        }
        View rootView = getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return UtilsKt.getBitmap(rootView);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    @NotNull
    public PointF getAnchor() {
        return ANCHOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandedPinIconView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ExpandedPinIconContainerBinding inflate = ExpandedPinIconContainerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        GradientDrawable b11 = D.b(1);
        b11.setColor(context.getColor(R$color.bg_action_primary));
        this.pinImageBackground = b11;
        GradientDrawable b12 = D.b(1);
        b12.setColor(context.getColor(R$color.bg_action_primary));
        b12.setStroke(PIN_DOT_STROKE, context.getColor(R$color.bg_light_key));
        int i13 = PIN_DOT_SIZE;
        b12.setSize(i13, i13);
        this.pinDotDrawable = b12;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(context.getColor(R$color.bg_light_key));
        paintDrawable.getPaint().setShadowLayer(SHADOW_RADIUS, 0.0f, SHADOW_DY, -3355444);
        paintDrawable.setCornerRadius(CONTAINER_CORNER_RADIUS);
        this.additionalContentBackground = paintDrawable;
        inflate.pinImage.setBackground(b11);
        inflate.pinDot.setImageDrawable(b12);
        ElevationImageView elevationImageView = inflate.pinPointer;
        float f7 = SHADOW_ELEVATION;
        elevationImageView.setElevation(f7);
        inflate.pinDot.setElevation(f7);
        inflate.additionalContentContainer.setBackground(paintDrawable);
    }
}
