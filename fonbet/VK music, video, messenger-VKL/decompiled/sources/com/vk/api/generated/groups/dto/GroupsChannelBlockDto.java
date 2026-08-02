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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsChannelBlockDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChannelBlockDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChannelBlockDto> CREATOR = new a();

    @pmi0("channel_url")
    private final String channelUrl;

    @pmi0("message_previews")
    private final List<GroupsChannelMessagePreviewDto> messagePreviews;

    /* compiled from: GroupsChannelBlockDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChannelBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChannelBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsChannelMessagePreviewDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsChannelBlockDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChannelBlockDto[] newArray(int i) {
            return new GroupsChannelBlockDto[i];
        }
    }

    public GroupsChannelBlockDto(String str, List<GroupsChannelMessagePreviewDto> list) {
        this.channelUrl = str;
        this.messagePreviews = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChannelBlockDto)) {
            return false;
        }
        GroupsChannelBlockDto groupsChannelBlockDto = (GroupsChannelBlockDto) obj;
        return epx.f(this.channelUrl, groupsChannelBlockDto.channelUrl) && epx.f(this.messagePreviews, groupsChannelBlockDto.messagePreviews);
    }

    public final int hashCode() {
        int hashCode = this.channelUrl.hashCode() * 31;
        List<GroupsChannelMessagePreviewDto> list = this.messagePreviews;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsChannelBlockDto(channelUrl=");
        sb.append(this.channelUrl);
        sb.append(", messagePreviews=");
        return ms9.a(')', sb, this.messagePreviews);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.channelUrl);
        List<GroupsChannelMessagePreviewDto> list = this.messagePreviews;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsChannelMessagePreviewDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsChannelBlockDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
