package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreWidgetsBaseImageTypeDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseImageTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreWidgetsBaseImageTypeDto[] $VALUES;
    public static final Parcelable.Creator<ExploreWidgetsBaseImageTypeDto> CREATOR;

    @pmi0("custom")
    public static final ExploreWidgetsBaseImageTypeDto CUSTOM;

    @pmi0("group")
    public static final ExploreWidgetsBaseImageTypeDto GROUP;

    @pmi0("inline")
    public static final ExploreWidgetsBaseImageTypeDto INLINE;

    @pmi0("mini_app")
    public static final ExploreWidgetsBaseImageTypeDto MINI_APP;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final ExploreWidgetsBaseImageTypeDto PROFILE;
    private final String value;

    /* compiled from: ExploreWidgetsBaseImageTypeDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseImageTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseImageTypeDto createFromParcel(Parcel parcel) {
            return ExploreWidgetsBaseImageTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseImageTypeDto[] newArray(int i) {
            return new ExploreWidgetsBaseImageTypeDto[i];
        }
    }

    static {
        ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto = new ExploreWidgetsBaseImageTypeDto("INLINE", 0, "inline");
        INLINE = exploreWidgetsBaseImageTypeDto;
        ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto2 = new ExploreWidgetsBaseImageTypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = exploreWidgetsBaseImageTypeDto2;
        ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto3 = new ExploreWidgetsBaseImageTypeDto("GROUP", 2, "group");
        GROUP = exploreWidgetsBaseImageTypeDto3;
        ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto4 = new ExploreWidgetsBaseImageTypeDto("MINI_APP", 3, "mini_app");
        MINI_APP = exploreWidgetsBaseImageTypeDto4;
        ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto5 = new ExploreWidgetsBaseImageTypeDto("CUSTOM", 4, "custom");
        CUSTOM = exploreWidgetsBaseImageTypeDto5;
        ExploreWidgetsBaseImageTypeDto[] exploreWidgetsBaseImageTypeDtoArr = {exploreWidgetsBaseImageTypeDto, exploreWidgetsBaseImageTypeDto2, exploreWidgetsBaseImageTypeDto3, exploreWidgetsBaseImageTypeDto4, exploreWidgetsBaseImageTypeDto5};
        $VALUES = exploreWidgetsBaseImageTypeDtoArr;
        $ENTRIES = new asp(exploreWidgetsBaseImageTypeDtoArr);
        CREATOR = new a();
    }

    private ExploreWidgetsBaseImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreWidgetsBaseImageTypeDto valueOf(String str) {
        return (ExploreWidgetsBaseImageTypeDto) Enum.valueOf(ExploreWidgetsBaseImageTypeDto.class, str);
    }

    public static ExploreWidgetsBaseImageTypeDto[] values() {
        return (ExploreWidgetsBaseImageTypeDto[]) $VALUES.clone();
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
