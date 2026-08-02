package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsGetScopesResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetScopesResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetScopesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsScopeDto> items;

    /* compiled from: AppsGetScopesResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetScopesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetScopesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsScopeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetScopesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetScopesResponseDto[] newArray(int i) {
            return new AppsGetScopesResponseDto[i];
        }
    }

    public AppsGetScopesResponseDto(int i, List<AppsScopeDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<AppsScopeDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetScopesResponseDto)) {
            return false;
        }
        AppsGetScopesResponseDto appsGetScopesResponseDto = (AppsGetScopesResponseDto) obj;
        return this.count == appsGetScopesResponseDto.count && epx.f(this.items, appsGetScopesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetScopesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsScopeDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
