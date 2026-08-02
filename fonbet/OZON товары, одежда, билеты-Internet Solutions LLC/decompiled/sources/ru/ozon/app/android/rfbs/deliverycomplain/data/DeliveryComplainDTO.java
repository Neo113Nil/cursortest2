package ru.ozon.app.android.rfbs.deliverycomplain.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/data/DeliveryComplainDTO;", "", "compliance", "Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "complianceFilled", "Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getCompliance", "()Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "getComplianceFilled", "()Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryComplainDTO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final ButtonV3Atom.LargeButton actionButton;
    private final EnterComplainState compliance;
    private final ComplainCompletedState complianceFilled;

    public DeliveryComplainDTO(EnterComplainState enterComplainState, ComplainCompletedState complainCompletedState, ButtonV3Atom.LargeButton largeButton) {
        this.compliance = enterComplainState;
        this.complianceFilled = complainCompletedState;
        this.actionButton = largeButton;
    }

    public static /* synthetic */ DeliveryComplainDTO copy$default(DeliveryComplainDTO deliveryComplainDTO, EnterComplainState enterComplainState, ComplainCompletedState complainCompletedState, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enterComplainState = deliveryComplainDTO.compliance;
        }
        if ((i11 & 2) != 0) {
            complainCompletedState = deliveryComplainDTO.complianceFilled;
        }
        if ((i11 & 4) != 0) {
            largeButton = deliveryComplainDTO.actionButton;
        }
        return deliveryComplainDTO.copy(enterComplainState, complainCompletedState, largeButton);
    }

    /* renamed from: component1, reason: from getter */
    public final EnterComplainState getCompliance() {
        return this.compliance;
    }

    /* renamed from: component2, reason: from getter */
    public final ComplainCompletedState getComplianceFilled() {
        return this.complianceFilled;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final DeliveryComplainDTO copy(EnterComplainState compliance, ComplainCompletedState complianceFilled, ButtonV3Atom.LargeButton actionButton) {
        return new DeliveryComplainDTO(compliance, complianceFilled, actionButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryComplainDTO)) {
            return false;
        }
        DeliveryComplainDTO deliveryComplainDTO = (DeliveryComplainDTO) other;
        return Intrinsics.d(this.compliance, deliveryComplainDTO.compliance) && Intrinsics.d(this.complianceFilled, deliveryComplainDTO.complianceFilled) && Intrinsics.d(this.actionButton, deliveryComplainDTO.actionButton);
    }

    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    public final EnterComplainState getCompliance() {
        return this.compliance;
    }

    public final ComplainCompletedState getComplianceFilled() {
        return this.complianceFilled;
    }

    public int hashCode() {
        EnterComplainState enterComplainState = this.compliance;
        int hashCode = (enterComplainState == null ? 0 : enterComplainState.hashCode()) * 31;
        ComplainCompletedState complainCompletedState = this.complianceFilled;
        int hashCode2 = (hashCode + (complainCompletedState == null ? 0 : complainCompletedState.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.actionButton;
        return hashCode2 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryComplainDTO(compliance=" + this.compliance + ", complianceFilled=" + this.complianceFilled + ", actionButton=" + this.actionButton + ")";
    }
}
