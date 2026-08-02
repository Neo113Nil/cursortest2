package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountInfoCacheDiscoverValidFromDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheDiscoverValidFromDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheDiscoverValidFromDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final Integer categories;

    @pmi0("posts")
    private final Integer posts;

    /* compiled from: AccountInfoCacheDiscoverValidFromDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheDiscoverValidFromDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDiscoverValidFromDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheDiscoverValidFromDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDiscoverValidFromDto[] newArray(int i) {
            return new AccountInfoCacheDiscoverValidFromDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoCacheDiscoverValidFromDto() {
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
        if (!(obj instanceof AccountInfoCacheDiscoverValidFromDto)) {
            return false;
        }
        AccountInfoCacheDiscoverValidFromDto accountInfoCacheDiscoverValidFromDto = (AccountInfoCacheDiscoverValidFromDto) obj;
        return epx.f(this.posts, accountInfoCacheDiscoverValidFromDto.posts) && epx.f(this.categories, accountInfoCacheDiscoverValidFromDto.categories);
    }

    public final int hashCode() {
        Integer num = this.posts;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.categories;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoCacheDiscoverValidFromDto(posts=");
        sb.append(this.posts);
        sb.append(", categories=");
        return uqi.b(sb, this.categories, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.posts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.categories;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AccountInfoCacheDiscoverValidFromDto(Integer num, Integer num2) {
        this.posts = num;
        this.categories = num2;
    }

    public /* synthetic */ AccountInfoCacheDiscoverValidFromDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
