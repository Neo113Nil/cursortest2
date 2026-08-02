package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.qoy;
import xsna.urd0;

/* compiled from: PickerItem.kt */
/* loaded from: classes17.dex */
public interface PickerItem extends Parcelable {

    /* compiled from: PickerItem.kt */
    public static final class Add implements PickerItem {
        public static final Add b = new Add();
        public static final Parcelable.Creator<Add> CREATOR = new a();

        /* compiled from: PickerItem.kt */
        public static final class a implements Parcelable.Creator<Add> {
            @Override // android.os.Parcelable.Creator
            public final Add createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Add.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Add[] newArray(int i) {
                return new Add[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class User implements PickerItem {
        public static final Parcelable.Creator<User> CREATOR = new a();
        public final String b;
        public final String c;
        public final boolean d;
        public final UserId e;

        /* compiled from: PickerItem.kt */
        public static final class a implements Parcelable.Creator<User> {
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                return new User(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (UserId) parcel.readParcelable(User.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(String str, String str2, boolean z, UserId userId) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = userId;
        }

        public static User a(User user, boolean z) {
            String str = user.b;
            String str2 = user.c;
            UserId userId = user.e;
            user.getClass();
            return new User(str, str2, z, userId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return epx.f(this.b, user.b) && epx.f(this.c, user.c) && this.d == user.d && epx.f(this.e, user.e);
        }

        public final int hashCode() {
            return Long.hashCode(this.e.b) + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("User(avatar=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", checked=");
            sb.append(this.d);
            sb.append(", userId=");
            return gp.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeParcelable(this.e, i);
        }
    }
}
