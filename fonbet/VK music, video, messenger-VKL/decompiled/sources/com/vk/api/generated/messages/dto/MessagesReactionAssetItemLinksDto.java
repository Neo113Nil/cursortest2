package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MessagesReactionAssetItemLinksDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionAssetItemLinksDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionAssetItemLinksDto> CREATOR = new a();

    @pmi0("big_animation")
    private final String bigAnimation;

    @pmi0("small_animation")
    private final String smallAnimation;

    /* renamed from: static, reason: not valid java name */
    @pmi0("static")
    private final String f10static;

    /* compiled from: MessagesReactionAssetItemLinksDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionAssetItemLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionAssetItemLinksDto createFromParcel(Parcel parcel) {
            return new MessagesReactionAssetItemLinksDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionAssetItemLinksDto[] newArray(int i) {
            return new MessagesReactionAssetItemLinksDto[i];
        }
    }

    public MessagesReactionAssetItemLinksDto(String str, String str2, String str3) {
        this.bigAnimation = str;
        this.smallAnimation = str2;
        this.f10static = str3;
    }

    public final String d() {
        return this.bigAnimation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.smallAnimation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionAssetItemLinksDto)) {
            return false;
        }
        MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto = (MessagesReactionAssetItemLinksDto) obj;
        return epx.f(this.bigAnimation, messagesReactionAssetItemLinksDto.bigAnimation) && epx.f(this.smallAnimation, messagesReactionAssetItemLinksDto.smallAnimation) && epx.f(this.f10static, messagesReactionAssetItemLinksDto.f10static);
    }

    public final String f() {
        return this.f10static;
    }

    public final int hashCode() {
        return this.f10static.hashCode() + urd0.a(this.bigAnimation.hashCode() * 31, 31, this.smallAnimation);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesReactionAssetItemLinksDto(bigAnimation=");
        sb.append(this.bigAnimation);
        sb.append(", smallAnimation=");
        sb.append(this.smallAnimation);
        sb.append(", static=");
        return ho8.a(sb, this.f10static, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bigAnimation);
        parcel.writeString(this.smallAnimation);
        parcel.writeString(this.f10static);
    }
}
