package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AppsMiniAppAttachButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniAppAttachButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniAppAttachButtonDto> CREATOR = new a();

    @pmi0("button_action")
    private final AppsMiniAppAttachButtonActionDto buttonAction;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("state")
    private final StateDto state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsMiniAppAttachButtonDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @pmi0("arrow")
        public static final StateDto ARROW;

        @pmi0("blue")
        public static final StateDto BLUE;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("game")
        public static final StateDto GAME;

        @pmi0("gray")
        public static final StateDto GRAY;

        @pmi0("mini_app")
        public static final StateDto MINI_APP;
        private final String value;

        /* compiled from: AppsMiniAppAttachButtonDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("ARROW", 0, "arrow");
            ARROW = stateDto;
            StateDto stateDto2 = new StateDto("BLUE", 1, "blue");
            BLUE = stateDto2;
            StateDto stateDto3 = new StateDto("GRAY", 2, "gray");
            GRAY = stateDto3;
            StateDto stateDto4 = new StateDto("MINI_APP", 3, "mini_app");
            MINI_APP = stateDto4;
            StateDto stateDto5 = new StateDto("GAME", 4, "game");
            GAME = stateDto5;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3, stateDto4, stateDto5};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
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

    /* compiled from: AppsMiniAppAttachButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniAppAttachButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachButtonDto createFromParcel(Parcel parcel) {
            return new AppsMiniAppAttachButtonDto(parcel.readString(), StateDto.CREATOR.createFromParcel(parcel), AppsMiniAppAttachButtonActionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniAppAttachButtonDto[] newArray(int i) {
            return new AppsMiniAppAttachButtonDto[i];
        }
    }

    public AppsMiniAppAttachButtonDto(String str, StateDto stateDto, AppsMiniAppAttachButtonActionDto appsMiniAppAttachButtonActionDto) {
        this.buttonText = str;
        this.state = stateDto;
        this.buttonAction = appsMiniAppAttachButtonActionDto;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StateDto e() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniAppAttachButtonDto)) {
            return false;
        }
        AppsMiniAppAttachButtonDto appsMiniAppAttachButtonDto = (AppsMiniAppAttachButtonDto) obj;
        return epx.f(this.buttonText, appsMiniAppAttachButtonDto.buttonText) && this.state == appsMiniAppAttachButtonDto.state && epx.f(this.buttonAction, appsMiniAppAttachButtonDto.buttonAction);
    }

    public final int hashCode() {
        return this.buttonAction.hashCode() + ((this.state.hashCode() + (this.buttonText.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AppsMiniAppAttachButtonDto(buttonText=" + this.buttonText + ", state=" + this.state + ", buttonAction=" + this.buttonAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buttonText);
        this.state.writeToParcel(parcel, i);
        this.buttonAction.writeToParcel(parcel, i);
    }
}
