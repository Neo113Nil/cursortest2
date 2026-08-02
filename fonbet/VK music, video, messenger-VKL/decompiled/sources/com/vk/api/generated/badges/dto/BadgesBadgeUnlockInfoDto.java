package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BadgesBadgeUnlockInfoDto.kt */
/* loaded from: classes14.dex */
public final class BadgesBadgeUnlockInfoDto implements Parcelable {
    public static final Parcelable.Creator<BadgesBadgeUnlockInfoDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: BadgesBadgeUnlockInfoDto.kt */
    public static final class a implements Parcelable.Creator<BadgesBadgeUnlockInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeUnlockInfoDto createFromParcel(Parcel parcel) {
            return new BadgesBadgeUnlockInfoDto(parcel.readString(), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(BadgesBadgeUnlockInfoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeUnlockInfoDto[] newArray(int i) {
            return new BadgesBadgeUnlockInfoDto[i];
        }
    }

    public BadgesBadgeUnlockInfoDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto) {
        this.title = str;
        this.text = str2;
        this.button = baseLinkButtonDto;
    }

    public final BaseLinkButtonDto d() {
        return this.button;
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
        if (!(obj instanceof BadgesBadgeUnlockInfoDto)) {
            return false;
        }
        BadgesBadgeUnlockInfoDto badgesBadgeUnlockInfoDto = (BadgesBadgeUnlockInfoDto) obj;
        return epx.f(this.title, badgesBadgeUnlockInfoDto.title) && epx.f(this.text, badgesBadgeUnlockInfoDto.text) && epx.f(this.button, badgesBadgeUnlockInfoDto.button);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.text);
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode());
    }

    public final String toString() {
        return "BadgesBadgeUnlockInfoDto(title=" + this.title + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ BadgesBadgeUnlockInfoDto(String str, String str2, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : baseLinkButtonDto);
    }
}
