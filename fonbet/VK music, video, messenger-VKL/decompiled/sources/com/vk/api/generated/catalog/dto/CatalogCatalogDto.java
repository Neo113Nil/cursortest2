package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogCatalogDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<CatalogButtonDto> buttons;

    @pmi0("default_section")
    private final String defaultSection;

    @pmi0("footer")
    private final CatalogFooterDto footer;

    @pmi0("header")
    private final CatalogHeaderDto header;

    @pmi0("pinned_section")
    private final String pinnedSection;

    @pmi0("sections")
    private final List<CatalogSectionDto> sections;

    @pmi0("session_id")
    private final String sessionId;

    /* compiled from: CatalogCatalogDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(CatalogSectionDto.CREATOR, parcel, arrayList, i2, 1);
            }
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            CatalogHeaderDto createFromParcel = parcel.readInt() == 0 ? null : CatalogHeaderDto.CREATOR.createFromParcel(parcel);
            CatalogFooterDto createFromParcel2 = parcel.readInt() == 0 ? null : CatalogFooterDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(CatalogButtonDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new CatalogCatalogDto(arrayList, readString, createFromParcel, createFromParcel2, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogDto[] newArray(int i) {
            return new CatalogCatalogDto[i];
        }
    }

    public CatalogCatalogDto(List<CatalogSectionDto> list, String str, CatalogHeaderDto catalogHeaderDto, CatalogFooterDto catalogFooterDto, List<CatalogButtonDto> list2, String str2, String str3) {
        this.sections = list;
        this.defaultSection = str;
        this.header = catalogHeaderDto;
        this.footer = catalogFooterDto;
        this.buttons = list2;
        this.pinnedSection = str2;
        this.sessionId = str3;
    }

    public final List<CatalogButtonDto> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.defaultSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogDto)) {
            return false;
        }
        CatalogCatalogDto catalogCatalogDto = (CatalogCatalogDto) obj;
        return epx.f(this.sections, catalogCatalogDto.sections) && epx.f(this.defaultSection, catalogCatalogDto.defaultSection) && epx.f(this.header, catalogCatalogDto.header) && epx.f(this.footer, catalogCatalogDto.footer) && epx.f(this.buttons, catalogCatalogDto.buttons) && epx.f(this.pinnedSection, catalogCatalogDto.pinnedSection) && epx.f(this.sessionId, catalogCatalogDto.sessionId);
    }

    public final CatalogFooterDto f() {
        return this.footer;
    }

    public final CatalogHeaderDto g() {
        return this.header;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.sections.hashCode() * 31, 31, this.defaultSection);
        CatalogHeaderDto catalogHeaderDto = this.header;
        int hashCode = (a2 + (catalogHeaderDto == null ? 0 : catalogHeaderDto.hashCode())) * 31;
        CatalogFooterDto catalogFooterDto = this.footer;
        int hashCode2 = (hashCode + (catalogFooterDto == null ? 0 : catalogFooterDto.hashCode())) * 31;
        List<CatalogButtonDto> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pinnedSection;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.pinnedSection;
    }

    public final List<CatalogSectionDto> j() {
        return this.sections;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalogDto(sections=");
        sb.append(this.sections);
        sb.append(", defaultSection=");
        sb.append(this.defaultSection);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", footer=");
        sb.append(this.footer);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", pinnedSection=");
        sb.append(this.pinnedSection);
        sb.append(", sessionId=");
        return ho8.a(sb, this.sessionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sections);
        while (a2.hasNext()) {
            ((CatalogSectionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultSection);
        CatalogHeaderDto catalogHeaderDto = this.header;
        if (catalogHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogHeaderDto.writeToParcel(parcel, i);
        }
        CatalogFooterDto catalogFooterDto = this.footer;
        if (catalogFooterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogFooterDto.writeToParcel(parcel, i);
        }
        List<CatalogButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.pinnedSection);
        parcel.writeString(this.sessionId);
    }

    public /* synthetic */ CatalogCatalogDto(List list, String str, CatalogHeaderDto catalogHeaderDto, CatalogFooterDto catalogFooterDto, List list2, String str2, String str3, int i, zcl zclVar) {
        this(list, str, (i & 4) != 0 ? null : catalogHeaderDto, (i & 8) != 0 ? null : catalogFooterDto, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
