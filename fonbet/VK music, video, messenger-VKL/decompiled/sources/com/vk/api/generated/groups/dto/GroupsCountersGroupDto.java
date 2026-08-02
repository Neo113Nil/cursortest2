package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.iq;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsCountersGroupDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCountersGroupDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCountersGroupDto> CREATOR = new a();

    @pmi0("addresses")
    private final Integer addresses;

    @pmi0("albums")
    private final Integer albums;

    @pmi0("articles")
    private final Integer articles;

    @pmi0("audio_playlists")
    private final Integer audioPlaylists;

    @pmi0("audios")
    private final Integer audios;

    @pmi0("classified_youla")
    private final Integer classifiedYoula;

    @pmi0("clips")
    private final Long clips;

    @pmi0("clips_followers")
    private final Long clipsFollowers;

    @pmi0("clips_likes")
    private final Long clipsLikes;

    @pmi0("clips_views")
    private final Long clipsViews;

    @pmi0("docs")
    private final Integer docs;

    @pmi0("market")
    private final Integer market;

    @pmi0("market_services")
    private final Integer marketServices;

    @pmi0("narratives")
    private final Integer narratives;

    @pmi0("photos")
    private final Integer photos;

    @pmi0("podcasts")
    private final Integer podcasts;

    @pmi0("topics")
    private final Integer topics;

    @pmi0("video_live_active_mobile_count")
    private final Long videoLiveActiveMobileCount;

    @pmi0("video_live_ended_mobile_count")
    private final Long videoLiveEndedMobileCount;

    @pmi0("video_playlists")
    private final Integer videoPlaylists;

    @pmi0("videos")
    private final Integer videos;

    @pmi0("videos_followers")
    private final Long videosFollowers;

    @pmi0("videos_views")
    private final Long videosViews;

    /* compiled from: GroupsCountersGroupDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCountersGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCountersGroupDto createFromParcel(Parcel parcel) {
            return new GroupsCountersGroupDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCountersGroupDto[] newArray(int i) {
            return new GroupsCountersGroupDto[i];
        }
    }

    public GroupsCountersGroupDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public final Long d() {
        return this.clips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Long e() {
        return this.clipsFollowers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCountersGroupDto)) {
            return false;
        }
        GroupsCountersGroupDto groupsCountersGroupDto = (GroupsCountersGroupDto) obj;
        return epx.f(this.addresses, groupsCountersGroupDto.addresses) && epx.f(this.albums, groupsCountersGroupDto.albums) && epx.f(this.audios, groupsCountersGroupDto.audios) && epx.f(this.audioPlaylists, groupsCountersGroupDto.audioPlaylists) && epx.f(this.docs, groupsCountersGroupDto.docs) && epx.f(this.market, groupsCountersGroupDto.market) && epx.f(this.photos, groupsCountersGroupDto.photos) && epx.f(this.topics, groupsCountersGroupDto.topics) && epx.f(this.videos, groupsCountersGroupDto.videos) && epx.f(this.videoPlaylists, groupsCountersGroupDto.videoPlaylists) && epx.f(this.marketServices, groupsCountersGroupDto.marketServices) && epx.f(this.podcasts, groupsCountersGroupDto.podcasts) && epx.f(this.articles, groupsCountersGroupDto.articles) && epx.f(this.narratives, groupsCountersGroupDto.narratives) && epx.f(this.clips, groupsCountersGroupDto.clips) && epx.f(this.clipsFollowers, groupsCountersGroupDto.clipsFollowers) && epx.f(this.videosFollowers, groupsCountersGroupDto.videosFollowers) && epx.f(this.clipsViews, groupsCountersGroupDto.clipsViews) && epx.f(this.clipsLikes, groupsCountersGroupDto.clipsLikes) && epx.f(this.videoLiveActiveMobileCount, groupsCountersGroupDto.videoLiveActiveMobileCount) && epx.f(this.videoLiveEndedMobileCount, groupsCountersGroupDto.videoLiveEndedMobileCount) && epx.f(this.classifiedYoula, groupsCountersGroupDto.classifiedYoula) && epx.f(this.videosViews, groupsCountersGroupDto.videosViews);
    }

    public final Long f() {
        return this.clipsLikes;
    }

    public final Long g() {
        return this.clipsViews;
    }

    public final int hashCode() {
        Integer num = this.addresses;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.albums;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.audios;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.audioPlaylists;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.docs;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.market;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.photos;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.topics;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.videos;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.videoPlaylists;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.marketServices;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.podcasts;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.articles;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.narratives;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Long l = this.clips;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.clipsFollowers;
        int hashCode16 = (hashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.videosFollowers;
        int hashCode17 = (hashCode16 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.clipsViews;
        int hashCode18 = (hashCode17 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.clipsLikes;
        int hashCode19 = (hashCode18 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.videoLiveActiveMobileCount;
        int hashCode20 = (hashCode19 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.videoLiveEndedMobileCount;
        int hashCode21 = (hashCode20 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num15 = this.classifiedYoula;
        int hashCode22 = (hashCode21 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Long l8 = this.videosViews;
        return hashCode22 + (l8 != null ? l8.hashCode() : 0);
    }

    public final Long i() {
        return this.videoLiveEndedMobileCount;
    }

    public final Integer j() {
        return this.videos;
    }

    public final Long k() {
        return this.videosFollowers;
    }

    public final Long l() {
        return this.videosViews;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCountersGroupDto(addresses=");
        sb.append(this.addresses);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", audioPlaylists=");
        sb.append(this.audioPlaylists);
        sb.append(", docs=");
        sb.append(this.docs);
        sb.append(", market=");
        sb.append(this.market);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", topics=");
        sb.append(this.topics);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", videoPlaylists=");
        sb.append(this.videoPlaylists);
        sb.append(", marketServices=");
        sb.append(this.marketServices);
        sb.append(", podcasts=");
        sb.append(this.podcasts);
        sb.append(", articles=");
        sb.append(this.articles);
        sb.append(", narratives=");
        sb.append(this.narratives);
        sb.append(", clips=");
        sb.append(this.clips);
        sb.append(", clipsFollowers=");
        sb.append(this.clipsFollowers);
        sb.append(", videosFollowers=");
        sb.append(this.videosFollowers);
        sb.append(", clipsViews=");
        sb.append(this.clipsViews);
        sb.append(", clipsLikes=");
        sb.append(this.clipsLikes);
        sb.append(", videoLiveActiveMobileCount=");
        sb.append(this.videoLiveActiveMobileCount);
        sb.append(", videoLiveEndedMobileCount=");
        sb.append(this.videoLiveEndedMobileCount);
        sb.append(", classifiedYoula=");
        sb.append(this.classifiedYoula);
        sb.append(", videosViews=");
        return iq.b(sb, this.videosViews, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.addresses;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.albums;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.audios;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.audioPlaylists;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.docs;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.market;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.photos;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.topics;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.videos;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.videoPlaylists;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.marketServices;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        Integer num12 = this.podcasts;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Integer num13 = this.articles;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        Integer num14 = this.narratives;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Long l = this.clips;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.clipsFollowers;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        Long l3 = this.videosFollowers;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l3);
        }
        Long l4 = this.clipsViews;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l4);
        }
        Long l5 = this.clipsLikes;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l5);
        }
        Long l6 = this.videoLiveActiveMobileCount;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l6);
        }
        Long l7 = this.videoLiveEndedMobileCount;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l7);
        }
        Integer num15 = this.classifiedYoula;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Long l8 = this.videosViews;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l8);
        }
    }

    public GroupsCountersGroupDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num15, Long l8) {
        this.addresses = num;
        this.albums = num2;
        this.audios = num3;
        this.audioPlaylists = num4;
        this.docs = num5;
        this.market = num6;
        this.photos = num7;
        this.topics = num8;
        this.videos = num9;
        this.videoPlaylists = num10;
        this.marketServices = num11;
        this.podcasts = num12;
        this.articles = num13;
        this.narratives = num14;
        this.clips = l;
        this.clipsFollowers = l2;
        this.videosFollowers = l3;
        this.clipsViews = l4;
        this.clipsLikes = l5;
        this.videoLiveActiveMobileCount = l6;
        this.videoLiveEndedMobileCount = l7;
        this.classifiedYoula = num15;
        this.videosViews = l8;
    }

    public /* synthetic */ GroupsCountersGroupDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num15, Long l8, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : l, (i & 32768) != 0 ? null : l2, (i & 65536) != 0 ? null : l3, (i & 131072) != 0 ? null : l4, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : l5, (i & 524288) != 0 ? null : l6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l7, (i & 2097152) != 0 ? null : num15, (i & 4194304) != 0 ? null : l8);
    }
}
