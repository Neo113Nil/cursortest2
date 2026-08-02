package com.vk.im.engine.models.messages;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MsgTemplate.kt */
/* loaded from: classes2.dex */
public final class MsgTemplate implements Parcelable {
    public static final Parcelable.Creator<MsgTemplate> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: MsgTemplate.kt */
    public static final class a implements Parcelable.Creator<MsgTemplate> {
        @Override // android.os.Parcelable.Creator
        public final MsgTemplate createFromParcel(Parcel parcel) {
            return new MsgTemplate(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MsgTemplate[] newArray(int i) {
            return new MsgTemplate[i];
        }
    }

    public MsgTemplate(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgTemplate)) {
            return false;
        }
        MsgTemplate msgTemplate = (MsgTemplate) obj;
        return this.b == msgTemplate.b && epx.f(this.c, msgTemplate.c) && epx.f(this.d, msgTemplate.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgTemplate(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", text=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
