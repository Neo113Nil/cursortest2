package com.vk.api.generated.specials.dto;

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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpecialsBackgroundThemeDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsBackgroundThemeDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsBackgroundThemeDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("images")
    private final List<BaseImageDto> images;

    /* compiled from: SpecialsBackgroundThemeDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsBackgroundThemeDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsBackgroundThemeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SpecialsBackgroundThemeDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SpecialsBackgroundThemeDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsBackgroundThemeDto[] newArray(int i) {
            return new SpecialsBackgroundThemeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpecialsBackgroundThemeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsBackgroundThemeDto)) {
            return false;
        }
        SpecialsBackgroundThemeDto specialsBackgroundThemeDto = (SpecialsBackgroundThemeDto) obj;
        return epx.f(this.color, specialsBackgroundThemeDto.color) && epx.f(this.images, specialsBackgroundThemeDto.images);
    }

    public final int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsBackgroundThemeDto(color=");
        sb.append(this.color);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
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

    public SpecialsBackgroundThemeDto(String str, List<BaseImageDto> list) {
        this.color = str;
        this.images = list;
    }

    public /* synthetic */ SpecialsBackgroundThemeDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
