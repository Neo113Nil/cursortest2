package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsCheckObsceneTextDictionaryDto.kt */
/* loaded from: classes15.dex */
public final class UtilsCheckObsceneTextDictionaryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsCheckObsceneTextDictionaryDto[] $VALUES;

    @pmi0("bullying")
    public static final UtilsCheckObsceneTextDictionaryDto BULLYING;
    public static final Parcelable.Creator<UtilsCheckObsceneTextDictionaryDto> CREATOR;

    @pmi0("obscene")
    public static final UtilsCheckObsceneTextDictionaryDto OBSCENE;
    private final String value;

    /* compiled from: UtilsCheckObsceneTextDictionaryDto.kt */
    public static final class a implements Parcelable.Creator<UtilsCheckObsceneTextDictionaryDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsCheckObsceneTextDictionaryDto createFromParcel(Parcel parcel) {
            return UtilsCheckObsceneTextDictionaryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsCheckObsceneTextDictionaryDto[] newArray(int i) {
            return new UtilsCheckObsceneTextDictionaryDto[i];
        }
    }

    static {
        UtilsCheckObsceneTextDictionaryDto utilsCheckObsceneTextDictionaryDto = new UtilsCheckObsceneTextDictionaryDto("BULLYING", 0, "bullying");
        BULLYING = utilsCheckObsceneTextDictionaryDto;
        UtilsCheckObsceneTextDictionaryDto utilsCheckObsceneTextDictionaryDto2 = new UtilsCheckObsceneTextDictionaryDto("OBSCENE", 1, "obscene");
        OBSCENE = utilsCheckObsceneTextDictionaryDto2;
        UtilsCheckObsceneTextDictionaryDto[] utilsCheckObsceneTextDictionaryDtoArr = {utilsCheckObsceneTextDictionaryDto, utilsCheckObsceneTextDictionaryDto2};
        $VALUES = utilsCheckObsceneTextDictionaryDtoArr;
        $ENTRIES = new asp(utilsCheckObsceneTextDictionaryDtoArr);
        CREATOR = new a();
    }

    private UtilsCheckObsceneTextDictionaryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsCheckObsceneTextDictionaryDto valueOf(String str) {
        return (UtilsCheckObsceneTextDictionaryDto) Enum.valueOf(UtilsCheckObsceneTextDictionaryDto.class, str);
    }

    public static UtilsCheckObsceneTextDictionaryDto[] values() {
        return (UtilsCheckObsceneTextDictionaryDto[]) $VALUES.clone();
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
