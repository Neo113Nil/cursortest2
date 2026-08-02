package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderDescriptionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderDescriptionDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderDescriptionDto> CREATOR = new a();

    @pmi0("accessibility_text")
    private final String accessibilityText;

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("icon")
    private final NewsfeedNewsfeedItemHeaderImageDto icon;

    @pmi0("is_animable")
    private final Boolean isAnimable;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    @pmi0("tooltip")
    private final NewsfeedNewsfeedItemHeaderTooltipDto tooltip;

    /* compiled from: NewsfeedNewsfeedItemHeaderDescriptionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderDescriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderDescriptionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(NewsfeedNewsfeedItemHeaderDescriptionDto.class.getClassLoader());
            Boolean bool = null;
            NewsfeedNewsfeedItemHeaderTextDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel);
            NewsfeedNewsfeedItemHeaderImageDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderImageDto.CREATOR.createFromParcel(parcel);
            NewsfeedNewsfeedItemHeaderActionDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderActionDto.CREATOR.createFromParcel(parcel);
            NewsfeedNewsfeedItemHeaderTooltipDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderTooltipDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedNewsfeedItemHeaderDescriptionDto(readString, userId, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderDescriptionDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderDescriptionDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderDescriptionDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String d() {
        return this.accessibilityText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderActionDto e() {
        return this.action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderDescriptionDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = (NewsfeedNewsfeedItemHeaderDescriptionDto) obj;
        return epx.f(this.accessibilityText, newsfeedNewsfeedItemHeaderDescriptionDto.accessibilityText) && epx.f(this.sourceId, newsfeedNewsfeedItemHeaderDescriptionDto.sourceId) && epx.f(this.text, newsfeedNewsfeedItemHeaderDescriptionDto.text) && epx.f(this.icon, newsfeedNewsfeedItemHeaderDescriptionDto.icon) && epx.f(this.action, newsfeedNewsfeedItemHeaderDescriptionDto.action) && epx.f(this.tooltip, newsfeedNewsfeedItemHeaderDescriptionDto.tooltip) && epx.f(this.isAnimable, newsfeedNewsfeedItemHeaderDescriptionDto.isAnimable);
    }

    public final NewsfeedNewsfeedItemHeaderImageDto f() {
        return this.icon;
    }

    public final NewsfeedNewsfeedItemHeaderTextDto g() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.accessibilityText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.sourceId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.icon;
        int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderActionDto == null ? 0 : newsfeedNewsfeedItemHeaderActionDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderTooltipDto newsfeedNewsfeedItemHeaderTooltipDto = this.tooltip;
        int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemHeaderTooltipDto == null ? 0 : newsfeedNewsfeedItemHeaderTooltipDto.hashCode())) * 31;
        Boolean bool = this.isAnimable;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final NewsfeedNewsfeedItemHeaderTooltipDto i() {
        return this.tooltip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemHeaderDescriptionDto(accessibilityText=");
        sb.append(this.accessibilityText);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", tooltip=");
        sb.append(this.tooltip);
        sb.append(", isAnimable=");
        return tn.a(sb, this.isAnimable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessibilityText);
        parcel.writeParcelable(this.sourceId, i);
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        if (newsfeedNewsfeedItemHeaderTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTextDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.icon;
        if (newsfeedNewsfeedItemHeaderImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderImageDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        if (newsfeedNewsfeedItemHeaderActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderActionDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderTooltipDto newsfeedNewsfeedItemHeaderTooltipDto = this.tooltip;
        if (newsfeedNewsfeedItemHeaderTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTooltipDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isAnimable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public NewsfeedNewsfeedItemHeaderDescriptionDto(String str, UserId userId, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemHeaderTooltipDto newsfeedNewsfeedItemHeaderTooltipDto, Boolean bool) {
        this.accessibilityText = str;
        this.sourceId = userId;
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.icon = newsfeedNewsfeedItemHeaderImageDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
        this.tooltip = newsfeedNewsfeedItemHeaderTooltipDto;
        this.isAnimable = bool;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderDescriptionDto(String str, UserId userId, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemHeaderTooltipDto newsfeedNewsfeedItemHeaderTooltipDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 16) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto, (i & 32) != 0 ? null : newsfeedNewsfeedItemHeaderTooltipDto, (i & 64) != 0 ? null : bool);
    }
}
