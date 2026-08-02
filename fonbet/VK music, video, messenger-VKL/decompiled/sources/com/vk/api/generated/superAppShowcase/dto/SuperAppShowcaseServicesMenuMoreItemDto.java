package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SuperAppShowcaseServicesMenuMoreItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseServicesMenuMoreItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseServicesMenuMoreItemDto> CREATOR = new a();

    @pmi0("badge")
    private final SuperAppShowcaseServicesMenuBadgeDto badge;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("uid")
    private final String uid;

    /* compiled from: SuperAppShowcaseServicesMenuMoreItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseServicesMenuMoreItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseServicesMenuMoreItemDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseServicesMenuMoreItemDto(parcel.readString(), parcel.readString(), parcel.readString(), (SuperAppShowcaseServicesMenuBadgeDto) parcel.readParcelable(SuperAppShowcaseServicesMenuMoreItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseServicesMenuMoreItemDto[] newArray(int i) {
            return new SuperAppShowcaseServicesMenuMoreItemDto[i];
        }
    }

    public SuperAppShowcaseServicesMenuMoreItemDto(String str, String str2, String str3, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto) {
        this.uid = str;
        this.trackCode = str2;
        this.title = str3;
        this.badge = superAppShowcaseServicesMenuBadgeDto;
    }

    public final SuperAppShowcaseServicesMenuBadgeDto d() {
        return this.badge;
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
        if (!(obj instanceof SuperAppShowcaseServicesMenuMoreItemDto)) {
            return false;
        }
        SuperAppShowcaseServicesMenuMoreItemDto superAppShowcaseServicesMenuMoreItemDto = (SuperAppShowcaseServicesMenuMoreItemDto) obj;
        return epx.f(this.uid, superAppShowcaseServicesMenuMoreItemDto.uid) && epx.f(this.trackCode, superAppShowcaseServicesMenuMoreItemDto.trackCode) && epx.f(this.title, superAppShowcaseServicesMenuMoreItemDto.title) && epx.f(this.badge, superAppShowcaseServicesMenuMoreItemDto.badge);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.uid.hashCode() * 31, 31, this.trackCode);
        String str = this.title;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto = this.badge;
        return hashCode + (superAppShowcaseServicesMenuBadgeDto != null ? superAppShowcaseServicesMenuBadgeDto.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "SuperAppShowcaseServicesMenuMoreItemDto(uid=" + this.uid + ", trackCode=" + this.trackCode + ", title=" + this.title + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.badge, i);
    }

    public /* synthetic */ SuperAppShowcaseServicesMenuMoreItemDto(String str, String str2, String str3, SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : superAppShowcaseServicesMenuBadgeDto);
    }
}
