package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnDeleteMessagesResult.kt */
/* loaded from: classes5.dex */
public final class OnDeleteMessagesResult implements Parcelable {
    private static final /* synthetic */ OnDeleteMessagesResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final OnDeleteMessagesResult OK;

    /* compiled from: OnDeleteMessagesResult.kt */
    public static final class CREATOR implements Parcelable.Creator<OnDeleteMessagesResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnDeleteMessagesResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = OnDeleteMessagesResult.OK;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(OnDeleteMessagesResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (OnDeleteMessagesResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnDeleteMessagesResult[] newArray(int i) {
            return new OnDeleteMessagesResult[i];
        }
    }

    static {
        OnDeleteMessagesResult onDeleteMessagesResult = new OnDeleteMessagesResult("OK", 0);
        OK = onDeleteMessagesResult;
        $VALUES = new OnDeleteMessagesResult[]{onDeleteMessagesResult};
        CREATOR = new CREATOR(null);
    }

    public OnDeleteMessagesResult() {
        throw null;
    }

    public static OnDeleteMessagesResult valueOf(String str) {
        return (OnDeleteMessagesResult) Enum.valueOf(OnDeleteMessagesResult.class, str);
    }

    public static OnDeleteMessagesResult[] values() {
        return (OnDeleteMessagesResult[]) $VALUES.clone();
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
