package ru.ozon.app.android.account.orders.selectPayment.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/data/SelectPaymentDTO;", "", "applyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "payments", "", "Lru/ozon/app/android/account/orders/selectPayment/data/PaymentsItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPayments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectPaymentDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton applyButton;
    private final List<PaymentsItemDTO> payments;

    public SelectPaymentDTO(@NotNull ButtonV3Atom.LargeButton applyButton, List<PaymentsItemDTO> list) {
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.applyButton = applyButton;
        this.payments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectPaymentDTO copy$default(SelectPaymentDTO selectPaymentDTO, ButtonV3Atom.LargeButton largeButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = selectPaymentDTO.applyButton;
        }
        if ((i11 & 2) != 0) {
            list = selectPaymentDTO.payments;
        }
        return selectPaymentDTO.copy(largeButton, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    public final List<PaymentsItemDTO> component2() {
        return this.payments;
    }

    @NotNull
    public final SelectPaymentDTO copy(@NotNull ButtonV3Atom.LargeButton applyButton, List<PaymentsItemDTO> payments) {
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new SelectPaymentDTO(applyButton, payments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectPaymentDTO)) {
            return false;
        }
        SelectPaymentDTO selectPaymentDTO = (SelectPaymentDTO) other;
        return Intrinsics.d(this.applyButton, selectPaymentDTO.applyButton) && Intrinsics.d(this.payments, selectPaymentDTO.payments);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    public final List<PaymentsItemDTO> getPayments() {
        return this.payments;
    }

    public int hashCode() {
        int hashCode = this.applyButton.hashCode() * 31;
        List<PaymentsItemDTO> list = this.payments;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelectPaymentDTO(applyButton=" + this.applyButton + ", payments=" + this.payments + ")";
    }
}
