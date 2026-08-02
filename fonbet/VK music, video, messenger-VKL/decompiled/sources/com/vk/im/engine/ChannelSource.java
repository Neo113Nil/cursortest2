package com.vk.im.engine;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.fbb;
import xsna.ho8;
import xsna.zcl;

/* compiled from: ChannelSource.kt */
/* loaded from: classes2.dex */
public abstract class ChannelSource implements Parcelable {
    public final String b;

    /* compiled from: ChannelSource.kt */
    public static final class Channel extends ChannelSource {
        public static final Channel c = new Channel("channel", null);
        public static final Parcelable.Creator<Channel> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<Channel> {
            @Override // android.os.Parcelable.Creator
            public final Channel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Channel.c;
            }

            @Override // android.os.Parcelable.Creator
            public final Channel[] newArray(int i) {
                return new Channel[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Channel);
        }

        public final int hashCode() {
            return 20796421;
        }

        public final String toString() {
            return "Channel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class FeedRecommendations extends ChannelSource implements fbb {
        public static final FeedRecommendations c = new FeedRecommendations("feed_recomm", null);
        public static final Parcelable.Creator<FeedRecommendations> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<FeedRecommendations> {
            @Override // android.os.Parcelable.Creator
            public final FeedRecommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FeedRecommendations.c;
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
            return 1116225118;
        }

        public final String toString() {
            return "FeedRecommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class FolderRecommendations extends ChannelSource implements fbb {
        public static final FolderRecommendations c = new FolderRecommendations("folder_recomm", null);
        public static final Parcelable.Creator<FolderRecommendations> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<FolderRecommendations> {
            @Override // android.os.Parcelable.Creator
            public final FolderRecommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FolderRecommendations.c;
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
            return 71537934;
        }

        public final String toString() {
            return "FolderRecommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class FolderRecommendationsPlus extends ChannelSource implements fbb {
        public static final FolderRecommendationsPlus c = new FolderRecommendationsPlus("folder_recomm_plus", null);
        public static final Parcelable.Creator<FolderRecommendationsPlus> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<FolderRecommendationsPlus> {
            @Override // android.os.Parcelable.Creator
            public final FolderRecommendationsPlus createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FolderRecommendationsPlus.c;
            }

            @Override // android.os.Parcelable.Creator
            public final FolderRecommendationsPlus[] newArray(int i) {
                return new FolderRecommendationsPlus[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FolderRecommendationsPlus);
        }

        public final int hashCode() {
            return 1599889352;
        }

        public final String toString() {
            return "FolderRecommendationsPlus";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static abstract class GLobalBase extends ChannelSource {
        public GLobalBase(String str) {
            super(str, null);
        }

        public abstract String e();
    }

    /* compiled from: ChannelSource.kt */
    public static final class Global extends GLobalBase {
        public static final Parcelable.Creator<Global> CREATOR = new a();
        public final String c;

        /* compiled from: ChannelSource.kt */
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
            super("global_search");
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.im.engine.ChannelSource.GLobalBase
        public final String e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Global) && epx.f(this.c, ((Global) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Global(catalogTrackCode="), this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class GlobalPlus extends GLobalBase {
        public static final Parcelable.Creator<GlobalPlus> CREATOR = new a();
        public final String c;

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<GlobalPlus> {
            @Override // android.os.Parcelable.Creator
            public final GlobalPlus createFromParcel(Parcel parcel) {
                return new GlobalPlus(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GlobalPlus[] newArray(int i) {
                return new GlobalPlus[i];
            }
        }

        public GlobalPlus(String str) {
            super("global_search_plus");
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.im.engine.ChannelSource.GLobalBase
        public final String e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GlobalPlus) && epx.f(this.c, ((GlobalPlus) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("GlobalPlus(catalogTrackCode="), this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class Plus extends ChannelSource {
        public static final Plus c = new Plus("search_plus", null);
        public static final Parcelable.Creator<Plus> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<Plus> {
            @Override // android.os.Parcelable.Creator
            public final Plus createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Plus.c;
            }

            @Override // android.os.Parcelable.Creator
            public final Plus[] newArray(int i) {
                return new Plus[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Plus);
        }

        public final int hashCode() {
            return 1933567448;
        }

        public final String toString() {
            return "Plus";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class Recommendations extends ChannelSource implements fbb {
        public static final Recommendations c = new Recommendations("search_recomm", null);
        public static final Parcelable.Creator<Recommendations> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<Recommendations> {
            @Override // android.os.Parcelable.Creator
            public final Recommendations createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Recommendations.c;
            }

            @Override // android.os.Parcelable.Creator
            public final Recommendations[] newArray(int i) {
                return new Recommendations[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Recommendations);
        }

        public final int hashCode() {
            return 1229679836;
        }

        public final String toString() {
            return "Recommendations";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class RecommendationsPlus extends ChannelSource implements fbb {
        public static final RecommendationsPlus c = new RecommendationsPlus("search_recomm_plus", null);
        public static final Parcelable.Creator<RecommendationsPlus> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<RecommendationsPlus> {
            @Override // android.os.Parcelable.Creator
            public final RecommendationsPlus createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RecommendationsPlus.c;
            }

            @Override // android.os.Parcelable.Creator
            public final RecommendationsPlus[] newArray(int i) {
                return new RecommendationsPlus[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecommendationsPlus);
        }

        public final int hashCode() {
            return -1443389290;
        }

        public final String toString() {
            return "RecommendationsPlus";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class Search extends ChannelSource {
        public static final Search c = new Search("search", null);
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            public final Search createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Search.c;
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
            return -1483692442;
        }

        public final String toString() {
            return "Search";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class ShareInMessenger extends ChannelSource {
        public static final ShareInMessenger c = new ShareInMessenger("share_in_messenger", null);
        public static final Parcelable.Creator<ShareInMessenger> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<ShareInMessenger> {
            @Override // android.os.Parcelable.Creator
            public final ShareInMessenger createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShareInMessenger.c;
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
            return 1094957389;
        }

        public final String toString() {
            return "ShareInMessenger";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class Suggest extends ChannelSource {
        public static final Suggest c = new Suggest("suggest", null);
        public static final Parcelable.Creator<Suggest> CREATOR = new a();

        /* compiled from: ChannelSource.kt */
        public static final class a implements Parcelable.Creator<Suggest> {
            @Override // android.os.Parcelable.Creator
            public final Suggest createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Suggest.c;
            }

            @Override // android.os.Parcelable.Creator
            public final Suggest[] newArray(int i) {
                return new Suggest[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Suggest);
        }

        public final int hashCode() {
            return 1713456774;
        }

        public final String toString() {
            return "Suggest";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ChannelSource.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static ChannelSource a(String str, String str2) {
            switch (str.hashCode()) {
                case -1863356540:
                    if (str.equals("suggest")) {
                        return Suggest.c;
                    }
                    break;
                case -1586596647:
                    if (str.equals("share_in_messenger")) {
                        return ShareInMessenger.c;
                    }
                    break;
                case -1253600828:
                    if (str.equals("global_search")) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        return new Global(str2);
                    }
                    break;
                case -966585168:
                    if (str.equals("folder_recomm")) {
                        return FolderRecommendations.c;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        return Search.c;
                    }
                    break;
                case -539350575:
                    if (str.equals("search_plus")) {
                        return Plus.c;
                    }
                    break;
                case 181723651:
                    if (str.equals("search_recomm_plus")) {
                        return RecommendationsPlus.c;
                    }
                    break;
                case 304979913:
                    if (str.equals("folder_recomm_plus")) {
                        return FolderRecommendationsPlus.c;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        return Channel.c;
                    }
                    break;
                case 818189696:
                    if (str.equals("feed_recomm")) {
                        return FeedRecommendations.c;
                    }
                    break;
                case 1102065461:
                    if (str.equals("global_search_plus")) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        return new GlobalPlus(str2);
                    }
                    break;
                case 1425397302:
                    if (str.equals("search_recomm")) {
                        return Recommendations.c;
                    }
                    break;
            }
            throw new IllegalArgumentException("No valid source");
        }
    }

    public ChannelSource(String str, zcl zclVar) {
        this.b = str;
    }

    public final String d() {
        return this.b;
    }
}
