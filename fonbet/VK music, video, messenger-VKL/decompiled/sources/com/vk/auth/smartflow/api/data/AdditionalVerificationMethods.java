package com.vk.auth.smartflow.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMethodTypes.kt */
/* loaded from: classes15.dex */
public final class AdditionalVerificationMethods implements VerificationMethodState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdditionalVerificationMethods[] $VALUES;
    public static final Parcelable.Creator<AdditionalVerificationMethods> CREATOR;
    public static final AdditionalVerificationMethods LIBVERIFY;
    private final String methodName = "libverify";

    /* compiled from: VerificationMethodTypes.kt */
    public static final class a implements Parcelable.Creator<AdditionalVerificationMethods> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalVerificationMethods createFromParcel(Parcel parcel) {
            return AdditionalVerificationMethods.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalVerificationMethods[] newArray(int i) {
            return new AdditionalVerificationMethods[i];
        }
    }

    static {
        AdditionalVerificationMethods additionalVerificationMethods = new AdditionalVerificationMethods();
        LIBVERIFY = additionalVerificationMethods;
        AdditionalVerificationMethods[] additionalVerificationMethodsArr = {additionalVerificationMethods};
        $VALUES = additionalVerificationMethodsArr;
        $ENTRIES = new asp(additionalVerificationMethodsArr);
        CREATOR = new a();
    }

    public static AdditionalVerificationMethods valueOf(String str) {
        return (AdditionalVerificationMethods) Enum.valueOf(AdditionalVerificationMethods.class, str);
    }

    public static AdditionalVerificationMethods[] values() {
        return (AdditionalVerificationMethods[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
