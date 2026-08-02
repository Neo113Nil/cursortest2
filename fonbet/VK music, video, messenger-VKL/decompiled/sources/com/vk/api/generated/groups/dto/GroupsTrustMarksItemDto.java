package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsTrustMarksItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTrustMarksItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTrustMarksItemDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    private final String desc;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsTrustMarksItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTrustMarksItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksItemDto createFromParcel(Parcel parcel) {
            return new GroupsTrustMarksItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksItemDto[] newArray(int i) {
            return new GroupsTrustMarksItemDto[i];
        }
    }

    public GroupsTrustMarksItemDto(String str, String str2, String str3, String str4) {
        this.code = str;
        this.title = str2;
        this.text = str3;
        this.desc = str4;
    }

    public final String d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTrustMarksItemDto)) {
            return false;
        }
        GroupsTrustMarksItemDto groupsTrustMarksItemDto = (GroupsTrustMarksItemDto) obj;
        return epx.f(this.code, groupsTrustMarksItemDto.code) && epx.f(this.title, groupsTrustMarksItemDto.title) && epx.f(this.text, groupsTrustMarksItemDto.text) && epx.f(this.desc, groupsTrustMarksItemDto.desc);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTrustMarksItemDto(code=");
        sb.append(this.code);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", desc=");
        return ho8.a(sb, this.desc, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.desc);
    }

    public /* synthetic */ GroupsTrustMarksItemDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
