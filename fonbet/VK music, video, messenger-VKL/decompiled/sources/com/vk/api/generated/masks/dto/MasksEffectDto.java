package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MasksEffectDto.kt */
/* loaded from: classes15.dex */
public final class MasksEffectDto implements Parcelable {
    public static final Parcelable.Creator<MasksEffectDto> CREATOR = new a();

    @pmi0("category")
    private final MasksCategoryDto category;

    @pmi0("category_display")
    private final String categoryDisplay;

    @pmi0("id")
    private final int id;

    @pmi0("is_disabled")
    private final boolean isDisabled;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("previews")
    private final List<BaseImageDto> previews;

    @pmi0("texts")
    private final List<String> texts;

    @pmi0("url")
    private final String url;

    @pmi0("version_id")
    private final Integer versionId;

    /* compiled from: MasksEffectDto.kt */
    public static final class a implements Parcelable.Creator<MasksEffectDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MasksEffectDto createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            ArrayList arrayList;
            Boolean bool;
            Boolean bool2;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MasksEffectDto.class.getClassLoader());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
                i = 1;
            } else {
                z = false;
                i = 1;
            }
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                bool = null;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = z ? 1 : 0;
                while (i2 != readInt2) {
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i2, i);
                }
                bool = null;
            }
            String readString2 = parcel.readString();
            Boolean bool3 = bool;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            MasksCategoryDto masksCategoryDto = (MasksCategoryDto) (parcel.readInt() == 0 ? bool3 : MasksCategoryDto.CREATOR.createFromParcel(parcel));
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool2 = bool3;
            } else {
                boolean z3 = z;
                if (parcel.readInt() != 0) {
                    z3 = i;
                }
                bool2 = Boolean.valueOf(z3);
            }
            return new MasksEffectDto(readInt, userId, z2, readString, valueOf, arrayList, readString2, createStringArrayList, masksCategoryDto, readString3, bool2);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksEffectDto[] newArray(int i) {
            return new MasksEffectDto[i];
        }
    }

    public MasksEffectDto(int i, UserId userId, boolean z, String str, Integer num, List<BaseImageDto> list, String str2, List<String> list2, MasksCategoryDto masksCategoryDto, String str3, Boolean bool) {
        this.id = i;
        this.ownerId = userId;
        this.isDisabled = z;
        this.url = str;
        this.versionId = num;
        this.previews = list;
        this.name = str2;
        this.texts = list2;
        this.category = masksCategoryDto;
        this.categoryDisplay = str3;
        this.isFavorite = bool;
    }

    public final String d() {
        return this.categoryDisplay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksEffectDto)) {
            return false;
        }
        MasksEffectDto masksEffectDto = (MasksEffectDto) obj;
        return this.id == masksEffectDto.id && epx.f(this.ownerId, masksEffectDto.ownerId) && this.isDisabled == masksEffectDto.isDisabled && epx.f(this.url, masksEffectDto.url) && epx.f(this.versionId, masksEffectDto.versionId) && epx.f(this.previews, masksEffectDto.previews) && epx.f(this.name, masksEffectDto.name) && epx.f(this.texts, masksEffectDto.texts) && this.category == masksEffectDto.category && epx.f(this.categoryDisplay, masksEffectDto.categoryDisplay) && epx.f(this.isFavorite, masksEffectDto.isFavorite);
    }

    public final List<BaseImageDto> f() {
        return this.previews;
    }

    public final boolean g() {
        return this.isDisabled;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.isDisabled);
        String str = this.url;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.versionId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.previews;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.texts;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MasksCategoryDto masksCategoryDto = this.category;
        int hashCode6 = (hashCode5 + (masksCategoryDto == null ? 0 : masksCategoryDto.hashCode())) * 31;
        String str3 = this.categoryDisplay;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isFavorite;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksEffectDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", versionId=");
        sb.append(this.versionId);
        sb.append(", previews=");
        sb.append(this.previews);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", categoryDisplay=");
        sb.append(this.categoryDisplay);
        sb.append(", isFavorite=");
        return tn.a(sb, this.isFavorite, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.isDisabled ? 1 : 0);
        parcel.writeString(this.url);
        Integer num = this.versionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.previews;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.name);
        parcel.writeStringList(this.texts);
        MasksCategoryDto masksCategoryDto = this.category;
        if (masksCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksCategoryDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.categoryDisplay);
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MasksEffectDto(int i, UserId userId, boolean z, String str, Integer num, List list, String str2, List list2, MasksCategoryDto masksCategoryDto, String str3, Boolean bool, int i2, zcl zclVar) {
        this(i, userId, z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : masksCategoryDto, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : bool);
    }
}
