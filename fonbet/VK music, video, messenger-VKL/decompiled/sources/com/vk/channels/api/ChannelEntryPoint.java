package com.vk.channels.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: ChannelEntryPoint.kt */
/* loaded from: classes16.dex */
public abstract class ChannelEntryPoint implements Parcelable {

    /* compiled from: ChannelEntryPoint.kt */
    public static final class FeedRecommendations extends ChannelEntryPoint {
        public static final FeedRecommendations b = new FeedRecommendations(null);
        public static final Parcelable.Creator<FeedRecommendations> CREATOR = new a();

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<FeedRecommendations> {
            @Override // android.os.Parcelable.Creator
            public final FeedRecommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FeedRecommendations.b;
            }

            @Override // android.os.Parcelable.Creator
            public final FeedRecommendations[] newArray(int i) {
                return new FeedRecommendations[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedRecommendations);
        }

        public final int hashCode() {
            return -639307767;
        }

        public final String toString() {
            return "FeedRecommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelEntryPoint.kt */
    public static final class FolderRecommendations extends ChannelEntryPoint {
        public static final FolderRecommendations b = new FolderRecommendations(null);
        public static final Parcelable.Creator<FolderRecommendations> CREATOR = new a();

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<FolderRecommendations> {
            @Override // android.os.Parcelable.Creator
            public final FolderRecommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FolderRecommendations.b;
            }

            @Override // android.os.Parcelable.Creator
            public final FolderRecommendations[] newArray(int i) {
                return new FolderRecommendations[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FolderRecommendations);
        }

        public final int hashCode() {
            return 926582777;
        }

        public final String toString() {
            return "FolderRecommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelEntryPoint.kt */
    public static final class Global extends ChannelEntryPoint {
        public static final Parcelable.Creator<Global> CREATOR = new a();
        public final String b;

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Global> {
            @Override // android.os.Parcelable.Creator
            public final Global createFromParcel(Parcel parcel) {
                return new Global(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Global[] newArray(int i) {
                return new Global[i];
            }
        }

        public Global(String str) {
            super(null);
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
            return (obj instanceof Global) && epx.f(this.b, ((Global) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Global(catalogTrackCode="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ChannelEntryPoint.kt */
    public static final class Search extends ChannelEntryPoint {
        public static final Search b = new Search(null);
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            public final Search createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Search.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Search[] newArray(int i) {
                return new Search[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Search);
        }

        public final int hashCode() {
            return -432170277;
        }

        public final String toString() {
            return "Search";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelEntryPoint.kt */
    public static final class SearchRecommendations extends ChannelEntryPoint {
        public static final SearchRecommendations b = new SearchRecommendations(null);
        public static final Parcelable.Creator<SearchRecommendations> CREATOR = new a();

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<SearchRecommendations> {
            @Override // android.os.Parcelable.Creator
            public final SearchRecommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SearchRecommendations.b;
            }

            @Override // android.os.Parcelable.Creator
            public final SearchRecommendations[] newArray(int i) {
                return new SearchRecommendations[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchRecommendations);
        }

        public final int hashCode() {
            return 1196319615;
        }

        public final String toString() {
            return "SearchRecommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelEntryPoint.kt */
    public static final class ShareInMessenger extends ChannelEntryPoint {
        public static final ShareInMessenger b = new ShareInMessenger(null);
        public static final Parcelable.Creator<ShareInMessenger> CREATOR = new a();

        /* compiled from: ChannelEntryPoint.kt */
        public static final class a implements Parcelable.Creator<ShareInMessenger> {
            @Override // android.os.Parcelable.Creator
            public final ShareInMessenger createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShareInMessenger.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ShareInMessenger[] newArray(int i) {
                return new ShareInMessenger[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareInMessenger);
        }

        public final int hashCode() {
            return 534077314;
        }

        public final String toString() {
            return "ShareInMessenger";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ChannelEntryPoint(zcl zclVar) {
        this();
    }

    public ChannelEntryPoint() {
    }
}
