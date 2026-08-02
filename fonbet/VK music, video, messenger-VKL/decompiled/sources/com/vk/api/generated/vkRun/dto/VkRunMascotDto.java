package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunMascotDto.kt */
/* loaded from: classes15.dex */
public final class VkRunMascotDto implements Parcelable {
    public static final Parcelable.Creator<VkRunMascotDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final VkRunImageUrlsDto image;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunMascotDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("open_stats")
        public static final ActionDto OPEN_STATS;
        private final String value;

        /* compiled from: VkRunMascotDto.kt */
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
            ActionDto actionDto = new ActionDto("OPEN_STATS", 0, "open_stats");
            OPEN_STATS = actionDto;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VkRunMascotDto.kt */
    public static final class a implements Parcelable.Creator<VkRunMascotDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunMascotDto createFromParcel(Parcel parcel) {
            return new VkRunMascotDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VkRunImageUrlsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunMascotDto[] newArray(int i) {
            return new VkRunMascotDto[i];
        }
    }

    public VkRunMascotDto(String str, String str2, String str3, ActionDto actionDto, VkRunImageUrlsDto vkRunImageUrlsDto) {
        this.id = str;
        this.type = str2;
        this.text = str3;
        this.action = actionDto;
        this.image = vkRunImageUrlsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunMascotDto)) {
            return false;
        }
        VkRunMascotDto vkRunMascotDto = (VkRunMascotDto) obj;
        return epx.f(this.id, vkRunMascotDto.id) && epx.f(this.type, vkRunMascotDto.type) && epx.f(this.text, vkRunMascotDto.text) && this.action == vkRunMascotDto.action && epx.f(this.image, vkRunMascotDto.image);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.type), 31, this.text);
        ActionDto actionDto = this.action;
        int hashCode = (a2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        return hashCode + (vkRunImageUrlsDto != null ? vkRunImageUrlsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunMascotDto(id=" + this.id + ", type=" + this.type + ", text=" + this.text + ", action=" + this.action + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.text);
        ActionDto actionDto = this.action;
        if (actionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDto.writeToParcel(parcel, i);
        }
        VkRunImageUrlsDto vkRunImageUrlsDto = this.image;
        if (vkRunImageUrlsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunImageUrlsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunMascotDto(String str, String str2, String str3, ActionDto actionDto, VkRunImageUrlsDto vkRunImageUrlsDto, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : actionDto, (i & 16) != 0 ? null : vkRunImageUrlsDto);
    }
}
