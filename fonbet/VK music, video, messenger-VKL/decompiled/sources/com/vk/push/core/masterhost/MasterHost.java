package com.vk.push.core.masterhost;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: MasterHost.kt */
/* loaded from: classes5.dex */
public final class MasterHost implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final String b;

    /* compiled from: MasterHost.kt */
    public static final class CREATOR implements Parcelable.Creator<MasterHost> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MasterHost createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            return new MasterHost(readString);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MasterHost[] newArray(int i) {
            return new MasterHost[i];
        }
    }

    public MasterHost(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getMaster() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
