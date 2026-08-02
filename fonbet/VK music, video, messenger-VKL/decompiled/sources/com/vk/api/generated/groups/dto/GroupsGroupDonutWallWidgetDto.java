package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutWallWidgetDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutWallWidgetDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutWallWidgetDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsGroupDonutWallWidgetDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutWallWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutWallWidgetDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGroupDonutWallWidgetDto(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutWallWidgetDto[] newArray(int i) {
            return new GroupsGroupDonutWallWidgetDto[i];
        }
    }

    public GroupsGroupDonutWallWidgetDto(List<BaseImageDto> list, String str, String str2, BaseLinkButtonDto baseLinkButtonDto) {
        this.image = list;
        this.text = str;
        this.title = str2;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutWallWidgetDto)) {
            return false;
        }
        GroupsGroupDonutWallWidgetDto groupsGroupDonutWallWidgetDto = (GroupsGroupDonutWallWidgetDto) obj;
        return epx.f(this.image, groupsGroupDonutWallWidgetDto.image) && epx.f(this.text, groupsGroupDonutWallWidgetDto.text) && epx.f(this.title, groupsGroupDonutWallWidgetDto.title) && epx.f(this.button, groupsGroupDonutWallWidgetDto.button);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.image.hashCode() * 31, 31, this.text), 31, this.title);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "GroupsGroupDonutWallWidgetDto(image=" + this.image + ", text=" + this.text + ", title=" + this.title + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutWallWidgetDto(List list, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(list, str, str2, (i & 8) != 0 ? null : baseLinkButtonDto);
    }
}
