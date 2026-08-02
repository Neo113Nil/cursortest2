package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AtumVkuiHeaderTitleDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderTitleDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderTitleDto> CREATOR = new a();

    @pmi0("counter")
    private final AtumVkuiCounterDto counter;

    @pmi0("icon")
    private final AtumVkuiLocalImageDto icon;

    @pmi0("number_of_lines")
    private final int numberOfLines;

    @pmi0("text")
    private final String text;

    /* compiled from: AtumVkuiHeaderTitleDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderTitleDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderTitleDto createFromParcel(Parcel parcel) {
            return new AtumVkuiHeaderTitleDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : AtumVkuiCounterDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderTitleDto[] newArray(int i) {
            return new AtumVkuiHeaderTitleDto[i];
        }
    }

    public AtumVkuiHeaderTitleDto(String str, int i, AtumVkuiCounterDto atumVkuiCounterDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
        this.text = str;
        this.numberOfLines = i;
        this.counter = atumVkuiCounterDto;
        this.icon = atumVkuiLocalImageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderTitleDto)) {
            return false;
        }
        AtumVkuiHeaderTitleDto atumVkuiHeaderTitleDto = (AtumVkuiHeaderTitleDto) obj;
        return epx.f(this.text, atumVkuiHeaderTitleDto.text) && this.numberOfLines == atumVkuiHeaderTitleDto.numberOfLines && epx.f(this.counter, atumVkuiHeaderTitleDto.counter) && this.icon == atumVkuiHeaderTitleDto.icon;
    }

    public final int hashCode() {
        int a2 = shy.a(this.numberOfLines, this.text.hashCode() * 31, 31);
        AtumVkuiCounterDto atumVkuiCounterDto = this.counter;
        int hashCode = (a2 + (atumVkuiCounterDto == null ? 0 : atumVkuiCounterDto.hashCode())) * 31;
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.icon;
        return hashCode + (atumVkuiLocalImageDto != null ? atumVkuiLocalImageDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiHeaderTitleDto(text=" + this.text + ", numberOfLines=" + this.numberOfLines + ", counter=" + this.counter + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.numberOfLines);
        AtumVkuiCounterDto atumVkuiCounterDto = this.counter;
        if (atumVkuiCounterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiCounterDto.writeToParcel(parcel, i);
        }
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.icon;
        if (atumVkuiLocalImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLocalImageDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiHeaderTitleDto(String str, int i, AtumVkuiCounterDto atumVkuiCounterDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : atumVkuiCounterDto, (i2 & 8) != 0 ? null : atumVkuiLocalImageDto);
    }
}
