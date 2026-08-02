package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupBadgeVO;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupButtonVo;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6PickupButtonView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "pickupBadge", "", "bindPickupBadge", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;)V", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "pickupButton", "bind", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;)V", "pickupButtonTitle$delegate", "LSc/j;", "getPickupButtonTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pickupButtonTitle", "pickupButtonSubtitle$delegate", "getPickupButtonSubtitle", "pickupButtonSubtitle", "pickupButtonBadge$delegate", "getPickupButtonBadge", "pickupButtonBadge", "Landroid/widget/ImageView;", "pickupButtonIcon$delegate", "getPickupButtonIcon", "()Landroid/widget/ImageView;", "pickupButtonIcon", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout$delegate", "getConstraintLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6PickupButtonView extends CardView {

    /* renamed from: constraintLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j constraintLayout;

    /* renamed from: pickupButtonBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pickupButtonBadge;

    /* renamed from: pickupButtonIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pickupButtonIcon;

    /* renamed from: pickupButtonSubtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pickupButtonSubtitle;

    /* renamed from: pickupButtonTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pickupButtonTitle;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6PickupButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pickupButtonTitle = k.b(new DeliveryV6PickupButtonView$pickupButtonTitle$2(context));
        this.pickupButtonSubtitle = k.b(new DeliveryV6PickupButtonView$pickupButtonSubtitle$2(context));
        this.pickupButtonBadge = k.b(new DeliveryV6PickupButtonView$pickupButtonBadge$2(context));
        this.pickupButtonIcon = k.b(new DeliveryV6PickupButtonView$pickupButtonIcon$2(context));
        this.constraintLayout = k.b(new DeliveryV6PickupButtonView$constraintLayout$2(context, this));
        addView(getConstraintLayout());
    }

    private final void bindPickupBadge(final TextAtomV2View textAtomV2View, PickupBadgeVO pickupBadgeVO) {
        DisplayMetrics displayMetrics = textAtomV2View.getRootView().getContext().getResources().getDisplayMetrics();
        if (((int) (((Number) r2.b()).intValue() / ((Number) new Pair(Float.valueOf(displayMetrics.density), Integer.valueOf(displayMetrics.widthPixels)).a()).floatValue())) < 320 || pickupBadgeVO == null) {
            ViewExtKt.gone(textAtomV2View);
        } else {
            TextHolderKt.bindOrGone$default(textAtomV2View, pickupBadgeVO.getText(), null, 2, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textAtomV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewExtKt.setBackgroundTint(textAtomV2View, styleParser.parseColor(context, pickupBadgeVO.getBackgroundColor(), UniColors.LAYER_FLOOR_0.getResId()));
        }
        getConstraintLayout().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view.DeliveryV6PickupButtonView$bindPickupBadge$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                TextAtomV2View pickupButtonTitle;
                TextAtomV2View pickupButtonTitle2;
                TextAtomV2View pickupButtonSubtitle;
                TextAtomV2View pickupButtonSubtitle2;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                pickupButtonTitle = DeliveryV6PickupButtonView.this.getPickupButtonTitle();
                float x11 = pickupButtonTitle.getX();
                pickupButtonTitle2 = DeliveryV6PickupButtonView.this.getPickupButtonTitle();
                float width = x11 + pickupButtonTitle2.getWidth();
                pickupButtonSubtitle = DeliveryV6PickupButtonView.this.getPickupButtonSubtitle();
                float x12 = pickupButtonSubtitle.getX();
                pickupButtonSubtitle2 = DeliveryV6PickupButtonView.this.getPickupButtonSubtitle();
                if (textAtomV2View.getX() - Math.max(width, x12 + pickupButtonSubtitle2.getWidth()) < ResourceExtKt.toPx(8)) {
                    ViewExtKt.gone(textAtomV2View);
                }
            }
        });
    }

    private final ConstraintLayout getConstraintLayout() {
        return (ConstraintLayout) this.constraintLayout.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPickupButtonBadge() {
        return (TextAtomV2View) this.pickupButtonBadge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getPickupButtonIcon() {
        return (ImageView) this.pickupButtonIcon.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPickupButtonSubtitle() {
        return (TextAtomV2View) this.pickupButtonSubtitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPickupButtonTitle() {
        return (TextAtomV2View) this.pickupButtonTitle.getValue();
    }

    public final void bind(@NotNull PickupButtonVo pickupButton) {
        Intrinsics.checkNotNullParameter(pickupButton, "pickupButton");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setCardBackgroundColor(styleParser.parseColor(context, pickupButton.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        TextHolderKt.bindOrGone$default(getPickupButtonTitle(), pickupButton.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getPickupButtonSubtitle(), pickupButton.getSubtitle(), null, 2, null);
        ImageViewExtKt.loadImageOrGone(getPickupButtonIcon(), pickupButton.getIcon());
        ImageView pickupButtonIcon = getPickupButtonIcon();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(pickupButtonIcon, Integer.valueOf(styleParser.parseColor(context2, pickupButton.getIconTintColor(), UniColors.GRAPHIC_NEUTRAL.getResId())));
        bindPickupBadge(getPickupButtonBadge(), pickupButton.getPickupBadge());
    }
}
