package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.account.dto.AccountPrivacySettingDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConfigItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConfigItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConfigItemDto> CREATOR = new a();

    @pmi0("auto_extend_reactions_picker")
    private final Boolean autoExtendReactionsPicker;

    @pmi0("bubble_theme")
    private final Boolean bubbleTheme;

    @pmi0("business_notify_enabled")
    private final Boolean businessNotifyEnabled;

    @pmi0("calls_enabled")
    private final Boolean callsEnabled;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final MessagesChannelsConfigDto channels;

    @pmi0("chat_list_collapse")
    private final Integer chatListCollapse;

    @pmi0("clear_conversations_banner")
    private final Boolean clearConversationsBanner;

    @pmi0("conversation_bar")
    private final MessagesConversationBarDto conversationBar;

    @pmi0("edu_account_switch_banner")
    private final Boolean eduAccountSwitchBanner;

    @pmi0("edu_banner_join_ejd_enabled")
    private final Boolean eduBannerJoinEjdEnabled;

    @pmi0("fast_action_type")
    private final FastActionTypeDto fastActionType;

    @pmi0("im_user_name_type")
    private final String imUserNameType;

    @pmi0("message_reactions_animation")
    private final Boolean messageReactionsAnimation;

    @pmi0("message_self_mention_highlighting")
    private final String messageSelfMentionHighlighting;

    @pmi0("messages_auto_unarchive")
    private final Boolean messagesAutoUnarchive;

    @pmi0("messages_featureblocks_enabled")
    private final MessagesFeatureblocksEnabledDto messagesFeatureblocksEnabled;

    @pmi0("messages_multiline_input")
    private final Boolean messagesMultilineInput;

    @pmi0("messages_reaction_notifications")
    private final MessagesReactionNotificationsSettingsDto messagesReactionNotifications;

    @pmi0("messages_recommendation_list_hidden")
    private final Boolean messagesRecommendationListHidden;

    @pmi0("messages_transcript_auto_show")
    private final Boolean messagesTranscriptAutoShow;

    @pmi0("messages_translation_language_pairs")
    private final List<String> messagesTranslationLanguagePairs;

    @pmi0("modal_web_view_enabled")
    private final Boolean modalWebViewEnabled;

    @pmi0("obscene_text_filter")
    private final Boolean obsceneTextFilter;

    @pmi0("online_privacy_settings")
    private final AccountPrivacySettingDto onlinePrivacySettings;

    @pmi0("profiler_settings")
    private final MessagesConfigItemProfilerSettingsDto profilerSettings;

    @pmi0("reaction_message_limit")
    private final Integer reactionMessageLimit;

    @pmi0("reforged_enabled")
    private final ReforgedEnabledDto reforgedEnabled;

    @pmi0("sbp_enabled")
    private final Boolean sbpEnabled;

    @pmi0("show_only_not_muted_messages")
    private final Boolean showOnlyNotMutedMessages;

    @pmi0("silent_mode_ended_at")
    private final Integer silentModeEndedAt;

    @pmi0("sticker_animation_enabled")
    private final Boolean stickerAnimationEnabled;

    @pmi0("sticker_hints_enabled")
    private final Boolean stickerHintsEnabled;

    @pmi0("theme")
    private final String theme;

    @pmi0("theme_style")
    private final String themeStyle;

    @pmi0("unlocked_reactions")
    private final List<Integer> unlockedReactions;

    @pmi0("vertical_folders_view")
    private final Boolean verticalFoldersView;

    @pmi0("video_messages_blacklist")
    private final MessagesVideoMessagesBlacklistDto videoMessagesBlacklist;

    @pmi0("video_messages_config")
    private final MessagesConfigItemVideoMessageConfigDto videoMessagesConfig;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConfigItemDto.kt */
    public static final class FastActionTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FastActionTypeDto[] $VALUES;
        public static final Parcelable.Creator<FastActionTypeDto> CREATOR;

        @pmi0("hover")
        public static final FastActionTypeDto HOVER;

        @pmi0("hover_and_right_button_click")
        public static final FastActionTypeDto HOVER_AND_RIGHT_BUTTON_CLICK;

        @pmi0("right_button_click")
        public static final FastActionTypeDto RIGHT_BUTTON_CLICK;
        private final String value;

        /* compiled from: MessagesConfigItemDto.kt */
        public static final class a implements Parcelable.Creator<FastActionTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final FastActionTypeDto createFromParcel(Parcel parcel) {
                return FastActionTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FastActionTypeDto[] newArray(int i) {
                return new FastActionTypeDto[i];
            }
        }

        static {
            FastActionTypeDto fastActionTypeDto = new FastActionTypeDto("HOVER", 0, "hover");
            HOVER = fastActionTypeDto;
            FastActionTypeDto fastActionTypeDto2 = new FastActionTypeDto("RIGHT_BUTTON_CLICK", 1, "right_button_click");
            RIGHT_BUTTON_CLICK = fastActionTypeDto2;
            FastActionTypeDto fastActionTypeDto3 = new FastActionTypeDto("HOVER_AND_RIGHT_BUTTON_CLICK", 2, "hover_and_right_button_click");
            HOVER_AND_RIGHT_BUTTON_CLICK = fastActionTypeDto3;
            FastActionTypeDto[] fastActionTypeDtoArr = {fastActionTypeDto, fastActionTypeDto2, fastActionTypeDto3};
            $VALUES = fastActionTypeDtoArr;
            $ENTRIES = new asp(fastActionTypeDtoArr);
            CREATOR = new a();
        }

        private FastActionTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FastActionTypeDto valueOf(String str) {
            return (FastActionTypeDto) Enum.valueOf(FastActionTypeDto.class, str);
        }

        public static FastActionTypeDto[] values() {
            return (FastActionTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConfigItemDto.kt */
    public static final class ReforgedEnabledDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReforgedEnabledDto[] $VALUES;
        public static final Parcelable.Creator<ReforgedEnabledDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final ReforgedEnabledDto DEFAULT;

        @pmi0(C4217a2.e)
        public static final ReforgedEnabledDto DISABLED;

        @pmi0("enabled")
        public static final ReforgedEnabledDto ENABLED;
        private final String value;

        /* compiled from: MessagesConfigItemDto.kt */
        public static final class a implements Parcelable.Creator<ReforgedEnabledDto> {
            @Override // android.os.Parcelable.Creator
            public final ReforgedEnabledDto createFromParcel(Parcel parcel) {
                return ReforgedEnabledDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReforgedEnabledDto[] newArray(int i) {
                return new ReforgedEnabledDto[i];
            }
        }

        static {
            ReforgedEnabledDto reforgedEnabledDto = new ReforgedEnabledDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = reforgedEnabledDto;
            ReforgedEnabledDto reforgedEnabledDto2 = new ReforgedEnabledDto("ENABLED", 1, "enabled");
            ENABLED = reforgedEnabledDto2;
            ReforgedEnabledDto reforgedEnabledDto3 = new ReforgedEnabledDto("DISABLED", 2, C4217a2.e);
            DISABLED = reforgedEnabledDto3;
            ReforgedEnabledDto[] reforgedEnabledDtoArr = {reforgedEnabledDto, reforgedEnabledDto2, reforgedEnabledDto3};
            $VALUES = reforgedEnabledDtoArr;
            $ENTRIES = new asp(reforgedEnabledDtoArr);
            CREATOR = new a();
        }

        private ReforgedEnabledDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReforgedEnabledDto valueOf(String str) {
            return (ReforgedEnabledDto) Enum.valueOf(ReforgedEnabledDto.class, str);
        }

        public static ReforgedEnabledDto[] values() {
            return (ReforgedEnabledDto[]) $VALUES.clone();
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

    /* compiled from: MessagesConfigItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConfigItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            ArrayList arrayList;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            Boolean valueOf18;
            Boolean valueOf19;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesConfigItemVideoMessageConfigDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConfigItemVideoMessageConfigDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            FastActionTypeDto createFromParcel2 = parcel.readInt() == 0 ? null : FastActionTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            MessagesConfigItemProfilerSettingsDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesConfigItemProfilerSettingsDto.CREATOR.createFromParcel(parcel);
            MessagesConversationBarDto messagesConversationBarDto = (MessagesConversationBarDto) parcel.readParcelable(MessagesConfigItemDto.class.getClassLoader());
            MessagesReactionNotificationsSettingsDto createFromParcel4 = parcel.readInt() == 0 ? null : MessagesReactionNotificationsSettingsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            AccountPrivacySettingDto accountPrivacySettingDto = (AccountPrivacySettingDto) parcel.readParcelable(MessagesConfigItemDto.class.getClassLoader());
            MessagesFeatureblocksEnabledDto createFromParcel5 = parcel.readInt() == 0 ? null : MessagesFeatureblocksEnabledDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf17 = null;
            } else {
                valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ReforgedEnabledDto createFromParcel6 = parcel.readInt() == 0 ? null : ReforgedEnabledDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            MessagesVideoMessagesBlacklistDto createFromParcel7 = parcel.readInt() == 0 ? null : MessagesVideoMessagesBlacklistDto.CREATOR.createFromParcel(parcel);
            MessagesChannelsConfigDto createFromParcel8 = parcel.readInt() == 0 ? null : MessagesChannelsConfigDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConfigItemDto(valueOf, valueOf20, valueOf2, createFromParcel, valueOf3, createFromParcel2, valueOf4, valueOf5, valueOf6, valueOf7, readString, readString2, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf21, createStringArrayList, createFromParcel3, messagesConversationBarDto, createFromParcel4, arrayList, valueOf22, readString3, accountPrivacySettingDto, createFromParcel5, valueOf15, valueOf16, valueOf17, valueOf18, createFromParcel6, readString4, createFromParcel7, createFromParcel8, valueOf19);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemDto[] newArray(int i) {
            return new MessagesConfigItemDto[i];
        }
    }

    public MessagesConfigItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    public final Boolean d() {
        return this.businessNotifyEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.clearConversationsBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConfigItemDto)) {
            return false;
        }
        MessagesConfigItemDto messagesConfigItemDto = (MessagesConfigItemDto) obj;
        return epx.f(this.sbpEnabled, messagesConfigItemDto.sbpEnabled) && epx.f(this.reactionMessageLimit, messagesConfigItemDto.reactionMessageLimit) && epx.f(this.modalWebViewEnabled, messagesConfigItemDto.modalWebViewEnabled) && epx.f(this.videoMessagesConfig, messagesConfigItemDto.videoMessagesConfig) && epx.f(this.bubbleTheme, messagesConfigItemDto.bubbleTheme) && this.fastActionType == messagesConfigItemDto.fastActionType && epx.f(this.verticalFoldersView, messagesConfigItemDto.verticalFoldersView) && epx.f(this.messageReactionsAnimation, messagesConfigItemDto.messageReactionsAnimation) && epx.f(this.eduAccountSwitchBanner, messagesConfigItemDto.eduAccountSwitchBanner) && epx.f(this.autoExtendReactionsPicker, messagesConfigItemDto.autoExtendReactionsPicker) && epx.f(this.messageSelfMentionHighlighting, messagesConfigItemDto.messageSelfMentionHighlighting) && epx.f(this.theme, messagesConfigItemDto.theme) && epx.f(this.businessNotifyEnabled, messagesConfigItemDto.businessNotifyEnabled) && epx.f(this.showOnlyNotMutedMessages, messagesConfigItemDto.showOnlyNotMutedMessages) && epx.f(this.messagesAutoUnarchive, messagesConfigItemDto.messagesAutoUnarchive) && epx.f(this.messagesTranscriptAutoShow, messagesConfigItemDto.messagesTranscriptAutoShow) && epx.f(this.messagesRecommendationListHidden, messagesConfigItemDto.messagesRecommendationListHidden) && epx.f(this.messagesMultilineInput, messagesConfigItemDto.messagesMultilineInput) && epx.f(this.obsceneTextFilter, messagesConfigItemDto.obsceneTextFilter) && epx.f(this.silentModeEndedAt, messagesConfigItemDto.silentModeEndedAt) && epx.f(this.messagesTranslationLanguagePairs, messagesConfigItemDto.messagesTranslationLanguagePairs) && epx.f(this.profilerSettings, messagesConfigItemDto.profilerSettings) && epx.f(this.conversationBar, messagesConfigItemDto.conversationBar) && epx.f(this.messagesReactionNotifications, messagesConfigItemDto.messagesReactionNotifications) && epx.f(this.unlockedReactions, messagesConfigItemDto.unlockedReactions) && epx.f(this.chatListCollapse, messagesConfigItemDto.chatListCollapse) && epx.f(this.imUserNameType, messagesConfigItemDto.imUserNameType) && epx.f(this.onlinePrivacySettings, messagesConfigItemDto.onlinePrivacySettings) && epx.f(this.messagesFeatureblocksEnabled, messagesConfigItemDto.messagesFeatureblocksEnabled) && epx.f(this.eduBannerJoinEjdEnabled, messagesConfigItemDto.eduBannerJoinEjdEnabled) && epx.f(this.stickerHintsEnabled, messagesConfigItemDto.stickerHintsEnabled) && epx.f(this.stickerAnimationEnabled, messagesConfigItemDto.stickerAnimationEnabled) && epx.f(this.callsEnabled, messagesConfigItemDto.callsEnabled) && this.reforgedEnabled == messagesConfigItemDto.reforgedEnabled && epx.f(this.themeStyle, messagesConfigItemDto.themeStyle) && epx.f(this.videoMessagesBlacklist, messagesConfigItemDto.videoMessagesBlacklist) && epx.f(this.channels, messagesConfigItemDto.channels) && epx.f(this.clearConversationsBanner, messagesConfigItemDto.clearConversationsBanner);
    }

    public final MessagesConversationBarDto f() {
        return this.conversationBar;
    }

    public final Boolean g() {
        return this.eduBannerJoinEjdEnabled;
    }

    public final int hashCode() {
        Boolean bool = this.sbpEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.reactionMessageLimit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.modalWebViewEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MessagesConfigItemVideoMessageConfigDto messagesConfigItemVideoMessageConfigDto = this.videoMessagesConfig;
        int hashCode4 = (hashCode3 + (messagesConfigItemVideoMessageConfigDto == null ? 0 : messagesConfigItemVideoMessageConfigDto.hashCode())) * 31;
        Boolean bool3 = this.bubbleTheme;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        FastActionTypeDto fastActionTypeDto = this.fastActionType;
        int hashCode6 = (hashCode5 + (fastActionTypeDto == null ? 0 : fastActionTypeDto.hashCode())) * 31;
        Boolean bool4 = this.verticalFoldersView;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.messageReactionsAnimation;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.eduAccountSwitchBanner;
        int hashCode9 = (hashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.autoExtendReactionsPicker;
        int hashCode10 = (hashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str = this.messageSelfMentionHighlighting;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.theme;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool8 = this.businessNotifyEnabled;
        int hashCode13 = (hashCode12 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.showOnlyNotMutedMessages;
        int hashCode14 = (hashCode13 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.messagesAutoUnarchive;
        int hashCode15 = (hashCode14 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.messagesTranscriptAutoShow;
        int hashCode16 = (hashCode15 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.messagesRecommendationListHidden;
        int hashCode17 = (hashCode16 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.messagesMultilineInput;
        int hashCode18 = (hashCode17 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.obsceneTextFilter;
        int hashCode19 = (hashCode18 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Integer num2 = this.silentModeEndedAt;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.messagesTranslationLanguagePairs;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        MessagesConfigItemProfilerSettingsDto messagesConfigItemProfilerSettingsDto = this.profilerSettings;
        int hashCode22 = (hashCode21 + (messagesConfigItemProfilerSettingsDto == null ? 0 : messagesConfigItemProfilerSettingsDto.hashCode())) * 31;
        MessagesConversationBarDto messagesConversationBarDto = this.conversationBar;
        int hashCode23 = (hashCode22 + (messagesConversationBarDto == null ? 0 : messagesConversationBarDto.hashCode())) * 31;
        MessagesReactionNotificationsSettingsDto messagesReactionNotificationsSettingsDto = this.messagesReactionNotifications;
        int hashCode24 = (hashCode23 + (messagesReactionNotificationsSettingsDto == null ? 0 : messagesReactionNotificationsSettingsDto.hashCode())) * 31;
        List<Integer> list2 = this.unlockedReactions;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.chatListCollapse;
        int hashCode26 = (hashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.imUserNameType;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AccountPrivacySettingDto accountPrivacySettingDto = this.onlinePrivacySettings;
        int hashCode28 = (hashCode27 + (accountPrivacySettingDto == null ? 0 : accountPrivacySettingDto.hashCode())) * 31;
        MessagesFeatureblocksEnabledDto messagesFeatureblocksEnabledDto = this.messagesFeatureblocksEnabled;
        int hashCode29 = (hashCode28 + (messagesFeatureblocksEnabledDto == null ? 0 : messagesFeatureblocksEnabledDto.hashCode())) * 31;
        Boolean bool15 = this.eduBannerJoinEjdEnabled;
        int hashCode30 = (hashCode29 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.stickerHintsEnabled;
        int hashCode31 = (hashCode30 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.stickerAnimationEnabled;
        int hashCode32 = (hashCode31 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.callsEnabled;
        int hashCode33 = (hashCode32 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        ReforgedEnabledDto reforgedEnabledDto = this.reforgedEnabled;
        int hashCode34 = (hashCode33 + (reforgedEnabledDto == null ? 0 : reforgedEnabledDto.hashCode())) * 31;
        String str4 = this.themeStyle;
        int hashCode35 = (hashCode34 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MessagesVideoMessagesBlacklistDto messagesVideoMessagesBlacklistDto = this.videoMessagesBlacklist;
        int hashCode36 = (hashCode35 + (messagesVideoMessagesBlacklistDto == null ? 0 : messagesVideoMessagesBlacklistDto.hashCode())) * 31;
        MessagesChannelsConfigDto messagesChannelsConfigDto = this.channels;
        int hashCode37 = (hashCode36 + (messagesChannelsConfigDto == null ? 0 : messagesChannelsConfigDto.hashCode())) * 31;
        Boolean bool19 = this.clearConversationsBanner;
        return hashCode37 + (bool19 != null ? bool19.hashCode() : 0);
    }

    public final Boolean i() {
        return this.modalWebViewEnabled;
    }

    public final AccountPrivacySettingDto j() {
        return this.onlinePrivacySettings;
    }

    public final Boolean k() {
        return this.sbpEnabled;
    }

    public final MessagesVideoMessagesBlacklistDto l() {
        return this.videoMessagesBlacklist;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConfigItemDto(sbpEnabled=");
        sb.append(this.sbpEnabled);
        sb.append(", reactionMessageLimit=");
        sb.append(this.reactionMessageLimit);
        sb.append(", modalWebViewEnabled=");
        sb.append(this.modalWebViewEnabled);
        sb.append(", videoMessagesConfig=");
        sb.append(this.videoMessagesConfig);
        sb.append(", bubbleTheme=");
        sb.append(this.bubbleTheme);
        sb.append(", fastActionType=");
        sb.append(this.fastActionType);
        sb.append(", verticalFoldersView=");
        sb.append(this.verticalFoldersView);
        sb.append(", messageReactionsAnimation=");
        sb.append(this.messageReactionsAnimation);
        sb.append(", eduAccountSwitchBanner=");
        sb.append(this.eduAccountSwitchBanner);
        sb.append(", autoExtendReactionsPicker=");
        sb.append(this.autoExtendReactionsPicker);
        sb.append(", messageSelfMentionHighlighting=");
        sb.append(this.messageSelfMentionHighlighting);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", businessNotifyEnabled=");
        sb.append(this.businessNotifyEnabled);
        sb.append(", showOnlyNotMutedMessages=");
        sb.append(this.showOnlyNotMutedMessages);
        sb.append(", messagesAutoUnarchive=");
        sb.append(this.messagesAutoUnarchive);
        sb.append(", messagesTranscriptAutoShow=");
        sb.append(this.messagesTranscriptAutoShow);
        sb.append(", messagesRecommendationListHidden=");
        sb.append(this.messagesRecommendationListHidden);
        sb.append(", messagesMultilineInput=");
        sb.append(this.messagesMultilineInput);
        sb.append(", obsceneTextFilter=");
        sb.append(this.obsceneTextFilter);
        sb.append(", silentModeEndedAt=");
        sb.append(this.silentModeEndedAt);
        sb.append(", messagesTranslationLanguagePairs=");
        sb.append(this.messagesTranslationLanguagePairs);
        sb.append(", profilerSettings=");
        sb.append(this.profilerSettings);
        sb.append(", conversationBar=");
        sb.append(this.conversationBar);
        sb.append(", messagesReactionNotifications=");
        sb.append(this.messagesReactionNotifications);
        sb.append(", unlockedReactions=");
        sb.append(this.unlockedReactions);
        sb.append(", chatListCollapse=");
        sb.append(this.chatListCollapse);
        sb.append(", imUserNameType=");
        sb.append(this.imUserNameType);
        sb.append(", onlinePrivacySettings=");
        sb.append(this.onlinePrivacySettings);
        sb.append(", messagesFeatureblocksEnabled=");
        sb.append(this.messagesFeatureblocksEnabled);
        sb.append(", eduBannerJoinEjdEnabled=");
        sb.append(this.eduBannerJoinEjdEnabled);
        sb.append(", stickerHintsEnabled=");
        sb.append(this.stickerHintsEnabled);
        sb.append(", stickerAnimationEnabled=");
        sb.append(this.stickerAnimationEnabled);
        sb.append(", callsEnabled=");
        sb.append(this.callsEnabled);
        sb.append(", reforgedEnabled=");
        sb.append(this.reforgedEnabled);
        sb.append(", themeStyle=");
        sb.append(this.themeStyle);
        sb.append(", videoMessagesBlacklist=");
        sb.append(this.videoMessagesBlacklist);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", clearConversationsBanner=");
        return tn.a(sb, this.clearConversationsBanner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.sbpEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.reactionMessageLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool2 = this.modalWebViewEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        MessagesConfigItemVideoMessageConfigDto messagesConfigItemVideoMessageConfigDto = this.videoMessagesConfig;
        if (messagesConfigItemVideoMessageConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConfigItemVideoMessageConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.bubbleTheme;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        FastActionTypeDto fastActionTypeDto = this.fastActionType;
        if (fastActionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fastActionTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.verticalFoldersView;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.messageReactionsAnimation;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.eduAccountSwitchBanner;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.autoExtendReactionsPicker;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.messageSelfMentionHighlighting);
        parcel.writeString(this.theme);
        Boolean bool8 = this.businessNotifyEnabled;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.showOnlyNotMutedMessages;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.messagesAutoUnarchive;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.messagesTranscriptAutoShow;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.messagesRecommendationListHidden;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Boolean bool13 = this.messagesMultilineInput;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.obsceneTextFilter;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Integer num2 = this.silentModeEndedAt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeStringList(this.messagesTranslationLanguagePairs);
        MessagesConfigItemProfilerSettingsDto messagesConfigItemProfilerSettingsDto = this.profilerSettings;
        if (messagesConfigItemProfilerSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConfigItemProfilerSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.conversationBar, i);
        MessagesReactionNotificationsSettingsDto messagesReactionNotificationsSettingsDto = this.messagesReactionNotifications;
        if (messagesReactionNotificationsSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesReactionNotificationsSettingsDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.unlockedReactions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num3 = this.chatListCollapse;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.imUserNameType);
        parcel.writeParcelable(this.onlinePrivacySettings, i);
        MessagesFeatureblocksEnabledDto messagesFeatureblocksEnabledDto = this.messagesFeatureblocksEnabled;
        if (messagesFeatureblocksEnabledDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesFeatureblocksEnabledDto.writeToParcel(parcel, i);
        }
        Boolean bool15 = this.eduBannerJoinEjdEnabled;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.stickerHintsEnabled;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.stickerAnimationEnabled;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.callsEnabled;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        ReforgedEnabledDto reforgedEnabledDto = this.reforgedEnabled;
        if (reforgedEnabledDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reforgedEnabledDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.themeStyle);
        MessagesVideoMessagesBlacklistDto messagesVideoMessagesBlacklistDto = this.videoMessagesBlacklist;
        if (messagesVideoMessagesBlacklistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesVideoMessagesBlacklistDto.writeToParcel(parcel, i);
        }
        MessagesChannelsConfigDto messagesChannelsConfigDto = this.channels;
        if (messagesChannelsConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChannelsConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool19 = this.clearConversationsBanner;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
    }

    public MessagesConfigItemDto(Boolean bool, Integer num, Boolean bool2, MessagesConfigItemVideoMessageConfigDto messagesConfigItemVideoMessageConfigDto, Boolean bool3, FastActionTypeDto fastActionTypeDto, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str, String str2, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num2, List<String> list, MessagesConfigItemProfilerSettingsDto messagesConfigItemProfilerSettingsDto, MessagesConversationBarDto messagesConversationBarDto, MessagesReactionNotificationsSettingsDto messagesReactionNotificationsSettingsDto, List<Integer> list2, Integer num3, String str3, AccountPrivacySettingDto accountPrivacySettingDto, MessagesFeatureblocksEnabledDto messagesFeatureblocksEnabledDto, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, ReforgedEnabledDto reforgedEnabledDto, String str4, MessagesVideoMessagesBlacklistDto messagesVideoMessagesBlacklistDto, MessagesChannelsConfigDto messagesChannelsConfigDto, Boolean bool19) {
        this.sbpEnabled = bool;
        this.reactionMessageLimit = num;
        this.modalWebViewEnabled = bool2;
        this.videoMessagesConfig = messagesConfigItemVideoMessageConfigDto;
        this.bubbleTheme = bool3;
        this.fastActionType = fastActionTypeDto;
        this.verticalFoldersView = bool4;
        this.messageReactionsAnimation = bool5;
        this.eduAccountSwitchBanner = bool6;
        this.autoExtendReactionsPicker = bool7;
        this.messageSelfMentionHighlighting = str;
        this.theme = str2;
        this.businessNotifyEnabled = bool8;
        this.showOnlyNotMutedMessages = bool9;
        this.messagesAutoUnarchive = bool10;
        this.messagesTranscriptAutoShow = bool11;
        this.messagesRecommendationListHidden = bool12;
        this.messagesMultilineInput = bool13;
        this.obsceneTextFilter = bool14;
        this.silentModeEndedAt = num2;
        this.messagesTranslationLanguagePairs = list;
        this.profilerSettings = messagesConfigItemProfilerSettingsDto;
        this.conversationBar = messagesConversationBarDto;
        this.messagesReactionNotifications = messagesReactionNotificationsSettingsDto;
        this.unlockedReactions = list2;
        this.chatListCollapse = num3;
        this.imUserNameType = str3;
        this.onlinePrivacySettings = accountPrivacySettingDto;
        this.messagesFeatureblocksEnabled = messagesFeatureblocksEnabledDto;
        this.eduBannerJoinEjdEnabled = bool15;
        this.stickerHintsEnabled = bool16;
        this.stickerAnimationEnabled = bool17;
        this.callsEnabled = bool18;
        this.reforgedEnabled = reforgedEnabledDto;
        this.themeStyle = str4;
        this.videoMessagesBlacklist = messagesVideoMessagesBlacklistDto;
        this.channels = messagesChannelsConfigDto;
        this.clearConversationsBanner = bool19;
    }

    public /* synthetic */ MessagesConfigItemDto(Boolean bool, Integer num, Boolean bool2, MessagesConfigItemVideoMessageConfigDto messagesConfigItemVideoMessageConfigDto, Boolean bool3, FastActionTypeDto fastActionTypeDto, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str, String str2, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num2, List list, MessagesConfigItemProfilerSettingsDto messagesConfigItemProfilerSettingsDto, MessagesConversationBarDto messagesConversationBarDto, MessagesReactionNotificationsSettingsDto messagesReactionNotificationsSettingsDto, List list2, Integer num3, String str3, AccountPrivacySettingDto accountPrivacySettingDto, MessagesFeatureblocksEnabledDto messagesFeatureblocksEnabledDto, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, ReforgedEnabledDto reforgedEnabledDto, String str4, MessagesVideoMessagesBlacklistDto messagesVideoMessagesBlacklistDto, MessagesChannelsConfigDto messagesChannelsConfigDto, Boolean bool19, int i, int i2, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : messagesConfigItemVideoMessageConfigDto, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : fastActionTypeDto, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : bool8, (i & 8192) != 0 ? null : bool9, (i & 16384) != 0 ? null : bool10, (i & 32768) != 0 ? null : bool11, (i & 65536) != 0 ? null : bool12, (i & 131072) != 0 ? null : bool13, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool14, (i & 524288) != 0 ? null : num2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list, (i & 2097152) != 0 ? null : messagesConfigItemProfilerSettingsDto, (i & 4194304) != 0 ? null : messagesConversationBarDto, (i & 8388608) != 0 ? null : messagesReactionNotificationsSettingsDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list2, (i & 33554432) != 0 ? null : num3, (i & 67108864) != 0 ? null : str3, (i & 134217728) != 0 ? null : accountPrivacySettingDto, (i & 268435456) != 0 ? null : messagesFeatureblocksEnabledDto, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool15, (i & 1073741824) != 0 ? null : bool16, (i & Integer.MIN_VALUE) != 0 ? null : bool17, (i2 & 1) != 0 ? null : bool18, (i2 & 2) != 0 ? null : reforgedEnabledDto, (i2 & 4) != 0 ? null : str4, (i2 & 8) != 0 ? null : messagesVideoMessagesBlacklistDto, (i2 & 16) != 0 ? null : messagesChannelsConfigDto, (i2 & 32) != 0 ? null : bool19);
    }
}
