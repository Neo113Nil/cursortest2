package ru.ozon.app.android.payment.ui.data;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/payment/ui/data/CreateBiometricBody;", "", "deviceId", "", "publicKey", "keyType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getPublicKey", "getKeyType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CreateBiometricBody {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String keyType;

    @NotNull
    private final String publicKey;

    public CreateBiometricBody(@NotNull String deviceId, @NotNull String publicKey, @NotNull String keyType) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(keyType, "keyType");
        this.deviceId = deviceId;
        this.publicKey = publicKey;
        this.keyType = keyType;
    }

    public static /* synthetic */ CreateBiometricBody copy$default(CreateBiometricBody createBiometricBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createBiometricBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = createBiometricBody.publicKey;
        }
        if ((i11 & 4) != 0) {
            str3 = createBiometricBody.keyType;
        }
        return createBiometricBody.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getKeyType() {
        return this.keyType;
    }

    @NotNull
    public final CreateBiometricBody copy(@NotNull String deviceId, @NotNull String publicKey, @NotNull String keyType) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(keyType, "keyType");
        return new CreateBiometricBody(deviceId, publicKey, keyType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBiometricBody)) {
            return false;
        }
        CreateBiometricBody createBiometricBody = (CreateBiometricBody) other;
        return Intrinsics.d(this.deviceId, createBiometricBody.deviceId) && Intrinsics.d(this.publicKey, createBiometricBody.publicKey) && Intrinsics.d(this.keyType, createBiometricBody.keyType);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getKeyType() {
        return this.keyType;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return this.keyType.hashCode() + g.a(this.deviceId.hashCode() * 31, 31, this.publicKey);
    }

    @NotNull
    public String toString() {
        String str = this.deviceId;
        String str2 = this.publicKey;
        return o0.c(C3660k.d("CreateBiometricBody(deviceId=", str, ", publicKey=", str2, ", keyType="), this.keyType, ")");
    }

    public /* synthetic */ CreateBiometricBody(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? "android" : str3);
    }
}
