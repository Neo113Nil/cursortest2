package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsStrikesRestrictionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsStrikesRestrictionsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsStrikesRestrictionsDto> CREATOR = new a();

    @pmi0("addresses")
    private final GroupsStrikesContentRestrictionDto addresses;

    @pmi0("articles")
    private final GroupsStrikesContentRestrictionDto articles;

    @pmi0("audios")
    private final GroupsStrikesContentRestrictionDto audios;

    @pmi0("avatar")
    private final GroupsStrikesContentRestrictionDto avatar;

    @pmi0("chats")
    private final GroupsStrikesContentRestrictionDto chats;

    @pmi0("discussions")
    private final GroupsStrikesContentRestrictionDto discussions;

    @pmi0("events")
    private final GroupsStrikesContentRestrictionDto events;

    @pmi0("files")
    private final GroupsStrikesContentRestrictionDto files;

    @pmi0("lives")
    private final GroupsStrikesContentRestrictionDto lives;

    @pmi0("market")
    private final GroupsStrikesContentRestrictionDto market;

    @pmi0("narratives")
    private final GroupsStrikesContentRestrictionDto narratives;

    @pmi0("photos")
    private final GroupsStrikesContentRestrictionDto photos;

    @pmi0("podcasts")
    private final GroupsStrikesContentRestrictionDto podcasts;

    @pmi0("posts")
    private final GroupsStrikesContentRestrictionDto posts;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    private final GroupsStrikesContentRestrictionDto rooms;

    @pmi0("services")
    private final GroupsStrikesContentRestrictionDto services;

    @pmi0("short_videos")
    private final GroupsStrikesContentRestrictionDto shortVideos;

    @pmi0("stories")
    private final GroupsStrikesContentRestrictionDto stories;

    @pmi0("textlives")
    private final GroupsStrikesContentRestrictionDto textlives;

    @pmi0("videos")
    private final GroupsStrikesContentRestrictionDto videos;

    /* compiled from: GroupsStrikesRestrictionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsStrikesRestrictionsDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) from 0x00ee: MOVE (r17v1 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) = (r1v0 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) (LINE:239)
              (r1v0 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) from 0x00ea: MOVE (r17v4 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) = (r1v0 com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto) (LINE:235)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto createFromParcel(android.os.Parcel r24) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.groups.dto.GroupsStrikesRestrictionsDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsStrikesRestrictionsDto[] newArray(int i) {
            return new GroupsStrikesRestrictionsDto[i];
        }
    }

    public GroupsStrikesRestrictionsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final GroupsStrikesContentRestrictionDto d() {
        return this.lives;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsStrikesContentRestrictionDto e() {
        return this.videos;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsStrikesRestrictionsDto)) {
            return false;
        }
        GroupsStrikesRestrictionsDto groupsStrikesRestrictionsDto = (GroupsStrikesRestrictionsDto) obj;
        return epx.f(this.avatar, groupsStrikesRestrictionsDto.avatar) && epx.f(this.posts, groupsStrikesRestrictionsDto.posts) && epx.f(this.stories, groupsStrikesRestrictionsDto.stories) && epx.f(this.lives, groupsStrikesRestrictionsDto.lives) && epx.f(this.addresses, groupsStrikesRestrictionsDto.addresses) && epx.f(this.articles, groupsStrikesRestrictionsDto.articles) && epx.f(this.audios, groupsStrikesRestrictionsDto.audios) && epx.f(this.chats, groupsStrikesRestrictionsDto.chats) && epx.f(this.discussions, groupsStrikesRestrictionsDto.discussions) && epx.f(this.events, groupsStrikesRestrictionsDto.events) && epx.f(this.files, groupsStrikesRestrictionsDto.files) && epx.f(this.market, groupsStrikesRestrictionsDto.market) && epx.f(this.narratives, groupsStrikesRestrictionsDto.narratives) && epx.f(this.photos, groupsStrikesRestrictionsDto.photos) && epx.f(this.podcasts, groupsStrikesRestrictionsDto.podcasts) && epx.f(this.rooms, groupsStrikesRestrictionsDto.rooms) && epx.f(this.services, groupsStrikesRestrictionsDto.services) && epx.f(this.shortVideos, groupsStrikesRestrictionsDto.shortVideos) && epx.f(this.textlives, groupsStrikesRestrictionsDto.textlives) && epx.f(this.videos, groupsStrikesRestrictionsDto.videos);
    }

    public final int hashCode() {
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto = this.avatar;
        int hashCode = (groupsStrikesContentRestrictionDto == null ? 0 : groupsStrikesContentRestrictionDto.hashCode()) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto2 = this.posts;
        int hashCode2 = (hashCode + (groupsStrikesContentRestrictionDto2 == null ? 0 : groupsStrikesContentRestrictionDto2.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto3 = this.stories;
        int hashCode3 = (hashCode2 + (groupsStrikesContentRestrictionDto3 == null ? 0 : groupsStrikesContentRestrictionDto3.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto4 = this.lives;
        int hashCode4 = (hashCode3 + (groupsStrikesContentRestrictionDto4 == null ? 0 : groupsStrikesContentRestrictionDto4.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto5 = this.addresses;
        int hashCode5 = (hashCode4 + (groupsStrikesContentRestrictionDto5 == null ? 0 : groupsStrikesContentRestrictionDto5.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto6 = this.articles;
        int hashCode6 = (hashCode5 + (groupsStrikesContentRestrictionDto6 == null ? 0 : groupsStrikesContentRestrictionDto6.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto7 = this.audios;
        int hashCode7 = (hashCode6 + (groupsStrikesContentRestrictionDto7 == null ? 0 : groupsStrikesContentRestrictionDto7.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto8 = this.chats;
        int hashCode8 = (hashCode7 + (groupsStrikesContentRestrictionDto8 == null ? 0 : groupsStrikesContentRestrictionDto8.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto9 = this.discussions;
        int hashCode9 = (hashCode8 + (groupsStrikesContentRestrictionDto9 == null ? 0 : groupsStrikesContentRestrictionDto9.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto10 = this.events;
        int hashCode10 = (hashCode9 + (groupsStrikesContentRestrictionDto10 == null ? 0 : groupsStrikesContentRestrictionDto10.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto11 = this.files;
        int hashCode11 = (hashCode10 + (groupsStrikesContentRestrictionDto11 == null ? 0 : groupsStrikesContentRestrictionDto11.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto12 = this.market;
        int hashCode12 = (hashCode11 + (groupsStrikesContentRestrictionDto12 == null ? 0 : groupsStrikesContentRestrictionDto12.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto13 = this.narratives;
        int hashCode13 = (hashCode12 + (groupsStrikesContentRestrictionDto13 == null ? 0 : groupsStrikesContentRestrictionDto13.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto14 = this.photos;
        int hashCode14 = (hashCode13 + (groupsStrikesContentRestrictionDto14 == null ? 0 : groupsStrikesContentRestrictionDto14.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto15 = this.podcasts;
        int hashCode15 = (hashCode14 + (groupsStrikesContentRestrictionDto15 == null ? 0 : groupsStrikesContentRestrictionDto15.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto16 = this.rooms;
        int hashCode16 = (hashCode15 + (groupsStrikesContentRestrictionDto16 == null ? 0 : groupsStrikesContentRestrictionDto16.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto17 = this.services;
        int hashCode17 = (hashCode16 + (groupsStrikesContentRestrictionDto17 == null ? 0 : groupsStrikesContentRestrictionDto17.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto18 = this.shortVideos;
        int hashCode18 = (hashCode17 + (groupsStrikesContentRestrictionDto18 == null ? 0 : groupsStrikesContentRestrictionDto18.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto19 = this.textlives;
        int hashCode19 = (hashCode18 + (groupsStrikesContentRestrictionDto19 == null ? 0 : groupsStrikesContentRestrictionDto19.hashCode())) * 31;
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto20 = this.videos;
        return hashCode19 + (groupsStrikesContentRestrictionDto20 != null ? groupsStrikesContentRestrictionDto20.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsStrikesRestrictionsDto(avatar=" + this.avatar + ", posts=" + this.posts + ", stories=" + this.stories + ", lives=" + this.lives + ", addresses=" + this.addresses + ", articles=" + this.articles + ", audios=" + this.audios + ", chats=" + this.chats + ", discussions=" + this.discussions + ", events=" + this.events + ", files=" + this.files + ", market=" + this.market + ", narratives=" + this.narratives + ", photos=" + this.photos + ", podcasts=" + this.podcasts + ", rooms=" + this.rooms + ", services=" + this.services + ", shortVideos=" + this.shortVideos + ", textlives=" + this.textlives + ", videos=" + this.videos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto = this.avatar;
        if (groupsStrikesContentRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto2 = this.posts;
        if (groupsStrikesContentRestrictionDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto2.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto3 = this.stories;
        if (groupsStrikesContentRestrictionDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto3.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto4 = this.lives;
        if (groupsStrikesContentRestrictionDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto4.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto5 = this.addresses;
        if (groupsStrikesContentRestrictionDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto5.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto6 = this.articles;
        if (groupsStrikesContentRestrictionDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto6.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto7 = this.audios;
        if (groupsStrikesContentRestrictionDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto7.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto8 = this.chats;
        if (groupsStrikesContentRestrictionDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto8.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto9 = this.discussions;
        if (groupsStrikesContentRestrictionDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto9.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto10 = this.events;
        if (groupsStrikesContentRestrictionDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto10.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto11 = this.files;
        if (groupsStrikesContentRestrictionDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto11.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto12 = this.market;
        if (groupsStrikesContentRestrictionDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto12.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto13 = this.narratives;
        if (groupsStrikesContentRestrictionDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto13.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto14 = this.photos;
        if (groupsStrikesContentRestrictionDto14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto14.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto15 = this.podcasts;
        if (groupsStrikesContentRestrictionDto15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto15.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto16 = this.rooms;
        if (groupsStrikesContentRestrictionDto16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto16.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto17 = this.services;
        if (groupsStrikesContentRestrictionDto17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto17.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto18 = this.shortVideos;
        if (groupsStrikesContentRestrictionDto18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto18.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto19 = this.textlives;
        if (groupsStrikesContentRestrictionDto19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto19.writeToParcel(parcel, i);
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto20 = this.videos;
        if (groupsStrikesContentRestrictionDto20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsStrikesContentRestrictionDto20.writeToParcel(parcel, i);
        }
    }

    public GroupsStrikesRestrictionsDto(GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto2, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto3, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto4, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto5, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto6, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto7, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto8, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto9, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto10, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto11, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto12, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto13, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto14, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto15, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto16, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto17, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto18, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto19, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto20) {
        this.avatar = groupsStrikesContentRestrictionDto;
        this.posts = groupsStrikesContentRestrictionDto2;
        this.stories = groupsStrikesContentRestrictionDto3;
        this.lives = groupsStrikesContentRestrictionDto4;
        this.addresses = groupsStrikesContentRestrictionDto5;
        this.articles = groupsStrikesContentRestrictionDto6;
        this.audios = groupsStrikesContentRestrictionDto7;
        this.chats = groupsStrikesContentRestrictionDto8;
        this.discussions = groupsStrikesContentRestrictionDto9;
        this.events = groupsStrikesContentRestrictionDto10;
        this.files = groupsStrikesContentRestrictionDto11;
        this.market = groupsStrikesContentRestrictionDto12;
        this.narratives = groupsStrikesContentRestrictionDto13;
        this.photos = groupsStrikesContentRestrictionDto14;
        this.podcasts = groupsStrikesContentRestrictionDto15;
        this.rooms = groupsStrikesContentRestrictionDto16;
        this.services = groupsStrikesContentRestrictionDto17;
        this.shortVideos = groupsStrikesContentRestrictionDto18;
        this.textlives = groupsStrikesContentRestrictionDto19;
        this.videos = groupsStrikesContentRestrictionDto20;
    }

    public /* synthetic */ GroupsStrikesRestrictionsDto(GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto2, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto3, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto4, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto5, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto6, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto7, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto8, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto9, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto10, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto11, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto12, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto13, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto14, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto15, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto16, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto17, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto18, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto19, GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto20, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsStrikesContentRestrictionDto, (i & 2) != 0 ? null : groupsStrikesContentRestrictionDto2, (i & 4) != 0 ? null : groupsStrikesContentRestrictionDto3, (i & 8) != 0 ? null : groupsStrikesContentRestrictionDto4, (i & 16) != 0 ? null : groupsStrikesContentRestrictionDto5, (i & 32) != 0 ? null : groupsStrikesContentRestrictionDto6, (i & 64) != 0 ? null : groupsStrikesContentRestrictionDto7, (i & 128) != 0 ? null : groupsStrikesContentRestrictionDto8, (i & 256) != 0 ? null : groupsStrikesContentRestrictionDto9, (i & 512) != 0 ? null : groupsStrikesContentRestrictionDto10, (i & 1024) != 0 ? null : groupsStrikesContentRestrictionDto11, (i & 2048) != 0 ? null : groupsStrikesContentRestrictionDto12, (i & 4096) != 0 ? null : groupsStrikesContentRestrictionDto13, (i & 8192) != 0 ? null : groupsStrikesContentRestrictionDto14, (i & 16384) != 0 ? null : groupsStrikesContentRestrictionDto15, (i & 32768) != 0 ? null : groupsStrikesContentRestrictionDto16, (i & 65536) != 0 ? null : groupsStrikesContentRestrictionDto17, (i & 131072) != 0 ? null : groupsStrikesContentRestrictionDto18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsStrikesContentRestrictionDto19, (i & 524288) != 0 ? null : groupsStrikesContentRestrictionDto20);
    }
}
