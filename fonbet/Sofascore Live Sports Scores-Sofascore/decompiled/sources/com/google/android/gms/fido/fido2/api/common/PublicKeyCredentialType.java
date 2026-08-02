package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.lnb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialType implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    PublicKeyCredentialType EF5;
    public static final /* synthetic */ PublicKeyCredentialType[] a = {new PublicKeyCredentialType("PUBLIC_KEY", 0)};

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedPublicKeyCredTypeException extends Exception {
    }

    public static PublicKeyCredentialType a(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            publicKeyCredentialType.getClass();
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new UnsupportedPublicKeyCredTypeException(lnb.o("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static PublicKeyCredentialType valueOf(@NonNull String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    @NonNull
    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
