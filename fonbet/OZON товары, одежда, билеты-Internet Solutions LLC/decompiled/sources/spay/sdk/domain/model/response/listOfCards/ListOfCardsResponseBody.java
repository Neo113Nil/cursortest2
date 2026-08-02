package spay.sdk.domain.model.response.listOfCards;

import Ak.C2436a;
import Ak.b;
import An.C2439a;
import B0.C2454a;
import B4.V;
import C.J;
import C.o0;
import D3.g;
import D40.c;
import De.C2860c;
import N3.C3660k;
import Nh.a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u000656789:BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020(HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006;"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "Landroid/os/Parcelable;", "userInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "orderInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "paymentToolInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "merchantInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "buttonBnpl", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "promoInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "formInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;)V", "getButtonBnpl", "()Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "getFormInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "getMerchantInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "getOrderInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "getPaymentToolInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "getPromoInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "getUserInfo", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FormInfo", "MerchantInfo", "OrderInfo", "PaymentToolInfo", "PromoInfo", "UserInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListOfCardsResponseBody implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ListOfCardsResponseBody> CREATOR = new Creator();
    private final ButtonBnpl buttonBnpl;
    private final FormInfo formInfo;
    private final MerchantInfo merchantInfo;

    @NotNull
    private final OrderInfo orderInfo;

    @NotNull
    private final PaymentToolInfo paymentToolInfo;
    private final PromoInfo promoInfo;

    @NotNull
    private final UserInfo userInfo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ListOfCardsResponseBody> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListOfCardsResponseBody createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ListOfCardsResponseBody(UserInfo.CREATOR.createFromParcel(parcel), OrderInfo.CREATOR.createFromParcel(parcel), PaymentToolInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MerchantInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonBnpl.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromoInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FormInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListOfCardsResponseBody[] newArray(int i11) {
            return new ListOfCardsResponseBody[i11];
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "Landroid/os/Parcelable;", "notEnoughBalanceText", "", "onlyPartPayText", "(Ljava/lang/String;Ljava/lang/String;)V", "getNotEnoughBalanceText", "()Ljava/lang/String;", "getOnlyPartPayText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FormInfo> CREATOR = new Creator();
        private final String notEnoughBalanceText;
        private final String onlyPartPayText;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FormInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FormInfo[] newArray(int i11) {
                return new FormInfo[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FormInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FormInfo copy$default(FormInfo formInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = formInfo.notEnoughBalanceText;
            }
            if ((i11 & 2) != 0) {
                str2 = formInfo.onlyPartPayText;
            }
            return formInfo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        @NotNull
        public final FormInfo copy(String notEnoughBalanceText, String onlyPartPayText) {
            return new FormInfo(notEnoughBalanceText, onlyPartPayText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormInfo)) {
                return false;
            }
            FormInfo formInfo = (FormInfo) other;
            return Intrinsics.d(this.notEnoughBalanceText, formInfo.notEnoughBalanceText) && Intrinsics.d(this.onlyPartPayText, formInfo.onlyPartPayText);
        }

        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        public int hashCode() {
            String str = this.notEnoughBalanceText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onlyPartPayText;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("FormInfo(notEnoughBalanceText=", this.notEnoughBalanceText, ", onlyPartPayText=", this.onlyPartPayText, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.notEnoughBalanceText);
            parcel.writeString(this.onlyPartPayText);
        }

        public FormInfo(String str, String str2) {
            this.notEnoughBalanceText = str;
            this.onlyPartPayText = str2;
        }

        public /* synthetic */ FormInfo(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "Landroid/os/Parcelable;", "merchantName", "", "merchantLogoUrl", "bindingIsNeeded", "", "bindingSafeText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBindingIsNeeded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBindingSafeText", "()Ljava/lang/String;", "getMerchantLogoUrl", "getMerchantName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MerchantInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        private final Boolean bindingIsNeeded;
        private final String bindingSafeText;
        private final String merchantLogoUrl;
        private final String merchantName;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MerchantInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MerchantInfo createFromParcel(@NotNull Parcel parcel) {
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MerchantInfo(readString, readString2, valueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MerchantInfo[] newArray(int i11) {
                return new MerchantInfo[i11];
            }
        }

        public MerchantInfo() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, String str2, Boolean bool, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            if ((i11 & 2) != 0) {
                str2 = merchantInfo.merchantLogoUrl;
            }
            if ((i11 & 4) != 0) {
                bool = merchantInfo.bindingIsNeeded;
            }
            if ((i11 & 8) != 0) {
                str3 = merchantInfo.bindingSafeText;
            }
            return merchantInfo.copy(str, str2, bool, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        @NotNull
        public final MerchantInfo copy(String merchantName, String merchantLogoUrl, Boolean bindingIsNeeded, String bindingSafeText) {
            return new MerchantInfo(merchantName, merchantLogoUrl, bindingIsNeeded, bindingSafeText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) other;
            return Intrinsics.d(this.merchantName, merchantInfo.merchantName) && Intrinsics.d(this.merchantLogoUrl, merchantInfo.merchantLogoUrl) && Intrinsics.d(this.bindingIsNeeded, merchantInfo.bindingIsNeeded) && Intrinsics.d(this.bindingSafeText, merchantInfo.bindingSafeText);
        }

        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantLogoUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.bindingIsNeeded;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.bindingSafeText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.merchantName;
            String str2 = this.merchantLogoUrl;
            Boolean bool = this.bindingIsNeeded;
            String str3 = this.bindingSafeText;
            StringBuilder d11 = C3660k.d("MerchantInfo(merchantName=", str, ", merchantLogoUrl=", str2, ", bindingIsNeeded=");
            d11.append(bool);
            d11.append(", bindingSafeText=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.merchantName);
            parcel.writeString(this.merchantLogoUrl);
            Boolean bool = this.bindingIsNeeded;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                c.c(parcel, 1, bool);
            }
            parcel.writeString(this.bindingSafeText);
        }

        public MerchantInfo(String str, String str2, Boolean bool, String str3) {
            this.merchantName = str;
            this.merchantLogoUrl = str2;
            this.bindingIsNeeded = bool;
            this.bindingSafeText = str3;
        }

        public /* synthetic */ MerchantInfo(String str, String str2, Boolean bool, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "Landroid/os/Parcelable;", "orderAmount", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;)V", "getOrderAmount", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "OrderAmount", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OrderInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OrderInfo> CREATOR = new Creator();
        private final OrderAmount orderAmount;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OrderInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderInfo(parcel.readInt() == 0 ? null : OrderAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OrderInfo[] newArray(int i11) {
                return new OrderInfo[i11];
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "Landroid/os/Parcelable;", "amount", "", "currency", "", "(ILjava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class OrderAmount implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<OrderAmount> CREATOR = new Creator();
            private final int amount;

            @NotNull
            private final String currency;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderAmount> {
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OrderAmount createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OrderAmount(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public final OrderAmount[] newArray(int i11) {
                    return new OrderAmount[i11];
                }
            }

            public OrderAmount(int i11, @NotNull String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.amount = i11;
                this.currency = currency;
            }

            public static /* synthetic */ OrderAmount copy$default(OrderAmount orderAmount, int i11, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = orderAmount.amount;
                }
                if ((i12 & 2) != 0) {
                    str = orderAmount.currency;
                }
                return orderAmount.copy(i11, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getAmount() {
                return this.amount;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            @NotNull
            public final OrderAmount copy(int amount, @NotNull String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new OrderAmount(amount, currency);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderAmount)) {
                    return false;
                }
                OrderAmount orderAmount = (OrderAmount) other;
                return this.amount == orderAmount.amount && Intrinsics.d(this.currency, orderAmount.currency);
            }

            public final int getAmount() {
                return this.amount;
            }

            @NotNull
            public final String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                return this.currency.hashCode() + (Integer.hashCode(this.amount) * 31);
            }

            @NotNull
            public String toString() {
                return a.c(this.amount, "OrderAmount(amount=", ", currency=", this.currency, ")");
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(this.amount);
                parcel.writeString(this.currency);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, OrderAmount orderAmount, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                orderAmount = orderInfo.orderAmount;
            }
            return orderInfo.copy(orderAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        @NotNull
        public final OrderInfo copy(OrderAmount orderAmount) {
            return new OrderInfo(orderAmount);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderInfo) && Intrinsics.d(this.orderAmount, ((OrderInfo) other).orderAmount);
        }

        public final OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public int hashCode() {
            OrderAmount orderAmount = this.orderAmount;
            if (orderAmount == null) {
                return 0;
            }
            return orderAmount.hashCode();
        }

        @NotNull
        public String toString() {
            return "OrderInfo(orderAmount=" + this.orderAmount + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            OrderAmount orderAmount = this.orderAmount;
            if (orderAmount == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderAmount.writeToParcel(parcel, flags);
            }
        }

        public OrderInfo(OrderAmount orderAmount) {
            this.orderAmount = orderAmount;
        }

        public /* synthetic */ OrderInfo(OrderAmount orderAmount, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : orderAmount);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "Landroid/os/Parcelable;", "toolList", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "additionalCards", "", "isSpPaymentToolsNeedUpdate", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAdditionalCards", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToolList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Tool", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PaymentToolInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentToolInfo> CREATOR = new Creator();
        private final Boolean additionalCards;
        private final Boolean isSpPaymentToolsNeedUpdate;
        private final List<Tool> toolList;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentToolInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PaymentToolInfo createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = b.b(Tool.CREATOR, parcel, arrayList, i11, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new PaymentToolInfo(arrayList, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PaymentToolInfo[] newArray(int i11) {
                return new PaymentToolInfo[i11];
            }
        }

        public PaymentToolInfo() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentToolInfo copy$default(PaymentToolInfo paymentToolInfo, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = paymentToolInfo.toolList;
            }
            if ((i11 & 2) != 0) {
                bool = paymentToolInfo.additionalCards;
            }
            if ((i11 & 4) != 0) {
                bool2 = paymentToolInfo.isSpPaymentToolsNeedUpdate;
            }
            return paymentToolInfo.copy(list, bool, bool2);
        }

        public final List<Tool> component1() {
            return this.toolList;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        @NotNull
        public final PaymentToolInfo copy(List<Tool> toolList, Boolean additionalCards, Boolean isSpPaymentToolsNeedUpdate) {
            return new PaymentToolInfo(toolList, additionalCards, isSpPaymentToolsNeedUpdate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentToolInfo)) {
                return false;
            }
            PaymentToolInfo paymentToolInfo = (PaymentToolInfo) other;
            return Intrinsics.d(this.toolList, paymentToolInfo.toolList) && Intrinsics.d(this.additionalCards, paymentToolInfo.additionalCards) && Intrinsics.d(this.isSpPaymentToolsNeedUpdate, paymentToolInfo.isSpPaymentToolsNeedUpdate);
        }

        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        public final List<Tool> getToolList() {
            return this.toolList;
        }

        public int hashCode() {
            List<Tool> list = this.toolList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.additionalCards;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        @NotNull
        public String toString() {
            List<Tool> list = this.toolList;
            Boolean bool = this.additionalCards;
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            StringBuilder sb2 = new StringBuilder("PaymentToolInfo(toolList=");
            sb2.append(list);
            sb2.append(", additionalCards=");
            sb2.append(bool);
            sb2.append(", isSpPaymentToolsNeedUpdate=");
            return g.d(sb2, bool2, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<Tool> list = this.toolList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator c11 = J.c(parcel, 1, list);
                while (c11.hasNext()) {
                    ((Tool) c11.next()).writeToParcel(parcel, flags);
                }
            }
            Boolean bool = this.additionalCards;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                c.c(parcel, 1, bool);
            }
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                c.c(parcel, 1, bool2);
            }
        }

        public PaymentToolInfo(List<Tool> list, Boolean bool, Boolean bool2) {
            this.toolList = list;
            this.additionalCards = bool;
            this.isSpPaymentToolsNeedUpdate = bool2;
        }

        public /* synthetic */ PaymentToolInfo(List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001AB\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ¢\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00105J\t\u00106\u001a\u00020\u0005HÖ\u0001J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u000e\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006B"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "Landroid/os/Parcelable;", "productName", "", "paymentId", "", "priorityCard", "", "paymentSourceType", "financialProductId", "cardNumber", "paymentSystemType", "cardLogoUrl", "countAdditionalCards", "isSpPaymentTools", "isSpPaymentToolsPriority", "precalculateBonuses", "amountData", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;)V", "getAmountData", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "getCardLogoUrl", "()Ljava/lang/String;", "getCardNumber", "getCountAdditionalCards", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFinancialProductId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentId", "()I", "getPaymentSourceType", "getPaymentSystemType", "getPrecalculateBonuses", "getPriorityCard", "()Z", "getProductName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AmountData", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Tool implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Tool> CREATOR = new Creator();
            private final AmountData amountData;
            private final String cardLogoUrl;
            private final String cardNumber;
            private final Integer countAdditionalCards;
            private final String financialProductId;
            private final Boolean isSpPaymentTools;
            private final Boolean isSpPaymentToolsPriority;
            private final int paymentId;

            @NotNull
            private final String paymentSourceType;
            private final String paymentSystemType;
            private final String precalculateBonuses;
            private final boolean priorityCard;

            @NotNull
            private final String productName;

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "Landroid/os/Parcelable;", "amount", "", "currency", "", "(JLjava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class AmountData implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<AmountData> CREATOR = new Creator();
                private final long amount;

                @NotNull
                private final String currency;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<AmountData> {
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final AmountData createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AmountData(parcel.readLong(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final AmountData[] newArray(int i11) {
                        return new AmountData[i11];
                    }
                }

                public AmountData(long j11, @NotNull String currency) {
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    this.amount = j11;
                    this.currency = currency;
                }

                public static /* synthetic */ AmountData copy$default(AmountData amountData, long j11, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        j11 = amountData.amount;
                    }
                    if ((i11 & 2) != 0) {
                        str = amountData.currency;
                    }
                    return amountData.copy(j11, str);
                }

                /* renamed from: component1, reason: from getter */
                public final long getAmount() {
                    return this.amount;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getCurrency() {
                    return this.currency;
                }

                @NotNull
                public final AmountData copy(long amount, @NotNull String currency) {
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    return new AmountData(amount, currency);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AmountData)) {
                        return false;
                    }
                    AmountData amountData = (AmountData) other;
                    return this.amount == amountData.amount && Intrinsics.d(this.currency, amountData.currency);
                }

                public final long getAmount() {
                    return this.amount;
                }

                @NotNull
                public final String getCurrency() {
                    return this.currency;
                }

                public int hashCode() {
                    return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder c11 = C2436a.c(this.amount, "AmountData(amount=", ", currency=", this.currency);
                    c11.append(")");
                    return c11.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeLong(this.amount);
                    parcel.writeString(this.currency);
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Tool> {
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Tool createFromParcel(@NotNull Parcel parcel) {
                    boolean z11;
                    boolean z12;
                    Boolean valueOf;
                    Boolean valueOf2;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    boolean z13 = false;
                    if (parcel.readInt() != 0) {
                        z11 = false;
                        z13 = true;
                        z12 = true;
                    } else {
                        z11 = false;
                        z12 = true;
                    }
                    String readString2 = parcel.readString();
                    boolean z14 = z12;
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z14 : z11);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        if (parcel.readInt() != 0) {
                            z11 = z14;
                        }
                        valueOf2 = Boolean.valueOf(z11);
                    }
                    return new Tool(readString, readInt, z13, readString2, readString3, readString4, readString5, readString6, valueOf3, valueOf, valueOf2, parcel.readString(), parcel.readInt() != 0 ? AmountData.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Tool[] newArray(int i11) {
                    return new Tool[i11];
                }
            }

            public Tool(@NotNull String productName, int i11, boolean z11, @NotNull String paymentSourceType, String str, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, String str5, AmountData amountData) {
                Intrinsics.checkNotNullParameter(productName, "productName");
                Intrinsics.checkNotNullParameter(paymentSourceType, "paymentSourceType");
                this.productName = productName;
                this.paymentId = i11;
                this.priorityCard = z11;
                this.paymentSourceType = paymentSourceType;
                this.financialProductId = str;
                this.cardNumber = str2;
                this.paymentSystemType = str3;
                this.cardLogoUrl = str4;
                this.countAdditionalCards = num;
                this.isSpPaymentTools = bool;
                this.isSpPaymentToolsPriority = bool2;
                this.precalculateBonuses = str5;
                this.amountData = amountData;
            }

            public static /* synthetic */ Tool copy$default(Tool tool, String str, int i11, boolean z11, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool, Boolean bool2, String str7, AmountData amountData, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = tool.productName;
                }
                return tool.copy(str, (i12 & 2) != 0 ? tool.paymentId : i11, (i12 & 4) != 0 ? tool.priorityCard : z11, (i12 & 8) != 0 ? tool.paymentSourceType : str2, (i12 & 16) != 0 ? tool.financialProductId : str3, (i12 & 32) != 0 ? tool.cardNumber : str4, (i12 & 64) != 0 ? tool.paymentSystemType : str5, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tool.cardLogoUrl : str6, (i12 & 256) != 0 ? tool.countAdditionalCards : num, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tool.isSpPaymentTools : bool, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tool.isSpPaymentToolsPriority : bool2, (i12 & 2048) != 0 ? tool.precalculateBonuses : str7, (i12 & 4096) != 0 ? tool.amountData : amountData);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getProductName() {
                return this.productName;
            }

            /* renamed from: component10, reason: from getter */
            public final Boolean getIsSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            /* renamed from: component11, reason: from getter */
            public final Boolean getIsSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            /* renamed from: component12, reason: from getter */
            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            /* renamed from: component13, reason: from getter */
            public final AmountData getAmountData() {
                return this.amountData;
            }

            /* renamed from: component2, reason: from getter */
            public final int getPaymentId() {
                return this.paymentId;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getPriorityCard() {
                return this.priorityCard;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            /* renamed from: component5, reason: from getter */
            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            /* renamed from: component6, reason: from getter */
            public final String getCardNumber() {
                return this.cardNumber;
            }

            /* renamed from: component7, reason: from getter */
            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            /* renamed from: component8, reason: from getter */
            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            @NotNull
            public final Tool copy(@NotNull String productName, int paymentId, boolean priorityCard, @NotNull String paymentSourceType, String financialProductId, String cardNumber, String paymentSystemType, String cardLogoUrl, Integer countAdditionalCards, Boolean isSpPaymentTools, Boolean isSpPaymentToolsPriority, String precalculateBonuses, AmountData amountData) {
                Intrinsics.checkNotNullParameter(productName, "productName");
                Intrinsics.checkNotNullParameter(paymentSourceType, "paymentSourceType");
                return new Tool(productName, paymentId, priorityCard, paymentSourceType, financialProductId, cardNumber, paymentSystemType, cardLogoUrl, countAdditionalCards, isSpPaymentTools, isSpPaymentToolsPriority, precalculateBonuses, amountData);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tool)) {
                    return false;
                }
                Tool tool = (Tool) other;
                return Intrinsics.d(this.productName, tool.productName) && this.paymentId == tool.paymentId && this.priorityCard == tool.priorityCard && Intrinsics.d(this.paymentSourceType, tool.paymentSourceType) && Intrinsics.d(this.financialProductId, tool.financialProductId) && Intrinsics.d(this.cardNumber, tool.cardNumber) && Intrinsics.d(this.paymentSystemType, tool.paymentSystemType) && Intrinsics.d(this.cardLogoUrl, tool.cardLogoUrl) && Intrinsics.d(this.countAdditionalCards, tool.countAdditionalCards) && Intrinsics.d(this.isSpPaymentTools, tool.isSpPaymentTools) && Intrinsics.d(this.isSpPaymentToolsPriority, tool.isSpPaymentToolsPriority) && Intrinsics.d(this.precalculateBonuses, tool.precalculateBonuses) && Intrinsics.d(this.amountData, tool.amountData);
            }

            public final AmountData getAmountData() {
                return this.amountData;
            }

            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            public final int getPaymentId() {
                return this.paymentId;
            }

            @NotNull
            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            public final boolean getPriorityCard() {
                return this.priorityCard;
            }

            @NotNull
            public final String getProductName() {
                return this.productName;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int a11 = C2454a.a(this.paymentId, this.productName.hashCode() * 31, 31);
                boolean z11 = this.priorityCard;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int b02 = Lf.a.b0((a11 + i11) * 31, this.paymentSourceType);
                String str = this.financialProductId;
                int hashCode = (b02 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.cardNumber;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.paymentSystemType;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cardLogoUrl;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.countAdditionalCards;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool = this.isSpPaymentTools;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isSpPaymentToolsPriority;
                int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str5 = this.precalculateBonuses;
                int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
                AmountData amountData = this.amountData;
                return hashCode8 + (amountData != null ? amountData.hashCode() : 0);
            }

            public final Boolean isSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            public final Boolean isSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            @NotNull
            public String toString() {
                String str = this.productName;
                int i11 = this.paymentId;
                boolean z11 = this.priorityCard;
                String str2 = this.paymentSourceType;
                String str3 = this.financialProductId;
                String str4 = this.cardNumber;
                String str5 = this.paymentSystemType;
                String str6 = this.cardLogoUrl;
                Integer num = this.countAdditionalCards;
                Boolean bool = this.isSpPaymentTools;
                Boolean bool2 = this.isSpPaymentToolsPriority;
                String str7 = this.precalculateBonuses;
                AmountData amountData = this.amountData;
                StringBuilder c11 = C3660k.c(i11, "Tool(productName=", str, ", paymentId=", ", priorityCard=");
                C5766e.a(", paymentSourceType=", str2, ", financialProductId=", c11, z11);
                a.h(c11, str3, ", cardNumber=", str4, ", paymentSystemType=");
                a.h(c11, str5, ", cardLogoUrl=", str6, ", countAdditionalCards=");
                C2860c.f(bool, num, ", isSpPaymentTools=", ", isSpPaymentToolsPriority=", c11);
                HY.b.c(bool2, ", precalculateBonuses=", str7, ", amountData=", c11);
                c11.append(amountData);
                c11.append(")");
                return c11.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.productName);
                parcel.writeInt(this.paymentId);
                parcel.writeInt(this.priorityCard ? 1 : 0);
                parcel.writeString(this.paymentSourceType);
                parcel.writeString(this.financialProductId);
                parcel.writeString(this.cardNumber);
                parcel.writeString(this.paymentSystemType);
                parcel.writeString(this.cardLogoUrl);
                Integer num = this.countAdditionalCards;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.f(parcel, 1, num);
                }
                Boolean bool = this.isSpPaymentTools;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    c.c(parcel, 1, bool);
                }
                Boolean bool2 = this.isSpPaymentToolsPriority;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    c.c(parcel, 1, bool2);
                }
                parcel.writeString(this.precalculateBonuses);
                AmountData amountData = this.amountData;
                if (amountData == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    amountData.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Tool(String str, int i11, boolean z11, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool, Boolean bool2, String str7, AmountData amountData, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, z11, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i12 & 256) != 0 ? null : num, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : bool2, (i12 & 2048) != 0 ? null : str7, (i12 & 4096) != 0 ? null : amountData);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "Landroid/os/Parcelable;", "hint", "", "bannerList", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "(Ljava/lang/String;Ljava/util/List;)V", "getBannerList", "()Ljava/util/List;", "getHint", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BannerData", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PromoInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PromoInfo> CREATOR = new Creator();
        private final List<BannerData> bannerList;
        private final String hint;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006)"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "Landroid/os/Parcelable;", "type", "", "hint", CommentV3DTO.HEADER_FIELD_NAME, "text", "iconUrl", "buttons", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "getHeader", "()Ljava/lang/String;", "getHint", "getIconUrl", "getText", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Buttons", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class BannerData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<BannerData> CREATOR = new Creator();
            private final List<Buttons> buttons;
            private final String header;
            private final String hint;
            private final String iconUrl;
            private final String text;

            @NotNull
            private final String type;

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "Landroid/os/Parcelable;", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class Buttons implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Buttons> CREATOR = new Creator();
                private final String deeplink;
                private final String title;

                @NotNull
                private final String type;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Buttons> {
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final Buttons createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Buttons(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final Buttons[] newArray(int i11) {
                        return new Buttons[i11];
                    }
                }

                public Buttons(@NotNull String type, String str, String str2) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    this.type = type;
                    this.title = str;
                    this.deeplink = str2;
                }

                public static /* synthetic */ Buttons copy$default(Buttons buttons, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = buttons.type;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = buttons.title;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = buttons.deeplink;
                    }
                    return buttons.copy(str, str2, str3);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component3, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                @NotNull
                public final Buttons copy(@NotNull String type, String title, String deeplink) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    return new Buttons(type, title, deeplink);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Buttons)) {
                        return false;
                    }
                    Buttons buttons = (Buttons) other;
                    return Intrinsics.d(this.type, buttons.type) && Intrinsics.d(this.title, buttons.title) && Intrinsics.d(this.deeplink, buttons.deeplink);
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    int hashCode = this.type.hashCode() * 31;
                    String str = this.title;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.deeplink;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.type;
                    String str2 = this.title;
                    return o0.c(C3660k.d("Buttons(type=", str, ", title=", str2, ", deeplink="), this.deeplink, ")");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeString(this.deeplink);
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BannerData> {
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BannerData createFromParcel(@NotNull Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = b.b(Buttons.CREATOR, parcel, arrayList2, i11, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new BannerData(readString, readString2, readString3, readString4, readString5, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BannerData[] newArray(int i11) {
                    return new BannerData[i11];
                }
            }

            public BannerData(@NotNull String type, String str, String str2, String str3, String str4, List<Buttons> list) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.hint = str;
                this.header = str2;
                this.text = str3;
                this.iconUrl = str4;
                this.buttons = list;
            }

            public static /* synthetic */ BannerData copy$default(BannerData bannerData, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bannerData.type;
                }
                if ((i11 & 2) != 0) {
                    str2 = bannerData.hint;
                }
                if ((i11 & 4) != 0) {
                    str3 = bannerData.header;
                }
                if ((i11 & 8) != 0) {
                    str4 = bannerData.text;
                }
                if ((i11 & 16) != 0) {
                    str5 = bannerData.iconUrl;
                }
                if ((i11 & 32) != 0) {
                    list = bannerData.buttons;
                }
                String str6 = str5;
                List list2 = list;
                return bannerData.copy(str, str2, str3, str4, str6, list2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            /* renamed from: component3, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            /* renamed from: component4, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component5, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final List<Buttons> component6() {
                return this.buttons;
            }

            @NotNull
            public final BannerData copy(@NotNull String type, String hint, String header, String text, String iconUrl, List<Buttons> buttons) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new BannerData(type, hint, header, text, iconUrl, buttons);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerData)) {
                    return false;
                }
                BannerData bannerData = (BannerData) other;
                return Intrinsics.d(this.type, bannerData.type) && Intrinsics.d(this.hint, bannerData.hint) && Intrinsics.d(this.header, bannerData.header) && Intrinsics.d(this.text, bannerData.text) && Intrinsics.d(this.iconUrl, bannerData.iconUrl) && Intrinsics.d(this.buttons, bannerData.buttons);
            }

            public final List<Buttons> getButtons() {
                return this.buttons;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getHint() {
                return this.hint;
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final String getText() {
                return this.text;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.hint;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.header;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.text;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.iconUrl;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<Buttons> list = this.buttons;
                return hashCode5 + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.type;
                String str2 = this.hint;
                String str3 = this.header;
                String str4 = this.text;
                String str5 = this.iconUrl;
                List<Buttons> list = this.buttons;
                StringBuilder d11 = C3660k.d("BannerData(type=", str, ", hint=", str2, ", header=");
                a.h(d11, str3, ", text=", str4, ", iconUrl=");
                d11.append(str5);
                d11.append(", buttons=");
                d11.append(list);
                d11.append(")");
                return d11.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.type);
                parcel.writeString(this.hint);
                parcel.writeString(this.header);
                parcel.writeString(this.text);
                parcel.writeString(this.iconUrl);
                List<Buttons> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator c11 = J.c(parcel, 1, list);
                while (c11.hasNext()) {
                    ((Buttons) c11.next()).writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromoInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PromoInfo createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = b.b(BannerData.CREATOR, parcel, arrayList2, i11, 1);
                    }
                    arrayList = arrayList2;
                }
                return new PromoInfo(readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PromoInfo[] newArray(int i11) {
                return new PromoInfo[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PromoInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PromoInfo copy$default(PromoInfo promoInfo, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = promoInfo.hint;
            }
            if ((i11 & 2) != 0) {
                list = promoInfo.bannerList;
            }
            return promoInfo.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public final List<BannerData> component2() {
            return this.bannerList;
        }

        @NotNull
        public final PromoInfo copy(String hint, List<BannerData> bannerList) {
            return new PromoInfo(hint, bannerList);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoInfo)) {
                return false;
            }
            PromoInfo promoInfo = (PromoInfo) other;
            return Intrinsics.d(this.hint, promoInfo.hint) && Intrinsics.d(this.bannerList, promoInfo.bannerList);
        }

        public final List<BannerData> getBannerList() {
            return this.bannerList;
        }

        public final String getHint() {
            return this.hint;
        }

        public int hashCode() {
            String str = this.hint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BannerData> list = this.bannerList;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2439a.a("PromoInfo(hint=", this.hint, ", bannerList=", ")", this.bannerList);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.hint);
            List<BannerData> list = this.bannerList;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator c11 = J.c(parcel, 1, list);
            while (c11.hasNext()) {
                ((BannerData) c11.next()).writeToParcel(parcel, flags);
            }
        }

        public PromoInfo(String str, List<BannerData> list) {
            this.hint = str;
            this.bannerList = list;
        }

        public /* synthetic */ PromoInfo(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list);
        }
    }

    public ListOfCardsResponseBody(@NotNull UserInfo userInfo, @NotNull OrderInfo orderInfo, @NotNull PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(paymentToolInfo, "paymentToolInfo");
        this.userInfo = userInfo;
        this.orderInfo = orderInfo;
        this.paymentToolInfo = paymentToolInfo;
        this.merchantInfo = merchantInfo;
        this.buttonBnpl = buttonBnpl;
        this.promoInfo = promoInfo;
        this.formInfo = formInfo;
    }

    public static /* synthetic */ ListOfCardsResponseBody copy$default(ListOfCardsResponseBody listOfCardsResponseBody, UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userInfo = listOfCardsResponseBody.userInfo;
        }
        if ((i11 & 2) != 0) {
            orderInfo = listOfCardsResponseBody.orderInfo;
        }
        if ((i11 & 4) != 0) {
            paymentToolInfo = listOfCardsResponseBody.paymentToolInfo;
        }
        if ((i11 & 8) != 0) {
            merchantInfo = listOfCardsResponseBody.merchantInfo;
        }
        if ((i11 & 16) != 0) {
            buttonBnpl = listOfCardsResponseBody.buttonBnpl;
        }
        if ((i11 & 32) != 0) {
            promoInfo = listOfCardsResponseBody.promoInfo;
        }
        if ((i11 & 64) != 0) {
            formInfo = listOfCardsResponseBody.formInfo;
        }
        PromoInfo promoInfo2 = promoInfo;
        FormInfo formInfo2 = formInfo;
        ButtonBnpl buttonBnpl2 = buttonBnpl;
        PaymentToolInfo paymentToolInfo2 = paymentToolInfo;
        return listOfCardsResponseBody.copy(userInfo, orderInfo, paymentToolInfo2, merchantInfo, buttonBnpl2, promoInfo2, formInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentToolInfo getPaymentToolInfo() {
        return this.paymentToolInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    /* renamed from: component6, reason: from getter */
    public final PromoInfo getPromoInfo() {
        return this.promoInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final FormInfo getFormInfo() {
        return this.formInfo;
    }

    @NotNull
    public final ListOfCardsResponseBody copy(@NotNull UserInfo userInfo, @NotNull OrderInfo orderInfo, @NotNull PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(paymentToolInfo, "paymentToolInfo");
        return new ListOfCardsResponseBody(userInfo, orderInfo, paymentToolInfo, merchantInfo, buttonBnpl, promoInfo, formInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfCardsResponseBody)) {
            return false;
        }
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) other;
        return Intrinsics.d(this.userInfo, listOfCardsResponseBody.userInfo) && Intrinsics.d(this.orderInfo, listOfCardsResponseBody.orderInfo) && Intrinsics.d(this.paymentToolInfo, listOfCardsResponseBody.paymentToolInfo) && Intrinsics.d(this.merchantInfo, listOfCardsResponseBody.merchantInfo) && Intrinsics.d(this.buttonBnpl, listOfCardsResponseBody.buttonBnpl) && Intrinsics.d(this.promoInfo, listOfCardsResponseBody.promoInfo) && Intrinsics.d(this.formInfo, listOfCardsResponseBody.formInfo);
    }

    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    public final FormInfo getFormInfo() {
        return this.formInfo;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @NotNull
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    @NotNull
    public final PaymentToolInfo getPaymentToolInfo() {
        return this.paymentToolInfo;
    }

    public final PromoInfo getPromoInfo() {
        return this.promoInfo;
    }

    @NotNull
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int hashCode = (this.paymentToolInfo.hashCode() + ((this.orderInfo.hashCode() + (this.userInfo.hashCode() * 31)) * 31)) * 31;
        MerchantInfo merchantInfo = this.merchantInfo;
        int hashCode2 = (hashCode + (merchantInfo == null ? 0 : merchantInfo.hashCode())) * 31;
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        int hashCode3 = (hashCode2 + (buttonBnpl == null ? 0 : buttonBnpl.hashCode())) * 31;
        PromoInfo promoInfo = this.promoInfo;
        int hashCode4 = (hashCode3 + (promoInfo == null ? 0 : promoInfo.hashCode())) * 31;
        FormInfo formInfo = this.formInfo;
        return hashCode4 + (formInfo != null ? formInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ListOfCardsResponseBody(userInfo=" + this.userInfo + ", orderInfo=" + this.orderInfo + ", paymentToolInfo=" + this.paymentToolInfo + ", merchantInfo=" + this.merchantInfo + ", buttonBnpl=" + this.buttonBnpl + ", promoInfo=" + this.promoInfo + ", formInfo=" + this.formInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.userInfo.writeToParcel(parcel, flags);
        this.orderInfo.writeToParcel(parcel, flags);
        this.paymentToolInfo.writeToParcel(parcel, flags);
        MerchantInfo merchantInfo = this.merchantInfo;
        if (merchantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            merchantInfo.writeToParcel(parcel, flags);
        }
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        if (buttonBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBnpl.writeToParcel(parcel, flags);
        }
        PromoInfo promoInfo = this.promoInfo;
        if (promoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoInfo.writeToParcel(parcel, flags);
        }
        FormInfo formInfo = this.formInfo;
        if (formInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInfo.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "Landroid/os/Parcelable;", "lastName", "", "firstName", "gender", "", "sub", "ucpId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastName", "getSub", "getUcpId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UserInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();

        @NotNull
        private final String firstName;
        private final Integer gender;

        @NotNull
        private final String lastName;
        private final String sub;
        private final String ucpId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserInfo> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UserInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UserInfo[] newArray(int i11) {
                return new UserInfo[i11];
            }
        }

        public UserInfo(@NotNull String lastName, @NotNull String firstName, Integer num, String str, String str2) {
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.lastName = lastName;
            this.firstName = firstName;
            this.gender = num;
            this.sub = str;
            this.ucpId = str2;
        }

        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, Integer num, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = userInfo.lastName;
            }
            if ((i11 & 2) != 0) {
                str2 = userInfo.firstName;
            }
            if ((i11 & 4) != 0) {
                num = userInfo.gender;
            }
            if ((i11 & 8) != 0) {
                str3 = userInfo.sub;
            }
            if ((i11 & 16) != 0) {
                str4 = userInfo.ucpId;
            }
            String str5 = str4;
            Integer num2 = num;
            return userInfo.copy(str, str2, num2, str3, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getGender() {
            return this.gender;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSub() {
            return this.sub;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUcpId() {
            return this.ucpId;
        }

        @NotNull
        public final UserInfo copy(@NotNull String lastName, @NotNull String firstName, Integer gender, String sub, String ucpId) {
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            return new UserInfo(lastName, firstName, gender, sub, ucpId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) other;
            return Intrinsics.d(this.lastName, userInfo.lastName) && Intrinsics.d(this.firstName, userInfo.firstName) && Intrinsics.d(this.gender, userInfo.gender) && Intrinsics.d(this.sub, userInfo.sub) && Intrinsics.d(this.ucpId, userInfo.ucpId);
        }

        @NotNull
        public final String getFirstName() {
            return this.firstName;
        }

        public final Integer getGender() {
            return this.gender;
        }

        @NotNull
        public final String getLastName() {
            return this.lastName;
        }

        public final String getSub() {
            return this.sub;
        }

        public final String getUcpId() {
            return this.ucpId;
        }

        public int hashCode() {
            int b02 = Lf.a.b0(this.lastName.hashCode() * 31, this.firstName);
            Integer num = this.gender;
            int hashCode = (b02 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.sub;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ucpId;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.lastName;
            String str2 = this.firstName;
            Integer num = this.gender;
            String str3 = this.sub;
            String str4 = this.ucpId;
            StringBuilder d11 = C3660k.d("UserInfo(lastName=", str, ", firstName=", str2, ", gender=");
            V.f(num, ", sub=", str3, ", ucpId=", d11);
            return o0.c(d11, str4, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.lastName);
            parcel.writeString(this.firstName);
            Integer num = this.gender;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.f(parcel, 1, num);
            }
            parcel.writeString(this.sub);
            parcel.writeString(this.ucpId);
        }

        public /* synthetic */ UserInfo(String str, String str2, Integer num, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ ListOfCardsResponseBody(UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInfo, orderInfo, paymentToolInfo, (i11 & 8) != 0 ? null : merchantInfo, (i11 & 16) != 0 ? null : buttonBnpl, (i11 & 32) != 0 ? null : promoInfo, (i11 & 64) != 0 ? null : formInfo);
    }
}
