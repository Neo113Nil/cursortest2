package com.vk.im.engine.models.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: DialogTag.kt */
/* loaded from: classes2.dex */
public final class DialogTag implements Parcelable {
    public static final Parcelable.Creator<DialogTag> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: DialogTag.kt */
    public static final class a implements Parcelable.Creator<DialogTag> {
        @Override // android.os.Parcelable.Creator
        public final DialogTag createFromParcel(Parcel parcel) {
            return new DialogTag(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DialogTag[] newArray(int i) {
            return new DialogTag[i];
        }
    }

    public DialogTag(int i, String str, String str2) {
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
        if (!(obj instanceof DialogTag)) {
            return false;
        }
        DialogTag dialogTag = (DialogTag) obj;
        return this.b == dialogTag.b && epx.f(this.c, dialogTag.c) && epx.f(this.d, dialogTag.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogTag(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", color=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
