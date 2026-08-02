package ru.ozon.app.android.ugc.core.widgets.common;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.res.g;
import androidx.core.graphics.drawable.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u0000 ?2\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\b\u0001\u0010\u001e\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)R\u001b\u00105\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010.R\u0014\u00106\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R$\u0010>\u001a\u0002082\u0006\u00109\u001a\u0002088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "", "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "", "clipToOutline", "setClipToOutline", "(Z)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "media", "withBlur", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "setParandjaForDarkTheme", "()V", "color", "setPictureBackgroundTint", "(I)V", "pictureIvCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "Landroid/widget/ImageView;", "pictureIv", "Landroid/widget/ImageView;", "statusIv$delegate", "LSc/j;", "getStatusIv", "()Landroid/widget/ImageView;", "statusIv", "Landroid/widget/FrameLayout$LayoutParams;", "statusIvLayoutParams$delegate", "getStatusIvLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "statusIvLayoutParams", "unavailableMediaIv$delegate", "getUnavailableMediaIv", "unavailableMediaIv", "unavailableMediaIvLayoutParams$delegate", "getUnavailableMediaIvLayoutParams", "unavailableMediaIvLayoutParams", "isTablet", "()Z", "Landroid/widget/ImageView$ScaleType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class StatusableMediaPreviewView extends FrameLayout {
    private static final int statusIvPadding;
    private static final int statusIvSize;
    private static final int statusIvTopEndMargin;
    private static final int unavailableMediaIvTopStartMargin;

    @NotNull
    private final ImageView pictureIv;

    @NotNull
    private CornerRadius pictureIvCornerRadius;

    /* renamed from: statusIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j statusIv;

    /* renamed from: statusIvLayoutParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j statusIvLayoutParams;

    /* renamed from: unavailableMediaIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j unavailableMediaIv;

    /* renamed from: unavailableMediaIvLayoutParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j unavailableMediaIvLayoutParams;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/common/StatusableMediaPreviewView$Companion;", "", "<init>", "()V", "BLUR_RADIUS", "", "BLUR_SAMPLING", "VIDEO_PREVIEW_LOCATOR", "", "IMAGE_PREVIEW_LOCATOR", "statusIvSize", "getStatusIvSize", "()I", "statusIvTopEndMargin", "getStatusIvTopEndMargin", "statusIvPadding", "getStatusIvPadding", "unavailableMediaIvTopStartMargin", "getUnavailableMediaIvTopStartMargin", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getStatusIvPadding() {
            return StatusableMediaPreviewView.statusIvPadding;
        }

        public final int getStatusIvSize() {
            return StatusableMediaPreviewView.statusIvSize;
        }

        public final int getStatusIvTopEndMargin() {
            return StatusableMediaPreviewView.statusIvTopEndMargin;
        }

        public final int getUnavailableMediaIvTopStartMargin() {
            return StatusableMediaPreviewView.unavailableMediaIvTopStartMargin;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        statusIvSize = dimens.getDP_24();
        statusIvTopEndMargin = dimens.getDP_4();
        statusIvPadding = dimens.getDP_5();
        unavailableMediaIvTopStartMargin = dimens.getDP_6();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusableMediaPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bind$default(StatusableMediaPreviewView statusableMediaPreviewView, MediaVO mediaVO, Boolean bool, CornerRadius cornerRadius, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = null;
        }
        statusableMediaPreviewView.bind(mediaVO, bool, cornerRadius);
    }

    private final ImageView getStatusIv() {
        return (ImageView) this.statusIv.getValue();
    }

    private final FrameLayout.LayoutParams getStatusIvLayoutParams() {
        return (FrameLayout.LayoutParams) this.statusIvLayoutParams.getValue();
    }

    private final ImageView getUnavailableMediaIv() {
        return (ImageView) this.unavailableMediaIv.getValue();
    }

    private final FrameLayout.LayoutParams getUnavailableMediaIvLayoutParams() {
        return (FrameLayout.LayoutParams) this.unavailableMediaIvLayoutParams.getValue();
    }

    private final boolean isTablet() {
        return getContext().getResources().getBoolean(R$bool.isTablet);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, @NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        super.addView(child, layoutParams);
    }

    public final void bind(@NotNull MediaVO media, Boolean withBlur, CornerRadius mediaPreviewCornerRadius) {
        Drawable d11;
        Intrinsics.checkNotNullParameter(media, "media");
        ImageSize imageSize = null;
        if (mediaPreviewCornerRadius != null && mediaPreviewCornerRadius != this.pictureIvCornerRadius) {
            Drawable background = this.pictureIv.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(mediaPreviewCornerRadius.getPx()));
            }
            this.pictureIvCornerRadius = mediaPreviewCornerRadius;
        }
        Integer size = media.getSize();
        if (size != null) {
            int intValue = size.intValue();
            int width = isTablet() ? this.pictureIv.getWidth() : intValue;
            if (isTablet()) {
                intValue = this.pictureIv.getHeight();
            }
            imageSize = new ImageSize(width, intValue);
        }
        ImageSize imageSize2 = imageSize;
        MediaVO.State state = media.getState();
        if (state instanceof MediaVO.State.Ready) {
            if (Intrinsics.d(withBlur, Boolean.TRUE)) {
                ImageViewExtKt.load$default(this.pictureIv, ((MediaVO.State.Ready) state).getUrl(), C7714v.a0(new ImageTransformation.Blur(15, 1)), null, null, imageSize2, false, null, 108, null);
            } else {
                ImageViewExtKt.load$default(this.pictureIv, ((MediaVO.State.Ready) state).getUrl(), null, null, null, imageSize2, false, null, 110, null);
            }
        } else {
            if (!Intrinsics.d(state, MediaVO.State.Processing.INSTANCE)) {
                throw new o();
            }
            ImageViewExtKt.load$default(this.pictureIv, null, null, null, null, null, false, null, 126, null);
            addView(getUnavailableMediaIv(), getUnavailableMediaIvLayoutParams());
        }
        this.pictureIv.setContentDescription(media.getType() instanceof MediaVO.MediaType.VIDEO ? "thumbnailVideoPv" : "thumbnailImagePv");
        MediaVO.SupportIcon supportIcon = media.getSupportIcon();
        if (supportIcon == null || (d11 = g.d(getContext().getResources(), supportIcon.getIconId(), getContext().getTheme())) == null) {
            return;
        }
        addView(getStatusIv(), getStatusIvLayoutParams());
        a.i(d11, supportIcon.getTintColor());
        getStatusIv().setImageDrawable(d11);
    }

    @Override // android.view.View
    public void setClipToOutline(boolean clipToOutline) {
        this.pictureIv.setClipToOutline(clipToOutline);
    }

    public final void setParandjaForDarkTheme() {
        ThemeExtKt.setParandjaForDarkTheme(this.pictureIv);
    }

    protected final void setPictureBackgroundTint(int color) {
        ViewExtKt.setBackgroundTint(this.pictureIv, color);
    }

    public final void setScaleType(@NotNull ImageView.ScaleType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pictureIv.setScaleType(value);
    }

    public /* synthetic */ StatusableMediaPreviewView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusableMediaPreviewView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pictureIvCornerRadius = CornerRadius.RADIUS_300;
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.BG_PRIMARY;
        gradientDrawable.setColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(this.pictureIvCornerRadius.getPx()));
        imageView.setBackground(gradientDrawable);
        this.pictureIv = imageView;
        this.statusIv = DelegatesKt.lazyUnsafe(new StatusableMediaPreviewView$statusIv$2(context));
        this.statusIvLayoutParams = DelegatesKt.lazyUnsafe(StatusableMediaPreviewView$statusIvLayoutParams$2.INSTANCE);
        this.unavailableMediaIv = DelegatesKt.lazyUnsafe(new StatusableMediaPreviewView$unavailableMediaIv$2(context));
        this.unavailableMediaIvLayoutParams = DelegatesKt.lazyUnsafe(StatusableMediaPreviewView$unavailableMediaIvLayoutParams$2.INSTANCE);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }
}
