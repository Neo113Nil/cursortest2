package com.vk.im.engine.models.attaches.miniapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.im.ImageList;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: UserStack.kt */
/* loaded from: classes2.dex */
public final class UserStack implements Parcelable {
    public static final Parcelable.Creator<UserStack> CREATOR = new a();
    public final String b;
    public final List<ImageList> c;

    /* compiled from: UserStack.kt */
    public static final class a implements Parcelable.Creator<UserStack> {
        @Override // android.os.Parcelable.Creator
        public final UserStack createFromParcel(Parcel parcel) {
            return new UserStack(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserStack[] newArray(int i) {
            return new UserStack[i];
        }
    }

    public UserStack(String str, List<ImageList> list) {
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStack)) {
            return false;
        }
        UserStack userStack = (UserStack) obj;
        return epx.f(this.b, userStack.b) && epx.f(this.c, userStack.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStack(description=");
        sb.append(this.b);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }

    public UserStack(Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(ImageList.CREATOR));
    }
}
