package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkRunImportSourceDto.kt */
/* loaded from: classes15.dex */
public final class VkRunImportSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkRunImportSourceDto[] $VALUES;

    @pmi0("app_start")
    public static final VkRunImportSourceDto APP_START;

    @pmi0("background_sync")
    public static final VkRunImportSourceDto BACKGROUND_SYNC;

    @pmi0("bridge_event")
    public static final VkRunImportSourceDto BRIDGE_EVENT;
    public static final Parcelable.Creator<VkRunImportSourceDto> CREATOR;

    @pmi0("notification_event")
    public static final VkRunImportSourceDto NOTIFICATION_EVENT;

    @pmi0("widget_update")
    public static final VkRunImportSourceDto WIDGET_UPDATE;
    private final String value;

    /* compiled from: VkRunImportSourceDto.kt */
    public static final class a implements Parcelable.Creator<VkRunImportSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunImportSourceDto createFromParcel(Parcel parcel) {
            return VkRunImportSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunImportSourceDto[] newArray(int i) {
            return new VkRunImportSourceDto[i];
        }
    }

    static {
        VkRunImportSourceDto vkRunImportSourceDto = new VkRunImportSourceDto("APP_START", 0, "app_start");
        APP_START = vkRunImportSourceDto;
        VkRunImportSourceDto vkRunImportSourceDto2 = new VkRunImportSourceDto("BACKGROUND_SYNC", 1, "background_sync");
        BACKGROUND_SYNC = vkRunImportSourceDto2;
        VkRunImportSourceDto vkRunImportSourceDto3 = new VkRunImportSourceDto("BRIDGE_EVENT", 2, "bridge_event");
        BRIDGE_EVENT = vkRunImportSourceDto3;
        VkRunImportSourceDto vkRunImportSourceDto4 = new VkRunImportSourceDto("NOTIFICATION_EVENT", 3, "notification_event");
        NOTIFICATION_EVENT = vkRunImportSourceDto4;
        VkRunImportSourceDto vkRunImportSourceDto5 = new VkRunImportSourceDto("WIDGET_UPDATE", 4, "widget_update");
        WIDGET_UPDATE = vkRunImportSourceDto5;
        VkRunImportSourceDto[] vkRunImportSourceDtoArr = {vkRunImportSourceDto, vkRunImportSourceDto2, vkRunImportSourceDto3, vkRunImportSourceDto4, vkRunImportSourceDto5};
        $VALUES = vkRunImportSourceDtoArr;
        $ENTRIES = new asp(vkRunImportSourceDtoArr);
        CREATOR = new a();
    }

    private VkRunImportSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkRunImportSourceDto valueOf(String str) {
        return (VkRunImportSourceDto) Enum.valueOf(VkRunImportSourceDto.class, str);
    }

    public static VkRunImportSourceDto[] values() {
        return (VkRunImportSourceDto[]) $VALUES.clone();
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
