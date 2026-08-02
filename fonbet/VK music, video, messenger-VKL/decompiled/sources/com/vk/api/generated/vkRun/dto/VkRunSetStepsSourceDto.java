package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRunSetStepsSourceDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSetStepsSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRunSetStepsSourceDto[] $VALUES;

    @pmi0("app_start")
    public static final VkRunSetStepsSourceDto APP_START;

    @pmi0("background_sync")
    public static final VkRunSetStepsSourceDto BACKGROUND_SYNC;

    @pmi0("bridge_event")
    public static final VkRunSetStepsSourceDto BRIDGE_EVENT;
    public static final Parcelable.Creator<VkRunSetStepsSourceDto> CREATOR;

    @pmi0("notification_event")
    public static final VkRunSetStepsSourceDto NOTIFICATION_EVENT;

    @pmi0("widget_update")
    public static final VkRunSetStepsSourceDto WIDGET_UPDATE;
    private final String value;

    /* compiled from: VkRunSetStepsSourceDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSetStepsSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSetStepsSourceDto createFromParcel(Parcel parcel) {
            return VkRunSetStepsSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSetStepsSourceDto[] newArray(int i) {
            return new VkRunSetStepsSourceDto[i];
        }
    }

    static {
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto = new VkRunSetStepsSourceDto("APP_START", 0, "app_start");
        APP_START = vkRunSetStepsSourceDto;
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto2 = new VkRunSetStepsSourceDto("BACKGROUND_SYNC", 1, "background_sync");
        BACKGROUND_SYNC = vkRunSetStepsSourceDto2;
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto3 = new VkRunSetStepsSourceDto("BRIDGE_EVENT", 2, "bridge_event");
        BRIDGE_EVENT = vkRunSetStepsSourceDto3;
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto4 = new VkRunSetStepsSourceDto("NOTIFICATION_EVENT", 3, "notification_event");
        NOTIFICATION_EVENT = vkRunSetStepsSourceDto4;
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto5 = new VkRunSetStepsSourceDto("WIDGET_UPDATE", 4, "widget_update");
        WIDGET_UPDATE = vkRunSetStepsSourceDto5;
        VkRunSetStepsSourceDto[] vkRunSetStepsSourceDtoArr = {vkRunSetStepsSourceDto, vkRunSetStepsSourceDto2, vkRunSetStepsSourceDto3, vkRunSetStepsSourceDto4, vkRunSetStepsSourceDto5};
        $VALUES = vkRunSetStepsSourceDtoArr;
        $ENTRIES = new asp(vkRunSetStepsSourceDtoArr);
        CREATOR = new a();
    }

    private VkRunSetStepsSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkRunSetStepsSourceDto valueOf(String str) {
        return (VkRunSetStepsSourceDto) Enum.valueOf(VkRunSetStepsSourceDto.class, str);
    }

    public static VkRunSetStepsSourceDto[] values() {
        return (VkRunSetStepsSourceDto[]) $VALUES.clone();
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
