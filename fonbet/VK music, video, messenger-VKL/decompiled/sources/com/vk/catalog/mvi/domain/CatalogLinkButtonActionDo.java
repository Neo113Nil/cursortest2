package com.vk.catalog.mvi.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CatalogLinkButtonActionDo.kt */
/* loaded from: classes16.dex */
public interface CatalogLinkButtonActionDo extends Parcelable {

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class ClearVideoHistory implements CatalogLinkButtonActionDo {
        public static final ClearVideoHistory b = new ClearVideoHistory();
        public static final Parcelable.Creator<ClearVideoHistory> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<ClearVideoHistory> {
            @Override // android.os.Parcelable.Creator
            public final ClearVideoHistory createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ClearVideoHistory.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ClearVideoHistory[] newArray(int i) {
                return new ClearVideoHistory[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearVideoHistory);
        }

        public final int hashCode() {
            return 1614843107;
        }

        public final String toString() {
            return "ClearVideoHistory";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class CreateAlbum implements CatalogLinkButtonActionDo {
        public static final CreateAlbum b = new CreateAlbum();
        public static final Parcelable.Creator<CreateAlbum> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<CreateAlbum> {
            @Override // android.os.Parcelable.Creator
            public final CreateAlbum createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CreateAlbum.b;
            }

            @Override // android.os.Parcelable.Creator
            public final CreateAlbum[] newArray(int i) {
                return new CreateAlbum[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateAlbum);
        }

        public final int hashCode() {
            return 980060912;
        }

        public final String toString() {
            return "CreateAlbum";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenAddVideosToAlbum implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenAddVideosToAlbum> CREATOR = new a();
        public final UserId b;
        public final int c;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenAddVideosToAlbum> {
            @Override // android.os.Parcelable.Creator
            public final OpenAddVideosToAlbum createFromParcel(Parcel parcel) {
                return new OpenAddVideosToAlbum((UserId) parcel.readParcelable(OpenAddVideosToAlbum.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAddVideosToAlbum[] newArray(int i) {
                return new OpenAddVideosToAlbum[i];
            }
        }

        public OpenAddVideosToAlbum(UserId userId, int i) {
            this.b = userId;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAddVideosToAlbum)) {
                return false;
            }
            OpenAddVideosToAlbum openAddVideosToAlbum = (OpenAddVideosToAlbum) obj;
            return epx.f(this.b, openAddVideosToAlbum.b) && this.c == openAddVideosToAlbum.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAddVideosToAlbum(ownerId=");
            sb.append(this.b);
            sb.append(", albumId=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenAuthorCabinet implements CatalogLinkButtonActionDo {
        public static final OpenAuthorCabinet b = new OpenAuthorCabinet();
        public static final Parcelable.Creator<OpenAuthorCabinet> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenAuthorCabinet> {
            @Override // android.os.Parcelable.Creator
            public final OpenAuthorCabinet createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenAuthorCabinet.b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAuthorCabinet[] newArray(int i) {
                return new OpenAuthorCabinet[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenAuthorCabinet);
        }

        public final int hashCode() {
            return -1872806272;
        }

        public final String toString() {
            return "OpenAuthorCabinet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenGroups implements CatalogLinkButtonActionDo {
        public static final OpenGroups b = new OpenGroups();
        public static final Parcelable.Creator<OpenGroups> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenGroups> {
            @Override // android.os.Parcelable.Creator
            public final OpenGroups createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenGroups.b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenGroups[] newArray(int i) {
                return new OpenGroups[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenGroups);
        }

        public final int hashCode() {
            return -918276863;
        }

        public final String toString() {
            return "OpenGroups";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenHowBecomeAuthor implements CatalogLinkButtonActionDo {
        public static final OpenHowBecomeAuthor b = new OpenHowBecomeAuthor();
        public static final Parcelable.Creator<OpenHowBecomeAuthor> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenHowBecomeAuthor> {
            @Override // android.os.Parcelable.Creator
            public final OpenHowBecomeAuthor createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenHowBecomeAuthor.b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenHowBecomeAuthor[] newArray(int i) {
                return new OpenHowBecomeAuthor[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenHowBecomeAuthor);
        }

        public final int hashCode() {
            return 1517295125;
        }

        public final String toString() {
            return "OpenHowBecomeAuthor";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenSection implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenSection> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final CatalogLinkActionStyle e;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenSection> {
            @Override // android.os.Parcelable.Creator
            public final OpenSection createFromParcel(Parcel parcel) {
                return new OpenSection(parcel.readString(), parcel.readString(), parcel.readString(), (CatalogLinkActionStyle) parcel.readParcelable(OpenSection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenSection[] newArray(int i) {
                return new OpenSection[i];
            }
        }

        public OpenSection(String str, String str2, String str3, CatalogLinkActionStyle catalogLinkActionStyle) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = catalogLinkActionStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenUploadClip implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenUploadClip> CREATOR = new a();
        public final UserId b;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenUploadClip> {
            @Override // android.os.Parcelable.Creator
            public final OpenUploadClip createFromParcel(Parcel parcel) {
                return new OpenUploadClip((UserId) parcel.readParcelable(OpenUploadClip.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenUploadClip[] newArray(int i) {
                return new OpenUploadClip[i];
            }
        }

        public OpenUploadClip(UserId userId) {
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
            return (obj instanceof OpenUploadClip) && epx.f(this.b, ((OpenUploadClip) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenUploadClip(ownerId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenUploadVideo implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenUploadVideo> CREATOR = new a();
        public final UserId b;
        public final int c;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenUploadVideo> {
            @Override // android.os.Parcelable.Creator
            public final OpenUploadVideo createFromParcel(Parcel parcel) {
                return new OpenUploadVideo((UserId) parcel.readParcelable(OpenUploadVideo.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenUploadVideo[] newArray(int i) {
                return new OpenUploadVideo[i];
            }
        }

        public OpenUploadVideo(UserId userId, int i) {
            this.b = userId;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenUploadVideo)) {
                return false;
            }
            OpenUploadVideo openUploadVideo = (OpenUploadVideo) obj;
            return epx.f(this.b, openUploadVideo.b) && this.c == openUploadVideo.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenUploadVideo(ownerId=");
            sb.append(this.b);
            sb.append(", albumId=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class PlayVideosFromBlock implements CatalogLinkButtonActionDo {
        public static final PlayVideosFromBlock b = new PlayVideosFromBlock();
        public static final Parcelable.Creator<PlayVideosFromBlock> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<PlayVideosFromBlock> {
            @Override // android.os.Parcelable.Creator
            public final PlayVideosFromBlock createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PlayVideosFromBlock.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PlayVideosFromBlock[] newArray(int i) {
                return new PlayVideosFromBlock[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlayVideosFromBlock);
        }

        public final int hashCode() {
            return 872722388;
        }

        public final String toString() {
            return "PlayVideosFromBlock";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class SwitchSection implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<SwitchSection> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<SwitchSection> {
            @Override // android.os.Parcelable.Creator
            public final SwitchSection createFromParcel(Parcel parcel) {
                return new SwitchSection(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SwitchSection[] newArray(int i) {
                return new SwitchSection[i];
            }
        }

        public SwitchSection(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwitchSection)) {
                return false;
            }
            SwitchSection switchSection = (SwitchSection) obj;
            return epx.f(this.b, switchSection.b) && epx.f(this.c, switchSection.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SwitchSection(sectionId=");
            sb.append(this.b);
            sb.append(", filterBlockId=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class ToggleAlbumShuffle implements CatalogLinkButtonActionDo {
        public static final ToggleAlbumShuffle b = new ToggleAlbumShuffle();
        public static final Parcelable.Creator<ToggleAlbumShuffle> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<ToggleAlbumShuffle> {
            @Override // android.os.Parcelable.Creator
            public final ToggleAlbumShuffle createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ToggleAlbumShuffle.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ToggleAlbumShuffle[] newArray(int i) {
                return new ToggleAlbumShuffle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleAlbumShuffle);
        }

        public final int hashCode() {
            return -1452639167;
        }

        public final String toString() {
            return "ToggleAlbumShuffle";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class ToggleAlbumSubscription implements CatalogLinkButtonActionDo {
        public static final ToggleAlbumSubscription b = new ToggleAlbumSubscription();
        public static final Parcelable.Creator<ToggleAlbumSubscription> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<ToggleAlbumSubscription> {
            @Override // android.os.Parcelable.Creator
            public final ToggleAlbumSubscription createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ToggleAlbumSubscription.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ToggleAlbumSubscription[] newArray(int i) {
                return new ToggleAlbumSubscription[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleAlbumSubscription);
        }

        public final int hashCode() {
            return -1186516779;
        }

        public final String toString() {
            return "ToggleAlbumSubscription";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class ToggleVideoAlbumSubscription implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<ToggleVideoAlbumSubscription> CREATOR = new a();
        public final UserId b;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<ToggleVideoAlbumSubscription> {
            @Override // android.os.Parcelable.Creator
            public final ToggleVideoAlbumSubscription createFromParcel(Parcel parcel) {
                return new ToggleVideoAlbumSubscription((UserId) parcel.readParcelable(ToggleVideoAlbumSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ToggleVideoAlbumSubscription[] newArray(int i) {
                return new ToggleVideoAlbumSubscription[i];
            }
        }

        public ToggleVideoAlbumSubscription(UserId userId) {
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
            return (obj instanceof ToggleVideoAlbumSubscription) && epx.f(this.b, ((ToggleVideoAlbumSubscription) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ToggleVideoAlbumSubscription(ownerId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenLink implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenLink> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenLink> {
            @Override // android.os.Parcelable.Creator
            public final OpenLink createFromParcel(Parcel parcel) {
                return new OpenLink(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenLink[] newArray(int i) {
                return new OpenLink[i];
            }
        }

        public OpenLink(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenLink)) {
                return false;
            }
            OpenLink openLink = (OpenLink) obj;
            return epx.f(this.b, openLink.b) && epx.f(this.c, openLink.c) && epx.f(this.d, openLink.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenLink(url=");
            sb.append(this.b);
            sb.append(", ref=");
            sb.append(this.c);
            sb.append(", trackCode=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        public /* synthetic */ OpenLink(String str, String str2, String str3, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class OpenShowAllFragmentLegacySection implements CatalogLinkButtonActionDo {
        public static final Parcelable.Creator<OpenShowAllFragmentLegacySection> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final CatalogLinkActionStyle f;

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<OpenShowAllFragmentLegacySection> {
            @Override // android.os.Parcelable.Creator
            public final OpenShowAllFragmentLegacySection createFromParcel(Parcel parcel) {
                return new OpenShowAllFragmentLegacySection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (CatalogLinkActionStyle) parcel.readParcelable(OpenShowAllFragmentLegacySection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenShowAllFragmentLegacySection[] newArray(int i) {
                return new OpenShowAllFragmentLegacySection[i];
            }
        }

        public OpenShowAllFragmentLegacySection(String str, String str2, String str3, String str4, CatalogLinkActionStyle catalogLinkActionStyle) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = catalogLinkActionStyle;
        }

        public final CatalogLinkActionStyle d() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenShowAllFragmentLegacySection)) {
                return false;
            }
            OpenShowAllFragmentLegacySection openShowAllFragmentLegacySection = (OpenShowAllFragmentLegacySection) obj;
            return epx.f(this.b, openShowAllFragmentLegacySection.b) && epx.f(this.c, openShowAllFragmentLegacySection.c) && epx.f(this.d, openShowAllFragmentLegacySection.d) && epx.f(this.e, openShowAllFragmentLegacySection.e) && epx.f(this.f, openShowAllFragmentLegacySection.f);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            CatalogLinkActionStyle catalogLinkActionStyle = this.f;
            return hashCode2 + (catalogLinkActionStyle != null ? catalogLinkActionStyle.hashCode() : 0);
        }

        public final String toString() {
            return "OpenShowAllFragmentLegacySection(sectionId=" + this.b + ", title=" + this.c + ", refLayoutName=" + this.d + ", trackCode=" + this.e + ", style=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
        }

        public /* synthetic */ OpenShowAllFragmentLegacySection(String str, String str2, String str3, String str4, CatalogLinkActionStyle catalogLinkActionStyle, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : catalogLinkActionStyle);
        }
    }
}
