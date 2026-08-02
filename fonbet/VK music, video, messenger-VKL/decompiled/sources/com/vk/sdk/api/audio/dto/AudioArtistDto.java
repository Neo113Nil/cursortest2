package com.vk.sdk.api.audio.dto;

import com.ironsource.X3;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.tq;
import xsna.uq;
import xsna.vq;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AudioArtistDto.kt */
/* loaded from: classes5.dex */
public final class AudioArtistDto {

    @pmi0("bio")
    private final String bio;

    @pmi0("can_follow")
    private final Boolean canFollow;

    @pmi0("can_play")
    private final Boolean canPlay;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("genres")
    private final List<AudioGenreDto> genres;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("id")
    private final String id;

    @pmi0("is_album_cover")
    private final Boolean isAlbumCover;

    @pmi0("is_followed")
    private final Boolean isFollowed;

    @pmi0("name")
    private final String name;

    @pmi0("pages")
    private final List<Integer> pages;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("photos")
    private final List<AudioPhotosByTypeDto> photos;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    public AudioArtistDto(String str, String str2, String str3, Boolean bool, List<BaseImageDto> list, List<AudioPhotosByTypeDto> list2, Boolean bool2, Boolean bool3, Boolean bool4, List<AudioGenreDto> list3, String str4, List<Integer> list4, List<UsersUserDto> list5, List<GroupsGroupFullDto> list6) {
        this.name = str;
        this.domain = str2;
        this.id = str3;
        this.isAlbumCover = bool;
        this.photo = list;
        this.photos = list2;
        this.isFollowed = bool2;
        this.canFollow = bool3;
        this.canPlay = bool4;
        this.genres = list3;
        this.bio = str4;
        this.pages = list4;
        this.profiles = list5;
        this.groups = list6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioArtistDto)) {
            return false;
        }
        AudioArtistDto audioArtistDto = (AudioArtistDto) obj;
        return epx.f(this.name, audioArtistDto.name) && epx.f(this.domain, audioArtistDto.domain) && epx.f(this.id, audioArtistDto.id) && epx.f(this.isAlbumCover, audioArtistDto.isAlbumCover) && epx.f(this.photo, audioArtistDto.photo) && epx.f(this.photos, audioArtistDto.photos) && epx.f(this.isFollowed, audioArtistDto.isFollowed) && epx.f(this.canFollow, audioArtistDto.canFollow) && epx.f(this.canPlay, audioArtistDto.canPlay) && epx.f(this.genres, audioArtistDto.genres) && epx.f(this.bio, audioArtistDto.bio) && epx.f(this.pages, audioArtistDto.pages) && epx.f(this.profiles, audioArtistDto.profiles) && epx.f(this.groups, audioArtistDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.domain;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAlbumCover;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImageDto> list = this.photo;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioPhotosByTypeDto> list2 = this.photos;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isFollowed;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canFollow;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canPlay;
        int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<AudioGenreDto> list3 = this.genres;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.bio;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Integer> list4 = this.pages;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersUserDto> list5 = this.profiles;
        int hashCode13 = (hashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<GroupsGroupFullDto> list6 = this.groups;
        return hashCode13 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.domain;
        String str3 = this.id;
        Boolean bool = this.isAlbumCover;
        List<BaseImageDto> list = this.photo;
        List<AudioPhotosByTypeDto> list2 = this.photos;
        Boolean bool2 = this.isFollowed;
        Boolean bool3 = this.canFollow;
        Boolean bool4 = this.canPlay;
        List<AudioGenreDto> list3 = this.genres;
        String str4 = this.bio;
        List<Integer> list4 = this.pages;
        List<UsersUserDto> list5 = this.profiles;
        List<GroupsGroupFullDto> list6 = this.groups;
        StringBuilder a = xe9.a("AudioArtistDto(name=", str, ", domain=", str2, ", id=");
        uq.c(bool, str3, ", isAlbumCover=", ", photo=", a);
        vq.d(a, list, ", photos=", list2, ", isFollowed=");
        tq.i(a, bool2, ", canFollow=", bool3, ", canPlay=");
        a.append(bool4);
        a.append(", genres=");
        a.append(list3);
        a.append(", bio=");
        b.c(str4, ", pages=", ", profiles=", a, list4);
        return n.b(a, list5, ", groups=", list6, ")");
    }

    public /* synthetic */ AudioArtistDto(String str, String str2, String str3, Boolean bool, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str4, List list4, List list5, List list6, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : list5, (i & 8192) != 0 ? null : list6);
    }
}
