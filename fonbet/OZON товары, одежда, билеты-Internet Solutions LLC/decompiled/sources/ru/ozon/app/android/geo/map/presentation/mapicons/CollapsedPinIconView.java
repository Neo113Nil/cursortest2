package ru.ozon.app.android.geo.map.presentation.mapicons;

import B3.D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.CollapsedPinIconContainerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/CollapsedPinIconView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/geo/map/presentation/mapicons/PinIcon;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/geo/databinding/CollapsedPinIconContainerBinding;", "pinFormBackground", "Landroid/graphics/drawable/ShapeDrawable;", "pinImageBackground", "Landroid/graphics/drawable/GradientDrawable;", "bind", "", "mapObject", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "onBitmapReadyCallback", "Lru/ozon/app/android/geo/map/presentation/mapicons/OnBitmapReadyCallback;", "getAnchor", "Landroid/graphics/PointF;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CollapsedPinIconView extends FrameLayout implements PinIcon {

    @NotNull
    private final CollapsedPinIconContainerBinding binding;

    @NotNull
    private final ShapeDrawable pinFormBackground;

    @NotNull
    private final GradientDrawable pinImageBackground;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float SHADOW_DY = UiExtKt.toPxF(2);
    private static final float SHADOW_RADIUS = UiExtKt.toPxF(2);

    @NotNull
    private static final PointF ANCHOR = new PointF(0.5f, 0.5f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/CollapsedPinIconView$Companion;", "", "<init>", "()V", "", "SHADOW_DX", "F", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CollapsedPinIconView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    public void bind(@NotNull AddressEditMapVO.MapObject mapObject, final OnBitmapReadyCallback onBitmapReadyCallback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        final CollapsedPinIconContainerBinding collapsedPinIconContainerBinding = this.binding;
        String tintColor = mapObject.getTintColor();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(context, tintColor);
        if (parseColor != null) {
            this.pinImageBackground.setTint(parseColor.intValue());
        }
        String borderColor = mapObject.getBorderColor();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, borderColor);
        if (parseColor2 != null) {
            this.pinFormBackground.getPaint().setColor(parseColor2.intValue());
        }
        String pinsCount = mapObject.getPinsCount();
        if (pinsCount != null) {
            collapsedPinIconContainerBinding.pinsCount.setText(pinsCount);
            String pinsCountColor = mapObject.getPinsCountColor();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser.parseColor(context3, pinsCountColor);
            if (parseColor3 != null) {
                collapsedPinIconContainerBinding.pinsCount.setTextColor(parseColor3.intValue());
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
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer parseColor4 = styleParser.parseColor(context4, imageTintColor);
        if (parseColor4 != null) {
            int intValue = parseColor4.intValue();
            AppCompatImageView pinImage = collapsedPinIconContainerBinding.pinImage;
            Intrinsics.checkNotNullExpressionValue(pinImage, "pinImage");
            ThemeExtKt.tint(pinImage, Integer.valueOf(intValue));
        }
        AppCompatImageView pinImage2 = collapsedPinIconContainerBinding.pinImage;
        Intrinsics.checkNotNullExpressionValue(pinImage2, "pinImage");
        ImageViewExtKt.loadAsBitmap$default(pinImage2, mapObject.getImage(), null, new PikazonLoaderCallback<Bitmap>() { // from class: ru.ozon.app.android.geo.map.presentation.mapicons.CollapsedPinIconView$bind$1$4$2
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                OnBitmapReadyCallback onBitmapReadyCallback2 = onBitmapReadyCallback;
                if (onBitmapReadyCallback2 != null) {
                    onBitmapReadyCallback2.onError();
                }
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Bitmap resource) {
                CollapsedPinIconContainerBinding.this.pinImage.setImageBitmap(resource);
                OnBitmapReadyCallback onBitmapReadyCallback2 = onBitmapReadyCallback;
                if (onBitmapReadyCallback2 != null) {
                    View rootView2 = this.getRootView();
                    Intrinsics.checkNotNullExpressionValue(rootView2, "getRootView(...)");
                    onBitmapReadyCallback2.onBitmapReady(UtilsKt.getBitmap(rootView2));
                }
            }
        }, null, 10, null);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    @NotNull
    public PointF getAnchor() {
        return ANCHOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsedPinIconView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        CollapsedPinIconContainerBinding inflate = CollapsedPinIconContainerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(context.getColor(R$color.bg_light_key));
        shapeDrawable.getPaint().setShadowLayer(SHADOW_DY, 0.0f, SHADOW_RADIUS, -3355444);
        this.pinFormBackground = shapeDrawable;
        GradientDrawable b11 = D.b(1);
        b11.setColor(context.getColor(R$color.bg_action_primary));
        this.pinImageBackground = b11;
        inflate.pinForm.setBackground(shapeDrawable);
        inflate.pinImage.setBackground(b11);
    }
}
