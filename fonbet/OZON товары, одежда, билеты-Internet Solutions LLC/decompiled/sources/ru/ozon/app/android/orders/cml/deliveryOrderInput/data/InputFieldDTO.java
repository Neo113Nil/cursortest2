package ru.ozon.app.android.orders.cml.deliveryOrderInput.data;

import B0.C2454a;
import Ek.a;
import I0.C3173b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "inputTitle", "minCount", "", "maxCount", "emptyError", "countError", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getInputTitle", "getMinCount", "()I", "getMaxCount", "getEmptyError", "getCountError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InputFieldDTO {
    public static final int $stable = 0;
    private final String countError;
    private final String emptyError;
    private final String inputTitle;
    private final int maxCount;
    private final int minCount;
    private final String value;

    public InputFieldDTO(String str, String str2, int i11, int i12, String str3, String str4) {
        this.value = str;
        this.inputTitle = str2;
        this.minCount = i11;
        this.maxCount = i12;
        this.emptyError = str3;
        this.countError = str4;
    }

    public static /* synthetic */ InputFieldDTO copy$default(InputFieldDTO inputFieldDTO, String str, String str2, int i11, int i12, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = inputFieldDTO.value;
        }
        if ((i13 & 2) != 0) {
            str2 = inputFieldDTO.inputTitle;
        }
        if ((i13 & 4) != 0) {
            i11 = inputFieldDTO.minCount;
        }
        if ((i13 & 8) != 0) {
            i12 = inputFieldDTO.maxCount;
        }
        if ((i13 & 16) != 0) {
            str3 = inputFieldDTO.emptyError;
        }
        if ((i13 & 32) != 0) {
            str4 = inputFieldDTO.countError;
        }
        String str5 = str3;
        String str6 = str4;
        return inputFieldDTO.copy(str, str2, i11, i12, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinCount() {
        return this.minCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmptyError() {
        return this.emptyError;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountError() {
        return this.countError;
    }

    @NotNull
    public final InputFieldDTO copy(String value, String inputTitle, int minCount, int maxCount, String emptyError, String countError) {
        return new InputFieldDTO(value, inputTitle, minCount, maxCount, emptyError, countError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldDTO)) {
            return false;
        }
        InputFieldDTO inputFieldDTO = (InputFieldDTO) other;
        return Intrinsics.d(this.value, inputFieldDTO.value) && Intrinsics.d(this.inputTitle, inputFieldDTO.inputTitle) && this.minCount == inputFieldDTO.minCount && this.maxCount == inputFieldDTO.maxCount && Intrinsics.d(this.emptyError, inputFieldDTO.emptyError) && Intrinsics.d(this.countError, inputFieldDTO.countError);
    }

    public final String getCountError() {
        return this.countError;
    }

    public final String getEmptyError() {
        return this.emptyError;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inputTitle;
        int a11 = C2454a.a(this.maxCount, C2454a.a(this.minCount, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.emptyError;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countError;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.inputTitle;
        int i11 = this.minCount;
        int i12 = this.maxCount;
        String str3 = this.emptyError;
        String str4 = this.countError;
        StringBuilder d11 = C3660k.d("InputFieldDTO(value=", str, ", inputTitle=", str2, ", minCount=");
        a.f(i11, i12, ", maxCount=", ", emptyError=", d11);
        return C3173b.c(d11, str3, ", countError=", str4, ")");
    }
}
