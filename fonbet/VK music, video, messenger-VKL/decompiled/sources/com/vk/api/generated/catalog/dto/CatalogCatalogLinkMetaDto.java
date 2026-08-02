package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogCatalogLinkMetaDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogLinkMetaDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogLinkMetaDto> CREATOR = new a();

    @pmi0("additional_entities")
    private final List<CatalogCatalogLinkAdditionalEntityDto> additionalEntities;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final CatalogLinkMetaContentDto content;

    @pmi0("content_type")
    private final ContentTypeDto contentType;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("is_explicit")
    private final Boolean isExplicit;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trust_mark")
    private final TrustMarkDto trustMark;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkMetaDto.kt */
    public static final class ContentTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentTypeDto[] $VALUES;

        @pmi0("artist")
        public static final ContentTypeDto ARTIST;

        @pmi0("audio_albums")
        public static final ContentTypeDto AUDIO_ALBUMS;

        @pmi0("audio_albums_presave")
        public static final ContentTypeDto AUDIO_ALBUMS_PRESAVE;

        @pmi0("audio_audiobooks")
        public static final ContentTypeDto AUDIO_AUDIOBOOKS;

        @pmi0("audio_available_offer")
        public static final ContentTypeDto AUDIO_AVAILABLE_OFFER;

        @pmi0("audio_book")
        public static final ContentTypeDto AUDIO_BOOK;

        @pmi0("audio_download_history")
        public static final ContentTypeDto AUDIO_DOWNLOAD_HISTORY;

        @pmi0("audio_followings")
        public static final ContentTypeDto AUDIO_FOLLOWINGS;

        @pmi0("audio_kids")
        public static final ContentTypeDto AUDIO_KIDS;

        @pmi0("audio_kids_albums")
        public static final ContentTypeDto AUDIO_KIDS_ALBUMS;

        @pmi0("audio_kids_artists")
        public static final ContentTypeDto AUDIO_KIDS_ARTISTS;

        @pmi0("audio_kids_audio_books")
        public static final ContentTypeDto AUDIO_KIDS_AUDIO_BOOKS;

        @pmi0("audio_kids_collection_audiobook")
        public static final ContentTypeDto AUDIO_KIDS_COLLECTION_AUDIOBOOK;

        @pmi0("audio_kids_collection_music")
        public static final ContentTypeDto AUDIO_KIDS_COLLECTION_MUSIC;

        @pmi0("audio_kids_playlists")
        public static final ContentTypeDto AUDIO_KIDS_PLAYLISTS;

        @pmi0("audio_kids_podcasts")
        public static final ContentTypeDto AUDIO_KIDS_PODCASTS;

        @pmi0("audio_kids_recent")
        public static final ContentTypeDto AUDIO_KIDS_RECENT;

        @pmi0("audio_link_icons")
        public static final ContentTypeDto AUDIO_LINK_ICONS;

        @pmi0("audio_offline")
        public static final ContentTypeDto AUDIO_OFFLINE;

        @pmi0("audio_playlists")
        public static final ContentTypeDto AUDIO_PLAYLISTS;

        @pmi0("audio_podcasts")
        public static final ContentTypeDto AUDIO_PODCASTS;

        @pmi0("audio_radio")
        public static final ContentTypeDto AUDIO_RADIO;

        @pmi0("audio_recent")
        public static final ContentTypeDto AUDIO_RECENT;
        public static final Parcelable.Creator<ContentTypeDto> CREATOR;

        @pmi0("curator")
        public static final ContentTypeDto CURATOR;

        @pmi0("group")
        public static final ContentTypeDto GROUP;

        @pmi0("mini_app")
        public static final ContentTypeDto MINI_APP;

        @pmi0("podcast")
        public static final ContentTypeDto PODCAST;

        @pmi0("search_ads")
        public static final ContentTypeDto SEARCH_ADS;

        @pmi0("url")
        public static final ContentTypeDto URL;

        @pmi0("user")
        public static final ContentTypeDto USER;
        private final String value;

        /* compiled from: CatalogCatalogLinkMetaDto.kt */
        public static final class a implements Parcelable.Creator<ContentTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto createFromParcel(Parcel parcel) {
                return ContentTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContentTypeDto[] newArray(int i) {
                return new ContentTypeDto[i];
            }
        }

        static {
            ContentTypeDto contentTypeDto = new ContentTypeDto("USER", 0, "user");
            USER = contentTypeDto;
            ContentTypeDto contentTypeDto2 = new ContentTypeDto("GROUP", 1, "group");
            GROUP = contentTypeDto2;
            ContentTypeDto contentTypeDto3 = new ContentTypeDto("MINI_APP", 2, "mini_app");
            MINI_APP = contentTypeDto3;
            ContentTypeDto contentTypeDto4 = new ContentTypeDto("URL", 3, "url");
            URL = contentTypeDto4;
            ContentTypeDto contentTypeDto5 = new ContentTypeDto("ARTIST", 4, "artist");
            ARTIST = contentTypeDto5;
            ContentTypeDto contentTypeDto6 = new ContentTypeDto("AUDIO_BOOK", 5, "audio_book");
            AUDIO_BOOK = contentTypeDto6;
            ContentTypeDto contentTypeDto7 = new ContentTypeDto("SEARCH_ADS", 6, "search_ads");
            SEARCH_ADS = contentTypeDto7;
            ContentTypeDto contentTypeDto8 = new ContentTypeDto("AUDIO_RECENT", 7, "audio_recent");
            AUDIO_RECENT = contentTypeDto8;
            ContentTypeDto contentTypeDto9 = new ContentTypeDto("AUDIO_PLAYLISTS", 8, "audio_playlists");
            AUDIO_PLAYLISTS = contentTypeDto9;
            ContentTypeDto contentTypeDto10 = new ContentTypeDto("AUDIO_PODCASTS", 9, "audio_podcasts");
            AUDIO_PODCASTS = contentTypeDto10;
            ContentTypeDto contentTypeDto11 = new ContentTypeDto("AUDIO_AUDIOBOOKS", 10, "audio_audiobooks");
            AUDIO_AUDIOBOOKS = contentTypeDto11;
            ContentTypeDto contentTypeDto12 = new ContentTypeDto("AUDIO_ALBUMS", 11, "audio_albums");
            AUDIO_ALBUMS = contentTypeDto12;
            ContentTypeDto contentTypeDto13 = new ContentTypeDto("AUDIO_FOLLOWINGS", 12, "audio_followings");
            AUDIO_FOLLOWINGS = contentTypeDto13;
            ContentTypeDto contentTypeDto14 = new ContentTypeDto("AUDIO_RADIO", 13, "audio_radio");
            AUDIO_RADIO = contentTypeDto14;
            ContentTypeDto contentTypeDto15 = new ContentTypeDto("AUDIO_OFFLINE", 14, "audio_offline");
            AUDIO_OFFLINE = contentTypeDto15;
            ContentTypeDto contentTypeDto16 = new ContentTypeDto("AUDIO_AVAILABLE_OFFER", 15, "audio_available_offer");
            AUDIO_AVAILABLE_OFFER = contentTypeDto16;
            ContentTypeDto contentTypeDto17 = new ContentTypeDto("AUDIO_KIDS_RECENT", 16, "audio_kids_recent");
            AUDIO_KIDS_RECENT = contentTypeDto17;
            ContentTypeDto contentTypeDto18 = new ContentTypeDto("AUDIO_ALBUMS_PRESAVE", 17, "audio_albums_presave");
            AUDIO_ALBUMS_PRESAVE = contentTypeDto18;
            ContentTypeDto contentTypeDto19 = new ContentTypeDto("AUDIO_KIDS", 18, "audio_kids");
            AUDIO_KIDS = contentTypeDto19;
            ContentTypeDto contentTypeDto20 = new ContentTypeDto("AUDIO_KIDS_COLLECTION_MUSIC", 19, "audio_kids_collection_music");
            AUDIO_KIDS_COLLECTION_MUSIC = contentTypeDto20;
            ContentTypeDto contentTypeDto21 = new ContentTypeDto("AUDIO_KIDS_COLLECTION_AUDIOBOOK", 20, "audio_kids_collection_audiobook");
            AUDIO_KIDS_COLLECTION_AUDIOBOOK = contentTypeDto21;
            ContentTypeDto contentTypeDto22 = new ContentTypeDto("AUDIO_LINK_ICONS", 21, "audio_link_icons");
            AUDIO_LINK_ICONS = contentTypeDto22;
            ContentTypeDto contentTypeDto23 = new ContentTypeDto("AUDIO_KIDS_PLAYLISTS", 22, "audio_kids_playlists");
            AUDIO_KIDS_PLAYLISTS = contentTypeDto23;
            ContentTypeDto contentTypeDto24 = new ContentTypeDto("AUDIO_KIDS_ALBUMS", 23, "audio_kids_albums");
            AUDIO_KIDS_ALBUMS = contentTypeDto24;
            ContentTypeDto contentTypeDto25 = new ContentTypeDto("AUDIO_KIDS_PODCASTS", 24, "audio_kids_podcasts");
            AUDIO_KIDS_PODCASTS = contentTypeDto25;
            ContentTypeDto contentTypeDto26 = new ContentTypeDto("AUDIO_KIDS_AUDIO_BOOKS", 25, "audio_kids_audio_books");
            AUDIO_KIDS_AUDIO_BOOKS = contentTypeDto26;
            ContentTypeDto contentTypeDto27 = new ContentTypeDto("AUDIO_KIDS_ARTISTS", 26, "audio_kids_artists");
            AUDIO_KIDS_ARTISTS = contentTypeDto27;
            ContentTypeDto contentTypeDto28 = new ContentTypeDto("AUDIO_DOWNLOAD_HISTORY", 27, "audio_download_history");
            AUDIO_DOWNLOAD_HISTORY = contentTypeDto28;
            ContentTypeDto contentTypeDto29 = new ContentTypeDto("CURATOR", 28, "curator");
            CURATOR = contentTypeDto29;
            ContentTypeDto contentTypeDto30 = new ContentTypeDto("PODCAST", 29, "podcast");
            PODCAST = contentTypeDto30;
            ContentTypeDto[] contentTypeDtoArr = {contentTypeDto, contentTypeDto2, contentTypeDto3, contentTypeDto4, contentTypeDto5, contentTypeDto6, contentTypeDto7, contentTypeDto8, contentTypeDto9, contentTypeDto10, contentTypeDto11, contentTypeDto12, contentTypeDto13, contentTypeDto14, contentTypeDto15, contentTypeDto16, contentTypeDto17, contentTypeDto18, contentTypeDto19, contentTypeDto20, contentTypeDto21, contentTypeDto22, contentTypeDto23, contentTypeDto24, contentTypeDto25, contentTypeDto26, contentTypeDto27, contentTypeDto28, contentTypeDto29, contentTypeDto30};
            $VALUES = contentTypeDtoArr;
            $ENTRIES = new asp(contentTypeDtoArr);
            CREATOR = new a();
        }

        private ContentTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ContentTypeDto valueOf(String str) {
            return (ContentTypeDto) Enum.valueOf(ContentTypeDto.class, str);
        }

        public static ContentTypeDto[] values() {
            return (ContentTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkMetaDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("trending")
        public static final IconDto TRENDING;

        @pmi0("trending_verified")
        public static final IconDto TRENDING_VERIFIED;

        @pmi0("verified")
        public static final IconDto VERIFIED;

        @pmi0("video_live")
        public static final IconDto VIDEO_LIVE;
        private final String value;

        /* compiled from: CatalogCatalogLinkMetaDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("TRENDING_VERIFIED", 0, "trending_verified");
            TRENDING_VERIFIED = iconDto;
            IconDto iconDto2 = new IconDto("TRENDING", 1, "trending");
            TRENDING = iconDto2;
            IconDto iconDto3 = new IconDto("VERIFIED", 2, "verified");
            VERIFIED = iconDto3;
            IconDto iconDto4 = new IconDto("VIDEO_LIVE", 3, "video_live");
            VIDEO_LIVE = iconDto4;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3, iconDto4};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkMetaDto.kt */
    public static final class TrustMarkDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrustMarkDto[] $VALUES;

        @pmi0("3")
        public static final TrustMarkDto CONFIRMED;
        public static final Parcelable.Creator<TrustMarkDto> CREATOR;

        @pmi0("2")
        public static final TrustMarkDto PREMIUM;

        @pmi0("1")
        public static final TrustMarkDto VERIFIED;
        private final int value;

        /* compiled from: CatalogCatalogLinkMetaDto.kt */
        public static final class a implements Parcelable.Creator<TrustMarkDto> {
            @Override // android.os.Parcelable.Creator
            public final TrustMarkDto createFromParcel(Parcel parcel) {
                return TrustMarkDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrustMarkDto[] newArray(int i) {
                return new TrustMarkDto[i];
            }
        }

        static {
            TrustMarkDto trustMarkDto = new TrustMarkDto("VERIFIED", 0, 1);
            VERIFIED = trustMarkDto;
            TrustMarkDto trustMarkDto2 = new TrustMarkDto("PREMIUM", 1, 2);
            PREMIUM = trustMarkDto2;
            TrustMarkDto trustMarkDto3 = new TrustMarkDto("CONFIRMED", 2, 3);
            CONFIRMED = trustMarkDto3;
            TrustMarkDto[] trustMarkDtoArr = {trustMarkDto, trustMarkDto2, trustMarkDto3};
            $VALUES = trustMarkDtoArr;
            $ENTRIES = new asp(trustMarkDtoArr);
            CREATOR = new a();
        }

        private TrustMarkDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TrustMarkDto valueOf(String str) {
            return (TrustMarkDto) Enum.valueOf(TrustMarkDto.class, str);
        }

        public static TrustMarkDto[] values() {
            return (TrustMarkDto[]) $VALUES.clone();
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

    /* compiled from: CatalogCatalogLinkMetaDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogLinkMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkMetaDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ContentTypeDto createFromParcel = parcel.readInt() == 0 ? null : ContentTypeDto.CREATOR.createFromParcel(parcel);
            IconDto createFromParcel2 = parcel.readInt() == 0 ? null : IconDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            TrustMarkDto createFromParcel3 = parcel.readInt() == 0 ? null : TrustMarkDto.CREATOR.createFromParcel(parcel);
            CatalogLinkMetaContentDto createFromParcel4 = parcel.readInt() == 0 ? null : CatalogLinkMetaContentDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(CatalogCatalogLinkAdditionalEntityDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new CatalogCatalogLinkMetaDto(createFromParcel, createFromParcel2, readString, valueOf, createFromParcel3, createFromParcel4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkMetaDto[] newArray(int i) {
            return new CatalogCatalogLinkMetaDto[i];
        }
    }

    public CatalogCatalogLinkMetaDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final ContentTypeDto d() {
        return this.contentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isExplicit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogLinkMetaDto)) {
            return false;
        }
        CatalogCatalogLinkMetaDto catalogCatalogLinkMetaDto = (CatalogCatalogLinkMetaDto) obj;
        return this.contentType == catalogCatalogLinkMetaDto.contentType && this.icon == catalogCatalogLinkMetaDto.icon && epx.f(this.trackCode, catalogCatalogLinkMetaDto.trackCode) && epx.f(this.isExplicit, catalogCatalogLinkMetaDto.isExplicit) && this.trustMark == catalogCatalogLinkMetaDto.trustMark && epx.f(this.content, catalogCatalogLinkMetaDto.content) && epx.f(this.additionalEntities, catalogCatalogLinkMetaDto.additionalEntities);
    }

    public final int hashCode() {
        ContentTypeDto contentTypeDto = this.contentType;
        int hashCode = (contentTypeDto == null ? 0 : contentTypeDto.hashCode()) * 31;
        IconDto iconDto = this.icon;
        int hashCode2 = (hashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isExplicit;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        TrustMarkDto trustMarkDto = this.trustMark;
        int hashCode5 = (hashCode4 + (trustMarkDto == null ? 0 : trustMarkDto.hashCode())) * 31;
        CatalogLinkMetaContentDto catalogLinkMetaContentDto = this.content;
        int hashCode6 = (hashCode5 + (catalogLinkMetaContentDto == null ? 0 : catalogLinkMetaContentDto.hashCode())) * 31;
        List<CatalogCatalogLinkAdditionalEntityDto> list = this.additionalEntities;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalogLinkMetaDto(contentType=");
        sb.append(this.contentType);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", trustMark=");
        sb.append(this.trustMark);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", additionalEntities=");
        return ms9.a(')', sb, this.additionalEntities);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ContentTypeDto contentTypeDto = this.contentType;
        if (contentTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentTypeDto.writeToParcel(parcel, i);
        }
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        Boolean bool = this.isExplicit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        TrustMarkDto trustMarkDto = this.trustMark;
        if (trustMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trustMarkDto.writeToParcel(parcel, i);
        }
        CatalogLinkMetaContentDto catalogLinkMetaContentDto = this.content;
        if (catalogLinkMetaContentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogLinkMetaContentDto.writeToParcel(parcel, i);
        }
        List<CatalogCatalogLinkAdditionalEntityDto> list = this.additionalEntities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogCatalogLinkAdditionalEntityDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public CatalogCatalogLinkMetaDto(ContentTypeDto contentTypeDto, IconDto iconDto, String str, Boolean bool, TrustMarkDto trustMarkDto, CatalogLinkMetaContentDto catalogLinkMetaContentDto, List<CatalogCatalogLinkAdditionalEntityDto> list) {
        this.contentType = contentTypeDto;
        this.icon = iconDto;
        this.trackCode = str;
        this.isExplicit = bool;
        this.trustMark = trustMarkDto;
        this.content = catalogLinkMetaContentDto;
        this.additionalEntities = list;
    }

    public /* synthetic */ CatalogCatalogLinkMetaDto(ContentTypeDto contentTypeDto, IconDto iconDto, String str, Boolean bool, TrustMarkDto trustMarkDto, CatalogLinkMetaContentDto catalogLinkMetaContentDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : contentTypeDto, (i & 2) != 0 ? null : iconDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : trustMarkDto, (i & 32) != 0 ? null : catalogLinkMetaContentDto, (i & 64) != 0 ? null : list);
    }
}
