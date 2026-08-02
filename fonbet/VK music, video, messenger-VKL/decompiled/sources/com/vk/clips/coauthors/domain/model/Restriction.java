package com.vk.clips.coauthors.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: Restriction.kt */
/* loaded from: classes16.dex */
public interface Restriction extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Restriction.kt */
    public static final class Blacklisted implements Restriction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Blacklisted[] $VALUES;
        public static final Parcelable.Creator<Blacklisted> CREATOR;
        public static final Blacklisted Female;
        public static final Blacklisted Male;

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<Blacklisted> {
            @Override // android.os.Parcelable.Creator
            public final Blacklisted createFromParcel(Parcel parcel) {
                return Blacklisted.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Blacklisted[] newArray(int i) {
                return new Blacklisted[i];
            }
        }

        static {
            Blacklisted blacklisted = new Blacklisted("Male", 0);
            Male = blacklisted;
            Blacklisted blacklisted2 = new Blacklisted("Female", 1);
            Female = blacklisted2;
            Blacklisted[] blacklistedArr = {blacklisted, blacklisted2};
            $VALUES = blacklistedArr;
            $ENTRIES = new asp(blacklistedArr);
            CREATOR = new a();
        }

        public Blacklisted() {
            throw null;
        }

        public static Blacklisted valueOf(String str) {
            return (Blacklisted) Enum.valueOf(Blacklisted.class, str);
        }

        public static Blacklisted[] values() {
            return (Blacklisted[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: Restriction.kt */
    public static final class BlacklistedByMe implements Restriction {
        public static final BlacklistedByMe b = new BlacklistedByMe();
        public static final Parcelable.Creator<BlacklistedByMe> CREATOR = new a();

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<BlacklistedByMe> {
            @Override // android.os.Parcelable.Creator
            public final BlacklistedByMe createFromParcel(Parcel parcel) {
                parcel.readInt();
                return BlacklistedByMe.b;
            }

            @Override // android.os.Parcelable.Creator
            public final BlacklistedByMe[] newArray(int i) {
                return new BlacklistedByMe[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BlacklistedByMe);
        }

        public final int hashCode() {
            return -1122215741;
        }

        public final String toString() {
            return "BlacklistedByMe";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: Restriction.kt */
    public static final class ClosedProfile implements Restriction {
        public static final ClosedProfile b = new ClosedProfile();
        public static final Parcelable.Creator<ClosedProfile> CREATOR = new a();

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<ClosedProfile> {
            @Override // android.os.Parcelable.Creator
            public final ClosedProfile createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ClosedProfile.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ClosedProfile[] newArray(int i) {
                return new ClosedProfile[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosedProfile);
        }

        public final int hashCode() {
            return -538187659;
        }

        public final String toString() {
            return "ClosedProfile";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: Restriction.kt */
    public static final class CommunityBanned implements Restriction {
        public static final CommunityBanned b = new CommunityBanned();
        public static final Parcelable.Creator<CommunityBanned> CREATOR = new a();

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<CommunityBanned> {
            @Override // android.os.Parcelable.Creator
            public final CommunityBanned createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CommunityBanned.b;
            }

            @Override // android.os.Parcelable.Creator
            public final CommunityBanned[] newArray(int i) {
                return new CommunityBanned[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CommunityBanned);
        }

        public final int hashCode() {
            return 632818751;
        }

        public final String toString() {
            return "CommunityBanned";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: Restriction.kt */
    public static final class CommunityClosed implements Restriction {
        public static final CommunityClosed b = new CommunityClosed();
        public static final Parcelable.Creator<CommunityClosed> CREATOR = new a();

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<CommunityClosed> {
            @Override // android.os.Parcelable.Creator
            public final CommunityClosed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CommunityClosed.b;
            }

            @Override // android.os.Parcelable.Creator
            public final CommunityClosed[] newArray(int i) {
                return new CommunityClosed[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CommunityClosed);
        }

        public final int hashCode() {
            return 671641229;
        }

        public final String toString() {
            return "CommunityClosed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Restriction.kt */
    public static final class DisabledByPrivacy implements Restriction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisabledByPrivacy[] $VALUES;
        public static final Parcelable.Creator<DisabledByPrivacy> CREATOR;
        public static final DisabledByPrivacy Community;
        public static final DisabledByPrivacy Female;
        public static final DisabledByPrivacy Male;

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<DisabledByPrivacy> {
            @Override // android.os.Parcelable.Creator
            public final DisabledByPrivacy createFromParcel(Parcel parcel) {
                return DisabledByPrivacy.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DisabledByPrivacy[] newArray(int i) {
                return new DisabledByPrivacy[i];
            }
        }

        static {
            DisabledByPrivacy disabledByPrivacy = new DisabledByPrivacy("Male", 0);
            Male = disabledByPrivacy;
            DisabledByPrivacy disabledByPrivacy2 = new DisabledByPrivacy("Female", 1);
            Female = disabledByPrivacy2;
            DisabledByPrivacy disabledByPrivacy3 = new DisabledByPrivacy("Community", 2);
            Community = disabledByPrivacy3;
            DisabledByPrivacy[] disabledByPrivacyArr = {disabledByPrivacy, disabledByPrivacy2, disabledByPrivacy3};
            $VALUES = disabledByPrivacyArr;
            $ENTRIES = new asp(disabledByPrivacyArr);
            CREATOR = new a();
        }

        public DisabledByPrivacy() {
            throw null;
        }

        public static DisabledByPrivacy valueOf(String str) {
            return (DisabledByPrivacy) Enum.valueOf(DisabledByPrivacy.class, str);
        }

        public static DisabledByPrivacy[] values() {
            return (DisabledByPrivacy[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: Restriction.kt */
    public static final class None implements Restriction {
        public static final Parcelable.Creator<None> CREATOR = new a();
        public final String b;

        /* compiled from: Restriction.kt */
        public static final class a implements Parcelable.Creator<None> {
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                return new None(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }

        public None(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof None) && epx.f(this.b, ((None) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("None(details="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
