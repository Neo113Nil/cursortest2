package ru.ozon.app.android.storefront.widgets.megaRaffle.presentation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.imageview.ShapeableImageView;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.widgets.megaRaffle.data.ProgressItemDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$color;
import y7.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014J0\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0014J\u0010\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000104J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/presentation/MegaDrawProductProgressView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp16", "dp12", "dp18", "dp4", "dp2", "dp40", "dp30", "viewBackground", "Landroid/graphics/drawable/Drawable;", "progressCorner", "", "cutCorner", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleChevronIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "progressBarTitle", "emptyProgressBarImageView", "Landroid/view/View;", "actualProgressBarImageView", "Lcom/google/android/material/imageview/ShapeableImageView;", "progressBarIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "progressBarStatus", "productIcon", "progress", "hasProgress", "", "hasProductImage", "shouldShowTitleArrow", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "l", "t", "r", "b", "bindItemOrGone", "item", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/ProgressItemDTO;", "measureProgressView", "measureHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MegaDrawProductProgressView extends ViewGroup {

    @NotNull
    private ShapeableImageView actualProgressBarImageView;
    private final float cutCorner;
    private final int dp12;
    private final int dp16;
    private final int dp18;
    private final int dp2;
    private final int dp30;
    private final int dp4;
    private final int dp40;

    @NotNull
    private View emptyProgressBarImageView;
    private boolean hasProductImage;
    private boolean hasProgress;

    @NotNull
    private IconView productIcon;
    private float progress;

    @NotNull
    private AppCompatImageView progressBarIcon;

    @NotNull
    private TextAtomView progressBarStatus;

    @NotNull
    private TextAtomView progressBarTitle;
    private final float progressCorner;
    private boolean shouldShowTitleArrow;

    @NotNull
    private TextAtomView title;

    @NotNull
    private IconView titleChevronIcon;
    private final Drawable viewBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MegaDrawProductProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int measureHeight() {
        int measuredHeight = this.title.getMeasuredHeight() + this.dp12;
        View ifNotGone = ViewExtKt.getIfNotGone(this.progressBarTitle);
        int measuredHeight2 = this.emptyProgressBarImageView.getMeasuredHeight() + measuredHeight + (ifNotGone != null ? ifNotGone.getMeasuredHeight() : -this.dp4);
        int measuredHeight3 = this.progressBarStatus.getMeasuredHeight();
        int i11 = this.dp12;
        return measuredHeight3 + i11 + measuredHeight2 + i11;
    }

    private final void measureProgressView() {
        MeasureExtKt.measureExactly(this.actualProgressBarImageView, this.progress >= 1.0f ? this.emptyProgressBarImageView.getMeasuredWidth() : (int) (this.emptyProgressBarImageView.getMeasuredWidth() * this.progress), this.dp4);
    }

    public final void bindItemOrGone(final ProgressItemDTO item) {
        if (item == null) {
            ViewExtKt.gone(this);
            return;
        }
        this.progress = item.getProgress();
        this.hasProductImage = item.getImage() != null;
        this.hasProgress = !(item.getProgress() == 1.0f);
        this.emptyProgressBarImageView.setBackground(this.progress < 1.0f ? C7232a.a(getContext(), this.hasProductImage ? R$drawable.bg_mega_draw_progress_left_corners : R$drawable.bg_mega_draw_progress) : null);
        TextAtomView textAtomView = this.title;
        TextAtomHolderKt.bindOrGone$default(textAtomView, item.getTitle(), null, 2, null);
        textAtomView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomView.setEllipsize(truncateAt);
        IconView iconView = this.titleChevronIcon;
        iconView.setImageDrawable(C7232a.a(iconView.getContext(), ru.ozon.uni.core.R$drawable.ic_s_chevron_right));
        iconView.setColorFilter(a.getColor(iconView.getContext(), R$color.graphic_tertiary_on_light), PorterDuff.Mode.SRC_IN);
        iconView.setAlpha(0.4f);
        TextAtomView textAtomView2 = this.progressBarTitle;
        TextAtomHolderKt.bindOrGone$default(textAtomView2, item.getProductName(), null, 2, null);
        textAtomView2.setMaxLines(1);
        textAtomView2.setEllipsize(truncateAt);
        ImageViewExtKt.clearResource(this.actualProgressBarImageView);
        ShapeableImageView shapeableImageView = this.actualProgressBarImageView;
        int i11 = Y.f42258g;
        if (!shapeableImageView.isLaidOut() || shapeableImageView.isLayoutRequested()) {
            shapeableImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.widgets.megaRaffle.presentation.MegaDrawProductProgressView$bindItemOrGone$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    float f7 = MegaDrawProductProgressView.this.hasProgress ? MegaDrawProductProgressView.this.cutCorner : MegaDrawProductProgressView.this.progressCorner;
                    ShapeableImageView shapeableImageView2 = MegaDrawProductProgressView.this.actualProgressBarImageView;
                    ImageViewExtKt.load$default(shapeableImageView2, item.getProgressImage(), null, null, null, null, false, null, 126, null);
                    k shapeAppearanceModel = shapeableImageView2.getShapeAppearanceModel();
                    shapeAppearanceModel.getClass();
                    k.a aVar = new k.a(shapeAppearanceModel);
                    aVar.h(6.0f);
                    aVar.p(6.0f);
                    aVar.l(f7);
                    aVar.t(f7);
                    shapeableImageView2.setShapeAppearanceModel(aVar.a());
                    shapeableImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            });
        } else {
            float f7 = this.hasProgress ? this.cutCorner : this.progressCorner;
            ShapeableImageView shapeableImageView2 = this.actualProgressBarImageView;
            ImageViewExtKt.load$default(shapeableImageView2, item.getProgressImage(), null, null, null, null, false, null, 126, null);
            k shapeAppearanceModel = shapeableImageView2.getShapeAppearanceModel();
            shapeAppearanceModel.getClass();
            k.a aVar = new k.a(shapeAppearanceModel);
            aVar.h(6.0f);
            aVar.p(6.0f);
            aVar.l(f7);
            aVar.t(f7);
            shapeableImageView2.setShapeAppearanceModel(aVar.a());
            shapeableImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if (item.getSubtitleImage() != null) {
            ImageViewExtKt.load$default(this.progressBarIcon, item.getSubtitleImage(), null, null, null, null, false, null, 126, null);
            ViewExtKt.show(this.progressBarIcon);
        } else {
            ViewExtKt.gone(this.progressBarIcon);
        }
        TextAtomView textAtomView3 = this.progressBarStatus;
        TextAtomHolderKt.bindOrGone$default(textAtomView3, item.getSubtitle(), null, 2, null);
        textAtomView3.setMaxLines(1);
        textAtomView3.setEllipsize(truncateAt);
        String image = item.getImage();
        if (image != null) {
            ImageViewExtKt.load$default(this.productIcon, image, null, null, null, null, false, null, 126, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        TextAtomView textAtomView = this.title;
        int i11 = this.dp12;
        LayoutExtKt.layoutLeftTop(textAtomView, i11, i11);
        this.titleChevronIcon.layout(this.title.getMeasuredWidth() + this.dp12, this.title.getTop(), this.title.getMeasuredWidth() + this.dp16 + this.dp12, this.title.getBottom());
        LayoutExtKt.layoutLeftTop(this.progressBarTitle, this.dp12, this.title.getBottom() + this.dp4);
        View ifNotGone = ViewExtKt.getIfNotGone(this.progressBarTitle);
        if (ifNotGone == null) {
            ifNotGone = this.title;
        }
        LayoutExtKt.layoutLeftTop(this.emptyProgressBarImageView, this.dp12, ifNotGone.getBottom() + this.dp4);
        LayoutExtKt.layoutLeftTop(this.actualProgressBarImageView, this.emptyProgressBarImageView.getLeft(), this.emptyProgressBarImageView.getTop());
        this.progressBarIcon.layout(this.dp12, this.progressBarStatus.getTop(), this.dp12 + this.dp16, this.progressBarStatus.getTop() + this.dp16);
        TextAtomView textAtomView2 = this.progressBarStatus;
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.progressBarIcon);
        LayoutExtKt.layoutLeftTop(textAtomView2, ifNotGone2 != null ? ifNotGone2.getRight() + this.dp2 : this.dp12, this.emptyProgressBarImageView.getBottom() + this.dp4);
        this.productIcon.layout((getMeasuredWidth() - this.dp40) - this.dp12, this.emptyProgressBarImageView.getTop() - this.dp18, getMeasuredWidth() - this.dp12, this.emptyProgressBarImageView.getBottom() + this.dp18);
        boolean z11 = this.titleChevronIcon.getMeasuredWidth() + this.title.getMeasuredWidth() < this.productIcon.getLeft();
        this.shouldShowTitleArrow = z11;
        this.titleChevronIcon.setVisibility(z11 ? 0 : 8);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i11 = ((size - this.dp16) - this.dp12) - this.dp40;
        MeasureExtKt.measure(this.title, i11, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        IconView iconView = this.titleChevronIcon;
        int i12 = this.dp16;
        MeasureExtKt.measureExactly(iconView, i12, i12);
        MeasureExtKt.measure(this.progressBarTitle, i11, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        if (this.hasProductImage) {
            MeasureExtKt.measureExactly(this.emptyProgressBarImageView, (size - this.dp40) - (this.dp12 * 2), this.dp4);
        } else {
            MeasureExtKt.measureExactly(this.emptyProgressBarImageView, size - (this.dp12 * 2), this.dp4);
        }
        measureProgressView();
        AppCompatImageView appCompatImageView = this.progressBarIcon;
        int i13 = this.dp16;
        MeasureExtKt.measureExactly(appCompatImageView, i13, i13);
        MeasureExtKt.measure(this.progressBarStatus, i11 - this.dp30, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        IconView iconView2 = this.productIcon;
        int i14 = this.dp40;
        MeasureExtKt.measureExactly(iconView2, i14, i14);
        setMeasuredDimension(size, getPaddingTop() + getPaddingBottom() + measureHeight());
    }

    public /* synthetic */ MegaDrawProductProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaDrawProductProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp18 = UiExtKt.toPx(18, context);
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp40 = UiExtKt.toPx(40, context);
        this.dp30 = UiExtKt.toPx(30, context);
        Drawable a11 = C7232a.a(context, R$drawable.bg_megadraw_product);
        this.viewBackground = a11;
        this.progressCorner = 6.0f;
        q qVar = q.f64554a;
        this.title = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            iconView = ActionProgressIconBuilder.INSTANCE.buildActionProgressIcons(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            layoutParams.width = px;
            layoutParams.height = px;
            iconView.setLayoutParams(layoutParams);
        }
        this.titleChevronIcon = iconView;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setMaxLines(1);
        this.progressBarTitle = textAtomView;
        this.emptyProgressBarImageView = new View(context);
        this.actualProgressBarImageView = new ShapeableImageView(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.progressBarIcon = appCompatImageView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setMaxLines(1);
        this.progressBarStatus = textAtomView2;
        IconView iconView2 = (IconView) qVar.i(N.b(IconView.class), context);
        this.productIcon = iconView2 == null ? ActionProgressIconBuilder.INSTANCE.buildActionProgressIcons(context) : iconView2;
        setClipToOutline(true);
        setBackground(a11);
        addView(this.title);
        addView(this.titleChevronIcon);
        addView(this.progressBarTitle);
        addView(this.emptyProgressBarImageView);
        addView(this.actualProgressBarImageView);
        addView(this.progressBarIcon);
        addView(this.progressBarStatus);
        addView(this.productIcon);
    }
}
