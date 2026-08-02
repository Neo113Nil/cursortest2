package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import Cw.ViewOnClickListenerC2787a;
import E.c0;
import Hj.C3143a;
import Sc.InterfaceC4008j;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001.\b\u0001\u0018\u0000 W2\u00020\u0001:\u0002WXB'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ?\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u001bJ\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010#J;\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u0002012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00106R\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "data", "Lkotlin/Function1;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$EventType;", "", "onEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "", "overlayControlsVisibility", "bind", "(Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "Lkotlin/Function0;", "onAnimationEnd", "hide", "(Lkotlin/jvm/functions/Function0;)V", "hideUnderOverlay", "()V", "showAfterOverlay", "clearImageViews", "bindChildViewsData", "(Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "hasLogoAndProduct", "hasBadge", "updateViewsConstraintsAndVisibility", "(ZZ)V", "clearConstraints", "updateImageViewConstraints", "updateCloseButtonViewConstraints", "(Z)V", "updateBadgeViewConstraints", "updateLogoImageViewConstraints", "widgetIsVisible", "widgetWasShown", "bindRootView", "(ZZZLkotlin/jvm/functions/Function1;)V", "ru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$outlineProvider$1", "outlineProvider", "()Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$outlineProvider$1;", "", "duration", "fadeOut", "(JLkotlin/jvm/functions/Function0;)V", "productsLogoBottomMargin", "I", "logoImageHeight", "imageViewId", "Lru/ozon/uni/android/atom/image/Image;", "imageView$delegate", "LSc/j;", "getImageView", "()Lru/ozon/uni/android/atom/image/Image;", "imageView", "productImageView$delegate", "getProductImageView", "productImageView", "badgeId", "Landroid/widget/ImageView;", "logoImage$delegate", "getLogoImage", "()Landroid/widget/ImageView;", "logoImage", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeButton$delegate", "getCloseButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeButton", "Landroid/view/View;", "closeButtonConstraintViewHelper$delegate", "getCloseButtonConstraintViewHelper", "()Landroid/view/View;", "closeButtonConstraintViewHelper", "Companion", "EventType", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoStickyBubbleView extends ConstraintLayout {

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badge;
    private final int badgeId;

    /* renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j closeButton;

    /* renamed from: closeButtonConstraintViewHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j closeButtonConstraintViewHelper;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageView;
    private final int imageViewId;

    /* renamed from: logoImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logoImage;
    private int logoImageHeight;

    /* renamed from: productImageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productImageView;
    private int productsLogoBottomMargin;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int rightImageViewMargin = UiExtKt.toPx(8);
    private static final float imageViewRound = UiExtKt.toPxF(16);
    private static final int horizontalLogoMargins = UiExtKt.toPx(8);
    private static final int horizontalBadgeMargins = UiExtKt.toPx(12);
    private static final int logoBottomMargin = UiExtKt.toPx(3);
    private static final int imageViewToBadgeMargin = UiExtKt.toPx(4);
    private static final int closeButtonTopMargin = UiExtKt.toPx(8);
    private static final int widgetMarginEnd = UiExtKt.toPx(8);
    private static final int widgetMarginBottom = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$Companion;", "", "<init>", "()V", "VIEW_WIDTH_PERCENT_FROM_SCREEN", "", "PRODUCTS_LOGO_BOTTOM_MARGIN_PERCENT", "LOGO_IMAGE_HEIGHT_PERCENT", "IMAGE_VIEW_DIMENSION_RATIO", "", "IMAGE_VIEW_ASPECT_RATIO", "rightImageViewMargin", "", "imageViewRound", "horizontalLogoMargins", "horizontalBadgeMargins", "logoBottomMargin", "imageViewToBadgeMargin", "closeButtonTopMargin", "widgetMarginEnd", "widgetMarginBottom", "create", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView;", "context", "Landroid/content/Context;", "parentWidth", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PromoStickyBubbleView create(@NotNull Context context, int parentWidth) {
            Intrinsics.checkNotNullParameter(context, "context");
            PromoStickyBubbleView promoStickyBubbleView = new PromoStickyBubbleView(context, null, 0, 6, null);
            int i11 = (int) (parentWidth * 0.2f);
            promoStickyBubbleView.setLayoutParams(new ViewGroup.LayoutParams(i11, -2));
            float f7 = i11;
            promoStickyBubbleView.productsLogoBottomMargin = (int) (0.45f * f7);
            promoStickyBubbleView.logoImageHeight = (int) (f7 * 0.3f);
            return promoStickyBubbleView;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE", "CTA", "START_AUTO_HIDE_TIMER", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType CLOSE = new EventType("CLOSE", 0);
        public static final EventType CTA = new EventType("CTA", 1);
        public static final EventType START_AUTO_HIDE_TIMER = new EventType("START_AUTO_HIDE_TIMER", 2);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{CLOSE, CTA, START_AUTO_HIDE_TIMER};
        }

        static {
            EventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EventType(String str, int i11) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* synthetic */ PromoStickyBubbleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindChildViewsData(PromoStickyBubbleV0 data, Function1<? super AtomAction, Unit> onAction, Function1<? super EventType, Unit> onEvent) {
        ImageViewExtKt.load$default(getImageView(), data.getImageUrl(), null, null, null, null, false, null, 126, null);
        IconButtonV3HolderKt.bind(getCloseButton(), data.getCloseButton(), new PromoStickyBubbleView$bindChildViewsData$1(onAction, onEvent));
        Image productImageView = getProductImageView();
        ImageHolderKt.bindOrGone$default(productImageView, data.getProductImage(), null, 2, null);
        ViewGroup.LayoutParams layoutParams = productImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = this.productsLogoBottomMargin;
        productImageView.setLayoutParams(bVar);
        String logoImageUrl = data.getLogoImageUrl();
        if (logoImageUrl != null) {
            ImageView logoImage = getLogoImage();
            ImageViewExtKt.load$default(logoImage, logoImageUrl, null, null, null, null, false, null, 126, null);
            ViewGroup.LayoutParams layoutParams2 = logoImage.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            int i11 = this.logoImageHeight;
            ((ViewGroup.MarginLayoutParams) bVar2).height = i11;
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = -(i11 / 2);
            logoImage.setLayoutParams(bVar2);
        }
        BadgeHolderKt.bindOrGone(getBadge(), data.getBadge(), onAction);
    }

    private final void bindRootView(boolean widgetIsVisible, boolean widgetWasShown, boolean overlayControlsVisibility, Function1<? super EventType, Unit> onEvent) {
        setOnClickListener(new ViewOnClickListenerC2787a(onEvent, 4));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 8388613;
        layoutParams2.rightMargin = widgetMarginEnd;
        layoutParams2.bottomMargin = widgetMarginBottom;
        setLayoutParams(layoutParams2);
        if (overlayControlsVisibility) {
            return;
        }
        if (!widgetIsVisible || getVisibility() == 0) {
            if (widgetIsVisible || getVisibility() != 0) {
                return;
            }
            setVisibility(8);
            return;
        }
        if (widgetWasShown) {
            setVisibility(0);
        } else {
            ViewExtKt.fadeIn$default(this, 0L, 1, null);
        }
        onEvent.invoke(EventType.START_AUTO_HIDE_TIMER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindRootView$lambda$9(Function1 function1, View view) {
        function1.invoke(EventType.CTA);
    }

    private final void clearConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.clearBottom(dVar, this.imageViewId);
        ConstraintSetExtKt.clearTop(dVar, getLogoImage().getId());
        ConstraintSetExtKt.clearBottom(dVar, getLogoImage().getId());
        ConstraintSetExtKt.clearTop(dVar, this.badgeId);
        ConstraintSetExtKt.clearBottom(dVar, this.badgeId);
        dVar.f(this);
    }

    private final void clearImageViews() {
        getImageView().setImageDrawable(null);
        getProductImageView().setImageDrawable(null);
        getLogoImage().setImageDrawable(null);
    }

    private final void fadeOut(long duration, Function0<Unit> onAnimationEnd) {
        ViewPropertyAnimator animate = animate();
        animate.alpha(0.0f);
        animate.setDuration(duration);
        animate.setInterpolator(new C5741c());
        animate.withEndAction(new c0(2, this, onAnimationEnd));
    }

    static /* synthetic */ void fadeOut$default(PromoStickyBubbleView promoStickyBubbleView, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        promoStickyBubbleView.fadeOut(j11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeOut$lambda$12$lambda$11(PromoStickyBubbleView promoStickyBubbleView, Function0 function0) {
        promoStickyBubbleView.setVisibility(8);
        function0.invoke();
    }

    private final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue();
    }

    private final IconButtonV3View getCloseButton() {
        return (IconButtonV3View) this.closeButton.getValue();
    }

    private final View getCloseButtonConstraintViewHelper() {
        return (View) this.closeButtonConstraintViewHelper.getValue();
    }

    private final Image getImageView() {
        return (Image) this.imageView.getValue();
    }

    private final ImageView getLogoImage() {
        return (ImageView) this.logoImage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image getProductImageView() {
        return (Image) this.productImageView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView$outlineProvider$1] */
    public final PromoStickyBubbleView$outlineProvider$1 outlineProvider() {
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView$outlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = PromoStickyBubbleView.imageViewRound;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        };
    }

    private final void updateBadgeViewConstraints(boolean hasBadge) {
        if (hasBadge) {
            BadgeView badge = getBadge();
            ViewGroup.LayoutParams layoutParams = badge.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41642l = 0;
            bVar.f41617X = true;
            badge.setLayoutParams(bVar);
        }
    }

    private final void updateCloseButtonViewConstraints(boolean hasLogoAndProduct) {
        IconButtonV3View closeButton = getCloseButton();
        ViewGroup.LayoutParams layoutParams = closeButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (hasLogoAndProduct) {
            bVar.f41636i = this.imageViewId;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = -closeButtonTopMargin;
        } else {
            bVar.f41636i = 0;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
            bVar.f41617X = true;
        }
        closeButton.setLayoutParams(bVar);
    }

    private final void updateImageViewConstraints(boolean hasLogoAndProduct, boolean hasBadge) {
        Image imageView = getImageView();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (hasLogoAndProduct) {
            bVar.f41640k = getLogoImage().getId();
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = -(this.logoImageHeight / 2);
        } else if (hasBadge) {
            bVar.f41640k = this.badgeId;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = imageViewToBadgeMargin;
        } else {
            bVar.f41642l = 0;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        }
        imageView.setLayoutParams(bVar);
    }

    private final void updateLogoImageViewConstraints(boolean hasBadge, boolean hasLogoAndProduct) {
        if (hasLogoAndProduct) {
            ImageView logoImage = getLogoImage();
            ViewGroup.LayoutParams layoutParams = logoImage.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            if (hasBadge) {
                bVar.f41640k = this.badgeId;
                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = logoBottomMargin;
                bVar.f41617X = true;
            } else {
                bVar.f41642l = 0;
            }
            logoImage.setLayoutParams(bVar);
        }
    }

    private final void updateViewsConstraintsAndVisibility(boolean hasLogoAndProduct, boolean hasBadge) {
        clearConstraints();
        updateImageViewConstraints(hasLogoAndProduct, hasBadge);
        updateLogoImageViewConstraints(hasBadge, hasLogoAndProduct);
        updateCloseButtonViewConstraints(hasLogoAndProduct);
        updateBadgeViewConstraints(hasBadge);
        int i11 = hasLogoAndProduct ? 0 : 8;
        getBadge().setVisibility(hasBadge ? 0 : 8);
        getProductImageView().setVisibility(i11);
        getLogoImage().setVisibility(i11);
    }

    public final void bind(@NotNull PromoStickyBubbleV0 data, @NotNull Function1<? super EventType, Unit> onEvent, @NotNull Function1<? super AtomAction, Unit> onAction, boolean overlayControlsVisibility) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        clearImageViews();
        bindChildViewsData(data, onAction, onEvent);
        boolean z11 = false;
        boolean z12 = data.getBadge() != null;
        if (data.getProductImage() != null && data.getLogoImageUrl() != null) {
            z11 = true;
        }
        updateViewsConstraintsAndVisibility(z11, z12);
        bindRootView(data.getIsVisible(), data.getWasShown(), overlayControlsVisibility, onEvent);
    }

    public final void hide(@NotNull Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        if (getVisibility() == 0) {
            fadeOut$default(this, 0L, onAnimationEnd, 1, null);
        }
    }

    public final void hideUnderOverlay() {
        setVisibility(4);
    }

    public final void showAfterOverlay() {
        if (getVisibility() == 0) {
            return;
        }
        ViewExtKt.fadeIn$default(this, 0L, 1, null);
    }

    private PromoStickyBubbleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.imageViewId = View.generateViewId();
        this.imageView = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$imageView$2(context, this));
        this.productImageView = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$productImageView$2(context, this));
        this.badgeId = View.generateViewId();
        this.logoImage = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$logoImage$2(context, this));
        this.badge = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$badge$2(context, this));
        this.closeButton = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$closeButton$2(context, this));
        this.closeButtonConstraintViewHelper = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleView$closeButtonConstraintViewHelper$2(context, this));
        setVisibility(4);
        addView(getImageView());
        addView(getProductImageView());
        addView(getLogoImage());
        addView(getBadge());
        addView(getCloseButton());
        addView(getCloseButtonConstraintViewHelper());
    }
}
