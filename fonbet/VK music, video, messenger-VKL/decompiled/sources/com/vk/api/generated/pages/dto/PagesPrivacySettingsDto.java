package com.vk.api.generated.pages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagesPrivacySettingsDto.kt */
/* loaded from: classes15.dex */
public final class PagesPrivacySettingsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PagesPrivacySettingsDto[] $VALUES;

    @pmi0("0")
    public static final PagesPrivacySettingsDto COMMUNITY_MANAGERS_ONLY;

    @pmi0("1")
    public static final PagesPrivacySettingsDto COMMUNITY_MEMBERS_ONLY;
    public static final Parcelable.Creator<PagesPrivacySettingsDto> CREATOR;

    @pmi0("2")
    public static final PagesPrivacySettingsDto EVERYONE;
    private final int value;

    /* compiled from: PagesPrivacySettingsDto.kt */
    public static final class a implements Parcelable.Creator<PagesPrivacySettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final PagesPrivacySettingsDto createFromParcel(Parcel parcel) {
            return PagesPrivacySettingsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PagesPrivacySettingsDto[] newArray(int i) {
            return new PagesPrivacySettingsDto[i];
        }
    }

    static {
        PagesPrivacySettingsDto pagesPrivacySettingsDto = new PagesPrivacySettingsDto("COMMUNITY_MANAGERS_ONLY", 0, 0);
        COMMUNITY_MANAGERS_ONLY = pagesPrivacySettingsDto;
        PagesPrivacySettingsDto pagesPrivacySettingsDto2 = new PagesPrivacySettingsDto("COMMUNITY_MEMBERS_ONLY", 1, 1);
        COMMUNITY_MEMBERS_ONLY = pagesPrivacySettingsDto2;
        PagesPrivacySettingsDto pagesPrivacySettingsDto3 = new PagesPrivacySettingsDto("EVERYONE", 2, 2);
        EVERYONE = pagesPrivacySettingsDto3;
        PagesPrivacySettingsDto[] pagesPrivacySettingsDtoArr = {pagesPrivacySettingsDto, pagesPrivacySettingsDto2, pagesPrivacySettingsDto3};
        $VALUES = pagesPrivacySettingsDtoArr;
        $ENTRIES = new asp(pagesPrivacySettingsDtoArr);
        CREATOR = new a();
    }

    private PagesPrivacySettingsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PagesPrivacySettingsDto valueOf(String str) {
        return (PagesPrivacySettingsDto) Enum.valueOf(PagesPrivacySettingsDto.class, str);
    }

    public static PagesPrivacySettingsDto[] values() {
        return (PagesPrivacySettingsDto[]) $VALUES.clone();
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
