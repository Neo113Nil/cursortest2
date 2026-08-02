package ru.ozon.app.android.account.orders.recipientWidget.data;

import C.o0;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientErrorResponse;", "", "errorType", "", "toastMessage", "error", "nameMessage", "phoneMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorType", "()Ljava/lang/String;", "getToastMessage", "getError", "getNameMessage", "getPhoneMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeRecipientErrorResponse {
    public static final int $stable = 0;
    private final String error;
    private final String errorType;
    private final String nameMessage;
    private final String phoneMessage;
    private final String toastMessage;

    public ChangeRecipientErrorResponse(String str, String str2, String str3, String str4, String str5) {
        this.errorType = str;
        this.toastMessage = str2;
        this.error = str3;
        this.nameMessage = str4;
        this.phoneMessage = str5;
    }

    public static /* synthetic */ ChangeRecipientErrorResponse copy$default(ChangeRecipientErrorResponse changeRecipientErrorResponse, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changeRecipientErrorResponse.errorType;
        }
        if ((i11 & 2) != 0) {
            str2 = changeRecipientErrorResponse.toastMessage;
        }
        if ((i11 & 4) != 0) {
            str3 = changeRecipientErrorResponse.error;
        }
        if ((i11 & 8) != 0) {
            str4 = changeRecipientErrorResponse.nameMessage;
        }
        if ((i11 & 16) != 0) {
            str5 = changeRecipientErrorResponse.phoneMessage;
        }
        String str6 = str5;
        String str7 = str3;
        return changeRecipientErrorResponse.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNameMessage() {
        return this.nameMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhoneMessage() {
        return this.phoneMessage;
    }

    @NotNull
    public final ChangeRecipientErrorResponse copy(String errorType, String toastMessage, String error, String nameMessage, String phoneMessage) {
        return new ChangeRecipientErrorResponse(errorType, toastMessage, error, nameMessage, phoneMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeRecipientErrorResponse)) {
            return false;
        }
        ChangeRecipientErrorResponse changeRecipientErrorResponse = (ChangeRecipientErrorResponse) other;
        return Intrinsics.d(this.errorType, changeRecipientErrorResponse.errorType) && Intrinsics.d(this.toastMessage, changeRecipientErrorResponse.toastMessage) && Intrinsics.d(this.error, changeRecipientErrorResponse.error) && Intrinsics.d(this.nameMessage, changeRecipientErrorResponse.nameMessage) && Intrinsics.d(this.phoneMessage, changeRecipientErrorResponse.phoneMessage);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getNameMessage() {
        return this.nameMessage;
    }

    public final String getPhoneMessage() {
        return this.phoneMessage;
    }

    public final String getToastMessage() {
        return this.toastMessage;
    }

    public int hashCode() {
        String str = this.errorType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.toastMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameMessage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneMessage;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.errorType;
        String str2 = this.toastMessage;
        String str3 = this.error;
        String str4 = this.nameMessage;
        String str5 = this.phoneMessage;
        StringBuilder d11 = C3660k.d("ChangeRecipientErrorResponse(errorType=", str, ", toastMessage=", str2, ", error=");
        a.h(d11, str3, ", nameMessage=", str4, ", phoneMessage=");
        return o0.c(d11, str5, ")");
    }
}
