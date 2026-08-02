package ru.ozon.app.android.storefront.navBar.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J0\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010&\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/navBar/views/MiniappHeaderView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "logoView", "Lru/ozon/uni/android/atom/image/Image;", "iconRightPadding", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "bindIcon", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindLogo", "dto", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bindLogoOrGone", "getVerticalPadding", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MiniappHeaderView extends ViewGroup {
    private final int iconRightPadding;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final Image logoView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniappHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getVerticalPadding() {
        return Math.max(this.iconView.getMeasuredHeight() - (this.logoView.getMeasuredHeight() + this.titleView.getMeasuredHeight()), 0) / 2;
    }

    public final void bindIcon(@NotNull IconDTO icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        IconDTO.IconSize size = icon.getSize();
        int size2 = size != null ? size.getSize() : 0;
        IconView iconView = this.iconView;
        IconHolderKt.bind$default(iconView, icon, null, 2, null);
        MeasureExtKt.measureExactly(iconView, size2, size2);
    }

    public final void bindLogo(@NotNull ImageDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Integer imageWidth = dto.getImageWidth();
        int px = imageWidth != null ? UiExtKt.toPx(imageWidth.intValue()) : 0;
        if (dto.getAspectRatio() == null) {
            return;
        }
        Image image = this.logoView;
        ImageHolderKt.bind$default(image, dto, null, 2, null);
        MeasureExtKt.measureExactly(image, px, (int) (px / (r1.getWidthRatio() / r1.getHeightRatio())));
    }

    public final void bindLogoOrGone(ImageDTO dto) {
        if (dto == null) {
            this.logoView.setVisibility(8);
        } else {
            this.logoView.setVisibility(0);
            bindLogo(dto);
        }
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(this.titleView, title, null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LayoutExtKt.layoutLeftTop(this.iconView, 0, 0);
        LayoutExtKt.layoutLeftTop(this.logoView, this.iconView.getRight() + this.iconRightPadding, getVerticalPadding());
        LayoutExtKt.layoutLeftTop(this.titleView, this.iconView.getRight() + this.iconRightPadding, this.logoView.getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        MeasureExtKt.measure(this.titleView, (View.MeasureSpec.getSize(widthMeasureSpec) - this.iconView.getMeasuredWidth()) - this.iconRightPadding, 1073741824, 0, 0);
        setMeasuredDimension(Math.max(this.titleView.getMeasuredWidth(), this.logoView.getMeasuredWidth()) + this.iconView.getMeasuredWidth() + this.iconRightPadding, this.iconView.getMeasuredHeight());
    }

    public /* synthetic */ MiniappHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniappHeaderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.miniappHeaderTitle);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.miniappHeaderIcon);
        this.iconView = iconView;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.miniappHeaderLogo);
        this.logoView = image;
        this.iconRightPadding = UiExtKt.toPx(8);
        addView(textAtomV2View);
        addView(iconView);
        addView(image);
    }
}
