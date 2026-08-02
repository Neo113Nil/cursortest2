package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoStaticAdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoStaticAdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoStaticAdDto> CREATOR = new a();

    @pmi0("action_button")
    private final ShortVideoAdActionButtonDto actionButton;

    @pmi0("ad_marker")
    private final String adMarker;

    @pmi0("ads_stat_pixels")
    private final List<AdsItemBlockAdStatPixelDto> adsStatPixels;

    @pmi0("advertiser_info_url")
    private final String advertiserInfoUrl;

    @pmi0("age_restrictions")
    private final String ageRestrictions;

    @pmi0("description")
    private final String description;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("is_app")
    private final boolean isApp;

    @pmi0("owner_title")
    private final String ownerTitle;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: ShortVideoStaticAdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoStaticAdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticAdDto createFromParcel(Parcel parcel) {
            boolean z;
            String str;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z2 = false;
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoStaticAdDto.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(ShortVideoStaticAdDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList arrayList3 = arrayList;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            ArrayList arrayList4 = null;
            ShortVideoAdActionButtonDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoAdActionButtonDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(ShortVideoStaticAdDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                str = readString;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                str = readString;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ShortVideoStaticAdDto.class, parcel, arrayList5, i3, 1);
                    arrayList3 = arrayList3;
                }
                arrayList4 = arrayList5;
            }
            return new ShortVideoStaticAdDto(str, arrayList3, arrayList2, z2, readString2, readString3, readString4, readString5, readString6, readString7, createFromParcel, userId, arrayList4, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticAdDto[] newArray(int i) {
            return new ShortVideoStaticAdDto[i];
        }
    }

    public ShortVideoStaticAdDto(String str, List<BaseImageDto> list, List<BaseImageDto> list2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, ShortVideoAdActionButtonDto shortVideoAdActionButtonDto, UserId userId, List<AdsItemBlockAdStatPixelDto> list3, String str8, String str9) {
        this.id = str;
        this.icon = list;
        this.image = list2;
        this.isApp = z;
        this.advertiserInfoUrl = str2;
        this.adMarker = str3;
        this.title = str4;
        this.ownerTitle = str5;
        this.description = str6;
        this.ageRestrictions = str7;
        this.actionButton = shortVideoAdActionButtonDto;
        this.targetOwnerId = userId;
        this.adsStatPixels = list3;
        this.disclaimer = str8;
        this.trackCode = str9;
    }

    public final ShortVideoAdActionButtonDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.adMarker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoStaticAdDto)) {
            return false;
        }
        ShortVideoStaticAdDto shortVideoStaticAdDto = (ShortVideoStaticAdDto) obj;
        return epx.f(this.id, shortVideoStaticAdDto.id) && epx.f(this.icon, shortVideoStaticAdDto.icon) && epx.f(this.image, shortVideoStaticAdDto.image) && this.isApp == shortVideoStaticAdDto.isApp && epx.f(this.advertiserInfoUrl, shortVideoStaticAdDto.advertiserInfoUrl) && epx.f(this.adMarker, shortVideoStaticAdDto.adMarker) && epx.f(this.title, shortVideoStaticAdDto.title) && epx.f(this.ownerTitle, shortVideoStaticAdDto.ownerTitle) && epx.f(this.description, shortVideoStaticAdDto.description) && epx.f(this.ageRestrictions, shortVideoStaticAdDto.ageRestrictions) && epx.f(this.actionButton, shortVideoStaticAdDto.actionButton) && epx.f(this.targetOwnerId, shortVideoStaticAdDto.targetOwnerId) && epx.f(this.adsStatPixels, shortVideoStaticAdDto.adsStatPixels) && epx.f(this.disclaimer, shortVideoStaticAdDto.disclaimer) && epx.f(this.trackCode, shortVideoStaticAdDto.trackCode);
    }

    public final List<AdsItemBlockAdStatPixelDto> f() {
        return this.adsStatPixels;
    }

    public final String g() {
        return this.advertiserInfoUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(fw3.a(fw3.a(this.id.hashCode() * 31, 31, this.icon), 31, this.image), 31, this.isApp), 31, this.advertiserInfoUrl), 31, this.adMarker), 31, this.title), 31, this.ownerTitle), 31, this.description), 31, this.ageRestrictions);
        ShortVideoAdActionButtonDto shortVideoAdActionButtonDto = this.actionButton;
        int hashCode = (a2 + (shortVideoAdActionButtonDto == null ? 0 : shortVideoAdActionButtonDto.hashCode())) * 31;
        UserId userId = this.targetOwnerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<AdsItemBlockAdStatPixelDto> list = this.adsStatPixels;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.disclaimer;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.ageRestrictions;
    }

    public final String j() {
        return this.disclaimer;
    }

    public final List<BaseImageDto> k() {
        return this.icon;
    }

    public final List<BaseImageDto> l() {
        return this.image;
    }

    public final String n() {
        return this.ownerTitle;
    }

    public final UserId o() {
        return this.targetOwnerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoStaticAdDto(id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", isApp=");
        sb.append(this.isApp);
        sb.append(", advertiserInfoUrl=");
        sb.append(this.advertiserInfoUrl);
        sb.append(", adMarker=");
        sb.append(this.adMarker);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", ownerTitle=");
        sb.append(this.ownerTitle);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", ageRestrictions=");
        sb.append(this.ageRestrictions);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", targetOwnerId=");
        sb.append(this.targetOwnerId);
        sb.append(", adsStatPixels=");
        sb.append(this.adsStatPixels);
        sb.append(", disclaimer=");
        sb.append(this.disclaimer);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.image);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeInt(this.isApp ? 1 : 0);
        parcel.writeString(this.advertiserInfoUrl);
        parcel.writeString(this.adMarker);
        parcel.writeString(this.title);
        parcel.writeString(this.ownerTitle);
        parcel.writeString(this.description);
        parcel.writeString(this.ageRestrictions);
        ShortVideoAdActionButtonDto shortVideoAdActionButtonDto = this.actionButton;
        if (shortVideoAdActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAdActionButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.targetOwnerId, i);
        List<AdsItemBlockAdStatPixelDto> list = this.adsStatPixels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ ShortVideoStaticAdDto(String str, List list, List list2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, ShortVideoAdActionButtonDto shortVideoAdActionButtonDto, UserId userId, List list3, String str8, String str9, int i, zcl zclVar) {
        this(str, list, list2, z, str2, str3, str4, str5, str6, str7, (i & 1024) != 0 ? null : shortVideoAdActionButtonDto, (i & 2048) != 0 ? null : userId, (i & 4096) != 0 ? null : list3, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9);
    }
}
