package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioArtistDto.kt */
/* loaded from: classes14.dex */
public final class AudioArtistDto implements Parcelable {
    public static final Parcelable.Creator<AudioArtistDto> CREATOR = new a();

    @pmi0("bio")
    private final String bio;

    @pmi0("can_follow")
    private final Boolean canFollow;

    @pmi0("can_play")
    private final Boolean canPlay;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("flags_context")
    private final Integer flagsContext;

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

    @pmi0("listeners_count")
    private final Integer listenersCount;

    @pmi0("name")
    private final String name;

    @pmi0("pages")
    private final List<Integer> pages;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("photos")
    private final List<AudioPhotosByTypeDto> photos;

    @pmi0("popular_audios_block_id")
    private final String popularAudiosBlockId;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video_owner_id")
    private final UserId videoOwnerId;

    /* compiled from: AudioArtistDto.kt */
    public static final class a implements Parcelable.Creator<AudioArtistDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final AudioArtistDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str;
            ArrayList arrayList5;
            ArrayList arrayList6;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(AudioPhotosByTypeDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(AudioGenreDto.CREATOR, parcel, arrayList3, i3, 1);
                }
                arrayList4 = null;
            }
            Boolean bool = valueOf2;
            Boolean bool2 = valueOf3;
            String readString4 = parcel.readString();
            Object valueOf5 = parcel.readInt() == 0 ? arrayList4 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str = readString;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                str = readString;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = pm0.b(parcel, arrayList4, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(UsersUserDto.CREATOR, parcel, arrayList5, i5, 1);
                    readInt5 = readInt5;
                    readString2 = readString2;
                }
            }
            String str2 = readString2;
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(GroupsGroupFullDto.CREATOR, parcel, arrayList6, i6, 1);
                    readInt6 = readInt6;
                    readString3 = readString3;
                }
            }
            return new AudioArtistDto(str, str2, readString3, valueOf, arrayList, arrayList2, bool, bool2, valueOf4, arrayList3, readString4, valueOf5, arrayList4, arrayList5, arrayList6, parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(AudioArtistDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioArtistDto[] newArray(int i) {
            return new AudioArtistDto[i];
        }
    }

    public AudioArtistDto(String str, String str2, String str3, Boolean bool, List<BaseImageDto> list, List<AudioPhotosByTypeDto> list2, Boolean bool2, Boolean bool3, Boolean bool4, List<AudioGenreDto> list3, String str4, Integer num, List<Integer> list4, List<UsersUserDto> list5, List<GroupsGroupFullDto> list6, String str5, String str6, UserId userId, Integer num2) {
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
        this.listenersCount = num;
        this.pages = list4;
        this.profiles = list5;
        this.groups = list6;
        this.trackCode = str5;
        this.popularAudiosBlockId = str6;
        this.videoOwnerId = userId;
        this.flagsContext = num2;
    }

    public final String d() {
        return this.bio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canFollow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioArtistDto)) {
            return false;
        }
        AudioArtistDto audioArtistDto = (AudioArtistDto) obj;
        return epx.f(this.name, audioArtistDto.name) && epx.f(this.domain, audioArtistDto.domain) && epx.f(this.id, audioArtistDto.id) && epx.f(this.isAlbumCover, audioArtistDto.isAlbumCover) && epx.f(this.photo, audioArtistDto.photo) && epx.f(this.photos, audioArtistDto.photos) && epx.f(this.isFollowed, audioArtistDto.isFollowed) && epx.f(this.canFollow, audioArtistDto.canFollow) && epx.f(this.canPlay, audioArtistDto.canPlay) && epx.f(this.genres, audioArtistDto.genres) && epx.f(this.bio, audioArtistDto.bio) && epx.f(this.listenersCount, audioArtistDto.listenersCount) && epx.f(this.pages, audioArtistDto.pages) && epx.f(this.profiles, audioArtistDto.profiles) && epx.f(this.groups, audioArtistDto.groups) && epx.f(this.trackCode, audioArtistDto.trackCode) && epx.f(this.popularAudiosBlockId, audioArtistDto.popularAudiosBlockId) && epx.f(this.videoOwnerId, audioArtistDto.videoOwnerId) && epx.f(this.flagsContext, audioArtistDto.flagsContext);
    }

    public final Boolean f() {
        return this.canPlay;
    }

    public final Integer g() {
        return this.flagsContext;
    }

    public final String getId() {
        return this.id;
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
        Integer num = this.listenersCount;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list4 = this.pages;
        int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersUserDto> list5 = this.profiles;
        int hashCode14 = (hashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<GroupsGroupFullDto> list6 = this.groups;
        int hashCode15 = (hashCode14 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.popularAudiosBlockId;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UserId userId = this.videoOwnerId;
        int hashCode18 = (hashCode17 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num2 = this.flagsContext;
        return hashCode18 + (num2 != null ? num2.hashCode() : 0);
    }

    public final List<AudioGenreDto> i() {
        return this.genres;
    }

    public final Integer j() {
        return this.listenersCount;
    }

    public final String k() {
        return this.name;
    }

    public final List<BaseImageDto> l() {
        return this.photo;
    }

    public final List<AudioPhotosByTypeDto> n() {
        return this.photos;
    }

    public final UserId o() {
        return this.videoOwnerId;
    }

    public final Boolean p() {
        return this.isAlbumCover;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioArtistDto(name=");
        sb.append(this.name);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isAlbumCover=");
        sb.append(this.isAlbumCover);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", isFollowed=");
        sb.append(this.isFollowed);
        sb.append(", canFollow=");
        sb.append(this.canFollow);
        sb.append(", canPlay=");
        sb.append(this.canPlay);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", bio=");
        sb.append(this.bio);
        sb.append(", listenersCount=");
        sb.append(this.listenersCount);
        sb.append(", pages=");
        sb.append(this.pages);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", popularAudiosBlockId=");
        sb.append(this.popularAudiosBlockId);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", flagsContext=");
        return uqi.b(sb, this.flagsContext, ')');
    }

    public final Boolean u() {
        return this.isFollowed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.domain);
        parcel.writeString(this.id);
        Boolean bool = this.isAlbumCover;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BaseImageDto> list = this.photo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioPhotosByTypeDto> list2 = this.photos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AudioPhotosByTypeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool2 = this.isFollowed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canFollow;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canPlay;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        List<AudioGenreDto> list3 = this.genres;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((AudioGenreDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.bio);
        Integer num = this.listenersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list4 = this.pages;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeInt(((Number) f4.next()).intValue());
            }
        }
        List<UsersUserDto> list5 = this.profiles;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((UsersUserDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list6 = this.groups;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((GroupsGroupFullDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.popularAudiosBlockId);
        parcel.writeParcelable(this.videoOwnerId, i);
        Integer num2 = this.flagsContext;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AudioArtistDto(String str, String str2, String str3, Boolean bool, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str4, Integer num, List list4, List list5, List list6, String str5, String str6, UserId userId, Integer num2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : list5, (i & 16384) != 0 ? null : list6, (i & 32768) != 0 ? null : str5, (i & 65536) != 0 ? null : str6, (i & 131072) != 0 ? null : userId, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num2);
    }
}
