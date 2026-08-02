package ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase;

import Ar.d;
import DN.a;
import DN.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.R$string;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.SmallIconButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.databinding.JointPurchaseButtonWithQuantityUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0011R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R*\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R*\u00104\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0011\u0010F\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/jointpurchase/JointPurchaseButtonWithQuantityView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getIconButtonAppearance", "()Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "", "initClickListeners", "()V", "Landroid/view/ViewGroup$LayoutParams;", "hideButtonsShowToCart", "()Landroid/view/ViewGroup$LayoutParams;", "showButtonsHideToCart", "Landroid/view/View;", "fadeView", "enableIconButton", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;Landroid/view/View;)V", "disableIconButton", "", "enabled", "setEnabled", "(Z)V", "onBindComplete", "setupClick", "Lru/ozon/uni/databinding/JointPurchaseButtonWithQuantityUniBinding;", "mBinding", "Lru/ozon/uni/databinding/JointPurchaseButtonWithQuantityUniBinding;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "atomButton$delegate", "LSc/j;", "getAtomButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "atomButton", AppMeasurementSdk.ConditionalUserProperty.VALUE, "availableCount", "I", "getAvailableCount", "()I", "setAvailableCount", "(I)V", "minCount", "getMinCount", "setMinCount", "count", "getCount", "setCount", "Lkotlin/Function1;", "onPlusClick", "Lkotlin/jvm/functions/Function1;", "getOnPlusClick", "()Lkotlin/jvm/functions/Function1;", "setOnPlusClick", "(Lkotlin/jvm/functions/Function1;)V", "onMinusClick", "getOnMinusClick", "setOnMinusClick", "Landroid/view/View$OnClickListener;", "buttonListener", "Landroid/view/View$OnClickListener;", "getBinding", "()Lru/ozon/uni/databinding/JointPurchaseButtonWithQuantityUniBinding;", "binding", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JointPurchaseButtonWithQuantityView extends ConstraintLayout implements AtomView {

    /* renamed from: atomButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j atomButton;
    private int availableCount;

    @NotNull
    private final View.OnClickListener buttonListener;
    private int count;
    private JointPurchaseButtonWithQuantityUniBinding mBinding;
    private int minCount;
    private Function1<? super JointPurchaseButtonWithQuantityView, Unit> onMinusClick;
    private Function1<? super JointPurchaseButtonWithQuantityView, Unit> onPlusClick;
    public static final int $stable = 8;

    @NotNull
    private static final ViewGroup.LayoutParams defaultLp = new ViewGroup.LayoutParams(-1, -2);

    public /* synthetic */ JointPurchaseButtonWithQuantityView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttonListener$lambda$0(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView, View view) {
        jointPurchaseButtonWithQuantityView.setCount(jointPurchaseButtonWithQuantityView.count + jointPurchaseButtonWithQuantityView.minCount);
        Function1<? super JointPurchaseButtonWithQuantityView, Unit> function1 = jointPurchaseButtonWithQuantityView.onPlusClick;
        if (function1 != null) {
            function1.invoke(jointPurchaseButtonWithQuantityView);
        }
    }

    private final void disableIconButton(SmallIconButtonView smallIconButtonView, View view) {
        ViewExtKt.disable(smallIconButtonView);
        ViewExtKt.show(view);
    }

    private final void enableIconButton(SmallIconButtonView smallIconButtonView, View view) {
        ViewExtKt.enable(smallIconButtonView);
        ViewExtKt.gone(view);
    }

    private final StyleAppearance<SmallIconButtonView> getIconButtonAppearance() {
        StyleAppearance<SmallIconButtonView> of2 = StyleAppearance.INSTANCE.of(new SmallIconButtonAppearance());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        of2.read(context, R$style.SmallIconButton_Grey);
        return of2;
    }

    private final ViewGroup.LayoutParams hideButtonsShowToCart() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = defaultLp;
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        Group addToCartCounterGroup = getBinding().addToCartCounterGroup;
        Intrinsics.checkNotNullExpressionValue(addToCartCounterGroup, "addToCartCounterGroup");
        ViewExtKt.gone(addToCartCounterGroup);
        ViewExtKt.show(getAtomButton());
        return layoutParams;
    }

    private final void initClickListeners() {
        getAtomButton().setOnClickListener(this.buttonListener);
        getBinding().plusIconButtonAtom.setOnClickListener(new a(this, 1));
        getBinding().minusIconButtonAtom.setOnClickListener(new b(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$2(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView, View view) {
        int i11 = jointPurchaseButtonWithQuantityView.count + 1;
        int i12 = jointPurchaseButtonWithQuantityView.minCount;
        if (i11 < i12) {
            i11 = i12;
        }
        jointPurchaseButtonWithQuantityView.setCount(i11);
        Function1<? super JointPurchaseButtonWithQuantityView, Unit> function1 = jointPurchaseButtonWithQuantityView.onPlusClick;
        if (function1 != null) {
            function1.invoke(jointPurchaseButtonWithQuantityView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$3(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView, View view) {
        int i11 = jointPurchaseButtonWithQuantityView.count - 1;
        if (i11 < jointPurchaseButtonWithQuantityView.minCount) {
            i11 = 0;
        }
        jointPurchaseButtonWithQuantityView.setCount(i11);
        Function1<? super JointPurchaseButtonWithQuantityView, Unit> function1 = jointPurchaseButtonWithQuantityView.onMinusClick;
        if (function1 != null) {
            function1.invoke(jointPurchaseButtonWithQuantityView);
        }
    }

    private final ViewGroup.LayoutParams showButtonsHideToCart() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = defaultLp;
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        Group addToCartCounterGroup = getBinding().addToCartCounterGroup;
        Intrinsics.checkNotNullExpressionValue(addToCartCounterGroup, "addToCartCounterGroup");
        ViewExtKt.show(addToCartCounterGroup);
        ViewExtKt.gone(getAtomButton());
        return layoutParams;
    }

    @NotNull
    public final SmallButtonView getAtomButton() {
        return (SmallButtonView) this.atomButton.getValue();
    }

    @NotNull
    public final JointPurchaseButtonWithQuantityUniBinding getBinding() {
        JointPurchaseButtonWithQuantityUniBinding jointPurchaseButtonWithQuantityUniBinding = this.mBinding;
        Intrinsics.f(jointPurchaseButtonWithQuantityUniBinding);
        return jointPurchaseButtonWithQuantityUniBinding;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final void onBindComplete() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase.JointPurchaseButtonWithQuantityView$onBindComplete$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0) {
                    return;
                }
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((JointPurchaseButtonWithQuantityView) this).requestLayout();
            }
        });
    }

    public final void setAvailableCount(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.availableCount = i11;
    }

    public final void setCount(int i11) {
        if (i11 <= 0 || i11 < this.minCount) {
            hideButtonsShowToCart();
            SmallIconButtonView plusIconButtonAtom = getBinding().plusIconButtonAtom;
            Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom, "plusIconButtonAtom");
            View plusFadeV = getBinding().plusFadeV;
            Intrinsics.checkNotNullExpressionValue(plusFadeV, "plusFadeV");
            enableIconButton(plusIconButtonAtom, plusFadeV);
            i11 = 0;
        } else if (i11 >= this.availableCount) {
            SmallIconButtonView plusIconButtonAtom2 = getBinding().plusIconButtonAtom;
            Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom2, "plusIconButtonAtom");
            View plusFadeV2 = getBinding().plusFadeV;
            Intrinsics.checkNotNullExpressionValue(plusFadeV2, "plusFadeV");
            disableIconButton(plusIconButtonAtom2, plusFadeV2);
            showButtonsHideToCart();
            i11 = this.availableCount;
        } else {
            SmallIconButtonView plusIconButtonAtom3 = getBinding().plusIconButtonAtom;
            Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom3, "plusIconButtonAtom");
            View plusFadeV3 = getBinding().plusFadeV;
            Intrinsics.checkNotNullExpressionValue(plusFadeV3, "plusFadeV");
            enableIconButton(plusIconButtonAtom3, plusFadeV3);
            showButtonsHideToCart();
        }
        this.count = i11;
        getBinding().quantityTav.setText(getContext().getString(R$string.add_to_cart_with_quantity, Integer.valueOf(this.count)));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            ViewExtKt.enable(getAtomButton());
            SmallIconButtonView minusIconButtonAtom = getBinding().minusIconButtonAtom;
            Intrinsics.checkNotNullExpressionValue(minusIconButtonAtom, "minusIconButtonAtom");
            View minusFadeV = getBinding().minusFadeV;
            Intrinsics.checkNotNullExpressionValue(minusFadeV, "minusFadeV");
            enableIconButton(minusIconButtonAtom, minusFadeV);
            SmallIconButtonView plusIconButtonAtom = getBinding().plusIconButtonAtom;
            Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom, "plusIconButtonAtom");
            View plusFadeV = getBinding().plusFadeV;
            Intrinsics.checkNotNullExpressionValue(plusFadeV, "plusFadeV");
            enableIconButton(plusIconButtonAtom, plusFadeV);
            return;
        }
        ViewExtKt.disable(getAtomButton());
        SmallIconButtonView minusIconButtonAtom2 = getBinding().minusIconButtonAtom;
        Intrinsics.checkNotNullExpressionValue(minusIconButtonAtom2, "minusIconButtonAtom");
        View minusFadeV2 = getBinding().minusFadeV;
        Intrinsics.checkNotNullExpressionValue(minusFadeV2, "minusFadeV");
        disableIconButton(minusIconButtonAtom2, minusFadeV2);
        SmallIconButtonView plusIconButtonAtom2 = getBinding().plusIconButtonAtom;
        Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom2, "plusIconButtonAtom");
        View plusFadeV2 = getBinding().plusFadeV;
        Intrinsics.checkNotNullExpressionValue(plusFadeV2, "plusFadeV");
        disableIconButton(plusIconButtonAtom2, plusFadeV2);
    }

    public final void setMinCount(int i11) {
        this.minCount = i11;
    }

    public final void setOnMinusClick(Function1<? super JointPurchaseButtonWithQuantityView, Unit> function1) {
        this.onMinusClick = function1;
    }

    public final void setOnPlusClick(Function1<? super JointPurchaseButtonWithQuantityView, Unit> function1) {
        this.onPlusClick = function1;
    }

    public final void setupClick() {
        getAtomButton().setOnClickListener(this.buttonListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointPurchaseButtonWithQuantityView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.atomButton = k.b(new JointPurchaseButtonWithQuantityView$atomButton$2(this));
        this.buttonListener = new d(this, 1);
        this.mBinding = JointPurchaseButtonWithQuantityUniBinding.bind(View.inflate(context, R$layout.joint_purchase_button_with_quantity_uni, this));
        int themeColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary);
        StyleAppearance<SmallIconButtonView> iconButtonAppearance = getIconButtonAppearance();
        getBinding().minusIconButtonAtom.setImageResource(R$drawable.ic_m_minus);
        getBinding().minusIconButtonAtom.setTint(themeColor);
        SmallIconButtonView minusIconButtonAtom = getBinding().minusIconButtonAtom;
        Intrinsics.checkNotNullExpressionValue(minusIconButtonAtom, "minusIconButtonAtom");
        iconButtonAppearance.apply(minusIconButtonAtom);
        getBinding().plusIconButtonAtom.setImageResource(R$drawable.ic_m_plus);
        getBinding().plusIconButtonAtom.setTint(themeColor);
        SmallIconButtonView plusIconButtonAtom = getBinding().plusIconButtonAtom;
        Intrinsics.checkNotNullExpressionValue(plusIconButtonAtom, "plusIconButtonAtom");
        iconButtonAppearance.apply(plusIconButtonAtom);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(false);
        initClickListeners();
    }
}
