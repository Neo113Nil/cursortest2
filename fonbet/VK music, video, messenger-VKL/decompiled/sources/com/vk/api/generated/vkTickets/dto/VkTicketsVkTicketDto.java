package com.vk.api.generated.vkTickets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkTicketsVkTicketDto.kt */
/* loaded from: classes15.dex */
public final class VkTicketsVkTicketDto implements Parcelable {
    public static final Parcelable.Creator<VkTicketsVkTicketDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final BaseImageDto image;

    @pmi0("seance")
    private final VkTicketsVkTicketSeanceDto seance;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: VkTicketsVkTicketDto.kt */
    public static final class a implements Parcelable.Creator<VkTicketsVkTicketDto> {
        @Override // android.os.Parcelable.Creator
        public final VkTicketsVkTicketDto createFromParcel(Parcel parcel) {
            return new VkTicketsVkTicketDto(BaseImageDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VkTicketsVkTicketSeanceDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkTicketsVkTicketDto[] newArray(int i) {
            return new VkTicketsVkTicketDto[i];
        }
    }

    public VkTicketsVkTicketDto(BaseImageDto baseImageDto, String str, String str2, String str3, VkTicketsVkTicketSeanceDto vkTicketsVkTicketSeanceDto) {
        this.image = baseImageDto;
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.seance = vkTicketsVkTicketSeanceDto;
    }

    public final BaseImageDto d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VkTicketsVkTicketSeanceDto e() {
        return this.seance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkTicketsVkTicketDto)) {
            return false;
        }
        VkTicketsVkTicketDto vkTicketsVkTicketDto = (VkTicketsVkTicketDto) obj;
        return epx.f(this.image, vkTicketsVkTicketDto.image) && epx.f(this.id, vkTicketsVkTicketDto.id) && epx.f(this.url, vkTicketsVkTicketDto.url) && epx.f(this.title, vkTicketsVkTicketDto.title) && epx.f(this.seance, vkTicketsVkTicketDto.seance);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VkTicketsVkTicketSeanceDto vkTicketsVkTicketSeanceDto = this.seance;
        return hashCode4 + (vkTicketsVkTicketSeanceDto != null ? vkTicketsVkTicketSeanceDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkTicketsVkTicketDto(image=" + this.image + ", id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", seance=" + this.seance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        VkTicketsVkTicketSeanceDto vkTicketsVkTicketSeanceDto = this.seance;
        if (vkTicketsVkTicketSeanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkTicketsVkTicketSeanceDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkTicketsVkTicketDto(BaseImageDto baseImageDto, String str, String str2, String str3, VkTicketsVkTicketSeanceDto vkTicketsVkTicketSeanceDto, int i, zcl zclVar) {
        this(baseImageDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : vkTicketsVkTicketSeanceDto);
    }
}
