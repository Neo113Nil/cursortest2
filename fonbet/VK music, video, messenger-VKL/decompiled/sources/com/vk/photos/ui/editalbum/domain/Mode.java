package com.vk.photos.ui.editalbum.domain;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.zcl;

/* compiled from: EditAlbumState.kt */
/* loaded from: classes3.dex */
public abstract class Mode implements Parcelable {

    /* compiled from: EditAlbumState.kt */
    public static final class Community extends Mode {
        public static final Parcelable.Creator<Community> CREATOR = new a();
        public final boolean b;
        public final boolean c;

        /* compiled from: EditAlbumState.kt */
        public static final class a implements Parcelable.Creator<Community> {
            @Override // android.os.Parcelable.Creator
            public final Community createFromParcel(Parcel parcel) {
                return new Community(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Community[] newArray(int i) {
                return new Community[i];
            }
        }

        public Community(boolean z, boolean z2) {
            super(null);
            this.b = z;
            this.c = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Community)) {
                return false;
            }
            Community community = (Community) obj;
            return this.b == community.b && this.c == community.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Community(uploadByAdminsOnly=");
            sb.append(this.b);
            sb.append(", commentsDisabled=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: EditAlbumState.kt */
    public static final class SystemAlbum extends Mode {
        public static final Parcelable.Creator<SystemAlbum> CREATOR = new a();
        public final PrivacySettingData b;
        public final PrivacySettingData c;

        /* compiled from: EditAlbumState.kt */
        public static final class a implements Parcelable.Creator<SystemAlbum> {
            @Override // android.os.Parcelable.Creator
            public final SystemAlbum createFromParcel(Parcel parcel) {
                Parcelable.Creator<PrivacySettingData> creator = PrivacySettingData.CREATOR;
                return new SystemAlbum(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SystemAlbum[] newArray(int i) {
                return new SystemAlbum[i];
            }
        }

        public /* synthetic */ SystemAlbum(PrivacySettingData privacySettingData, PrivacySettingData privacySettingData2, int i, zcl zclVar) {
            this(privacySettingData, (i & 2) != 0 ? null : privacySettingData2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemAlbum)) {
                return false;
            }
            SystemAlbum systemAlbum = (SystemAlbum) obj;
            return epx.f(this.b, systemAlbum.b) && epx.f(this.c, systemAlbum.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PrivacySettingData privacySettingData = this.c;
            return hashCode + (privacySettingData == null ? 0 : privacySettingData.hashCode());
        }

        public final String toString() {
            return "SystemAlbum(albumPrivacySettings=" + this.b + ", externalPrivacy=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            PrivacySettingData privacySettingData = this.c;
            if (privacySettingData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                privacySettingData.writeToParcel(parcel, i);
            }
        }

        public SystemAlbum(PrivacySettingData privacySettingData, PrivacySettingData privacySettingData2) {
            super(null);
            this.b = privacySettingData;
            this.c = privacySettingData2;
        }
    }

    /* compiled from: EditAlbumState.kt */
    public static final class User extends Mode {
        public static final Parcelable.Creator<User> CREATOR = new a();
        public final PrivacySettingData b;
        public final PrivacySettingData c;

        /* compiled from: EditAlbumState.kt */
        public static final class a implements Parcelable.Creator<User> {
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                Parcelable.Creator<PrivacySettingData> creator = PrivacySettingData.CREATOR;
                return new User(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(PrivacySettingData privacySettingData, PrivacySettingData privacySettingData2) {
            super(null);
            this.b = privacySettingData;
            this.c = privacySettingData2;
        }

        public static User a(User user, PrivacySettingData privacySettingData, PrivacySettingData privacySettingData2, int i) {
            if ((i & 1) != 0) {
                privacySettingData = user.b;
            }
            if ((i & 2) != 0) {
                privacySettingData2 = user.c;
            }
            user.getClass();
            return new User(privacySettingData, privacySettingData2);
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
            return epx.f(this.b, user.b) && epx.f(this.c, user.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "User(albumPrivacySettings=" + this.b + ", commentPrivacySettings=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ Mode(zcl zclVar) {
        this();
    }

    public Mode() {
    }
}
