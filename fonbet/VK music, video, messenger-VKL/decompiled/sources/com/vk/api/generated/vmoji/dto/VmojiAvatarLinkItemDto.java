package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiAvatarLinkItemDto.kt */
/* loaded from: classes15.dex */
public final class VmojiAvatarLinkItemDto implements Parcelable {
    public static final Parcelable.Creator<VmojiAvatarLinkItemDto> CREATOR = new a();

    @pmi0(L2.g)
    private final String background;

    /* compiled from: VmojiAvatarLinkItemDto.kt */
    public static final class a implements Parcelable.Creator<VmojiAvatarLinkItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarLinkItemDto createFromParcel(Parcel parcel) {
            return new VmojiAvatarLinkItemDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiAvatarLinkItemDto[] newArray(int i) {
            return new VmojiAvatarLinkItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmojiAvatarLinkItemDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VmojiAvatarLinkItemDto) && epx.f(this.background, ((VmojiAvatarLinkItemDto) obj).background);
    }

    public final int hashCode() {
        String str = this.background;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VmojiAvatarLinkItemDto(background="), this.background, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.background);
    }

    public VmojiAvatarLinkItemDto(String str) {
        this.background = str;
    }

    public /* synthetic */ VmojiAvatarLinkItemDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
