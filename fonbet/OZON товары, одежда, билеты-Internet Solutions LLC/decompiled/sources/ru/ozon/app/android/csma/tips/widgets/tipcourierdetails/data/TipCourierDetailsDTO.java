package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.core.ChangePayment;
import ru.ozon.app.android.csma.tips.core.TipItem;
import ru.ozon.app.android.csma.tips.core.TipsInput;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO;", "", "tips", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "actionButton", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getTips", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "getActionButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TipsDetails", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierDetailsDTO {

    @NotNull
    private final AtomDTO actionButton;
    private final TipsDetails tips;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "", "tipsVariants", "", "Lru/ozon/app/android/csma/tips/core/TipItem;", "changePayment", "Lru/ozon/app/android/csma/tips/core/ChangePayment;", "tipsInput", "Lru/ozon/app/android/csma/tips/core/TipsInput;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/csma/tips/core/ChangePayment;Lru/ozon/app/android/csma/tips/core/TipsInput;)V", "getTipsVariants", "()Ljava/util/List;", "getChangePayment", "()Lru/ozon/app/android/csma/tips/core/ChangePayment;", "getTipsInput", "()Lru/ozon/app/android/csma/tips/core/TipsInput;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TipsDetails {
        private final ChangePayment changePayment;
        private final TipsInput tipsInput;

        @NotNull
        private final List<TipItem> tipsVariants;

        public TipsDetails(@NotNull List<TipItem> tipsVariants, ChangePayment changePayment, TipsInput tipsInput) {
            Intrinsics.checkNotNullParameter(tipsVariants, "tipsVariants");
            this.tipsVariants = tipsVariants;
            this.changePayment = changePayment;
            this.tipsInput = tipsInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TipsDetails copy$default(TipsDetails tipsDetails, List list, ChangePayment changePayment, TipsInput tipsInput, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = tipsDetails.tipsVariants;
            }
            if ((i11 & 2) != 0) {
                changePayment = tipsDetails.changePayment;
            }
            if ((i11 & 4) != 0) {
                tipsInput = tipsDetails.tipsInput;
            }
            return tipsDetails.copy(list, changePayment, tipsInput);
        }

        @NotNull
        public final List<TipItem> component1() {
            return this.tipsVariants;
        }

        /* renamed from: component2, reason: from getter */
        public final ChangePayment getChangePayment() {
            return this.changePayment;
        }

        /* renamed from: component3, reason: from getter */
        public final TipsInput getTipsInput() {
            return this.tipsInput;
        }

        @NotNull
        public final TipsDetails copy(@NotNull List<TipItem> tipsVariants, ChangePayment changePayment, TipsInput tipsInput) {
            Intrinsics.checkNotNullParameter(tipsVariants, "tipsVariants");
            return new TipsDetails(tipsVariants, changePayment, tipsInput);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TipsDetails)) {
                return false;
            }
            TipsDetails tipsDetails = (TipsDetails) other;
            return Intrinsics.d(this.tipsVariants, tipsDetails.tipsVariants) && Intrinsics.d(this.changePayment, tipsDetails.changePayment) && Intrinsics.d(this.tipsInput, tipsDetails.tipsInput);
        }

        public final ChangePayment getChangePayment() {
            return this.changePayment;
        }

        public final TipsInput getTipsInput() {
            return this.tipsInput;
        }

        @NotNull
        public final List<TipItem> getTipsVariants() {
            return this.tipsVariants;
        }

        public int hashCode() {
            int hashCode = this.tipsVariants.hashCode() * 31;
            ChangePayment changePayment = this.changePayment;
            int hashCode2 = (hashCode + (changePayment == null ? 0 : changePayment.hashCode())) * 31;
            TipsInput tipsInput = this.tipsInput;
            return hashCode2 + (tipsInput != null ? tipsInput.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TipsDetails(tipsVariants=" + this.tipsVariants + ", changePayment=" + this.changePayment + ", tipsInput=" + this.tipsInput + ")";
        }
    }

    public TipCourierDetailsDTO(TipsDetails tipsDetails, @NotNull AtomDTO actionButton) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.tips = tipsDetails;
        this.actionButton = actionButton;
    }

    public static /* synthetic */ TipCourierDetailsDTO copy$default(TipCourierDetailsDTO tipCourierDetailsDTO, TipsDetails tipsDetails, AtomDTO atomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tipsDetails = tipCourierDetailsDTO.tips;
        }
        if ((i11 & 2) != 0) {
            atomDTO = tipCourierDetailsDTO.actionButton;
        }
        return tipCourierDetailsDTO.copy(tipsDetails, atomDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TipsDetails getTips() {
        return this.tips;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final TipCourierDetailsDTO copy(TipsDetails tips, @NotNull AtomDTO actionButton) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new TipCourierDetailsDTO(tips, actionButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierDetailsDTO)) {
            return false;
        }
        TipCourierDetailsDTO tipCourierDetailsDTO = (TipCourierDetailsDTO) other;
        return Intrinsics.d(this.tips, tipCourierDetailsDTO.tips) && Intrinsics.d(this.actionButton, tipCourierDetailsDTO.actionButton);
    }

    @NotNull
    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    public final TipsDetails getTips() {
        return this.tips;
    }

    public int hashCode() {
        TipsDetails tipsDetails = this.tips;
        return this.actionButton.hashCode() + ((tipsDetails == null ? 0 : tipsDetails.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TipCourierDetailsDTO(tips=" + this.tips + ", actionButton=" + this.actionButton + ")";
    }
}
