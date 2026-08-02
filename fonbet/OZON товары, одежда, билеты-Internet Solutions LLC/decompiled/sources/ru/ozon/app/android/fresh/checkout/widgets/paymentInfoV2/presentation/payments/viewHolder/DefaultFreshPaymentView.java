package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder;

import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/DefaultFreshPaymentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardBgIv", "Landroid/widget/ImageView;", "getCardBgIv", "()Landroid/widget/ImageView;", "iconIv", "getIconIv", "rightIconIv", "getRightIconIv", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "badgeV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultFreshPaymentView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeV;

    @NotNull
    private final ImageView cardBgIv;

    @NotNull
    private final ImageView iconIv;

    @NotNull
    private final ImageView rightIconIv;

    @NotNull
    private final TextAtomView titleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int containerMinWidth = ResourceExtKt.toPx(116);
    private static final int containerMinHeight = ResourceExtKt.toPx(74);
    private static final int containerMarginTop = ResourceExtKt.toPx(10);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp14 = ResourceExtKt.toPx(14);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp24 = ResourceExtKt.toPx(24);
    private static final int dp40 = ResourceExtKt.toPx(40);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/DefaultFreshPaymentView$Companion;", "", "<init>", "()V", "", "SIZE_ZERO", "I", "", "CENTER_HORIZONTAL_BIAS", "F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DefaultFreshPaymentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final BadgeView getBadgeV() {
        return this.badgeV;
    }

    @NotNull
    public final ImageView getCardBgIv() {
        return this.cardBgIv;
    }

    @NotNull
    public final ImageView getIconIv() {
        return this.iconIv;
    }

    @NotNull
    public final ImageView getRightIconIv() {
        return this.rightIconIv;
    }

    @NotNull
    public final TextAtomView getTitleTav() {
        return this.titleTav;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFreshPaymentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.cardBgIv);
        imageView.setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(imageView);
        this.cardBgIv = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R$id.iconIv);
        int i12 = dp40;
        int i13 = dp24;
        imageView2.setLayoutParams(new ConstraintLayout.b(i12, i13));
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(imageView2);
        this.iconIv = imageView2;
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(R$id.rightIconIv);
        imageView3.setLayoutParams(new ConstraintLayout.b(i13, i13));
        addView(imageView3);
        this.rightIconIv = imageView3;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(R$id.titleTav);
        textAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomView.setMaxLines(1);
        textAtomView.setGravity(17);
        addView(textAtomView);
        this.titleTav = textAtomView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        a.c(badgeView, R$id.badgeV, -2, -2);
        addView(badgeView);
        this.badgeV = badgeView;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, containerMarginTop, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        setLayoutParams(marginLayoutParams);
        setMinWidth(containerMinWidth);
        setMinHeight(containerMinHeight);
        setClipChildren(false);
        d dVar = new d();
        dVar.p(this);
        int id2 = imageView.getId();
        int i14 = dp6;
        ConstraintSetExtKt.startToStart(dVar, id2, 0, i14);
        ConstraintSetExtKt.topToTop(dVar, imageView.getId(), 0, i14);
        ConstraintSetExtKt.endToEnd(dVar, imageView.getId(), 0, i14);
        ConstraintSetExtKt.bottomToBottom(dVar, imageView.getId(), 0, i14);
        int id3 = imageView2.getId();
        int i15 = dp14;
        ConstraintSetExtKt.startToStart(dVar, id3, 0, i15);
        ConstraintSetExtKt.topToTop(dVar, imageView2.getId(), 0, dp16);
        ConstraintSetExtKt.endToEnd(dVar, imageView2.getId(), 0, i15);
        dVar.c0(0.5f, imageView2.getId());
        ConstraintSetExtKt.topToTop$default(dVar, imageView3.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, imageView3.getId(), 0, i14);
        ConstraintSetExtKt.bottomToBottom$default(dVar, imageView3.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart(dVar, textAtomView.getId(), 0, i15);
        ConstraintSetExtKt.endToEnd(dVar, textAtomView.getId(), 0, i15);
        ConstraintSetExtKt.bottomToBottom(dVar, textAtomView.getId(), 0, i15);
        dVar.c0(0.5f, textAtomView.getId());
        ConstraintSetExtKt.startToStart$default(dVar, badgeView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, badgeView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, badgeView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, badgeView.getId(), 0, 0, 4, null);
        dVar.C(badgeView.getId(), true);
        dVar.f(this);
    }
}
