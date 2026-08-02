package spay.sdk.domain.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/OrderScreenDataResponse;", "Landroid/os/Parcelable;", "listOfCardsResponseBody", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "paymentPlanBnplResponseBody", "Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "spasiboBonusesResponseBody", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "moreThanOneCard", "", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;Z)V", "getListOfCardsResponseBody", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "getMoreThanOneCard", "()Z", "getPaymentPlanBnplResponseBody", "()Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "getSpasiboBonusesResponseBody", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderScreenDataResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderScreenDataResponse> CREATOR = new Creator();

    @NotNull
    private final ListOfCardsResponseBody listOfCardsResponseBody;
    private final boolean moreThanOneCard;
    private final PaymentPlanBnplResponseBody paymentPlanBnplResponseBody;
    private final SpasiboBonusesResponseBody spasiboBonusesResponseBody;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderScreenDataResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderScreenDataResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderScreenDataResponse(ListOfCardsResponseBody.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentPlanBnplResponseBody.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpasiboBonusesResponseBody.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderScreenDataResponse[] newArray(int i11) {
            return new OrderScreenDataResponse[i11];
        }
    }

    public OrderScreenDataResponse(@NotNull ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z11) {
        Intrinsics.checkNotNullParameter(listOfCardsResponseBody, "listOfCardsResponseBody");
        this.listOfCardsResponseBody = listOfCardsResponseBody;
        this.paymentPlanBnplResponseBody = paymentPlanBnplResponseBody;
        this.spasiboBonusesResponseBody = spasiboBonusesResponseBody;
        this.moreThanOneCard = z11;
    }

    public static /* synthetic */ OrderScreenDataResponse copy$default(OrderScreenDataResponse orderScreenDataResponse, ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            listOfCardsResponseBody = orderScreenDataResponse.listOfCardsResponseBody;
        }
        if ((i11 & 2) != 0) {
            paymentPlanBnplResponseBody = orderScreenDataResponse.paymentPlanBnplResponseBody;
        }
        if ((i11 & 4) != 0) {
            spasiboBonusesResponseBody = orderScreenDataResponse.spasiboBonusesResponseBody;
        }
        if ((i11 & 8) != 0) {
            z11 = orderScreenDataResponse.moreThanOneCard;
        }
        return orderScreenDataResponse.copy(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ListOfCardsResponseBody getListOfCardsResponseBody() {
        return this.listOfCardsResponseBody;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentPlanBnplResponseBody getPaymentPlanBnplResponseBody() {
        return this.paymentPlanBnplResponseBody;
    }

    /* renamed from: component3, reason: from getter */
    public final SpasiboBonusesResponseBody getSpasiboBonusesResponseBody() {
        return this.spasiboBonusesResponseBody;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMoreThanOneCard() {
        return this.moreThanOneCard;
    }

    @NotNull
    public final OrderScreenDataResponse copy(@NotNull ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean moreThanOneCard) {
        Intrinsics.checkNotNullParameter(listOfCardsResponseBody, "listOfCardsResponseBody");
        return new OrderScreenDataResponse(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, moreThanOneCard);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderScreenDataResponse)) {
            return false;
        }
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) other;
        return Intrinsics.d(this.listOfCardsResponseBody, orderScreenDataResponse.listOfCardsResponseBody) && Intrinsics.d(this.paymentPlanBnplResponseBody, orderScreenDataResponse.paymentPlanBnplResponseBody) && Intrinsics.d(this.spasiboBonusesResponseBody, orderScreenDataResponse.spasiboBonusesResponseBody) && this.moreThanOneCard == orderScreenDataResponse.moreThanOneCard;
    }

    @NotNull
    public final ListOfCardsResponseBody getListOfCardsResponseBody() {
        return this.listOfCardsResponseBody;
    }

    public final boolean getMoreThanOneCard() {
        return this.moreThanOneCard;
    }

    public final PaymentPlanBnplResponseBody getPaymentPlanBnplResponseBody() {
        return this.paymentPlanBnplResponseBody;
    }

    public final SpasiboBonusesResponseBody getSpasiboBonusesResponseBody() {
        return this.spasiboBonusesResponseBody;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.listOfCardsResponseBody.hashCode() * 31;
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = this.paymentPlanBnplResponseBody;
        int hashCode2 = (hashCode + (paymentPlanBnplResponseBody == null ? 0 : paymentPlanBnplResponseBody.hashCode())) * 31;
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.spasiboBonusesResponseBody;
        int hashCode3 = (hashCode2 + (spasiboBonusesResponseBody != null ? spasiboBonusesResponseBody.hashCode() : 0)) * 31;
        boolean z11 = this.moreThanOneCard;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode3 + i11;
    }

    @NotNull
    public String toString() {
        return "OrderScreenDataResponse(listOfCardsResponseBody=" + this.listOfCardsResponseBody + ", paymentPlanBnplResponseBody=" + this.paymentPlanBnplResponseBody + ", spasiboBonusesResponseBody=" + this.spasiboBonusesResponseBody + ", moreThanOneCard=" + this.moreThanOneCard + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.listOfCardsResponseBody.writeToParcel(parcel, flags);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = this.paymentPlanBnplResponseBody;
        if (paymentPlanBnplResponseBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentPlanBnplResponseBody.writeToParcel(parcel, flags);
        }
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.spasiboBonusesResponseBody;
        if (spasiboBonusesResponseBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spasiboBonusesResponseBody.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.moreThanOneCard ? 1 : 0);
    }

    public /* synthetic */ OrderScreenDataResponse(ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, (i11 & 8) != 0 ? false : z11);
    }
}
