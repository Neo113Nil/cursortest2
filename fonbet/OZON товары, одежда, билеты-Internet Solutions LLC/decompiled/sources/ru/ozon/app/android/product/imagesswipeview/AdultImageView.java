package ru.ozon.app.android.product.imagesswipeview;

import E0.C2942q;
import Kk.C3532b;
import Pk0.b;
import Pk0.f;
import Sc.o;
import T7.E;
import WZ.t;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.utils.ImageLoadExtKt;
import ru.ozon.app.android.product.utils.PinchToZoomTouchListener;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010+\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b,\u0010\u0011R8\u00101\u001a\u0018\u0012\f\u0012\n\u0018\u00010/j\u0004\u0018\u0001`0\u0012\u0004\u0012\u00020\r\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010J\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010?¨\u0006L"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "", "setImageParams", "(Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "bindAdultOverlays", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "bindPinchToZoom", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "paranja", "bindParanjaWithBackground", "(Lru/ozon/app/android/product/imagesswipeview/Paranja;)V", "color", "Landroid/graphics/drawable/GradientDrawable;", "buildGradientDrawable", "(I)Landroid/graphics/drawable/GradientDrawable;", "bindBg", "(I)V", "", "enabled", "bindParanja", "(Z)V", "bind", "", "radius", "setRadiusMultiplier$product_prodGoogleAllVendorsRelease", "(F)V", "setRadiusMultiplier", "Landroid/graphics/Bitmap;", "drawable", "setImage$product_prodGoogleAllVendorsRelease", "(Landroid/graphics/Bitmap;)V", "setImage", "bindWithBlur$product_prodGoogleAllVendorsRelease", "bindWithBlur", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onPinchToZoomStarted", "Lkotlin/jvm/functions/Function1;", "getOnPinchToZoomStarted", "()Lkotlin/jvm/functions/Function1;", "setOnPinchToZoomStarted", "(Lkotlin/jvm/functions/Function1;)V", "imageIv", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "getImageIv", "()Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "Landroid/view/View;", "paranjaView", "Landroid/view/View;", "paranjaBackground", "Landroid/graphics/drawable/GradientDrawable;", "overlayView", "Landroid/widget/LinearLayout;", "adultWarningLl", "Landroid/widget/LinearLayout;", "viewRadius", "F", "overlayColor", "I", "whiteColor", "transparentColor", "viewBackground", "Image", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class AdultImageView extends FrameLayout {
    private LinearLayout adultWarningLl;

    @NotNull
    private final AspectRatioImageView imageIv;
    private Function1<? super t, Unit> onPinchToZoomStarted;
    private final int overlayColor;
    private View overlayView;
    private GradientDrawable paranjaBackground;
    private View paranjaView;
    private final int transparentColor;

    @NotNull
    private final GradientDrawable viewBackground;
    private final float viewRadius;
    private final int whiteColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paranja.values().length];
            try {
                iArr[Paranja.PARANJA_BOTH_THEMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paranja.PARANJA_DARK_THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paranja.PARANJA_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Paranja.PARANJA_DISABLED_WHITE_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdultImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindAdultOverlays(Image image) {
        if (image.getShouldBlur() && this.overlayView == null) {
            AdultImageViewBuilder adultImageViewBuilder = AdultImageViewBuilder.INSTANCE;
            this.overlayView = adultImageViewBuilder.addOverlayView(this, image.getIsDarkAdultMessageRequired());
            this.adultWarningLl = adultImageViewBuilder.addAdultWarningLl(this, image.getIsDarkAdultMessageRequired());
        }
        LinearLayout linearLayout = this.adultWarningLl;
        if (linearLayout != null) {
            ViewExtKt.showOrGone(linearLayout, Boolean.valueOf(image.getShouldBlur()));
        }
        View view = this.overlayView;
        if (view != null) {
            ViewExtKt.showOrGone(view, Boolean.valueOf(image.getShouldBlur()));
        }
    }

    private final void bindBg(int color) {
        ColorStateList color2 = this.viewBackground.getColor();
        Integer valueOf = color2 != null ? Integer.valueOf(color2.getDefaultColor()) : null;
        if (valueOf != null && color == valueOf.intValue()) {
            return;
        }
        this.viewBackground.setColor(color);
    }

    private final void bindParanja(boolean enabled) {
        if (!enabled) {
            View view = this.paranjaView;
            if (view != null) {
                ViewExtKt.gone(view);
                return;
            }
            return;
        }
        if (this.paranjaView == null) {
            this.paranjaView = AdultImageViewBuilder.INSTANCE.addParanja(this);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GradientDrawable buildGradientDrawable = buildGradientDrawable(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
            this.paranjaBackground = buildGradientDrawable;
            View view2 = this.paranjaView;
            if (view2 != null) {
                view2.setBackground(buildGradientDrawable);
            }
        }
        View view3 = this.paranjaView;
        if (view3 != null) {
            ViewExtKt.show(view3);
        }
    }

    private final void bindParanjaWithBackground(Paranja paranja) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[paranja.ordinal()];
        if (i11 == 1) {
            bindParanja(true);
            bindBg(this.whiteColor);
            return;
        }
        if (i11 == 2) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bindParanja(ThemeExtKt.isDarkThemeActive(context));
            bindBg(this.whiteColor);
            return;
        }
        if (i11 == 3) {
            bindParanja(false);
            bindBg(this.transparentColor);
        } else {
            if (i11 != 4) {
                throw new o();
            }
            bindParanja(false);
            bindBg(this.whiteColor);
        }
    }

    private final void bindPinchToZoom(Image image) {
        Window window;
        if (image.getShouldBlur() || !image.getIsPinchToZoomEnabled()) {
            setOnTouchListener(null);
            return;
        }
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        KeyEvent.Callback decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        setOnTouchListener(new PinchToZoomTouchListener(viewGroup, new AdultImageView$bindPinchToZoom$1(this, image)));
    }

    private final GradientDrawable buildGradientDrawable(int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.viewRadius);
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    private final void setImageParams(AspectRatioImageView aspectRatioImageView, Image image) {
        int i11;
        Image.HeightMode heightMode = image.getHeightMode();
        Image.HeightMode.Relative relative = heightMode instanceof Image.HeightMode.Relative ? (Image.HeightMode.Relative) heightMode : null;
        aspectRatioImageView.setRatio(relative != null ? Float.valueOf(relative.getRatio()) : null);
        aspectRatioImageView.setAlpha(image.getAlpha());
        aspectRatioImageView.setScaleType(image.getScaleType());
        ViewGroup.LayoutParams layoutParams = aspectRatioImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Image.HeightMode heightMode2 = image.getHeightMode();
        if (heightMode2 instanceof Image.HeightMode.Fixed) {
            i11 = ResourceExtKt.toPx(((Image.HeightMode.Fixed) heightMode2).getHeight());
        } else if (heightMode2 instanceof Image.HeightMode.Relative) {
            i11 = -2;
        } else {
            if (!(heightMode2 instanceof Image.HeightMode.Unspecified)) {
                throw new o();
            }
            i11 = -1;
        }
        layoutParams2.height = i11;
        aspectRatioImageView.setLayoutParams(layoutParams2);
    }

    public final void bind(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        setImageParams(this.imageIv, image);
        ImageViewExtKt.setOverlayColor(this.imageIv, image.getIsGrey(), this.overlayColor);
        bindParanjaWithBackground(image.getParanja());
        bindAdultOverlays(image);
        bindPinchToZoom(image);
        ImageLoadExtKt.loadImageWithCrossFadeSafely$default(this.imageIv, image.getUrl(), Boolean.valueOf(image.getShouldBlur()), null, new AdultImageView$bind$1(this, image), 4, null);
    }

    public void bindWithBlur$product_prodGoogleAllVendorsRelease(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageViewExtKt.loadWithBlur$default(this.imageIv, image.getUrl(), null, null, null, 14, null);
    }

    @NotNull
    protected final AspectRatioImageView getImageIv() {
        return this.imageIv;
    }

    public final Function1<t, Unit> getOnPinchToZoomStarted() {
        return this.onPinchToZoomStarted;
    }

    public final void setImage$product_prodGoogleAllVendorsRelease(Bitmap drawable) {
        this.imageIv.setImageBitmap(drawable);
    }

    public final void setOnPinchToZoomStarted(Function1<? super t, Unit> function1) {
        this.onPinchToZoomStarted = function1;
    }

    public final void setRadiusMultiplier$product_prodGoogleAllVendorsRelease(float radius) {
        GradientDrawable gradientDrawable = this.viewBackground;
        gradientDrawable.setCornerRadius(gradientDrawable.getCornerRadius() * radius);
        GradientDrawable gradientDrawable2 = this.paranjaBackground;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadius(gradientDrawable2.getCornerRadius() * radius);
        }
    }

    public /* synthetic */ AdultImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageIv = AdultImageViewBuilder.INSTANCE.addImage(this);
        this.viewRadius = ResourceExtKt.toPxF(12);
        this.overlayColor = ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja);
        int color = context.getColor(R$color.bg_light_key);
        this.whiteColor = color;
        GradientDrawable buildGradientDrawable = buildGradientDrawable(color);
        this.viewBackground = buildGradientDrawable;
        setBackground(buildGradientDrawable);
        setClipToOutline(true);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001:\u0001:By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0092\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b\t\u0010,R\"\u0010\n\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010,\"\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b\u0011\u0010,R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b\u0015\u0010,¨\u0006;"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", ImagesContract.URL, "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "heightMode", "", "alpha", "", "isGrey", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "blurPlaceholderImage", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "paranja", "Landroid/widget/ImageView$ScaleType;", "scaleType", "isPinchToZoomEnabled", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "pinchToZoomTokenizedEvent", "isDarkAdultMessageRequired", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;FZZZLjava/lang/String;Lru/ozon/app/android/product/imagesswipeview/Paranja;Landroid/widget/ImageView$ScaleType;ZLWZ/t;Z)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;FZZZLjava/lang/String;Lru/ozon/app/android/product/imagesswipeview/Paranja;Landroid/widget/ImageView$ScaleType;ZLWZ/t;Z)Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "getHeightMode", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "F", "getAlpha", "()F", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "getBlurPlaceholderImage", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "getParanja", "()Lru/ozon/app/android/product/imagesswipeview/Paranja;", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "LWZ/t;", "getPinchToZoomTokenizedEvent", "()LWZ/t;", "HeightMode", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Image implements AdultVO {
        private final float alpha;
        private final String blurPlaceholderImage;

        @NotNull
        private final HeightMode heightMode;
        private final boolean isAdult;
        private final boolean isDarkAdultMessageRequired;
        private final boolean isGrey;
        private final boolean isPinchToZoomEnabled;

        @NotNull
        private final Paranja paranja;
        private final t pinchToZoomTokenizedEvent;

        @NotNull
        private final ImageView.ScaleType scaleType;
        private boolean shouldBlur;

        @NotNull
        private final String url;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "", "<init>", "()V", "Unspecified", "Fixed", "Relative", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Fixed;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Relative;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Unspecified;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class HeightMode {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Fixed;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "height", "I", "getHeight", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Fixed extends HeightMode {
                private final int height;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Fixed) && this.height == ((Fixed) other).height;
                }

                public final int getHeight() {
                    return this.height;
                }

                public int hashCode() {
                    return Integer.hashCode(this.height);
                }

                @NotNull
                public String toString() {
                    return E.a(this.height, "Fixed(height=", ")");
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Relative;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "", "ratio", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRatio", "()F", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Relative extends HeightMode {

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion(null);
                private final float ratio;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Relative$Companion;", "", "<init>", "()V", "fromString", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Relative;", "ratio", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    @NotNull
                    public final Relative fromString(@NotNull String ratio) {
                        Intrinsics.checkNotNullParameter(ratio, "ratio");
                        List m11 = h.m(ratio, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
                        Float v02 = h.v0((String) m11.get(0));
                        float floatValue = v02 != null ? v02.floatValue() : 1.0f;
                        Float v03 = h.v0((String) m11.get(1));
                        return new Relative((v03 != null ? v03.floatValue() : 1.0f) / floatValue);
                    }

                    private Companion() {
                    }
                }

                public Relative(float f7) {
                    super(null);
                    this.ratio = f7;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Relative) && Float.compare(this.ratio, ((Relative) other).ratio) == 0;
                }

                public final float getRatio() {
                    return this.ratio;
                }

                public int hashCode() {
                    return Float.hashCode(this.ratio);
                }

                @NotNull
                public String toString() {
                    return C2942q.b(this.ratio, "Relative(ratio=", ")");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode$Unspecified;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "<init>", "()V", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Unspecified extends HeightMode {

                @NotNull
                public static final Unspecified INSTANCE = new Unspecified();

                private Unspecified() {
                    super(null);
                }
            }

            public /* synthetic */ HeightMode(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private HeightMode() {
            }
        }

        public Image(@NotNull String url, @NotNull HeightMode heightMode, float f7, boolean z11, boolean z12, boolean z13, String str, @NotNull Paranja paranja, @NotNull ImageView.ScaleType scaleType, boolean z14, t tVar, boolean z15) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(heightMode, "heightMode");
            Intrinsics.checkNotNullParameter(paranja, "paranja");
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.url = url;
            this.heightMode = heightMode;
            this.alpha = f7;
            this.isGrey = z11;
            this.shouldBlur = z12;
            this.isAdult = z13;
            this.blurPlaceholderImage = str;
            this.paranja = paranja;
            this.scaleType = scaleType;
            this.isPinchToZoomEnabled = z14;
            this.pinchToZoomTokenizedEvent = tVar;
            this.isDarkAdultMessageRequired = z15;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, HeightMode heightMode, float f7, boolean z11, boolean z12, boolean z13, String str2, Paranja paranja, ImageView.ScaleType scaleType, boolean z14, t tVar, boolean z15, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.url;
            }
            if ((i11 & 2) != 0) {
                heightMode = image.heightMode;
            }
            if ((i11 & 4) != 0) {
                f7 = image.alpha;
            }
            if ((i11 & 8) != 0) {
                z11 = image.isGrey;
            }
            if ((i11 & 16) != 0) {
                z12 = image.shouldBlur;
            }
            if ((i11 & 32) != 0) {
                z13 = image.isAdult;
            }
            if ((i11 & 64) != 0) {
                str2 = image.blurPlaceholderImage;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                paranja = image.paranja;
            }
            if ((i11 & 256) != 0) {
                scaleType = image.scaleType;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                z14 = image.isPinchToZoomEnabled;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                tVar = image.pinchToZoomTokenizedEvent;
            }
            if ((i11 & 2048) != 0) {
                z15 = image.isDarkAdultMessageRequired;
            }
            t tVar2 = tVar;
            boolean z16 = z15;
            ImageView.ScaleType scaleType2 = scaleType;
            boolean z17 = z14;
            String str3 = str2;
            Paranja paranja2 = paranja;
            boolean z18 = z12;
            boolean z19 = z13;
            return image.copy(str, heightMode, f7, z11, z18, z19, str3, paranja2, scaleType2, z17, tVar2, z16);
        }

        @NotNull
        public final Image copy(@NotNull String url, @NotNull HeightMode heightMode, float alpha, boolean isGrey, boolean shouldBlur, boolean isAdult, String blurPlaceholderImage, @NotNull Paranja paranja, @NotNull ImageView.ScaleType scaleType, boolean isPinchToZoomEnabled, t pinchToZoomTokenizedEvent, boolean isDarkAdultMessageRequired) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(heightMode, "heightMode");
            Intrinsics.checkNotNullParameter(paranja, "paranja");
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            return new Image(url, heightMode, alpha, isGrey, shouldBlur, isAdult, blurPlaceholderImage, paranja, scaleType, isPinchToZoomEnabled, pinchToZoomTokenizedEvent, isDarkAdultMessageRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.heightMode, image.heightMode) && Float.compare(this.alpha, image.alpha) == 0 && this.isGrey == image.isGrey && this.shouldBlur == image.shouldBlur && this.isAdult == image.isAdult && Intrinsics.d(this.blurPlaceholderImage, image.blurPlaceholderImage) && this.paranja == image.paranja && this.scaleType == image.scaleType && this.isPinchToZoomEnabled == image.isPinchToZoomEnabled && Intrinsics.d(this.pinchToZoomTokenizedEvent, image.pinchToZoomTokenizedEvent) && this.isDarkAdultMessageRequired == image.isDarkAdultMessageRequired;
        }

        public final float getAlpha() {
            return this.alpha;
        }

        public final String getBlurPlaceholderImage() {
            return this.blurPlaceholderImage;
        }

        @NotNull
        public final HeightMode getHeightMode() {
            return this.heightMode;
        }

        @NotNull
        public final Paranja getParanja() {
            return this.paranja;
        }

        public final t getPinchToZoomTokenizedEvent() {
            return this.pinchToZoomTokenizedEvent;
        }

        @NotNull
        public final ImageView.ScaleType getScaleType() {
            return this.scaleType;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(C3532b.a(b.a(this.alpha, (this.heightMode.hashCode() + (this.url.hashCode() * 31)) * 31, 31), 31, this.isGrey), 31, this.shouldBlur), 31, this.isAdult);
            String str = this.blurPlaceholderImage;
            int a12 = C3532b.a((this.scaleType.hashCode() + ((this.paranja.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.isPinchToZoomEnabled);
            t tVar = this.pinchToZoomTokenizedEvent;
            return Boolean.hashCode(this.isDarkAdultMessageRequired) + ((a12 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: isDarkAdultMessageRequired, reason: from getter */
        public final boolean getIsDarkAdultMessageRequired() {
            return this.isDarkAdultMessageRequired;
        }

        /* renamed from: isGrey, reason: from getter */
        public final boolean getIsGrey() {
            return this.isGrey;
        }

        /* renamed from: isPinchToZoomEnabled, reason: from getter */
        public final boolean getIsPinchToZoomEnabled() {
            return this.isPinchToZoomEnabled;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            String str = this.url;
            HeightMode heightMode = this.heightMode;
            float f7 = this.alpha;
            boolean z11 = this.isGrey;
            boolean z12 = this.shouldBlur;
            boolean z13 = this.isAdult;
            String str2 = this.blurPlaceholderImage;
            Paranja paranja = this.paranja;
            ImageView.ScaleType scaleType = this.scaleType;
            boolean z14 = this.isPinchToZoomEnabled;
            t tVar = this.pinchToZoomTokenizedEvent;
            boolean z15 = this.isDarkAdultMessageRequired;
            StringBuilder sb2 = new StringBuilder("Image(url=");
            sb2.append(str);
            sb2.append(", heightMode=");
            sb2.append(heightMode);
            sb2.append(", alpha=");
            sb2.append(f7);
            sb2.append(", isGrey=");
            sb2.append(z11);
            sb2.append(", shouldBlur=");
            f.c(", isAdult=", ", blurPlaceholderImage=", sb2, z12, z13);
            sb2.append(str2);
            sb2.append(", paranja=");
            sb2.append(paranja);
            sb2.append(", scaleType=");
            sb2.append(scaleType);
            sb2.append(", isPinchToZoomEnabled=");
            sb2.append(z14);
            sb2.append(", pinchToZoomTokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", isDarkAdultMessageRequired=");
            sb2.append(z15);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ Image(String str, HeightMode heightMode, float f7, boolean z11, boolean z12, boolean z13, String str2, Paranja paranja, ImageView.ScaleType scaleType, boolean z14, t tVar, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, heightMode, f7, z11, z12, (i11 & 32) != 0 ? z12 : z13, str2, paranja, scaleType, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : tVar, (i11 & 2048) != 0 ? true : z15);
        }
    }
}
