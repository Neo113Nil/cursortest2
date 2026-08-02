package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoInterClipBlockTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInterClipBlockTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoInterClipBlockTypeDto[] $VALUES;

    @pmi0("audio_templates")
    public static final ShortVideoInterClipBlockTypeDto AUDIO_TEMPLATES;
    public static final Parcelable.Creator<ShortVideoInterClipBlockTypeDto> CREATOR;

    @pmi0("popular_authors")
    public static final ShortVideoInterClipBlockTypeDto POPULAR_AUTHORS;
    private final String value;

    /* compiled from: ShortVideoInterClipBlockTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInterClipBlockTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoInterClipBlockTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockTypeDto[] newArray(int i) {
            return new ShortVideoInterClipBlockTypeDto[i];
        }
    }

    static {
        ShortVideoInterClipBlockTypeDto shortVideoInterClipBlockTypeDto = new ShortVideoInterClipBlockTypeDto("AUDIO_TEMPLATES", 0, "audio_templates");
        AUDIO_TEMPLATES = shortVideoInterClipBlockTypeDto;
        ShortVideoInterClipBlockTypeDto shortVideoInterClipBlockTypeDto2 = new ShortVideoInterClipBlockTypeDto("POPULAR_AUTHORS", 1, "popular_authors");
        POPULAR_AUTHORS = shortVideoInterClipBlockTypeDto2;
        ShortVideoInterClipBlockTypeDto[] shortVideoInterClipBlockTypeDtoArr = {shortVideoInterClipBlockTypeDto, shortVideoInterClipBlockTypeDto2};
        $VALUES = shortVideoInterClipBlockTypeDtoArr;
        $ENTRIES = new asp(shortVideoInterClipBlockTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoInterClipBlockTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoInterClipBlockTypeDto valueOf(String str) {
        return (ShortVideoInterClipBlockTypeDto) Enum.valueOf(ShortVideoInterClipBlockTypeDto.class, str);
    }

    public static ShortVideoInterClipBlockTypeDto[] values() {
        return (ShortVideoInterClipBlockTypeDto[]) $VALUES.clone();
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
