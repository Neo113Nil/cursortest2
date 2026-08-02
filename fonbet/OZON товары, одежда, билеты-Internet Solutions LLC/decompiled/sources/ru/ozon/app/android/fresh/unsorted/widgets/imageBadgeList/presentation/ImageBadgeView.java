package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation;

import B3.D;
import EE.b;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J9\u0010*\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\"\u0010)\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\f\u0012\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\u0004\u0012\u00020\u00100%¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "color", "", "radius", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "paddings", "", "bindBackground", "(Ljava/lang/String;FLru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "bindImage", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "bindText", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "hasTrailingIcon", "bindTrailingIcon", "(Z)V", "hasSeparator", "betweenPadding", "bindSeparator", "(ZI)V", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "item", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onClick", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;Lkotlin/jvm/functions/Function2;)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "imageBadgeContainer", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "separatorView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "trailingIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeView extends LinearLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final LinearLayout imageBadgeContainer;

    @NotNull
    private final Image imageView;

    @NotNull
    private final View separatorView;

    @NotNull
    private final TextAtomV2View textView;

    @NotNull
    private final IconView trailingIconView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int imageSize = UiExtKt.toPx(28);
    private static final int iconSize = UiExtKt.toPx(8);
    private static final int textMargin = UiExtKt.toPx(8);
    private static final int trailingIconMargin = UiExtKt.toPx(2);
    private static final int separatorHeight = UiExtKt.toPx(12);
    private static final int separatorWidth = UiExtKt.toPx(2);
    private static final int separatorMargin = UiExtKt.toPx(4);
    private static final float separatorCornerRadius = UiExtKt.toPxF(8);

    @NotNull
    private static final IconDTO trailingIconModel = new IconDTO(IconDTO.IconSize.SIZE_300, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_chevron_right_filled", UniColors.GRAPHIC_QUATERNARY.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65514, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeView$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$13$lambda$12(Function2 function2, ImageBadgeListVO.ImageBadge imageBadge, View view) {
        function2.invoke(imageBadge.getAction(), imageBadge.getTokenizedEvent());
    }

    private final void bindBackground(String color, float radius, ImageBadgeListVO.PaddingsVO paddings) {
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, color, UniColors.BG_SECONDARY.getResId()));
        gradientDrawable.setCornerRadius(radius);
        this.imageBadgeContainer.setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
    }

    private final void bindImage(ImageDTO image) {
        ImageHolderKt.bind$default(this.imageView, image, null, 2, null);
    }

    private final void bindSeparator(boolean hasSeparator, int betweenPadding) {
        if (hasSeparator) {
            ViewExtKt.show(this.separatorView);
            LinearLayout linearLayout = this.imageBadgeContainer;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(betweenPadding);
            linearLayout.setLayoutParams(marginLayoutParams);
            return;
        }
        ViewExtKt.gone(this.separatorView);
        LinearLayout linearLayout2 = this.imageBadgeContainer;
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginEnd(0);
        linearLayout2.setLayoutParams(marginLayoutParams2);
    }

    private final void bindText(TextDTO text) {
        TextHolderKt.bind$default(this.textView, text, null, 2, null);
    }

    private final void bindTrailingIcon(boolean hasTrailingIcon) {
        this.trailingIconView.setVisibility(hasTrailingIcon ? 0 : 8);
    }

    public final void bind(@NotNull ImageBadgeListVO.ImageBadge item, @NotNull Function2<? super AtomAction, ? super t, Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        setOnClickListener(new b(5, onClick, item));
        bindBackground(item.getBackgroundColor(), item.getCornerRadius(), item.getPaddings());
        bindImage(item.getImage());
        bindText(item.getText());
        bindTrailingIcon(item.getHasTrailingIcon());
        bindSeparator(item.getHasSeparator(), item.getPaddings().getBetween());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable b11 = D.b(0);
        this.backgroundDrawable = b11;
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(b11);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        addView(linearLayout);
        this.imageBadgeContainer = linearLayout;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(separatorWidth, separatorHeight);
        int i12 = separatorMargin;
        layoutParams2.setMarginStart(i12);
        layoutParams2.setMarginEnd(i12);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(separatorCornerRadius);
        gradientDrawable.setColor(a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId()));
        view.setBackground(gradientDrawable);
        addView(view);
        this.separatorView = view;
        Image image = new Image(context, null, 0, 6, null);
        int i13 = imageSize;
        image.setLayoutParams(new LinearLayout.LayoutParams(i13, i13));
        linearLayout.addView(image);
        this.imageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(textMargin);
        textAtomV2View.setLayoutParams(layoutParams3);
        textAtomV2View.setTextAlignment(4);
        linearLayout.addView(textAtomV2View);
        this.textView = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        int i14 = iconSize;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i14, i14);
        layoutParams4.setMarginStart(trailingIconMargin);
        iconView.setLayoutParams(layoutParams4);
        IconHolderKt.bind$default(iconView, trailingIconModel, null, 2, null);
        linearLayout.addView(iconView);
        this.trailingIconView = iconView;
        setOrientation(0);
        setGravity(17);
        textAtomV2View.setTextIsSelectable(false);
    }
}
