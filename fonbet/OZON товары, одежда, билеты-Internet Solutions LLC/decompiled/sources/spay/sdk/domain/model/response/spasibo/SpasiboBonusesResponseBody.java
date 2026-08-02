package spay.sdk.domain.model.response.spasibo;

import Cm.e;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "Landroid/os/Parcelable;", "loyaltyAppInfo", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "precalculateBonusesInfo", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "(Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;)V", "getLoyaltyAppInfo", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "getPrecalculateBonusesInfo", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "LoyaltyAppInfo", "PrecalculateBonusesInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpasiboBonusesResponseBody implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpasiboBonusesResponseBody> CREATOR = new Creator();

    @NotNull
    private final LoyaltyAppInfo loyaltyAppInfo;

    @NotNull
    private final PrecalculateBonusesInfo precalculateBonusesInfo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpasiboBonusesResponseBody> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SpasiboBonusesResponseBody createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpasiboBonusesResponseBody(LoyaltyAppInfo.CREATOR.createFromParcel(parcel), PrecalculateBonusesInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SpasiboBonusesResponseBody[] newArray(int i11) {
            return new SpasiboBonusesResponseBody[i11];
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "Landroid/os/Parcelable;", "maxPointsAmount", "", "pointsPaymentAmount", "(II)V", "getMaxPointsAmount", "()I", "getPointsPaymentAmount", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoyaltyAppInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LoyaltyAppInfo> CREATOR = new Creator();
        private final int maxPointsAmount;
        private final int pointsPaymentAmount;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyAppInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LoyaltyAppInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoyaltyAppInfo(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LoyaltyAppInfo[] newArray(int i11) {
                return new LoyaltyAppInfo[i11];
            }
        }

        public LoyaltyAppInfo(int i11, int i12) {
            this.maxPointsAmount = i11;
            this.pointsPaymentAmount = i12;
        }

        public static /* synthetic */ LoyaltyAppInfo copy$default(LoyaltyAppInfo loyaltyAppInfo, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = loyaltyAppInfo.maxPointsAmount;
            }
            if ((i13 & 2) != 0) {
                i12 = loyaltyAppInfo.pointsPaymentAmount;
            }
            return loyaltyAppInfo.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        @NotNull
        public final LoyaltyAppInfo copy(int maxPointsAmount, int pointsPaymentAmount) {
            return new LoyaltyAppInfo(maxPointsAmount, pointsPaymentAmount);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoyaltyAppInfo)) {
                return false;
            }
            LoyaltyAppInfo loyaltyAppInfo = (LoyaltyAppInfo) other;
            return this.maxPointsAmount == loyaltyAppInfo.maxPointsAmount && this.pointsPaymentAmount == loyaltyAppInfo.pointsPaymentAmount;
        }

        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.pointsPaymentAmount) + (Integer.hashCode(this.maxPointsAmount) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("LoyaltyAppInfo(maxPointsAmount=", this.maxPointsAmount, ", pointsPaymentAmount=", ")", this.pointsPaymentAmount);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.maxPointsAmount);
            parcel.writeInt(this.pointsPaymentAmount);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u001b"}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "Landroid/os/Parcelable;", "bonusesWithoutDeduction", "", "bonusesIsDeducted", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBonusesIsDeducted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBonusesWithoutDeduction", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PrecalculateBonusesInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PrecalculateBonusesInfo> CREATOR = new Creator();
        private final Integer bonusesIsDeducted;
        private final Integer bonusesWithoutDeduction;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrecalculateBonusesInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PrecalculateBonusesInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrecalculateBonusesInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PrecalculateBonusesInfo[] newArray(int i11) {
                return new PrecalculateBonusesInfo[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrecalculateBonusesInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PrecalculateBonusesInfo copy$default(PrecalculateBonusesInfo precalculateBonusesInfo, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = precalculateBonusesInfo.bonusesWithoutDeduction;
            }
            if ((i11 & 2) != 0) {
                num2 = precalculateBonusesInfo.bonusesIsDeducted;
            }
            return precalculateBonusesInfo.copy(num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        @NotNull
        public final PrecalculateBonusesInfo copy(Integer bonusesWithoutDeduction, Integer bonusesIsDeducted) {
            return new PrecalculateBonusesInfo(bonusesWithoutDeduction, bonusesIsDeducted);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrecalculateBonusesInfo)) {
                return false;
            }
            PrecalculateBonusesInfo precalculateBonusesInfo = (PrecalculateBonusesInfo) other;
            return Intrinsics.d(this.bonusesWithoutDeduction, precalculateBonusesInfo.bonusesWithoutDeduction) && Intrinsics.d(this.bonusesIsDeducted, precalculateBonusesInfo.bonusesIsDeducted);
        }

        public final Integer getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        public final Integer getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        public int hashCode() {
            Integer num = this.bonusesWithoutDeduction;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bonusesIsDeducted;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PrecalculateBonusesInfo(bonusesWithoutDeduction=" + this.bonusesWithoutDeduction + ", bonusesIsDeducted=" + this.bonusesIsDeducted + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Integer num = this.bonusesWithoutDeduction;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.f(parcel, 1, num);
            }
            Integer num2 = this.bonusesIsDeducted;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.f(parcel, 1, num2);
            }
        }

        public PrecalculateBonusesInfo(Integer num, Integer num2) {
            this.bonusesWithoutDeduction = num;
            this.bonusesIsDeducted = num2;
        }

        public /* synthetic */ PrecalculateBonusesInfo(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
        }
    }

    public SpasiboBonusesResponseBody(@NotNull LoyaltyAppInfo loyaltyAppInfo, @NotNull PrecalculateBonusesInfo precalculateBonusesInfo) {
        Intrinsics.checkNotNullParameter(loyaltyAppInfo, "loyaltyAppInfo");
        Intrinsics.checkNotNullParameter(precalculateBonusesInfo, "precalculateBonusesInfo");
        this.loyaltyAppInfo = loyaltyAppInfo;
        this.precalculateBonusesInfo = precalculateBonusesInfo;
    }

    public static /* synthetic */ SpasiboBonusesResponseBody copy$default(SpasiboBonusesResponseBody spasiboBonusesResponseBody, LoyaltyAppInfo loyaltyAppInfo, PrecalculateBonusesInfo precalculateBonusesInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            loyaltyAppInfo = spasiboBonusesResponseBody.loyaltyAppInfo;
        }
        if ((i11 & 2) != 0) {
            precalculateBonusesInfo = spasiboBonusesResponseBody.precalculateBonusesInfo;
        }
        return spasiboBonusesResponseBody.copy(loyaltyAppInfo, precalculateBonusesInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LoyaltyAppInfo getLoyaltyAppInfo() {
        return this.loyaltyAppInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PrecalculateBonusesInfo getPrecalculateBonusesInfo() {
        return this.precalculateBonusesInfo;
    }

    @NotNull
    public final SpasiboBonusesResponseBody copy(@NotNull LoyaltyAppInfo loyaltyAppInfo, @NotNull PrecalculateBonusesInfo precalculateBonusesInfo) {
        Intrinsics.checkNotNullParameter(loyaltyAppInfo, "loyaltyAppInfo");
        Intrinsics.checkNotNullParameter(precalculateBonusesInfo, "precalculateBonusesInfo");
        return new SpasiboBonusesResponseBody(loyaltyAppInfo, precalculateBonusesInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpasiboBonusesResponseBody)) {
            return false;
        }
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = (SpasiboBonusesResponseBody) other;
        return Intrinsics.d(this.loyaltyAppInfo, spasiboBonusesResponseBody.loyaltyAppInfo) && Intrinsics.d(this.precalculateBonusesInfo, spasiboBonusesResponseBody.precalculateBonusesInfo);
    }

    @NotNull
    public final LoyaltyAppInfo getLoyaltyAppInfo() {
        return this.loyaltyAppInfo;
    }

    @NotNull
    public final PrecalculateBonusesInfo getPrecalculateBonusesInfo() {
        return this.precalculateBonusesInfo;
    }

    public int hashCode() {
        return this.precalculateBonusesInfo.hashCode() + (this.loyaltyAppInfo.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SpasiboBonusesResponseBody(loyaltyAppInfo=" + this.loyaltyAppInfo + ", precalculateBonusesInfo=" + this.precalculateBonusesInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.loyaltyAppInfo.writeToParcel(parcel, flags);
        this.precalculateBonusesInfo.writeToParcel(parcel, flags);
    }
}
