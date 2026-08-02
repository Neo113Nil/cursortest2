package ru.ozon.app.android.returns.details.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.app.android.returns.common.presentation.untils.TextAppearanceHelper;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnReasonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "commentMarginTop", "photosGalleryMarginTop", "viewPadding", "reasonTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getReasonTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "commentTextAtomView", "getCommentTextAtomView", "photosGalleryView", "Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "getPhotosGalleryView", "()Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnReasonView extends LinearLayout {
    private final int commentMarginTop;

    @NotNull
    private final TextAtomView commentTextAtomView;
    private final int photosGalleryMarginTop;

    @NotNull
    private final GalleryView photosGalleryView;

    @NotNull
    private final TextAtomView reasonTextAtomView;
    private final int viewPadding;

    public /* synthetic */ ReturnReasonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getCommentTextAtomView() {
        return this.commentTextAtomView;
    }

    @NotNull
    public final GalleryView getPhotosGalleryView() {
        return this.photosGalleryView;
    }

    @NotNull
    public final TextAtomView getReasonTextAtomView() {
        return this.reasonTextAtomView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnReasonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.commentMarginTop = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.photosGalleryMarginTop = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.viewPadding = px3;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        textAtomView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextAppearanceHelper textAppearanceHelper = TextAppearanceHelper.INSTANCE;
        textAppearanceHelper.setStyle(textAtomView, R$style.TextStyle_Body_M_Bold);
        textAtomView.setTextColorOrDefault(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textPrimary)));
        this.reasonTextAtomView = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        textAtomView2.setLayoutParams(layoutParams);
        textAppearanceHelper.setStyle(textAtomView2, R$style.TextStyle_Body_M_Bold);
        textAtomView2.setTextColorOrDefault(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textSecondary)));
        this.commentTextAtomView = textAtomView2;
        GalleryView galleryView = new GalleryView(context, null, 0, 6, null);
        galleryView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, px2, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        galleryView.setLayoutParams(layoutParams2);
        this.photosGalleryView = galleryView;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setPadding(px3, px3, px3, px3);
        addView(textAtomView);
        addView(textAtomView2);
        addView(galleryView);
    }
}
