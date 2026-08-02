package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountGetInfoFieldsDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetInfoFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountGetInfoFieldsDto[] $VALUES;

    @pmi0("audio_autoplay")
    public static final AccountGetInfoFieldsDto AUDIO_AUTOPLAY;

    @pmi0("can_change_password")
    public static final AccountGetInfoFieldsDto CAN_CHANGE_PASSWORD;

    @pmi0("clickable_stickers")
    public static final AccountGetInfoFieldsDto CLICKABLE_STICKERS;

    @pmi0("comment_submit_type")
    public static final AccountGetInfoFieldsDto COMMENT_SUBMIT_TYPE;

    @pmi0("conversations_bar")
    public static final AccountGetInfoFieldsDto CONVERSATIONS_BAR;

    @pmi0("country")
    public static final AccountGetInfoFieldsDto COUNTRY;
    public static final Parcelable.Creator<AccountGetInfoFieldsDto> CREATOR;

    @pmi0("eu_user")
    public static final AccountGetInfoFieldsDto EU_USER;

    @pmi0("feed_preloading")
    public static final AccountGetInfoFieldsDto FEED_PRELOADING;

    @pmi0("https_required")
    public static final AccountGetInfoFieldsDto HTTPS_REQUIRED;

    @pmi0("intro")
    public static final AccountGetInfoFieldsDto INTRO;

    @pmi0("is_ads_easy_promote_enabled")
    public static final AccountGetInfoFieldsDto IS_ADS_EASY_PROMOTE_ENABLED;

    @pmi0("is_live_streaming_enabled")
    public static final AccountGetInfoFieldsDto IS_LIVE_STREAMING_ENABLED;

    @pmi0("is_new_live_streaming_enabled")
    public static final AccountGetInfoFieldsDto IS_NEW_LIVE_STREAMING_ENABLED;

    @pmi0("lang")
    public static final AccountGetInfoFieldsDto LANG;

    @pmi0("link_redirects")
    public static final AccountGetInfoFieldsDto LINK_REDIRECTS;

    @pmi0("market_adult_18plus")
    public static final AccountGetInfoFieldsDto MARKET_ADULT_18PLUS;

    @pmi0("messages_reaction_notifications")
    public static final AccountGetInfoFieldsDto MESSAGES_REACTION_NOTIFICATIONS;

    @pmi0("no_wall_replies")
    public static final AccountGetInfoFieldsDto NO_WALL_REPLIES;

    @pmi0("obscene_text_filter")
    public static final AccountGetInfoFieldsDto OBSCENE_TEXT_FILTER;

    @pmi0("own_posts_default")
    public static final AccountGetInfoFieldsDto OWN_POSTS_DEFAULT;

    @pmi0("role")
    public static final AccountGetInfoFieldsDto ROLE;

    @pmi0("security_issue")
    public static final AccountGetInfoFieldsDto SECURITY_ISSUE;

    @pmi0("silent_mode_ended_at")
    public static final AccountGetInfoFieldsDto SILENT_MODE_ENDED_AT;

    @pmi0("stickers_settings")
    public static final AccountGetInfoFieldsDto STICKERS_SETTINGS;

    @pmi0("stream_special_comment_price")
    public static final AccountGetInfoFieldsDto STREAM_SPECIAL_COMMENT_PRICE;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    public static final AccountGetInfoFieldsDto SUBSCRIPTIONS;

    @pmi0("subscription_country")
    public static final AccountGetInfoFieldsDto SUBSCRIPTION_COUNTRY;

    @pmi0("support_url")
    public static final AccountGetInfoFieldsDto SUPPORT_URL;

    @pmi0("2fa_required")
    public static final AccountGetInfoFieldsDto TYPE_2FA_REQUIRED;

    @pmi0("user_id_hash")
    public static final AccountGetInfoFieldsDto USER_ID_HASH;

    @pmi0("vk_pay_endpoint")
    public static final AccountGetInfoFieldsDto VK_PAY_ENDPOINT;
    private final String value;

    /* compiled from: AccountGetInfoFieldsDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetInfoFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetInfoFieldsDto createFromParcel(Parcel parcel) {
            return AccountGetInfoFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetInfoFieldsDto[] newArray(int i) {
            return new AccountGetInfoFieldsDto[i];
        }
    }

    static {
        AccountGetInfoFieldsDto accountGetInfoFieldsDto = new AccountGetInfoFieldsDto("COUNTRY", 0, "country");
        COUNTRY = accountGetInfoFieldsDto;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto2 = new AccountGetInfoFieldsDto("HTTPS_REQUIRED", 1, "https_required");
        HTTPS_REQUIRED = accountGetInfoFieldsDto2;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto3 = new AccountGetInfoFieldsDto("OWN_POSTS_DEFAULT", 2, "own_posts_default");
        OWN_POSTS_DEFAULT = accountGetInfoFieldsDto3;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto4 = new AccountGetInfoFieldsDto("NO_WALL_REPLIES", 3, "no_wall_replies");
        NO_WALL_REPLIES = accountGetInfoFieldsDto4;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto5 = new AccountGetInfoFieldsDto("INTRO", 4, "intro");
        INTRO = accountGetInfoFieldsDto5;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto6 = new AccountGetInfoFieldsDto("LANG", 5, "lang");
        LANG = accountGetInfoFieldsDto6;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto7 = new AccountGetInfoFieldsDto("AUDIO_AUTOPLAY", 6, "audio_autoplay");
        AUDIO_AUTOPLAY = accountGetInfoFieldsDto7;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto8 = new AccountGetInfoFieldsDto("IS_ADS_EASY_PROMOTE_ENABLED", 7, "is_ads_easy_promote_enabled");
        IS_ADS_EASY_PROMOTE_ENABLED = accountGetInfoFieldsDto8;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto9 = new AccountGetInfoFieldsDto("MARKET_ADULT_18PLUS", 8, "market_adult_18plus");
        MARKET_ADULT_18PLUS = accountGetInfoFieldsDto9;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto10 = new AccountGetInfoFieldsDto("SUBSCRIPTION_COUNTRY", 9, "subscription_country");
        SUBSCRIPTION_COUNTRY = accountGetInfoFieldsDto10;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto11 = new AccountGetInfoFieldsDto("VK_PAY_ENDPOINT", 10, "vk_pay_endpoint");
        VK_PAY_ENDPOINT = accountGetInfoFieldsDto11;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto12 = new AccountGetInfoFieldsDto("TYPE_2FA_REQUIRED", 11, "2fa_required");
        TYPE_2FA_REQUIRED = accountGetInfoFieldsDto12;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto13 = new AccountGetInfoFieldsDto("STREAM_SPECIAL_COMMENT_PRICE", 12, "stream_special_comment_price");
        STREAM_SPECIAL_COMMENT_PRICE = accountGetInfoFieldsDto13;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto14 = new AccountGetInfoFieldsDto("SECURITY_ISSUE", 13, "security_issue");
        SECURITY_ISSUE = accountGetInfoFieldsDto14;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto15 = new AccountGetInfoFieldsDto("CLICKABLE_STICKERS", 14, "clickable_stickers");
        CLICKABLE_STICKERS = accountGetInfoFieldsDto15;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto16 = new AccountGetInfoFieldsDto("STICKERS_SETTINGS", 15, "stickers_settings");
        STICKERS_SETTINGS = accountGetInfoFieldsDto16;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto17 = new AccountGetInfoFieldsDto("CAN_CHANGE_PASSWORD", 16, "can_change_password");
        CAN_CHANGE_PASSWORD = accountGetInfoFieldsDto17;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto18 = new AccountGetInfoFieldsDto("IS_LIVE_STREAMING_ENABLED", 17, "is_live_streaming_enabled");
        IS_LIVE_STREAMING_ENABLED = accountGetInfoFieldsDto18;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto19 = new AccountGetInfoFieldsDto("IS_NEW_LIVE_STREAMING_ENABLED", 18, "is_new_live_streaming_enabled");
        IS_NEW_LIVE_STREAMING_ENABLED = accountGetInfoFieldsDto19;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto20 = new AccountGetInfoFieldsDto("EU_USER", 19, "eu_user");
        EU_USER = accountGetInfoFieldsDto20;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto21 = new AccountGetInfoFieldsDto("MESSAGES_REACTION_NOTIFICATIONS", 20, "messages_reaction_notifications");
        MESSAGES_REACTION_NOTIFICATIONS = accountGetInfoFieldsDto21;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto22 = new AccountGetInfoFieldsDto("SUPPORT_URL", 21, "support_url");
        SUPPORT_URL = accountGetInfoFieldsDto22;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto23 = new AccountGetInfoFieldsDto("CONVERSATIONS_BAR", 22, "conversations_bar");
        CONVERSATIONS_BAR = accountGetInfoFieldsDto23;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto24 = new AccountGetInfoFieldsDto("SUBSCRIPTIONS", 23, BillingClient.FeatureType.SUBSCRIPTIONS);
        SUBSCRIPTIONS = accountGetInfoFieldsDto24;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto25 = new AccountGetInfoFieldsDto("SILENT_MODE_ENDED_AT", 24, "silent_mode_ended_at");
        SILENT_MODE_ENDED_AT = accountGetInfoFieldsDto25;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto26 = new AccountGetInfoFieldsDto("ROLE", 25, "role");
        ROLE = accountGetInfoFieldsDto26;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto27 = new AccountGetInfoFieldsDto("OBSCENE_TEXT_FILTER", 26, "obscene_text_filter");
        OBSCENE_TEXT_FILTER = accountGetInfoFieldsDto27;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto28 = new AccountGetInfoFieldsDto("USER_ID_HASH", 27, "user_id_hash");
        USER_ID_HASH = accountGetInfoFieldsDto28;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto29 = new AccountGetInfoFieldsDto("FEED_PRELOADING", 28, "feed_preloading");
        FEED_PRELOADING = accountGetInfoFieldsDto29;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto30 = new AccountGetInfoFieldsDto("LINK_REDIRECTS", 29, "link_redirects");
        LINK_REDIRECTS = accountGetInfoFieldsDto30;
        AccountGetInfoFieldsDto accountGetInfoFieldsDto31 = new AccountGetInfoFieldsDto("COMMENT_SUBMIT_TYPE", 30, "comment_submit_type");
        COMMENT_SUBMIT_TYPE = accountGetInfoFieldsDto31;
        AccountGetInfoFieldsDto[] accountGetInfoFieldsDtoArr = {accountGetInfoFieldsDto, accountGetInfoFieldsDto2, accountGetInfoFieldsDto3, accountGetInfoFieldsDto4, accountGetInfoFieldsDto5, accountGetInfoFieldsDto6, accountGetInfoFieldsDto7, accountGetInfoFieldsDto8, accountGetInfoFieldsDto9, accountGetInfoFieldsDto10, accountGetInfoFieldsDto11, accountGetInfoFieldsDto12, accountGetInfoFieldsDto13, accountGetInfoFieldsDto14, accountGetInfoFieldsDto15, accountGetInfoFieldsDto16, accountGetInfoFieldsDto17, accountGetInfoFieldsDto18, accountGetInfoFieldsDto19, accountGetInfoFieldsDto20, accountGetInfoFieldsDto21, accountGetInfoFieldsDto22, accountGetInfoFieldsDto23, accountGetInfoFieldsDto24, accountGetInfoFieldsDto25, accountGetInfoFieldsDto26, accountGetInfoFieldsDto27, accountGetInfoFieldsDto28, accountGetInfoFieldsDto29, accountGetInfoFieldsDto30, accountGetInfoFieldsDto31};
        $VALUES = accountGetInfoFieldsDtoArr;
        $ENTRIES = new asp(accountGetInfoFieldsDtoArr);
        CREATOR = new a();
    }

    private AccountGetInfoFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountGetInfoFieldsDto valueOf(String str) {
        return (AccountGetInfoFieldsDto) Enum.valueOf(AccountGetInfoFieldsDto.class, str);
    }

    public static AccountGetInfoFieldsDto[] values() {
        return (AccountGetInfoFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
