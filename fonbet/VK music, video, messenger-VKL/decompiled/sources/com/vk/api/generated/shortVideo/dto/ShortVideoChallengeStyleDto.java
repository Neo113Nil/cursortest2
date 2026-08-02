package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoChallengeStyleDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeStyleDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeStyleDto> CREATOR = new a();

    @pmi0("header_style")
    private final ShortVideoChallengeStyleHeaderStyleDto headerStyle;

    @pmi0("hide_camera_button")
    private final Boolean hideCameraButton;

    @pmi0("hide_counter")
    private final Boolean hideCounter;

    @pmi0("hide_views")
    private final Boolean hideViews;

    @pmi0("show_names")
    private final Boolean showNames;

    /* compiled from: ShortVideoChallengeStyleDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeStyleDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool = null;
            ShortVideoChallengeStyleHeaderStyleDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoChallengeStyleHeaderStyleDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoChallengeStyleDto(createFromParcel, valueOf, valueOf2, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeStyleDto[] newArray(int i) {
            return new ShortVideoChallengeStyleDto[i];
        }
    }

    public ShortVideoChallengeStyleDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final ShortVideoChallengeStyleHeaderStyleDto d() {
        return this.headerStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hideCameraButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeStyleDto)) {
            return false;
        }
        ShortVideoChallengeStyleDto shortVideoChallengeStyleDto = (ShortVideoChallengeStyleDto) obj;
        return epx.f(this.headerStyle, shortVideoChallengeStyleDto.headerStyle) && epx.f(this.hideCameraButton, shortVideoChallengeStyleDto.hideCameraButton) && epx.f(this.hideCounter, shortVideoChallengeStyleDto.hideCounter) && epx.f(this.hideViews, shortVideoChallengeStyleDto.hideViews) && epx.f(this.showNames, shortVideoChallengeStyleDto.showNames);
    }

    public final Boolean f() {
        return this.hideCounter;
    }

    public final Boolean g() {
        return this.hideViews;
    }

    public final int hashCode() {
        ShortVideoChallengeStyleHeaderStyleDto shortVideoChallengeStyleHeaderStyleDto = this.headerStyle;
        int hashCode = (shortVideoChallengeStyleHeaderStyleDto == null ? 0 : shortVideoChallengeStyleHeaderStyleDto.hashCode()) * 31;
        Boolean bool = this.hideCameraButton;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideCounter;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hideViews;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showNames;
        return hashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.showNames;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChallengeStyleDto(headerStyle=");
        sb.append(this.headerStyle);
        sb.append(", hideCameraButton=");
        sb.append(this.hideCameraButton);
        sb.append(", hideCounter=");
        sb.append(this.hideCounter);
        sb.append(", hideViews=");
        sb.append(this.hideViews);
        sb.append(", showNames=");
        return tn.a(sb, this.showNames, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShortVideoChallengeStyleHeaderStyleDto shortVideoChallengeStyleHeaderStyleDto = this.headerStyle;
        if (shortVideoChallengeStyleHeaderStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeStyleHeaderStyleDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.hideCameraButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hideCounter;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.hideViews;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.showNames;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public ShortVideoChallengeStyleDto(ShortVideoChallengeStyleHeaderStyleDto shortVideoChallengeStyleHeaderStyleDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.headerStyle = shortVideoChallengeStyleHeaderStyleDto;
        this.hideCameraButton = bool;
        this.hideCounter = bool2;
        this.hideViews = bool3;
        this.showNames = bool4;
    }

    public /* synthetic */ ShortVideoChallengeStyleDto(ShortVideoChallengeStyleHeaderStyleDto shortVideoChallengeStyleHeaderStyleDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : shortVideoChallengeStyleHeaderStyleDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4);
    }
}
