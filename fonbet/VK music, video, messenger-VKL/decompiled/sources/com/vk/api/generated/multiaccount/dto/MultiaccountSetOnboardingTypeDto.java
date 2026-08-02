package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultiaccountSetOnboardingTypeDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountSetOnboardingTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MultiaccountSetOnboardingTypeDto[] $VALUES;

    @pmi0("account")
    public static final MultiaccountSetOnboardingTypeDto ACCOUNT;
    public static final Parcelable.Creator<MultiaccountSetOnboardingTypeDto> CREATOR;

    @pmi0("longtap")
    public static final MultiaccountSetOnboardingTypeDto LONGTAP;

    @pmi0("multiacc")
    public static final MultiaccountSetOnboardingTypeDto MULTIACC;

    @pmi0("sharing")
    public static final MultiaccountSetOnboardingTypeDto SHARING;
    private final String value;

    /* compiled from: MultiaccountSetOnboardingTypeDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountSetOnboardingTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountSetOnboardingTypeDto createFromParcel(Parcel parcel) {
            return MultiaccountSetOnboardingTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountSetOnboardingTypeDto[] newArray(int i) {
            return new MultiaccountSetOnboardingTypeDto[i];
        }
    }

    static {
        MultiaccountSetOnboardingTypeDto multiaccountSetOnboardingTypeDto = new MultiaccountSetOnboardingTypeDto("ACCOUNT", 0, "account");
        ACCOUNT = multiaccountSetOnboardingTypeDto;
        MultiaccountSetOnboardingTypeDto multiaccountSetOnboardingTypeDto2 = new MultiaccountSetOnboardingTypeDto("LONGTAP", 1, "longtap");
        LONGTAP = multiaccountSetOnboardingTypeDto2;
        MultiaccountSetOnboardingTypeDto multiaccountSetOnboardingTypeDto3 = new MultiaccountSetOnboardingTypeDto("MULTIACC", 2, "multiacc");
        MULTIACC = multiaccountSetOnboardingTypeDto3;
        MultiaccountSetOnboardingTypeDto multiaccountSetOnboardingTypeDto4 = new MultiaccountSetOnboardingTypeDto("SHARING", 3, "sharing");
        SHARING = multiaccountSetOnboardingTypeDto4;
        MultiaccountSetOnboardingTypeDto[] multiaccountSetOnboardingTypeDtoArr = {multiaccountSetOnboardingTypeDto, multiaccountSetOnboardingTypeDto2, multiaccountSetOnboardingTypeDto3, multiaccountSetOnboardingTypeDto4};
        $VALUES = multiaccountSetOnboardingTypeDtoArr;
        $ENTRIES = new asp(multiaccountSetOnboardingTypeDtoArr);
        CREATOR = new a();
    }

    private MultiaccountSetOnboardingTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MultiaccountSetOnboardingTypeDto valueOf(String str) {
        return (MultiaccountSetOnboardingTypeDto) Enum.valueOf(MultiaccountSetOnboardingTypeDto.class, str);
    }

    public static MultiaccountSetOnboardingTypeDto[] values() {
        return (MultiaccountSetOnboardingTypeDto[]) $VALUES.clone();
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
