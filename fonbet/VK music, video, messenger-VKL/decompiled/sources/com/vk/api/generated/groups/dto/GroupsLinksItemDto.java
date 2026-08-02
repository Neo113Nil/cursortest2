package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsLinksItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsLinksItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsLinksItemDto> CREATOR = new a();

    @pmi0(CampaignEx.JSON_KEY_DESC)
    private final String desc;

    @pmi0("edit_title")
    private final BaseBoolIntDto editTitle;

    @pmi0("id")
    private final Integer id;

    @pmi0("image_processing")
    private final BaseBoolIntDto imageProcessing;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsLinksItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsLinksItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsLinksItemDto createFromParcel(Parcel parcel) {
            return new GroupsLinksItemDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsLinksItemDto[] newArray(int i) {
            return new GroupsLinksItemDto[i];
        }
    }

    public GroupsLinksItemDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLinksItemDto)) {
            return false;
        }
        GroupsLinksItemDto groupsLinksItemDto = (GroupsLinksItemDto) obj;
        return epx.f(this.name, groupsLinksItemDto.name) && epx.f(this.desc, groupsLinksItemDto.desc) && this.editTitle == groupsLinksItemDto.editTitle && epx.f(this.id, groupsLinksItemDto.id) && epx.f(this.photo100, groupsLinksItemDto.photo100) && epx.f(this.photo50, groupsLinksItemDto.photo50) && epx.f(this.photoBase, groupsLinksItemDto.photoBase) && epx.f(this.url, groupsLinksItemDto.url) && this.imageProcessing == groupsLinksItemDto.imageProcessing;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.editTitle;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.id;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoBase;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.imageProcessing;
        return hashCode8 + (baseBoolIntDto2 != null ? baseBoolIntDto2.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsLinksItemDto(name=" + this.name + ", desc=" + this.desc + ", editTitle=" + this.editTitle + ", id=" + this.id + ", photo100=" + this.photo100 + ", photo50=" + this.photo50 + ", photoBase=" + this.photoBase + ", url=" + this.url + ", imageProcessing=" + this.imageProcessing + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        BaseBoolIntDto baseBoolIntDto = this.editTitle;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.url);
        BaseBoolIntDto baseBoolIntDto2 = this.imageProcessing;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
    }

    public GroupsLinksItemDto(String str, String str2, BaseBoolIntDto baseBoolIntDto, Integer num, String str3, String str4, String str5, String str6, BaseBoolIntDto baseBoolIntDto2) {
        this.name = str;
        this.desc = str2;
        this.editTitle = baseBoolIntDto;
        this.id = num;
        this.photo100 = str3;
        this.photo50 = str4;
        this.photoBase = str5;
        this.url = str6;
        this.imageProcessing = baseBoolIntDto2;
    }

    public /* synthetic */ GroupsLinksItemDto(String str, String str2, BaseBoolIntDto baseBoolIntDto, Integer num, String str3, String str4, String str5, String str6, BaseBoolIntDto baseBoolIntDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseBoolIntDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : baseBoolIntDto2);
    }
}
