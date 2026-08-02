package com.vk.push.core.test;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendTestPushResult.kt */
/* loaded from: classes5.dex */
public final class SendTestPushResult implements Parcelable {
    private static final /* synthetic */ SendTestPushResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final SendTestPushResult SUCCESS;

    /* compiled from: SendTestPushResult.kt */
    public static final class CREATOR implements Parcelable.Creator<SendTestPushResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SendTestPushResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = SendTestPushResult.SUCCESS;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(SendTestPushResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (SendTestPushResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SendTestPushResult[] newArray(int i) {
            return new SendTestPushResult[i];
        }
    }

    static {
        SendTestPushResult sendTestPushResult = new SendTestPushResult("SUCCESS", 0);
        SUCCESS = sendTestPushResult;
        $VALUES = new SendTestPushResult[]{sendTestPushResult};
        CREATOR = new CREATOR(null);
    }

    public SendTestPushResult() {
        throw null;
    }

    public static SendTestPushResult valueOf(String str) {
        return (SendTestPushResult) Enum.valueOf(SendTestPushResult.class, str);
    }

    public static SendTestPushResult[] values() {
        return (SendTestPushResult[]) $VALUES.clone();
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
