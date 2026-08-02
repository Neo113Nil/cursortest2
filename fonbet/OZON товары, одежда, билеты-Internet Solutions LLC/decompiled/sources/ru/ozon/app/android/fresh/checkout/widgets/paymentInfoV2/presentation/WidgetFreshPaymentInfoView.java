package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/WidgetFreshPaymentInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getTitleButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "paymentsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getPaymentsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "dynamicElementsRV", "getDynamicElementsRV", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WidgetFreshPaymentInfoView extends ConstraintLayout {

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final RecyclerView dynamicElementsRV;

    @NotNull
    private final RecyclerView paymentsRv;

    @NotNull
    private final SmallButtonView titleButton;

    @NotNull
    private final TextAtomView titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp14 = ResourceExtKt.toPx(14);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp24 = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/WidgetFreshPaymentInfoView$Companion;", "", "<init>", "()V", "", "ZERO_HORIZONTAL_BIAS", "F", "", "ZERO_WIDTH", "I", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetFreshPaymentInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final RecyclerView getDynamicElementsRV() {
        return this.dynamicElementsRV;
    }

    @NotNull
    public final RecyclerView getPaymentsRv() {
        return this.paymentsRv;
    }

    @NotNull
    public final SmallButtonView getTitleButton() {
        return this.titleButton;
    }

    @NotNull
    public final TextAtomView getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetFreshPaymentInfoView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        C2438a.e(textAtomView, R$id.titleTv, -2, -2);
        addView(textAtomView);
        this.titleTv = textAtomView;
        SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
        smallButtonView.setId(R$id.titleButton);
        smallButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(smallButtonView);
        this.titleButton = smallButtonView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.paymentsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        addView(recyclerView);
        this.paymentsRv = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.dynamicElementsRV);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setNestedScrollingEnabled(false);
        addView(recyclerView2);
        this.dynamicElementsRV = recyclerView2;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{textAtomView.getId(), smallButtonView.getId()});
        barrier.f(3);
        addView(barrier);
        this.barrier = barrier;
        setId(R$id.widgetFreshPaymentInfoView);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary));
        int i12 = dp16;
        ViewExtKt.updatePadding$default(this, 0, 0, 0, i12, 7, null);
        d dVar = new d();
        dVar.p(this);
        int id2 = textAtomView.getId();
        int i13 = dp24;
        ConstraintSetExtKt.topToTop(dVar, id2, 0, i13);
        ConstraintSetExtKt.startToStart(dVar, textAtomView.getId(), 0, i12);
        ConstraintSetExtKt.endToStart(dVar, textAtomView.getId(), smallButtonView.getId(), dp8);
        dVar.c0(0.0f, textAtomView.getId());
        dVar.C(textAtomView.getId(), true);
        ConstraintSetExtKt.topToTop(dVar, smallButtonView.getId(), 0, i13);
        ConstraintSetExtKt.endToEnd(dVar, smallButtonView.getId(), 0, i12);
        ConstraintSetExtKt.bottomToBottom$default(dVar, smallButtonView.getId(), barrier.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, recyclerView.getId(), barrier.getId(), dp14);
        ConstraintSetExtKt.startToStart$default(dVar, recyclerView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, recyclerView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, recyclerView2.getId(), recyclerView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, recyclerView2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, recyclerView2.getId(), 0, 0, 4, null);
        dVar.f(this);
    }
}
