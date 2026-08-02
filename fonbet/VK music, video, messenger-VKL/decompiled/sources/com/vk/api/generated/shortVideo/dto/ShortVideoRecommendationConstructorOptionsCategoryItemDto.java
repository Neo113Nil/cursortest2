package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoRecommendationConstructorOptionsCategoryItemDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecommendationConstructorOptionsCategoryItemDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryItemDto> CREATOR = new a();

    @pmi0("default_active_state")
    private final boolean defaultActiveState;

    @pmi0("description")
    private final String description;

    @pmi0("feed_construction_marks")
    private final List<Integer> feedConstructionMarks;

    @pmi0("feed_construction_marks_inactive")
    private final List<Integer> feedConstructionMarksInactive;

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> images;

    @pmi0("title")
    private final String title;

    /* compiled from: ShortVideoRecommendationConstructorOptionsCategoryItemDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecommendationConstructorOptionsCategoryItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryItemDto createFromParcel(Parcel parcel) {
            int i;
            int i2;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i3 = 0;
            while (i3 != readInt) {
                i3 = pm0.b(parcel, arrayList2, i3, 1);
            }
            int readInt2 = parcel.readInt();
            boolean z = false;
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i4 = 0;
            while (i4 != readInt2) {
                i4 = pm0.b(parcel, arrayList3, i4, 1);
            }
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
                i2 = 1;
            } else {
                i = 0;
                i2 = 1;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(ShortVideoRecommendationConstructorOptionsCategoryItemImageDto.CREATOR, parcel, arrayList4, i, i2);
                }
                arrayList = arrayList4;
            }
            return new ShortVideoRecommendationConstructorOptionsCategoryItemDto(readString, readString2, arrayList2, arrayList3, z, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecommendationConstructorOptionsCategoryItemDto[] newArray(int i) {
            return new ShortVideoRecommendationConstructorOptionsCategoryItemDto[i];
        }
    }

    public ShortVideoRecommendationConstructorOptionsCategoryItemDto(String str, String str2, List<Integer> list, List<Integer> list2, boolean z, String str3, List<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> list3) {
        this.id = str;
        this.title = str2;
        this.feedConstructionMarks = list;
        this.feedConstructionMarksInactive = list2;
        this.defaultActiveState = z;
        this.description = str3;
        this.images = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoRecommendationConstructorOptionsCategoryItemDto)) {
            return false;
        }
        ShortVideoRecommendationConstructorOptionsCategoryItemDto shortVideoRecommendationConstructorOptionsCategoryItemDto = (ShortVideoRecommendationConstructorOptionsCategoryItemDto) obj;
        return epx.f(this.id, shortVideoRecommendationConstructorOptionsCategoryItemDto.id) && epx.f(this.title, shortVideoRecommendationConstructorOptionsCategoryItemDto.title) && epx.f(this.feedConstructionMarks, shortVideoRecommendationConstructorOptionsCategoryItemDto.feedConstructionMarks) && epx.f(this.feedConstructionMarksInactive, shortVideoRecommendationConstructorOptionsCategoryItemDto.feedConstructionMarksInactive) && this.defaultActiveState == shortVideoRecommendationConstructorOptionsCategoryItemDto.defaultActiveState && epx.f(this.description, shortVideoRecommendationConstructorOptionsCategoryItemDto.description) && epx.f(this.images, shortVideoRecommendationConstructorOptionsCategoryItemDto.images);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.feedConstructionMarks), 31, this.feedConstructionMarksInactive), 31, this.defaultActiveState);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> list = this.images;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoRecommendationConstructorOptionsCategoryItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", feedConstructionMarks=");
        sb.append(this.feedConstructionMarks);
        sb.append(", feedConstructionMarksInactive=");
        sb.append(this.feedConstructionMarksInactive);
        sb.append(", defaultActiveState=");
        sb.append(this.defaultActiveState);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.feedConstructionMarks);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        Iterator a3 = ao.a(parcel, this.feedConstructionMarksInactive);
        while (a3.hasNext()) {
            parcel.writeInt(((Number) a3.next()).intValue());
        }
        parcel.writeInt(this.defaultActiveState ? 1 : 0);
        parcel.writeString(this.description);
        List<ShortVideoRecommendationConstructorOptionsCategoryItemImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ShortVideoRecommendationConstructorOptionsCategoryItemImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoRecommendationConstructorOptionsCategoryItemDto(String str, String str2, List list, List list2, boolean z, String str3, List list3, int i, zcl zclVar) {
        this(str, str2, list, list2, z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list3);
    }
}
