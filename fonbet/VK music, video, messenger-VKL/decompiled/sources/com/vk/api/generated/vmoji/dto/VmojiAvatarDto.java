package com.vk.api.generated.vmoji.dto;

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
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VmojiAvatarDto.kt */
/* loaded from: classes15.dex */
public final class VmojiAvatarDto implements Parcelable {
    public static final Parcelable.Creator<VmojiAvatarDto> CREATOR = new a();

    @pmi0("add_hash")
    private final String addHash;

    @pmi0("can_share")
    private final boolean canShare;

    @pmi0("character_id")
    private final String characterId;

    @pmi0("constructor_new_items")
    private final VmojiConstructorNewItemsDto constructorNewItems;

    @pmi0("id")
    private final String id;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("is_suggested")
    private final Boolean isSuggested;

    @pmi0("name")
    private final String name;

    @pmi0("photo_images")
    private final List<BaseImageDto> photoImages;

    /* compiled from: VmojiAvatarDto.kt */
    public static final class a implements Parcelable.Creator<VmojiAvatarDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarDto createFromParcel(Parcel parcel) {
            int i;
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? 1 : i);
            }
            String readString4 = parcel.readString();
            VmojiConstructorNewItemsDto createFromParcel = parcel.readInt() == 0 ? null : VmojiConstructorNewItemsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? 1 : i);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(VmojiAvatarDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VmojiAvatarDto(readString, readString2, readString3, z, valueOf, readString4, createFromParcel, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarDto[] newArray(int i) {
            return new VmojiAvatarDto[i];
        }
    }

    public VmojiAvatarDto(String str, String str2, String str3, boolean z, Boolean bool, String str4, VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto, Boolean bool2, List<BaseImageDto> list) {
        this.id = str;
        this.characterId = str2;
        this.name = str3;
        this.canShare = z;
        this.isActive = bool;
        this.addHash = str4;
        this.constructorNewItems = vmojiConstructorNewItemsDto;
        this.isSuggested = bool2;
        this.photoImages = list;
    }

    public final String d() {
        return this.characterId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VmojiConstructorNewItemsDto e() {
        return this.constructorNewItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiAvatarDto)) {
            return false;
        }
        VmojiAvatarDto vmojiAvatarDto = (VmojiAvatarDto) obj;
        return epx.f(this.id, vmojiAvatarDto.id) && epx.f(this.characterId, vmojiAvatarDto.characterId) && epx.f(this.name, vmojiAvatarDto.name) && this.canShare == vmojiAvatarDto.canShare && epx.f(this.isActive, vmojiAvatarDto.isActive) && epx.f(this.addHash, vmojiAvatarDto.addHash) && epx.f(this.constructorNewItems, vmojiAvatarDto.constructorNewItems) && epx.f(this.isSuggested, vmojiAvatarDto.isSuggested) && epx.f(this.photoImages, vmojiAvatarDto.photoImages);
    }

    public final String f() {
        return this.name;
    }

    public final Boolean g() {
        return this.isActive;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.characterId), 31, this.name), 31, this.canShare);
        Boolean bool = this.isActive;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.addHash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto = this.constructorNewItems;
        int hashCode3 = (hashCode2 + (vmojiConstructorNewItemsDto == null ? 0 : vmojiConstructorNewItemsDto.hashCode())) * 31;
        Boolean bool2 = this.isSuggested;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BaseImageDto> list = this.photoImages;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAvatarDto(id=");
        sb.append(this.id);
        sb.append(", characterId=");
        sb.append(this.characterId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", canShare=");
        sb.append(this.canShare);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", addHash=");
        sb.append(this.addHash);
        sb.append(", constructorNewItems=");
        sb.append(this.constructorNewItems);
        sb.append(", isSuggested=");
        sb.append(this.isSuggested);
        sb.append(", photoImages=");
        return ms9.a(')', sb, this.photoImages);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.characterId);
        parcel.writeString(this.name);
        parcel.writeInt(this.canShare ? 1 : 0);
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.addHash);
        VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto = this.constructorNewItems;
        if (vmojiConstructorNewItemsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiConstructorNewItemsDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isSuggested;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<BaseImageDto> list = this.photoImages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ VmojiAvatarDto(String str, String str2, String str3, boolean z, Boolean bool, String str4, VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto, Boolean bool2, List list, int i, zcl zclVar) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : vmojiConstructorNewItemsDto, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : list);
    }
}
