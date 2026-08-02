package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BaseLinkChatGroupDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkChatGroupDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkChatGroupDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("screen_name")
    private final String screenName;

    /* compiled from: BaseLinkChatGroupDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkChatGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkChatGroupDto createFromParcel(Parcel parcel) {
            return new BaseLinkChatGroupDto((UserId) parcel.readParcelable(BaseLinkChatGroupDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkChatGroupDto[] newArray(int i) {
            return new BaseLinkChatGroupDto[i];
        }
    }

    public BaseLinkChatGroupDto(UserId userId, String str, String str2) {
        this.id = userId;
        this.name = str;
        this.screenName = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkChatGroupDto)) {
            return false;
        }
        BaseLinkChatGroupDto baseLinkChatGroupDto = (BaseLinkChatGroupDto) obj;
        return epx.f(this.id, baseLinkChatGroupDto.id) && epx.f(this.name, baseLinkChatGroupDto.name) && epx.f(this.screenName, baseLinkChatGroupDto.screenName);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name);
        String str = this.screenName;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkChatGroupDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", screenName=");
        return ho8.a(sb, this.screenName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.screenName);
    }

    public /* synthetic */ BaseLinkChatGroupDto(UserId userId, String str, String str2, int i, zcl zclVar) {
        this(userId, str, (i & 4) != 0 ? null : str2);
    }
}
