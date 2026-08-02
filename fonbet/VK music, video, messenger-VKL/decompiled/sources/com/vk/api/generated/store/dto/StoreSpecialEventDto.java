package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreSpecialEventDto.kt */
/* loaded from: classes15.dex */
public final class StoreSpecialEventDto implements Parcelable {
    public static final Parcelable.Creator<StoreSpecialEventDto> CREATOR = new a();

    @pmi0("animation")
    private final StoreSpecialEventAnimationDto animation;

    @pmi0("id")
    private final String id;

    @pmi0("markup")
    private final StoreSpecialEventMarkupDto markup;

    @pmi0("popup")
    private final StoreSpecialEventPopupShortDto popup;

    /* compiled from: StoreSpecialEventDto.kt */
    public static final class a implements Parcelable.Creator<StoreSpecialEventDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventDto createFromParcel(Parcel parcel) {
            return new StoreSpecialEventDto(parcel.readString(), StoreSpecialEventAnimationDto.CREATOR.createFromParcel(parcel), StoreSpecialEventMarkupDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StoreSpecialEventPopupShortDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventDto[] newArray(int i) {
            return new StoreSpecialEventDto[i];
        }
    }

    public StoreSpecialEventDto(String str, StoreSpecialEventAnimationDto storeSpecialEventAnimationDto, StoreSpecialEventMarkupDto storeSpecialEventMarkupDto, StoreSpecialEventPopupShortDto storeSpecialEventPopupShortDto) {
        this.id = str;
        this.animation = storeSpecialEventAnimationDto;
        this.markup = storeSpecialEventMarkupDto;
        this.popup = storeSpecialEventPopupShortDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSpecialEventDto)) {
            return false;
        }
        StoreSpecialEventDto storeSpecialEventDto = (StoreSpecialEventDto) obj;
        return epx.f(this.id, storeSpecialEventDto.id) && epx.f(this.animation, storeSpecialEventDto.animation) && epx.f(this.markup, storeSpecialEventDto.markup) && epx.f(this.popup, storeSpecialEventDto.popup);
    }

    public final int hashCode() {
        int hashCode = (this.markup.hashCode() + ((this.animation.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        StoreSpecialEventPopupShortDto storeSpecialEventPopupShortDto = this.popup;
        return hashCode + (storeSpecialEventPopupShortDto == null ? 0 : storeSpecialEventPopupShortDto.hashCode());
    }

    public final String toString() {
        return "StoreSpecialEventDto(id=" + this.id + ", animation=" + this.animation + ", markup=" + this.markup + ", popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.animation.writeToParcel(parcel, i);
        this.markup.writeToParcel(parcel, i);
        StoreSpecialEventPopupShortDto storeSpecialEventPopupShortDto = this.popup;
        if (storeSpecialEventPopupShortDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeSpecialEventPopupShortDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoreSpecialEventDto(String str, StoreSpecialEventAnimationDto storeSpecialEventAnimationDto, StoreSpecialEventMarkupDto storeSpecialEventMarkupDto, StoreSpecialEventPopupShortDto storeSpecialEventPopupShortDto, int i, zcl zclVar) {
        this(str, storeSpecialEventAnimationDto, storeSpecialEventMarkupDto, (i & 8) != 0 ? null : storeSpecialEventPopupShortDto);
    }
}
