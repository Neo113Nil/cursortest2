package ru.ozon.app.android.checkoutcomposer.common.paymentButton.presentation.sticky;

import android.view.View;
import android.view.ViewGroup;
import d20.AbstractC6065b;
import j10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.models.PaymentButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/paymentButton/presentation/sticky/PaymentButtonStickyViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonVO;)V", "removeView", "()V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "view", "Landroid/view/View;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "buttonView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getMetricView", "()Landroid/view/View;", "metricView", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentButtonStickyViewHolder extends AbstractC6065b<PaymentButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final SingleAtom buttonView;

    @NotNull
    private final ViewGroup composerRootView;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final View view;

    public PaymentButtonStickyViewHolder(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences ref, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.composerRootView = composerRootView;
        this.ref = ref;
        this.actionHandler = new ActionHandler.Builder(ref, voHelper, PaymentButtonVO.class).onClick(new PaymentButtonStickyViewHolder$actionHandler$1(this)).buildHandler();
        View inflate = ViewGroupExtKt.inflate(composerRootView, R$layout.widget_payment_button);
        this.view = inflate;
        this.buttonView = inflate instanceof SingleAtom ? (SingleAtom) inflate : null;
        ComposerViewExtensionKt.composerBottomContainer(composerRootView).addView(inflate);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    /* renamed from: getMetricView, reason: from getter */
    public View getView() {
        return this.view;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        super.removeView();
        SingleAtom singleAtom = this.buttonView;
        if (singleAtom != null) {
            ComposerViewExtensionKt.composerBottomContainer(this.composerRootView).removeView(singleAtom);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PaymentButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom singleAtom = this.buttonView;
        if (singleAtom != null) {
            singleAtom.setOnAction(this.actionHandler);
            SingleAtom.bind$default(singleAtom, item.getButton(), false, 2, null);
        }
    }
}
