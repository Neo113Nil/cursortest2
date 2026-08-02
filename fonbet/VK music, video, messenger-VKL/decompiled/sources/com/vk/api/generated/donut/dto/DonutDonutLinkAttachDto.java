package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DonutDonutLinkAttachDto.kt */
/* loaded from: classes14.dex */
public final class DonutDonutLinkAttachDto implements Parcelable {
    public static final Parcelable.Creator<DonutDonutLinkAttachDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("donors")
    private final DonutAttachDonatorsInfoDto donors;

    @pmi0("min_price")
    private final Integer minPrice;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("text")
    private final String text;

    /* compiled from: DonutDonutLinkAttachDto.kt */
    public static final class a implements Parcelable.Creator<DonutDonutLinkAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutDonutLinkAttachDto createFromParcel(Parcel parcel) {
            return new DonutDonutLinkAttachDto((UserId) parcel.readParcelable(DonutDonutLinkAttachDto.class.getClassLoader()), parcel.readString(), DonutAttachDonatorsInfoDto.CREATOR.createFromParcel(parcel), (BaseLinkButtonDto) parcel.readParcelable(DonutDonutLinkAttachDto.class.getClassLoader()), (BaseLinkButtonActionDto) parcel.readParcelable(DonutDonutLinkAttachDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutDonutLinkAttachDto[] newArray(int i) {
            return new DonutDonutLinkAttachDto[i];
        }
    }

    public DonutDonutLinkAttachDto(UserId userId, String str, DonutAttachDonatorsInfoDto donutAttachDonatorsInfoDto, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonActionDto baseLinkButtonActionDto, Integer num) {
        this.ownerId = userId;
        this.text = str;
        this.donors = donutAttachDonatorsInfoDto;
        this.button = baseLinkButtonDto;
        this.action = baseLinkButtonActionDto;
        this.minPrice = num;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutDonutLinkAttachDto)) {
            return false;
        }
        DonutDonutLinkAttachDto donutDonutLinkAttachDto = (DonutDonutLinkAttachDto) obj;
        return epx.f(this.ownerId, donutDonutLinkAttachDto.ownerId) && epx.f(this.text, donutDonutLinkAttachDto.text) && epx.f(this.donors, donutDonutLinkAttachDto.donors) && epx.f(this.button, donutDonutLinkAttachDto.button) && epx.f(this.action, donutDonutLinkAttachDto.action) && epx.f(this.minPrice, donutDonutLinkAttachDto.minPrice);
    }

    public final DonutAttachDonatorsInfoDto f() {
        return this.donors;
    }

    public final String g() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + ((this.donors.hashCode() + urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.text)) * 31)) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode2 = (hashCode + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        Integer num = this.minPrice;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutDonutLinkAttachDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", donors=");
        sb.append(this.donors);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", minPrice=");
        return uqi.b(sb, this.minPrice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.text);
        this.donors.writeToParcel(parcel, i);
        parcel.writeParcelable(this.button, i);
        parcel.writeParcelable(this.action, i);
        Integer num = this.minPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ DonutDonutLinkAttachDto(UserId userId, String str, DonutAttachDonatorsInfoDto donutAttachDonatorsInfoDto, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonActionDto baseLinkButtonActionDto, Integer num, int i, zcl zclVar) {
        this(userId, str, donutAttachDonatorsInfoDto, baseLinkButtonDto, (i & 16) != 0 ? null : baseLinkButtonActionDto, (i & 32) != 0 ? null : num);
    }
}
