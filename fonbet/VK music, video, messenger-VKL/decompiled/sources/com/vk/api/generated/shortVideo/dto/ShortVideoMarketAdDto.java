package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdCardDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.ads.dto.AdsItemBlockDisclaimerImgDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoMarketAdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMarketAdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoMarketAdDto> CREATOR = new a();

    @pmi0("action_button")
    private final ShortVideoAdActionButtonDto actionButton;

    @pmi0("ad_choices")
    private final AdsChoicesDto adChoices;

    @pmi0("ad_marker")
    private final String adMarker;

    @pmi0("ads_stat_pixels")
    private final List<AdsItemBlockAdStatPixelDto> adsStatPixels;

    @pmi0("advertiser_info_url")
    private final String advertiserInfoUrl;

    @pmi0("age_restrictions")
    private final String ageRestrictions;

    @pmi0("cards")
    private final List<AdsItemBlockAdCardDto> cards;

    @pmi0("description")
    private final String description;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("disclaimer_img")
    private final AdsItemBlockDisclaimerImgDto disclaimerImg;

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

    /* compiled from: ShortVideoMarketAdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMarketAdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMarketAdDto createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt);
            boolean z2 = false;
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoMarketAdDto.class, parcel, arrayList5, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(AdsItemBlockAdCardDto.CREATOR, parcel, arrayList6, i2, 1);
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
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ShortVideoMarketAdDto.class, parcel, arrayList, i3, 1);
                }
            }
            ShortVideoAdActionButtonDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoAdActionButtonDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(ShortVideoMarketAdDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                str = readString;
                arrayList2 = new ArrayList(readInt4);
                arrayList3 = arrayList5;
                int i4 = 0;
                while (true) {
                    arrayList4 = arrayList6;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = bo.b(ShortVideoMarketAdDto.class, parcel, arrayList2, i4, 1);
                    arrayList6 = arrayList4;
                }
            } else {
                str = readString;
                arrayList3 = arrayList5;
                arrayList2 = null;
                arrayList4 = arrayList6;
            }
            return new ShortVideoMarketAdDto(str, arrayList3, arrayList4, z2, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, createFromParcel, userId, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : AdsItemBlockDisclaimerImgDto.CREATOR.createFromParcel(parcel), parcel.readString(), (AdsChoicesDto) parcel.readParcelable(ShortVideoMarketAdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMarketAdDto[] newArray(int i) {
            return new ShortVideoMarketAdDto[i];
        }
    }

    public ShortVideoMarketAdDto(String str, List<BaseImageDto> list, List<AdsItemBlockAdCardDto> list2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, List<BaseImageDto> list3, ShortVideoAdActionButtonDto shortVideoAdActionButtonDto, UserId userId, List<AdsItemBlockAdStatPixelDto> list4, String str8, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str9, AdsChoicesDto adsChoicesDto) {
        this.id = str;
        this.icon = list;
        this.cards = list2;
        this.isApp = z;
        this.advertiserInfoUrl = str2;
        this.adMarker = str3;
        this.title = str4;
        this.ownerTitle = str5;
        this.description = str6;
        this.ageRestrictions = str7;
        this.image = list3;
        this.actionButton = shortVideoAdActionButtonDto;
        this.targetOwnerId = userId;
        this.adsStatPixels = list4;
        this.disclaimer = str8;
        this.disclaimerImg = adsItemBlockDisclaimerImgDto;
        this.trackCode = str9;
        this.adChoices = adsChoicesDto;
    }

    public final UserId B() {
        return this.targetOwnerId;
    }

    public final ShortVideoAdActionButtonDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AdsChoicesDto e() {
        return this.adChoices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoMarketAdDto)) {
            return false;
        }
        ShortVideoMarketAdDto shortVideoMarketAdDto = (ShortVideoMarketAdDto) obj;
        return epx.f(this.id, shortVideoMarketAdDto.id) && epx.f(this.icon, shortVideoMarketAdDto.icon) && epx.f(this.cards, shortVideoMarketAdDto.cards) && this.isApp == shortVideoMarketAdDto.isApp && epx.f(this.advertiserInfoUrl, shortVideoMarketAdDto.advertiserInfoUrl) && epx.f(this.adMarker, shortVideoMarketAdDto.adMarker) && epx.f(this.title, shortVideoMarketAdDto.title) && epx.f(this.ownerTitle, shortVideoMarketAdDto.ownerTitle) && epx.f(this.description, shortVideoMarketAdDto.description) && epx.f(this.ageRestrictions, shortVideoMarketAdDto.ageRestrictions) && epx.f(this.image, shortVideoMarketAdDto.image) && epx.f(this.actionButton, shortVideoMarketAdDto.actionButton) && epx.f(this.targetOwnerId, shortVideoMarketAdDto.targetOwnerId) && epx.f(this.adsStatPixels, shortVideoMarketAdDto.adsStatPixels) && epx.f(this.disclaimer, shortVideoMarketAdDto.disclaimer) && epx.f(this.disclaimerImg, shortVideoMarketAdDto.disclaimerImg) && epx.f(this.trackCode, shortVideoMarketAdDto.trackCode) && epx.f(this.adChoices, shortVideoMarketAdDto.adChoices);
    }

    public final String f() {
        return this.adMarker;
    }

    public final List<AdsItemBlockAdStatPixelDto> g() {
        return this.adsStatPixels;
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
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(fw3.a(fw3.a(this.id.hashCode() * 31, 31, this.icon), 31, this.cards), 31, this.isApp), 31, this.advertiserInfoUrl), 31, this.adMarker), 31, this.title), 31, this.ownerTitle), 31, this.description), 31, this.ageRestrictions);
        List<BaseImageDto> list = this.image;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        ShortVideoAdActionButtonDto shortVideoAdActionButtonDto = this.actionButton;
        int hashCode2 = (hashCode + (shortVideoAdActionButtonDto == null ? 0 : shortVideoAdActionButtonDto.hashCode())) * 31;
        UserId userId = this.targetOwnerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<AdsItemBlockAdStatPixelDto> list2 = this.adsStatPixels;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.disclaimer;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = this.disclaimerImg;
        int hashCode6 = (hashCode5 + (adsItemBlockDisclaimerImgDto == null ? 0 : adsItemBlockDisclaimerImgDto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdsChoicesDto adsChoicesDto = this.adChoices;
        return hashCode7 + (adsChoicesDto != null ? adsChoicesDto.hashCode() : 0);
    }

    public final String i() {
        return this.advertiserInfoUrl;
    }

    public final String j() {
        return this.ageRestrictions;
    }

    public final List<AdsItemBlockAdCardDto> k() {
        return this.cards;
    }

    public final String l() {
        return this.disclaimer;
    }

    public final AdsItemBlockDisclaimerImgDto n() {
        return this.disclaimerImg;
    }

    public final List<BaseImageDto> o() {
        return this.icon;
    }

    public final List<BaseImageDto> p() {
        return this.image;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "ShortVideoMarketAdDto(id=" + this.id + ", icon=" + this.icon + ", cards=" + this.cards + ", isApp=" + this.isApp + ", advertiserInfoUrl=" + this.advertiserInfoUrl + ", adMarker=" + this.adMarker + ", title=" + this.title + ", ownerTitle=" + this.ownerTitle + ", description=" + this.description + ", ageRestrictions=" + this.ageRestrictions + ", image=" + this.image + ", actionButton=" + this.actionButton + ", targetOwnerId=" + this.targetOwnerId + ", adsStatPixels=" + this.adsStatPixels + ", disclaimer=" + this.disclaimer + ", disclaimerImg=" + this.disclaimerImg + ", trackCode=" + this.trackCode + ", adChoices=" + this.adChoices + ')';
    }

    public final String u() {
        return this.ownerTitle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.cards);
        while (a3.hasNext()) {
            ((AdsItemBlockAdCardDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isApp ? 1 : 0);
        parcel.writeString(this.advertiserInfoUrl);
        parcel.writeString(this.adMarker);
        parcel.writeString(this.title);
        parcel.writeString(this.ownerTitle);
        parcel.writeString(this.description);
        parcel.writeString(this.ageRestrictions);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        ShortVideoAdActionButtonDto shortVideoAdActionButtonDto = this.actionButton;
        if (shortVideoAdActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAdActionButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.targetOwnerId, i);
        List<AdsItemBlockAdStatPixelDto> list2 = this.adsStatPixels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.disclaimer);
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = this.disclaimerImg;
        if (adsItemBlockDisclaimerImgDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockDisclaimerImgDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.adChoices, i);
    }

    public /* synthetic */ ShortVideoMarketAdDto(String str, List list, List list2, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, List list3, ShortVideoAdActionButtonDto shortVideoAdActionButtonDto, UserId userId, List list4, String str8, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str9, AdsChoicesDto adsChoicesDto, int i, zcl zclVar) {
        this(str, list, list2, z, str2, str3, str4, str5, str6, str7, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : shortVideoAdActionButtonDto, (i & 4096) != 0 ? null : userId, (i & 8192) != 0 ? null : list4, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : adsItemBlockDisclaimerImgDto, (65536 & i) != 0 ? null : str9, (i & 131072) != 0 ? null : adsChoicesDto);
    }
}
