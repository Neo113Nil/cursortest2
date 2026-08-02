package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("is_fallback")
    private final Boolean isFallback;

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0("recommended_apps_track_codes")
    private final List<CommonStat$TypeTrackCodeItem> recommendedAppsTrackCodes;

    @pmi0("session_duration")
    private final Integer sessionDuration;

    @pmi0("session_uuid")
    private final MobileOfficialAppsMiniappsStat$SessionUuidItem sessionUuid;

    @pmi0("shows_count")
    private final Integer showsCount;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("cancel_button_click")
        public static final Event CANCEL_BUTTON_CLICK;

        @pmi0("confirm_button_click")
        public static final Event CONFIRM_BUTTON_CLICK;

        @pmi0("modal_show")
        public static final Event MODAL_SHOW;

        @pmi0("recommendation_app_view")
        public static final Event RECOMMENDATION_APP_VIEW;

        @pmi0("show_ad")
        public static final Event SHOW_AD;

        @pmi0("show_recommendation")
        public static final Event SHOW_RECOMMENDATION;

        static {
            Event event = new Event("MODAL_SHOW", 0);
            MODAL_SHOW = event;
            Event event2 = new Event("CONFIRM_BUTTON_CLICK", 1);
            CONFIRM_BUTTON_CLICK = event2;
            Event event3 = new Event("CANCEL_BUTTON_CLICK", 2);
            CANCEL_BUTTON_CLICK = event3;
            Event event4 = new Event("SHOW_AD", 3);
            SHOW_AD = event4;
            Event event5 = new Event("SHOW_RECOMMENDATION", 4);
            SHOW_RECOMMENDATION = event5;
            Event event6 = new Event("RECOMMENDATION_APP_VIEW", 5);
            RECOMMENDATION_APP_VIEW = event6;
            Event[] eventArr = {event, event2, event3, event4, event5, event6};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem) obj;
        return this.event == mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.event && epx.f(this.miniAppId, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.miniAppId) && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.trackCode) && epx.f(this.sessionUuid, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.sessionUuid) && epx.f(this.sessionDuration, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.sessionDuration) && epx.f(this.recommendedAppsTrackCodes, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.recommendedAppsTrackCodes) && epx.f(this.isFallback, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.isFallback) && epx.f(this.showsCount, mobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.showsCount);
    }

    public final int hashCode() {
        Event event = this.event;
        int hashCode = (event == null ? 0 : event.hashCode()) * 31;
        Integer num = this.miniAppId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        int hashCode3 = (hashCode2 + (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem = this.sessionUuid;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsMiniappsStat$SessionUuidItem == null ? 0 : mobileOfficialAppsMiniappsStat$SessionUuidItem.a.hashCode())) * 31;
        Integer num2 = this.sessionDuration;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<CommonStat$TypeTrackCodeItem> list = this.recommendedAppsTrackCodes;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFallback;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.showsCount;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppsCloseConfirmationAlertItem(event=");
        sb.append(this.event);
        sb.append(", miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", sessionUuid=");
        sb.append(this.sessionUuid);
        sb.append(", sessionDuration=");
        sb.append(this.sessionDuration);
        sb.append(", recommendedAppsTrackCodes=");
        sb.append(this.recommendedAppsTrackCodes);
        sb.append(", isFallback=");
        sb.append(this.isFallback);
        sb.append(", showsCount=");
        return uqi.b(sb, this.showsCount, ')');
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem(Event event, Integer num, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem, Integer num2, List<CommonStat$TypeTrackCodeItem> list, Boolean bool, Integer num3) {
        this.event = event;
        this.miniAppId = num;
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.sessionUuid = mobileOfficialAppsMiniappsStat$SessionUuidItem;
        this.sessionDuration = num2;
        this.recommendedAppsTrackCodes = list;
        this.isFallback = bool;
        this.showsCount = num3;
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem(Event event, Integer num, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, MobileOfficialAppsMiniappsStat$SessionUuidItem mobileOfficialAppsMiniappsStat$SessionUuidItem, Integer num2, List list, Boolean bool, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : event, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 8) != 0 ? null : mobileOfficialAppsMiniappsStat$SessionUuidItem, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num3);
    }
}
