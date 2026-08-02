package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/ConfirmDateButtonErrorBody;", "", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ConfirmDateButtonErrorBody {
    public static final int $stable = 0;

    @NotNull
    private final String error;

    public ConfirmDateButtonErrorBody(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    public static /* synthetic */ ConfirmDateButtonErrorBody copy$default(ConfirmDateButtonErrorBody confirmDateButtonErrorBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmDateButtonErrorBody.error;
        }
        return confirmDateButtonErrorBody.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final ConfirmDateButtonErrorBody copy(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ConfirmDateButtonErrorBody(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConfirmDateButtonErrorBody) && Intrinsics.d(this.error, ((ConfirmDateButtonErrorBody) other).error);
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("ConfirmDateButtonErrorBody(error=", this.error, ")");
    }
}
