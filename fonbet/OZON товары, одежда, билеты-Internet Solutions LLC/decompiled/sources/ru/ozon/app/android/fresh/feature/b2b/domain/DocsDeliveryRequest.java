package ru.ozon.app.android.fresh.feature.b2b.domain;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJv\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "", "orderId", "", "deliveryVariantId", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "phone", "firstName", "lastName", "disablePatronymic", "", "index", "", "patronymic", "placeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/Integer;)V", "getOrderId", "()Ljava/lang/String;", "getDeliveryVariantId", "getAddress", "getPhone", "getFirstName", "getLastName", "getDisablePatronymic", "()Z", "getIndex", "()I", "getPatronymic", "getPlaceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "equals", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliveryRequest {
    public static final int $stable = 0;

    @NotNull
    private final String address;

    @NotNull
    private final String deliveryVariantId;
    private final boolean disablePatronymic;

    @NotNull
    private final String firstName;
    private final int index;

    @NotNull
    private final String lastName;

    @NotNull
    private final String orderId;
    private final String patronymic;

    @NotNull
    private final String phone;
    private final Integer placeId;

    public DocsDeliveryRequest(@NotNull String orderId, @NotNull String deliveryVariantId, @NotNull String address, @NotNull String phone, @NotNull String firstName, @NotNull String lastName, boolean z11, int i11, String str, Integer num) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(deliveryVariantId, "deliveryVariantId");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.orderId = orderId;
        this.deliveryVariantId = deliveryVariantId;
        this.address = address;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.disablePatronymic = z11;
        this.index = i11;
        this.patronymic = str;
        this.placeId = num;
    }

    public static /* synthetic */ DocsDeliveryRequest copy$default(DocsDeliveryRequest docsDeliveryRequest, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, String str7, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = docsDeliveryRequest.orderId;
        }
        if ((i12 & 2) != 0) {
            str2 = docsDeliveryRequest.deliveryVariantId;
        }
        if ((i12 & 4) != 0) {
            str3 = docsDeliveryRequest.address;
        }
        if ((i12 & 8) != 0) {
            str4 = docsDeliveryRequest.phone;
        }
        if ((i12 & 16) != 0) {
            str5 = docsDeliveryRequest.firstName;
        }
        if ((i12 & 32) != 0) {
            str6 = docsDeliveryRequest.lastName;
        }
        if ((i12 & 64) != 0) {
            z11 = docsDeliveryRequest.disablePatronymic;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i11 = docsDeliveryRequest.index;
        }
        if ((i12 & 256) != 0) {
            str7 = docsDeliveryRequest.patronymic;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            num = docsDeliveryRequest.placeId;
        }
        String str8 = str7;
        Integer num2 = num;
        boolean z12 = z11;
        int i13 = i11;
        String str9 = str5;
        String str10 = str6;
        return docsDeliveryRequest.copy(str, str2, str3, str4, str9, str10, z12, i13, str8, num2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getPlaceId() {
        return this.placeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeliveryVariantId() {
        return this.deliveryVariantId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDisablePatronymic() {
        return this.disablePatronymic;
    }

    /* renamed from: component8, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPatronymic() {
        return this.patronymic;
    }

    @NotNull
    public final DocsDeliveryRequest copy(@NotNull String orderId, @NotNull String deliveryVariantId, @NotNull String address, @NotNull String phone, @NotNull String firstName, @NotNull String lastName, boolean disablePatronymic, int index, String patronymic, Integer placeId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(deliveryVariantId, "deliveryVariantId");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new DocsDeliveryRequest(orderId, deliveryVariantId, address, phone, firstName, lastName, disablePatronymic, index, patronymic, placeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliveryRequest)) {
            return false;
        }
        DocsDeliveryRequest docsDeliveryRequest = (DocsDeliveryRequest) other;
        return Intrinsics.d(this.orderId, docsDeliveryRequest.orderId) && Intrinsics.d(this.deliveryVariantId, docsDeliveryRequest.deliveryVariantId) && Intrinsics.d(this.address, docsDeliveryRequest.address) && Intrinsics.d(this.phone, docsDeliveryRequest.phone) && Intrinsics.d(this.firstName, docsDeliveryRequest.firstName) && Intrinsics.d(this.lastName, docsDeliveryRequest.lastName) && this.disablePatronymic == docsDeliveryRequest.disablePatronymic && this.index == docsDeliveryRequest.index && Intrinsics.d(this.patronymic, docsDeliveryRequest.patronymic) && Intrinsics.d(this.placeId, docsDeliveryRequest.placeId);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getDeliveryVariantId() {
        return this.deliveryVariantId;
    }

    public final boolean getDisablePatronymic() {
        return this.disablePatronymic;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPatronymic() {
        return this.patronymic;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public final Integer getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.index, C3532b.a(g.a(g.a(g.a(g.a(g.a(this.orderId.hashCode() * 31, 31, this.deliveryVariantId), 31, this.address), 31, this.phone), 31, this.firstName), 31, this.lastName), 31, this.disablePatronymic), 31);
        String str = this.patronymic;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.placeId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.deliveryVariantId;
        String str3 = this.address;
        String str4 = this.phone;
        String str5 = this.firstName;
        String str6 = this.lastName;
        boolean z11 = this.disablePatronymic;
        int i11 = this.index;
        String str7 = this.patronymic;
        Integer num = this.placeId;
        StringBuilder d11 = C3660k.d("DocsDeliveryRequest(orderId=", str, ", deliveryVariantId=", str2, ", address=");
        a.h(d11, str3, ", phone=", str4, ", firstName=");
        a.h(d11, str5, ", lastName=", str6, ", disablePatronymic=");
        d11.append(z11);
        d11.append(", index=");
        d11.append(i11);
        d11.append(", patronymic=");
        d11.append(str7);
        d11.append(", placeId=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ DocsDeliveryRequest(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, String str7, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, z11, i11, (i12 & 256) != 0 ? null : str7, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num);
    }
}
