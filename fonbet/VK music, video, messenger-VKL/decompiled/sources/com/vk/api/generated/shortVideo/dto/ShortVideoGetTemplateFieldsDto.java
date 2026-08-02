package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetTemplateFieldsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetTemplateFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetTemplateFieldsDto[] $VALUES;

    @pmi0("audios")
    public static final ShortVideoGetTemplateFieldsDto AUDIOS;
    public static final Parcelable.Creator<ShortVideoGetTemplateFieldsDto> CREATOR;
    private final String value;

    /* compiled from: ShortVideoGetTemplateFieldsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetTemplateFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateFieldsDto createFromParcel(Parcel parcel) {
            return ShortVideoGetTemplateFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateFieldsDto[] newArray(int i) {
            return new ShortVideoGetTemplateFieldsDto[i];
        }
    }

    static {
        ShortVideoGetTemplateFieldsDto shortVideoGetTemplateFieldsDto = new ShortVideoGetTemplateFieldsDto("AUDIOS", 0, "audios");
        AUDIOS = shortVideoGetTemplateFieldsDto;
        ShortVideoGetTemplateFieldsDto[] shortVideoGetTemplateFieldsDtoArr = {shortVideoGetTemplateFieldsDto};
        $VALUES = shortVideoGetTemplateFieldsDtoArr;
        $ENTRIES = new asp(shortVideoGetTemplateFieldsDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetTemplateFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetTemplateFieldsDto valueOf(String str) {
        return (ShortVideoGetTemplateFieldsDto) Enum.valueOf(ShortVideoGetTemplateFieldsDto.class, str);
    }

    public static ShortVideoGetTemplateFieldsDto[] values() {
        return (ShortVideoGetTemplateFieldsDto[]) $VALUES.clone();
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
