package com.socure.docv.capturesdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureSdk.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/socure/docv/capturesdk/api/SocureDocVContext;", "Landroid/os/Parcelable;", "transactionToken", "", "publicKey", "useSocureGov", "", "docvBaseUrl", "deviceBaseUrl", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getDeviceBaseUrl", "()Ljava/lang/String;", "setDeviceBaseUrl", "(Ljava/lang/String;)V", "getDocvBaseUrl", "setDocvBaseUrl", "getPublicKey", "getTransactionToken", "getUseSocureGov", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SocureDocVContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SocureDocVContext> CREATOR = new Creator();
    private String deviceBaseUrl;
    private String docvBaseUrl;
    private final String publicKey;
    private final String transactionToken;
    private final boolean useSocureGov;

    /* compiled from: SocureSdk.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocureDocVContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocureDocVContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SocureDocVContext(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocureDocVContext[] newArray(int i) {
            return new SocureDocVContext[i];
        }
    }

    public static /* synthetic */ SocureDocVContext copy$default(SocureDocVContext socureDocVContext, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socureDocVContext.transactionToken;
        }
        if ((i & 2) != 0) {
            str2 = socureDocVContext.publicKey;
        }
        if ((i & 4) != 0) {
            z = socureDocVContext.useSocureGov;
        }
        if ((i & 8) != 0) {
            str3 = socureDocVContext.docvBaseUrl;
        }
        if ((i & 16) != 0) {
            str4 = socureDocVContext.deviceBaseUrl;
        }
        String str5 = str4;
        boolean z2 = z;
        return socureDocVContext.copy(str, str2, z2, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionToken() {
        return this.transactionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDocvBaseUrl() {
        return this.docvBaseUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceBaseUrl() {
        return this.deviceBaseUrl;
    }

    public final SocureDocVContext copy(String transactionToken, String publicKey, boolean useSocureGov, String docvBaseUrl, String deviceBaseUrl) {
        Intrinsics.checkNotNullParameter(transactionToken, "transactionToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        return new SocureDocVContext(transactionToken, publicKey, useSocureGov, docvBaseUrl, deviceBaseUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocureDocVContext)) {
            return false;
        }
        SocureDocVContext socureDocVContext = (SocureDocVContext) other;
        return Intrinsics.areEqual(this.transactionToken, socureDocVContext.transactionToken) && Intrinsics.areEqual(this.publicKey, socureDocVContext.publicKey) && this.useSocureGov == socureDocVContext.useSocureGov && Intrinsics.areEqual(this.docvBaseUrl, socureDocVContext.docvBaseUrl) && Intrinsics.areEqual(this.deviceBaseUrl, socureDocVContext.deviceBaseUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.transactionToken.hashCode() * 31) + this.publicKey.hashCode()) * 31;
        boolean z = this.useSocureGov;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.docvBaseUrl;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceBaseUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SocureDocVContext(transactionToken=" + this.transactionToken + ", publicKey=" + this.publicKey + ", useSocureGov=" + this.useSocureGov + ", docvBaseUrl=" + this.docvBaseUrl + ", deviceBaseUrl=" + this.deviceBaseUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.transactionToken);
        parcel.writeString(this.publicKey);
        parcel.writeInt(this.useSocureGov ? 1 : 0);
        parcel.writeString(this.docvBaseUrl);
        parcel.writeString(this.deviceBaseUrl);
    }

    public SocureDocVContext(String transactionToken, String publicKey, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(transactionToken, "transactionToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.transactionToken = transactionToken;
        this.publicKey = publicKey;
        this.useSocureGov = z;
        this.docvBaseUrl = str;
        this.deviceBaseUrl = str2;
    }

    public /* synthetic */ SocureDocVContext(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getTransactionToken() {
        return this.transactionToken;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    public final String getDocvBaseUrl() {
        return this.docvBaseUrl;
    }

    public final void setDocvBaseUrl(String str) {
        this.docvBaseUrl = str;
    }

    public final String getDeviceBaseUrl() {
        return this.deviceBaseUrl;
    }

    public final void setDeviceBaseUrl(String str) {
        this.deviceBaseUrl = str;
    }
}
