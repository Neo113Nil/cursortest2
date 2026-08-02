package ru.ozon.app.android.account.locale.network.model;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/locale/network/model/SaveLocaleResponse;", "", "isSuccess", "", "message", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SaveLocaleResponse {
    private final boolean isSuccess;
    private final String message;

    public SaveLocaleResponse(boolean z11, String str) {
        this.isSuccess = z11;
        this.message = str;
    }

    public static /* synthetic */ SaveLocaleResponse copy$default(SaveLocaleResponse saveLocaleResponse, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = saveLocaleResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = saveLocaleResponse.message;
        }
        return saveLocaleResponse.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final SaveLocaleResponse copy(boolean isSuccess, String message) {
        return new SaveLocaleResponse(isSuccess, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveLocaleResponse)) {
            return false;
        }
        SaveLocaleResponse saveLocaleResponse = (SaveLocaleResponse) other;
        return this.isSuccess == saveLocaleResponse.isSuccess && Intrinsics.d(this.message, saveLocaleResponse.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "SaveLocaleResponse(isSuccess=" + this.isSuccess + ", message=" + this.message + ")";
    }

    public /* synthetic */ SaveLocaleResponse(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str);
    }
}
