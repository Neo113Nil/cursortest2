package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ShortVideoShortVideoPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoPrivacyDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoPrivacyDto> CREATOR = new a();

    @pmi0("comment")
    private final BasePrivacyDto comment;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final BasePrivacyDto view;

    /* compiled from: ShortVideoShortVideoPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoPrivacyDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoPrivacyDto((BasePrivacyDto) parcel.readParcelable(ShortVideoShortVideoPrivacyDto.class.getClassLoader()), (BasePrivacyDto) parcel.readParcelable(ShortVideoShortVideoPrivacyDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoPrivacyDto[] newArray(int i) {
            return new ShortVideoShortVideoPrivacyDto[i];
        }
    }

    public ShortVideoShortVideoPrivacyDto(BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2) {
        this.view = basePrivacyDto;
        this.comment = basePrivacyDto2;
    }

    public final BasePrivacyDto d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BasePrivacyDto e() {
        return this.view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoPrivacyDto)) {
            return false;
        }
        ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto = (ShortVideoShortVideoPrivacyDto) obj;
        return epx.f(this.view, shortVideoShortVideoPrivacyDto.view) && epx.f(this.comment, shortVideoShortVideoPrivacyDto.comment);
    }

    public final int hashCode() {
        return this.comment.hashCode() + (this.view.hashCode() * 31);
    }

    public final String toString() {
        return "ShortVideoShortVideoPrivacyDto(view=" + this.view + ", comment=" + this.comment + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.view, i);
        parcel.writeParcelable(this.comment, i);
    }
}
