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

/* compiled from: VmojiGetAvatarResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetAvatarResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetAvatarResponseDto> CREATOR = new a();

    @pmi0("avatar")
    private final VmojiAvatarDto avatar;

    @pmi0("characters")
    private final List<VmojiCharacterDto> characters;

    @pmi0("products")
    private final List<VmojiProductDto> products;

    @pmi0("sticker_renders")
    private final List<StickersStickerRenderDto> stickerRenders;

    /* compiled from: VmojiGetAvatarResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetAvatarResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetAvatarResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3 = null;
            VmojiAvatarDto createFromParcel = parcel.readInt() == 0 ? null : VmojiAvatarDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(VmojiCharacterDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VmojiGetAvatarResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(VmojiProductDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new VmojiGetAvatarResponseDto(createFromParcel, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetAvatarResponseDto[] newArray(int i) {
            return new VmojiGetAvatarResponseDto[i];
        }
    }

    public VmojiGetAvatarResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final VmojiAvatarDto d() {
        return this.avatar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VmojiCharacterDto> e() {
        return this.characters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiGetAvatarResponseDto)) {
            return false;
        }
        VmojiGetAvatarResponseDto vmojiGetAvatarResponseDto = (VmojiGetAvatarResponseDto) obj;
        return epx.f(this.avatar, vmojiGetAvatarResponseDto.avatar) && epx.f(this.characters, vmojiGetAvatarResponseDto.characters) && epx.f(this.stickerRenders, vmojiGetAvatarResponseDto.stickerRenders) && epx.f(this.products, vmojiGetAvatarResponseDto.products);
    }

    public final List<VmojiProductDto> f() {
        return this.products;
    }

    public final List<StickersStickerRenderDto> g() {
        return this.stickerRenders;
    }

    public final int hashCode() {
        VmojiAvatarDto vmojiAvatarDto = this.avatar;
        int hashCode = (vmojiAvatarDto == null ? 0 : vmojiAvatarDto.hashCode()) * 31;
        List<VmojiCharacterDto> list = this.characters;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<StickersStickerRenderDto> list2 = this.stickerRenders;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VmojiProductDto> list3 = this.products;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetAvatarResponseDto(avatar=");
        sb.append(this.avatar);
        sb.append(", characters=");
        sb.append(this.characters);
        sb.append(", stickerRenders=");
        sb.append(this.stickerRenders);
        sb.append(", products=");
        return ms9.a(')', sb, this.products);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VmojiAvatarDto vmojiAvatarDto = this.avatar;
        if (vmojiAvatarDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiAvatarDto.writeToParcel(parcel, i);
        }
        List<VmojiCharacterDto> list = this.characters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VmojiCharacterDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<StickersStickerRenderDto> list2 = this.stickerRenders;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<VmojiProductDto> list3 = this.products;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((VmojiProductDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public VmojiGetAvatarResponseDto(VmojiAvatarDto vmojiAvatarDto, List<VmojiCharacterDto> list, List<StickersStickerRenderDto> list2, List<VmojiProductDto> list3) {
        this.avatar = vmojiAvatarDto;
        this.characters = list;
        this.stickerRenders = list2;
        this.products = list3;
    }

    public /* synthetic */ VmojiGetAvatarResponseDto(VmojiAvatarDto vmojiAvatarDto, List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : vmojiAvatarDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
