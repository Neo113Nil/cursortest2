package ru.ozon.app.android.orderdetails.orderTotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/StickyDTO;", "", "smallPaymentButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/orderdetails/orderTotal/data/StickySummaryDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;Lru/ozon/app/android/orderdetails/orderTotal/data/StickySummaryDTO;)V", "getSmallPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;", "getSummary", "()Lru/ozon/app/android/orderdetails/orderTotal/data/StickySummaryDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StickyDTO {
    public static final int $stable = (TextAtom.$stable | Price.$stable) | ButtonV3Atom.PaymentButtonSmall.$stable;

    @NotNull
    private final ButtonV3Atom.PaymentButtonSmall smallPaymentButton;

    @NotNull
    private final StickySummaryDTO summary;

    public StickyDTO(@NotNull ButtonV3Atom.PaymentButtonSmall smallPaymentButton, @NotNull StickySummaryDTO summary) {
        Intrinsics.checkNotNullParameter(smallPaymentButton, "smallPaymentButton");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.smallPaymentButton = smallPaymentButton;
        this.summary = summary;
    }

    public static /* synthetic */ StickyDTO copy$default(StickyDTO stickyDTO, ButtonV3Atom.PaymentButtonSmall paymentButtonSmall, StickySummaryDTO stickySummaryDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentButtonSmall = stickyDTO.smallPaymentButton;
        }
        if ((i11 & 2) != 0) {
            stickySummaryDTO = stickyDTO.summary;
        }
        return stickyDTO.copy(paymentButtonSmall, stickySummaryDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.PaymentButtonSmall getSmallPaymentButton() {
        return this.smallPaymentButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StickySummaryDTO getSummary() {
        return this.summary;
    }

    @NotNull
    public final StickyDTO copy(@NotNull ButtonV3Atom.PaymentButtonSmall smallPaymentButton, @NotNull StickySummaryDTO summary) {
        Intrinsics.checkNotNullParameter(smallPaymentButton, "smallPaymentButton");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new StickyDTO(smallPaymentButton, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyDTO)) {
            return false;
        }
        StickyDTO stickyDTO = (StickyDTO) other;
        return Intrinsics.d(this.smallPaymentButton, stickyDTO.smallPaymentButton) && Intrinsics.d(this.summary, stickyDTO.summary);
    }

    @NotNull
    public final ButtonV3Atom.PaymentButtonSmall getSmallPaymentButton() {
        return this.smallPaymentButton;
    }

    @NotNull
    public final StickySummaryDTO getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return this.summary.hashCode() + (this.smallPaymentButton.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StickyDTO(smallPaymentButton=" + this.smallPaymentButton + ", summary=" + this.summary + ")";
    }
}
