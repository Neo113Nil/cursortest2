package com.vk.sdk.api.events.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.groups.dto.GroupsGroupFullMemberStatusDto;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.n6j;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: EventsEventAttachDto.kt */
/* loaded from: classes5.dex */
public final class EventsEventAttachDto {

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("friends")
    private final List<UserId> friends;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("member_status")
    private final GroupsGroupFullMemberStatusDto memberStatus;

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final Integer time;

    public EventsEventAttachDto(String str, List<UserId> list, UserId userId, boolean z, String str2, String str3, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, Integer num) {
        this.buttonText = str;
        this.friends = list;
        this.id = userId;
        this.isFavorite = z;
        this.text = str2;
        this.address = str3;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.time = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventsEventAttachDto)) {
            return false;
        }
        EventsEventAttachDto eventsEventAttachDto = (EventsEventAttachDto) obj;
        return epx.f(this.buttonText, eventsEventAttachDto.buttonText) && epx.f(this.friends, eventsEventAttachDto.friends) && epx.f(this.id, eventsEventAttachDto.id) && this.isFavorite == eventsEventAttachDto.isFavorite && epx.f(this.text, eventsEventAttachDto.text) && epx.f(this.address, eventsEventAttachDto.address) && this.memberStatus == eventsEventAttachDto.memberStatus && epx.f(this.time, eventsEventAttachDto.time);
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(bh10.a(fw3.a(this.buttonText.hashCode() * 31, 31, this.friends), 31, this.id.b), 31, this.isFavorite), 31, this.text);
        String str = this.address;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode2 = (hashCode + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        Integer num = this.time;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.buttonText;
        List<UserId> list = this.friends;
        UserId userId = this.id;
        boolean z = this.isFavorite;
        String str2 = this.text;
        String str3 = this.address;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        Integer num = this.time;
        StringBuilder sb = new StringBuilder("EventsEventAttachDto(buttonText=");
        sb.append(str);
        sb.append(", friends=");
        sb.append(list);
        sb.append(", id=");
        sb.append(userId);
        sb.append(", isFavorite=");
        sb.append(z);
        sb.append(", text=");
        n6j.b(sb, str2, ", address=", str3, ", memberStatus=");
        sb.append(groupsGroupFullMemberStatusDto);
        sb.append(", time=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ EventsEventAttachDto(String str, List list, UserId userId, boolean z, String str2, String str3, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, Integer num, int i, zcl zclVar) {
        this(str, list, userId, z, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : groupsGroupFullMemberStatusDto, (i & 128) != 0 ? null : num);
    }
}
