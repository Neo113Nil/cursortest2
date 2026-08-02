package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioPlaylistDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("actions")
    private final List<AudioPlaylistActionDto> actions;

    @pmi0("album")
    private final AudioPlaylistAlbumItemDto album;

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

    @pmi0("audio_chart_info")
    private final AudioChartInfoDto audioChartInfo;

    @pmi0("audios")
    private final List<AudioAudioDto> audios;

    @pmi0("audios_total_file_size")
    private final Float audiosTotalFileSize;

    @pmi0("count")
    private final int count;

    @pmi0("create_time")
    private final int createTime;

    @pmi0("description")
    private final String description;

    @pmi0("exclusive")
    private final Boolean exclusive;

    @pmi0("featured_artists")
    private final List<AudioArtistDto> featuredArtists;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("followed")
    private final AudioPlaylistOriginalFollowedDto followed;

    @pmi0("followers")
    private final int followers;

    @pmi0("genres")
    private final List<AudioGenreDto> genres;

    @pmi0("id")
    private final int id;

    @pmi0("is_curator")
    private final Boolean isCurator;

    @pmi0("is_explicit")
    private final Boolean isExplicit;

    @pmi0("is_following")
    private final Boolean isFollowing;

    @pmi0("main_artist")
    private final String mainArtist;

    @pmi0("main_artists")
    private final List<AudioArtistDto> mainArtists;

    @pmi0("main_color")
    private final String mainColor;

    @pmi0("match_score")
    private final Float matchScore;

    @pmi0(MetaBox.TYPE)
    private final AudioPlaylistMetaDto meta;

    @pmi0("no_discover")
    private final Boolean noDiscover;

    @pmi0("original")
    private final AudioPlaylistOriginalFollowedDto original;

    @pmi0("original_year")
    private final Integer originalYear;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final AudioPlaylistPermissionsDto permissions;

    @pmi0("photo")
    private final AudioPhotoDto photo;

    @pmi0("play_button")
    private final Boolean playButton;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("plays")
    private final int plays;

    @pmi0("restriction")
    private final MediaPopupDto restriction;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("subtitle_badge")
    private final Boolean subtitleBadge;

    @pmi0("thumbs")
    private final List<AudioPhotoDto> thumbs;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final AudioPlaylistTypeDto type;

    @pmi0("uma_album_id")
    private final Integer umaAlbumId;

    @pmi0("update_time")
    private final int updateTime;

    @pmi0("year")
    private final Integer year;

    /* compiled from: AudioPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool;
            AudioPlaylistTypeDto audioPlaylistTypeDto;
            ArrayList arrayList2;
            Boolean valueOf3;
            Boolean bool2;
            AudioPlaylistOriginalFollowedDto createFromParcel;
            AudioPhotoDto audioPhotoDto;
            AudioPlaylistPermissionsDto createFromParcel2;
            Boolean valueOf4;
            Boolean valueOf5;
            AudioPlaylistPermissionsDto audioPlaylistPermissionsDto;
            Integer num;
            ArrayList arrayList3;
            AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto;
            Boolean valueOf6;
            AudioPhotoDto audioPhotoDto2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Integer num2;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            AudioPlaylistTypeDto audioPlaylistTypeDto2;
            ArrayList arrayList10;
            MediaPopupDto createFromParcel3;
            int i2;
            AudioChartInfoDto audioChartInfoDto;
            ArrayList arrayList11;
            AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto;
            Boolean valueOf7;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(AudioPlaylistDto.class.getClassLoader());
            AudioPlaylistTypeDto createFromParcel4 = AudioPlaylistTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList = new ArrayList(readInt7);
                i = readInt;
                int i3 = 0;
                while (i3 != readInt7) {
                    i3 = bo.b(AudioPlaylistDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool = valueOf;
                audioPlaylistTypeDto = createFromParcel4;
                arrayList2 = null;
            } else {
                int readInt8 = parcel.readInt();
                bool = valueOf;
                ArrayList arrayList12 = new ArrayList(readInt8);
                audioPlaylistTypeDto = createFromParcel4;
                int i4 = 0;
                while (i4 != readInt8) {
                    i4 = bo.b(AudioPlaylistDto.class, parcel, arrayList12, i4, 1);
                    readString = readString;
                }
                arrayList2 = arrayList12;
            }
            String str = readString;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AudioPlaylistOriginalFollowedDto createFromParcel5 = parcel.readInt() == 0 ? null : AudioPlaylistOriginalFollowedDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool2 = valueOf3;
                createFromParcel = null;
            } else {
                bool2 = valueOf3;
                createFromParcel = AudioPlaylistOriginalFollowedDto.CREATOR.createFromParcel(parcel);
            }
            AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2 = createFromParcel;
            AudioPhotoDto audioPhotoDto3 = (AudioPhotoDto) parcel.readParcelable(AudioPlaylistDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioPhotoDto = audioPhotoDto3;
                createFromParcel2 = null;
            } else {
                audioPhotoDto = audioPhotoDto3;
                createFromParcel2 = AudioPlaylistPermissionsDto.CREATOR.createFromParcel(parcel);
            }
            AudioPlaylistPermissionsDto audioPlaylistPermissionsDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                audioPlaylistPermissionsDto = audioPlaylistPermissionsDto2;
                num = valueOf9;
                audioPlaylistOriginalFollowedDto = createFromParcel5;
                arrayList3 = null;
            } else {
                audioPlaylistPermissionsDto = audioPlaylistPermissionsDto2;
                int readInt9 = parcel.readInt();
                num = valueOf9;
                arrayList3 = new ArrayList(readInt9);
                audioPlaylistOriginalFollowedDto = createFromParcel5;
                int i5 = 0;
                while (i5 != readInt9) {
                    i5 = bo.b(AudioPlaylistDto.class, parcel, arrayList3, i5, 1);
                    readInt9 = readInt9;
                }
            }
            AudioPhotoDto audioPhotoDto4 = audioPhotoDto;
            String readString3 = parcel.readString();
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = false;
            Boolean bool3 = bool2;
            Boolean bool4 = valueOf5;
            String readString4 = parcel.readString();
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                audioPhotoDto2 = audioPhotoDto4;
                arrayList4 = arrayList3;
                num2 = valueOf10;
                arrayList5 = null;
            } else {
                audioPhotoDto2 = audioPhotoDto4;
                int readInt10 = parcel.readInt();
                arrayList4 = arrayList3;
                arrayList5 = new ArrayList(readInt10);
                num2 = valueOf10;
                int i6 = 0;
                while (i6 != readInt10) {
                    i6 = bo.b(AudioPlaylistDto.class, parcel, arrayList5, i6, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList5;
                arrayList6 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList6 = new ArrayList(readInt11);
                arrayList7 = arrayList5;
                int i7 = 0;
                while (i7 != readInt11) {
                    i7 = bo.b(AudioPlaylistDto.class, parcel, arrayList6, i7, 1);
                    readInt11 = readInt11;
                }
            }
            AudioPlaylistTypeDto audioPlaylistTypeDto3 = audioPlaylistTypeDto;
            AudioPlaylistPermissionsDto audioPlaylistPermissionsDto3 = audioPlaylistPermissionsDto;
            Integer num3 = valueOf11;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList6;
                audioPlaylistTypeDto2 = audioPlaylistTypeDto3;
                arrayList9 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList8 = arrayList6;
                arrayList9 = new ArrayList(readInt12);
                audioPlaylistTypeDto2 = audioPlaylistTypeDto3;
                int i8 = 0;
                while (i8 != readInt12) {
                    i8 = bo.b(AudioPlaylistDto.class, parcel, arrayList9, i8, 1);
                    readInt12 = readInt12;
                }
            }
            AudioPlaylistAlbumItemDto createFromParcel6 = parcel.readInt() == 0 ? null : AudioPlaylistAlbumItemDto.CREATOR.createFromParcel(parcel);
            AudioPlaylistMetaDto createFromParcel7 = parcel.readInt() == 0 ? null : AudioPlaylistMetaDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList10 = arrayList9;
                createFromParcel3 = null;
            } else {
                arrayList10 = arrayList9;
                createFromParcel3 = MediaPopupDto.CREATOR.createFromParcel(parcel);
            }
            MediaPopupDto mediaPopupDto = createFromParcel3;
            ArrayList arrayList13 = arrayList4;
            String str2 = str;
            Boolean bool5 = valueOf4;
            Integer num4 = num2;
            int i9 = i;
            AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto3 = audioPlaylistOriginalFollowedDto;
            ArrayList arrayList14 = arrayList7;
            String readString6 = parcel.readString();
            AudioChartInfoDto audioChartInfoDto2 = (AudioChartInfoDto) parcel.readParcelable(AudioPlaylistDto.class.getClassLoader());
            Float valueOf12 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                i2 = i9;
                audioChartInfoDto = audioChartInfoDto2;
                audioPlaylistAlbumItemDto = createFromParcel6;
                arrayList11 = null;
            } else {
                i2 = i9;
                int readInt13 = parcel.readInt();
                audioChartInfoDto = audioChartInfoDto2;
                arrayList11 = new ArrayList(readInt13);
                audioPlaylistAlbumItemDto = createFromParcel6;
                int i10 = 0;
                while (i10 != readInt13) {
                    i10 = en.a(AudioPlaylistActionDto.CREATOR, parcel, arrayList11, i10, 1);
                    readInt13 = readInt13;
                    str2 = str2;
                }
            }
            String str3 = str2;
            Float valueOf13 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf7 = Boolean.valueOf(z);
            }
            return new AudioPlaylistDto(i2, userId, audioPlaylistTypeDto2, str3, readString2, readInt2, readInt3, readInt4, readInt5, readInt6, valueOf8, arrayList, bool, valueOf2, arrayList2, bool3, num, audioPlaylistOriginalFollowedDto3, audioPlaylistOriginalFollowedDto2, audioPhotoDto2, audioPlaylistPermissionsDto3, bool5, bool4, arrayList13, readString3, num4, readString4, num3, valueOf6, arrayList14, arrayList8, readString5, arrayList10, audioPlaylistAlbumItemDto, createFromParcel7, mediaPopupDto, readString6, audioChartInfoDto, valueOf12, arrayList11, valueOf13, valueOf7, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistDto[] newArray(int i) {
            return new AudioPlaylistDto[i];
        }
    }

    public AudioPlaylistDto(int i, UserId userId, AudioPlaylistTypeDto audioPlaylistTypeDto, String str, String str2, int i2, int i3, int i4, int i5, int i6, Integer num, List<AudioGenreDto> list, Boolean bool, Boolean bool2, List<AudioAudioDto> list2, Boolean bool3, Integer num2, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2, AudioPhotoDto audioPhotoDto, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, Boolean bool4, Boolean bool5, List<AudioPhotoDto> list3, String str3, Integer num3, String str4, Integer num4, Boolean bool6, List<AudioArtistDto> list4, List<AudioArtistDto> list5, String str5, List<AudioArtistDto> list6, AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto, AudioPlaylistMetaDto audioPlaylistMetaDto, MediaPopupDto mediaPopupDto, String str6, AudioChartInfoDto audioChartInfoDto, Float f, List<AudioPlaylistActionDto> list7, Float f2, Boolean bool7, String str7, Integer num5) {
        this.id = i;
        this.ownerId = userId;
        this.type = audioPlaylistTypeDto;
        this.title = str;
        this.description = str2;
        this.count = i2;
        this.followers = i3;
        this.plays = i4;
        this.createTime = i5;
        this.updateTime = i6;
        this.playlistId = num;
        this.genres = list;
        this.isFollowing = bool;
        this.noDiscover = bool2;
        this.audios = list2;
        this.isCurator = bool3;
        this.year = num2;
        this.original = audioPlaylistOriginalFollowedDto;
        this.followed = audioPlaylistOriginalFollowedDto2;
        this.photo = audioPhotoDto;
        this.permissions = audioPlaylistPermissionsDto;
        this.subtitleBadge = bool4;
        this.playButton = bool5;
        this.thumbs = list3;
        this.accessKey = str3;
        this.umaAlbumId = num3;
        this.subtitle = str4;
        this.originalYear = num4;
        this.isExplicit = bool6;
        this.artists = list4;
        this.mainArtists = list5;
        this.mainArtist = str5;
        this.featuredArtists = list6;
        this.album = audioPlaylistAlbumItemDto;
        this.meta = audioPlaylistMetaDto;
        this.restriction = mediaPopupDto;
        this.trackCode = str6;
        this.audioChartInfo = audioChartInfoDto;
        this.matchScore = f;
        this.actions = list7;
        this.audiosTotalFileSize = f2;
        this.exclusive = bool7;
        this.mainColor = str7;
        this.flagsContext = num5;
    }

    public final Float B() {
        return this.matchScore;
    }

    public final AudioPlaylistMetaDto C() {
        return this.meta;
    }

    public final Boolean D() {
        return this.noDiscover;
    }

    public final Boolean D0() {
        return this.isExplicit;
    }

    public final AudioPlaylistOriginalFollowedDto F() {
        return this.original;
    }

    public final Boolean F0() {
        return this.isFollowing;
    }

    public final AudioPlaylistPermissionsDto G() {
        return this.permissions;
    }

    public final AudioPhotoDto K() {
        return this.photo;
    }

    public final Boolean M() {
        return this.playButton;
    }

    public final int R() {
        return this.plays;
    }

    public final MediaPopupDto T() {
        return this.restriction;
    }

    public final String W() {
        return this.subtitle;
    }

    public final Boolean Z() {
        return this.subtitleBadge;
    }

    public final List<AudioPhotoDto> a0() {
        return this.thumbs;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioPlaylistActionDto> e() {
        return this.actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistDto)) {
            return false;
        }
        AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) obj;
        return this.id == audioPlaylistDto.id && epx.f(this.ownerId, audioPlaylistDto.ownerId) && this.type == audioPlaylistDto.type && epx.f(this.title, audioPlaylistDto.title) && epx.f(this.description, audioPlaylistDto.description) && this.count == audioPlaylistDto.count && this.followers == audioPlaylistDto.followers && this.plays == audioPlaylistDto.plays && this.createTime == audioPlaylistDto.createTime && this.updateTime == audioPlaylistDto.updateTime && epx.f(this.playlistId, audioPlaylistDto.playlistId) && epx.f(this.genres, audioPlaylistDto.genres) && epx.f(this.isFollowing, audioPlaylistDto.isFollowing) && epx.f(this.noDiscover, audioPlaylistDto.noDiscover) && epx.f(this.audios, audioPlaylistDto.audios) && epx.f(this.isCurator, audioPlaylistDto.isCurator) && epx.f(this.year, audioPlaylistDto.year) && epx.f(this.original, audioPlaylistDto.original) && epx.f(this.followed, audioPlaylistDto.followed) && epx.f(this.photo, audioPlaylistDto.photo) && epx.f(this.permissions, audioPlaylistDto.permissions) && epx.f(this.subtitleBadge, audioPlaylistDto.subtitleBadge) && epx.f(this.playButton, audioPlaylistDto.playButton) && epx.f(this.thumbs, audioPlaylistDto.thumbs) && epx.f(this.accessKey, audioPlaylistDto.accessKey) && epx.f(this.umaAlbumId, audioPlaylistDto.umaAlbumId) && epx.f(this.subtitle, audioPlaylistDto.subtitle) && epx.f(this.originalYear, audioPlaylistDto.originalYear) && epx.f(this.isExplicit, audioPlaylistDto.isExplicit) && epx.f(this.artists, audioPlaylistDto.artists) && epx.f(this.mainArtists, audioPlaylistDto.mainArtists) && epx.f(this.mainArtist, audioPlaylistDto.mainArtist) && epx.f(this.featuredArtists, audioPlaylistDto.featuredArtists) && epx.f(this.album, audioPlaylistDto.album) && epx.f(this.meta, audioPlaylistDto.meta) && epx.f(this.restriction, audioPlaylistDto.restriction) && epx.f(this.trackCode, audioPlaylistDto.trackCode) && epx.f(this.audioChartInfo, audioPlaylistDto.audioChartInfo) && epx.f(this.matchScore, audioPlaylistDto.matchScore) && epx.f(this.actions, audioPlaylistDto.actions) && epx.f(this.audiosTotalFileSize, audioPlaylistDto.audiosTotalFileSize) && epx.f(this.exclusive, audioPlaylistDto.exclusive) && epx.f(this.mainColor, audioPlaylistDto.mainColor) && epx.f(this.flagsContext, audioPlaylistDto.flagsContext);
    }

    public final AudioPlaylistAlbumItemDto f() {
        return this.album;
    }

    public final List<AudioArtistDto> g() {
        return this.artists;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.updateTime, shy.a(this.createTime, shy.a(this.plays, shy.a(this.followers, shy.a(this.count, urd0.a(urd0.a((this.type.hashCode() + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b)) * 31, 31, this.title), 31, this.description), 31), 31), 31), 31), 31);
        Integer num = this.playlistId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<AudioGenreDto> list = this.genres;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFollowing;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.noDiscover;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<AudioAudioDto> list2 = this.audios;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.isCurator;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.year;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = this.original;
        int hashCode8 = (hashCode7 + (audioPlaylistOriginalFollowedDto == null ? 0 : audioPlaylistOriginalFollowedDto.hashCode())) * 31;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2 = this.followed;
        int hashCode9 = (hashCode8 + (audioPlaylistOriginalFollowedDto2 == null ? 0 : audioPlaylistOriginalFollowedDto2.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = this.permissions;
        int hashCode11 = (hashCode10 + (audioPlaylistPermissionsDto == null ? 0 : audioPlaylistPermissionsDto.hashCode())) * 31;
        Boolean bool4 = this.subtitleBadge;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.playButton;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<AudioPhotoDto> list3 = this.thumbs;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.accessKey;
        int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.umaAlbumId;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.originalYear;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.isExplicit;
        int hashCode19 = (hashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<AudioArtistDto> list4 = this.artists;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AudioArtistDto> list5 = this.mainArtists;
        int hashCode21 = (hashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.mainArtist;
        int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AudioArtistDto> list6 = this.featuredArtists;
        int hashCode23 = (hashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto = this.album;
        int hashCode24 = (hashCode23 + (audioPlaylistAlbumItemDto == null ? 0 : audioPlaylistAlbumItemDto.hashCode())) * 31;
        AudioPlaylistMetaDto audioPlaylistMetaDto = this.meta;
        int hashCode25 = (hashCode24 + (audioPlaylistMetaDto == null ? 0 : audioPlaylistMetaDto.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.restriction;
        int hashCode26 = (hashCode25 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AudioChartInfoDto audioChartInfoDto = this.audioChartInfo;
        int hashCode28 = (hashCode27 + (audioChartInfoDto == null ? 0 : audioChartInfoDto.hashCode())) * 31;
        Float f = this.matchScore;
        int hashCode29 = (hashCode28 + (f == null ? 0 : f.hashCode())) * 31;
        List<AudioPlaylistActionDto> list7 = this.actions;
        int hashCode30 = (hashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Float f2 = this.audiosTotalFileSize;
        int hashCode31 = (hashCode30 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool7 = this.exclusive;
        int hashCode32 = (hashCode31 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str5 = this.mainColor;
        int hashCode33 = (hashCode32 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.flagsContext;
        return hashCode33 + (num5 != null ? num5.hashCode() : 0);
    }

    public final AudioChartInfoDto i() {
        return this.audioChartInfo;
    }

    public final List<AudioAudioDto> j() {
        return this.audios;
    }

    public final Boolean k() {
        return this.exclusive;
    }

    public final List<AudioArtistDto> l() {
        return this.featuredArtists;
    }

    public final AudioPlaylistTypeDto l0() {
        return this.type;
    }

    public final Integer n() {
        return this.flagsContext;
    }

    public final AudioPlaylistOriginalFollowedDto o() {
        return this.followed;
    }

    public final List<AudioGenreDto> p() {
        return this.genres;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", followers=");
        sb.append(this.followers);
        sb.append(", plays=");
        sb.append(this.plays);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", isFollowing=");
        sb.append(this.isFollowing);
        sb.append(", noDiscover=");
        sb.append(this.noDiscover);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", isCurator=");
        sb.append(this.isCurator);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", original=");
        sb.append(this.original);
        sb.append(", followed=");
        sb.append(this.followed);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", subtitleBadge=");
        sb.append(this.subtitleBadge);
        sb.append(", playButton=");
        sb.append(this.playButton);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", umaAlbumId=");
        sb.append(this.umaAlbumId);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", originalYear=");
        sb.append(this.originalYear);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", mainArtists=");
        sb.append(this.mainArtists);
        sb.append(", mainArtist=");
        sb.append(this.mainArtist);
        sb.append(", featuredArtists=");
        sb.append(this.featuredArtists);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", audioChartInfo=");
        sb.append(this.audioChartInfo);
        sb.append(", matchScore=");
        sb.append(this.matchScore);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", audiosTotalFileSize=");
        sb.append(this.audiosTotalFileSize);
        sb.append(", exclusive=");
        sb.append(this.exclusive);
        sb.append(", mainColor=");
        sb.append(this.mainColor);
        sb.append(", flagsContext=");
        return uqi.b(sb, this.flagsContext, ')');
    }

    public final List<AudioArtistDto> u() {
        return this.mainArtists;
    }

    public final int v0() {
        return this.updateTime;
    }

    public final Integer w0() {
        return this.year;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.count);
        parcel.writeInt(this.followers);
        parcel.writeInt(this.plays);
        parcel.writeInt(this.createTime);
        parcel.writeInt(this.updateTime);
        Integer num = this.playlistId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AudioGenreDto> list = this.genres;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.isFollowing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.noDiscover;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<AudioAudioDto> list2 = this.audios;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Boolean bool3 = this.isCurator;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num2 = this.year;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = this.original;
        if (audioPlaylistOriginalFollowedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistOriginalFollowedDto.writeToParcel(parcel, i);
        }
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2 = this.followed;
        if (audioPlaylistOriginalFollowedDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistOriginalFollowedDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.photo, i);
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = this.permissions;
        if (audioPlaylistPermissionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistPermissionsDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.subtitleBadge;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.playButton;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        List<AudioPhotoDto> list3 = this.thumbs;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        parcel.writeString(this.accessKey);
        Integer num3 = this.umaAlbumId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.subtitle);
        Integer num4 = this.originalYear;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool6 = this.isExplicit;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        List<AudioArtistDto> list4 = this.artists;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<AudioArtistDto> list5 = this.mainArtists;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeString(this.mainArtist);
        List<AudioArtistDto> list6 = this.featuredArtists;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto = this.album;
        if (audioPlaylistAlbumItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistAlbumItemDto.writeToParcel(parcel, i);
        }
        AudioPlaylistMetaDto audioPlaylistMetaDto = this.meta;
        if (audioPlaylistMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistMetaDto.writeToParcel(parcel, i);
        }
        MediaPopupDto mediaPopupDto = this.restriction;
        if (mediaPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaPopupDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.audioChartInfo, i);
        Float f7 = this.matchScore;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f7);
        }
        List<AudioPlaylistActionDto> list7 = this.actions;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                ((AudioPlaylistActionDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        Float f9 = this.audiosTotalFileSize;
        if (f9 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f9);
        }
        Boolean bool7 = this.exclusive;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.mainColor);
        Integer num5 = this.flagsContext;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public final Boolean y0() {
        return this.isCurator;
    }

    public /* synthetic */ AudioPlaylistDto(int i, UserId userId, AudioPlaylistTypeDto audioPlaylistTypeDto, String str, String str2, int i2, int i3, int i4, int i5, int i6, Integer num, List list, Boolean bool, Boolean bool2, List list2, Boolean bool3, Integer num2, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2, AudioPhotoDto audioPhotoDto, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, Boolean bool4, Boolean bool5, List list3, String str3, Integer num3, String str4, Integer num4, Boolean bool6, List list4, List list5, String str5, List list6, AudioPlaylistAlbumItemDto audioPlaylistAlbumItemDto, AudioPlaylistMetaDto audioPlaylistMetaDto, MediaPopupDto mediaPopupDto, String str6, AudioChartInfoDto audioChartInfoDto, Float f, List list7, Float f2, Boolean bool7, String str7, Integer num5, int i7, int i8, zcl zclVar) {
        this(i, userId, audioPlaylistTypeDto, str, str2, i2, i3, i4, i5, i6, (i7 & 1024) != 0 ? null : num, (i7 & 2048) != 0 ? null : list, (i7 & 4096) != 0 ? null : bool, (i7 & 8192) != 0 ? null : bool2, (i7 & 16384) != 0 ? null : list2, (32768 & i7) != 0 ? null : bool3, (65536 & i7) != 0 ? null : num2, (131072 & i7) != 0 ? null : audioPlaylistOriginalFollowedDto, (262144 & i7) != 0 ? null : audioPlaylistOriginalFollowedDto2, (524288 & i7) != 0 ? null : audioPhotoDto, (1048576 & i7) != 0 ? null : audioPlaylistPermissionsDto, (2097152 & i7) != 0 ? null : bool4, (4194304 & i7) != 0 ? null : bool5, (8388608 & i7) != 0 ? null : list3, (16777216 & i7) != 0 ? null : str3, (33554432 & i7) != 0 ? null : num3, (67108864 & i7) != 0 ? null : str4, (134217728 & i7) != 0 ? null : num4, (268435456 & i7) != 0 ? null : bool6, (536870912 & i7) != 0 ? null : list4, (1073741824 & i7) != 0 ? null : list5, (i7 & Integer.MIN_VALUE) != 0 ? null : str5, (i8 & 1) != 0 ? null : list6, (i8 & 2) != 0 ? null : audioPlaylistAlbumItemDto, (i8 & 4) != 0 ? null : audioPlaylistMetaDto, (i8 & 8) != 0 ? null : mediaPopupDto, (i8 & 16) != 0 ? null : str6, (i8 & 32) != 0 ? null : audioChartInfoDto, (i8 & 64) != 0 ? null : f, (i8 & 128) != 0 ? null : list7, (i8 & 256) != 0 ? null : f2, (i8 & 512) != 0 ? null : bool7, (i8 & 1024) != 0 ? null : str7, (i8 & 2048) != 0 ? null : num5);
    }
}
