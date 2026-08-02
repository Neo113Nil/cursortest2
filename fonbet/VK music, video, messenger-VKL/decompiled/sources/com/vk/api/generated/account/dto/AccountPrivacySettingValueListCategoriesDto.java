package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountPrivacySettingValueListCategoriesDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacySettingValueListCategoriesDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacySettingValueListCategoriesDto> CREATOR = new a();

    @pmi0("allowed")
    private final List<String> allowed;

    @pmi0("excluded")
    private final List<String> excluded;

    /* compiled from: AccountPrivacySettingValueListCategoriesDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacySettingValueListCategoriesDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingValueListCategoriesDto createFromParcel(Parcel parcel) {
            return new AccountPrivacySettingValueListCategoriesDto(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingValueListCategoriesDto[] newArray(int i) {
            return new AccountPrivacySettingValueListCategoriesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPrivacySettingValueListCategoriesDto() {
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
        if (!(obj instanceof AccountPrivacySettingValueListCategoriesDto)) {
            return false;
        }
        AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto = (AccountPrivacySettingValueListCategoriesDto) obj;
        return epx.f(this.allowed, accountPrivacySettingValueListCategoriesDto.allowed) && epx.f(this.excluded, accountPrivacySettingValueListCategoriesDto.excluded);
    }

    public final int hashCode() {
        List<String> list = this.allowed;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.excluded;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPrivacySettingValueListCategoriesDto(allowed=");
        sb.append(this.allowed);
        sb.append(", excluded=");
        return ms9.a(')', sb, this.excluded);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.allowed);
        parcel.writeStringList(this.excluded);
    }

    public AccountPrivacySettingValueListCategoriesDto(List<String> list, List<String> list2) {
        this.allowed = list;
        this.excluded = list2;
    }

    public /* synthetic */ AccountPrivacySettingValueListCategoriesDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
