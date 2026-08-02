package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendPushesResult.kt */
/* loaded from: classes5.dex */
public final class SendPushesResult implements Parcelable {
    private static final /* synthetic */ SendPushesResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final SendPushesResult OK;

    /* compiled from: SendPushesResult.kt */
    public static final class CREATOR implements Parcelable.Creator<SendPushesResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SendPushesResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = SendPushesResult.OK;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(SendPushesResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (SendPushesResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SendPushesResult[] newArray(int i) {
            return new SendPushesResult[i];
        }
    }

    static {
        SendPushesResult sendPushesResult = new SendPushesResult("OK", 0);
        OK = sendPushesResult;
        $VALUES = new SendPushesResult[]{sendPushesResult};
        CREATOR = new CREATOR(null);
    }

    public SendPushesResult() {
        throw null;
    }

    public static SendPushesResult valueOf(String str) {
        return (SendPushesResult) Enum.valueOf(SendPushesResult.class, str);
    }

    public static SendPushesResult[] values() {
        return (SendPushesResult[]) $VALUES.clone();
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
