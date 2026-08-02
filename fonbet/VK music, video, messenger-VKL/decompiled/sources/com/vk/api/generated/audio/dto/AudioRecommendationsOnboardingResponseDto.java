package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioRecommendationsOnboardingResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioRecommendationsOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioRecommendationsOnboardingResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<AudioArtistDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("related_count")
    private final Integer relatedCount;

    /* compiled from: AudioRecommendationsOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioRecommendationsOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioRecommendationsOnboardingResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioRecommendationsOnboardingResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new AudioRecommendationsOnboardingResponseDto(arrayList, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRecommendationsOnboardingResponseDto[] newArray(int i) {
            return new AudioRecommendationsOnboardingResponseDto[i];
        }
    }

    public AudioRecommendationsOnboardingResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRecommendationsOnboardingResponseDto)) {
            return false;
        }
        AudioRecommendationsOnboardingResponseDto audioRecommendationsOnboardingResponseDto = (AudioRecommendationsOnboardingResponseDto) obj;
        return epx.f(this.items, audioRecommendationsOnboardingResponseDto.items) && epx.f(this.nextFrom, audioRecommendationsOnboardingResponseDto.nextFrom) && epx.f(this.relatedCount, audioRecommendationsOnboardingResponseDto.relatedCount);
    }

    public final int hashCode() {
        List<AudioArtistDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.relatedCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRecommendationsOnboardingResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", relatedCount=");
        return uqi.b(sb, this.relatedCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AudioArtistDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
        Integer num = this.relatedCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AudioRecommendationsOnboardingResponseDto(List<AudioArtistDto> list, String str, Integer num) {
        this.items = list;
        this.nextFrom = str;
        this.relatedCount = num;
    }

    public /* synthetic */ AudioRecommendationsOnboardingResponseDto(List list, String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
