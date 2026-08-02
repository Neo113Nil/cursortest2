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
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VmojiProductDto.kt */
/* loaded from: classes15.dex */
public final class VmojiProductDto implements Parcelable {
    public static final Parcelable.Creator<VmojiProductDto> CREATOR = new a();

    @pmi0("badge")
    private final VmojiProductBadgeDto badge;

    @pmi0("constructor_open_params")
    private final VmojiConstructorOpenParamsDto constructorOpenParams;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_locked")
    private final Boolean isLocked;

    @pmi0("is_purchased")
    private final boolean isPurchased;

    @pmi0("is_unlocked")
    private final Boolean isUnlocked;

    @pmi0("preview")
    private final VmojiProductPreviewDto preview;

    @pmi0("price")
    private final VmojiProductPriceDto price;

    @pmi0("title")
    private final String title;

    @pmi0("unlock_info")
    private final VmojiProductUnlockInfoDto unlockInfo;

    /* compiled from: VmojiProductDto.kt */
    public static final class a implements Parcelable.Creator<VmojiProductDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiProductDto createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            VmojiProductPriceDto createFromParcel = VmojiProductPriceDto.CREATOR.createFromParcel(parcel);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = z ? 1 : 0;
                while (i != readInt2) {
                    i = bo.b(VmojiProductDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z ? 1 : 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf2 = Boolean.valueOf(z);
            }
            return new VmojiProductDto(readInt, readString, readString2, createFromParcel, z2, arrayList, valueOf, valueOf2, parcel.readInt() == 0 ? null : VmojiProductUnlockInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VmojiProductBadgeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VmojiProductPreviewDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VmojiConstructorOpenParamsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiProductDto[] newArray(int i) {
            return new VmojiProductDto[i];
        }
    }

    public VmojiProductDto(int i, String str, String str2, VmojiProductPriceDto vmojiProductPriceDto, boolean z, List<BaseImageDto> list, Boolean bool, Boolean bool2, VmojiProductUnlockInfoDto vmojiProductUnlockInfoDto, VmojiProductBadgeDto vmojiProductBadgeDto, VmojiProductPreviewDto vmojiProductPreviewDto, VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto) {
        this.id = i;
        this.title = str;
        this.description = str2;
        this.price = vmojiProductPriceDto;
        this.isPurchased = z;
        this.images = list;
        this.isLocked = bool;
        this.isUnlocked = bool2;
        this.unlockInfo = vmojiProductUnlockInfoDto;
        this.badge = vmojiProductBadgeDto;
        this.preview = vmojiProductPreviewDto;
        this.constructorOpenParams = vmojiConstructorOpenParamsDto;
    }

    public final VmojiConstructorOpenParamsDto d() {
        return this.constructorOpenParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductDto)) {
            return false;
        }
        VmojiProductDto vmojiProductDto = (VmojiProductDto) obj;
        return this.id == vmojiProductDto.id && epx.f(this.title, vmojiProductDto.title) && epx.f(this.description, vmojiProductDto.description) && epx.f(this.price, vmojiProductDto.price) && this.isPurchased == vmojiProductDto.isPurchased && epx.f(this.images, vmojiProductDto.images) && epx.f(this.isLocked, vmojiProductDto.isLocked) && epx.f(this.isUnlocked, vmojiProductDto.isUnlocked) && epx.f(this.unlockInfo, vmojiProductDto.unlockInfo) && epx.f(this.badge, vmojiProductDto.badge) && epx.f(this.preview, vmojiProductDto.preview) && epx.f(this.constructorOpenParams, vmojiProductDto.constructorOpenParams);
    }

    public final VmojiProductPreviewDto f() {
        return this.preview;
    }

    public final VmojiProductPriceDto g() {
        return this.price;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b((this.price.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.description)) * 31, 31, this.isPurchased);
        List<BaseImageDto> list = this.images;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isLocked;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnlocked;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VmojiProductUnlockInfoDto vmojiProductUnlockInfoDto = this.unlockInfo;
        int hashCode4 = (hashCode3 + (vmojiProductUnlockInfoDto == null ? 0 : vmojiProductUnlockInfoDto.hashCode())) * 31;
        VmojiProductBadgeDto vmojiProductBadgeDto = this.badge;
        int hashCode5 = (hashCode4 + (vmojiProductBadgeDto == null ? 0 : vmojiProductBadgeDto.hashCode())) * 31;
        VmojiProductPreviewDto vmojiProductPreviewDto = this.preview;
        int hashCode6 = (hashCode5 + (vmojiProductPreviewDto == null ? 0 : vmojiProductPreviewDto.hashCode())) * 31;
        VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto = this.constructorOpenParams;
        return hashCode6 + (vmojiConstructorOpenParamsDto != null ? vmojiConstructorOpenParamsDto.hashCode() : 0);
    }

    public final VmojiProductUnlockInfoDto i() {
        return this.unlockInfo;
    }

    public final Boolean j() {
        return this.isLocked;
    }

    public final boolean k() {
        return this.isPurchased;
    }

    public final Boolean l() {
        return this.isUnlocked;
    }

    public final String toString() {
        return "VmojiProductDto(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", isPurchased=" + this.isPurchased + ", images=" + this.images + ", isLocked=" + this.isLocked + ", isUnlocked=" + this.isUnlocked + ", unlockInfo=" + this.unlockInfo + ", badge=" + this.badge + ", preview=" + this.preview + ", constructorOpenParams=" + this.constructorOpenParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.price.writeToParcel(parcel, i);
        parcel.writeInt(this.isPurchased ? 1 : 0);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.isLocked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUnlocked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        VmojiProductUnlockInfoDto vmojiProductUnlockInfoDto = this.unlockInfo;
        if (vmojiProductUnlockInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiProductUnlockInfoDto.writeToParcel(parcel, i);
        }
        VmojiProductBadgeDto vmojiProductBadgeDto = this.badge;
        if (vmojiProductBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiProductBadgeDto.writeToParcel(parcel, i);
        }
        VmojiProductPreviewDto vmojiProductPreviewDto = this.preview;
        if (vmojiProductPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiProductPreviewDto.writeToParcel(parcel, i);
        }
        VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto = this.constructorOpenParams;
        if (vmojiConstructorOpenParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiConstructorOpenParamsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VmojiProductDto(int i, String str, String str2, VmojiProductPriceDto vmojiProductPriceDto, boolean z, List list, Boolean bool, Boolean bool2, VmojiProductUnlockInfoDto vmojiProductUnlockInfoDto, VmojiProductBadgeDto vmojiProductBadgeDto, VmojiProductPreviewDto vmojiProductPreviewDto, VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto, int i2, zcl zclVar) {
        this(i, str, str2, vmojiProductPriceDto, z, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : vmojiProductUnlockInfoDto, (i2 & 512) != 0 ? null : vmojiProductBadgeDto, (i2 & 1024) != 0 ? null : vmojiProductPreviewDto, (i2 & 2048) != 0 ? null : vmojiConstructorOpenParamsDto);
    }
}
