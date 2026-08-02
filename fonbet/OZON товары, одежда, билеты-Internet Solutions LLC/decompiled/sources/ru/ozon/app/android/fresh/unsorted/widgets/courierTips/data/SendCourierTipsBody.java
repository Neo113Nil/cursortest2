package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data;

import B0.C2454a;
import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/SendCourierTipsBody;", "", "orderID", "", "tipID", "", "orderNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOrderID", "()Ljava/lang/String;", "getTipID", "()I", "getOrderNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SendCourierTipsBody {
    public static final int $stable = 0;

    @NotNull
    private final String orderID;

    @NotNull
    private final String orderNumber;
    private final int tipID;

    public SendCourierTipsBody(@NotNull String orderID, int i11, @NotNull String orderNumber) {
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.orderID = orderID;
        this.tipID = i11;
        this.orderNumber = orderNumber;
    }

    public static /* synthetic */ SendCourierTipsBody copy$default(SendCourierTipsBody sendCourierTipsBody, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sendCourierTipsBody.orderID;
        }
        if ((i12 & 2) != 0) {
            i11 = sendCourierTipsBody.tipID;
        }
        if ((i12 & 4) != 0) {
            str2 = sendCourierTipsBody.orderNumber;
        }
        return sendCourierTipsBody.copy(str, i11, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrderID() {
        return this.orderID;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTipID() {
        return this.tipID;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final SendCourierTipsBody copy(@NotNull String orderID, int tipID, @NotNull String orderNumber) {
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        return new SendCourierTipsBody(orderID, tipID, orderNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendCourierTipsBody)) {
            return false;
        }
        SendCourierTipsBody sendCourierTipsBody = (SendCourierTipsBody) other;
        return Intrinsics.d(this.orderID, sendCourierTipsBody.orderID) && this.tipID == sendCourierTipsBody.tipID && Intrinsics.d(this.orderNumber, sendCourierTipsBody.orderNumber);
    }

    @NotNull
    public final String getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final int getTipID() {
        return this.tipID;
    }

    public int hashCode() {
        return this.orderNumber.hashCode() + C2454a.a(this.tipID, this.orderID.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.orderID;
        int i11 = this.tipID;
        return o0.c(C3660k.c(i11, "SendCourierTipsBody(orderID=", str, ", tipID=", ", orderNumber="), this.orderNumber, ")");
    }
}
