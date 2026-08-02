package ru.ozon.id.nativeauth.instantAuth.data.api.dto;

import G.g;
import I0.C3173b;
import N3.C3660k;
import android.os.Build;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginRequestBody;", "", "phone", "", "password", "deviceId", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPassword", "getDeviceId", "getModel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstantLoginRequestBody {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String model;
    private final String password;
    private final String phone;

    public InstantLoginRequestBody(String str, String str2, @NotNull String deviceId, @NotNull String model) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.phone = str;
        this.password = str2;
        this.deviceId = deviceId;
        this.model = model;
    }

    public static /* synthetic */ InstantLoginRequestBody copy$default(InstantLoginRequestBody instantLoginRequestBody, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = instantLoginRequestBody.phone;
        }
        if ((i11 & 2) != 0) {
            str2 = instantLoginRequestBody.password;
        }
        if ((i11 & 4) != 0) {
            str3 = instantLoginRequestBody.deviceId;
        }
        if ((i11 & 8) != 0) {
            str4 = instantLoginRequestBody.model;
        }
        return instantLoginRequestBody.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final InstantLoginRequestBody copy(String phone, String password, @NotNull String deviceId, @NotNull String model) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(model, "model");
        return new InstantLoginRequestBody(phone, password, deviceId, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantLoginRequestBody)) {
            return false;
        }
        InstantLoginRequestBody instantLoginRequestBody = (InstantLoginRequestBody) other;
        return Intrinsics.d(this.phone, instantLoginRequestBody.phone) && Intrinsics.d(this.password, instantLoginRequestBody.password) && Intrinsics.d(this.deviceId, instantLoginRequestBody.deviceId) && Intrinsics.d(this.model, instantLoginRequestBody.model);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.phone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        return this.model.hashCode() + g.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.deviceId);
    }

    @NotNull
    public String toString() {
        String str = this.phone;
        String str2 = this.password;
        return C3173b.c(C3660k.d("InstantLoginRequestBody(phone=", str, ", password=", str2, ", deviceId="), this.deviceId, ", model=", this.model, ")");
    }

    public /* synthetic */ InstantLoginRequestBody(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? Build.MODEL : str4);
    }
}
