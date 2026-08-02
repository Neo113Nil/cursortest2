package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: AudioConcertDto.kt */
/* loaded from: classes14.dex */
public final class AudioConcertDto implements Parcelable {
    public static final Parcelable.Creator<AudioConcertDto> CREATOR = new a();

    @pmi0("age_category")
    private final String ageCategory;

    @pmi0("artists_ids")
    private final List<String> artistsIds;

    @pmi0("city")
    private final AudioConcertCityDto city;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("min_price")
    private final int minPrice;

    @pmi0("page_url")
    private final String pageUrl;

    @pmi0("place_title")
    private final String placeTitle;

    @pmi0("start_datetime")
    private final String startDatetime;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioConcertDto.kt */
    public static final class a implements Parcelable.Creator<AudioConcertDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioConcertDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AudioConcertCityDto createFromParcel = AudioConcertCityDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AudioConcertDto.class, parcel, arrayList, i, 1);
            }
            return new AudioConcertDto(readString, readString2, readString3, readString4, createFromParcel, readInt, readString5, readString6, createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioConcertDto[] newArray(int i) {
            return new AudioConcertDto[i];
        }
    }

    public AudioConcertDto(String str, String str2, String str3, String str4, AudioConcertCityDto audioConcertCityDto, int i, String str5, String str6, List<String> list, List<BaseImageDto> list2) {
        this.id = str;
        this.title = str2;
        this.placeTitle = str3;
        this.ageCategory = str4;
        this.city = audioConcertCityDto;
        this.minPrice = i;
        this.startDatetime = str5;
        this.pageUrl = str6;
        this.artistsIds = list;
        this.image = list2;
    }

    public final String d() {
        return this.ageCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.artistsIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioConcertDto)) {
            return false;
        }
        AudioConcertDto audioConcertDto = (AudioConcertDto) obj;
        return epx.f(this.id, audioConcertDto.id) && epx.f(this.title, audioConcertDto.title) && epx.f(this.placeTitle, audioConcertDto.placeTitle) && epx.f(this.ageCategory, audioConcertDto.ageCategory) && epx.f(this.city, audioConcertDto.city) && this.minPrice == audioConcertDto.minPrice && epx.f(this.startDatetime, audioConcertDto.startDatetime) && epx.f(this.pageUrl, audioConcertDto.pageUrl) && epx.f(this.artistsIds, audioConcertDto.artistsIds) && epx.f(this.image, audioConcertDto.image);
    }

    public final AudioConcertCityDto f() {
        return this.city;
    }

    public final List<BaseImageDto> g() {
        return this.image;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.image.hashCode() + fw3.a(urd0.a(urd0.a(shy.a(this.minPrice, (this.city.hashCode() + urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.placeTitle), 31, this.ageCategory)) * 31, 31), 31, this.startDatetime), 31, this.pageUrl), 31, this.artistsIds);
    }

    public final int i() {
        return this.minPrice;
    }

    public final String j() {
        return this.pageUrl;
    }

    public final String k() {
        return this.placeTitle;
    }

    public final String l() {
        return this.startDatetime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioConcertDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", placeTitle=");
        sb.append(this.placeTitle);
        sb.append(", ageCategory=");
        sb.append(this.ageCategory);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", minPrice=");
        sb.append(this.minPrice);
        sb.append(", startDatetime=");
        sb.append(this.startDatetime);
        sb.append(", pageUrl=");
        sb.append(this.pageUrl);
        sb.append(", artistsIds=");
        sb.append(this.artistsIds);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.placeTitle);
        parcel.writeString(this.ageCategory);
        this.city.writeToParcel(parcel, i);
        parcel.writeInt(this.minPrice);
        parcel.writeString(this.startDatetime);
        parcel.writeString(this.pageUrl);
        parcel.writeStringList(this.artistsIds);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
