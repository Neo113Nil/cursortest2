package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto createFromParcel(Parcel parcel) {
            return new WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto[] newArray(int i) {
            return new WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto[i];
        }
    }

    public WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto(String str, String str2, String str3) {
        this.title = str;
        this.text = str2;
        this.buttonText = str3;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto)) {
            return false;
        }
        WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto = (WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto) obj;
        return epx.f(this.title, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.title) && epx.f(this.text, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.text) && epx.f(this.buttonText, wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto.buttonText);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsErrorPopupDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.buttonText);
    }
}
