package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiCharacterDto.kt */
/* loaded from: classes15.dex */
public final class VmojiCharacterDto implements Parcelable {
    public static final Parcelable.Creator<VmojiCharacterDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("preview")
    private final VmojiCharacterPreviewDto preview;

    @pmi0("product_ids")
    private final List<Integer> productIds;

    /* compiled from: VmojiCharacterDto.kt */
    public static final class a implements Parcelable.Creator<VmojiCharacterDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            VmojiCharacterPreviewDto createFromParcel = parcel.readInt() == 0 ? null : VmojiCharacterPreviewDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VmojiCharacterDto(readString, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiCharacterDto[] newArray(int i) {
            return new VmojiCharacterDto[i];
        }
    }

    public VmojiCharacterDto(String str, VmojiCharacterPreviewDto vmojiCharacterPreviewDto, List<Integer> list) {
        this.id = str;
        this.preview = vmojiCharacterPreviewDto;
        this.productIds = list;
    }

    public final VmojiCharacterPreviewDto d() {
        return this.preview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiCharacterDto)) {
            return false;
        }
        VmojiCharacterDto vmojiCharacterDto = (VmojiCharacterDto) obj;
        return epx.f(this.id, vmojiCharacterDto.id) && epx.f(this.preview, vmojiCharacterDto.preview) && epx.f(this.productIds, vmojiCharacterDto.productIds);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        VmojiCharacterPreviewDto vmojiCharacterPreviewDto = this.preview;
        int hashCode2 = (hashCode + (vmojiCharacterPreviewDto == null ? 0 : vmojiCharacterPreviewDto.hashCode())) * 31;
        List<Integer> list = this.productIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiCharacterDto(id=");
        sb.append(this.id);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", productIds=");
        return ms9.a(')', sb, this.productIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        VmojiCharacterPreviewDto vmojiCharacterPreviewDto = this.preview;
        if (vmojiCharacterPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiCharacterPreviewDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.productIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ VmojiCharacterDto(String str, VmojiCharacterPreviewDto vmojiCharacterPreviewDto, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : vmojiCharacterPreviewDto, (i & 4) != 0 ? null : list);
    }
}
