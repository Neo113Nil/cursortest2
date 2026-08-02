package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDescriptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderOverlayImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTitleDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallWallpostAttachmentCompactDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentCompactDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentCompactDto> CREATOR = new a();

    @pmi0("button")
    private final WallWallpostAttachmentCompactButtonDto button;

    @pmi0("description")
    private final NewsfeedNewsfeedItemHeaderDescriptionDto description;

    @pmi0(C4217a2.e)
    private final Boolean disabled;

    @pmi0("icons")
    private final List<NewsfeedNewsfeedItemHeaderImageDto> icons;

    @pmi0("overlay_image")
    private final NewsfeedNewsfeedItemHeaderOverlayImageDto overlayImage;

    @pmi0("title")
    private final NewsfeedNewsfeedItemHeaderTitleDto title;

    /* compiled from: WallWallpostAttachmentCompactDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentCompactDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentCompactDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            WallWallpostAttachmentCompactButtonDto createFromParcel = parcel.readInt() == 0 ? null : WallWallpostAttachmentCompactButtonDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(NewsfeedNewsfeedItemHeaderImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallWallpostAttachmentCompactDto(createFromParcel, valueOf, arrayList, parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderTitleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDescriptionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedNewsfeedItemHeaderOverlayImageDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentCompactDto[] newArray(int i) {
            return new WallWallpostAttachmentCompactDto[i];
        }
    }

    public WallWallpostAttachmentCompactDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final WallWallpostAttachmentCompactButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderDescriptionDto e() {
        return this.description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentCompactDto)) {
            return false;
        }
        WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto = (WallWallpostAttachmentCompactDto) obj;
        return epx.f(this.button, wallWallpostAttachmentCompactDto.button) && epx.f(this.disabled, wallWallpostAttachmentCompactDto.disabled) && epx.f(this.icons, wallWallpostAttachmentCompactDto.icons) && epx.f(this.title, wallWallpostAttachmentCompactDto.title) && epx.f(this.description, wallWallpostAttachmentCompactDto.description) && epx.f(this.overlayImage, wallWallpostAttachmentCompactDto.overlayImage);
    }

    public final List<NewsfeedNewsfeedItemHeaderImageDto> f() {
        return this.icons;
    }

    public final NewsfeedNewsfeedItemHeaderOverlayImageDto g() {
        return this.overlayImage;
    }

    public final int hashCode() {
        WallWallpostAttachmentCompactButtonDto wallWallpostAttachmentCompactButtonDto = this.button;
        int hashCode = (wallWallpostAttachmentCompactButtonDto == null ? 0 : wallWallpostAttachmentCompactButtonDto.hashCode()) * 31;
        Boolean bool = this.disabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<NewsfeedNewsfeedItemHeaderImageDto> list = this.icons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = this.title;
        int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderTitleDto == null ? 0 : newsfeedNewsfeedItemHeaderTitleDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = this.description;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderDescriptionDto == null ? 0 : newsfeedNewsfeedItemHeaderDescriptionDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = this.overlayImage;
        return hashCode5 + (newsfeedNewsfeedItemHeaderOverlayImageDto != null ? newsfeedNewsfeedItemHeaderOverlayImageDto.hashCode() : 0);
    }

    public final NewsfeedNewsfeedItemHeaderTitleDto i() {
        return this.title;
    }

    public final String toString() {
        return "WallWallpostAttachmentCompactDto(button=" + this.button + ", disabled=" + this.disabled + ", icons=" + this.icons + ", title=" + this.title + ", description=" + this.description + ", overlayImage=" + this.overlayImage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WallWallpostAttachmentCompactButtonDto wallWallpostAttachmentCompactButtonDto = this.button;
        if (wallWallpostAttachmentCompactButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentCompactButtonDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.disabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<NewsfeedNewsfeedItemHeaderImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NewsfeedNewsfeedItemHeaderImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = this.title;
        if (newsfeedNewsfeedItemHeaderTitleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTitleDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = this.description;
        if (newsfeedNewsfeedItemHeaderDescriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderDescriptionDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = this.overlayImage;
        if (newsfeedNewsfeedItemHeaderOverlayImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderOverlayImageDto.writeToParcel(parcel, i);
        }
    }

    public WallWallpostAttachmentCompactDto(WallWallpostAttachmentCompactButtonDto wallWallpostAttachmentCompactButtonDto, Boolean bool, List<NewsfeedNewsfeedItemHeaderImageDto> list, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto) {
        this.button = wallWallpostAttachmentCompactButtonDto;
        this.disabled = bool;
        this.icons = list;
        this.title = newsfeedNewsfeedItemHeaderTitleDto;
        this.description = newsfeedNewsfeedItemHeaderDescriptionDto;
        this.overlayImage = newsfeedNewsfeedItemHeaderOverlayImageDto;
    }

    public /* synthetic */ WallWallpostAttachmentCompactDto(WallWallpostAttachmentCompactButtonDto wallWallpostAttachmentCompactButtonDto, Boolean bool, List list, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : wallWallpostAttachmentCompactButtonDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderTitleDto, (i & 16) != 0 ? null : newsfeedNewsfeedItemHeaderDescriptionDto, (i & 32) != 0 ? null : newsfeedNewsfeedItemHeaderOverlayImageDto);
    }
}
