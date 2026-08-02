package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsTrustMarksAdminButtonsUrlDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTrustMarksAdminButtonsUrlDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTrustMarksAdminButtonsUrlDto> CREATOR = new a();

    @pmi0(C4572u.g)
    private final String delivery;

    @pmi0("payment")
    private final String payment;

    @pmi0("refund")
    private final String refund;

    @pmi0("verification")
    private final String verification;

    /* compiled from: GroupsTrustMarksAdminButtonsUrlDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTrustMarksAdminButtonsUrlDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksAdminButtonsUrlDto createFromParcel(Parcel parcel) {
            return new GroupsTrustMarksAdminButtonsUrlDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTrustMarksAdminButtonsUrlDto[] newArray(int i) {
            return new GroupsTrustMarksAdminButtonsUrlDto[i];
        }
    }

    public GroupsTrustMarksAdminButtonsUrlDto(String str, String str2, String str3, String str4) {
        this.delivery = str;
        this.payment = str2;
        this.refund = str3;
        this.verification = str4;
    }

    public final String d() {
        return this.delivery;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.payment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTrustMarksAdminButtonsUrlDto)) {
            return false;
        }
        GroupsTrustMarksAdminButtonsUrlDto groupsTrustMarksAdminButtonsUrlDto = (GroupsTrustMarksAdminButtonsUrlDto) obj;
        return epx.f(this.delivery, groupsTrustMarksAdminButtonsUrlDto.delivery) && epx.f(this.payment, groupsTrustMarksAdminButtonsUrlDto.payment) && epx.f(this.refund, groupsTrustMarksAdminButtonsUrlDto.refund) && epx.f(this.verification, groupsTrustMarksAdminButtonsUrlDto.verification);
    }

    public final String f() {
        return this.refund;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.delivery.hashCode() * 31, 31, this.payment), 31, this.refund);
        String str = this.verification;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTrustMarksAdminButtonsUrlDto(delivery=");
        sb.append(this.delivery);
        sb.append(", payment=");
        sb.append(this.payment);
        sb.append(", refund=");
        sb.append(this.refund);
        sb.append(", verification=");
        return ho8.a(sb, this.verification, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.delivery);
        parcel.writeString(this.payment);
        parcel.writeString(this.refund);
        parcel.writeString(this.verification);
    }

    public /* synthetic */ GroupsTrustMarksAdminButtonsUrlDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
