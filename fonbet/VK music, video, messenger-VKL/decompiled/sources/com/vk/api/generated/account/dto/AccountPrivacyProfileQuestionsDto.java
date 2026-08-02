package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AccountPrivacyProfileQuestionsDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacyProfileQuestionsDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacyProfileQuestionsDto> CREATOR = new a();

    @pmi0("is_anonymous_available")
    private final boolean isAnonymousAvailable;

    /* compiled from: AccountPrivacyProfileQuestionsDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacyProfileQuestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyProfileQuestionsDto createFromParcel(Parcel parcel) {
            return new AccountPrivacyProfileQuestionsDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyProfileQuestionsDto[] newArray(int i) {
            return new AccountPrivacyProfileQuestionsDto[i];
        }
    }

    public AccountPrivacyProfileQuestionsDto(boolean z) {
        this.isAnonymousAvailable = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountPrivacyProfileQuestionsDto) && this.isAnonymousAvailable == ((AccountPrivacyProfileQuestionsDto) obj).isAnonymousAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAnonymousAvailable);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AccountPrivacyProfileQuestionsDto(isAnonymousAvailable="), this.isAnonymousAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAnonymousAvailable ? 1 : 0);
    }
}
