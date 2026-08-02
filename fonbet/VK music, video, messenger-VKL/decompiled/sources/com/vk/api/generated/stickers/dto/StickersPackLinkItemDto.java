package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersPackLinkItemDto.kt */
/* loaded from: classes15.dex */
public final class StickersPackLinkItemDto implements Parcelable {
    public static final Parcelable.Creator<StickersPackLinkItemDto> CREATOR = new a();

    @pmi0(L2.g)
    private final String background;

    @pmi0("is_vmoji")
    private final boolean isVmoji;

    @pmi0("vmoji_character_id")
    private final String vmojiCharacterId;

    /* compiled from: StickersPackLinkItemDto.kt */
    public static final class a implements Parcelable.Creator<StickersPackLinkItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPackLinkItemDto createFromParcel(Parcel parcel) {
            return new StickersPackLinkItemDto(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPackLinkItemDto[] newArray(int i) {
            return new StickersPackLinkItemDto[i];
        }
    }

    public StickersPackLinkItemDto(boolean z, String str, String str2) {
        this.isVmoji = z;
        this.vmojiCharacterId = str;
        this.background = str2;
    }

    public final boolean d() {
        return this.isVmoji;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPackLinkItemDto)) {
            return false;
        }
        StickersPackLinkItemDto stickersPackLinkItemDto = (StickersPackLinkItemDto) obj;
        return this.isVmoji == stickersPackLinkItemDto.isVmoji && epx.f(this.vmojiCharacterId, stickersPackLinkItemDto.vmojiCharacterId) && epx.f(this.background, stickersPackLinkItemDto.background);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isVmoji) * 31;
        String str = this.vmojiCharacterId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.background;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPackLinkItemDto(isVmoji=");
        sb.append(this.isVmoji);
        sb.append(", vmojiCharacterId=");
        sb.append(this.vmojiCharacterId);
        sb.append(", background=");
        return ho8.a(sb, this.background, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isVmoji ? 1 : 0);
        parcel.writeString(this.vmojiCharacterId);
        parcel.writeString(this.background);
    }

    public /* synthetic */ StickersPackLinkItemDto(boolean z, String str, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
