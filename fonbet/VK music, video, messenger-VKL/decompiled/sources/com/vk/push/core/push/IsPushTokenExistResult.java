package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IsPushTokenExistResult.kt */
/* loaded from: classes5.dex */
public final class IsPushTokenExistResult implements Parcelable {
    private static final /* synthetic */ IsPushTokenExistResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final IsPushTokenExistResult DOES_NOT_EXIST;
    public static final IsPushTokenExistResult EXISTS;

    /* compiled from: IsPushTokenExistResult.kt */
    public static final class CREATOR implements Parcelable.Creator<IsPushTokenExistResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IsPushTokenExistResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = IsPushTokenExistResult.DOES_NOT_EXIST;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(IsPushTokenExistResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (IsPushTokenExistResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IsPushTokenExistResult[] newArray(int i) {
            return new IsPushTokenExistResult[i];
        }
    }

    static {
        IsPushTokenExistResult isPushTokenExistResult = new IsPushTokenExistResult("EXISTS", 0);
        EXISTS = isPushTokenExistResult;
        IsPushTokenExistResult isPushTokenExistResult2 = new IsPushTokenExistResult("DOES_NOT_EXIST", 1);
        DOES_NOT_EXIST = isPushTokenExistResult2;
        $VALUES = new IsPushTokenExistResult[]{isPushTokenExistResult, isPushTokenExistResult2};
        CREATOR = new CREATOR(null);
    }

    public IsPushTokenExistResult() {
        throw null;
    }

    public static IsPushTokenExistResult valueOf(String str) {
        return (IsPushTokenExistResult) Enum.valueOf(IsPushTokenExistResult.class, str);
    }

    public static IsPushTokenExistResult[] values() {
        return (IsPushTokenExistResult[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
