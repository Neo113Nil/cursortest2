package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StoriesGetStatsV5200ResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetStatsV5200ResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetStatsV5200ResponseDto> CREATOR = new a();

    @pmi0("achievement")
    private final String achievement;

    @pmi0("achievement_subtitle")
    private final String achievementSubtitle;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<StoriesStatCategoryDto> categories;

    @pmi0("need_privacy_block")
    private final Boolean needPrivacyBlock;

    @pmi0("preview")
    private final String preview;

    /* compiled from: StoriesGetStatsV5200ResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetStatsV5200ResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetStatsV5200ResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoriesStatCategoryDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesGetStatsV5200ResponseDto(readString, readString2, readString3, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetStatsV5200ResponseDto[] newArray(int i) {
            return new StoriesGetStatsV5200ResponseDto[i];
        }
    }

    public StoriesGetStatsV5200ResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.achievement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.achievementSubtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetStatsV5200ResponseDto)) {
            return false;
        }
        StoriesGetStatsV5200ResponseDto storiesGetStatsV5200ResponseDto = (StoriesGetStatsV5200ResponseDto) obj;
        return epx.f(this.preview, storiesGetStatsV5200ResponseDto.preview) && epx.f(this.achievement, storiesGetStatsV5200ResponseDto.achievement) && epx.f(this.achievementSubtitle, storiesGetStatsV5200ResponseDto.achievementSubtitle) && epx.f(this.categories, storiesGetStatsV5200ResponseDto.categories) && epx.f(this.needPrivacyBlock, storiesGetStatsV5200ResponseDto.needPrivacyBlock);
    }

    public final List<StoriesStatCategoryDto> f() {
        return this.categories;
    }

    public final String g() {
        return this.preview;
    }

    public final int hashCode() {
        String str = this.preview;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.achievement;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.achievementSubtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<StoriesStatCategoryDto> list = this.categories;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.needPrivacyBlock;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetStatsV5200ResponseDto(preview=");
        sb.append(this.preview);
        sb.append(", achievement=");
        sb.append(this.achievement);
        sb.append(", achievementSubtitle=");
        sb.append(this.achievementSubtitle);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", needPrivacyBlock=");
        return tn.a(sb, this.needPrivacyBlock, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.preview);
        parcel.writeString(this.achievement);
        parcel.writeString(this.achievementSubtitle);
        List<StoriesStatCategoryDto> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoriesStatCategoryDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.needPrivacyBlock;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public StoriesGetStatsV5200ResponseDto(String str, String str2, String str3, List<StoriesStatCategoryDto> list, Boolean bool) {
        this.preview = str;
        this.achievement = str2;
        this.achievementSubtitle = str3;
        this.categories = list;
        this.needPrivacyBlock = bool;
    }

    public /* synthetic */ StoriesGetStatsV5200ResponseDto(String str, String str2, String str3, List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool);
    }
}
