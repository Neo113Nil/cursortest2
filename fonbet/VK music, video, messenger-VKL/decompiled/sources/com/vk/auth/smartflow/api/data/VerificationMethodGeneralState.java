package com.vk.auth.smartflow.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMethodTypes.kt */
/* loaded from: classes15.dex */
public final class VerificationMethodGeneralState implements VerificationMethodState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VerificationMethodGeneralState[] $VALUES;
    public static final Parcelable.Creator<VerificationMethodGeneralState> CREATOR;
    public static final VerificationMethodGeneralState LOADING;
    private final String stateName = "LOADING";

    /* compiled from: VerificationMethodTypes.kt */
    public static final class a implements Parcelable.Creator<VerificationMethodGeneralState> {
        @Override // android.os.Parcelable.Creator
        public final VerificationMethodGeneralState createFromParcel(Parcel parcel) {
            return VerificationMethodGeneralState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationMethodGeneralState[] newArray(int i) {
            return new VerificationMethodGeneralState[i];
        }
    }

    static {
        VerificationMethodGeneralState verificationMethodGeneralState = new VerificationMethodGeneralState();
        LOADING = verificationMethodGeneralState;
        VerificationMethodGeneralState[] verificationMethodGeneralStateArr = {verificationMethodGeneralState};
        $VALUES = verificationMethodGeneralStateArr;
        $ENTRIES = new asp(verificationMethodGeneralStateArr);
        CREATOR = new a();
    }

    public static VerificationMethodGeneralState valueOf(String str) {
        return (VerificationMethodGeneralState) Enum.valueOf(VerificationMethodGeneralState.class, str);
    }

    public static VerificationMethodGeneralState[] values() {
        return (VerificationMethodGeneralState[]) $VALUES.clone();
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
