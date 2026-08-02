package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallNegativeRepliesPlaceholderDto.kt */
/* loaded from: classes15.dex */
public final class WallNegativeRepliesPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<WallNegativeRepliesPlaceholderDto> CREATOR = new a();

    @pmi0("animation")
    private final String animation;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: WallNegativeRepliesPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<WallNegativeRepliesPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final WallNegativeRepliesPlaceholderDto createFromParcel(Parcel parcel) {
            return new WallNegativeRepliesPlaceholderDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallNegativeRepliesPlaceholderDto[] newArray(int i) {
            return new WallNegativeRepliesPlaceholderDto[i];
        }
    }

    public WallNegativeRepliesPlaceholderDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.animation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallNegativeRepliesPlaceholderDto)) {
            return false;
        }
        WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = (WallNegativeRepliesPlaceholderDto) obj;
        return epx.f(this.title, wallNegativeRepliesPlaceholderDto.title) && epx.f(this.subtitle, wallNegativeRepliesPlaceholderDto.subtitle) && epx.f(this.animation, wallNegativeRepliesPlaceholderDto.animation);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.animation;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallNegativeRepliesPlaceholderDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", animation=");
        return ho8.a(sb, this.animation, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.animation);
    }

    public WallNegativeRepliesPlaceholderDto(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.animation = str3;
    }

    public /* synthetic */ WallNegativeRepliesPlaceholderDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
