package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesSendIntentDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSendIntentDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSendIntentDto[] $VALUES;

    @pmi0("account_update")
    public static final MessagesSendIntentDto ACCOUNT_UPDATE;

    @pmi0("bot_ad_invite")
    public static final MessagesSendIntentDto BOT_AD_INVITE;

    @pmi0("bot_ad_promo")
    public static final MessagesSendIntentDto BOT_AD_PROMO;

    @pmi0("confirmed_notification")
    public static final MessagesSendIntentDto CONFIRMED_NOTIFICATION;
    public static final Parcelable.Creator<MessagesSendIntentDto> CREATOR;

    @pmi0("customer_support")
    public static final MessagesSendIntentDto CUSTOMER_SUPPORT;

    @pmi0(BuildConfig.FLAVOR)
    public static final MessagesSendIntentDto DEFAULT;

    @pmi0("finance_notification")
    public static final MessagesSendIntentDto FINANCE_NOTIFICATION;

    @pmi0("game_notification")
    public static final MessagesSendIntentDto GAME_NOTIFICATION;

    @pmi0("moderated_newsletter")
    public static final MessagesSendIntentDto MODERATED_NEWSLETTER;

    @pmi0("non_promo_newsletter")
    public static final MessagesSendIntentDto NON_PROMO_NEWSLETTER;

    @pmi0("promo_newsletter")
    public static final MessagesSendIntentDto PROMO_NEWSLETTER;

    @pmi0("purchase_update")
    public static final MessagesSendIntentDto PURCHASE_UPDATE;
    private final String value;

    /* compiled from: MessagesSendIntentDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSendIntentDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSendIntentDto createFromParcel(Parcel parcel) {
            return MessagesSendIntentDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSendIntentDto[] newArray(int i) {
            return new MessagesSendIntentDto[i];
        }
    }

    static {
        MessagesSendIntentDto messagesSendIntentDto = new MessagesSendIntentDto("ACCOUNT_UPDATE", 0, "account_update");
        ACCOUNT_UPDATE = messagesSendIntentDto;
        MessagesSendIntentDto messagesSendIntentDto2 = new MessagesSendIntentDto("BOT_AD_INVITE", 1, "bot_ad_invite");
        BOT_AD_INVITE = messagesSendIntentDto2;
        MessagesSendIntentDto messagesSendIntentDto3 = new MessagesSendIntentDto("BOT_AD_PROMO", 2, "bot_ad_promo");
        BOT_AD_PROMO = messagesSendIntentDto3;
        MessagesSendIntentDto messagesSendIntentDto4 = new MessagesSendIntentDto("CONFIRMED_NOTIFICATION", 3, "confirmed_notification");
        CONFIRMED_NOTIFICATION = messagesSendIntentDto4;
        MessagesSendIntentDto messagesSendIntentDto5 = new MessagesSendIntentDto("CUSTOMER_SUPPORT", 4, "customer_support");
        CUSTOMER_SUPPORT = messagesSendIntentDto5;
        MessagesSendIntentDto messagesSendIntentDto6 = new MessagesSendIntentDto("DEFAULT", 5, BuildConfig.FLAVOR);
        DEFAULT = messagesSendIntentDto6;
        MessagesSendIntentDto messagesSendIntentDto7 = new MessagesSendIntentDto("FINANCE_NOTIFICATION", 6, "finance_notification");
        FINANCE_NOTIFICATION = messagesSendIntentDto7;
        MessagesSendIntentDto messagesSendIntentDto8 = new MessagesSendIntentDto("GAME_NOTIFICATION", 7, "game_notification");
        GAME_NOTIFICATION = messagesSendIntentDto8;
        MessagesSendIntentDto messagesSendIntentDto9 = new MessagesSendIntentDto("MODERATED_NEWSLETTER", 8, "moderated_newsletter");
        MODERATED_NEWSLETTER = messagesSendIntentDto9;
        MessagesSendIntentDto messagesSendIntentDto10 = new MessagesSendIntentDto("NON_PROMO_NEWSLETTER", 9, "non_promo_newsletter");
        NON_PROMO_NEWSLETTER = messagesSendIntentDto10;
        MessagesSendIntentDto messagesSendIntentDto11 = new MessagesSendIntentDto("PROMO_NEWSLETTER", 10, "promo_newsletter");
        PROMO_NEWSLETTER = messagesSendIntentDto11;
        MessagesSendIntentDto messagesSendIntentDto12 = new MessagesSendIntentDto("PURCHASE_UPDATE", 11, "purchase_update");
        PURCHASE_UPDATE = messagesSendIntentDto12;
        MessagesSendIntentDto[] messagesSendIntentDtoArr = {messagesSendIntentDto, messagesSendIntentDto2, messagesSendIntentDto3, messagesSendIntentDto4, messagesSendIntentDto5, messagesSendIntentDto6, messagesSendIntentDto7, messagesSendIntentDto8, messagesSendIntentDto9, messagesSendIntentDto10, messagesSendIntentDto11, messagesSendIntentDto12};
        $VALUES = messagesSendIntentDtoArr;
        $ENTRIES = new asp(messagesSendIntentDtoArr);
        CREATOR = new a();
    }

    private MessagesSendIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesSendIntentDto valueOf(String str) {
        return (MessagesSendIntentDto) Enum.valueOf(MessagesSendIntentDto.class, str);
    }

    public static MessagesSendIntentDto[] values() {
        return (MessagesSendIntentDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
