package com.vk.api.generated.apps.dto;

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAppForProfileModalCardButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppForProfileModalCardButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppForProfileModalCardButtonDto> CREATOR = new a();

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsAppForProfileModalCardButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppForProfileModalCardButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppForProfileModalCardButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(AppsAppForProfileModalCardButtonDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsAppForProfileModalCardButtonDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppForProfileModalCardButtonDto[] newArray(int i) {
            return new AppsAppForProfileModalCardButtonDto[i];
        }
    }

    public AppsAppForProfileModalCardButtonDto(int i, String str, List<BaseImageDto> list) {
        this.id = i;
        this.title = str;
        this.icons = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppForProfileModalCardButtonDto)) {
            return false;
        }
        AppsAppForProfileModalCardButtonDto appsAppForProfileModalCardButtonDto = (AppsAppForProfileModalCardButtonDto) obj;
        return this.id == appsAppForProfileModalCardButtonDto.id && epx.f(this.title, appsAppForProfileModalCardButtonDto.title) && epx.f(this.icons, appsAppForProfileModalCardButtonDto.icons);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        List<BaseImageDto> list = this.icons;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppForProfileModalCardButtonDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ AppsAppForProfileModalCardButtonDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
