package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppAppListItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppAppListItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppAppListItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("title")
    private final String title;

    /* compiled from: SuperAppAppListItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppAppListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppAppListItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppAppListItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppAppListItemDto(readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppAppListItemDto[] newArray(int i) {
            return new SuperAppAppListItemDto[i];
        }
    }

    public SuperAppAppListItemDto() {
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
        if (!(obj instanceof SuperAppAppListItemDto)) {
            return false;
        }
        SuperAppAppListItemDto superAppAppListItemDto = (SuperAppAppListItemDto) obj;
        return epx.f(this.title, superAppAppListItemDto.title) && epx.f(this.appId, superAppAppListItemDto.appId) && epx.f(this.images, superAppAppListItemDto.images);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.appId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppAppListItemDto(title=");
        sb.append(this.title);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public SuperAppAppListItemDto(String str, Integer num, List<BaseImageDto> list) {
        this.title = str;
        this.appId = num;
        this.images = list;
    }

    public /* synthetic */ SuperAppAppListItemDto(String str, Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
