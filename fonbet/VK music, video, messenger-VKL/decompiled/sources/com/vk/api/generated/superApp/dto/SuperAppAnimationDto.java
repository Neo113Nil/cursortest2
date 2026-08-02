package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppAnimationDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppAnimationDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppAnimationDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("id")
    private final String id;

    @pmi0("repeat")
    private final int repeat;

    @pmi0("url")
    private final String url;

    @pmi0("url_dark")
    private final String urlDark;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppAnimationDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("open")
        public static final ActionDto OPEN;

        @pmi0("shake")
        public static final ActionDto SHAKE;
        private final String value;

        /* compiled from: SuperAppAnimationDto.kt */
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
            ActionDto actionDto = new ActionDto("SHAKE", 0, "shake");
            SHAKE = actionDto;
            ActionDto actionDto2 = new ActionDto("OPEN", 1, "open");
            OPEN = actionDto2;
            ActionDto[] actionDtoArr = {actionDto, actionDto2};
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

    /* compiled from: SuperAppAnimationDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppAnimationDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppAnimationDto createFromParcel(Parcel parcel) {
            return new SuperAppAnimationDto(parcel.readString(), parcel.readString(), ActionDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppAnimationDto[] newArray(int i) {
            return new SuperAppAnimationDto[i];
        }
    }

    public SuperAppAnimationDto(String str, String str2, ActionDto actionDto, int i, String str3) {
        this.id = str;
        this.url = str2;
        this.action = actionDto;
        this.repeat = i;
        this.urlDark = str3;
    }

    public final ActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.repeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppAnimationDto)) {
            return false;
        }
        SuperAppAnimationDto superAppAnimationDto = (SuperAppAnimationDto) obj;
        return epx.f(this.id, superAppAnimationDto.id) && epx.f(this.url, superAppAnimationDto.url) && this.action == superAppAnimationDto.action && this.repeat == superAppAnimationDto.repeat && epx.f(this.urlDark, superAppAnimationDto.urlDark);
    }

    public final String f() {
        return this.urlDark;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = shy.a(this.repeat, (this.action.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.url)) * 31, 31);
        String str = this.urlDark;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppAnimationDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", urlDark=");
        return ho8.a(sb, this.urlDark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        this.action.writeToParcel(parcel, i);
        parcel.writeInt(this.repeat);
        parcel.writeString(this.urlDark);
    }

    public /* synthetic */ SuperAppAnimationDto(String str, String str2, ActionDto actionDto, int i, String str3, int i2, zcl zclVar) {
        this(str, str2, actionDto, i, (i2 & 16) != 0 ? null : str3);
    }
}
