package com.vk.push.core.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: AidlException.kt */
/* loaded from: classes5.dex */
public final class AidlException implements Parcelable {
    public static final int HOST_IS_NOT_MASTER = 103;
    public static final int ILLEGAL_ARGUMENT_EXCEPTION = 101;
    public static final int ILLEGAL_STATE_EXCEPTION = 102;
    public static final int RUNTIME_EXCEPTION = 100;
    public static final int SDK_IS_NOT_INITIALIZED = 104;
    public static final int TRANSFERRED_IPC_DATA_EXCEPTION = 105;
    public static final int UNKNOWN_EXCEPTION = 0;
    public final int b;
    public final String c;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AidlException> CREATOR = new Parcelable.Creator<AidlException>() { // from class: com.vk.push.core.base.AidlException$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AidlException createFromParcel(Parcel parcel) {
            return new AidlException(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AidlException[] newArray(int i) {
            return new AidlException[i];
        }
    };

    /* compiled from: AidlException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    public AidlException(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static /* synthetic */ AidlException copy$default(AidlException aidlException, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aidlException.b;
        }
        if ((i2 & 2) != 0) {
            str = aidlException.c;
        }
        return aidlException.copy(i, str);
    }

    public final AidlException copy(int i, String str) {
        return new AidlException(i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AidlException)) {
            return false;
        }
        AidlException aidlException = (AidlException) obj;
        return this.b == aidlException.b && epx.f(this.c, aidlException.c);
    }

    public int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final Exception toException() {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 100:
                return new RuntimeException(str);
            case 101:
                return new IllegalArgumentException(str);
            case 102:
                return new IllegalStateException(str);
            case 103:
                return new HostIsNotMasterException(str);
            case 104:
                return new SdkIsNotInitializedException(str);
            case 105:
                return new TransferredIpcDataException(str);
            default:
                return new RuntimeException(str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AidlException(code=");
        sb.append(this.b);
        sb.append(", message=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AidlException(Parcel parcel) {
        this(r0, r2 == null ? "" : r2);
        int readInt = parcel.readInt();
        String readString = parcel.readString();
    }
}
