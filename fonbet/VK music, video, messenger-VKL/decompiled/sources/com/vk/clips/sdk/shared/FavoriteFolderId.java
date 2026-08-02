package com.vk.clips.sdk.shared;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;
import xsna.zcl;

/* compiled from: FavoriteFolderId.kt */
/* loaded from: classes17.dex */
public interface FavoriteFolderId extends Parcelable {

    /* compiled from: FavoriteFolderId.kt */
    public static abstract class Alias implements FavoriteFolderId {
        public final String b;

        /* compiled from: FavoriteFolderId.kt */
        public static final class AllClips extends Alias {
            public static final AllClips c = new AllClips("favorite", null);
            public static final Parcelable.Creator<AllClips> CREATOR = new a();

            /* compiled from: FavoriteFolderId.kt */
            public static final class a implements Parcelable.Creator<AllClips> {
                @Override // android.os.Parcelable.Creator
                public final AllClips createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AllClips.c;
                }

                @Override // android.os.Parcelable.Creator
                public final AllClips[] newArray(int i) {
                    return new AllClips[i];
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

        public Alias(String str, zcl zclVar) {
            this.b = str;
        }
    }

    /* compiled from: FavoriteFolderId.kt */
    public static final class Id implements FavoriteFolderId {
        public static final Parcelable.Creator<Id> CREATOR = new a();
        public final int b;

        /* compiled from: FavoriteFolderId.kt */
        public static final class a implements Parcelable.Creator<Id> {
            @Override // android.os.Parcelable.Creator
            public final Id createFromParcel(Parcel parcel) {
                return new Id(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Id[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Id) && this.b == ((Id) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Id(id="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }
}
