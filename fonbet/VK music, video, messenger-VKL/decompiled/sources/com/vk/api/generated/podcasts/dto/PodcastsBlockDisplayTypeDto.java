package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PodcastsBlockDisplayTypeDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsBlockDisplayTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PodcastsBlockDisplayTypeDto[] $VALUES;

    @pmi0("banners")
    public static final PodcastsBlockDisplayTypeDto BANNERS;

    @pmi0("blured_podcasts_carousel")
    public static final PodcastsBlockDisplayTypeDto BLURED_PODCASTS_CAROUSEL;

    @pmi0(HintCategories.PARAM_NAME)
    public static final PodcastsBlockDisplayTypeDto CATEGORIES;
    public static final Parcelable.Creator<PodcastsBlockDisplayTypeDto> CREATOR;

    @pmi0("episodes_list")
    public static final PodcastsBlockDisplayTypeDto EPISODES_LIST;

    @pmi0("podcasts_carousel")
    public static final PodcastsBlockDisplayTypeDto PODCASTS_CAROUSEL;
    private final String value;

    /* compiled from: PodcastsBlockDisplayTypeDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsBlockDisplayTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockDisplayTypeDto createFromParcel(Parcel parcel) {
            return PodcastsBlockDisplayTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockDisplayTypeDto[] newArray(int i) {
            return new PodcastsBlockDisplayTypeDto[i];
        }
    }

    static {
        PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto = new PodcastsBlockDisplayTypeDto("PODCASTS_CAROUSEL", 0, "podcasts_carousel");
        PODCASTS_CAROUSEL = podcastsBlockDisplayTypeDto;
        PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto2 = new PodcastsBlockDisplayTypeDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = podcastsBlockDisplayTypeDto2;
        PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto3 = new PodcastsBlockDisplayTypeDto("EPISODES_LIST", 2, "episodes_list");
        EPISODES_LIST = podcastsBlockDisplayTypeDto3;
        PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto4 = new PodcastsBlockDisplayTypeDto("BLURED_PODCASTS_CAROUSEL", 3, "blured_podcasts_carousel");
        BLURED_PODCASTS_CAROUSEL = podcastsBlockDisplayTypeDto4;
        PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto5 = new PodcastsBlockDisplayTypeDto("BANNERS", 4, "banners");
        BANNERS = podcastsBlockDisplayTypeDto5;
        PodcastsBlockDisplayTypeDto[] podcastsBlockDisplayTypeDtoArr = {podcastsBlockDisplayTypeDto, podcastsBlockDisplayTypeDto2, podcastsBlockDisplayTypeDto3, podcastsBlockDisplayTypeDto4, podcastsBlockDisplayTypeDto5};
        $VALUES = podcastsBlockDisplayTypeDtoArr;
        $ENTRIES = new asp(podcastsBlockDisplayTypeDtoArr);
        CREATOR = new a();
    }

    private PodcastsBlockDisplayTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PodcastsBlockDisplayTypeDto valueOf(String str) {
        return (PodcastsBlockDisplayTypeDto) Enum.valueOf(PodcastsBlockDisplayTypeDto.class, str);
    }

    public static PodcastsBlockDisplayTypeDto[] values() {
        return (PodcastsBlockDisplayTypeDto[]) $VALUES.clone();
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
