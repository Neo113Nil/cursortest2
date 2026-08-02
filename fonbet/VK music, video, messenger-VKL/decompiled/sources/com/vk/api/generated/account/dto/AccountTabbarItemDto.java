package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountTabbarItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountTabbarItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountTabbarItemDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    /* compiled from: AccountTabbarItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountTabbarItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountTabbarItemDto createFromParcel(Parcel parcel) {
            return new AccountTabbarItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountTabbarItemDto[] newArray(int i) {
            return new AccountTabbarItemDto[i];
        }
    }

    public AccountTabbarItemDto(String str, String str2) {
        this.id = str;
        this.style = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTabbarItemDto)) {
            return false;
        }
        AccountTabbarItemDto accountTabbarItemDto = (AccountTabbarItemDto) obj;
        return epx.f(this.id, accountTabbarItemDto.id) && epx.f(this.style, accountTabbarItemDto.style);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.style;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountTabbarItemDto(id=");
        sb.append(this.id);
        sb.append(", style=");
        return ho8.a(sb, this.style, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.style);
    }

    public /* synthetic */ AccountTabbarItemDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
