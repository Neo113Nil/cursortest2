package com.vk.stat.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$SettingsEvent {

    @pmi0("coowner_ids")
    private final List<Long> coownerIds;

    @pmi0("copyright_url")
    private final String copyrightUrl;

    @pmi0("donut_status")
    private final Integer donutStatus;

    @pmi0("has_comments_on")
    private final Boolean hasCommentsOn;

    @pmi0("has_notification_on")
    private final Boolean hasNotificationOn;

    @pmi0("has_story_on")
    private final Boolean hasStoryOn;

    @pmi0("post_privacy")
    private final PostPrivacy postPrivacy;

    @pmi0("postponed_time")
    private final Long postponedTime;

    @pmi0("settings_event_type")
    private final SettingsEventType settingsEventType;

    @pmi0("target_coowner_ids")
    private final List<Long> targetCoownerIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PostPrivacy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostPrivacy[] $VALUES;

        @pmi0("best_friends_only")
        public static final PostPrivacy BEST_FRIENDS_ONLY;

        @pmi0("friends_only")
        public static final PostPrivacy FRIENDS_ONLY;

        @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
        public static final PostPrivacy PUBLIC;

        static {
            PostPrivacy postPrivacy = new PostPrivacy(Privacy.PUBLIC, 0);
            PUBLIC = postPrivacy;
            PostPrivacy postPrivacy2 = new PostPrivacy("FRIENDS_ONLY", 1);
            FRIENDS_ONLY = postPrivacy2;
            PostPrivacy postPrivacy3 = new PostPrivacy("BEST_FRIENDS_ONLY", 2);
            BEST_FRIENDS_ONLY = postPrivacy3;
            PostPrivacy[] postPrivacyArr = {postPrivacy, postPrivacy2, postPrivacy3};
            $VALUES = postPrivacyArr;
            $ENTRIES = new asp(postPrivacyArr);
        }

        private PostPrivacy(String str, int i) {
        }

        public static PostPrivacy valueOf(String str) {
            return (PostPrivacy) Enum.valueOf(PostPrivacy.class, str);
        }

        public static PostPrivacy[] values() {
            return (PostPrivacy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class SettingsEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SettingsEventType[] $VALUES;

        @pmi0("ad_turn_off")
        public static final SettingsEventType AD_TURN_OFF;

        @pmi0("ad_turn_on")
        public static final SettingsEventType AD_TURN_ON;

        @pmi0("attach_copyright")
        public static final SettingsEventType ATTACH_COPYRIGHT;

        @pmi0("change_author")
        public static final SettingsEventType CHANGE_AUTHOR;

        @pmi0("change_comments")
        public static final SettingsEventType CHANGE_COMMENTS;

        @pmi0("change_donut_privacy")
        public static final SettingsEventType CHANGE_DONUT_PRIVACY;

        @pmi0("change_notification")
        public static final SettingsEventType CHANGE_NOTIFICATION;

        @pmi0("change_postponed")
        public static final SettingsEventType CHANGE_POSTPONED;

        @pmi0("change_privacy")
        public static final SettingsEventType CHANGE_PRIVACY;

        @pmi0("change_story")
        public static final SettingsEventType CHANGE_STORY;

        @pmi0("change_subjects")
        public static final SettingsEventType CHANGE_SUBJECTS;

        @pmi0("click_to_advertising_mark")
        public static final SettingsEventType CLICK_TO_ADVERTISING_MARK;

        @pmi0("create_copyright")
        public static final SettingsEventType CREATE_COPYRIGHT;

        @pmi0("dons_post_lifetime_change")
        public static final SettingsEventType DONS_POST_LIFETIME_CHANGE;

        @pmi0("open_modal_coowners")
        public static final SettingsEventType OPEN_MODAL_COOWNERS;

        @pmi0("open_postponed")
        public static final SettingsEventType OPEN_POSTPONED;

        @pmi0("open_privacy")
        public static final SettingsEventType OPEN_PRIVACY;

        @pmi0("open_settings")
        public static final SettingsEventType OPEN_SETTINGS;

        @pmi0("select_author")
        public static final SettingsEventType SELECT_AUTHOR;

        @pmi0("select_postponed")
        public static final SettingsEventType SELECT_POSTPONED;

        @pmi0("select_subjects")
        public static final SettingsEventType SELECT_SUBJECTS;

        @pmi0("show_all")
        public static final SettingsEventType SHOW_ALL;

        @pmi0("show_dons_only")
        public static final SettingsEventType SHOW_DONS_ONLY;

        @pmi0("show_toggle_cta_button")
        public static final SettingsEventType SHOW_TOGGLE_CTA_BUTTON;

        @pmi0("to_carousel")
        public static final SettingsEventType TO_CAROUSEL;

        @pmi0("to_carousel_auto")
        public static final SettingsEventType TO_CAROUSEL_AUTO;

        @pmi0("to_grid")
        public static final SettingsEventType TO_GRID;

        @pmi0("turn_off_notifications")
        public static final SettingsEventType TURN_OFF_NOTIFICATIONS;

        @pmi0("turn_on_notifications")
        public static final SettingsEventType TURN_ON_NOTIFICATIONS;

        static {
            SettingsEventType settingsEventType = new SettingsEventType("SELECT_AUTHOR", 0);
            SELECT_AUTHOR = settingsEventType;
            SettingsEventType settingsEventType2 = new SettingsEventType("CHANGE_AUTHOR", 1);
            CHANGE_AUTHOR = settingsEventType2;
            SettingsEventType settingsEventType3 = new SettingsEventType("CHANGE_PRIVACY", 2);
            CHANGE_PRIVACY = settingsEventType3;
            SettingsEventType settingsEventType4 = new SettingsEventType("SELECT_POSTPONED", 3);
            SELECT_POSTPONED = settingsEventType4;
            SettingsEventType settingsEventType5 = new SettingsEventType("CHANGE_POSTPONED", 4);
            CHANGE_POSTPONED = settingsEventType5;
            SettingsEventType settingsEventType6 = new SettingsEventType("SELECT_SUBJECTS", 5);
            SELECT_SUBJECTS = settingsEventType6;
            SettingsEventType settingsEventType7 = new SettingsEventType("CHANGE_SUBJECTS", 6);
            CHANGE_SUBJECTS = settingsEventType7;
            SettingsEventType settingsEventType8 = new SettingsEventType("OPEN_SETTINGS", 7);
            OPEN_SETTINGS = settingsEventType8;
            SettingsEventType settingsEventType9 = new SettingsEventType("CREATE_COPYRIGHT", 8);
            CREATE_COPYRIGHT = settingsEventType9;
            SettingsEventType settingsEventType10 = new SettingsEventType("ATTACH_COPYRIGHT", 9);
            ATTACH_COPYRIGHT = settingsEventType10;
            SettingsEventType settingsEventType11 = new SettingsEventType("TURN_ON_NOTIFICATIONS", 10);
            TURN_ON_NOTIFICATIONS = settingsEventType11;
            SettingsEventType settingsEventType12 = new SettingsEventType("TURN_OFF_NOTIFICATIONS", 11);
            TURN_OFF_NOTIFICATIONS = settingsEventType12;
            SettingsEventType settingsEventType13 = new SettingsEventType("AD_TURN_ON", 12);
            AD_TURN_ON = settingsEventType13;
            SettingsEventType settingsEventType14 = new SettingsEventType("AD_TURN_OFF", 13);
            AD_TURN_OFF = settingsEventType14;
            SettingsEventType settingsEventType15 = new SettingsEventType("SHOW_DONS_ONLY", 14);
            SHOW_DONS_ONLY = settingsEventType15;
            SettingsEventType settingsEventType16 = new SettingsEventType("SHOW_ALL", 15);
            SHOW_ALL = settingsEventType16;
            SettingsEventType settingsEventType17 = new SettingsEventType("DONS_POST_LIFETIME_CHANGE", 16);
            DONS_POST_LIFETIME_CHANGE = settingsEventType17;
            SettingsEventType settingsEventType18 = new SettingsEventType("CLICK_TO_ADVERTISING_MARK", 17);
            CLICK_TO_ADVERTISING_MARK = settingsEventType18;
            SettingsEventType settingsEventType19 = new SettingsEventType("TO_GRID", 18);
            TO_GRID = settingsEventType19;
            SettingsEventType settingsEventType20 = new SettingsEventType("TO_CAROUSEL", 19);
            TO_CAROUSEL = settingsEventType20;
            SettingsEventType settingsEventType21 = new SettingsEventType("TO_CAROUSEL_AUTO", 20);
            TO_CAROUSEL_AUTO = settingsEventType21;
            SettingsEventType settingsEventType22 = new SettingsEventType("OPEN_POSTPONED", 21);
            OPEN_POSTPONED = settingsEventType22;
            SettingsEventType settingsEventType23 = new SettingsEventType("OPEN_PRIVACY", 22);
            OPEN_PRIVACY = settingsEventType23;
            SettingsEventType settingsEventType24 = new SettingsEventType("CHANGE_STORY", 23);
            CHANGE_STORY = settingsEventType24;
            SettingsEventType settingsEventType25 = new SettingsEventType("CHANGE_DONUT_PRIVACY", 24);
            CHANGE_DONUT_PRIVACY = settingsEventType25;
            SettingsEventType settingsEventType26 = new SettingsEventType("CHANGE_COMMENTS", 25);
            CHANGE_COMMENTS = settingsEventType26;
            SettingsEventType settingsEventType27 = new SettingsEventType("CHANGE_NOTIFICATION", 26);
            CHANGE_NOTIFICATION = settingsEventType27;
            SettingsEventType settingsEventType28 = new SettingsEventType("OPEN_MODAL_COOWNERS", 27);
            OPEN_MODAL_COOWNERS = settingsEventType28;
            SettingsEventType settingsEventType29 = new SettingsEventType("SHOW_TOGGLE_CTA_BUTTON", 28);
            SHOW_TOGGLE_CTA_BUTTON = settingsEventType29;
            SettingsEventType[] settingsEventTypeArr = {settingsEventType, settingsEventType2, settingsEventType3, settingsEventType4, settingsEventType5, settingsEventType6, settingsEventType7, settingsEventType8, settingsEventType9, settingsEventType10, settingsEventType11, settingsEventType12, settingsEventType13, settingsEventType14, settingsEventType15, settingsEventType16, settingsEventType17, settingsEventType18, settingsEventType19, settingsEventType20, settingsEventType21, settingsEventType22, settingsEventType23, settingsEventType24, settingsEventType25, settingsEventType26, settingsEventType27, settingsEventType28, settingsEventType29};
            $VALUES = settingsEventTypeArr;
            $ENTRIES = new asp(settingsEventTypeArr);
        }

        private SettingsEventType(String str, int i) {
        }

        public static SettingsEventType valueOf(String str) {
            return (SettingsEventType) Enum.valueOf(SettingsEventType.class, str);
        }

        public static SettingsEventType[] values() {
            return (SettingsEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$SettingsEvent() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$SettingsEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent = (MobileOfficialAppsConPostingStat$SettingsEvent) obj;
        return this.settingsEventType == mobileOfficialAppsConPostingStat$SettingsEvent.settingsEventType && this.postPrivacy == mobileOfficialAppsConPostingStat$SettingsEvent.postPrivacy && epx.f(this.donutStatus, mobileOfficialAppsConPostingStat$SettingsEvent.donutStatus) && epx.f(this.hasCommentsOn, mobileOfficialAppsConPostingStat$SettingsEvent.hasCommentsOn) && epx.f(this.hasNotificationOn, mobileOfficialAppsConPostingStat$SettingsEvent.hasNotificationOn) && epx.f(this.hasStoryOn, mobileOfficialAppsConPostingStat$SettingsEvent.hasStoryOn) && epx.f(this.copyrightUrl, mobileOfficialAppsConPostingStat$SettingsEvent.copyrightUrl) && epx.f(this.postponedTime, mobileOfficialAppsConPostingStat$SettingsEvent.postponedTime) && epx.f(this.coownerIds, mobileOfficialAppsConPostingStat$SettingsEvent.coownerIds) && epx.f(this.targetCoownerIds, mobileOfficialAppsConPostingStat$SettingsEvent.targetCoownerIds);
    }

    public final int hashCode() {
        SettingsEventType settingsEventType = this.settingsEventType;
        int hashCode = (settingsEventType == null ? 0 : settingsEventType.hashCode()) * 31;
        PostPrivacy postPrivacy = this.postPrivacy;
        int hashCode2 = (hashCode + (postPrivacy == null ? 0 : postPrivacy.hashCode())) * 31;
        Integer num = this.donutStatus;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasCommentsOn;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasNotificationOn;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasStoryOn;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.copyrightUrl;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.postponedTime;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list = this.coownerIds;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.targetCoownerIds;
        return hashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsEvent(settingsEventType=");
        sb.append(this.settingsEventType);
        sb.append(", postPrivacy=");
        sb.append(this.postPrivacy);
        sb.append(", donutStatus=");
        sb.append(this.donutStatus);
        sb.append(", hasCommentsOn=");
        sb.append(this.hasCommentsOn);
        sb.append(", hasNotificationOn=");
        sb.append(this.hasNotificationOn);
        sb.append(", hasStoryOn=");
        sb.append(this.hasStoryOn);
        sb.append(", copyrightUrl=");
        sb.append(this.copyrightUrl);
        sb.append(", postponedTime=");
        sb.append(this.postponedTime);
        sb.append(", coownerIds=");
        sb.append(this.coownerIds);
        sb.append(", targetCoownerIds=");
        return ms9.a(')', sb, this.targetCoownerIds);
    }

    public MobileOfficialAppsConPostingStat$SettingsEvent(SettingsEventType settingsEventType, PostPrivacy postPrivacy, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, Long l, List<Long> list, List<Long> list2) {
        this.settingsEventType = settingsEventType;
        this.postPrivacy = postPrivacy;
        this.donutStatus = num;
        this.hasCommentsOn = bool;
        this.hasNotificationOn = bool2;
        this.hasStoryOn = bool3;
        this.copyrightUrl = str;
        this.postponedTime = l;
        this.coownerIds = list;
        this.targetCoownerIds = list2;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$SettingsEvent(SettingsEventType settingsEventType, PostPrivacy postPrivacy, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, Long l, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : settingsEventType, (i & 2) != 0 ? null : postPrivacy, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2);
    }
}
