package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerDelegateImpl;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "firstButton", "LSc/j;", "secondButton", "counterView", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;", "initState", "", "initialize", "(Landroid/view/ViewGroup;Landroid/view/View;LSc/j;LSc/j;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;)V", "state", "Lkotlin/Function0;", "onFinish", "setupButtons", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;Lkotlin/jvm/functions/Function0;)V", "currentState", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;", "Landroid/view/View;", "LSc/j;", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5ButtonsContainerDelegateImpl {
    private ViewGroup container;
    private InterfaceC4008j<? extends View> counterView;
    private CartButtonsV5ContainerState currentState;
    private View firstButton;
    private InterfaceC4008j<? extends View> secondButton;

    public void initialize(@NotNull ViewGroup container, @NotNull View firstButton, @NotNull InterfaceC4008j<? extends View> secondButton, @NotNull InterfaceC4008j<? extends View> counterView, @NotNull CartButtonsV5ContainerState initState) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        Intrinsics.checkNotNullParameter(secondButton, "secondButton");
        Intrinsics.checkNotNullParameter(counterView, "counterView");
        Intrinsics.checkNotNullParameter(initState, "initState");
        this.currentState = initState;
        this.counterView = counterView;
        this.firstButton = firstButton;
        this.secondButton = secondButton;
        this.container = container;
    }

    public void setupButtons(@NotNull CartButtonsV5ContainerState state, @NotNull Function0<Unit> onFinish) {
        CartButtonsV5ContainerState cartButtonsV5ContainerState;
        View value;
        CartButtonsV5ContainerState cartButtonsV5ContainerState2;
        View value2;
        View value3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        CartButtonsV5ContainerState cartButtonsV5ContainerState3 = CartButtonsV5ContainerState.SINGLE_COUNTER;
        if (state == cartButtonsV5ContainerState3 && this.currentState == CartButtonsV5ContainerState.SINGLE) {
            ViewGroup viewGroup = this.container;
            if (viewGroup != null) {
                InterfaceC4008j<? extends View> interfaceC4008j = this.counterView;
                viewGroup.addView(interfaceC4008j != null ? interfaceC4008j.getValue() : null);
            }
            onFinish.invoke();
        } else if (state == CartButtonsV5ContainerState.SINGLE && this.currentState == cartButtonsV5ContainerState3) {
            ViewGroup viewGroup2 = this.container;
            if (viewGroup2 != null) {
                InterfaceC4008j<? extends View> interfaceC4008j2 = this.counterView;
                viewGroup2.removeView(interfaceC4008j2 != null ? interfaceC4008j2.getValue() : null);
            }
            onFinish.invoke();
        } else {
            CartButtonsV5ContainerState cartButtonsV5ContainerState4 = CartButtonsV5ContainerState.DOUBLE_BUTTONS;
            if (state == cartButtonsV5ContainerState4 && this.currentState == CartButtonsV5ContainerState.DOUBLE_FIRST) {
                ViewGroup viewGroup3 = this.container;
                if (viewGroup3 != null) {
                    viewGroup3.removeAllViews();
                }
                ViewGroup viewGroup4 = this.container;
                if (viewGroup4 != null) {
                    viewGroup4.addView(this.firstButton);
                }
                ViewGroup viewGroup5 = this.container;
                if (viewGroup5 != null) {
                    InterfaceC4008j<? extends View> interfaceC4008j3 = this.secondButton;
                    viewGroup5.addView(interfaceC4008j3 != null ? interfaceC4008j3.getValue() : null);
                }
                View view = this.firstButton;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.weight = 1.0f;
                    view.setLayoutParams(layoutParams2);
                }
                InterfaceC4008j<? extends View> interfaceC4008j4 = this.secondButton;
                if (interfaceC4008j4 != null && (value3 = interfaceC4008j4.getValue()) != null) {
                    ViewGroup.LayoutParams layoutParams3 = value3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.leftMargin = Dimens.INSTANCE.getDP_8();
                    layoutParams4.weight = 1.0f;
                    value3.setLayoutParams(layoutParams4);
                }
                onFinish.invoke();
            } else if (state == cartButtonsV5ContainerState4 && this.currentState == CartButtonsV5ContainerState.DOUBLE_SECOND) {
                ViewGroup viewGroup6 = this.container;
                if (viewGroup6 != null) {
                    viewGroup6.removeAllViews();
                }
                ViewGroup viewGroup7 = this.container;
                if (viewGroup7 != null) {
                    viewGroup7.addView(this.firstButton);
                }
                ViewGroup viewGroup8 = this.container;
                if (viewGroup8 != null) {
                    InterfaceC4008j<? extends View> interfaceC4008j5 = this.secondButton;
                    viewGroup8.addView(interfaceC4008j5 != null ? interfaceC4008j5.getValue() : null);
                }
                View view2 = this.firstButton;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    layoutParams6.weight = 1.0f;
                    view2.setLayoutParams(layoutParams6);
                }
                InterfaceC4008j<? extends View> interfaceC4008j6 = this.secondButton;
                if (interfaceC4008j6 != null && (value2 = interfaceC4008j6.getValue()) != null) {
                    ViewGroup.LayoutParams layoutParams7 = value2.getLayoutParams();
                    if (layoutParams7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.leftMargin = Dimens.INSTANCE.getDP_8();
                    layoutParams8.weight = 1.0f;
                    value2.setLayoutParams(layoutParams8);
                }
                onFinish.invoke();
            } else {
                CartButtonsV5ContainerState cartButtonsV5ContainerState5 = CartButtonsV5ContainerState.DOUBLE_FIRST;
                if (state == cartButtonsV5ContainerState5 && ((cartButtonsV5ContainerState2 = this.currentState) == cartButtonsV5ContainerState4 || cartButtonsV5ContainerState2 == CartButtonsV5ContainerState.DOUBLE_SECOND)) {
                    ViewGroup viewGroup9 = this.container;
                    if (viewGroup9 != null) {
                        viewGroup9.removeAllViews();
                    }
                    ViewGroup viewGroup10 = this.container;
                    if (viewGroup10 != null) {
                        viewGroup10.addView(this.firstButton);
                    }
                    ViewGroup viewGroup11 = this.container;
                    if (viewGroup11 != null) {
                        InterfaceC4008j<? extends View> interfaceC4008j7 = this.counterView;
                        viewGroup11.addView(interfaceC4008j7 != null ? interfaceC4008j7.getValue() : null);
                    }
                    View view3 = this.firstButton;
                    if (view3 != null) {
                        ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                        if (layoutParams9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                        layoutParams10.weight = 1.0f;
                        view3.setLayoutParams(layoutParams10);
                    }
                    onFinish.invoke();
                } else if (state == CartButtonsV5ContainerState.DOUBLE_SECOND && ((cartButtonsV5ContainerState = this.currentState) == cartButtonsV5ContainerState4 || cartButtonsV5ContainerState == cartButtonsV5ContainerState5)) {
                    ViewGroup viewGroup12 = this.container;
                    if (viewGroup12 != null) {
                        viewGroup12.removeAllViews();
                    }
                    ViewGroup viewGroup13 = this.container;
                    if (viewGroup13 != null) {
                        InterfaceC4008j<? extends View> interfaceC4008j8 = this.secondButton;
                        viewGroup13.addView(interfaceC4008j8 != null ? interfaceC4008j8.getValue() : null);
                    }
                    ViewGroup viewGroup14 = this.container;
                    if (viewGroup14 != null) {
                        InterfaceC4008j<? extends View> interfaceC4008j9 = this.counterView;
                        viewGroup14.addView(interfaceC4008j9 != null ? interfaceC4008j9.getValue() : null);
                    }
                    InterfaceC4008j<? extends View> interfaceC4008j10 = this.secondButton;
                    if (interfaceC4008j10 != null && (value = interfaceC4008j10.getValue()) != null) {
                        ViewGroup.LayoutParams layoutParams11 = value.getLayoutParams();
                        if (layoutParams11 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
                        layoutParams12.leftMargin = 0;
                        layoutParams12.weight = 1.0f;
                        value.setLayoutParams(layoutParams12);
                    }
                    onFinish.invoke();
                } else {
                    onFinish.invoke();
                }
            }
        }
        this.currentState = state;
    }
}
