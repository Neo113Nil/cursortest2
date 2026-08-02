package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AccountNavigationVariantHintDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationVariantHintDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationVariantHintDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("ok_button")
    private final String okButton;

    @pmi0("source_tab_id")
    private final String sourceTabId;

    @pmi0("success_message")
    private final AccountNavigationVariantHintSuccessMessageDto successMessage;

    @pmi0("switch_button_text")
    private final String switchButtonText;

    @pmi0("text")
    private final String text;

    /* compiled from: AccountNavigationVariantHintDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationVariantHintDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantHintDto createFromParcel(Parcel parcel) {
            return new AccountNavigationVariantHintDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AccountNavigationVariantHintSuccessMessageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantHintDto[] newArray(int i) {
            return new AccountNavigationVariantHintDto[i];
        }
    }

    public AccountNavigationVariantHintDto(String str, String str2, String str3, String str4, String str5, AccountNavigationVariantHintSuccessMessageDto accountNavigationVariantHintSuccessMessageDto) {
        this.id = str;
        this.text = str2;
        this.switchButtonText = str3;
        this.okButton = str4;
        this.sourceTabId = str5;
        this.successMessage = accountNavigationVariantHintSuccessMessageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNavigationVariantHintDto)) {
            return false;
        }
        AccountNavigationVariantHintDto accountNavigationVariantHintDto = (AccountNavigationVariantHintDto) obj;
        return epx.f(this.id, accountNavigationVariantHintDto.id) && epx.f(this.text, accountNavigationVariantHintDto.text) && epx.f(this.switchButtonText, accountNavigationVariantHintDto.switchButtonText) && epx.f(this.okButton, accountNavigationVariantHintDto.okButton) && epx.f(this.sourceTabId, accountNavigationVariantHintDto.sourceTabId) && epx.f(this.successMessage, accountNavigationVariantHintDto.successMessage);
    }

    public final int hashCode() {
        return this.successMessage.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.text), 31, this.switchButtonText), 31, this.okButton), 31, this.sourceTabId);
    }

    public final String toString() {
        return "AccountNavigationVariantHintDto(id=" + this.id + ", text=" + this.text + ", switchButtonText=" + this.switchButtonText + ", okButton=" + this.okButton + ", sourceTabId=" + this.sourceTabId + ", successMessage=" + this.successMessage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.switchButtonText);
        parcel.writeString(this.okButton);
        parcel.writeString(this.sourceTabId);
        this.successMessage.writeToParcel(parcel, i);
    }
}
