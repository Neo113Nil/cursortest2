package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogVideoShowcaseGalleryDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoShowcaseGalleryDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoShowcaseGalleryDto> CREATOR = new a();

    @pmi0("actions")
    private final List<CatalogButtonDto> actions;

    @pmi0("block_id")
    private final String blockId;

    @pmi0("block_name")
    private final String blockName;

    @pmi0("block_stat_name")
    private final String blockStatName;

    @pmi0("container_row")
    private final Integer containerRow;

    @pmi0("data_type")
    private final CatalogBlockDataTypeDto dataType;

    @pmi0("enable_animation")
    private final Boolean enableAnimation;

    @pmi0("gallery_id")
    private final String galleryId;

    @pmi0("has_actions")
    private final Boolean hasActions;

    @pmi0("hide_button_text")
    private final String hideButtonText;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final CatalogLayoutDto layout;

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogVideoShowcaseGalleryDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoShowcaseGalleryDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoShowcaseGalleryDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            CatalogBlockDataTypeDto createFromParcel = CatalogBlockDataTypeDto.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            CatalogLayoutDto createFromParcel2 = parcel.readInt() == 0 ? null : CatalogLayoutDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(CatalogButtonDto.CREATOR, parcel, arrayList2, i, 1);
                    readString = readString;
                }
                arrayList = arrayList2;
            }
            return new CatalogVideoShowcaseGalleryDto(readString, readString2, readString3, readString4, readString5, createFromParcel, readString6, valueOf3, valueOf, createFromParcel2, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoShowcaseGalleryDto[] newArray(int i) {
            return new CatalogVideoShowcaseGalleryDto[i];
        }
    }

    public CatalogVideoShowcaseGalleryDto(String str, String str2, String str3, String str4, String str5, CatalogBlockDataTypeDto catalogBlockDataTypeDto, String str6, Integer num, Boolean bool, CatalogLayoutDto catalogLayoutDto, Boolean bool2, List<CatalogButtonDto> list) {
        this.title = str;
        this.hideButtonText = str2;
        this.galleryId = str3;
        this.blockId = str4;
        this.blockName = str5;
        this.dataType = catalogBlockDataTypeDto;
        this.blockStatName = str6;
        this.containerRow = num;
        this.enableAnimation = bool;
        this.layout = catalogLayoutDto;
        this.hasActions = bool2;
        this.actions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoShowcaseGalleryDto)) {
            return false;
        }
        CatalogVideoShowcaseGalleryDto catalogVideoShowcaseGalleryDto = (CatalogVideoShowcaseGalleryDto) obj;
        return epx.f(this.title, catalogVideoShowcaseGalleryDto.title) && epx.f(this.hideButtonText, catalogVideoShowcaseGalleryDto.hideButtonText) && epx.f(this.galleryId, catalogVideoShowcaseGalleryDto.galleryId) && epx.f(this.blockId, catalogVideoShowcaseGalleryDto.blockId) && epx.f(this.blockName, catalogVideoShowcaseGalleryDto.blockName) && this.dataType == catalogVideoShowcaseGalleryDto.dataType && epx.f(this.blockStatName, catalogVideoShowcaseGalleryDto.blockStatName) && epx.f(this.containerRow, catalogVideoShowcaseGalleryDto.containerRow) && epx.f(this.enableAnimation, catalogVideoShowcaseGalleryDto.enableAnimation) && epx.f(this.layout, catalogVideoShowcaseGalleryDto.layout) && epx.f(this.hasActions, catalogVideoShowcaseGalleryDto.hasActions) && epx.f(this.actions, catalogVideoShowcaseGalleryDto.actions);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.dataType.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.hideButtonText), 31, this.galleryId), 31, this.blockId), 31, this.blockName)) * 31, 31, this.blockStatName);
        Integer num = this.containerRow;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.enableAnimation;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CatalogLayoutDto catalogLayoutDto = this.layout;
        int hashCode3 = (hashCode2 + (catalogLayoutDto == null ? 0 : catalogLayoutDto.hashCode())) * 31;
        Boolean bool2 = this.hasActions;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<CatalogButtonDto> list = this.actions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoShowcaseGalleryDto(title=");
        sb.append(this.title);
        sb.append(", hideButtonText=");
        sb.append(this.hideButtonText);
        sb.append(", galleryId=");
        sb.append(this.galleryId);
        sb.append(", blockId=");
        sb.append(this.blockId);
        sb.append(", blockName=");
        sb.append(this.blockName);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", blockStatName=");
        sb.append(this.blockStatName);
        sb.append(", containerRow=");
        sb.append(this.containerRow);
        sb.append(", enableAnimation=");
        sb.append(this.enableAnimation);
        sb.append(", layout=");
        sb.append(this.layout);
        sb.append(", hasActions=");
        sb.append(this.hasActions);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.hideButtonText);
        parcel.writeString(this.galleryId);
        parcel.writeString(this.blockId);
        parcel.writeString(this.blockName);
        this.dataType.writeToParcel(parcel, i);
        parcel.writeString(this.blockStatName);
        Integer num = this.containerRow;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.enableAnimation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        CatalogLayoutDto catalogLayoutDto = this.layout;
        if (catalogLayoutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogLayoutDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.hasActions;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<CatalogButtonDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((CatalogButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogVideoShowcaseGalleryDto(String str, String str2, String str3, String str4, String str5, CatalogBlockDataTypeDto catalogBlockDataTypeDto, String str6, Integer num, Boolean bool, CatalogLayoutDto catalogLayoutDto, Boolean bool2, List list, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, catalogBlockDataTypeDto, str6, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : catalogLayoutDto, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : list);
    }
}
