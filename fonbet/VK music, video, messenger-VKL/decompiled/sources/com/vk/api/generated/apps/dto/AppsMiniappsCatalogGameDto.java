package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogGameDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogGameDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogGameDto> CREATOR = new a();

    @pmi0("achievement_label")
    private final Boolean achievementLabel;

    @pmi0("ads_info")
    private final AppsMiniappsAdsInfoDto adsInfo;

    @pmi0("friends_stack")
    private final AppsFriendsStackDto friendsStack;

    @pmi0("id")
    private final int id;

    @pmi0("ref")
    private final String ref;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("uid")
    private final String uid;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: AppsMiniappsCatalogGameDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogGameDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogGameDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AppsFriendsStackDto appsFriendsStackDto = (AppsFriendsStackDto) parcel.readParcelable(AppsMiniappsCatalogGameDto.class.getClassLoader());
            Boolean bool = null;
            AppsMiniappsAdsInfoDto createFromParcel = parcel.readInt() == 0 ? null : AppsMiniappsAdsInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsMiniappsCatalogGameDto(readInt, readString, readString2, readString3, readString4, appsFriendsStackDto, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogGameDto[] newArray(int i) {
            return new AppsMiniappsCatalogGameDto[i];
        }
    }

    public AppsMiniappsCatalogGameDto(int i, String str, String str2, String str3, String str4, AppsFriendsStackDto appsFriendsStackDto, AppsMiniappsAdsInfoDto appsMiniappsAdsInfoDto, Boolean bool) {
        this.id = i;
        this.webviewUrl = str;
        this.subtitle = str2;
        this.uid = str3;
        this.ref = str4;
        this.friendsStack = appsFriendsStackDto;
        this.adsInfo = appsMiniappsAdsInfoDto;
        this.achievementLabel = bool;
    }

    public final Boolean d() {
        return this.achievementLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsFriendsStackDto e() {
        return this.friendsStack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogGameDto)) {
            return false;
        }
        AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto = (AppsMiniappsCatalogGameDto) obj;
        return this.id == appsMiniappsCatalogGameDto.id && epx.f(this.webviewUrl, appsMiniappsCatalogGameDto.webviewUrl) && epx.f(this.subtitle, appsMiniappsCatalogGameDto.subtitle) && epx.f(this.uid, appsMiniappsCatalogGameDto.uid) && epx.f(this.ref, appsMiniappsCatalogGameDto.ref) && epx.f(this.friendsStack, appsMiniappsCatalogGameDto.friendsStack) && epx.f(this.adsInfo, appsMiniappsCatalogGameDto.adsInfo) && epx.f(this.achievementLabel, appsMiniappsCatalogGameDto.achievementLabel);
    }

    public final String f() {
        return this.ref;
    }

    public final String g() {
        return this.subtitle;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.webviewUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uid;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ref;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppsFriendsStackDto appsFriendsStackDto = this.friendsStack;
        int hashCode6 = (hashCode5 + (appsFriendsStackDto == null ? 0 : appsFriendsStackDto.hashCode())) * 31;
        AppsMiniappsAdsInfoDto appsMiniappsAdsInfoDto = this.adsInfo;
        int hashCode7 = (hashCode6 + (appsMiniappsAdsInfoDto == null ? 0 : appsMiniappsAdsInfoDto.hashCode())) * 31;
        Boolean bool = this.achievementLabel;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.uid;
    }

    public final String j() {
        return this.webviewUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogGameDto(id=");
        sb.append(this.id);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", friendsStack=");
        sb.append(this.friendsStack);
        sb.append(", adsInfo=");
        sb.append(this.adsInfo);
        sb.append(", achievementLabel=");
        return tn.a(sb, this.achievementLabel, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.uid);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.friendsStack, i);
        AppsMiniappsAdsInfoDto appsMiniappsAdsInfoDto = this.adsInfo;
        if (appsMiniappsAdsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniappsAdsInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.achievementLabel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AppsMiniappsCatalogGameDto(int i, String str, String str2, String str3, String str4, AppsFriendsStackDto appsFriendsStackDto, AppsMiniappsAdsInfoDto appsMiniappsAdsInfoDto, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : appsFriendsStackDto, (i2 & 64) != 0 ? null : appsMiniappsAdsInfoDto, (i2 & 128) != 0 ? null : bool);
    }
}
