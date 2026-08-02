package spay.sdk.domain.model.response;

import Ds.C2880a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006&"}, d2 = {"Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "Landroid/os/Parcelable;", "buttonBnpl", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "offerUrl", "", "offerText", "isBnplEnabled", "", "graphBnpl", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "(Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Ljava/lang/String;Ljava/lang/String;ZLspay/sdk/domain/model/response/bnpl/GraphBnpl;)V", "getButtonBnpl", "()Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "getGraphBnpl", "()Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "()Z", "getOfferText", "()Ljava/lang/String;", "getOfferUrl", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentPlanBnplResponseBody implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentPlanBnplResponseBody> CREATOR = new Creator();
    private final ButtonBnpl buttonBnpl;
    private final GraphBnpl graphBnpl;
    private final boolean isBnplEnabled;
    private final String offerText;
    private final String offerUrl;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentPlanBnplResponseBody> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentPlanBnplResponseBody createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentPlanBnplResponseBody(parcel.readInt() == 0 ? null : ButtonBnpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? GraphBnpl.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentPlanBnplResponseBody[] newArray(int i11) {
            return new PaymentPlanBnplResponseBody[i11];
        }
    }

    public PaymentPlanBnplResponseBody(ButtonBnpl buttonBnpl, String str, String str2, boolean z11, GraphBnpl graphBnpl) {
        this.buttonBnpl = buttonBnpl;
        this.offerUrl = str;
        this.offerText = str2;
        this.isBnplEnabled = z11;
        this.graphBnpl = graphBnpl;
    }

    public static /* synthetic */ PaymentPlanBnplResponseBody copy$default(PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, ButtonBnpl buttonBnpl, String str, String str2, boolean z11, GraphBnpl graphBnpl, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonBnpl = paymentPlanBnplResponseBody.buttonBnpl;
        }
        if ((i11 & 2) != 0) {
            str = paymentPlanBnplResponseBody.offerUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = paymentPlanBnplResponseBody.offerText;
        }
        if ((i11 & 8) != 0) {
            z11 = paymentPlanBnplResponseBody.isBnplEnabled;
        }
        if ((i11 & 16) != 0) {
            graphBnpl = paymentPlanBnplResponseBody.graphBnpl;
        }
        GraphBnpl graphBnpl2 = graphBnpl;
        String str3 = str2;
        return paymentPlanBnplResponseBody.copy(buttonBnpl, str, str3, z11, graphBnpl2);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOfferUrl() {
        return this.offerUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOfferText() {
        return this.offerText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final GraphBnpl getGraphBnpl() {
        return this.graphBnpl;
    }

    @NotNull
    public final PaymentPlanBnplResponseBody copy(ButtonBnpl buttonBnpl, String offerUrl, String offerText, boolean isBnplEnabled, GraphBnpl graphBnpl) {
        return new PaymentPlanBnplResponseBody(buttonBnpl, offerUrl, offerText, isBnplEnabled, graphBnpl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanBnplResponseBody)) {
            return false;
        }
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) other;
        return Intrinsics.d(this.buttonBnpl, paymentPlanBnplResponseBody.buttonBnpl) && Intrinsics.d(this.offerUrl, paymentPlanBnplResponseBody.offerUrl) && Intrinsics.d(this.offerText, paymentPlanBnplResponseBody.offerText) && this.isBnplEnabled == paymentPlanBnplResponseBody.isBnplEnabled && Intrinsics.d(this.graphBnpl, paymentPlanBnplResponseBody.graphBnpl);
    }

    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    public final GraphBnpl getGraphBnpl() {
        return this.graphBnpl;
    }

    public final String getOfferText() {
        return this.offerText;
    }

    public final String getOfferUrl() {
        return this.offerUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        int hashCode = (buttonBnpl == null ? 0 : buttonBnpl.hashCode()) * 31;
        String str = this.offerUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z11 = this.isBnplEnabled;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        GraphBnpl graphBnpl = this.graphBnpl;
        return i12 + (graphBnpl != null ? graphBnpl.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    @NotNull
    public String toString() {
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        String str = this.offerUrl;
        String str2 = this.offerText;
        boolean z11 = this.isBnplEnabled;
        GraphBnpl graphBnpl = this.graphBnpl;
        StringBuilder sb2 = new StringBuilder("PaymentPlanBnplResponseBody(buttonBnpl=");
        sb2.append(buttonBnpl);
        sb2.append(", offerUrl=");
        sb2.append(str);
        sb2.append(", offerText=");
        C2880a.c(str2, ", isBnplEnabled=", ", graphBnpl=", sb2, z11);
        sb2.append(graphBnpl);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        if (buttonBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBnpl.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.offerUrl);
        parcel.writeString(this.offerText);
        parcel.writeInt(this.isBnplEnabled ? 1 : 0);
        GraphBnpl graphBnpl = this.graphBnpl;
        if (graphBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            graphBnpl.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PaymentPlanBnplResponseBody(ButtonBnpl buttonBnpl, String str, String str2, boolean z11, GraphBnpl graphBnpl, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : buttonBnpl, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, z11, (i11 & 16) != 0 ? null : graphBnpl);
    }
}
