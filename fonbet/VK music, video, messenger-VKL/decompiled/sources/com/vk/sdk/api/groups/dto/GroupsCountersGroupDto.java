package com.vk.sdk.api.groups.dto;

import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: GroupsCountersGroupDto.kt */
/* loaded from: classes5.dex */
public final class GroupsCountersGroupDto {

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

    @pmi0("video_playlists")
    private final Integer videoPlaylists;

    @pmi0("videos")
    private final Integer videos;

    @pmi0("videos_followers")
    private final Long videosFollowers;

    public GroupsCountersGroupDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCountersGroupDto)) {
            return false;
        }
        GroupsCountersGroupDto groupsCountersGroupDto = (GroupsCountersGroupDto) obj;
        return epx.f(this.addresses, groupsCountersGroupDto.addresses) && epx.f(this.albums, groupsCountersGroupDto.albums) && epx.f(this.audios, groupsCountersGroupDto.audios) && epx.f(this.audioPlaylists, groupsCountersGroupDto.audioPlaylists) && epx.f(this.docs, groupsCountersGroupDto.docs) && epx.f(this.market, groupsCountersGroupDto.market) && epx.f(this.photos, groupsCountersGroupDto.photos) && epx.f(this.topics, groupsCountersGroupDto.topics) && epx.f(this.videos, groupsCountersGroupDto.videos) && epx.f(this.videoPlaylists, groupsCountersGroupDto.videoPlaylists) && epx.f(this.marketServices, groupsCountersGroupDto.marketServices) && epx.f(this.podcasts, groupsCountersGroupDto.podcasts) && epx.f(this.articles, groupsCountersGroupDto.articles) && epx.f(this.narratives, groupsCountersGroupDto.narratives) && epx.f(this.clips, groupsCountersGroupDto.clips) && epx.f(this.clipsFollowers, groupsCountersGroupDto.clipsFollowers) && epx.f(this.videosFollowers, groupsCountersGroupDto.videosFollowers) && epx.f(this.clipsViews, groupsCountersGroupDto.clipsViews) && epx.f(this.clipsLikes, groupsCountersGroupDto.clipsLikes);
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
        return hashCode18 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.addresses;
        Integer num2 = this.albums;
        Integer num3 = this.audios;
        Integer num4 = this.audioPlaylists;
        Integer num5 = this.docs;
        Integer num6 = this.market;
        Integer num7 = this.photos;
        Integer num8 = this.topics;
        Integer num9 = this.videos;
        Integer num10 = this.videoPlaylists;
        Integer num11 = this.marketServices;
        Integer num12 = this.podcasts;
        Integer num13 = this.articles;
        Integer num14 = this.narratives;
        Long l = this.clips;
        Long l2 = this.clipsFollowers;
        Long l3 = this.videosFollowers;
        Long l4 = this.clipsViews;
        Long l5 = this.clipsLikes;
        StringBuilder a = wr.a(num, "GroupsCountersGroupDto(addresses=", num2, ", albums=", ", audios=");
        sq.b(a, num3, ", audioPlaylists=", num4, ", docs=");
        sq.b(a, num5, ", market=", num6, ", photos=");
        sq.b(a, num7, ", topics=", num8, ", videos=");
        sq.b(a, num9, ", videoPlaylists=", num10, ", marketServices=");
        sq.b(a, num11, ", podcasts=", num12, ", articles=");
        sq.b(a, num13, ", narratives=", num14, ", clips=");
        a.append(l);
        a.append(", clipsFollowers=");
        a.append(l2);
        a.append(", videosFollowers=");
        a.append(l3);
        a.append(", clipsViews=");
        a.append(l4);
        a.append(", clipsLikes=");
        a.append(l5);
        a.append(")");
        return a.toString();
    }

    public GroupsCountersGroupDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Long l, Long l2, Long l3, Long l4, Long l5) {
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
    }

    public /* synthetic */ GroupsCountersGroupDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Long l, Long l2, Long l3, Long l4, Long l5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : l, (i & 32768) != 0 ? null : l2, (i & 65536) != 0 ? null : l3, (i & 131072) != 0 ? null : l4, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : l5);
    }
}
