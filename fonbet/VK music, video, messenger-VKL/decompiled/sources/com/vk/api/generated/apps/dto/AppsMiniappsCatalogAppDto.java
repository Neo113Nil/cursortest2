package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogAppDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogAppDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogAppDto> CREATOR = new a();

    @pmi0("badge_info")
    private final SuperAppBadgeInfoDto badgeInfo;

    @pmi0("id")
    private final int id;

    @pmi0("ref")
    private final String ref;

    @pmi0("uid")
    private final String uid;

    @pmi0("user_stack")
    private final ExploreWidgetsUserStackDto userStack;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: AppsMiniappsCatalogAppDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogAppDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogAppDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogAppDto(parcel.readInt(), parcel.readString(), parcel.readString(), (SuperAppBadgeInfoDto) parcel.readParcelable(AppsMiniappsCatalogAppDto.class.getClassLoader()), (ExploreWidgetsUserStackDto) parcel.readParcelable(AppsMiniappsCatalogAppDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogAppDto[] newArray(int i) {
            return new AppsMiniappsCatalogAppDto[i];
        }
    }

    public AppsMiniappsCatalogAppDto(int i, String str, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, String str3) {
        this.id = i;
        this.webviewUrl = str;
        this.uid = str2;
        this.badgeInfo = superAppBadgeInfoDto;
        this.userStack = exploreWidgetsUserStackDto;
        this.ref = str3;
    }

    public final SuperAppBadgeInfoDto d() {
        return this.badgeInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogAppDto)) {
            return false;
        }
        AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto = (AppsMiniappsCatalogAppDto) obj;
        return this.id == appsMiniappsCatalogAppDto.id && epx.f(this.webviewUrl, appsMiniappsCatalogAppDto.webviewUrl) && epx.f(this.uid, appsMiniappsCatalogAppDto.uid) && epx.f(this.badgeInfo, appsMiniappsCatalogAppDto.badgeInfo) && epx.f(this.userStack, appsMiniappsCatalogAppDto.userStack) && epx.f(this.ref, appsMiniappsCatalogAppDto.ref);
    }

    public final ExploreWidgetsUserStackDto f() {
        return this.userStack;
    }

    public final String g() {
        return this.webviewUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.webviewUrl);
        String str = this.uid;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppBadgeInfoDto superAppBadgeInfoDto = this.badgeInfo;
        int hashCode2 = (hashCode + (superAppBadgeInfoDto == null ? 0 : superAppBadgeInfoDto.hashCode())) * 31;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = this.userStack;
        int hashCode3 = (hashCode2 + (exploreWidgetsUserStackDto == null ? 0 : exploreWidgetsUserStackDto.hashCode())) * 31;
        String str2 = this.ref;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogAppDto(id=");
        sb.append(this.id);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", badgeInfo=");
        sb.append(this.badgeInfo);
        sb.append(", userStack=");
        sb.append(this.userStack);
        sb.append(", ref=");
        return ho8.a(sb, this.ref, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.uid);
        parcel.writeParcelable(this.badgeInfo, i);
        parcel.writeParcelable(this.userStack, i);
        parcel.writeString(this.ref);
    }

    public /* synthetic */ AppsMiniappsCatalogAppDto(int i, String str, String str2, SuperAppBadgeInfoDto superAppBadgeInfoDto, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, String str3, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : superAppBadgeInfoDto, (i2 & 16) != 0 ? null : exploreWidgetsUserStackDto, (i2 & 32) != 0 ? null : str3);
    }
}
