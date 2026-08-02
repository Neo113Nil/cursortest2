package ru.ozon.app.android.fresh.feature.b2b.domain;

import B4.V;
import C.o0;
import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;", "", "isFinal", "", "deliveryVariantId", "", "placeId", "", "message", "error", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeliveryVariantId", "()Ljava/lang/String;", "getPlaceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "getError", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;", "equals", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliveryAddressResponse {
    public static final int $stable = 0;
    private final String deliveryVariantId;
    private final String error;
    private final Boolean isFinal;
    private final String message;
    private final Integer placeId;

    public DocsDeliveryAddressResponse(Boolean bool, String str, Integer num, String str2, String str3) {
        this.isFinal = bool;
        this.deliveryVariantId = str;
        this.placeId = num;
        this.message = str2;
        this.error = str3;
    }

    public static /* synthetic */ DocsDeliveryAddressResponse copy$default(DocsDeliveryAddressResponse docsDeliveryAddressResponse, Boolean bool, String str, Integer num, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = docsDeliveryAddressResponse.isFinal;
        }
        if ((i11 & 2) != 0) {
            str = docsDeliveryAddressResponse.deliveryVariantId;
        }
        if ((i11 & 4) != 0) {
            num = docsDeliveryAddressResponse.placeId;
        }
        if ((i11 & 8) != 0) {
            str2 = docsDeliveryAddressResponse.message;
        }
        if ((i11 & 16) != 0) {
            str3 = docsDeliveryAddressResponse.error;
        }
        String str4 = str3;
        Integer num2 = num;
        return docsDeliveryAddressResponse.copy(bool, str, num2, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsFinal() {
        return this.isFinal;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryVariantId() {
        return this.deliveryVariantId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPlaceId() {
        return this.placeId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final DocsDeliveryAddressResponse copy(Boolean isFinal, String deliveryVariantId, Integer placeId, String message, String error) {
        return new DocsDeliveryAddressResponse(isFinal, deliveryVariantId, placeId, message, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliveryAddressResponse)) {
            return false;
        }
        DocsDeliveryAddressResponse docsDeliveryAddressResponse = (DocsDeliveryAddressResponse) other;
        return Intrinsics.d(this.isFinal, docsDeliveryAddressResponse.isFinal) && Intrinsics.d(this.deliveryVariantId, docsDeliveryAddressResponse.deliveryVariantId) && Intrinsics.d(this.placeId, docsDeliveryAddressResponse.placeId) && Intrinsics.d(this.message, docsDeliveryAddressResponse.message) && Intrinsics.d(this.error, docsDeliveryAddressResponse.error);
    }

    public final String getDeliveryVariantId() {
        return this.deliveryVariantId;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        Boolean bool = this.isFinal;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.deliveryVariantId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.placeId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.message;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isFinal() {
        return this.isFinal;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isFinal;
        String str = this.deliveryVariantId;
        Integer num = this.placeId;
        String str2 = this.message;
        String str3 = this.error;
        StringBuilder e11 = g.e("DocsDeliveryAddressResponse(isFinal=", bool, ", deliveryVariantId=", str, ", placeId=");
        V.f(num, ", message=", str2, ", error=", e11);
        return o0.c(e11, str3, ")");
    }
}
