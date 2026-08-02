package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: CatalogHintDto.kt */
/* loaded from: classes14.dex */
public final class CatalogHintDto implements Parcelable {
    public static final Parcelable.Creator<CatalogHintDto> CREATOR = new a();

    @pmi0("actions")
    private final List<BaseLinkButtonDto> actions;

    @pmi0("campaign_name")
    private final String campaignName;

    @pmi0("id")
    private final String id;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("unskipable")
    private final Boolean unskipable;

    /* compiled from: CatalogHintDto.kt */
    public static final class a implements Parcelable.Creator<CatalogHintDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogHintDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(CatalogHintDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogHintDto(readString, readString2, readString3, readString4, valueOf, readString5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogHintDto[] newArray(int i) {
            return new CatalogHintDto[i];
        }
    }

    public CatalogHintDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final List<BaseLinkButtonDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.campaignName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogHintDto)) {
            return false;
        }
        CatalogHintDto catalogHintDto = (CatalogHintDto) obj;
        return epx.f(this.id, catalogHintDto.id) && epx.f(this.title, catalogHintDto.title) && epx.f(this.text, catalogHintDto.text) && epx.f(this.type, catalogHintDto.type) && epx.f(this.unskipable, catalogHintDto.unskipable) && epx.f(this.campaignName, catalogHintDto.campaignName) && epx.f(this.actions, catalogHintDto.actions);
    }

    public final String f() {
        return this.text;
    }

    public final Boolean g() {
        return this.unskipable;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.unskipable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.campaignName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BaseLinkButtonDto> list = this.actions;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogHintDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", unskipable=");
        sb.append(this.unskipable);
        sb.append(", campaignName=");
        sb.append(this.campaignName);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.type);
        Boolean bool = this.unskipable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.campaignName);
        List<BaseLinkButtonDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public CatalogHintDto(String str, String str2, String str3, String str4, Boolean bool, String str5, List<BaseLinkButtonDto> list) {
        this.id = str;
        this.title = str2;
        this.text = str3;
        this.type = str4;
        this.unskipable = bool;
        this.campaignName = str5;
        this.actions = list;
    }

    public /* synthetic */ CatalogHintDto(String str, String str2, String str3, String str4, Boolean bool, String str5, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list);
    }
}
