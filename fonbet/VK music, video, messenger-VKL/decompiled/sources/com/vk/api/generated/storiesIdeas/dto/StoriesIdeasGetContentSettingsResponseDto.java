package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesIdeasGetContentSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasGetContentSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasGetContentSettingsResponseDto> CREATOR = new a();

    @pmi0("confidence")
    private final Float confidence;

    @pmi0("esthetic_score")
    private final Float estheticScore;

    @pmi0("fave_rate")
    private final Float faveRate;

    @pmi0("fresh_rate")
    private final String freshRate;

    @pmi0("green_cats")
    private final List<StoriesIdeasCategoryDto> greenCats;

    @pmi0("last_date")
    private final Integer lastDate;

    @pmi0("min_count")
    private final Integer minCount;

    @pmi0("model_url")
    private final String modelUrl;

    @pmi0("model_version")
    private final Integer modelVersion;

    @pmi0("published")
    private final List<String> published;

    @pmi0("red_cats")
    private final List<StoriesIdeasCategoryDto> redCats;

    @pmi0("title")
    private final String title;

    @pmi0("version")
    private final Float version;

    /* compiled from: StoriesIdeasGetContentSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasGetContentSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasGetContentSettingsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(StoriesIdeasCategoryDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(StoriesIdeasCategoryDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new StoriesIdeasGetContentSettingsResponseDto(valueOf, valueOf2, valueOf3, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasGetContentSettingsResponseDto[] newArray(int i) {
            return new StoriesIdeasGetContentSettingsResponseDto[i];
        }
    }

    public StoriesIdeasGetContentSettingsResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasGetContentSettingsResponseDto)) {
            return false;
        }
        StoriesIdeasGetContentSettingsResponseDto storiesIdeasGetContentSettingsResponseDto = (StoriesIdeasGetContentSettingsResponseDto) obj;
        return epx.f(this.version, storiesIdeasGetContentSettingsResponseDto.version) && epx.f(this.estheticScore, storiesIdeasGetContentSettingsResponseDto.estheticScore) && epx.f(this.confidence, storiesIdeasGetContentSettingsResponseDto.confidence) && epx.f(this.greenCats, storiesIdeasGetContentSettingsResponseDto.greenCats) && epx.f(this.redCats, storiesIdeasGetContentSettingsResponseDto.redCats) && epx.f(this.lastDate, storiesIdeasGetContentSettingsResponseDto.lastDate) && epx.f(this.minCount, storiesIdeasGetContentSettingsResponseDto.minCount) && epx.f(this.published, storiesIdeasGetContentSettingsResponseDto.published) && epx.f(this.freshRate, storiesIdeasGetContentSettingsResponseDto.freshRate) && epx.f(this.faveRate, storiesIdeasGetContentSettingsResponseDto.faveRate) && epx.f(this.title, storiesIdeasGetContentSettingsResponseDto.title) && epx.f(this.modelUrl, storiesIdeasGetContentSettingsResponseDto.modelUrl) && epx.f(this.modelVersion, storiesIdeasGetContentSettingsResponseDto.modelVersion);
    }

    public final int hashCode() {
        Float f = this.version;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.estheticScore;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.confidence;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        List<StoriesIdeasCategoryDto> list = this.greenCats;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<StoriesIdeasCategoryDto> list2 = this.redCats;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.lastDate;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list3 = this.published;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.freshRate;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Float f4 = this.faveRate;
        int hashCode10 = (hashCode9 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str2 = this.title;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelUrl;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.modelVersion;
        return hashCode12 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesIdeasGetContentSettingsResponseDto(version=");
        sb.append(this.version);
        sb.append(", estheticScore=");
        sb.append(this.estheticScore);
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", greenCats=");
        sb.append(this.greenCats);
        sb.append(", redCats=");
        sb.append(this.redCats);
        sb.append(", lastDate=");
        sb.append(this.lastDate);
        sb.append(", minCount=");
        sb.append(this.minCount);
        sb.append(", published=");
        sb.append(this.published);
        sb.append(", freshRate=");
        sb.append(this.freshRate);
        sb.append(", faveRate=");
        sb.append(this.faveRate);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", modelUrl=");
        sb.append(this.modelUrl);
        sb.append(", modelVersion=");
        return uqi.b(sb, this.modelVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.version;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.estheticScore;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.confidence;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        List<StoriesIdeasCategoryDto> list = this.greenCats;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list, 1);
            while (f4.hasNext()) {
                ((StoriesIdeasCategoryDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesIdeasCategoryDto> list2 = this.redCats;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list2, 1);
            while (f5.hasNext()) {
                ((StoriesIdeasCategoryDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.lastDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.minCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeStringList(this.published);
        parcel.writeString(this.freshRate);
        Float f6 = this.faveRate;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f6);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.modelUrl);
        Integer num3 = this.modelVersion;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public StoriesIdeasGetContentSettingsResponseDto(Float f, Float f2, Float f3, List<StoriesIdeasCategoryDto> list, List<StoriesIdeasCategoryDto> list2, Integer num, Integer num2, List<String> list3, String str, Float f4, String str2, String str3, Integer num3) {
        this.version = f;
        this.estheticScore = f2;
        this.confidence = f3;
        this.greenCats = list;
        this.redCats = list2;
        this.lastDate = num;
        this.minCount = num2;
        this.published = list3;
        this.freshRate = str;
        this.faveRate = f4;
        this.title = str2;
        this.modelUrl = str3;
        this.modelVersion = num3;
    }

    public /* synthetic */ StoriesIdeasGetContentSettingsResponseDto(Float f, Float f2, Float f3, List list, List list2, Integer num, Integer num2, List list3, String str, Float f4, String str2, String str3, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : f4, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : num3);
    }
}
