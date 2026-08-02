package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StickersSetPopupSettingsNameDto.kt */
/* loaded from: classes15.dex */
public final class StickersSetPopupSettingsNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StickersSetPopupSettingsNameDto[] $VALUES;

    @pmi0("autoplay_disabled_peer_ids")
    public static final StickersSetPopupSettingsNameDto AUTOPLAY_DISABLED_PEER_IDS;

    @pmi0("autoplay_on_get")
    public static final StickersSetPopupSettingsNameDto AUTOPLAY_ON_GET;

    @pmi0("autoplay_on_send")
    public static final StickersSetPopupSettingsNameDto AUTOPLAY_ON_SEND;
    public static final Parcelable.Creator<StickersSetPopupSettingsNameDto> CREATOR;
    private final String value;

    /* compiled from: StickersSetPopupSettingsNameDto.kt */
    public static final class a implements Parcelable.Creator<StickersSetPopupSettingsNameDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSetPopupSettingsNameDto createFromParcel(Parcel parcel) {
            return StickersSetPopupSettingsNameDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSetPopupSettingsNameDto[] newArray(int i) {
            return new StickersSetPopupSettingsNameDto[i];
        }
    }

    static {
        StickersSetPopupSettingsNameDto stickersSetPopupSettingsNameDto = new StickersSetPopupSettingsNameDto("AUTOPLAY_DISABLED_PEER_IDS", 0, "autoplay_disabled_peer_ids");
        AUTOPLAY_DISABLED_PEER_IDS = stickersSetPopupSettingsNameDto;
        StickersSetPopupSettingsNameDto stickersSetPopupSettingsNameDto2 = new StickersSetPopupSettingsNameDto("AUTOPLAY_ON_GET", 1, "autoplay_on_get");
        AUTOPLAY_ON_GET = stickersSetPopupSettingsNameDto2;
        StickersSetPopupSettingsNameDto stickersSetPopupSettingsNameDto3 = new StickersSetPopupSettingsNameDto("AUTOPLAY_ON_SEND", 2, "autoplay_on_send");
        AUTOPLAY_ON_SEND = stickersSetPopupSettingsNameDto3;
        StickersSetPopupSettingsNameDto[] stickersSetPopupSettingsNameDtoArr = {stickersSetPopupSettingsNameDto, stickersSetPopupSettingsNameDto2, stickersSetPopupSettingsNameDto3};
        $VALUES = stickersSetPopupSettingsNameDtoArr;
        $ENTRIES = new asp(stickersSetPopupSettingsNameDtoArr);
        CREATOR = new a();
    }

    private StickersSetPopupSettingsNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StickersSetPopupSettingsNameDto valueOf(String str) {
        return (StickersSetPopupSettingsNameDto) Enum.valueOf(StickersSetPopupSettingsNameDto.class, str);
    }

    public static StickersSetPopupSettingsNameDto[] values() {
        return (StickersSetPopupSettingsNameDto[]) $VALUES.clone();
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
