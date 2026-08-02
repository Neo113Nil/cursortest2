package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoObjectsCommentRestrictionDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoObjectsCommentRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoObjectsCommentRestrictionDto> CREATOR = new a();

    @pmi0("delay")
    private final Integer delay;

    @pmi0("descriptions")
    private final List<String> descriptions;

    /* compiled from: AccountInfoObjectsCommentRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoObjectsCommentRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoObjectsCommentRestrictionDto createFromParcel(Parcel parcel) {
            return new AccountInfoObjectsCommentRestrictionDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoObjectsCommentRestrictionDto[] newArray(int i) {
            return new AccountInfoObjectsCommentRestrictionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoObjectsCommentRestrictionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoObjectsCommentRestrictionDto)) {
            return false;
        }
        AccountInfoObjectsCommentRestrictionDto accountInfoObjectsCommentRestrictionDto = (AccountInfoObjectsCommentRestrictionDto) obj;
        return epx.f(this.delay, accountInfoObjectsCommentRestrictionDto.delay) && epx.f(this.descriptions, accountInfoObjectsCommentRestrictionDto.descriptions);
    }

    public final int hashCode() {
        Integer num = this.delay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.descriptions;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoObjectsCommentRestrictionDto(delay=");
        sb.append(this.delay);
        sb.append(", descriptions=");
        return ms9.a(')', sb, this.descriptions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.delay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.descriptions);
    }

    public AccountInfoObjectsCommentRestrictionDto(Integer num, List<String> list) {
        this.delay = num;
        this.descriptions = list;
    }

    public /* synthetic */ AccountInfoObjectsCommentRestrictionDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
