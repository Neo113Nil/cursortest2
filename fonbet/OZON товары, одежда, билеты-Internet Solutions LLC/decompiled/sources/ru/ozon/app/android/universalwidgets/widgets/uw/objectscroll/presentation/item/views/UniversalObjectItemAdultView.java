package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.views.AdultContentView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108¨\u0006?"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/item/views/UniversalObjectItemAdultView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "maxHeight", "bindTitleSubtitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "item", "bindImage", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "getImageView", "()Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "adultContentView", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "imageMargin", "I", "dp6", "dp8", "dp12", "maxTextHeight", "imageWidth", "imageHeight", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectItemAdultView extends ViewGroup {

    @NotNull
    private final AdultContentView adultContentView;

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

    public /* synthetic */ UniversalObjectItemAdultView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bindImage(@NotNull UniversalObjectScrollVO.ObjectScrollNewItemVO item) {
        ImageDTO copy;
        Intrinsics.checkNotNullParameter(item, "item");
        Integer imageWidth = item.getImage().getImageWidth();
        this.imageWidth = imageWidth != null ? UiExtKt.toPx(imageWidth.intValue()) : 0;
        if (item.getImage().getAspectRatio() == null) {
            return;
        }
        this.imageHeight = (int) (this.imageWidth / (r1.getWidthRatio() / r1.getHeightRatio()));
        Image image = this.imageView;
        if (!item.getShouldBlur() || item.getBlurPlaceholderImage() == null) {
            ImageHolderKt.bind$default(image, item.getImage(), null, 2, null);
            if (item.getIsAdditionalInsetsNeeded()) {
                int i11 = this.dp12;
                int i12 = this.dp6;
                image.setPadding(i11, i12, i11, i12);
            } else {
                image.setPadding(0, 0, 0, 0);
            }
            ViewExtKt.gone(this.adultContentView);
            this.badgeView.setVisibility(item.getBadge() != null ? 0 : 8);
        } else {
            copy = r7.copy((r34 & 1) != 0 ? r7.image : item.getBlurPlaceholderImage(), (r34 & 2) != 0 ? r7.backgroundColor : null, (r34 & 4) != 0 ? r7.aspectRatio : null, (r34 & 8) != 0 ? r7.hasParanja : false, (r34 & 16) != 0 ? r7.layoutPaddingLeft : null, (r34 & 32) != 0 ? r7.layoutPaddingRight : null, (r34 & 64) != 0 ? r7.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r7.layoutPaddingBottom : null, (r34 & 256) != 0 ? r7.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r7.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r7.testInfo : null, (r34 & 2048) != 0 ? r7.trackingInfo : null, (r34 & 4096) != 0 ? r7.imageWidth : null, (r34 & 8192) != 0 ? r7.imageType : null, (r34 & 16384) != 0 ? r7.fitType : null, (r34 & 32768) != 0 ? item.getImage().customRatio : null);
            ImageHolderKt.bind$default(image, copy, null, 2, null);
            ViewExtKt.show(this.adultContentView);
            ViewExtKt.gone(this.badgeView);
        }
        MeasureExtKt.measureExactly(image, this.imageWidth, this.imageHeight);
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
        LayoutExtKt.layoutLeftTop(this.titleView, 0, this.imageView.getBottom() + this.imageMargin);
        LayoutExtKt.layoutLeftTop(this.subtitleView, 0, this.titleView.getBottom());
        AdultContentView adultContentView = this.adultContentView;
        LayoutExtKt.layoutLeftTop(adultContentView, ((this.imageWidth - adultContentView.getMeasuredWidth()) / 2) + this.imageMargin, ((this.imageHeight - this.adultContentView.getMeasuredHeight()) / 2) + this.imageMargin);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measure(this.titleView, this.imageWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.subtitleView, this.imageWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measureAtMost(this.badgeView, this.imageWidth, this.imageHeight);
        MeasureExtKt.measureAtMost(this.adultContentView, this.imageWidth, this.imageHeight);
        setMeasuredDimension((this.imageMargin * 2) + this.imageWidth, View.MeasureSpec.getSize(heightMeasureSpec));
    }

    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        setOnClickListener(onClickListener);
        this.titleView.setOnClickListener(onClickListener);
        this.subtitleView.setOnClickListener(onClickListener);
        this.adultContentView.setClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectItemAdultView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.uwObjectScrollImage);
        addView(image);
        this.imageView = image;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.uwObjectScrollBadge);
        badgeView.setText("");
        addView(badgeView);
        this.badgeView = badgeView;
        AdultContentView adultContentView = new AdultContentView(context, null, 0, 0, 14, null);
        adultContentView.setId(R$id.uwAdultContentView);
        addView(adultContentView);
        this.adultContentView = adultContentView;
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
