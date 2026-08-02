package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvalidateTokenResult.kt */
/* loaded from: classes5.dex */
public final class InvalidateTokenResult implements Parcelable {
    private static final /* synthetic */ InvalidateTokenResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final InvalidateTokenResult OK;

    /* compiled from: InvalidateTokenResult.kt */
    public static final class CREATOR implements Parcelable.Creator<InvalidateTokenResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InvalidateTokenResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = InvalidateTokenResult.OK;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(InvalidateTokenResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (InvalidateTokenResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InvalidateTokenResult[] newArray(int i) {
            return new InvalidateTokenResult[i];
        }
    }

    static {
        InvalidateTokenResult invalidateTokenResult = new InvalidateTokenResult("OK", 0);
        OK = invalidateTokenResult;
        $VALUES = new InvalidateTokenResult[]{invalidateTokenResult};
        CREATOR = new CREATOR(null);
    }

    public InvalidateTokenResult() {
        throw null;
    }

    public static InvalidateTokenResult valueOf(String str) {
        return (InvalidateTokenResult) Enum.valueOf(InvalidateTokenResult.class, str);
    }

    public static InvalidateTokenResult[] values() {
        return (InvalidateTokenResult[]) $VALUES.clone();
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
