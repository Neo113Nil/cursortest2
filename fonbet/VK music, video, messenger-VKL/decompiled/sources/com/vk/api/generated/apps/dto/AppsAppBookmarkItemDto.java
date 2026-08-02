package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAppBookmarkItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppBookmarkItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppBookmarkItemDto> CREATOR = new a();

    @pmi0("application")
    private final AppsAppDto application;

    @pmi0("footer")
    private final ExploreWidgetsBaseFooterDto footer;

    /* compiled from: AppsAppBookmarkItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppBookmarkItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppBookmarkItemDto createFromParcel(Parcel parcel) {
            return new AppsAppBookmarkItemDto((AppsAppDto) parcel.readParcelable(AppsAppBookmarkItemDto.class.getClassLoader()), (ExploreWidgetsBaseFooterDto) parcel.readParcelable(AppsAppBookmarkItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppBookmarkItemDto[] newArray(int i) {
            return new AppsAppBookmarkItemDto[i];
        }
    }

    public AppsAppBookmarkItemDto(AppsAppDto appsAppDto, ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto) {
        this.application = appsAppDto;
        this.footer = exploreWidgetsBaseFooterDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppBookmarkItemDto)) {
            return false;
        }
        AppsAppBookmarkItemDto appsAppBookmarkItemDto = (AppsAppBookmarkItemDto) obj;
        return epx.f(this.application, appsAppBookmarkItemDto.application) && epx.f(this.footer, appsAppBookmarkItemDto.footer);
    }

    public final int hashCode() {
        int hashCode = this.application.hashCode() * 31;
        ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto = this.footer;
        return hashCode + (exploreWidgetsBaseFooterDto == null ? 0 : exploreWidgetsBaseFooterDto.hashCode());
    }

    public final String toString() {
        return "AppsAppBookmarkItemDto(application=" + this.application + ", footer=" + this.footer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.application, i);
        parcel.writeParcelable(this.footer, i);
    }

    public /* synthetic */ AppsAppBookmarkItemDto(AppsAppDto appsAppDto, ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto, int i, zcl zclVar) {
        this(appsAppDto, (i & 2) != 0 ? null : exploreWidgetsBaseFooterDto);
    }
}
