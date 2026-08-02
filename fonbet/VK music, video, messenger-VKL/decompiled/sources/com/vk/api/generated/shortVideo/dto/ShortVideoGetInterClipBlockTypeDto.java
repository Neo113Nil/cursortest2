package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetInterClipBlockTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetInterClipBlockTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetInterClipBlockTypeDto[] $VALUES;

    @pmi0("audio_templates")
    public static final ShortVideoGetInterClipBlockTypeDto AUDIO_TEMPLATES;
    public static final Parcelable.Creator<ShortVideoGetInterClipBlockTypeDto> CREATOR;

    @pmi0("popular_authors")
    public static final ShortVideoGetInterClipBlockTypeDto POPULAR_AUTHORS;
    private final String value;

    /* compiled from: ShortVideoGetInterClipBlockTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetInterClipBlockTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetInterClipBlockTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoGetInterClipBlockTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetInterClipBlockTypeDto[] newArray(int i) {
            return new ShortVideoGetInterClipBlockTypeDto[i];
        }
    }

    static {
        ShortVideoGetInterClipBlockTypeDto shortVideoGetInterClipBlockTypeDto = new ShortVideoGetInterClipBlockTypeDto("AUDIO_TEMPLATES", 0, "audio_templates");
        AUDIO_TEMPLATES = shortVideoGetInterClipBlockTypeDto;
        ShortVideoGetInterClipBlockTypeDto shortVideoGetInterClipBlockTypeDto2 = new ShortVideoGetInterClipBlockTypeDto("POPULAR_AUTHORS", 1, "popular_authors");
        POPULAR_AUTHORS = shortVideoGetInterClipBlockTypeDto2;
        ShortVideoGetInterClipBlockTypeDto[] shortVideoGetInterClipBlockTypeDtoArr = {shortVideoGetInterClipBlockTypeDto, shortVideoGetInterClipBlockTypeDto2};
        $VALUES = shortVideoGetInterClipBlockTypeDtoArr;
        $ENTRIES = new asp(shortVideoGetInterClipBlockTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetInterClipBlockTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetInterClipBlockTypeDto valueOf(String str) {
        return (ShortVideoGetInterClipBlockTypeDto) Enum.valueOf(ShortVideoGetInterClipBlockTypeDto.class, str);
    }

    public static ShortVideoGetInterClipBlockTypeDto[] values() {
        return (ShortVideoGetInterClipBlockTypeDto[]) $VALUES.clone();
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
