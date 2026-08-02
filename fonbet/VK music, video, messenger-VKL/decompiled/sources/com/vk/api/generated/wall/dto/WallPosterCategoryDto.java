package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPosterCategoryDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterCategoryDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterCategoryDto> CREATOR = new a();

    @pmi0("bkgs")
    private final List<WallPosterCategoryBackgroundDto> bkgs;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    /* compiled from: WallPosterCategoryDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(WallPosterCategoryBackgroundDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallPosterCategoryDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryDto[] newArray(int i) {
            return new WallPosterCategoryDto[i];
        }
    }

    public WallPosterCategoryDto() {
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
        if (!(obj instanceof WallPosterCategoryDto)) {
            return false;
        }
        WallPosterCategoryDto wallPosterCategoryDto = (WallPosterCategoryDto) obj;
        return epx.f(this.id, wallPosterCategoryDto.id) && epx.f(this.name, wallPosterCategoryDto.name) && epx.f(this.bkgs, wallPosterCategoryDto.bkgs);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<WallPosterCategoryBackgroundDto> list = this.bkgs;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPosterCategoryDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", bkgs=");
        return ms9.a(')', sb, this.bkgs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        List<WallPosterCategoryBackgroundDto> list = this.bkgs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((WallPosterCategoryBackgroundDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public WallPosterCategoryDto(String str, String str2, List<WallPosterCategoryBackgroundDto> list) {
        this.id = str;
        this.name = str2;
        this.bkgs = list;
    }

    public /* synthetic */ WallPosterCategoryDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
