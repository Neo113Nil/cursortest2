package com.vk.api.generated.situationalSuggests.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SituationalSuggestsInterfaceVariantDto.kt */
/* loaded from: classes15.dex */
public final class SituationalSuggestsInterfaceVariantDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SituationalSuggestsInterfaceVariantDto[] $VALUES;
    public static final Parcelable.Creator<SituationalSuggestsInterfaceVariantDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final SituationalSuggestsInterfaceVariantDto DEFAULT;

    @pmi0("text_box")
    public static final SituationalSuggestsInterfaceVariantDto TEXT_BOX;

    @pmi0("text_box_immediate")
    public static final SituationalSuggestsInterfaceVariantDto TEXT_BOX_IMMEDIATE;
    private final String value;

    /* compiled from: SituationalSuggestsInterfaceVariantDto.kt */
    public static final class a implements Parcelable.Creator<SituationalSuggestsInterfaceVariantDto> {
        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsInterfaceVariantDto createFromParcel(Parcel parcel) {
            return SituationalSuggestsInterfaceVariantDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SituationalSuggestsInterfaceVariantDto[] newArray(int i) {
            return new SituationalSuggestsInterfaceVariantDto[i];
        }
    }

    static {
        SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto = new SituationalSuggestsInterfaceVariantDto("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = situationalSuggestsInterfaceVariantDto;
        SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto2 = new SituationalSuggestsInterfaceVariantDto("TEXT_BOX", 1, "text_box");
        TEXT_BOX = situationalSuggestsInterfaceVariantDto2;
        SituationalSuggestsInterfaceVariantDto situationalSuggestsInterfaceVariantDto3 = new SituationalSuggestsInterfaceVariantDto("TEXT_BOX_IMMEDIATE", 2, "text_box_immediate");
        TEXT_BOX_IMMEDIATE = situationalSuggestsInterfaceVariantDto3;
        SituationalSuggestsInterfaceVariantDto[] situationalSuggestsInterfaceVariantDtoArr = {situationalSuggestsInterfaceVariantDto, situationalSuggestsInterfaceVariantDto2, situationalSuggestsInterfaceVariantDto3};
        $VALUES = situationalSuggestsInterfaceVariantDtoArr;
        $ENTRIES = new asp(situationalSuggestsInterfaceVariantDtoArr);
        CREATOR = new a();
    }

    private SituationalSuggestsInterfaceVariantDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SituationalSuggestsInterfaceVariantDto valueOf(String str) {
        return (SituationalSuggestsInterfaceVariantDto) Enum.valueOf(SituationalSuggestsInterfaceVariantDto.class, str);
    }

    public static SituationalSuggestsInterfaceVariantDto[] values() {
        return (SituationalSuggestsInterfaceVariantDto[]) $VALUES.clone();
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
