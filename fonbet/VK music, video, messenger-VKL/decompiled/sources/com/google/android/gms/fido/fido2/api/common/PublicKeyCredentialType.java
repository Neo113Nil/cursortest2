package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import xsna.zr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialType implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR;

    @NonNull
    public static final PublicKeyCredentialType PUBLIC_KEY;
    private static final /* synthetic */ PublicKeyCredentialType[] zza;

    @NonNull
    private final String zzb = "public-key";

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedPublicKeyCredTypeException extends Exception {
    }

    static {
        PublicKeyCredentialType publicKeyCredentialType = new PublicKeyCredentialType();
        PUBLIC_KEY = publicKeyCredentialType;
        zza = new PublicKeyCredentialType[]{publicKeyCredentialType};
        CREATOR = new c();
    }

    @NonNull
    public static PublicKeyCredentialType a(@NonNull String str) throws UnsupportedPublicKeyCredTypeException {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(zr.a("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static PublicKeyCredentialType valueOf(@NonNull String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    @NonNull
    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
