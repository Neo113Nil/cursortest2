package com.vk.games.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.zcl;

/* compiled from: GamesHeaderSectionInfo.kt */
/* loaded from: classes17.dex */
public abstract class GamesHeaderSectionInfo implements Parcelable {
    public final String b;

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Collection extends GamesHeaderSectionInfo {
        public static final Parcelable.Creator<Collection> CREATOR = new a();
        public final int c;
        public final String d;
        public final String e;

        /* compiled from: GamesHeaderSectionInfo.kt */
        public static final class a implements Parcelable.Creator<Collection> {
            @Override // android.os.Parcelable.Creator
            public final Collection createFromParcel(Parcel parcel) {
                return new Collection(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Collection[] newArray(int i) {
                return new Collection[i];
            }
        }

        public /* synthetic */ Collection(int i, String str, int i2, zcl zclVar) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collection)) {
                return false;
            }
            Collection collection = (Collection) obj;
            return this.c == collection.c && epx.f(this.d, collection.d);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String getTitle() {
            return this.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.c) * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Collection(collectionId=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
        }

        public Collection(int i, String str) {
            super(str, null);
            this.c = i;
            this.d = str;
            this.e = "collection_" + i + '_' + str;
        }

        public Collection(Parcel parcel) {
            this(parcel.readInt(), parcel.readString());
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class FriendlyUrl extends GamesHeaderSectionInfo {
        public static final Parcelable.Creator<FriendlyUrl> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: GamesHeaderSectionInfo.kt */
        public static final class a implements Parcelable.Creator<FriendlyUrl> {
            @Override // android.os.Parcelable.Creator
            public final FriendlyUrl createFromParcel(Parcel parcel) {
                return new FriendlyUrl(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FriendlyUrl[] newArray(int i) {
                return new FriendlyUrl[i];
            }
        }

        public /* synthetic */ FriendlyUrl(String str, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendlyUrl)) {
                return false;
            }
            FriendlyUrl friendlyUrl = (FriendlyUrl) obj;
            return epx.f(this.c, friendlyUrl.c) && epx.f(this.d, friendlyUrl.d);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String getTitle() {
            return this.d;
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendlyUrl(tag=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        public FriendlyUrl(String str, String str2) {
            super(str2, null);
            this.c = str;
            this.d = str2;
            this.e = go9.b("friendly_url_", str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FriendlyUrl(Parcel parcel) {
            this(r0 == null ? "" : r0, parcel.readString());
            String readString = parcel.readString();
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Genre extends GamesHeaderSectionInfo {
        public static final Parcelable.Creator<Genre> CREATOR = new a();
        public final int c;
        public final String d;
        public final String e;

        /* compiled from: GamesHeaderSectionInfo.kt */
        public static final class a implements Parcelable.Creator<Genre> {
            @Override // android.os.Parcelable.Creator
            public final Genre createFromParcel(Parcel parcel) {
                return new Genre(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Genre[] newArray(int i) {
                return new Genre[i];
            }
        }

        public /* synthetic */ Genre(int i, String str, int i2, zcl zclVar) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Genre)) {
                return false;
            }
            Genre genre = (Genre) obj;
            return this.c == genre.c && epx.f(this.d, genre.d);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String getTitle() {
            return this.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.c) * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Genre(genreId=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
        }

        public Genre(int i, String str) {
            super(str, null);
            this.c = i;
            this.d = str;
            this.e = "genre_" + i + '_' + str;
        }

        public Genre(Parcel parcel) {
            this(parcel.readInt(), parcel.readString());
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Section extends GamesHeaderSectionInfo {
        public static final Parcelable.Creator<Section> CREATOR = new a();
        public final SectionIdType c;
        public final String d;
        public final String e;

        /* compiled from: GamesHeaderSectionInfo.kt */
        public static final class a implements Parcelable.Creator<Section> {
            @Override // android.os.Parcelable.Creator
            public final Section createFromParcel(Parcel parcel) {
                return new Section(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Section[] newArray(int i) {
                return new Section[i];
            }
        }

        public /* synthetic */ Section(SectionIdType sectionIdType, String str, int i, zcl zclVar) {
            this(sectionIdType, (i & 2) != 0 ? null : str);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return epx.f(this.c, section.c) && epx.f(this.d, section.d);
        }

        @Override // com.vk.games.model.GamesHeaderSectionInfo
        public final String getTitle() {
            return this.d;
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Section(sectionIdType=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
        }

        public Section(SectionIdType sectionIdType, String str) {
            super(str, null);
            this.c = sectionIdType;
            this.d = str;
            this.e = "section_" + sectionIdType.d() + '_' + str;
        }

        public Section(Parcel parcel) {
            this((SectionIdType) parcel.readParcelable(SectionIdType.class.getClassLoader()), parcel.readString());
        }
    }

    public GamesHeaderSectionInfo(String str, zcl zclVar) {
        this.b = str;
    }

    public abstract String d();

    public String getTitle() {
        return this.b;
    }
}
