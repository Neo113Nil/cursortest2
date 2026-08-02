package ru.ozon.app.android.account.orders.recipientWidget.data;

import G.g;
import N3.C3660k;
import Nh.a;
import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jq\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientDTO;", "", "namePlaceholder", "", "phonePlaceholder", "nameValue", "phoneValue", "saveButtonTitle", "regularId", "orderNumber", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getNamePlaceholder", "()Ljava/lang/String;", "getPhonePlaceholder", "getNameValue", "getPhoneValue", "getSaveButtonTitle", "getRegularId", "getOrderNumber", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecipientDTO {
    public static final int $stable = 8;
    private final String namePlaceholder;
    private final String nameValue;
    private final String orderNumber;

    @NotNull
    private final String phonePlaceholder;
    private final String phoneValue;
    private final String regularId;

    @NotNull
    private final String saveButtonTitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public RecipientDTO(String str, @NotNull String phonePlaceholder, String str2, String str3, @NotNull String saveButtonTitle, String str4, String str5, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(phonePlaceholder, "phonePlaceholder");
        Intrinsics.checkNotNullParameter(saveButtonTitle, "saveButtonTitle");
        this.namePlaceholder = str;
        this.phonePlaceholder = phonePlaceholder;
        this.nameValue = str2;
        this.phoneValue = str3;
        this.saveButtonTitle = saveButtonTitle;
        this.regularId = str4;
        this.orderNumber = str5;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RecipientDTO copy$default(RecipientDTO recipientDTO, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recipientDTO.namePlaceholder;
        }
        if ((i11 & 2) != 0) {
            str2 = recipientDTO.phonePlaceholder;
        }
        if ((i11 & 4) != 0) {
            str3 = recipientDTO.nameValue;
        }
        if ((i11 & 8) != 0) {
            str4 = recipientDTO.phoneValue;
        }
        if ((i11 & 16) != 0) {
            str5 = recipientDTO.saveButtonTitle;
        }
        if ((i11 & 32) != 0) {
            str6 = recipientDTO.regularId;
        }
        if ((i11 & 64) != 0) {
            str7 = recipientDTO.orderNumber;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = recipientDTO.trackingInfo;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        return recipientDTO.copy(str, str2, str3, str4, str9, str10, str8, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNamePlaceholder() {
        return this.namePlaceholder;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPhonePlaceholder() {
        return this.phonePlaceholder;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNameValue() {
        return this.nameValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneValue() {
        return this.phoneValue;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRegularId() {
        return this.regularId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final RecipientDTO copy(String namePlaceholder, @NotNull String phonePlaceholder, String nameValue, String phoneValue, @NotNull String saveButtonTitle, String regularId, String orderNumber, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(phonePlaceholder, "phonePlaceholder");
        Intrinsics.checkNotNullParameter(saveButtonTitle, "saveButtonTitle");
        return new RecipientDTO(namePlaceholder, phonePlaceholder, nameValue, phoneValue, saveButtonTitle, regularId, orderNumber, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientDTO)) {
            return false;
        }
        RecipientDTO recipientDTO = (RecipientDTO) other;
        return Intrinsics.d(this.namePlaceholder, recipientDTO.namePlaceholder) && Intrinsics.d(this.phonePlaceholder, recipientDTO.phonePlaceholder) && Intrinsics.d(this.nameValue, recipientDTO.nameValue) && Intrinsics.d(this.phoneValue, recipientDTO.phoneValue) && Intrinsics.d(this.saveButtonTitle, recipientDTO.saveButtonTitle) && Intrinsics.d(this.regularId, recipientDTO.regularId) && Intrinsics.d(this.orderNumber, recipientDTO.orderNumber) && Intrinsics.d(this.trackingInfo, recipientDTO.trackingInfo);
    }

    public final String getNamePlaceholder() {
        return this.namePlaceholder;
    }

    public final String getNameValue() {
        return this.nameValue;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getPhonePlaceholder() {
        return this.phonePlaceholder;
    }

    public final String getPhoneValue() {
        return this.phoneValue;
    }

    public final String getRegularId() {
        return this.regularId;
    }

    @NotNull
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.namePlaceholder;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.phonePlaceholder);
        String str2 = this.nameValue;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneValue;
        int a12 = g.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.saveButtonTitle);
        String str4 = this.regularId;
        int hashCode2 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderNumber;
        int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.namePlaceholder;
        String str2 = this.phonePlaceholder;
        String str3 = this.nameValue;
        String str4 = this.phoneValue;
        String str5 = this.saveButtonTitle;
        String str6 = this.regularId;
        String str7 = this.orderNumber;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("RecipientDTO(namePlaceholder=", str, ", phonePlaceholder=", str2, ", nameValue=");
        a.h(d11, str3, ", phoneValue=", str4, ", saveButtonTitle=");
        a.h(d11, str5, ", regularId=", str6, ", orderNumber=");
        return C4070a.a(d11, str7, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ RecipientDTO(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
    }
}
