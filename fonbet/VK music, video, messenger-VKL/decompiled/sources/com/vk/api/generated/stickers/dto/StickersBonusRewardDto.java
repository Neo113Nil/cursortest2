package com.vk.api.generated.stickers.dto;

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
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickersBonusRewardDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusRewardDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusRewardDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("has_terms")
    private final Boolean hasTerms;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("note")
    private final String note;

    @pmi0("price")
    private final int price;

    /* compiled from: StickersBonusRewardDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusRewardDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusRewardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(StickersBonusRewardDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersBonusRewardDto(readString, readString2, readInt, readString3, readString4, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusRewardDto[] newArray(int i) {
            return new StickersBonusRewardDto[i];
        }
    }

    public StickersBonusRewardDto(String str, String str2, int i, String str3, String str4, List<BaseImageDto> list, Boolean bool) {
        this.id = str;
        this.name = str2;
        this.price = i;
        this.description = str3;
        this.note = str4;
        this.icon = list;
        this.hasTerms = bool;
    }

    public final Boolean d() {
        return this.hasTerms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusRewardDto)) {
            return false;
        }
        StickersBonusRewardDto stickersBonusRewardDto = (StickersBonusRewardDto) obj;
        return epx.f(this.id, stickersBonusRewardDto.id) && epx.f(this.name, stickersBonusRewardDto.name) && this.price == stickersBonusRewardDto.price && epx.f(this.description, stickersBonusRewardDto.description) && epx.f(this.note, stickersBonusRewardDto.note) && epx.f(this.icon, stickersBonusRewardDto.icon) && epx.f(this.hasTerms, stickersBonusRewardDto.hasTerms);
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.note;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.price, urd0.a(this.id.hashCode() * 31, 31, this.name), 31);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasTerms;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final int i() {
        return this.price;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusRewardDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", hasTerms=");
        return tn.a(sb, this.hasTerms, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.price);
        parcel.writeString(this.description);
        parcel.writeString(this.note);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.hasTerms;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ StickersBonusRewardDto(String str, String str2, int i, String str3, String str4, List list, Boolean bool, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool);
    }
}
