package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.a;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.R$drawable;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.app.android.ads.R$layout;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.emptyState.EmptyStateView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 a2\u00020\u0001:\u0001aB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0019J\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u0019J'\u0010$\u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\r¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0019J\u0019\u0010(\u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u0019J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010)J\u000f\u00104\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u0010\u0019R\u0017\u00107\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010.R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010DR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010UR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010UR\u0014\u0010\\\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010UR\u0014\u0010]\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010UR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/view/AdvVideoBannerV2ViewNew;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "hidePackshot", "()V", "setPackshotStateForViews", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "vo", "bindLegalInformation", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "showEmptyState", "hideEmptyState", "productHeight", "textGravity", "visibility", "repositionLegalStateIfNeeded", "(IIZ)V", "setVideoCoverDisabled", "initView", "layoutLegalInformation", "(I)V", "getLegalInformationTargetBottom", "(I)I", "Landroidx/media3/ui/PlayerView;", "createPlayerView", "()Landroidx/media3/ui/PlayerView;", "measurePlayerView", "measureParanjaView", "measurePackshotView", "horizontalMargin", "measureLegalInformationView", "measurePreviewImageView", "measureAdvLabelTextView", "measureVolumeImageView", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "Landroidx/appcompat/widget/AppCompatImageButton;", "volumeImageButton", "Landroidx/appcompat/widget/AppCompatImageButton;", "getVolumeImageButton", "()Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/graphics/drawable/GradientDrawable;", "previewImageDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/view/View;", "paranjaView", "Landroid/view/View;", "Landroid/widget/ImageView;", "previewImageView", "Landroid/widget/ImageView;", "getPreviewImageView", "()Landroid/widget/ImageView;", "packshotView", "LSc/j;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/emptyState/EmptyStateView;", "emptyStateView", "LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advLabelBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getAdvLabelBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "volumeSizePx", "I", "Landroid/util/Size;", "volume16pxSize", "Landroid/util/Size;", "volumeMargin", "advLabelTopMargin", "advLabelRightMargin", "advLabelHeight", "legalTextBottomMargin", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "legalInformation", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2ViewNew extends ViewGroup {

    @NotNull
    private final BadgeView advLabelBadgeView;
    private final int advLabelHeight;
    private final int advLabelRightMargin;
    private final int advLabelTopMargin;

    @NotNull
    private final InterfaceC4008j<EmptyStateView> emptyStateView;

    @NotNull
    private final TextAtomView legalInformation;
    private final int legalTextBottomMargin;

    @NotNull
    private final View packshotView;

    @NotNull
    private final View paranjaView;

    @NotNull
    private final PlayerView playerView;

    @NotNull
    private final GradientDrawable previewImageDrawable;

    @NotNull
    private final ImageView previewImageView;

    @NotNull
    private final Size volume16pxSize;

    @NotNull
    private final AppCompatImageButton volumeImageButton;
    private final int volumeMargin;
    private final int volumeSizePx;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float PREVIEW_CORNERS_SIZE = UiExtKt.toPxF(16);
    private static final int LEGAL_TEXT_HORIZONTAL_MARGIN_8 = ResourceExtKt.toPx(8);
    private static final int LEGAL_TEXT_HORIZONTAL_MARGIN_4 = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/view/AdvVideoBannerV2ViewNew$Companion;", "", "<init>", "()V", "", "VOLUME_SIZE", "I", "VOLUME_MARGIN", "ADV_LABEL_TOP_MARGIN", "ADV_LABEL_RIGHT_MARGIN", "ADV_LABEL_HEIGHT", "LEGAL_TEXT_BOTTOM_MARGIN", "", "DEFAULT_LETTER_SPACING", "F", "DEFAULT_LEGAL_INFORMATION_TEXT_SIZE", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvVideoBannerV2ViewNew(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final PlayerView createPlayerView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R$layout.videobanner_shrinked_player_view, (ViewGroup) this, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) inflate;
        playerView.setElevation(0.0f);
        playerView.setTranslationZ(-1.0f);
        playerView.setClipToOutline(true);
        playerView.setBackgroundResource(R$drawable.bg_player_v2);
        addView(playerView);
        return playerView;
    }

    private final int getLegalInformationTargetBottom(int productHeight) {
        return (getBottom() - (productHeight == 0 ? this.legalTextBottomMargin : 0)) - productHeight;
    }

    private final void initView() {
        setClickable(true);
        setFocusable(true);
    }

    private final void layoutLegalInformation(int productHeight) {
        int i11 = productHeight == 0 ? this.legalTextBottomMargin : 0;
        int i12 = productHeight == 0 ? LEGAL_TEXT_HORIZONTAL_MARGIN_4 : LEGAL_TEXT_HORIZONTAL_MARGIN_8;
        measureLegalInformationView(i12);
        this.legalInformation.layout(i12, ((getMeasuredHeight() - this.legalInformation.getMeasuredHeight()) - i11) - productHeight, getMeasuredWidth() - i12, getLegalInformationTargetBottom(productHeight));
        this.legalInformation.invalidate();
    }

    private final void measureAdvLabelTextView() {
        this.advLabelBadgeView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.advLabelHeight, 1073741824));
    }

    private final void measureLegalInformationView(int horizontalMargin) {
        this.legalInformation.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (horizontalMargin * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), LinearLayoutManager.INVALID_OFFSET));
    }

    private final void measurePackshotView() {
        this.packshotView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    private final void measureParanjaView() {
        this.paranjaView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    private final void measurePlayerView() {
        this.playerView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    private final void measurePreviewImageView() {
        this.previewImageView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    private final void measureVolumeImageView() {
        MeasureExtKt.measureExactly(this.volumeImageButton, this.volume16pxSize.getWidth(), this.volume16pxSize.getHeight());
    }

    public static /* synthetic */ void repositionLegalStateIfNeeded$default(AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        advVideoBannerV2ViewNew.repositionLegalStateIfNeeded(i11, i12, z11);
    }

    public final void bindLegalInformation(@NotNull TextAtom vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        TextAtomView textAtomView = this.legalInformation;
        TextAtomHolderKt.bind$default(textAtomView, vo, null, 2, null);
        textAtomView.setTextAlignment(1);
        textAtomView.setTextSize(8.0f);
        textAtomView.setLetterSpacing(0.0f);
        textAtomView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @NotNull
    public final BadgeView getAdvLabelBadgeView() {
        return this.advLabelBadgeView;
    }

    @NotNull
    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    @NotNull
    public final ImageView getPreviewImageView() {
        return this.previewImageView;
    }

    @NotNull
    public final AppCompatImageButton getVolumeImageButton() {
        return this.volumeImageButton;
    }

    public final void hideEmptyState() {
        if (this.emptyStateView.isInitialized()) {
            ViewExtKt.gone(this.emptyStateView.getValue());
        }
    }

    public final void hidePackshot() {
        ViewExtKt.gone(this.packshotView);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.playerView.layout(0, 0, right, bottom);
        this.paranjaView.layout(0, 0, right, bottom);
        this.previewImageView.layout(0, 0, right, bottom);
        LayoutExtKt.layoutRightTop(this.advLabelBadgeView, getMeasuredWidth() - this.advLabelRightMargin, this.advLabelTopMargin);
        AppCompatImageButton appCompatImageButton = this.volumeImageButton;
        int i11 = this.volumeMargin;
        LayoutExtKt.layoutLeftTop(appCompatImageButton, i11, i11);
        this.packshotView.layout(0, 0, right, bottom);
        if (this.emptyStateView.isInitialized()) {
            this.emptyStateView.getValue().layout(0, 0, right, bottom);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measurePlayerView();
        measureParanjaView();
        measurePackshotView();
        measurePreviewImageView();
        measureAdvLabelTextView();
        measureVolumeImageView();
        measureLegalInformationView(LEGAL_TEXT_HORIZONTAL_MARGIN_8);
        if (this.emptyStateView.isInitialized()) {
            this.emptyStateView.getValue().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public final void repositionLegalStateIfNeeded(int productHeight, int textGravity, boolean visibility) {
        if (!visibility) {
            ViewExtKt.gone(this.legalInformation);
        } else {
            if (this.legalInformation.getBottom() == getLegalInformationTargetBottom(productHeight)) {
                ViewExtKt.show(this.legalInformation);
                return;
            }
            this.legalInformation.setGravity(textGravity);
            layoutLegalInformation(productHeight);
            ViewExtKt.show(this.legalInformation);
        }
    }

    public final void setPackshotStateForViews() {
        ViewExtKt.show(this.packshotView);
        ViewExtKt.gone(this.volumeImageButton);
    }

    public final void setVideoCoverDisabled() {
        this.previewImageView.setBackground(this.previewImageDrawable);
    }

    public final void showEmptyState() {
        ViewExtKt.show(this.emptyStateView.getValue());
        ViewExtKt.show(this.packshotView);
    }

    public /* synthetic */ AdvVideoBannerV2ViewNew(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvVideoBannerV2ViewNew(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setId(R$id.volumeImageButton);
        appCompatImageButton.setBackground(null);
        ViewExtKt.gone(appCompatImageButton);
        ThemeExtKt.tint(appCompatImageButton, Integer.valueOf(a.getColor(context, R$color.graphic_tertiary_on_dark)));
        addView(appCompatImageButton);
        this.volumeImageButton = appCompatImageButton;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(PREVIEW_CORNERS_SIZE);
        gradientDrawable.setColor(a.getColor(context, ru.ozon.uni.R$color.layer_floor_1));
        this.previewImageDrawable = gradientDrawable;
        View view = new View(context);
        view.setId(R$id.paranjaView);
        view.setBackgroundResource(R$drawable.bg_rounded_paranja_v2);
        addView(view);
        this.paranjaView = view;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.previewImageView);
        imageView.setBackground(gradientDrawable);
        addView(imageView);
        this.previewImageView = imageView;
        View view2 = new View(context);
        view2.setId(R$id.packshotView);
        view2.setBackgroundResource(R$drawable.bg_rounded_packshot_v2);
        ViewExtKt.gone(view2);
        addView(view2);
        this.packshotView = view2;
        this.emptyStateView = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2ViewNew$emptyStateView$1(context, this));
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.i(N.b(BadgeView.class), context);
        if (badgeView == null) {
            context2 = context;
            badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        badgeView.setId(R$id.advLabelBadgeView);
        addView(badgeView);
        this.advLabelBadgeView = badgeView;
        int px = ResourceExtKt.toPx(16, context2);
        this.volumeSizePx = px;
        this.volume16pxSize = new Size(px, px);
        this.volumeMargin = ResourceExtKt.toPx(12, context2);
        this.advLabelTopMargin = ResourceExtKt.toPx(8, context2);
        this.advLabelRightMargin = ResourceExtKt.toPx(9, context2);
        this.advLabelHeight = ResourceExtKt.toPx(20, context2);
        this.legalTextBottomMargin = ResourceExtKt.toPx(8, context2);
        View g10 = qVar.g(N.b(TextAtomView.class), context2);
        TextAtomView textAtomView = (TextAtomView) g10;
        textAtomView.setId(R$id.legalInformationTextView);
        ViewExtKt.gone(textAtomView);
        addView(g10);
        this.legalInformation = textAtomView;
        PlayerView createPlayerView = createPlayerView();
        this.playerView = createPlayerView;
        createPlayerView.setLayerType(2, null);
        initView();
    }
}
