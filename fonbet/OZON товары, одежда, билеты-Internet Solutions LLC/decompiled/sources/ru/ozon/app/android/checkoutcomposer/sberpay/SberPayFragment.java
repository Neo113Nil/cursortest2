package ru.ozon.app.android.checkoutcomposer.sberpay;

import GZ.g;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.RouterExtKt;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sberpay/SberPayFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "LGZ/g;", "ozonRouter", "LGZ/g;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "sberPayManager", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "", "paymentIsDone", "Z", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SberPayFragment extends ComponentCallbacksC5392m {
    private g ozonRouter;
    private boolean paymentIsDone;
    private SberPayManager sberPayManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sberpay/SberPayFragment$Companion;", "", "<init>", "()V", "LINK", "", "CANCEL_LINK", "PAY_INFO", "TAG", "newInstance", "Lru/ozon/app/android/checkoutcomposer/sberpay/SberPayFragment;", "link", "cancelLink", "payInfo", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SberPayFragment newInstance(@NotNull String link, @NotNull String cancelLink, @NotNull OrderDO.PayBySberPay.SberPayInfo payInfo) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(cancelLink, "cancelLink");
            Intrinsics.checkNotNullParameter(payInfo, "payInfo");
            SberPayFragment sberPayFragment = new SberPayFragment();
            Bundle bundle = new Bundle();
            bundle.putString("link", link);
            bundle.putString("cancelLink", cancelLink);
            bundle.putParcelable("payInfo", payInfo);
            sberPayFragment.setArguments(bundle);
            return sberPayFragment;
        }

        private Companion() {
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.ozonRouter = ((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getOzonRouter();
        if (CheckoutPaymentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPaymentComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, CheckoutPaymentComponentApi.class).getDependencyStorage();
        if (CheckoutPaymentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPaymentComponentApi is not DiComponent");
        }
        this.sberPayManager = ((CheckoutPaymentComponentApi) dependencyStorage2.b(CheckoutPaymentComponentApi.class)).getSberPayManager();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.sber_pay_fragment, container, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        M activity = getActivity();
        BottomNavigationStateController bottomNavigationStateController = activity instanceof BottomNavigationStateController ? (BottomNavigationStateController) activity : null;
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.hideBottomNavigation();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        M activity = getActivity();
        BottomNavigationStateController bottomNavigationStateController = activity instanceof BottomNavigationStateController ? (BottomNavigationStateController) activity : null;
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigation();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.paymentIsDone) {
            g gVar = this.ozonRouter;
            if (gVar != null) {
                RouterExtKt.clearBackStack(gVar);
                return;
            } else {
                Intrinsics.n("ozonRouter");
                throw null;
            }
        }
        Bundle arguments = getArguments();
        OrderDO.PayBySberPay.SberPayInfo sberPayInfo = arguments != null ? (OrderDO.PayBySberPay.SberPayInfo) arguments.getParcelable("payInfo") : null;
        if (sberPayInfo == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("link") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("cancelLink") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SberPayManager sberPayManager = this.sberPayManager;
        if (sberPayManager == null) {
            Intrinsics.n("sberPayManager");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        sberPayManager.payWithBankInvoiceId(sberPayInfo, requireContext, new SberPayFragment$onViewCreated$1(this, string), new SberPayFragment$onViewCreated$2(this, string2));
    }
}
