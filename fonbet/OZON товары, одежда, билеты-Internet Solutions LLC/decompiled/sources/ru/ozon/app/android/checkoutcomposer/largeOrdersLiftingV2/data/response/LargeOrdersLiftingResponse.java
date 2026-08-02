package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.response;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingResponse;", "", "error", "", "data", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingData;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingData;)V", "getError", "()Ljava/lang/String;", "getData", "()Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LargeOrdersLiftingResponse {
    public static final int $stable = 0;
    private final LargeOrdersLiftingData data;
    private final String error;

    public LargeOrdersLiftingResponse(String str, LargeOrdersLiftingData largeOrdersLiftingData) {
        this.error = str;
        this.data = largeOrdersLiftingData;
    }

    public static /* synthetic */ LargeOrdersLiftingResponse copy$default(LargeOrdersLiftingResponse largeOrdersLiftingResponse, String str, LargeOrdersLiftingData largeOrdersLiftingData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = largeOrdersLiftingResponse.error;
        }
        if ((i11 & 2) != 0) {
            largeOrdersLiftingData = largeOrdersLiftingResponse.data;
        }
        return largeOrdersLiftingResponse.copy(str, largeOrdersLiftingData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final LargeOrdersLiftingData getData() {
        return this.data;
    }

    @NotNull
    public final LargeOrdersLiftingResponse copy(String error, LargeOrdersLiftingData data) {
        return new LargeOrdersLiftingResponse(error, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LargeOrdersLiftingResponse)) {
            return false;
        }
        LargeOrdersLiftingResponse largeOrdersLiftingResponse = (LargeOrdersLiftingResponse) other;
        return Intrinsics.d(this.error, largeOrdersLiftingResponse.error) && Intrinsics.d(this.data, largeOrdersLiftingResponse.data);
    }

    public final LargeOrdersLiftingData getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        String str = this.error;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LargeOrdersLiftingData largeOrdersLiftingData = this.data;
        return hashCode + (largeOrdersLiftingData != null ? largeOrdersLiftingData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LargeOrdersLiftingResponse(error=" + this.error + ", data=" + this.data + ")";
    }
}
