package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoSetCoOwnerStatusStatusDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSetCoOwnerStatusStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoSetCoOwnerStatusStatusDto[] $VALUES;

    @pmi0("approved")
    public static final ShortVideoSetCoOwnerStatusStatusDto APPROVED;
    public static final Parcelable.Creator<ShortVideoSetCoOwnerStatusStatusDto> CREATOR;

    @pmi0("rejected")
    public static final ShortVideoSetCoOwnerStatusStatusDto REJECTED;
    private final String value;

    /* compiled from: ShortVideoSetCoOwnerStatusStatusDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSetCoOwnerStatusStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetCoOwnerStatusStatusDto createFromParcel(Parcel parcel) {
            return ShortVideoSetCoOwnerStatusStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetCoOwnerStatusStatusDto[] newArray(int i) {
            return new ShortVideoSetCoOwnerStatusStatusDto[i];
        }
    }

    static {
        ShortVideoSetCoOwnerStatusStatusDto shortVideoSetCoOwnerStatusStatusDto = new ShortVideoSetCoOwnerStatusStatusDto("APPROVED", 0, "approved");
        APPROVED = shortVideoSetCoOwnerStatusStatusDto;
        ShortVideoSetCoOwnerStatusStatusDto shortVideoSetCoOwnerStatusStatusDto2 = new ShortVideoSetCoOwnerStatusStatusDto("REJECTED", 1, "rejected");
        REJECTED = shortVideoSetCoOwnerStatusStatusDto2;
        ShortVideoSetCoOwnerStatusStatusDto[] shortVideoSetCoOwnerStatusStatusDtoArr = {shortVideoSetCoOwnerStatusStatusDto, shortVideoSetCoOwnerStatusStatusDto2};
        $VALUES = shortVideoSetCoOwnerStatusStatusDtoArr;
        $ENTRIES = new asp(shortVideoSetCoOwnerStatusStatusDtoArr);
        CREATOR = new a();
    }

    private ShortVideoSetCoOwnerStatusStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoSetCoOwnerStatusStatusDto valueOf(String str) {
        return (ShortVideoSetCoOwnerStatusStatusDto) Enum.valueOf(ShortVideoSetCoOwnerStatusStatusDto.class, str);
    }

    public static ShortVideoSetCoOwnerStatusStatusDto[] values() {
        return (ShortVideoSetCoOwnerStatusStatusDto[]) $VALUES.clone();
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
