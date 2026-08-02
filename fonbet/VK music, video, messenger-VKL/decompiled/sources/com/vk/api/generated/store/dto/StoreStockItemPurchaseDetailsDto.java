package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoreStockItemPurchaseDetailsDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemPurchaseDetailsDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemPurchaseDetailsDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("label")
    private final String label;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: StoreStockItemPurchaseDetailsDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemPurchaseDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemPurchaseDetailsDto createFromParcel(Parcel parcel) {
            return new StoreStockItemPurchaseDetailsDto(parcel.readString(), parcel.readString(), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(StoreStockItemPurchaseDetailsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemPurchaseDetailsDto[] newArray(int i) {
            return new StoreStockItemPurchaseDetailsDto[i];
        }
    }

    public StoreStockItemPurchaseDetailsDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto) {
        this.label = str;
        this.title = str2;
        this.text = str3;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemPurchaseDetailsDto)) {
            return false;
        }
        StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto = (StoreStockItemPurchaseDetailsDto) obj;
        return epx.f(this.label, storeStockItemPurchaseDetailsDto.label) && epx.f(this.title, storeStockItemPurchaseDetailsDto.title) && epx.f(this.text, storeStockItemPurchaseDetailsDto.text) && epx.f(this.button, storeStockItemPurchaseDetailsDto.button);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.label.hashCode() * 31, 31, this.title), 31, this.text);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "StoreStockItemPurchaseDetailsDto(label=" + this.label + ", title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ StoreStockItemPurchaseDetailsDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : baseLinkButtonDto);
    }
}
