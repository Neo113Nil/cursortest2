package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsDomainResolvedTypeDto.kt */
/* loaded from: classes15.dex */
public final class UtilsDomainResolvedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsDomainResolvedTypeDto[] $VALUES;

    @pmi0("application")
    public static final UtilsDomainResolvedTypeDto APPLICATION;

    @pmi0("community_application")
    public static final UtilsDomainResolvedTypeDto COMMUNITY_APPLICATION;
    public static final Parcelable.Creator<UtilsDomainResolvedTypeDto> CREATOR;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final UtilsDomainResolvedTypeDto EVENT;

    @pmi0("group")
    public static final UtilsDomainResolvedTypeDto GROUP;

    @pmi0("internal_vkui")
    public static final UtilsDomainResolvedTypeDto INTERNAL_VKUI;

    @pmi0("page")
    public static final UtilsDomainResolvedTypeDto PAGE;

    @pmi0("user")
    public static final UtilsDomainResolvedTypeDto USER;

    @pmi0("vk_app")
    public static final UtilsDomainResolvedTypeDto VK_APP;
    private final String value;

    /* compiled from: UtilsDomainResolvedTypeDto.kt */
    public static final class a implements Parcelable.Creator<UtilsDomainResolvedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedTypeDto createFromParcel(Parcel parcel) {
            return UtilsDomainResolvedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedTypeDto[] newArray(int i) {
            return new UtilsDomainResolvedTypeDto[i];
        }
    }

    static {
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = new UtilsDomainResolvedTypeDto("USER", 0, "user");
        USER = utilsDomainResolvedTypeDto;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto2 = new UtilsDomainResolvedTypeDto("GROUP", 1, "group");
        GROUP = utilsDomainResolvedTypeDto2;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto3 = new UtilsDomainResolvedTypeDto("APPLICATION", 2, "application");
        APPLICATION = utilsDomainResolvedTypeDto3;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto4 = new UtilsDomainResolvedTypeDto("EVENT", 3, NotificationCompat.CATEGORY_EVENT);
        EVENT = utilsDomainResolvedTypeDto4;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto5 = new UtilsDomainResolvedTypeDto("PAGE", 4, "page");
        PAGE = utilsDomainResolvedTypeDto5;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto6 = new UtilsDomainResolvedTypeDto("VK_APP", 5, "vk_app");
        VK_APP = utilsDomainResolvedTypeDto6;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto7 = new UtilsDomainResolvedTypeDto("COMMUNITY_APPLICATION", 6, "community_application");
        COMMUNITY_APPLICATION = utilsDomainResolvedTypeDto7;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto8 = new UtilsDomainResolvedTypeDto("INTERNAL_VKUI", 7, "internal_vkui");
        INTERNAL_VKUI = utilsDomainResolvedTypeDto8;
        UtilsDomainResolvedTypeDto[] utilsDomainResolvedTypeDtoArr = {utilsDomainResolvedTypeDto, utilsDomainResolvedTypeDto2, utilsDomainResolvedTypeDto3, utilsDomainResolvedTypeDto4, utilsDomainResolvedTypeDto5, utilsDomainResolvedTypeDto6, utilsDomainResolvedTypeDto7, utilsDomainResolvedTypeDto8};
        $VALUES = utilsDomainResolvedTypeDtoArr;
        $ENTRIES = new asp(utilsDomainResolvedTypeDtoArr);
        CREATOR = new a();
    }

    private UtilsDomainResolvedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsDomainResolvedTypeDto valueOf(String str) {
        return (UtilsDomainResolvedTypeDto) Enum.valueOf(UtilsDomainResolvedTypeDto.class, str);
    }

    public static UtilsDomainResolvedTypeDto[] values() {
        return (UtilsDomainResolvedTypeDto[]) $VALUES.clone();
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
