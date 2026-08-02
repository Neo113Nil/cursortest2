package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoRestrictionButtonDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoRestrictionButtonDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoRestrictionButtonDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoRestrictionButtonDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("play")
        public static final ActionDto PLAY;
        private final String value;

        /* compiled from: ShortVideoShortVideoRestrictionButtonDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("PLAY", 0, "play");
            PLAY = actionDto;
            ActionDto[] actionDtoArr = {actionDto};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ShortVideoShortVideoRestrictionButtonDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoRestrictionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoRestrictionButtonDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoRestrictionButtonDto(ActionDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoRestrictionButtonDto[] newArray(int i) {
            return new ShortVideoShortVideoRestrictionButtonDto[i];
        }
    }

    public ShortVideoShortVideoRestrictionButtonDto(ActionDto actionDto, String str) {
        this.action = actionDto;
        this.title = str;
    }

    public final ActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoRestrictionButtonDto)) {
            return false;
        }
        ShortVideoShortVideoRestrictionButtonDto shortVideoShortVideoRestrictionButtonDto = (ShortVideoShortVideoRestrictionButtonDto) obj;
        return this.action == shortVideoShortVideoRestrictionButtonDto.action && epx.f(this.title, shortVideoShortVideoRestrictionButtonDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoRestrictionButtonDto(action=");
        sb.append(this.action);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.title);
    }

    public /* synthetic */ ShortVideoShortVideoRestrictionButtonDto(ActionDto actionDto, String str, int i, zcl zclVar) {
        this(actionDto, (i & 2) != 0 ? null : str);
    }
}
