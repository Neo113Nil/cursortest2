package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BadgesDonutInfoDto.kt */
/* loaded from: classes14.dex */
public final class BadgesDonutInfoDto implements Parcelable {
    public static final Parcelable.Creator<BadgesDonutInfoDto> CREATOR = new a();

    @pmi0("amount")
    private final String amount;

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("comment_text")
    private final String commentText;

    /* compiled from: BadgesDonutInfoDto.kt */
    public static final class a implements Parcelable.Creator<BadgesDonutInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesDonutInfoDto createFromParcel(Parcel parcel) {
            return new BadgesDonutInfoDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesDonutInfoDto[] newArray(int i) {
            return new BadgesDonutInfoDto[i];
        }
    }

    public BadgesDonutInfoDto(String str, String str2, String str3) {
        this.amount = str;
        this.backgroundColor = str2;
        this.commentText = str3;
    }

    public final String d() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesDonutInfoDto)) {
            return false;
        }
        BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) obj;
        return epx.f(this.amount, badgesDonutInfoDto.amount) && epx.f(this.backgroundColor, badgesDonutInfoDto.backgroundColor) && epx.f(this.commentText, badgesDonutInfoDto.commentText);
    }

    public final String f() {
        return this.commentText;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.amount.hashCode() * 31, 31, this.backgroundColor);
        String str = this.commentText;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesDonutInfoDto(amount=");
        sb.append(this.amount);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", commentText=");
        return ho8.a(sb, this.commentText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.commentText);
    }

    public /* synthetic */ BadgesDonutInfoDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
