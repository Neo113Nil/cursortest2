package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiGetCharacterByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetCharacterByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetCharacterByIdResponseDto> CREATOR = new a();

    @pmi0("character")
    private final VmojiCharacterDto character;

    @pmi0("products")
    private final List<VmojiProductDto> products;

    @pmi0("sticker_renders")
    private final List<StickersStickerRenderDto> stickerRenders;

    /* compiled from: VmojiGetCharacterByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetCharacterByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetCharacterByIdResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            VmojiCharacterDto createFromParcel = parcel.readInt() == 0 ? null : VmojiCharacterDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(VmojiGetCharacterByIdResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(VmojiProductDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new VmojiGetCharacterByIdResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetCharacterByIdResponseDto[] newArray(int i) {
            return new VmojiGetCharacterByIdResponseDto[i];
        }
    }

    public VmojiGetCharacterByIdResponseDto() {
        this(null, null, null, 7, null);
    }

    public final VmojiCharacterDto d() {
        return this.character;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersStickerRenderDto> e() {
        return this.stickerRenders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiGetCharacterByIdResponseDto)) {
            return false;
        }
        VmojiGetCharacterByIdResponseDto vmojiGetCharacterByIdResponseDto = (VmojiGetCharacterByIdResponseDto) obj;
        return epx.f(this.character, vmojiGetCharacterByIdResponseDto.character) && epx.f(this.stickerRenders, vmojiGetCharacterByIdResponseDto.stickerRenders) && epx.f(this.products, vmojiGetCharacterByIdResponseDto.products);
    }

    public final int hashCode() {
        VmojiCharacterDto vmojiCharacterDto = this.character;
        int hashCode = (vmojiCharacterDto == null ? 0 : vmojiCharacterDto.hashCode()) * 31;
        List<StickersStickerRenderDto> list = this.stickerRenders;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VmojiProductDto> list2 = this.products;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetCharacterByIdResponseDto(character=");
        sb.append(this.character);
        sb.append(", stickerRenders=");
        sb.append(this.stickerRenders);
        sb.append(", products=");
        return ms9.a(')', sb, this.products);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VmojiCharacterDto vmojiCharacterDto = this.character;
        if (vmojiCharacterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiCharacterDto.writeToParcel(parcel, i);
        }
        List<StickersStickerRenderDto> list = this.stickerRenders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VmojiProductDto> list2 = this.products;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((VmojiProductDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public VmojiGetCharacterByIdResponseDto(VmojiCharacterDto vmojiCharacterDto, List<StickersStickerRenderDto> list, List<VmojiProductDto> list2) {
        this.character = vmojiCharacterDto;
        this.stickerRenders = list;
        this.products = list2;
    }

    public /* synthetic */ VmojiGetCharacterByIdResponseDto(VmojiCharacterDto vmojiCharacterDto, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : vmojiCharacterDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
