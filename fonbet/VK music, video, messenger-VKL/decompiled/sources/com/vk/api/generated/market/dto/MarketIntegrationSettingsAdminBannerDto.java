package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketIntegrationSettingsAdminBannerDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationSettingsAdminBannerDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationSettingsAdminBannerDto> CREATOR = new a();

    @pmi0("actions")
    private final List<MarketIntegrationSettingsAdminBannerActionDto> actions;

    @pmi0("close_button")
    private final Boolean closeButton;

    @pmi0("logo")
    private final BaseImageDto logo;

    @pmi0("message")
    private final String message;

    @pmi0("modals")
    private final List<MarketIntegrationSettingsAdminBannerModalDto> modals;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketIntegrationSettingsAdminBannerDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationSettingsAdminBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(MarketIntegrationSettingsAdminBannerDto.class.getClassLoader());
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketIntegrationSettingsAdminBannerActionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MarketIntegrationSettingsAdminBannerModalDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketIntegrationSettingsAdminBannerDto(readString, readString2, baseImageDto, arrayList, arrayList2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerDto[] newArray(int i) {
            return new MarketIntegrationSettingsAdminBannerDto[i];
        }
    }

    public MarketIntegrationSettingsAdminBannerDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final List<MarketIntegrationSettingsAdminBannerActionDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.closeButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationSettingsAdminBannerDto)) {
            return false;
        }
        MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto = (MarketIntegrationSettingsAdminBannerDto) obj;
        return epx.f(this.title, marketIntegrationSettingsAdminBannerDto.title) && epx.f(this.message, marketIntegrationSettingsAdminBannerDto.message) && epx.f(this.logo, marketIntegrationSettingsAdminBannerDto.logo) && epx.f(this.actions, marketIntegrationSettingsAdminBannerDto.actions) && epx.f(this.modals, marketIntegrationSettingsAdminBannerDto.modals) && epx.f(this.closeButton, marketIntegrationSettingsAdminBannerDto.closeButton);
    }

    public final BaseImageDto f() {
        return this.logo;
    }

    public final List<MarketIntegrationSettingsAdminBannerModalDto> g() {
        return this.modals;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseImageDto baseImageDto = this.logo;
        int hashCode3 = (hashCode2 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<MarketIntegrationSettingsAdminBannerActionDto> list = this.actions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketIntegrationSettingsAdminBannerModalDto> list2 = this.modals;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.closeButton;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketIntegrationSettingsAdminBannerDto(title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", modals=");
        sb.append(this.modals);
        sb.append(", closeButton=");
        return tn.a(sb, this.closeButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeParcelable(this.logo, i);
        List<MarketIntegrationSettingsAdminBannerActionDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketIntegrationSettingsAdminBannerActionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketIntegrationSettingsAdminBannerModalDto> list2 = this.modals;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketIntegrationSettingsAdminBannerModalDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.closeButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MarketIntegrationSettingsAdminBannerDto(String str, String str2, BaseImageDto baseImageDto, List<MarketIntegrationSettingsAdminBannerActionDto> list, List<MarketIntegrationSettingsAdminBannerModalDto> list2, Boolean bool) {
        this.title = str;
        this.message = str2;
        this.logo = baseImageDto;
        this.actions = list;
        this.modals = list2;
        this.closeButton = bool;
    }

    public /* synthetic */ MarketIntegrationSettingsAdminBannerDto(String str, String str2, BaseImageDto baseImageDto, List list, List list2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseImageDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : bool);
    }
}
