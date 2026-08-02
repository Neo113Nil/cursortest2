package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseServicesMenuItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseServicesMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseServicesMenuItemDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("badge")
    private final SuperAppShowcaseServicesMenuBadgeDto badge;

    @pmi0("icon")
    private final SuperAppShowcaseServicesMenuItemIconDto icon;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("uid")
    private final String uid;

    /* compiled from: SuperAppShowcaseServicesMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseServicesMenuItemDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseServicesMenuItemDto(parcel.readString(), parcel.readString(), (SuperAppShowcaseServicesMenuItemIconDto) parcel.readParcelable(SuperAppShowcaseServicesMenuItemDto.class.getClassLoader()), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseServicesMenuItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (SuperAppShowcaseServicesMenuBadgeDto) parcel.readParcelable(SuperAppShowcaseServicesMenuItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseServicesMenuItemDto[] newArray(int i) {
            return new SuperAppShowcaseServicesMenuItemDto[i];
        }
    }

    public SuperAppShowcaseServicesMenuItemDto(String str, String str2, SuperAppShowcaseServicesMenuItemIconDto superAppShowcaseServicesMenuItemIconDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str3, String str4, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto) {
        this.uid = str;
        this.title = str2;
        this.icon = superAppShowcaseServicesMenuItemIconDto;
        this.action = superAppUniversalWidgetActionDto;
        this.trackCode = str3;
        this.name = str4;
        this.badge = superAppShowcaseServicesMenuBadgeDto;
    }

    public final SuperAppUniversalWidgetActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppShowcaseServicesMenuBadgeDto e() {
        return this.badge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseServicesMenuItemDto)) {
            return false;
        }
        SuperAppShowcaseServicesMenuItemDto superAppShowcaseServicesMenuItemDto = (SuperAppShowcaseServicesMenuItemDto) obj;
        return epx.f(this.uid, superAppShowcaseServicesMenuItemDto.uid) && epx.f(this.title, superAppShowcaseServicesMenuItemDto.title) && epx.f(this.icon, superAppShowcaseServicesMenuItemDto.icon) && epx.f(this.action, superAppShowcaseServicesMenuItemDto.action) && epx.f(this.trackCode, superAppShowcaseServicesMenuItemDto.trackCode) && epx.f(this.name, superAppShowcaseServicesMenuItemDto.name) && epx.f(this.badge, superAppShowcaseServicesMenuItemDto.badge);
    }

    public final SuperAppShowcaseServicesMenuItemIconDto f() {
        return this.icon;
    }

    public final String g() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(zyk0.a(this.action, (this.icon.hashCode() + urd0.a(this.uid.hashCode() * 31, 31, this.title)) * 31, 31), 31, this.trackCode);
        String str = this.name;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto = this.badge;
        return hashCode + (superAppShowcaseServicesMenuBadgeDto != null ? superAppShowcaseServicesMenuBadgeDto.hashCode() : 0);
    }

    public final String i() {
        return this.uid;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "SuperAppShowcaseServicesMenuItemDto(uid=" + this.uid + ", title=" + this.title + ", icon=" + this.icon + ", action=" + this.action + ", trackCode=" + this.trackCode + ", name=" + this.name + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.badge, i);
    }

    public /* synthetic */ SuperAppShowcaseServicesMenuItemDto(String str, String str2, SuperAppShowcaseServicesMenuItemIconDto superAppShowcaseServicesMenuItemIconDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str3, String str4, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto, int i, zcl zclVar) {
        this(str, str2, superAppShowcaseServicesMenuItemIconDto, superAppUniversalWidgetActionDto, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : superAppShowcaseServicesMenuBadgeDto);
    }
}
