package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsVkAppsSectionDto.kt */
/* loaded from: classes14.dex */
public final class AppsVkAppsSectionDto implements Parcelable {
    public static final Parcelable.Creator<AppsVkAppsSectionDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("title")
    private final String title;

    @pmi0("view_type")
    private final AppsVkAppsSectionViewTypeDto viewType;

    /* compiled from: AppsVkAppsSectionDto.kt */
    public static final class a implements Parcelable.Creator<AppsVkAppsSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsVkAppsSectionDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AppsVkAppsSectionDto.class, parcel, arrayList, i, 1);
            }
            return new AppsVkAppsSectionDto(readInt, readString, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : AppsVkAppsSectionViewTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsVkAppsSectionDto[] newArray(int i) {
            return new AppsVkAppsSectionDto[i];
        }
    }

    public AppsVkAppsSectionDto(int i, String str, List<AppsAppDto> list, String str2, AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto) {
        this.count = i;
        this.id = str;
        this.items = list;
        this.title = str2;
        this.viewType = appsVkAppsSectionViewTypeDto;
    }

    public final List<AppsAppDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsVkAppsSectionViewTypeDto e() {
        return this.viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsVkAppsSectionDto)) {
            return false;
        }
        AppsVkAppsSectionDto appsVkAppsSectionDto = (AppsVkAppsSectionDto) obj;
        return this.count == appsVkAppsSectionDto.count && epx.f(this.id, appsVkAppsSectionDto.id) && epx.f(this.items, appsVkAppsSectionDto.items) && epx.f(this.title, appsVkAppsSectionDto.title) && this.viewType == appsVkAppsSectionDto.viewType;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(Integer.hashCode(this.count) * 31, 31, this.id), 31, this.items), 31, this.title);
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto = this.viewType;
        return a2 + (appsVkAppsSectionViewTypeDto == null ? 0 : appsVkAppsSectionViewTypeDto.hashCode());
    }

    public final String toString() {
        return "AppsVkAppsSectionDto(count=" + this.count + ", id=" + this.id + ", items=" + this.items + ", title=" + this.title + ", viewType=" + this.viewType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto = this.viewType;
        if (appsVkAppsSectionViewTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsVkAppsSectionViewTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsVkAppsSectionDto(int i, String str, List list, String str2, AppsVkAppsSectionViewTypeDto appsVkAppsSectionViewTypeDto, int i2, zcl zclVar) {
        this(i, str, list, str2, (i2 & 16) != 0 ? null : appsVkAppsSectionViewTypeDto);
    }
}
