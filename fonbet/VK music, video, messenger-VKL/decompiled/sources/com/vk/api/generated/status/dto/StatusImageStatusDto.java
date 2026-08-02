package com.vk.api.generated.status.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StatusImageStatusDto.kt */
/* loaded from: classes15.dex */
public final class StatusImageStatusDto implements Parcelable {
    public static final Parcelable.Creator<StatusImageStatusDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("tags")
    private final List<String> tags;

    /* compiled from: StatusImageStatusDto.kt */
    public static final class a implements Parcelable.Creator<StatusImageStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final StatusImageStatusDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StatusImageStatusDto(readInt, readString, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final StatusImageStatusDto[] newArray(int i) {
            return new StatusImageStatusDto[i];
        }
    }

    public StatusImageStatusDto(int i, String str, List<BaseImageDto> list, List<String> list2) {
        this.id = i;
        this.name = str;
        this.images = list;
        this.tags = list2;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImageStatusDto)) {
            return false;
        }
        StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) obj;
        return this.id == statusImageStatusDto.id && epx.f(this.name, statusImageStatusDto.name) && epx.f(this.images, statusImageStatusDto.images) && epx.f(this.tags, statusImageStatusDto.tags);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.images);
        List<String> list = this.tags;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusImageStatusDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", tags=");
        return ms9.a(')', sb, this.tags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.tags);
    }

    public /* synthetic */ StatusImageStatusDto(int i, String str, List list, List list2, int i2, zcl zclVar) {
        this(i, str, list, (i2 & 8) != 0 ? null : list2);
    }
}
