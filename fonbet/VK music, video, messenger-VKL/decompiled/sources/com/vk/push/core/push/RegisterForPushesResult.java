package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegisterForPushesResult.kt */
/* loaded from: classes5.dex */
public final class RegisterForPushesResult implements Parcelable {
    private static final /* synthetic */ RegisterForPushesResult[] $VALUES;
    public static final RegisterForPushesResult ALREADY_REGISTERED;
    public static final CREATOR CREATOR;
    public static final RegisterForPushesResult OK;

    /* compiled from: RegisterForPushesResult.kt */
    public static final class CREATOR implements Parcelable.Creator<RegisterForPushesResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegisterForPushesResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = RegisterForPushesResult.OK;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(RegisterForPushesResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (RegisterForPushesResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegisterForPushesResult[] newArray(int i) {
            return new RegisterForPushesResult[i];
        }
    }

    static {
        RegisterForPushesResult registerForPushesResult = new RegisterForPushesResult("OK", 0);
        OK = registerForPushesResult;
        RegisterForPushesResult registerForPushesResult2 = new RegisterForPushesResult("ALREADY_REGISTERED", 1);
        ALREADY_REGISTERED = registerForPushesResult2;
        $VALUES = new RegisterForPushesResult[]{registerForPushesResult, registerForPushesResult2};
        CREATOR = new CREATOR(null);
    }

    public RegisterForPushesResult() {
        throw null;
    }

    public static RegisterForPushesResult valueOf(String str) {
        return (RegisterForPushesResult) Enum.valueOf(RegisterForPushesResult.class, str);
    }

    public static RegisterForPushesResult[] values() {
        return (RegisterForPushesResult[]) $VALUES.clone();
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
