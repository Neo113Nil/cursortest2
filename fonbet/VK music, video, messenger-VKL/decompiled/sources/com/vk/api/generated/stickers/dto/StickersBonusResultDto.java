package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersBonusResultDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusResultDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusResultDto> CREATOR = new a();

    @pmi0("balance")
    private final StickersBonusBalanceDto balance;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_enabled_checkbox_value")
    private final Boolean isEnabledCheckboxValue;

    @pmi0("items")
    private final List<StickersBonusDto> items;

    /* compiled from: StickersBonusResultDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusResultDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusResultDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            StickersBonusBalanceDto createFromParcel = StickersBonusBalanceDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersBonusDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersBonusResultDto(z, createFromParcel, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusResultDto[] newArray(int i) {
            return new StickersBonusResultDto[i];
        }
    }

    public StickersBonusResultDto(boolean z, StickersBonusBalanceDto stickersBonusBalanceDto, List<StickersBonusDto> list, Boolean bool) {
        this.isEnabled = z;
        this.balance = stickersBonusBalanceDto;
        this.items = list;
        this.isEnabledCheckboxValue = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusResultDto)) {
            return false;
        }
        StickersBonusResultDto stickersBonusResultDto = (StickersBonusResultDto) obj;
        return this.isEnabled == stickersBonusResultDto.isEnabled && epx.f(this.balance, stickersBonusResultDto.balance) && epx.f(this.items, stickersBonusResultDto.items) && epx.f(this.isEnabledCheckboxValue, stickersBonusResultDto.isEnabledCheckboxValue);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.balance.hashCode() + (Boolean.hashCode(this.isEnabled) * 31)) * 31, 31, this.items);
        Boolean bool = this.isEnabledCheckboxValue;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusResultDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", isEnabledCheckboxValue=");
        return tn.a(sb, this.isEnabledCheckboxValue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        this.balance.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StickersBonusDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.isEnabledCheckboxValue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ StickersBonusResultDto(boolean z, StickersBonusBalanceDto stickersBonusBalanceDto, List list, Boolean bool, int i, zcl zclVar) {
        this(z, stickersBonusBalanceDto, list, (i & 8) != 0 ? null : bool);
    }
}
