package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PodcastsGetEpisodesOrderDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsGetEpisodesOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PodcastsGetEpisodesOrderDto[] $VALUES;
    public static final Parcelable.Creator<PodcastsGetEpisodesOrderDto> CREATOR;

    @pmi0("popular")
    public static final PodcastsGetEpisodesOrderDto POPULAR;

    @pmi0("recent")
    public static final PodcastsGetEpisodesOrderDto RECENT;
    private final String value;

    /* compiled from: PodcastsGetEpisodesOrderDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsGetEpisodesOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsGetEpisodesOrderDto createFromParcel(Parcel parcel) {
            return PodcastsGetEpisodesOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsGetEpisodesOrderDto[] newArray(int i) {
            return new PodcastsGetEpisodesOrderDto[i];
        }
    }

    static {
        PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto = new PodcastsGetEpisodesOrderDto("POPULAR", 0, "popular");
        POPULAR = podcastsGetEpisodesOrderDto;
        PodcastsGetEpisodesOrderDto podcastsGetEpisodesOrderDto2 = new PodcastsGetEpisodesOrderDto("RECENT", 1, "recent");
        RECENT = podcastsGetEpisodesOrderDto2;
        PodcastsGetEpisodesOrderDto[] podcastsGetEpisodesOrderDtoArr = {podcastsGetEpisodesOrderDto, podcastsGetEpisodesOrderDto2};
        $VALUES = podcastsGetEpisodesOrderDtoArr;
        $ENTRIES = new asp(podcastsGetEpisodesOrderDtoArr);
        CREATOR = new a();
    }

    private PodcastsGetEpisodesOrderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<PodcastsGetEpisodesOrderDto> i() {
        return $ENTRIES;
    }

    public static PodcastsGetEpisodesOrderDto valueOf(String str) {
        return (PodcastsGetEpisodesOrderDto) Enum.valueOf(PodcastsGetEpisodesOrderDto.class, str);
    }

    public static PodcastsGetEpisodesOrderDto[] values() {
        return (PodcastsGetEpisodesOrderDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
