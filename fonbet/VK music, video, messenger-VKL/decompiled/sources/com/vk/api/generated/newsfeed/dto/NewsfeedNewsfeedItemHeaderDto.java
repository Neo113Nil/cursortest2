package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderDto> CREATOR = new a();

    @pmi0("badge")
    private final NewsfeedNewsfeedItemHeaderBadgeDto badge;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final NewsfeedNewsfeedItemHeaderDescriptionDto description;

    @pmi0("descriptions")
    private final List<NewsfeedNewsfeedItemHeaderDescriptionDto> descriptions;

    @pmi0("icon")
    private final NewsfeedNewsfeedItemHeaderIconDto icon;

    @pmi0("overlay_image")
    private final NewsfeedNewsfeedItemHeaderOverlayImageDto overlayImage;

    @pmi0("photo")
    private final NewsfeedNewsfeedItemHeaderImageDto photo;

    @pmi0("title")
    private final NewsfeedNewsfeedItemHeaderTitleDto title;

    @pmi0("warning")
    private final String warning;

    /* compiled from: NewsfeedNewsfeedItemHeaderDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderDto.class.getClassLoader());
            NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = (NewsfeedNewsfeedItemHeaderTitleDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderDto.class.getClassLoader());
            NewsfeedNewsfeedItemHeaderBadgeDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderBadgeDto.CREATOR.createFromParcel(parcel);
            NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = (NewsfeedNewsfeedItemHeaderDescriptionDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedNewsfeedItemHeaderDto.class, parcel, arrayList, i, 1);
                }
            }
            return new NewsfeedNewsfeedItemHeaderDto(newsfeedNewsfeedItemHeaderImageDto, newsfeedNewsfeedItemHeaderTitleDto, createFromParcel, newsfeedNewsfeedItemHeaderDescriptionDto, arrayList, parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (NewsfeedNewsfeedItemHeaderOverlayImageDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final NewsfeedNewsfeedItemHeaderBadgeDto d() {
        return this.badge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = (NewsfeedNewsfeedItemHeaderDto) obj;
        return epx.f(this.photo, newsfeedNewsfeedItemHeaderDto.photo) && epx.f(this.title, newsfeedNewsfeedItemHeaderDto.title) && epx.f(this.badge, newsfeedNewsfeedItemHeaderDto.badge) && epx.f(this.description, newsfeedNewsfeedItemHeaderDto.description) && epx.f(this.descriptions, newsfeedNewsfeedItemHeaderDto.descriptions) && epx.f(this.icon, newsfeedNewsfeedItemHeaderDto.icon) && epx.f(this.warning, newsfeedNewsfeedItemHeaderDto.warning) && epx.f(this.date, newsfeedNewsfeedItemHeaderDto.date) && epx.f(this.overlayImage, newsfeedNewsfeedItemHeaderDto.overlayImage);
    }

    public final List<NewsfeedNewsfeedItemHeaderDescriptionDto> f() {
        return this.descriptions;
    }

    public final NewsfeedNewsfeedItemHeaderIconDto g() {
        return this.icon;
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.photo;
        int hashCode = (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = this.title;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderTitleDto == null ? 0 : newsfeedNewsfeedItemHeaderTitleDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = this.badge;
        int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderBadgeDto == null ? 0 : newsfeedNewsfeedItemHeaderBadgeDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = this.description;
        int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderDescriptionDto == null ? 0 : newsfeedNewsfeedItemHeaderDescriptionDto.hashCode())) * 31;
        List<NewsfeedNewsfeedItemHeaderDescriptionDto> list = this.descriptions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderIconDto newsfeedNewsfeedItemHeaderIconDto = this.icon;
        int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemHeaderIconDto == null ? 0 : newsfeedNewsfeedItemHeaderIconDto.hashCode())) * 31;
        String str = this.warning;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.date;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = this.overlayImage;
        return hashCode8 + (newsfeedNewsfeedItemHeaderOverlayImageDto != null ? newsfeedNewsfeedItemHeaderOverlayImageDto.hashCode() : 0);
    }

    public final NewsfeedNewsfeedItemHeaderOverlayImageDto i() {
        return this.overlayImage;
    }

    public final NewsfeedNewsfeedItemHeaderImageDto j() {
        return this.photo;
    }

    public final NewsfeedNewsfeedItemHeaderTitleDto k() {
        return this.title;
    }

    public final String l() {
        return this.warning;
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderDto(photo=" + this.photo + ", title=" + this.title + ", badge=" + this.badge + ", description=" + this.description + ", descriptions=" + this.descriptions + ", icon=" + this.icon + ", warning=" + this.warning + ", date=" + this.date + ", overlayImage=" + this.overlayImage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.title, i);
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = this.badge;
        if (newsfeedNewsfeedItemHeaderBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderBadgeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.description, i);
        List<NewsfeedNewsfeedItemHeaderDescriptionDto> list = this.descriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        NewsfeedNewsfeedItemHeaderIconDto newsfeedNewsfeedItemHeaderIconDto = this.icon;
        if (newsfeedNewsfeedItemHeaderIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderIconDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.warning);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.overlayImage, i);
    }

    public NewsfeedNewsfeedItemHeaderDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, List<NewsfeedNewsfeedItemHeaderDescriptionDto> list, NewsfeedNewsfeedItemHeaderIconDto newsfeedNewsfeedItemHeaderIconDto, String str, Integer num, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto) {
        this.photo = newsfeedNewsfeedItemHeaderImageDto;
        this.title = newsfeedNewsfeedItemHeaderTitleDto;
        this.badge = newsfeedNewsfeedItemHeaderBadgeDto;
        this.description = newsfeedNewsfeedItemHeaderDescriptionDto;
        this.descriptions = list;
        this.icon = newsfeedNewsfeedItemHeaderIconDto;
        this.warning = str;
        this.date = num;
        this.overlayImage = newsfeedNewsfeedItemHeaderOverlayImageDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, List list, NewsfeedNewsfeedItemHeaderIconDto newsfeedNewsfeedItemHeaderIconDto, String str, Integer num, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderTitleDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemHeaderBadgeDto, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderDescriptionDto, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : newsfeedNewsfeedItemHeaderIconDto, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : newsfeedNewsfeedItemHeaderOverlayImageDto);
    }
}
