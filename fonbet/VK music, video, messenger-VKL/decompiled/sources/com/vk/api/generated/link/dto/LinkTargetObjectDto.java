package com.vk.api.generated.link.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: LinkTargetObjectDto.kt */
/* loaded from: classes14.dex */
public final class LinkTargetObjectDto implements Parcelable {
    public static final Parcelable.Creator<LinkTargetObjectDto> CREATOR = new a();

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("type")
    private final String type;

    /* compiled from: LinkTargetObjectDto.kt */
    public static final class a implements Parcelable.Creator<LinkTargetObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final LinkTargetObjectDto createFromParcel(Parcel parcel) {
            return new LinkTargetObjectDto(parcel.readString(), (UserId) parcel.readParcelable(LinkTargetObjectDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkTargetObjectDto[] newArray(int i) {
            return new LinkTargetObjectDto[i];
        }
    }

    public LinkTargetObjectDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkTargetObjectDto)) {
            return false;
        }
        LinkTargetObjectDto linkTargetObjectDto = (LinkTargetObjectDto) obj;
        return epx.f(this.type, linkTargetObjectDto.type) && epx.f(this.ownerId, linkTargetObjectDto.ownerId) && epx.f(this.itemId, linkTargetObjectDto.itemId);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.itemId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkTargetObjectDto(type=");
        sb.append(this.type);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemId=");
        return uqi.b(sb, this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.ownerId, i);
        Integer num = this.itemId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public LinkTargetObjectDto(String str, UserId userId, Integer num) {
        this.type = str;
        this.ownerId = userId;
        this.itemId = num;
    }

    public /* synthetic */ LinkTargetObjectDto(String str, UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
