package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DonutSubscriptionMethodInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutSubscriptionMethodInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutSubscriptionMethodInfoDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("merchant")
    private final DonutSubscriptionMethodInfoMerchantDto merchant;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("subtitle")
    private final DonutSubscriptionMethodInfoSubtitleDto subtitle;

    @pmi0("title_text")
    private final String titleText;

    /* compiled from: DonutSubscriptionMethodInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutSubscriptionMethodInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new DonutSubscriptionMethodInfoDto(arrayList, parcel.readString(), DonutSubscriptionMethodInfoSubtitleDto.CREATOR.createFromParcel(parcel), BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DonutSubscriptionMethodInfoMerchantDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutSubscriptionMethodInfoDto[] newArray(int i) {
            return new DonutSubscriptionMethodInfoDto[i];
        }
    }

    public DonutSubscriptionMethodInfoDto(List<BaseImageDto> list, String str, DonutSubscriptionMethodInfoSubtitleDto donutSubscriptionMethodInfoSubtitleDto, BaseLinkButtonActionDto baseLinkButtonActionDto, DonutSubscriptionMethodInfoMerchantDto donutSubscriptionMethodInfoMerchantDto) {
        this.photo = list;
        this.titleText = str;
        this.subtitle = donutSubscriptionMethodInfoSubtitleDto;
        this.action = baseLinkButtonActionDto;
        this.merchant = donutSubscriptionMethodInfoMerchantDto;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutSubscriptionMethodInfoDto)) {
            return false;
        }
        DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto = (DonutSubscriptionMethodInfoDto) obj;
        return epx.f(this.photo, donutSubscriptionMethodInfoDto.photo) && epx.f(this.titleText, donutSubscriptionMethodInfoDto.titleText) && epx.f(this.subtitle, donutSubscriptionMethodInfoDto.subtitle) && epx.f(this.action, donutSubscriptionMethodInfoDto.action) && epx.f(this.merchant, donutSubscriptionMethodInfoDto.merchant);
    }

    public final DonutSubscriptionMethodInfoSubtitleDto f() {
        return this.subtitle;
    }

    public final String g() {
        return this.titleText;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + ((this.subtitle.hashCode() + urd0.a(this.photo.hashCode() * 31, 31, this.titleText)) * 31)) * 31;
        DonutSubscriptionMethodInfoMerchantDto donutSubscriptionMethodInfoMerchantDto = this.merchant;
        return hashCode + (donutSubscriptionMethodInfoMerchantDto == null ? 0 : donutSubscriptionMethodInfoMerchantDto.hashCode());
    }

    public final String toString() {
        return "DonutSubscriptionMethodInfoDto(photo=" + this.photo + ", titleText=" + this.titleText + ", subtitle=" + this.subtitle + ", action=" + this.action + ", merchant=" + this.merchant + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.titleText);
        this.subtitle.writeToParcel(parcel, i);
        this.action.writeToParcel(parcel, i);
        DonutSubscriptionMethodInfoMerchantDto donutSubscriptionMethodInfoMerchantDto = this.merchant;
        if (donutSubscriptionMethodInfoMerchantDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutSubscriptionMethodInfoMerchantDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutSubscriptionMethodInfoDto(List list, String str, DonutSubscriptionMethodInfoSubtitleDto donutSubscriptionMethodInfoSubtitleDto, BaseLinkButtonActionDto baseLinkButtonActionDto, DonutSubscriptionMethodInfoMerchantDto donutSubscriptionMethodInfoMerchantDto, int i, zcl zclVar) {
        this(list, str, donutSubscriptionMethodInfoSubtitleDto, baseLinkButtonActionDto, (i & 16) != 0 ? null : donutSubscriptionMethodInfoMerchantDto);
    }
}
