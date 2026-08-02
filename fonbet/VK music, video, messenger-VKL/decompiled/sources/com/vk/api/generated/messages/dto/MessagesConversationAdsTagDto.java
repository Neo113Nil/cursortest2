package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesConversationAdsTagDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationAdsTagDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationAdsTagDto> CREATOR = new a();

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("has_ad_access")
    private final Boolean hasAdAccess;

    @pmi0("is_easy_promoted_market")
    private final Boolean isEasyPromotedMarket;

    @pmi0("is_mail_ru_ad")
    private final Boolean isMailRuAd;

    /* compiled from: MessagesConversationAdsTagDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationAdsTagDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationAdsTagDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationAdsTagDto(valueOf, valueOf2, valueOf3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationAdsTagDto[] newArray(int i) {
            return new MessagesConversationAdsTagDto[i];
        }
    }

    public MessagesConversationAdsTagDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationAdsTagDto)) {
            return false;
        }
        MessagesConversationAdsTagDto messagesConversationAdsTagDto = (MessagesConversationAdsTagDto) obj;
        return epx.f(this.isMailRuAd, messagesConversationAdsTagDto.isMailRuAd) && epx.f(this.hasAdAccess, messagesConversationAdsTagDto.hasAdAccess) && epx.f(this.isEasyPromotedMarket, messagesConversationAdsTagDto.isEasyPromotedMarket) && epx.f(this.adId, messagesConversationAdsTagDto.adId);
    }

    public final int hashCode() {
        Boolean bool = this.isMailRuAd;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasAdAccess;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEasyPromotedMarket;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.adId;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationAdsTagDto(isMailRuAd=");
        sb.append(this.isMailRuAd);
        sb.append(", hasAdAccess=");
        sb.append(this.hasAdAccess);
        sb.append(", isEasyPromotedMarket=");
        sb.append(this.isEasyPromotedMarket);
        sb.append(", adId=");
        return uqi.b(sb, this.adId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isMailRuAd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasAdAccess;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isEasyPromotedMarket;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num = this.adId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesConversationAdsTagDto(Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
        this.isMailRuAd = bool;
        this.hasAdAccess = bool2;
        this.isEasyPromotedMarket = bool3;
        this.adId = num;
    }

    public /* synthetic */ MessagesConversationAdsTagDto(Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num);
    }
}
