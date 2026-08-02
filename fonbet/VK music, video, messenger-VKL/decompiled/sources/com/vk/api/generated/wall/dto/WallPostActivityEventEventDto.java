package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallPostActivityEventEventDto.kt */
/* loaded from: classes15.dex */
public final class WallPostActivityEventEventDto implements Parcelable {
    public static final Parcelable.Creator<WallPostActivityEventEventDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("friends")
    private final List<UserId> friends;

    @pmi0("member_status")
    private final GroupsGroupFullMemberStatusDto memberStatus;

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final Integer time;

    /* compiled from: WallPostActivityEventEventDto.kt */
    public static final class a implements Parcelable.Creator<WallPostActivityEventEventDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostActivityEventEventDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(WallPostActivityEventEventDto.class, parcel, arrayList, i, 1);
            }
            return new WallPostActivityEventEventDto(readString, arrayList, (GroupsGroupFullMemberStatusDto) parcel.readParcelable(WallPostActivityEventEventDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostActivityEventEventDto[] newArray(int i) {
            return new WallPostActivityEventEventDto[i];
        }
    }

    public WallPostActivityEventEventDto(String str, List<UserId> list, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, String str2, String str3, Integer num) {
        this.buttonText = str;
        this.friends = list;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.text = str2;
        this.address = str3;
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
        if (!(obj instanceof WallPostActivityEventEventDto)) {
            return false;
        }
        WallPostActivityEventEventDto wallPostActivityEventEventDto = (WallPostActivityEventEventDto) obj;
        return epx.f(this.buttonText, wallPostActivityEventEventDto.buttonText) && epx.f(this.friends, wallPostActivityEventEventDto.friends) && this.memberStatus == wallPostActivityEventEventDto.memberStatus && epx.f(this.text, wallPostActivityEventEventDto.text) && epx.f(this.address, wallPostActivityEventEventDto.address) && epx.f(this.time, wallPostActivityEventEventDto.time);
    }

    public final List<UserId> f() {
        return this.friends;
    }

    public final GroupsGroupFullMemberStatusDto g() {
        return this.memberStatus;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.memberStatus.hashCode() + fw3.a(this.buttonText.hashCode() * 31, 31, this.friends)) * 31, 31, this.text);
        String str = this.address;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.time;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final Integer j() {
        return this.time;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostActivityEventEventDto(buttonText=");
        sb.append(this.buttonText);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", memberStatus=");
        sb.append(this.memberStatus);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", address=");
        sb.append(this.address);
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
        parcel.writeParcelable(this.memberStatus, i);
        parcel.writeString(this.text);
        parcel.writeString(this.address);
        Integer num = this.time;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ WallPostActivityEventEventDto(String str, List list, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, String str2, String str3, Integer num, int i, zcl zclVar) {
        this(str, list, groupsGroupFullMemberStatusDto, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num);
    }
}
