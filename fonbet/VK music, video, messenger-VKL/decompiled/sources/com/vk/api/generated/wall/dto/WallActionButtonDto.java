package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class WallActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<WallActionButtonDto> CREATOR = new a();

    @pmi0("accessibility_title")
    private final String accessibilityTitle;

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("donut_goal")
    private final WallActionButtonGoalDto donutGoal;

    @pmi0("donut_level")
    private final WallActionButtonLevelDto donutLevel;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final WallActionButtonProgressDto progress;

    @pmi0("subtitle")
    private final NewsfeedNewsfeedItemHeaderTextDto subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final WallActionButtonTypeDto type;

    @pmi0("vk_ticket")
    private final WallActionButtonVkTicketDto vkTicket;

    /* compiled from: WallActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<WallActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final WallActionButtonDto createFromParcel(Parcel parcel) {
            return new WallActionButtonDto(WallActionButtonTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(WallActionButtonDto.class.getClassLoader()), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallActionButtonGoalDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallActionButtonLevelDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallActionButtonProgressDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WallActionButtonVkTicketDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallActionButtonDto[] newArray(int i) {
            return new WallActionButtonDto[i];
        }
    }

    public WallActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallActionButtonProgressDto wallActionButtonProgressDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto, String str2) {
        this.type = wallActionButtonTypeDto;
        this.title = str;
        this.action = baseLinkButtonActionDto;
        this.subtitle = newsfeedNewsfeedItemHeaderTextDto;
        this.donutGoal = wallActionButtonGoalDto;
        this.donutLevel = wallActionButtonLevelDto;
        this.progress = wallActionButtonProgressDto;
        this.vkTicket = wallActionButtonVkTicketDto;
        this.accessibilityTitle = str2;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallActionButtonGoalDto e() {
        return this.donutGoal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallActionButtonDto)) {
            return false;
        }
        WallActionButtonDto wallActionButtonDto = (WallActionButtonDto) obj;
        return this.type == wallActionButtonDto.type && epx.f(this.title, wallActionButtonDto.title) && epx.f(this.action, wallActionButtonDto.action) && epx.f(this.subtitle, wallActionButtonDto.subtitle) && epx.f(this.donutGoal, wallActionButtonDto.donutGoal) && epx.f(this.donutLevel, wallActionButtonDto.donutLevel) && epx.f(this.progress, wallActionButtonDto.progress) && epx.f(this.vkTicket, wallActionButtonDto.vkTicket) && epx.f(this.accessibilityTitle, wallActionButtonDto.accessibilityTitle);
    }

    public final WallActionButtonLevelDto f() {
        return this.donutLevel;
    }

    public final WallActionButtonProgressDto g() {
        return this.progress;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.title)) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.subtitle;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode())) * 31;
        WallActionButtonGoalDto wallActionButtonGoalDto = this.donutGoal;
        int hashCode3 = (hashCode2 + (wallActionButtonGoalDto == null ? 0 : wallActionButtonGoalDto.hashCode())) * 31;
        WallActionButtonLevelDto wallActionButtonLevelDto = this.donutLevel;
        int hashCode4 = (hashCode3 + (wallActionButtonLevelDto == null ? 0 : wallActionButtonLevelDto.hashCode())) * 31;
        WallActionButtonProgressDto wallActionButtonProgressDto = this.progress;
        int hashCode5 = (hashCode4 + (wallActionButtonProgressDto == null ? 0 : wallActionButtonProgressDto.hashCode())) * 31;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = this.vkTicket;
        int hashCode6 = (hashCode5 + (wallActionButtonVkTicketDto == null ? 0 : wallActionButtonVkTicketDto.hashCode())) * 31;
        String str = this.accessibilityTitle;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final NewsfeedNewsfeedItemHeaderTextDto i() {
        return this.subtitle;
    }

    public final WallActionButtonTypeDto j() {
        return this.type;
    }

    public final WallActionButtonVkTicketDto k() {
        return this.vkTicket;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallActionButtonDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", donutGoal=");
        sb.append(this.donutGoal);
        sb.append(", donutLevel=");
        sb.append(this.donutLevel);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", vkTicket=");
        sb.append(this.vkTicket);
        sb.append(", accessibilityTitle=");
        return ho8.a(sb, this.accessibilityTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.subtitle;
        if (newsfeedNewsfeedItemHeaderTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTextDto.writeToParcel(parcel, i);
        }
        WallActionButtonGoalDto wallActionButtonGoalDto = this.donutGoal;
        if (wallActionButtonGoalDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonGoalDto.writeToParcel(parcel, i);
        }
        WallActionButtonLevelDto wallActionButtonLevelDto = this.donutLevel;
        if (wallActionButtonLevelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonLevelDto.writeToParcel(parcel, i);
        }
        WallActionButtonProgressDto wallActionButtonProgressDto = this.progress;
        if (wallActionButtonProgressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonProgressDto.writeToParcel(parcel, i);
        }
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = this.vkTicket;
        if (wallActionButtonVkTicketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonVkTicketDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.accessibilityTitle);
    }

    public /* synthetic */ WallActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallActionButtonProgressDto wallActionButtonProgressDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto, String str2, int i, zcl zclVar) {
        this(wallActionButtonTypeDto, str, baseLinkButtonActionDto, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 16) != 0 ? null : wallActionButtonGoalDto, (i & 32) != 0 ? null : wallActionButtonLevelDto, (i & 64) != 0 ? null : wallActionButtonProgressDto, (i & 128) != 0 ? null : wallActionButtonVkTicketDto, (i & 256) != 0 ? null : str2);
    }
}
