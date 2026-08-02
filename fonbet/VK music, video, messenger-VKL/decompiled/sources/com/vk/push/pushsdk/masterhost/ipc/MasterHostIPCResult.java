package com.vk.push.pushsdk.masterhost.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: MasterHostIPCResult.kt */
/* loaded from: classes5.dex */
public enum MasterHostIPCResult implements Parcelable {
    ELECTIONS_STARTED,
    OLD_MASTER_NOTIFIED,
    HOST_NOTIFIED_ABOUT_NEW_MASTER;

    public static final a CREATOR = new a();

    /* compiled from: MasterHostIPCResult.kt */
    public static final class a implements Parcelable.Creator<MasterHostIPCResult> {
        @Override // android.os.Parcelable.Creator
        public final MasterHostIPCResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = MasterHostIPCResult.ELECTIONS_STARTED;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(MasterHostIPCResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (MasterHostIPCResult) r0;
        }

        @Override // android.os.Parcelable.Creator
        public final MasterHostIPCResult[] newArray(int i) {
            return new MasterHostIPCResult[i];
        }
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
