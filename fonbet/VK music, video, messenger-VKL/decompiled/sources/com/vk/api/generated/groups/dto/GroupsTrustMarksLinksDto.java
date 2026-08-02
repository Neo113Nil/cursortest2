package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsTrustMarksLinksDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTrustMarksLinksDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTrustMarksLinksDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("links_item")
    private final List<GroupsLinksItemDto> linksItem;

    @pmi0("text")
    private final String text;

    /* compiled from: GroupsTrustMarksLinksDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTrustMarksLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksLinksDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GroupsLinksItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsTrustMarksLinksDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksLinksDto[] newArray(int i) {
            return new GroupsTrustMarksLinksDto[i];
        }
    }

    public GroupsTrustMarksLinksDto(String str, String str2, List<GroupsLinksItemDto> list) {
        this.code = str;
        this.text = str2;
        this.linksItem = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTrustMarksLinksDto)) {
            return false;
        }
        GroupsTrustMarksLinksDto groupsTrustMarksLinksDto = (GroupsTrustMarksLinksDto) obj;
        return epx.f(this.code, groupsTrustMarksLinksDto.code) && epx.f(this.text, groupsTrustMarksLinksDto.text) && epx.f(this.linksItem, groupsTrustMarksLinksDto.linksItem);
    }

    public final int hashCode() {
        return this.linksItem.hashCode() + urd0.a(this.code.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTrustMarksLinksDto(code=");
        sb.append(this.code);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", linksItem=");
        return ms9.a(')', sb, this.linksItem);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.text);
        Iterator a2 = ao.a(parcel, this.linksItem);
        while (a2.hasNext()) {
            ((GroupsLinksItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
