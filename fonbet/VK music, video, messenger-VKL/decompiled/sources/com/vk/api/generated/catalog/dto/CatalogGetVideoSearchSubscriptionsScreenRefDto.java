package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSubscriptionsScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSubscriptionsScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSubscriptionsScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchSubscriptionsScreenRefDto> CREATOR;

    @pmi0("search_video_subscriptions")
    public static final CatalogGetVideoSearchSubscriptionsScreenRefDto SEARCH_VIDEO_SUBSCRIPTIONS;
    private final String value;

    /* compiled from: CatalogGetVideoSearchSubscriptionsScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSubscriptionsScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSubscriptionsScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSubscriptionsScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSubscriptionsScreenRefDto[] newArray(int i) {
            return new CatalogGetVideoSearchSubscriptionsScreenRefDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSubscriptionsScreenRefDto catalogGetVideoSearchSubscriptionsScreenRefDto = new CatalogGetVideoSearchSubscriptionsScreenRefDto("SEARCH_VIDEO_SUBSCRIPTIONS", 0, "search_video_subscriptions");
        SEARCH_VIDEO_SUBSCRIPTIONS = catalogGetVideoSearchSubscriptionsScreenRefDto;
        CatalogGetVideoSearchSubscriptionsScreenRefDto[] catalogGetVideoSearchSubscriptionsScreenRefDtoArr = {catalogGetVideoSearchSubscriptionsScreenRefDto};
        $VALUES = catalogGetVideoSearchSubscriptionsScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSubscriptionsScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSubscriptionsScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchSubscriptionsScreenRefDto valueOf(String str) {
        return (CatalogGetVideoSearchSubscriptionsScreenRefDto) Enum.valueOf(CatalogGetVideoSearchSubscriptionsScreenRefDto.class, str);
    }

    public static CatalogGetVideoSearchSubscriptionsScreenRefDto[] values() {
        return (CatalogGetVideoSearchSubscriptionsScreenRefDto[]) $VALUES.clone();
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
