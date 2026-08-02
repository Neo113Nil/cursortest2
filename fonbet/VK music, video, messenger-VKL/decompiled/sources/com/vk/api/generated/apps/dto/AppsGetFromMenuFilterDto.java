package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetFromMenuFilterDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetFromMenuFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetFromMenuFilterDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetFromMenuFilterDto> CREATOR;

    @pmi0("html")
    public static final AppsGetFromMenuFilterDto HTML;

    @pmi0("html5")
    public static final AppsGetFromMenuFilterDto HTML5;

    @pmi0("vk_apps")
    public static final AppsGetFromMenuFilterDto VK_APPS;
    private final String value;

    /* compiled from: AppsGetFromMenuFilterDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetFromMenuFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetFromMenuFilterDto createFromParcel(Parcel parcel) {
            return AppsGetFromMenuFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetFromMenuFilterDto[] newArray(int i) {
            return new AppsGetFromMenuFilterDto[i];
        }
    }

    static {
        AppsGetFromMenuFilterDto appsGetFromMenuFilterDto = new AppsGetFromMenuFilterDto("HTML", 0, "html");
        HTML = appsGetFromMenuFilterDto;
        AppsGetFromMenuFilterDto appsGetFromMenuFilterDto2 = new AppsGetFromMenuFilterDto("HTML5", 1, "html5");
        HTML5 = appsGetFromMenuFilterDto2;
        AppsGetFromMenuFilterDto appsGetFromMenuFilterDto3 = new AppsGetFromMenuFilterDto("VK_APPS", 2, "vk_apps");
        VK_APPS = appsGetFromMenuFilterDto3;
        AppsGetFromMenuFilterDto[] appsGetFromMenuFilterDtoArr = {appsGetFromMenuFilterDto, appsGetFromMenuFilterDto2, appsGetFromMenuFilterDto3};
        $VALUES = appsGetFromMenuFilterDtoArr;
        $ENTRIES = new asp(appsGetFromMenuFilterDtoArr);
        CREATOR = new a();
    }

    private AppsGetFromMenuFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetFromMenuFilterDto valueOf(String str) {
        return (AppsGetFromMenuFilterDto) Enum.valueOf(AppsGetFromMenuFilterDto.class, str);
    }

    public static AppsGetFromMenuFilterDto[] values() {
        return (AppsGetFromMenuFilterDto[]) $VALUES.clone();
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
