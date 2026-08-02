package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.PdpViewPickupButtonBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0004J\u0016\u0010\u0010\u001a\u00020\r*\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpViewPickupButtonBinding;", "bind", "", "pickupButton", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "bindPickupBadge", "pickupBadge", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupButtonView extends CardView {

    @NotNull
    private final PdpViewPickupButtonBinding binding;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickupButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindPickupBadge(final PdpViewPickupButtonBinding pdpViewPickupButtonBinding, PickupBadgeVO pickupBadgeVO) {
        DisplayMetrics displayMetrics = getRootView().getContext().getResources().getDisplayMetrics();
        if (((int) (((Number) r2.b()).intValue() / ((Number) new Pair(Float.valueOf(displayMetrics.density), Integer.valueOf(displayMetrics.widthPixels)).a()).floatValue())) < 320 || pickupBadgeVO == null) {
            TextAtomV2View pickupBadgeTav = pdpViewPickupButtonBinding.pickupBadgeTav;
            Intrinsics.checkNotNullExpressionValue(pickupBadgeTav, "pickupBadgeTav");
            ViewExtKt.gone(pickupBadgeTav);
        } else {
            TextAtomV2View pickupBadgeTav2 = pdpViewPickupButtonBinding.pickupBadgeTav;
            Intrinsics.checkNotNullExpressionValue(pickupBadgeTav2, "pickupBadgeTav");
            TextHolderKt.bindOrGone$default(pickupBadgeTav2, pickupBadgeVO.getText(), null, 2, null);
            TextAtomV2View pickupBadgeTav3 = pdpViewPickupButtonBinding.pickupBadgeTav;
            Intrinsics.checkNotNullExpressionValue(pickupBadgeTav3, "pickupBadgeTav");
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewExtKt.setBackgroundTint(pickupBadgeTav3, styleParser.parseColor(context, pickupBadgeVO.getBackgroundColor(), UniColors.LAYER_FLOOR_0.getResId()));
        }
        ConstraintLayout pickupRootCl = pdpViewPickupButtonBinding.pickupRootCl;
        Intrinsics.checkNotNullExpressionValue(pickupRootCl, "pickupRootCl");
        pickupRootCl.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupButtonView$bindPickupBadge$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                if (PdpViewPickupButtonBinding.this.pickupBadgeTav.getX() - Math.max(PdpViewPickupButtonBinding.this.titleTav.getX() + PdpViewPickupButtonBinding.this.titleTav.getWidth(), PdpViewPickupButtonBinding.this.subtitleTav.getX() + PdpViewPickupButtonBinding.this.subtitleTav.getWidth()) < ResourceExtKt.toPx(8)) {
                    TextAtomV2View pickupBadgeTav4 = PdpViewPickupButtonBinding.this.pickupBadgeTav;
                    Intrinsics.checkNotNullExpressionValue(pickupBadgeTav4, "pickupBadgeTav");
                    ViewExtKt.gone(pickupBadgeTav4);
                }
            }
        });
    }

    public final void bind(@NotNull PickupButtonVo pickupButton) {
        Intrinsics.checkNotNullParameter(pickupButton, "pickupButton");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setCardBackgroundColor(styleParser.parseColor(context, pickupButton.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        PdpViewPickupButtonBinding pdpViewPickupButtonBinding = this.binding;
        TextAtomV2View titleTav = pdpViewPickupButtonBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, pickupButton.getTitle(), null, 2, null);
        TextAtomV2View subtitleTav = pdpViewPickupButtonBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone$default(subtitleTav, pickupButton.getSubtitle(), null, 2, null);
        ImageView pickupIconIv = pdpViewPickupButtonBinding.pickupIconIv;
        Intrinsics.checkNotNullExpressionValue(pickupIconIv, "pickupIconIv");
        ImageViewExtKt.loadImageOrGone(pickupIconIv, pickupButton.getIcon());
        ImageView pickupIconIv2 = pdpViewPickupButtonBinding.pickupIconIv;
        Intrinsics.checkNotNullExpressionValue(pickupIconIv2, "pickupIconIv");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(pickupIconIv2, Integer.valueOf(styleParser.parseColor(context2, pickupButton.getIconTintColor(), UniColors.GRAPHIC_NEUTRAL.getResId())));
        bindPickupBadge(pdpViewPickupButtonBinding, pickupButton.getPickupBadge());
    }

    public /* synthetic */ PickupButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = PdpViewPickupButtonBinding.inflate(LayoutInflater.from(context), this, true);
    }
}
