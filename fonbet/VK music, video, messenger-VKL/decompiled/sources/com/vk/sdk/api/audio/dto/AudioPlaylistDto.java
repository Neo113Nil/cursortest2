package com.vk.sdk.api.audio.dto;

import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.media.dto.MediaPopupDto;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.cgn;
import xsna.epx;
import xsna.mq;
import xsna.nyh0;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.tq;
import xsna.urd0;
import xsna.vq;
import xsna.vr;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioPlaylistDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("actions")
    private final List<AudioPlaylistActionDto> actions;

    @pmi0("album_type")
    private final AlbumTypeDto albumType;

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

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

    @pmi0(MetaBox.TYPE)
    private final AudioPlaylistMetaDto meta;

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

    @pmi0("type")
    private final TypeDto type;

    @pmi0("uma_album_id")
    private final Integer umaAlbumId;

    @pmi0("update_time")
    private final int updateTime;

    @pmi0("year")
    private final Integer year;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistDto.kt */
    public static final class AlbumTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlbumTypeDto[] $VALUES;

        @pmi0("collection")
        public static final AlbumTypeDto COLLECTION;

        @pmi0("main_feat")
        public static final AlbumTypeDto MAIN_FEAT;

        @pmi0("main_only")
        public static final AlbumTypeDto MAIN_ONLY;

        @pmi0("playlist")
        public static final AlbumTypeDto PLAYLIST;
        private final String value;

        static {
            AlbumTypeDto albumTypeDto = new AlbumTypeDto("PLAYLIST", 0, "playlist");
            PLAYLIST = albumTypeDto;
            AlbumTypeDto albumTypeDto2 = new AlbumTypeDto("MAIN_ONLY", 1, "main_only");
            MAIN_ONLY = albumTypeDto2;
            AlbumTypeDto albumTypeDto3 = new AlbumTypeDto("MAIN_FEAT", 2, "main_feat");
            MAIN_FEAT = albumTypeDto3;
            AlbumTypeDto albumTypeDto4 = new AlbumTypeDto("COLLECTION", 3, "collection");
            COLLECTION = albumTypeDto4;
            AlbumTypeDto[] albumTypeDtoArr = {albumTypeDto, albumTypeDto2, albumTypeDto3, albumTypeDto4};
            $VALUES = albumTypeDtoArr;
            $ENTRIES = new asp(albumTypeDtoArr);
        }

        private AlbumTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AlbumTypeDto valueOf(String str) {
            return (AlbumTypeDto) Enum.valueOf(AlbumTypeDto.class, str);
        }

        public static AlbumTypeDto[] values() {
            return (AlbumTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaylistDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("1")
        public static final TypeDto ALBUM;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TypeDto CHAT;

        @pmi0("3")
        public static final TypeDto COLLECTION;

        @pmi0("2")
        public static final TypeDto EP;

        @pmi0("0")
        public static final TypeDto NO_ALBUM;

        @pmi0("4")
        public static final TypeDto SINGLE;
        private final int value;

        static {
            TypeDto typeDto = new TypeDto("NO_ALBUM", 0, 0);
            NO_ALBUM = typeDto;
            TypeDto typeDto2 = new TypeDto("ALBUM", 1, 1);
            ALBUM = typeDto2;
            TypeDto typeDto3 = new TypeDto("EP", 2, 2);
            EP = typeDto3;
            TypeDto typeDto4 = new TypeDto("COLLECTION", 3, 3);
            COLLECTION = typeDto4;
            TypeDto typeDto5 = new TypeDto("SINGLE", 4, 4);
            SINGLE = typeDto5;
            TypeDto typeDto6 = new TypeDto("CHAT", 5, 5);
            CHAT = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public AudioPlaylistDto(int i, UserId userId, TypeDto typeDto, String str, String str2, int i2, int i3, int i4, int i5, int i6, Integer num, List<AudioGenreDto> list, Boolean bool, List<AudioAudioDto> list2, Boolean bool2, Integer num2, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2, AudioPhotoDto audioPhotoDto, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, Boolean bool3, Boolean bool4, List<AudioPhotoDto> list3, String str3, Integer num3, String str4, Integer num4, Boolean bool5, List<AudioArtistDto> list4, List<AudioArtistDto> list5, String str5, List<AudioArtistDto> list6, AlbumTypeDto albumTypeDto, AudioPlaylistMetaDto audioPlaylistMetaDto, MediaPopupDto mediaPopupDto, List<AudioPlaylistActionDto> list7, Float f, Boolean bool6) {
        this.id = i;
        this.ownerId = userId;
        this.type = typeDto;
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
        this.audios = list2;
        this.isCurator = bool2;
        this.year = num2;
        this.original = audioPlaylistOriginalFollowedDto;
        this.followed = audioPlaylistOriginalFollowedDto2;
        this.photo = audioPhotoDto;
        this.permissions = audioPlaylistPermissionsDto;
        this.subtitleBadge = bool3;
        this.playButton = bool4;
        this.thumbs = list3;
        this.accessKey = str3;
        this.umaAlbumId = num3;
        this.subtitle = str4;
        this.originalYear = num4;
        this.isExplicit = bool5;
        this.artists = list4;
        this.mainArtists = list5;
        this.mainArtist = str5;
        this.featuredArtists = list6;
        this.albumType = albumTypeDto;
        this.meta = audioPlaylistMetaDto;
        this.restriction = mediaPopupDto;
        this.actions = list7;
        this.audiosTotalFileSize = f;
        this.exclusive = bool6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistDto)) {
            return false;
        }
        AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) obj;
        return this.id == audioPlaylistDto.id && epx.f(this.ownerId, audioPlaylistDto.ownerId) && this.type == audioPlaylistDto.type && epx.f(this.title, audioPlaylistDto.title) && epx.f(this.description, audioPlaylistDto.description) && this.count == audioPlaylistDto.count && this.followers == audioPlaylistDto.followers && this.plays == audioPlaylistDto.plays && this.createTime == audioPlaylistDto.createTime && this.updateTime == audioPlaylistDto.updateTime && epx.f(this.playlistId, audioPlaylistDto.playlistId) && epx.f(this.genres, audioPlaylistDto.genres) && epx.f(this.isFollowing, audioPlaylistDto.isFollowing) && epx.f(this.audios, audioPlaylistDto.audios) && epx.f(this.isCurator, audioPlaylistDto.isCurator) && epx.f(this.year, audioPlaylistDto.year) && epx.f(this.original, audioPlaylistDto.original) && epx.f(this.followed, audioPlaylistDto.followed) && epx.f(this.photo, audioPlaylistDto.photo) && epx.f(this.permissions, audioPlaylistDto.permissions) && epx.f(this.subtitleBadge, audioPlaylistDto.subtitleBadge) && epx.f(this.playButton, audioPlaylistDto.playButton) && epx.f(this.thumbs, audioPlaylistDto.thumbs) && epx.f(this.accessKey, audioPlaylistDto.accessKey) && epx.f(this.umaAlbumId, audioPlaylistDto.umaAlbumId) && epx.f(this.subtitle, audioPlaylistDto.subtitle) && epx.f(this.originalYear, audioPlaylistDto.originalYear) && epx.f(this.isExplicit, audioPlaylistDto.isExplicit) && epx.f(this.artists, audioPlaylistDto.artists) && epx.f(this.mainArtists, audioPlaylistDto.mainArtists) && epx.f(this.mainArtist, audioPlaylistDto.mainArtist) && epx.f(this.featuredArtists, audioPlaylistDto.featuredArtists) && this.albumType == audioPlaylistDto.albumType && epx.f(this.meta, audioPlaylistDto.meta) && epx.f(this.restriction, audioPlaylistDto.restriction) && epx.f(this.actions, audioPlaylistDto.actions) && epx.f(this.audiosTotalFileSize, audioPlaylistDto.audiosTotalFileSize) && epx.f(this.exclusive, audioPlaylistDto.exclusive);
    }

    public final int hashCode() {
        int a = shy.a(this.updateTime, shy.a(this.createTime, shy.a(this.plays, shy.a(this.followers, shy.a(this.count, urd0.a(urd0.a((this.type.hashCode() + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b)) * 31, 31, this.title), 31, this.description), 31), 31), 31), 31), 31);
        Integer num = this.playlistId;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        List<AudioGenreDto> list = this.genres;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFollowing;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AudioAudioDto> list2 = this.audios;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isCurator;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.year;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = this.original;
        int hashCode7 = (hashCode6 + (audioPlaylistOriginalFollowedDto == null ? 0 : audioPlaylistOriginalFollowedDto.hashCode())) * 31;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2 = this.followed;
        int hashCode8 = (hashCode7 + (audioPlaylistOriginalFollowedDto2 == null ? 0 : audioPlaylistOriginalFollowedDto2.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode9 = (hashCode8 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = this.permissions;
        int hashCode10 = (hashCode9 + (audioPlaylistPermissionsDto == null ? 0 : audioPlaylistPermissionsDto.hashCode())) * 31;
        Boolean bool3 = this.subtitleBadge;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.playButton;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<AudioPhotoDto> list3 = this.thumbs;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.accessKey;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.umaAlbumId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.originalYear;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool5 = this.isExplicit;
        int hashCode18 = (hashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<AudioArtistDto> list4 = this.artists;
        int hashCode19 = (hashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AudioArtistDto> list5 = this.mainArtists;
        int hashCode20 = (hashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.mainArtist;
        int hashCode21 = (hashCode20 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AudioArtistDto> list6 = this.featuredArtists;
        int hashCode22 = (hashCode21 + (list6 == null ? 0 : list6.hashCode())) * 31;
        AlbumTypeDto albumTypeDto = this.albumType;
        int hashCode23 = (hashCode22 + (albumTypeDto == null ? 0 : albumTypeDto.hashCode())) * 31;
        AudioPlaylistMetaDto audioPlaylistMetaDto = this.meta;
        int hashCode24 = (hashCode23 + (audioPlaylistMetaDto == null ? 0 : audioPlaylistMetaDto.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.restriction;
        int hashCode25 = (hashCode24 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        List<AudioPlaylistActionDto> list7 = this.actions;
        int hashCode26 = (hashCode25 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Float f = this.audiosTotalFileSize;
        int hashCode27 = (hashCode26 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool6 = this.exclusive;
        return hashCode27 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        TypeDto typeDto = this.type;
        String str = this.title;
        String str2 = this.description;
        int i2 = this.count;
        int i3 = this.followers;
        int i4 = this.plays;
        int i5 = this.createTime;
        int i6 = this.updateTime;
        Integer num = this.playlistId;
        List<AudioGenreDto> list = this.genres;
        Boolean bool = this.isFollowing;
        List<AudioAudioDto> list2 = this.audios;
        Boolean bool2 = this.isCurator;
        Integer num2 = this.year;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = this.original;
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2 = this.followed;
        AudioPhotoDto audioPhotoDto = this.photo;
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = this.permissions;
        Boolean bool3 = this.subtitleBadge;
        Boolean bool4 = this.playButton;
        List<AudioPhotoDto> list3 = this.thumbs;
        String str3 = this.accessKey;
        Integer num3 = this.umaAlbumId;
        String str4 = this.subtitle;
        Integer num4 = this.originalYear;
        Boolean bool5 = this.isExplicit;
        List<AudioArtistDto> list4 = this.artists;
        List<AudioArtistDto> list5 = this.mainArtists;
        String str5 = this.mainArtist;
        List<AudioArtistDto> list6 = this.featuredArtists;
        AlbumTypeDto albumTypeDto = this.albumType;
        AudioPlaylistMetaDto audioPlaylistMetaDto = this.meta;
        MediaPopupDto mediaPopupDto = this.restriction;
        List<AudioPlaylistActionDto> list7 = this.actions;
        Float f = this.audiosTotalFileSize;
        Boolean bool6 = this.exclusive;
        StringBuilder sb = new StringBuilder("AudioPlaylistDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", type=");
        sb.append(typeDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        nyh0.a(i2, str2, ", count=", ", followers=", sb);
        cgn.a(i3, i4, ", plays=", ", createTime=", sb);
        cgn.a(i5, i6, ", updateTime=", ", playlistId=", sb);
        sb.append(num);
        sb.append(", genres=");
        sb.append(list);
        sb.append(", isFollowing=");
        sb.append(bool);
        sb.append(", audios=");
        sb.append(list2);
        sb.append(", isCurator=");
        sb.append(bool2);
        sb.append(", year=");
        sb.append(num2);
        sb.append(", original=");
        sb.append(audioPlaylistOriginalFollowedDto);
        sb.append(", followed=");
        sb.append(audioPlaylistOriginalFollowedDto2);
        sb.append(", photo=");
        sb.append(audioPhotoDto);
        sb.append(", permissions=");
        sb.append(audioPlaylistPermissionsDto);
        sb.append(", subtitleBadge=");
        tq.i(sb, bool3, ", playButton=", bool4, ", thumbs=");
        vr.c(", accessKey=", str3, ", umaAlbumId=", sb, list3);
        mq.b(num3, ", subtitle=", str4, ", originalYear=", sb);
        rq.h(sb, num4, ", isExplicit=", bool5, ", artists=");
        vq.d(sb, list4, ", mainArtists=", list5, ", mainArtist=");
        b.c(str5, ", featuredArtists=", ", albumType=", sb, list6);
        sb.append(albumTypeDto);
        sb.append(", meta=");
        sb.append(audioPlaylistMetaDto);
        sb.append(", restriction=");
        sb.append(mediaPopupDto);
        sb.append(", actions=");
        sb.append(list7);
        sb.append(", audiosTotalFileSize=");
        sb.append(f);
        sb.append(", exclusive=");
        sb.append(bool6);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AudioPlaylistDto(int i, UserId userId, TypeDto typeDto, String str, String str2, int i2, int i3, int i4, int i5, int i6, Integer num, List list, Boolean bool, List list2, Boolean bool2, Integer num2, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto, AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto2, AudioPhotoDto audioPhotoDto, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, Boolean bool3, Boolean bool4, List list3, String str3, Integer num3, String str4, Integer num4, Boolean bool5, List list4, List list5, String str5, List list6, AlbumTypeDto albumTypeDto, AudioPlaylistMetaDto audioPlaylistMetaDto, MediaPopupDto mediaPopupDto, List list7, Float f, Boolean bool6, int i7, int i8, zcl zclVar) {
        this(i, userId, typeDto, str, str2, i2, i3, i4, i5, i6, (i7 & 1024) != 0 ? null : num, (i7 & 2048) != 0 ? null : list, (i7 & 4096) != 0 ? null : bool, (i7 & 8192) != 0 ? null : list2, (i7 & 16384) != 0 ? null : bool2, (32768 & i7) != 0 ? null : num2, (65536 & i7) != 0 ? null : audioPlaylistOriginalFollowedDto, (131072 & i7) != 0 ? null : audioPlaylistOriginalFollowedDto2, (262144 & i7) != 0 ? null : audioPhotoDto, (524288 & i7) != 0 ? null : audioPlaylistPermissionsDto, (1048576 & i7) != 0 ? null : bool3, (2097152 & i7) != 0 ? null : bool4, (4194304 & i7) != 0 ? null : list3, (8388608 & i7) != 0 ? null : str3, (16777216 & i7) != 0 ? null : num3, (33554432 & i7) != 0 ? null : str4, (67108864 & i7) != 0 ? null : num4, (134217728 & i7) != 0 ? null : bool5, (268435456 & i7) != 0 ? null : list4, (536870912 & i7) != 0 ? null : list5, (1073741824 & i7) != 0 ? null : str5, (i7 & Integer.MIN_VALUE) != 0 ? null : list6, (i8 & 1) != 0 ? null : albumTypeDto, (i8 & 2) != 0 ? null : audioPlaylistMetaDto, (i8 & 4) != 0 ? null : mediaPopupDto, (i8 & 8) != 0 ? null : list7, (i8 & 16) != 0 ? null : f, (i8 & 32) != 0 ? null : bool6);
    }
}
