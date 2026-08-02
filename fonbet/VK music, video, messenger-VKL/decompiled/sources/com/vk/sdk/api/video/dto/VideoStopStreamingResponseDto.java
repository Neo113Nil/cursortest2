package com.vk.sdk.api.video.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoStopStreamingResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoStopStreamingResponseDto {

    @pmi0("balance")
    private final Integer balance;

    @pmi0("can_create_story")
    private final BasePropertyExistsDto canCreateStory;

    @pmi0("donators")
    private final List<VideoLiveTopDonatorItemDto> donators;

    @pmi0("friends_viewers")
    private final List<UsersUserFullDto> friendsViewers;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("unique_viewers")
    private final Integer uniqueViewers;

    @pmi0("url")
    private final String url;

    public VideoStopStreamingResponseDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStopStreamingResponseDto)) {
            return false;
        }
        VideoStopStreamingResponseDto videoStopStreamingResponseDto = (VideoStopStreamingResponseDto) obj;
        return epx.f(this.balance, videoStopStreamingResponseDto.balance) && epx.f(this.donators, videoStopStreamingResponseDto.donators) && epx.f(this.uniqueViewers, videoStopStreamingResponseDto.uniqueViewers) && epx.f(this.friendsViewers, videoStopStreamingResponseDto.friendsViewers) && this.canCreateStory == videoStopStreamingResponseDto.canCreateStory && epx.f(this.url, videoStopStreamingResponseDto.url) && epx.f(this.profiles, videoStopStreamingResponseDto.profiles) && epx.f(this.groups, videoStopStreamingResponseDto.groups);
    }

    public final int hashCode() {
        Integer num = this.balance;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VideoLiveTopDonatorItemDto> list = this.donators;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.uniqueViewers;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.friendsViewers;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.canCreateStory;
        int hashCode5 = (hashCode4 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.url;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        return hashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.balance;
        List<VideoLiveTopDonatorItemDto> list = this.donators;
        Integer num2 = this.uniqueViewers;
        List<UsersUserFullDto> list2 = this.friendsViewers;
        BasePropertyExistsDto basePropertyExistsDto = this.canCreateStory;
        String str = this.url;
        List<UsersUserFullDto> list3 = this.profiles;
        List<GroupsGroupFullDto> list4 = this.groups;
        StringBuilder sb = new StringBuilder("VideoStopStreamingResponseDto(balance=");
        sb.append(num);
        sb.append(", donators=");
        sb.append(list);
        sb.append(", uniqueViewers=");
        sb.append(num2);
        sb.append(", friendsViewers=");
        sb.append(list2);
        sb.append(", canCreateStory=");
        sb.append(basePropertyExistsDto);
        sb.append(", url=");
        sb.append(str);
        sb.append(", profiles=");
        return n.b(sb, list3, ", groups=", list4, ")");
    }

    public VideoStopStreamingResponseDto(Integer num, List<VideoLiveTopDonatorItemDto> list, Integer num2, List<UsersUserFullDto> list2, BasePropertyExistsDto basePropertyExistsDto, String str, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4) {
        this.balance = num;
        this.donators = list;
        this.uniqueViewers = num2;
        this.friendsViewers = list2;
        this.canCreateStory = basePropertyExistsDto;
        this.url = str;
        this.profiles = list3;
        this.groups = list4;
    }

    public /* synthetic */ VideoStopStreamingResponseDto(Integer num, List list, Integer num2, List list2, BasePropertyExistsDto basePropertyExistsDto, String str, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : basePropertyExistsDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4);
    }
}
