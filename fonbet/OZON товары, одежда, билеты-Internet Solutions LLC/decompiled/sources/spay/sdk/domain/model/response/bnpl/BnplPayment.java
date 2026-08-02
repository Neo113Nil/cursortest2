package spay.sdk.domain.model.response.bnpl;

import E0.C2942q;
import Pk0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "Landroid/os/Parcelable;", "date", "", "amount", "", AppsFlyerProperties.CURRENCY_CODE, "(Ljava/lang/String;JLjava/lang/String;)V", "getAmount", "()J", "getCurrencyCode", "()Ljava/lang/String;", "getDate", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BnplPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BnplPayment> CREATOR = new Creator();
    private final long amount;

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String date;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BnplPayment> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BnplPayment createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BnplPayment(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BnplPayment[] newArray(int i11) {
            return new BnplPayment[i11];
        }
    }

    public BnplPayment(@NotNull String date, long j11, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.date = date;
        this.amount = j11;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ BnplPayment copy$default(BnplPayment bnplPayment, String str, long j11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bnplPayment.date;
        }
        if ((i11 & 2) != 0) {
            j11 = bnplPayment.amount;
        }
        if ((i11 & 4) != 0) {
            str2 = bnplPayment.currencyCode;
        }
        return bnplPayment.copy(str, j11, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final BnplPayment copy(@NotNull String date, long amount, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new BnplPayment(date, amount, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BnplPayment)) {
            return false;
        }
        BnplPayment bnplPayment = (BnplPayment) other;
        return Intrinsics.d(this.date, bnplPayment.date) && this.amount == bnplPayment.amount && Intrinsics.d(this.currencyCode, bnplPayment.currencyCode);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return this.currencyCode.hashCode() + c.a(this.date.hashCode() * 31, 31, this.amount);
    }

    @NotNull
    public String toString() {
        String str = this.date;
        return C6594f.a(", currencyCode=", this.currencyCode, ")", C2942q.d(this.amount, "BnplPayment(date=", str, ", amount="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.date);
        parcel.writeLong(this.amount);
        parcel.writeString(this.currencyCode);
    }
}
