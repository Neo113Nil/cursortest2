package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesGetCatalogTemplatesExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetCatalogTemplatesExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetCatalogTemplatesExtendedResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<StoriesTemplateDto> items;

    @pmi0("new_templates_count")
    private final Integer newTemplatesCount;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: StoriesGetCatalogTemplatesExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetCatalogTemplatesExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetCatalogTemplatesExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StoriesTemplateDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoriesGetCatalogTemplatesExtendedResponseDto(readInt, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetCatalogTemplatesExtendedResponseDto[] newArray(int i) {
            return new StoriesGetCatalogTemplatesExtendedResponseDto[i];
        }
    }

    public StoriesGetCatalogTemplatesExtendedResponseDto(int i, List<StoriesTemplateDto> list, String str, Integer num) {
        this.totalCount = i;
        this.items = list;
        this.nextFrom = str;
        this.newTemplatesCount = num;
    }

    public final List<StoriesTemplateDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.newTemplatesCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetCatalogTemplatesExtendedResponseDto)) {
            return false;
        }
        StoriesGetCatalogTemplatesExtendedResponseDto storiesGetCatalogTemplatesExtendedResponseDto = (StoriesGetCatalogTemplatesExtendedResponseDto) obj;
        return this.totalCount == storiesGetCatalogTemplatesExtendedResponseDto.totalCount && epx.f(this.items, storiesGetCatalogTemplatesExtendedResponseDto.items) && epx.f(this.nextFrom, storiesGetCatalogTemplatesExtendedResponseDto.nextFrom) && epx.f(this.newTemplatesCount, storiesGetCatalogTemplatesExtendedResponseDto.newTemplatesCount);
    }

    public final int f() {
        return this.totalCount;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.newTemplatesCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetCatalogTemplatesExtendedResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", newTemplatesCount=");
        return uqi.b(sb, this.newTemplatesCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesTemplateDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        Integer num = this.newTemplatesCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ StoriesGetCatalogTemplatesExtendedResponseDto(int i, List list, String str, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num);
    }
}
