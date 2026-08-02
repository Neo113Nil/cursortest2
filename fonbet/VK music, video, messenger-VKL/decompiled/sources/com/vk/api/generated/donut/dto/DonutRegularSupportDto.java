package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutRegularSupportDto.kt */
/* loaded from: classes14.dex */
public final class DonutRegularSupportDto implements Parcelable {
    public static final Parcelable.Creator<DonutRegularSupportDto> CREATOR = new a();

    @pmi0("accessibility_subtitle")
    private final String accessibilitySubtitle;

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("benefits")
    private final List<DonutBenefitBlockDto> benefits;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutRegularSupportDto.kt */
    public static final class a implements Parcelable.Creator<DonutRegularSupportDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutRegularSupportDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(DonutRegularSupportDto.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(DonutBenefitBlockDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new DonutRegularSupportDto(readString, baseLinkButtonDto, readString2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutRegularSupportDto[] newArray(int i) {
            return new DonutRegularSupportDto[i];
        }
    }

    public DonutRegularSupportDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2, List<DonutBenefitBlockDto> list, String str3) {
        this.title = str;
        this.actionButton = baseLinkButtonDto;
        this.subtitle = str2;
        this.benefits = list;
        this.accessibilitySubtitle = str3;
    }

    public final String d() {
        return this.accessibilitySubtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.actionButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutRegularSupportDto)) {
            return false;
        }
        DonutRegularSupportDto donutRegularSupportDto = (DonutRegularSupportDto) obj;
        return epx.f(this.title, donutRegularSupportDto.title) && epx.f(this.actionButton, donutRegularSupportDto.actionButton) && epx.f(this.subtitle, donutRegularSupportDto.subtitle) && epx.f(this.benefits, donutRegularSupportDto.benefits) && epx.f(this.accessibilitySubtitle, donutRegularSupportDto.accessibilitySubtitle);
    }

    public final List<DonutBenefitBlockDto> f() {
        return this.benefits;
    }

    public final String g() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.actionButton.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DonutBenefitBlockDto> list = this.benefits;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.accessibilitySubtitle;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutRegularSupportDto(title=");
        sb.append(this.title);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", benefits=");
        sb.append(this.benefits);
        sb.append(", accessibilitySubtitle=");
        return ho8.a(sb, this.accessibilitySubtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeString(this.subtitle);
        List<DonutBenefitBlockDto> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((DonutBenefitBlockDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.accessibilitySubtitle);
    }

    public /* synthetic */ DonutRegularSupportDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2, List list, String str3, int i, zcl zclVar) {
        this(str, baseLinkButtonDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3);
    }
}
