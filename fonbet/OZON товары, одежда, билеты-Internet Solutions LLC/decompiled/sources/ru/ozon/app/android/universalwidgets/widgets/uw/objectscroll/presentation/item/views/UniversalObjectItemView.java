package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;¨\u0006B"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "top", "rootMeasuredWidth", "", "layoutCenter", "(Landroid/view/View;II)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "maxHeight", "bindTitleSubtitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "isAdditionalInsetsNeeded", "bindImage", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Z)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "getImageView", "()Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "imageMargin", "I", "dp6", "dp8", "dp12", "imageWidth", "imageHeight", "maxTextHeight", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectItemView extends ViewGroup {

    @NotNull
    private final BadgeView badgeView;
    private final int dp12;
    private final int dp6;
    private final int dp8;
    private int imageHeight;
    private final int imageMargin;

    @NotNull
    private final Image imageView;
    private int imageWidth;
    private int maxTextHeight;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ UniversalObjectItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void layoutCenter(View view, int i11, int i12) {
        int measuredWidth = (i12 - view.getMeasuredWidth()) / 2;
        view.layout(measuredWidth, i11, i12 - measuredWidth, view.getMeasuredHeight() + i11);
    }

    public final void bindImage(@NotNull ImageDTO image, boolean isAdditionalInsetsNeeded) {
        Intrinsics.checkNotNullParameter(image, "image");
        Integer imageWidth = image.getImageWidth();
        this.imageWidth = imageWidth != null ? UiExtKt.toPx(imageWidth.intValue()) : 0;
        if (image.getAspectRatio() == null) {
            return;
        }
        this.imageHeight = (int) (this.imageWidth / (r0.getWidthRatio() / r0.getHeightRatio()));
        Image image2 = this.imageView;
        ImageHolderKt.bind$default(image2, image, null, 2, null);
        if (isAdditionalInsetsNeeded) {
            int i11 = this.dp12;
            int i12 = this.dp6;
            image2.setPadding(i11, i12, i11, i12);
        } else {
            image2.setPadding(0, 0, 0, 0);
        }
        MeasureExtKt.measureExactly(image2, this.imageWidth, this.imageHeight);
    }

    public final void bindTitleSubtitle(TextDTO title, TextDTO subtitle, int maxHeight) {
        this.maxTextHeight = maxHeight;
        TextHolderKt.bindOrGone$default(this.titleView, title, null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, subtitle, null, 2, null);
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        Image image = this.imageView;
        int i11 = this.imageMargin;
        LayoutExtKt.layoutLeftTop(image, i11, i11);
        LayoutExtKt.layoutRightTop(this.badgeView, this.imageView.getRight() - this.dp8, this.imageView.getTop() + this.dp8);
        layoutCenter(this.titleView, this.imageView.getBottom() + this.imageMargin, getMeasuredWidth());
        LayoutExtKt.layoutLeftTop(this.subtitleView, 0, this.titleView.getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measure(this.titleView, this.imageWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.subtitleView, this.imageWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measureAtMost(this.badgeView, this.imageWidth, this.imageHeight);
        setMeasuredDimension((this.imageMargin * 2) + this.imageWidth, View.MeasureSpec.getSize(heightMeasureSpec));
    }

    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        setOnClickListener(onClickListener);
        this.titleView.setOnClickListener(onClickListener);
        this.subtitleView.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.uwObjectScrollImage);
        addView(image);
        this.imageView = image;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.uwObjectScrollBadge);
        addView(badgeView);
        this.badgeView = badgeView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.uwObjectScrollTitle);
        textAtomV2View.setFocusable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.uwObjectScrollSubtitle);
        textAtomV2View2.setFocusable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        this.imageMargin = UiExtKt.toPx(4);
        this.dp6 = UiExtKt.toPx(6);
        this.dp8 = UiExtKt.toPx(8);
        this.dp12 = UiExtKt.toPx(12);
    }
}
