package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MasksCatalogRowDto.kt */
/* loaded from: classes15.dex */
public final class MasksCatalogRowDto implements Parcelable {
    public static final Parcelable.Creator<MasksCatalogRowDto> CREATOR = new a();

    @pmi0("masks")
    private final List<MasksMaskDto> masks;

    @pmi0("section")
    private final MasksSectionDto section;

    /* compiled from: MasksCatalogRowDto.kt */
    public static final class a implements Parcelable.Creator<MasksCatalogRowDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCatalogRowDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MasksSectionDto createFromParcel = MasksSectionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MasksCatalogRowDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MasksCatalogRowDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCatalogRowDto[] newArray(int i) {
            return new MasksCatalogRowDto[i];
        }
    }

    public MasksCatalogRowDto(MasksSectionDto masksSectionDto, List<MasksMaskDto> list) {
        this.section = masksSectionDto;
        this.masks = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksCatalogRowDto)) {
            return false;
        }
        MasksCatalogRowDto masksCatalogRowDto = (MasksCatalogRowDto) obj;
        return epx.f(this.section, masksCatalogRowDto.section) && epx.f(this.masks, masksCatalogRowDto.masks);
    }

    public final int hashCode() {
        int hashCode = this.section.hashCode() * 31;
        List<MasksMaskDto> list = this.masks;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksCatalogRowDto(section=");
        sb.append(this.section);
        sb.append(", masks=");
        return ms9.a(')', sb, this.masks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.section.writeToParcel(parcel, i);
        List<MasksMaskDto> list = this.masks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MasksCatalogRowDto(MasksSectionDto masksSectionDto, List list, int i, zcl zclVar) {
        this(masksSectionDto, (i & 2) != 0 ? null : list);
    }
}
