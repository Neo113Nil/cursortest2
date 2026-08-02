package ru.ozon.app.android.cscore.adultimage;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.R$styleable;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;
import y7.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00100\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u000f¨\u00062"}, d2 = {"Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateCornerRadius", "()V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "createEyeIconAtom", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lcom/google/android/material/imageview/ShapeableImageView;", "setParanja", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", "", ImagesContract.URL, "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isOpacity", "bind", "(Ljava/lang/String;ZLjava/lang/Boolean;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "cornerRadius", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "iconName", "Ljava/lang/String;", "getIconName", "()Ljava/lang/String;", "setIconName", "(Ljava/lang/String;)V", "rootImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lru/ozon/uni/android/atom/icon/IconView;", "eyeIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "eyeIconAtom$delegate", "LSc/j;", "getEyeIconAtom", "eyeIconAtom", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryAdultImageView extends FrameLayout {
    private float cornerRadius;

    /* renamed from: eyeIconAtom$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j eyeIconAtom;

    @NotNull
    private final IconView eyeIconView;

    @NotNull
    private String iconName;

    @NotNull
    private final ShapeableImageView rootImageView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cscore/adultimage/DeliveryAdultImageView$Companion;", "", "<init>", "()V", "DEFAULT_EYE_ICON_NAME", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeliveryAdultImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bind$default(DeliveryAdultImageView deliveryAdultImageView, String str, boolean z11, Boolean bool, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        deliveryAdultImageView.bind(str, z11, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconDTO createEyeIconAtom() {
        return new IconDTO(IconDTO.IconSize.SIZE_300, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO(this.iconName, UniColors.GRAPHIC_KEY_INVERTED.getToken()), null, UniColors.GRAPHIC_TERTIARY.getToken(), null, null, null, null, null, Boolean.TRUE, null, null, null, 61354, null);
    }

    private final IconDTO getEyeIconAtom() {
        return (IconDTO) this.eyeIconAtom.getValue();
    }

    private final void setParanja(ShapeableImageView shapeableImageView) {
        Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shapeableImageView.setForeground(new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja)));
    }

    private final void updateCornerRadius() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView$updateCornerRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), DeliveryAdultImageView.this.getCornerRadius());
            }
        });
        k.a aVar = new k.a();
        aVar.e(this.cornerRadius);
        k a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        this.rootImageView.setShapeAppearanceModel(a11);
    }

    public final void bind(String url, boolean isAdult, Boolean isOpacity) {
        if (isAdult) {
            this.rootImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageViewExtKt.loadWithBlur$default(this.rootImageView, url, null, null, null, 14, null);
            IconHolderKt.bindOrGone$default(this.eyeIconView, getEyeIconAtom(), null, 2, null);
        } else {
            this.rootImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageViewExtKt.loadWithPlaceholder(this.rootImageView, url);
            setParanja(this.rootImageView);
            ViewExtKt.gone(this.eyeIconView);
        }
        this.rootImageView.setAlpha(Intrinsics.d(isOpacity, Boolean.TRUE) ? 0.5f : 1.0f);
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f7) {
        this.cornerRadius = f7;
        updateCornerRadius();
    }

    public /* synthetic */ DeliveryAdultImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAdultImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        shapeableImageView.setBackgroundColor(a.getColor(context, UniColors.WHITE.getResId()));
        this.rootImageView = shapeableImageView;
        IconView iconView = new IconView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        iconView.setLayoutParams(layoutParams);
        this.eyeIconView = iconView;
        this.eyeIconAtom = Sc.k.b(new DeliveryAdultImageView$eyeIconAtom$2(this));
        setClipToOutline(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DeliveryAdultImageView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            setCornerRadius(obtainStyledAttributes.getDimension(R$styleable.DeliveryAdultImageView_cornerRoundRadius, 0.0f));
            String string = obtainStyledAttributes.getString(R$styleable.DeliveryAdultImageView_iconName);
            this.iconName = string == null ? "ic_s_eye_closed" : string;
            obtainStyledAttributes.recycle();
            addView(shapeableImageView);
            addView(iconView);
            Integer parseColor = StyleParser.INSTANCE.parseColor(context, UniColors.BG_SECONDARY.getToken());
            if (parseColor != null) {
                setBackgroundColor(parseColor.intValue());
            }
            updateCornerRadius();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
