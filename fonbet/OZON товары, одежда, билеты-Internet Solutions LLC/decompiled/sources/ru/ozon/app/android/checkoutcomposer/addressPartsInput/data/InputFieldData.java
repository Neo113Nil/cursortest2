package ru.ozon.app.android.checkoutcomposer.addressPartsInput.data;

import G.g;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/InputFieldData;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, "maxLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getHint", "getValue", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/InputFieldData;", "equals", "", "other", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InputFieldData {
    public static final int $stable = 0;

    @NotNull
    private final String hint;
    private final Integer maxLength;

    @NotNull
    private final String name;
    private final String value;

    public InputFieldData(@NotNull String name, @NotNull String hint, String str, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.name = name;
        this.hint = hint;
        this.value = str;
        this.maxLength = num;
    }

    public static /* synthetic */ InputFieldData copy$default(InputFieldData inputFieldData, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = inputFieldData.name;
        }
        if ((i11 & 2) != 0) {
            str2 = inputFieldData.hint;
        }
        if ((i11 & 4) != 0) {
            str3 = inputFieldData.value;
        }
        if ((i11 & 8) != 0) {
            num = inputFieldData.maxLength;
        }
        return inputFieldData.copy(str, str2, str3, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final InputFieldData copy(@NotNull String name, @NotNull String hint, String value, Integer maxLength) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return new InputFieldData(name, hint, value, maxLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldData)) {
            return false;
        }
        InputFieldData inputFieldData = (InputFieldData) other;
        return Intrinsics.d(this.name, inputFieldData.name) && Intrinsics.d(this.hint, inputFieldData.hint) && Intrinsics.d(this.value, inputFieldData.value) && Intrinsics.d(this.maxLength, inputFieldData.maxLength);
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = g.a(this.name.hashCode() * 31, 31, this.hint);
        String str = this.value;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxLength;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.hint;
        String str3 = this.value;
        Integer num = this.maxLength;
        StringBuilder d11 = C3660k.d("InputFieldData(name=", str, ", hint=", str2, ", value=");
        d11.append(str3);
        d11.append(", maxLength=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
