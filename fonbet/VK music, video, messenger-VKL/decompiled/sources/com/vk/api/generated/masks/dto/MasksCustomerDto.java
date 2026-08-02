package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MasksCustomerDto.kt */
/* loaded from: classes15.dex */
public final class MasksCustomerDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MasksCustomerDto[] $VALUES;

    @pmi0("ad")
    public static final MasksCustomerDto AD;

    @pmi0("author")
    public static final MasksCustomerDto AUTHOR;
    public static final Parcelable.Creator<MasksCustomerDto> CREATOR;

    @pmi0("partner")
    public static final MasksCustomerDto PARTNER;

    @pmi0("unknown")
    public static final MasksCustomerDto UNKNOWN;

    @pmi0("vk")
    public static final MasksCustomerDto VK;
    private final String value;

    /* compiled from: MasksCustomerDto.kt */
    public static final class a implements Parcelable.Creator<MasksCustomerDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCustomerDto createFromParcel(Parcel parcel) {
            return MasksCustomerDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCustomerDto[] newArray(int i) {
            return new MasksCustomerDto[i];
        }
    }

    static {
        MasksCustomerDto masksCustomerDto = new MasksCustomerDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
        UNKNOWN = masksCustomerDto;
        MasksCustomerDto masksCustomerDto2 = new MasksCustomerDto("VK", 1, "vk");
        VK = masksCustomerDto2;
        MasksCustomerDto masksCustomerDto3 = new MasksCustomerDto("PARTNER", 2, "partner");
        PARTNER = masksCustomerDto3;
        MasksCustomerDto masksCustomerDto4 = new MasksCustomerDto("AD", 3, "ad");
        AD = masksCustomerDto4;
        MasksCustomerDto masksCustomerDto5 = new MasksCustomerDto("AUTHOR", 4, "author");
        AUTHOR = masksCustomerDto5;
        MasksCustomerDto[] masksCustomerDtoArr = {masksCustomerDto, masksCustomerDto2, masksCustomerDto3, masksCustomerDto4, masksCustomerDto5};
        $VALUES = masksCustomerDtoArr;
        $ENTRIES = new asp(masksCustomerDtoArr);
        CREATOR = new a();
    }

    private MasksCustomerDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MasksCustomerDto valueOf(String str) {
        return (MasksCustomerDto) Enum.valueOf(MasksCustomerDto.class, str);
    }

    public static MasksCustomerDto[] values() {
        return (MasksCustomerDto[]) $VALUES.clone();
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
