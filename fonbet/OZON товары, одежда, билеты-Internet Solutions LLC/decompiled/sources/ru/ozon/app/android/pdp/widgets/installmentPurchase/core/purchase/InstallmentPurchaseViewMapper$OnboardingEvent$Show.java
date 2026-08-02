package ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase;

import A00.a;
import T7.E;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseViewMapper$OnboardingEvent$Show", "", "", "additionalOnboardingHeight", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAdditionalOnboardingHeight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InstallmentPurchaseViewMapper$OnboardingEvent$Show implements a.J.InterfaceC0007a {
    private final int additionalOnboardingHeight;

    public InstallmentPurchaseViewMapper$OnboardingEvent$Show(int i11) {
        this.additionalOnboardingHeight = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InstallmentPurchaseViewMapper$OnboardingEvent$Show) && this.additionalOnboardingHeight == ((InstallmentPurchaseViewMapper$OnboardingEvent$Show) other).additionalOnboardingHeight;
    }

    public final int getAdditionalOnboardingHeight() {
        return this.additionalOnboardingHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.additionalOnboardingHeight);
    }

    @NotNull
    public String toString() {
        return E.a(this.additionalOnboardingHeight, "Show(additionalOnboardingHeight=", ")");
    }
}
