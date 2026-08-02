package com.vk.video.profile.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: VideoProfileSource.kt */
/* loaded from: classes6.dex */
public interface VideoProfileSource extends Parcelable {

    /* compiled from: VideoProfileSource.kt */
    public static final class ForeignProfile implements VideoProfileSource {
        public static final Parcelable.Creator<ForeignProfile> CREATOR = new a();
        public final UserId b;

        /* compiled from: VideoProfileSource.kt */
        public static final class a implements Parcelable.Creator<ForeignProfile> {
            @Override // android.os.Parcelable.Creator
            public final ForeignProfile createFromParcel(Parcel parcel) {
                return new ForeignProfile((UserId) parcel.readParcelable(ForeignProfile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ForeignProfile[] newArray(int i) {
                return new ForeignProfile[i];
            }
        }

        public ForeignProfile(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForeignProfile) && epx.f(this.b, ((ForeignProfile) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ForeignProfile(ownerId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: VideoProfileSource.kt */
    public static final class OwnProfile implements VideoProfileSource {
        public static final Parcelable.Creator<OwnProfile> CREATOR = new a();
        public final UserId b;

        /* compiled from: VideoProfileSource.kt */
        public static final class a implements Parcelable.Creator<OwnProfile> {
            @Override // android.os.Parcelable.Creator
            public final OwnProfile createFromParcel(Parcel parcel) {
                return new OwnProfile((UserId) parcel.readParcelable(OwnProfile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OwnProfile[] newArray(int i) {
                return new OwnProfile[i];
            }
        }

        public OwnProfile(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OwnProfile) && epx.f(this.b, ((OwnProfile) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OwnProfile(ownerId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }
}
