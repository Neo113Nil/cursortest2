package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountInfoObjectsValidFromDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoObjectsValidFromDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoObjectsValidFromDto> CREATOR = new a();

    @pmi0("discover_categories")
    private final Integer discoverCategories;

    @pmi0("discover_posts")
    private final Integer discoverPosts;

    /* compiled from: AccountInfoObjectsValidFromDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoObjectsValidFromDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoObjectsValidFromDto createFromParcel(Parcel parcel) {
            return new AccountInfoObjectsValidFromDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoObjectsValidFromDto[] newArray(int i) {
            return new AccountInfoObjectsValidFromDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoObjectsValidFromDto() {
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
        if (!(obj instanceof AccountInfoObjectsValidFromDto)) {
            return false;
        }
        AccountInfoObjectsValidFromDto accountInfoObjectsValidFromDto = (AccountInfoObjectsValidFromDto) obj;
        return epx.f(this.discoverPosts, accountInfoObjectsValidFromDto.discoverPosts) && epx.f(this.discoverCategories, accountInfoObjectsValidFromDto.discoverCategories);
    }

    public final int hashCode() {
        Integer num = this.discoverPosts;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.discoverCategories;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoObjectsValidFromDto(discoverPosts=");
        sb.append(this.discoverPosts);
        sb.append(", discoverCategories=");
        return uqi.b(sb, this.discoverCategories, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.discoverPosts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.discoverCategories;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AccountInfoObjectsValidFromDto(Integer num, Integer num2) {
        this.discoverPosts = num;
        this.discoverCategories = num2;
    }

    public /* synthetic */ AccountInfoObjectsValidFromDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
