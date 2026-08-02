package ru.ozon.app.android.storefront.widgets.videoScroll.presentation.rv;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020 J$\u0010&\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170)J\b\u0010+\u001a\u00020\u0010H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "containerWidth", "imageHeight", "videoImageCornerSize", "", "dp8", "videoImage", "Lcom/google/android/material/imageview/ShapeableImageView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "advBadge", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "bindImage", "image", "", "bindBadge", "timeBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "bindTitle", "text", "bindOrGoneAdvBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "initVideoImage", "initBadge", "initTitle", "initAdvBadge", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoItemView extends FrameLayout {
    private BadgeView advBadge;

    @NotNull
    private final BadgeView badge;
    private final int containerWidth;
    private final int dp8;
    private final int imageHeight;

    @NotNull
    private final AppCompatTextView title;

    @NotNull
    private final ShapeableImageView videoImage;
    private final float videoImageCornerSize;

    public /* synthetic */ VideoItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final BadgeView initAdvBadge() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.iv_video_scroll_adv_badge);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        int i11 = this.dp8;
        layoutParams.setMargins(i11, i11, i11, i11);
        badgeView.setLayoutParams(layoutParams);
        this.advBadge = badgeView;
        addView(badgeView);
        return badgeView;
    }

    private final BadgeView initBadge() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.iv_video_scroll_badge);
        return badgeView;
    }

    private final AppCompatTextView initTitle() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.iv_video_scroll_title);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = this.dp8;
        layoutParams.setMargins(i11, this.imageHeight + i11, 0, 0);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_Bold);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        return appCompatTextView;
    }

    private final ShapeableImageView initVideoImage() {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        shapeableImageView.setId(R$id.iv_video_scroll_image);
        shapeableImageView.setShapeAppearanceModel(new k().o(this.videoImageCornerSize));
        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(this.containerWidth, this.imageHeight));
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return shapeableImageView;
    }

    public final void bindBadge(@NotNull Badge timeBadge) {
        Intrinsics.checkNotNullParameter(timeBadge, "timeBadge");
        BadgeHolderKt.bind$default(this.badge, timeBadge, (Function1) null, 2, (Object) null);
    }

    public final void bindImage(@NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageViewExtKt.load$default(this.videoImage, image, null, null, null, null, false, null, 126, null);
        ThemeExtKt.setParandjaForDarkTheme(this.videoImage);
    }

    public final void bindOrGoneAdvBadge(BadgeDTO badge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (this.advBadge == null) {
            initAdvBadge();
        }
        BadgeView badgeView = this.advBadge;
        if (badgeView != null) {
            BadgeHolderKt.bindOrGone(badgeView, badge, actionHandler);
        }
    }

    public final void bindTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.title.setText(text);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.title.getMeasuredHeight();
        int i11 = this.dp8;
        int i12 = measuredHeight - ((measuredHeight2 + i11) + i11);
        int measuredHeight3 = i12 - this.badge.getMeasuredHeight();
        int i13 = this.containerWidth - this.dp8;
        this.badge.layout(i13 - this.badge.getMeasuredWidth(), measuredHeight3, i13, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(164, context);
        this.containerWidth = px;
        this.imageHeight = ResourceExtKt.toPx(88, context);
        this.videoImageCornerSize = ResourceExtKt.toPxF(12, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        ShapeableImageView initVideoImage = initVideoImage();
        this.videoImage = initVideoImage;
        BadgeView initBadge = initBadge();
        this.badge = initBadge;
        AppCompatTextView initTitle = initTitle();
        this.title = initTitle;
        setLayoutParams(new FrameLayout.LayoutParams(px, -2));
        addView(initVideoImage);
        addView(initBadge);
        addView(initTitle);
    }
}
