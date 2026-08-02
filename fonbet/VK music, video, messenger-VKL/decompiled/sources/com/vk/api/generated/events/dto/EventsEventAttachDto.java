package com.vk.api.generated.events.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: EventsEventAttachDto.kt */
/* loaded from: classes14.dex */
public final class EventsEventAttachDto implements Parcelable {
    public static final Parcelable.Creator<EventsEventAttachDto> CREATOR = new a();

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

    /* compiled from: EventsEventAttachDto.kt */
    public static final class a implements Parcelable.Creator<EventsEventAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final EventsEventAttachDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(EventsEventAttachDto.class, parcel, arrayList, i, 1);
            }
            return new EventsEventAttachDto(readString, arrayList, (UserId) parcel.readParcelable(EventsEventAttachDto.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (GroupsGroupFullMemberStatusDto) parcel.readParcelable(EventsEventAttachDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final EventsEventAttachDto[] newArray(int i) {
            return new EventsEventAttachDto[i];
        }
    }

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

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.buttonText;
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

    public final List<UserId> f() {
        return this.friends;
    }

    public final UserId g() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(bh10.a(fw3.a(this.buttonText.hashCode() * 31, 31, this.friends), 31, this.id.b), 31, this.isFavorite), 31, this.text);
        String str = this.address;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode2 = (hashCode + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        Integer num = this.time;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final GroupsGroupFullMemberStatusDto i() {
        return this.memberStatus;
    }

    public final String j() {
        return this.text;
    }

    public final Integer k() {
        return this.time;
    }

    public final boolean l() {
        return this.isFavorite;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventsEventAttachDto(buttonText=");
        sb.append(this.buttonText);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", memberStatus=");
        sb.append(this.memberStatus);
        sb.append(", time=");
        return uqi.b(sb, this.time, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buttonText);
        Iterator a2 = ao.a(parcel, this.friends);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.id, i);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.text);
        parcel.writeString(this.address);
        parcel.writeParcelable(this.memberStatus, i);
        Integer num = this.time;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ EventsEventAttachDto(String str, List list, UserId userId, boolean z, String str2, String str3, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, Integer num, int i, zcl zclVar) {
        this(str, list, userId, z, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : groupsGroupFullMemberStatusDto, (i & 128) != 0 ? null : num);
    }
}
