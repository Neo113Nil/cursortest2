package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.content.res.g;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0014J\"\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u001eJ\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010$\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010&\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010(\u001a\u00020\u0019*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010)\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010+\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010-\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/pdp/utils/DPS;", "context", "Landroid/content/Context;", "isVerticalState", "", "<init>", "(Landroid/content/Context;Z)V", "ugcMainImageIv", "Lcom/google/android/material/imageview/ShapeableImageView;", "ugcPlayIconIv", "Landroid/widget/ImageView;", "ugcTitleIconIv", "ugcTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ugcSubtitleTav", "ugcTitleFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "previewIcon", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$GalleryIcon;", "titleIcon", "loadFailedRunnable", "Ljava/lang/Runnable;", "onDetachedFromWindow", "", "bind", "item", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcVo;", "clickableArea", "Lkotlin/Function1;", "Landroid/util/Size;", "updateState", "setupConstraints", "updateRootLayoutParams", "createMainImage", "updateMainImageLayoutParams", "createPlayIcon", "updatePlayIconLayoutParams", "createTitleFlow", "updateHorizontalBias", "createTitleIcon", "createTitle", "updateMaxWidth", "createSubtitle", "updateSubtitleLayoutParams", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4UgcView extends ConstraintLayout implements DPS {
    private Runnable loadFailedRunnable;
    private GalleryV4VO.GalleryIcon previewIcon;
    private GalleryV4VO.GalleryIcon titleIcon;

    @NotNull
    private final ShapeableImageView ugcMainImageIv;

    @NotNull
    private final ImageView ugcPlayIconIv;

    @NotNull
    private final TextAtomV2View ugcSubtitleTav;

    @NotNull
    private final Flow ugcTitleFlow;

    @NotNull
    private final ImageView ugcTitleIconIv;

    @NotNull
    private final TextAtomV2View ugcTitleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BIG_WIDTH = UiExtKt.toPx(144);
    private static final int BIG_HEIGHT = UiExtKt.toPx(206);
    private static final int SMALL_WIDTH = UiExtKt.toPx(182);
    private static final int SMALL_HEIGHT = UiExtKt.toPx(82);
    private static final int BIG_MAIN_IMAGE_SIZE = UiExtKt.toPx(136);
    private static final int SMALL_MAIN_IMAGE_SIZE = UiExtKt.toPx(74);
    private static final int VERTICAL_TITLE_MAX_WIDTH = UiExtKt.toPx(96);
    private static final int HORIZONTAL_TITLE_MAX_WIDTH = UiExtKt.toPx(68);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcView$Companion;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4UgcView(@NotNull Context context, boolean z11) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.galleryV4UgcItemCl);
        updateRootLayoutParams(z11);
        setBackground(g.d(context.getResources(), R$drawable.bg_round_gallery_v4_ugc_item, context.getTheme()));
        ShapeableImageView createMainImage = createMainImage(z11);
        this.ugcMainImageIv = createMainImage;
        ImageView createPlayIcon = createPlayIcon(z11);
        this.ugcPlayIconIv = createPlayIcon;
        ImageView createTitleIcon = createTitleIcon();
        this.ugcTitleIconIv = createTitleIcon;
        TextAtomV2View createTitle = createTitle(z11);
        this.ugcTitleTav = createTitle;
        Flow createTitleFlow = createTitleFlow(z11);
        this.ugcTitleFlow = createTitleFlow;
        TextAtomV2View createSubtitle = createSubtitle(z11);
        this.ugcSubtitleTav = createSubtitle;
        addViewInLayout(createMainImage, 0, createMainImage.getLayoutParams());
        addViewInLayout(createPlayIcon, 1, createPlayIcon.getLayoutParams());
        addViewInLayout(createTitleFlow, 2, createTitleFlow.getLayoutParams());
        addViewInLayout(createTitleIcon, 3, createTitleIcon.getLayoutParams());
        addViewInLayout(createTitle, 4, createTitle.getLayoutParams());
        addViewInLayout(createSubtitle, 5, createSubtitle.getLayoutParams());
        setupConstraints(z11);
    }

    private final ShapeableImageView createMainImage(boolean isVerticalState) {
        ShapeableImageView shapeableImageView = new ShapeableImageView(getContext());
        shapeableImageView.setId(R$id.ugcMainImageIv);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(new k().o(Dimens.INSTANCE.getDPF_12()));
        updateMainImageLayoutParams(shapeableImageView, isVerticalState);
        return shapeableImageView;
    }

    private final ImageView createPlayIcon(boolean isVerticalState) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.ugcPlayIconIv);
        updatePlayIconLayoutParams(imageView, isVerticalState);
        return imageView;
    }

    private final TextAtomV2View createSubtitle(boolean isVerticalState) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.ugcSubtitleTav);
        textAtomV2View.setTextIsSelectable(false);
        updateSubtitleLayoutParams(textAtomV2View, isVerticalState);
        return textAtomV2View;
    }

    private final TextAtomV2View createTitle(boolean isVerticalState) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.ugcTitleTav);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        textAtomV2View.setPadding(getDp2(), textAtomV2View.getPaddingTop(), textAtomV2View.getPaddingRight(), textAtomV2View.getPaddingBottom());
        textAtomV2View.setLayoutParams(bVar);
        updateMaxWidth(textAtomV2View, isVerticalState);
        return textAtomV2View;
    }

    private final Flow createTitleFlow(boolean isVerticalState) {
        Flow flow = new Flow(getContext());
        flow.setId(R$id.ugcTitleF);
        flow.setLayoutParams(new ConstraintLayout.b(0, -2));
        flow.setReferencedIds(new int[]{this.ugcTitleIconIv.getId(), this.ugcTitleTav.getId()});
        flow.setHorizontalStyle(2);
        updateHorizontalBias(flow, isVerticalState);
        return flow;
    }

    private final ImageView createTitleIcon() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.ugcTitleIconIv);
        imageView.setLayoutParams(new ConstraintLayout.b(getDp20(), getDp20()));
        return imageView;
    }

    private final void setupConstraints(boolean isVerticalState) {
        ConstraintLayoutExtKt.updateConstraints(this, new GalleryV4UgcView$setupConstraints$1(isVerticalState, this));
    }

    private final void updateHorizontalBias(Flow flow, boolean z11) {
        flow.setHorizontalBias(z11 ? 0.5f : 0.0f);
    }

    private final void updateMainImageLayoutParams(ImageView imageView, boolean z11) {
        int i11 = z11 ? BIG_MAIN_IMAGE_SIZE : SMALL_MAIN_IMAGE_SIZE;
        imageView.setLayoutParams(new ConstraintLayout.b(i11, i11));
    }

    private final void updateMaxWidth(TextAtomV2View textAtomV2View, boolean z11) {
        textAtomV2View.setMaxWidth(z11 ? VERTICAL_TITLE_MAX_WIDTH : HORIZONTAL_TITLE_MAX_WIDTH);
    }

    private final void updatePlayIconLayoutParams(ImageView imageView, boolean z11) {
        int dp24 = z11 ? getDp24() : getDp16();
        imageView.setLayoutParams(new ConstraintLayout.b(dp24, dp24));
    }

    private final void updateRootLayoutParams(boolean isVerticalState) {
        int i11 = isVerticalState ? BIG_WIDTH : SMALL_WIDTH;
        int i12 = isVerticalState ? BIG_HEIGHT : SMALL_HEIGHT;
        setMeasuredDimension(i11, i12);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    private final void updateState(boolean isVerticalState) {
        if (isVerticalState && getMeasuredHeight() == BIG_HEIGHT) {
            return;
        }
        if (isVerticalState || getMeasuredHeight() != SMALL_HEIGHT) {
            updateRootLayoutParams(isVerticalState);
            updateMainImageLayoutParams(this.ugcMainImageIv, isVerticalState);
            updatePlayIconLayoutParams(this.ugcPlayIconIv, isVerticalState);
            updateMaxWidth(this.ugcTitleTav, isVerticalState);
            updateHorizontalBias(this.ugcTitleFlow, isVerticalState);
            updateSubtitleLayoutParams(this.ugcSubtitleTav, isVerticalState);
            setupConstraints(isVerticalState);
        }
    }

    private final void updateSubtitleLayoutParams(TextAtomV2View textAtomV2View, boolean z11) {
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View.setTextAlignment(z11 ? 4 : 2);
    }

    public final void bind(@NotNull final GalleryV4UgcVo item, @NotNull Function1<? super Size, Unit> clickableArea) {
        Drawable drawable;
        String image;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(clickableArea, "clickableArea");
        updateState(item.getIsVerticalState());
        clickableArea.invoke(new Size(getDp32() + (item.getIsVerticalState() ? BIG_WIDTH : SMALL_WIDTH), getDp32() + (item.getIsVerticalState() ? BIG_HEIGHT : SMALL_HEIGHT)));
        ImageViewExtKt.load$default(this.ugcMainImageIv, item.getPreviewUrl(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcView$bind$1$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                final GalleryV4UgcView galleryV4UgcView = GalleryV4UgcView.this;
                final GalleryV4UgcVo galleryV4UgcVo = item;
                Runnable runnable = new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcView$bind$1$1$onLoadFailed$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShapeableImageView shapeableImageView;
                        shapeableImageView = GalleryV4UgcView.this.ugcMainImageIv;
                        ImageViewExtKt.load$default(shapeableImageView, galleryV4UgcVo.getPreviewUrl(), C7714v.a0(new ImageTransformation.Blur(6, 2)), null, Integer.valueOf(ru.ozon.app.android.gallery.R$drawable.ic_video_preview_placeholder), null, false, null, 116, null);
                    }
                };
                galleryV4UgcView.postDelayed(runnable, 50L);
                galleryV4UgcView.loadFailedRunnable = runnable;
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable drawable2) {
                PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, drawable2);
            }
        }, null, null, false, null, 122, null);
        TextHolderKt.bind$default(this.ugcTitleTav, item.getTitle(), null, 2, null);
        this.ugcTitleTav.setEllipsize(null);
        TextHolderKt.bind$default(this.ugcSubtitleTav, item.getSubtitle(), null, 2, null);
        this.ugcSubtitleTav.setLineSpacing(0.0f, 1.0f);
        if (Intrinsics.d(this.previewIcon, item.getPreviewIcon()) || item.getPreviewIcon() == null) {
            ViewExtKt.showOrGone(this.ugcPlayIconIv, Boolean.valueOf(item.getPreviewIcon() != null));
        } else {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.ugcPlayIconIv);
            ImageView imageView = this.ugcPlayIconIv;
            GalleryV4VO.GalleryIcon previewIcon = item.getPreviewIcon();
            if (previewIcon == null || (image = previewIcon.getImage()) == null) {
                drawable = null;
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                drawable = ExtensionsKt.loadDrawableByName(context, image);
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = this.ugcPlayIconIv;
            GalleryV4VO.GalleryIcon previewIcon2 = item.getPreviewIcon();
            ThemeExtKt.tint(imageView2, previewIcon2 != null ? Integer.valueOf(a.getColor(getContext(), previewIcon2.getTintColor())) : null);
            this.previewIcon = item.getPreviewIcon();
        }
        if (Intrinsics.d(this.titleIcon, item.getTitleIcon())) {
            return;
        }
        ImageView imageView3 = this.ugcTitleIconIv;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView3.setImageDrawable(ExtensionsKt.loadDrawableByName(context2, item.getTitleIcon().getImage()));
        ThemeExtKt.tint(this.ugcTitleIconIv, Integer.valueOf(a.getColor(getContext(), item.getTitleIcon().getTintColor())));
        this.titleIcon = item.getTitleIcon();
    }

    public int getDp10() {
        return DPS.DefaultImpls.getDp10(this);
    }

    public int getDp12() {
        return DPS.DefaultImpls.getDp12(this);
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp2() {
        return DPS.DefaultImpls.getDp2(this);
    }

    public int getDp20() {
        return DPS.DefaultImpls.getDp20(this);
    }

    public int getDp24() {
        return DPS.DefaultImpls.getDp24(this);
    }

    public int getDp32() {
        return DPS.DefaultImpls.getDp32(this);
    }

    public int getDp4() {
        return DPS.DefaultImpls.getDp4(this);
    }

    public int getDp56() {
        return DPS.DefaultImpls.getDp56(this);
    }

    public int getDp6() {
        return DPS.DefaultImpls.getDp6(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.loadFailedRunnable);
    }
}
