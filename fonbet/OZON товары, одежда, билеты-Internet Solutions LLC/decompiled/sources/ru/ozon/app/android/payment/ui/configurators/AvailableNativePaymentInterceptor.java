package ru.ozon.app.android.payment.ui.configurators;

import A00.a;
import L00.i;
import QZ.g;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/configurators/AvailableNativePaymentInterceptor;", "LQZ/g;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "sberPayManager", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;)V", "", "", "findAvailableNativePayments", "()Ljava/util/List;", "Li10/h;", "state", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvailableNativePaymentInterceptor implements g {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SberPayManager sberPayManager;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/ui/configurators/AvailableNativePaymentInterceptor$Companion;", "", "<init>", "()V", "AVAILABLE_NATIVE_PAYMENT_TYPES", "", "SBER_PAY", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AvailableNativePaymentInterceptor(@NotNull SberPayManager sberPayManager) {
        Intrinsics.checkNotNullParameter(sberPayManager, "sberPayManager");
        this.sberPayManager = sberPayManager;
    }

    private final List<Integer> findAvailableNativePayments() {
        return C7714v.c0(this.sberPayManager.getIsReadyForSPaySdk() ? 1 : null);
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        List<Integer> findAvailableNativePayments = findAvailableNativePayments();
        if (!findAvailableNativePayments.isEmpty()) {
            state.f().put("availableNativePaymentTypes", findAvailableNativePayments);
        }
        return h.a(state, null, i10.g.POST, null, null, null, 61);
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
