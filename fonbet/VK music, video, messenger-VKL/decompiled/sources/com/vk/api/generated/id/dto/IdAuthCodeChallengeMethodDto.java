package com.vk.api.generated.id.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdAuthCodeChallengeMethodDto.kt */
/* loaded from: classes14.dex */
public final class IdAuthCodeChallengeMethodDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdAuthCodeChallengeMethodDto[] $VALUES;
    public static final Parcelable.Creator<IdAuthCodeChallengeMethodDto> CREATOR;

    @pmi0("s256")
    public static final IdAuthCodeChallengeMethodDto S256;
    private final String value;

    /* compiled from: IdAuthCodeChallengeMethodDto.kt */
    public static final class a implements Parcelable.Creator<IdAuthCodeChallengeMethodDto> {
        @Override // android.os.Parcelable.Creator
        public final IdAuthCodeChallengeMethodDto createFromParcel(Parcel parcel) {
            return IdAuthCodeChallengeMethodDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdAuthCodeChallengeMethodDto[] newArray(int i) {
            return new IdAuthCodeChallengeMethodDto[i];
        }
    }

    static {
        IdAuthCodeChallengeMethodDto idAuthCodeChallengeMethodDto = new IdAuthCodeChallengeMethodDto("S256", 0, "s256");
        S256 = idAuthCodeChallengeMethodDto;
        IdAuthCodeChallengeMethodDto[] idAuthCodeChallengeMethodDtoArr = {idAuthCodeChallengeMethodDto};
        $VALUES = idAuthCodeChallengeMethodDtoArr;
        $ENTRIES = new asp(idAuthCodeChallengeMethodDtoArr);
        CREATOR = new a();
    }

    private IdAuthCodeChallengeMethodDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static IdAuthCodeChallengeMethodDto valueOf(String str) {
        return (IdAuthCodeChallengeMethodDto) Enum.valueOf(IdAuthCodeChallengeMethodDto.class, str);
    }

    public static IdAuthCodeChallengeMethodDto[] values() {
        return (IdAuthCodeChallengeMethodDto[]) $VALUES.clone();
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
