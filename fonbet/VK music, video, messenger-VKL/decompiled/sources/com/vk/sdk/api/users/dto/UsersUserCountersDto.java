package com.vk.sdk.api.users.dto;

import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: UsersUserCountersDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserCountersDto {

    @pmi0("albums")
    private final Integer albums;

    @pmi0("articles")
    private final Integer articles;

    @pmi0("audios")
    private final Integer audios;

    @pmi0("badges")
    private final Integer badges;

    @pmi0("clips")
    private final Long clips;

    @pmi0("clips_followers")
    private final Long clipsFollowers;

    @pmi0("clips_likes")
    private final Long clipsLikes;

    @pmi0("clips_views")
    private final Long clipsViews;

    @pmi0("followers")
    private final Integer followers;

    @pmi0("friends")
    private final Integer friends;

    @pmi0("friends_followers")
    private final Integer friendsFollowers;

    @pmi0("gifts")
    private final Integer gifts;

    @pmi0("groups")
    private final Integer groups;

    @pmi0("mutual_friends")
    private final Integer mutualFriends;

    @pmi0("new_photo_tags")
    private final Integer newPhotoTags;

    @pmi0("new_recognition_tags")
    private final Integer newRecognitionTags;

    @pmi0("notes")
    private final Integer notes;

    @pmi0("online_friends")
    private final Integer onlineFriends;

    @pmi0("pages")
    private final Integer pages;

    @pmi0("photos")
    private final Integer photos;

    @pmi0("podcasts")
    private final Integer podcasts;

    @pmi0("posts")
    private final Integer posts;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final Integer subscriptions;

    @pmi0("user_photos")
    private final Integer userPhotos;

    @pmi0("user_videos")
    private final Integer userVideos;

    @pmi0("video_playlists")
    private final Integer videoPlaylists;

    @pmi0("videos")
    private final Integer videos;

    @pmi0("videos_followers")
    private final Long videosFollowers;

    @pmi0("wishes")
    private final Integer wishes;

    public UsersUserCountersDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserCountersDto)) {
            return false;
        }
        UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) obj;
        return epx.f(this.albums, usersUserCountersDto.albums) && epx.f(this.badges, usersUserCountersDto.badges) && epx.f(this.audios, usersUserCountersDto.audios) && epx.f(this.followers, usersUserCountersDto.followers) && epx.f(this.friends, usersUserCountersDto.friends) && epx.f(this.gifts, usersUserCountersDto.gifts) && epx.f(this.groups, usersUserCountersDto.groups) && epx.f(this.notes, usersUserCountersDto.notes) && epx.f(this.onlineFriends, usersUserCountersDto.onlineFriends) && epx.f(this.pages, usersUserCountersDto.pages) && epx.f(this.photos, usersUserCountersDto.photos) && epx.f(this.subscriptions, usersUserCountersDto.subscriptions) && epx.f(this.userPhotos, usersUserCountersDto.userPhotos) && epx.f(this.userVideos, usersUserCountersDto.userVideos) && epx.f(this.videos, usersUserCountersDto.videos) && epx.f(this.videoPlaylists, usersUserCountersDto.videoPlaylists) && epx.f(this.newPhotoTags, usersUserCountersDto.newPhotoTags) && epx.f(this.newRecognitionTags, usersUserCountersDto.newRecognitionTags) && epx.f(this.mutualFriends, usersUserCountersDto.mutualFriends) && epx.f(this.friendsFollowers, usersUserCountersDto.friendsFollowers) && epx.f(this.posts, usersUserCountersDto.posts) && epx.f(this.articles, usersUserCountersDto.articles) && epx.f(this.wishes, usersUserCountersDto.wishes) && epx.f(this.podcasts, usersUserCountersDto.podcasts) && epx.f(this.clips, usersUserCountersDto.clips) && epx.f(this.clipsFollowers, usersUserCountersDto.clipsFollowers) && epx.f(this.videosFollowers, usersUserCountersDto.videosFollowers) && epx.f(this.clipsViews, usersUserCountersDto.clipsViews) && epx.f(this.clipsLikes, usersUserCountersDto.clipsLikes);
    }

    public final int hashCode() {
        Integer num = this.albums;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.badges;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.audios;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.followers;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.friends;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.gifts;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.groups;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.notes;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.onlineFriends;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.pages;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.photos;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.subscriptions;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.userPhotos;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.userVideos;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.videos;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.videoPlaylists;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.newPhotoTags;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.newRecognitionTags;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.mutualFriends;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.friendsFollowers;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.posts;
        int hashCode21 = (hashCode20 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.articles;
        int hashCode22 = (hashCode21 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.wishes;
        int hashCode23 = (hashCode22 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.podcasts;
        int hashCode24 = (hashCode23 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Long l = this.clips;
        int hashCode25 = (hashCode24 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.clipsFollowers;
        int hashCode26 = (hashCode25 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.videosFollowers;
        int hashCode27 = (hashCode26 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.clipsViews;
        int hashCode28 = (hashCode27 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.clipsLikes;
        return hashCode28 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.albums;
        Integer num2 = this.badges;
        Integer num3 = this.audios;
        Integer num4 = this.followers;
        Integer num5 = this.friends;
        Integer num6 = this.gifts;
        Integer num7 = this.groups;
        Integer num8 = this.notes;
        Integer num9 = this.onlineFriends;
        Integer num10 = this.pages;
        Integer num11 = this.photos;
        Integer num12 = this.subscriptions;
        Integer num13 = this.userPhotos;
        Integer num14 = this.userVideos;
        Integer num15 = this.videos;
        Integer num16 = this.videoPlaylists;
        Integer num17 = this.newPhotoTags;
        Integer num18 = this.newRecognitionTags;
        Integer num19 = this.mutualFriends;
        Integer num20 = this.friendsFollowers;
        Integer num21 = this.posts;
        Integer num22 = this.articles;
        Integer num23 = this.wishes;
        Integer num24 = this.podcasts;
        Long l = this.clips;
        Long l2 = this.clipsFollowers;
        Long l3 = this.videosFollowers;
        Long l4 = this.clipsViews;
        Long l5 = this.clipsLikes;
        StringBuilder a = wr.a(num, "UsersUserCountersDto(albums=", num2, ", badges=", ", audios=");
        sq.b(a, num3, ", followers=", num4, ", friends=");
        sq.b(a, num5, ", gifts=", num6, ", groups=");
        sq.b(a, num7, ", notes=", num8, ", onlineFriends=");
        sq.b(a, num9, ", pages=", num10, ", photos=");
        sq.b(a, num11, ", subscriptions=", num12, ", userPhotos=");
        sq.b(a, num13, ", userVideos=", num14, ", videos=");
        sq.b(a, num15, ", videoPlaylists=", num16, ", newPhotoTags=");
        sq.b(a, num17, ", newRecognitionTags=", num18, ", mutualFriends=");
        sq.b(a, num19, ", friendsFollowers=", num20, ", posts=");
        sq.b(a, num21, ", articles=", num22, ", wishes=");
        sq.b(a, num23, ", podcasts=", num24, ", clips=");
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

    public UsersUserCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Long l, Long l2, Long l3, Long l4, Long l5) {
        this.albums = num;
        this.badges = num2;
        this.audios = num3;
        this.followers = num4;
        this.friends = num5;
        this.gifts = num6;
        this.groups = num7;
        this.notes = num8;
        this.onlineFriends = num9;
        this.pages = num10;
        this.photos = num11;
        this.subscriptions = num12;
        this.userPhotos = num13;
        this.userVideos = num14;
        this.videos = num15;
        this.videoPlaylists = num16;
        this.newPhotoTags = num17;
        this.newRecognitionTags = num18;
        this.mutualFriends = num19;
        this.friendsFollowers = num20;
        this.posts = num21;
        this.articles = num22;
        this.wishes = num23;
        this.podcasts = num24;
        this.clips = l;
        this.clipsFollowers = l2;
        this.videosFollowers = l3;
        this.clipsViews = l4;
        this.clipsLikes = l5;
    }

    public /* synthetic */ UsersUserCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Long l, Long l2, Long l3, Long l4, Long l5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15, (i & 32768) != 0 ? null : num16, (i & 65536) != 0 ? null : num17, (i & 131072) != 0 ? null : num18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num19, (i & 524288) != 0 ? null : num20, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num21, (i & 2097152) != 0 ? null : num22, (i & 4194304) != 0 ? null : num23, (i & 8388608) != 0 ? null : num24, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : l, (i & 33554432) != 0 ? null : l2, (i & 67108864) != 0 ? null : l3, (i & 134217728) != 0 ? null : l4, (i & 268435456) != 0 ? null : l5);
    }
}
