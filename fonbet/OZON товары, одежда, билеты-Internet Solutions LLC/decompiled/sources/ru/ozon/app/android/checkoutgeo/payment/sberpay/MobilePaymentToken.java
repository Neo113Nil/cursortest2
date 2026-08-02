package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "", "signature", "", "protocolVersion", "signedMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "getProtocolVersion", "getSignedMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MobilePaymentToken {

    @NotNull
    private final String protocolVersion;

    @NotNull
    private final String signature;

    @NotNull
    private final String signedMessage;

    public MobilePaymentToken(@NotNull String signature, @NotNull String protocolVersion, @NotNull String signedMessage) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(signedMessage, "signedMessage");
        this.signature = signature;
        this.protocolVersion = protocolVersion;
        this.signedMessage = signedMessage;
    }

    public static /* synthetic */ MobilePaymentToken copy$default(MobilePaymentToken mobilePaymentToken, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mobilePaymentToken.signature;
        }
        if ((i11 & 2) != 0) {
            str2 = mobilePaymentToken.protocolVersion;
        }
        if ((i11 & 4) != 0) {
            str3 = mobilePaymentToken.signedMessage;
        }
        return mobilePaymentToken.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSignedMessage() {
        return this.signedMessage;
    }

    @NotNull
    public final MobilePaymentToken copy(@NotNull String signature, @NotNull String protocolVersion, @NotNull String signedMessage) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        Intrinsics.checkNotNullParameter(signedMessage, "signedMessage");
        return new MobilePaymentToken(signature, protocolVersion, signedMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobilePaymentToken)) {
            return false;
        }
        MobilePaymentToken mobilePaymentToken = (MobilePaymentToken) other;
        return Intrinsics.d(this.signature, mobilePaymentToken.signature) && Intrinsics.d(this.protocolVersion, mobilePaymentToken.protocolVersion) && Intrinsics.d(this.signedMessage, mobilePaymentToken.signedMessage);
    }

    @NotNull
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    public final String getSignedMessage() {
        return this.signedMessage;
    }

    public int hashCode() {
        return this.signedMessage.hashCode() + g.a(this.signature.hashCode() * 31, 31, this.protocolVersion);
    }

    @NotNull
    public String toString() {
        String str = this.signature;
        String str2 = this.protocolVersion;
        return o0.c(C3660k.d("MobilePaymentToken(signature=", str, ", protocolVersion=", str2, ", signedMessage="), this.signedMessage, ")");
    }
}
