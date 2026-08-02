package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsCatchUpLinkDto.kt */
/* loaded from: classes14.dex */
public final class AdsCatchUpLinkDto implements Parcelable {
    public static final Parcelable.Creator<AdsCatchUpLinkDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("allow_hide")
    private final Boolean allowHide;

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("ttl")
    private final int ttl;

    /* compiled from: AdsCatchUpLinkDto.kt */
    public static final class a implements Parcelable.Creator<AdsCatchUpLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsCatchUpLinkDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            BaseLinkButtonActionDto baseLinkButtonActionDto = (BaseLinkButtonActionDto) parcel.readParcelable(AdsCatchUpLinkDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AdsCatchUpLinkDto.class, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdsCatchUpLinkDto(baseLinkButtonActionDto, arrayList, readString, readInt2, valueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsCatchUpLinkDto[] newArray(int i) {
            return new AdsCatchUpLinkDto[i];
        }
    }

    public AdsCatchUpLinkDto(BaseLinkButtonActionDto baseLinkButtonActionDto, List<BaseImageDto> list, String str, int i, Boolean bool, String str2, String str3, String str4) {
        this.action = baseLinkButtonActionDto;
        this.icon = list;
        this.title = str;
        this.ttl = i;
        this.allowHide = bool;
        this.backgroundColor = str2;
        this.description = str3;
        this.trackCode = str4;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.allowHide;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCatchUpLinkDto)) {
            return false;
        }
        AdsCatchUpLinkDto adsCatchUpLinkDto = (AdsCatchUpLinkDto) obj;
        return epx.f(this.action, adsCatchUpLinkDto.action) && epx.f(this.icon, adsCatchUpLinkDto.icon) && epx.f(this.title, adsCatchUpLinkDto.title) && this.ttl == adsCatchUpLinkDto.ttl && epx.f(this.allowHide, adsCatchUpLinkDto.allowHide) && epx.f(this.backgroundColor, adsCatchUpLinkDto.backgroundColor) && epx.f(this.description, adsCatchUpLinkDto.description) && epx.f(this.trackCode, adsCatchUpLinkDto.trackCode);
    }

    public final String f() {
        return this.backgroundColor;
    }

    public final List<BaseImageDto> g() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.ttl, urd0.a(fw3.a(this.action.hashCode() * 31, 31, this.icon), 31, this.title), 31);
        Boolean bool = this.allowHide;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int i() {
        return this.ttl;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsCatchUpLinkDto(action=");
        sb.append(this.action);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", allowHide=");
        sb.append(this.allowHide);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        parcel.writeInt(this.ttl);
        Boolean bool = this.allowHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.description);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AdsCatchUpLinkDto(BaseLinkButtonActionDto baseLinkButtonActionDto, List list, String str, int i, Boolean bool, String str2, String str3, String str4, int i2, zcl zclVar) {
        this(baseLinkButtonActionDto, list, str, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4);
    }
}
