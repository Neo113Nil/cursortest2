package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchCoOwnersTypeDto.kt */
/* loaded from: classes15.dex */
public final class SearchCoOwnersTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchCoOwnersTypeDto[] $VALUES;
    public static final Parcelable.Creator<SearchCoOwnersTypeDto> CREATOR;

    @pmi0("group")
    public static final SearchCoOwnersTypeDto GROUP;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final SearchCoOwnersTypeDto PROFILE;
    private final String value;

    /* compiled from: SearchCoOwnersTypeDto.kt */
    public static final class a implements Parcelable.Creator<SearchCoOwnersTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchCoOwnersTypeDto createFromParcel(Parcel parcel) {
            return SearchCoOwnersTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchCoOwnersTypeDto[] newArray(int i) {
            return new SearchCoOwnersTypeDto[i];
        }
    }

    static {
        SearchCoOwnersTypeDto searchCoOwnersTypeDto = new SearchCoOwnersTypeDto("GROUP", 0, "group");
        GROUP = searchCoOwnersTypeDto;
        SearchCoOwnersTypeDto searchCoOwnersTypeDto2 = new SearchCoOwnersTypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = searchCoOwnersTypeDto2;
        SearchCoOwnersTypeDto[] searchCoOwnersTypeDtoArr = {searchCoOwnersTypeDto, searchCoOwnersTypeDto2};
        $VALUES = searchCoOwnersTypeDtoArr;
        $ENTRIES = new asp(searchCoOwnersTypeDtoArr);
        CREATOR = new a();
    }

    private SearchCoOwnersTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchCoOwnersTypeDto valueOf(String str) {
        return (SearchCoOwnersTypeDto) Enum.valueOf(SearchCoOwnersTypeDto.class, str);
    }

    public static SearchCoOwnersTypeDto[] values() {
        return (SearchCoOwnersTypeDto[]) $VALUES.clone();
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
