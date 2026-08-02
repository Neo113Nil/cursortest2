package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallActionButtonVkTicketDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonVkTicketDto implements Parcelable {
    public static final Parcelable.Creator<WallActionButtonVkTicketDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("seance")
    private final WallActionButtonVkTicketSeanceDto seance;

    @pmi0("title")
    private final String title;

    /* compiled from: WallActionButtonVkTicketDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonVkTicketDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonVkTicketDto createFromParcel(Parcel parcel) {
            return new WallActionButtonVkTicketDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WallActionButtonVkTicketSeanceDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonVkTicketDto[] newArray(int i) {
            return new WallActionButtonVkTicketDto[i];
        }
    }

    public WallActionButtonVkTicketDto() {
        this(null, null, null, 7, null);
    }

    public final WallActionButtonVkTicketSeanceDto d() {
        return this.seance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallActionButtonVkTicketDto)) {
            return false;
        }
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = (WallActionButtonVkTicketDto) obj;
        return epx.f(this.id, wallActionButtonVkTicketDto.id) && epx.f(this.title, wallActionButtonVkTicketDto.title) && epx.f(this.seance, wallActionButtonVkTicketDto.seance);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = this.seance;
        return hashCode2 + (wallActionButtonVkTicketSeanceDto != null ? wallActionButtonVkTicketSeanceDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallActionButtonVkTicketDto(id=" + this.id + ", title=" + this.title + ", seance=" + this.seance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = this.seance;
        if (wallActionButtonVkTicketSeanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonVkTicketSeanceDto.writeToParcel(parcel, i);
        }
    }

    public WallActionButtonVkTicketDto(String str, String str2, WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto) {
        this.id = str;
        this.title = str2;
        this.seance = wallActionButtonVkTicketSeanceDto;
    }

    public /* synthetic */ WallActionButtonVkTicketDto(String str, String str2, WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wallActionButtonVkTicketSeanceDto);
    }
}
