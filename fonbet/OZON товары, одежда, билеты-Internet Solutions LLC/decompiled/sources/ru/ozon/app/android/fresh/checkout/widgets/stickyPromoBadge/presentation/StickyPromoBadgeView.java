package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.domain.StickyPromoBadgeVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0014\u0010\u001f\u001a\u00020\u0013*\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "endTextView", "listOfImages", "", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "item", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupSpacers", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "isBadgeVisible", "", "isImagesVisible", "populateImages", "", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Image;", "createImageView", "Lru/ozon/uni/android/atom/image/Image;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBadgeView extends LinearLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final TextAtomV2View endTextView;

    @NotNull
    private final List<AppCompatImageView> listOfImages;

    @NotNull
    private final TextAtomV2View startTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int horizontalPadding = ResourceExtKt.toPx(6);
    private static final int verticalPadding = ResourceExtKt.toPx(2);
    private static final int betweenImageMargin = ResourceExtKt.toPx(2);
    private static final int rightStartTextMargin = ResourceExtKt.toPx(6);
    private static final int leftEndTextMargin = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeView$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ StickyPromoBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Image createImageView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Image image = new Image(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = betweenImageMargin;
        image.setLayoutParams(layoutParams);
        image.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return image;
    }

    private final void populateImages(List<StickyPromoBadgeVO.Image> list) {
        Iterator<T> it = this.listOfImages.iterator();
        while (it.hasNext()) {
            removeView((AppCompatImageView) it.next());
        }
        this.listOfImages.clear();
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                StickyPromoBadgeVO.Image image = (StickyPromoBadgeVO.Image) obj;
                Image createImageView = createImageView();
                ImageHolderKt.bind$default(createImageView, image.getImage(), null, 2, null);
                if (image.getTintColor() != null) {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ThemeExtKt.tint(createImageView, Integer.valueOf(styleParser.parseColor(context, image.getTintColor(), UniColors.WHITE.getResId())));
                }
                this.listOfImages.add(createImageView);
                addView(createImageView, i12);
                i11 = i12;
            }
        }
    }

    private final void setupSpacers(StickyPromoBadgeVO.Spacers spacers, boolean isBadgeVisible, boolean isImagesVisible) {
        if (isImagesVisible) {
            TextAtomV2View textAtomV2View = this.startTextView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = rightStartTextMargin;
            textAtomV2View.setLayoutParams(marginLayoutParams);
            TextAtomV2View textAtomV2View2 = this.endTextView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.leftMargin = leftEndTextMargin;
            textAtomV2View2.setLayoutParams(marginLayoutParams2);
        } else {
            TextAtomV2View textAtomV2View3 = this.startTextView;
            ViewGroup.LayoutParams layoutParams3 = textAtomV2View3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.rightMargin = 0;
            textAtomV2View3.setLayoutParams(marginLayoutParams3);
            TextAtomV2View textAtomV2View4 = this.endTextView;
            ViewGroup.LayoutParams layoutParams4 = textAtomV2View4.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.leftMargin = leftEndTextMargin;
            textAtomV2View4.setLayoutParams(marginLayoutParams4);
        }
        ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMargins(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
        setLayoutParams(marginLayoutParams5);
        if (isBadgeVisible) {
            setPadding(0, 0, 0, 0);
            return;
        }
        int i11 = horizontalPadding;
        int i12 = verticalPadding;
        setPadding(i11, i12, i11, i12);
    }

    public final void bind(@NotNull final StickyPromoBadgeVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        boolean z11 = item.getBadge() != null;
        StickyPromoBadgeVO.Spacers spacers = item.getSpacers();
        List<StickyPromoBadgeVO.Image> images = item.getImages();
        setupSpacers(spacers, z11, !(images == null || images.isEmpty()));
        TextHolderKt.bindOrGone$default(this.startTextView, item.getStartText(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.endTextView, item.getEndText(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.badgeView, item.getBadge(), actionHandler);
        populateImages(item.getImages());
        if (z11) {
            setBackground(null);
            setOutlineProvider(null);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.BG_POSITIVE_PRIMARY.getResId()));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeView$bind$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), StickyPromoBadgeVO.this.getCornerRadius());
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyPromoBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.checkoutStickyPromoBadgeStartText);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View);
        this.startTextView = textAtomV2View;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.checkoutStickyPromoBadge);
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(badgeView);
        this.badgeView = badgeView;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.checkoutStickyPromoBadgeEndText);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View2);
        this.endTextView = textAtomV2View2;
        this.listOfImages = new ArrayList();
    }
}
