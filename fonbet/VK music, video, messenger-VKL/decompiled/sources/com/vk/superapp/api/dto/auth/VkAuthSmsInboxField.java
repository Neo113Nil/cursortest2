package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: VkAuthSmsInboxField.kt */
/* loaded from: classes6.dex */
public final class VkAuthSmsInboxField implements Parcelable {
    public static final Parcelable.Creator<VkAuthSmsInboxField> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    /* compiled from: VkAuthSmsInboxField.kt */
    public static final class a implements Parcelable.Creator<VkAuthSmsInboxField> {
        @Override // android.os.Parcelable.Creator
        public final VkAuthSmsInboxField createFromParcel(Parcel parcel) {
            return new VkAuthSmsInboxField(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkAuthSmsInboxField[] newArray(int i) {
            return new VkAuthSmsInboxField[i];
        }
    }

    public VkAuthSmsInboxField(String str, String str2, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthSmsInboxField)) {
            return false;
        }
        VkAuthSmsInboxField vkAuthSmsInboxField = (VkAuthSmsInboxField) obj;
        return epx.f(this.b, vkAuthSmsInboxField.b) && epx.f(this.c, vkAuthSmsInboxField.c) && this.d == vkAuthSmsInboxField.d && this.e == vkAuthSmsInboxField.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthSmsInboxField(phoneToSms=");
        sb.append(this.b);
        sb.append(", messageToSend=");
        sb.append(this.c);
        sb.append(", timeOutSec=");
        sb.append(this.d);
        sb.append(", pollDelaySec=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
