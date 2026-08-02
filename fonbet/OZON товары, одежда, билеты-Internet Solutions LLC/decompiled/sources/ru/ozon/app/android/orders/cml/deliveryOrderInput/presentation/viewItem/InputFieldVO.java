package ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem;

import B0.C2454a;
import I0.C3173b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "inputTitle", "", "minCount", "maxCount", "emptyError", "countError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getInputTitle", "Ljava/lang/Integer;", "getMinCount", "()Ljava/lang/Integer;", "I", "getMaxCount", "getEmptyError", "getCountError", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InputFieldVO {
    private final String countError;
    private final String emptyError;
    private final String inputTitle;
    private final int maxCount;
    private final Integer minCount;
    private final String value;

    public InputFieldVO(String str, String str2, Integer num, int i11, String str3, String str4) {
        this.value = str;
        this.inputTitle = str2;
        this.minCount = num;
        this.maxCount = i11;
        this.emptyError = str3;
        this.countError = str4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldVO)) {
            return false;
        }
        InputFieldVO inputFieldVO = (InputFieldVO) other;
        return Intrinsics.d(this.value, inputFieldVO.value) && Intrinsics.d(this.inputTitle, inputFieldVO.inputTitle) && Intrinsics.d(this.minCount, inputFieldVO.minCount) && this.maxCount == inputFieldVO.maxCount && Intrinsics.d(this.emptyError, inputFieldVO.emptyError) && Intrinsics.d(this.countError, inputFieldVO.countError);
    }

    public final String getCountError() {
        return this.countError;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final Integer getMinCount() {
        return this.minCount;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inputTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.minCount;
        int a11 = C2454a.a(this.maxCount, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str3 = this.emptyError;
        int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countError;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.inputTitle;
        Integer num = this.minCount;
        int i11 = this.maxCount;
        String str3 = this.emptyError;
        String str4 = this.countError;
        StringBuilder d11 = C3660k.d("InputFieldVO(value=", str, ", inputTitle=", str2, ", minCount=");
        d11.append(num);
        d11.append(", maxCount=");
        d11.append(i11);
        d11.append(", emptyError=");
        return C3173b.c(d11, str3, ", countError=", str4, ")");
    }
}
