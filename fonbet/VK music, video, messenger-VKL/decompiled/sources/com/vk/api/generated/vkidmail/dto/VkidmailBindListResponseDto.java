package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VkidmailBindListResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailBindListResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailBindListResponseDto> CREATOR = new a();

    @pmi0("accounts")
    private final List<VkidmailBindListAccountDto> accounts;

    @pmi0("count")
    private final int count;

    @pmi0(InneractiveMediationNameConsts.MAX)
    private final int max;

    @pmi0("twostep")
    private final Boolean twostep;

    /* compiled from: VkidmailBindListResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailBindListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VkidmailBindListAccountDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkidmailBindListResponseDto(arrayList, readInt2, readInt3, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListResponseDto[] newArray(int i) {
            return new VkidmailBindListResponseDto[i];
        }
    }

    public VkidmailBindListResponseDto(List<VkidmailBindListAccountDto> list, int i, int i2, Boolean bool) {
        this.accounts = list;
        this.count = i;
        this.max = i2;
        this.twostep = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailBindListResponseDto)) {
            return false;
        }
        VkidmailBindListResponseDto vkidmailBindListResponseDto = (VkidmailBindListResponseDto) obj;
        return epx.f(this.accounts, vkidmailBindListResponseDto.accounts) && this.count == vkidmailBindListResponseDto.count && this.max == vkidmailBindListResponseDto.max && epx.f(this.twostep, vkidmailBindListResponseDto.twostep);
    }

    public final int hashCode() {
        int a2 = shy.a(this.max, shy.a(this.count, this.accounts.hashCode() * 31, 31), 31);
        Boolean bool = this.twostep;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailBindListResponseDto(accounts=");
        sb.append(this.accounts);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", max=");
        sb.append(this.max);
        sb.append(", twostep=");
        return tn.a(sb, this.twostep, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.accounts);
        while (a2.hasNext()) {
            ((VkidmailBindListAccountDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        parcel.writeInt(this.max);
        Boolean bool = this.twostep;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VkidmailBindListResponseDto(List list, int i, int i2, Boolean bool, int i3, zcl zclVar) {
        this(list, i, i2, (i3 & 8) != 0 ? null : bool);
    }
}
