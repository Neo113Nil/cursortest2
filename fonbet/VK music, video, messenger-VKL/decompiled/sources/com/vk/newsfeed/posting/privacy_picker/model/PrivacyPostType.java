package com.vk.newsfeed.posting.privacy_picker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import xsna.epx;

/* compiled from: PrivacyPostType.kt */
/* loaded from: classes4.dex */
public interface PrivacyPostType extends Parcelable {

    /* compiled from: PrivacyPostType.kt */
    public static final class AllDonuts implements PrivacyPostType {
        public static final AllDonuts b = new AllDonuts();
        public static final Parcelable.Creator<AllDonuts> CREATOR = new a();

        /* compiled from: PrivacyPostType.kt */
        public static final class a implements Parcelable.Creator<AllDonuts> {
            @Override // android.os.Parcelable.Creator
            public final AllDonuts createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllDonuts.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AllDonuts[] newArray(int i) {
                return new AllDonuts[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllDonuts);
        }

        public final int hashCode() {
            return 1045134293;
        }

        public final String toString() {
            return "AllDonuts";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PrivacyPostType.kt */
    public static final class AllUsers implements PrivacyPostType {
        public static final AllUsers b = new AllUsers();
        public static final Parcelable.Creator<AllUsers> CREATOR = new a();

        /* compiled from: PrivacyPostType.kt */
        public static final class a implements Parcelable.Creator<AllUsers> {
            @Override // android.os.Parcelable.Creator
            public final AllUsers createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllUsers.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AllUsers[] newArray(int i) {
                return new AllUsers[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllUsers);
        }

        public final int hashCode() {
            return 326618948;
        }

        public final String toString() {
            return "AllUsers";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PrivacyPostType.kt */
    public static final class BestFriends implements PrivacyPostType {
        public static final BestFriends b = new BestFriends();
        public static final Parcelable.Creator<BestFriends> CREATOR = new a();

        /* compiled from: PrivacyPostType.kt */
        public static final class a implements Parcelable.Creator<BestFriends> {
            @Override // android.os.Parcelable.Creator
            public final BestFriends createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BestFriends.b;
            }

            @Override // android.os.Parcelable.Creator
            public final BestFriends[] newArray(int i) {
                return new BestFriends[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BestFriends);
        }

        public final int hashCode() {
            return -711337068;
        }

        public final String toString() {
            return "BestFriends";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PrivacyPostType.kt */
    public static final class FriendsOnly implements PrivacyPostType {
        public static final FriendsOnly b = new FriendsOnly();
        public static final Parcelable.Creator<FriendsOnly> CREATOR = new a();

        /* compiled from: PrivacyPostType.kt */
        public static final class a implements Parcelable.Creator<FriendsOnly> {
            @Override // android.os.Parcelable.Creator
            public final FriendsOnly createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FriendsOnly.b;
            }

            @Override // android.os.Parcelable.Creator
            public final FriendsOnly[] newArray(int i) {
                return new FriendsOnly[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FriendsOnly);
        }

        public final int hashCode() {
            return -593378460;
        }

        public final String toString() {
            return "FriendsOnly";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PrivacyPostType.kt */
    public static final class SingleDonutLevel implements PrivacyPostType {
        public static final Parcelable.Creator<SingleDonutLevel> CREATOR = new a();
        public final DonutLevel b;

        /* compiled from: PrivacyPostType.kt */
        public static final class a implements Parcelable.Creator<SingleDonutLevel> {
            @Override // android.os.Parcelable.Creator
            public final SingleDonutLevel createFromParcel(Parcel parcel) {
                return new SingleDonutLevel(parcel.readInt() == 0 ? null : DonutLevel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SingleDonutLevel[] newArray(int i) {
                return new SingleDonutLevel[i];
            }
        }

        public SingleDonutLevel(DonutLevel donutLevel) {
            this.b = donutLevel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleDonutLevel) && epx.f(this.b, ((SingleDonutLevel) obj).b);
        }

        public final int hashCode() {
            DonutLevel donutLevel = this.b;
            if (donutLevel == null) {
                return 0;
            }
            return donutLevel.hashCode();
        }

        public final String toString() {
            return "SingleDonutLevel(level=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            DonutLevel donutLevel = this.b;
            if (donutLevel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                donutLevel.writeToParcel(parcel, i);
            }
        }
    }
}
