package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsChannelMessagePreviewDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChannelMessagePreviewDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChannelMessagePreviewDto> CREATOR = new a();

    @pmi0("all_media_count")
    private final Integer allMediaCount;

    @pmi0("cmid")
    private final int cmid;

    @pmi0("media_items")
    private final List<GroupsChannelMessagePreviewMediaDto> mediaItems;

    @pmi0("message_url")
    private final String messageUrl;

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final int time;

    /* compiled from: GroupsChannelMessagePreviewDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChannelMessagePreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChannelMessagePreviewDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(GroupsChannelMessagePreviewMediaDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsChannelMessagePreviewDto(readInt, readInt2, readString, readString2, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChannelMessagePreviewDto[] newArray(int i) {
            return new GroupsChannelMessagePreviewDto[i];
        }
    }

    public GroupsChannelMessagePreviewDto(int i, int i2, String str, String str2, Integer num, List<GroupsChannelMessagePreviewMediaDto> list) {
        this.cmid = i;
        this.time = i2;
        this.messageUrl = str;
        this.text = str2;
        this.allMediaCount = num;
        this.mediaItems = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChannelMessagePreviewDto)) {
            return false;
        }
        GroupsChannelMessagePreviewDto groupsChannelMessagePreviewDto = (GroupsChannelMessagePreviewDto) obj;
        return this.cmid == groupsChannelMessagePreviewDto.cmid && this.time == groupsChannelMessagePreviewDto.time && epx.f(this.messageUrl, groupsChannelMessagePreviewDto.messageUrl) && epx.f(this.text, groupsChannelMessagePreviewDto.text) && epx.f(this.allMediaCount, groupsChannelMessagePreviewDto.allMediaCount) && epx.f(this.mediaItems, groupsChannelMessagePreviewDto.mediaItems);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.time, Integer.hashCode(this.cmid) * 31, 31), 31, this.messageUrl);
        String str = this.text;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.allMediaCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<GroupsChannelMessagePreviewMediaDto> list = this.mediaItems;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsChannelMessagePreviewDto(cmid=");
        sb.append(this.cmid);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", messageUrl=");
        sb.append(this.messageUrl);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", allMediaCount=");
        sb.append(this.allMediaCount);
        sb.append(", mediaItems=");
        return ms9.a(')', sb, this.mediaItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cmid);
        parcel.writeInt(this.time);
        parcel.writeString(this.messageUrl);
        parcel.writeString(this.text);
        Integer num = this.allMediaCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<GroupsChannelMessagePreviewMediaDto> list = this.mediaItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsChannelMessagePreviewMediaDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsChannelMessagePreviewDto(int i, int i2, String str, String str2, Integer num, List list, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : list);
    }
}
