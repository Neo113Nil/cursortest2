package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersStickerRenderDto.kt */
/* loaded from: classes15.dex */
public final class StickersStickerRenderDto implements Parcelable {
    public static final Parcelable.Creator<StickersStickerRenderDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_rendering")
    private final Boolean isRendering;

    @pmi0("is_stub")
    private final Boolean isStub;

    /* compiled from: StickersStickerRenderDto.kt */
    public static final class a implements Parcelable.Creator<StickersStickerRenderDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStickerRenderDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(StickersStickerRenderDto.class, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersStickerRenderDto(arrayList, readString, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStickerRenderDto[] newArray(int i) {
            return new StickersStickerRenderDto[i];
        }
    }

    public StickersStickerRenderDto(List<BaseImageDto> list, String str, Boolean bool, Boolean bool2) {
        this.images = list;
        this.id = str;
        this.isStub = bool;
        this.isRendering = bool2;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isRendering;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStickerRenderDto)) {
            return false;
        }
        StickersStickerRenderDto stickersStickerRenderDto = (StickersStickerRenderDto) obj;
        return epx.f(this.images, stickersStickerRenderDto.images) && epx.f(this.id, stickersStickerRenderDto.id) && epx.f(this.isStub, stickersStickerRenderDto.isStub) && epx.f(this.isRendering, stickersStickerRenderDto.isRendering);
    }

    public final Boolean f() {
        return this.isStub;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isStub;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRendering;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStickerRenderDto(images=");
        sb.append(this.images);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isStub=");
        sb.append(this.isStub);
        sb.append(", isRendering=");
        return tn.a(sb, this.isRendering, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.id);
        Boolean bool = this.isStub;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isRendering;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ StickersStickerRenderDto(List list, String str, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
