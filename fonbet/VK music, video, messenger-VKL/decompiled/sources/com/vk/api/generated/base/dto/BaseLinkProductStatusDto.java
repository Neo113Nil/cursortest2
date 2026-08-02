package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseLinkProductStatusDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkProductStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseLinkProductStatusDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final BaseLinkProductStatusDto ACTIVE;

    @pmi0("archived")
    public static final BaseLinkProductStatusDto ARCHIVED;

    @pmi0("blocked")
    public static final BaseLinkProductStatusDto BLOCKED;
    public static final Parcelable.Creator<BaseLinkProductStatusDto> CREATOR;

    @pmi0("deleted")
    public static final BaseLinkProductStatusDto DELETED;

    @pmi0("sold")
    public static final BaseLinkProductStatusDto SOLD;
    private final String value;

    /* compiled from: BaseLinkProductStatusDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkProductStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkProductStatusDto createFromParcel(Parcel parcel) {
            return BaseLinkProductStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkProductStatusDto[] newArray(int i) {
            return new BaseLinkProductStatusDto[i];
        }
    }

    static {
        BaseLinkProductStatusDto baseLinkProductStatusDto = new BaseLinkProductStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = baseLinkProductStatusDto;
        BaseLinkProductStatusDto baseLinkProductStatusDto2 = new BaseLinkProductStatusDto("BLOCKED", 1, "blocked");
        BLOCKED = baseLinkProductStatusDto2;
        BaseLinkProductStatusDto baseLinkProductStatusDto3 = new BaseLinkProductStatusDto("SOLD", 2, "sold");
        SOLD = baseLinkProductStatusDto3;
        BaseLinkProductStatusDto baseLinkProductStatusDto4 = new BaseLinkProductStatusDto("DELETED", 3, "deleted");
        DELETED = baseLinkProductStatusDto4;
        BaseLinkProductStatusDto baseLinkProductStatusDto5 = new BaseLinkProductStatusDto("ARCHIVED", 4, "archived");
        ARCHIVED = baseLinkProductStatusDto5;
        BaseLinkProductStatusDto[] baseLinkProductStatusDtoArr = {baseLinkProductStatusDto, baseLinkProductStatusDto2, baseLinkProductStatusDto3, baseLinkProductStatusDto4, baseLinkProductStatusDto5};
        $VALUES = baseLinkProductStatusDtoArr;
        $ENTRIES = new asp(baseLinkProductStatusDtoArr);
        CREATOR = new a();
    }

    private BaseLinkProductStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseLinkProductStatusDto valueOf(String str) {
        return (BaseLinkProductStatusDto) Enum.valueOf(BaseLinkProductStatusDto.class, str);
    }

    public static BaseLinkProductStatusDto[] values() {
        return (BaseLinkProductStatusDto[]) $VALUES.clone();
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
