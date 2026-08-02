package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final Action action;

    @pmi0("app_id")
    private final MobileOfficialAppsMiniappsStat$AppIdItem appId;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("mini_app_vk_connect_launch_screen_enter")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER;

        @pmi0("mini_app_vk_connect_launch_screen_permissions_accepted")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED;

        @pmi0("mini_app_vk_connect_launch_screen_view_connect_policy")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY;

        @pmi0("mini_app_vk_connect_launch_screen_view_connect_terms")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS;

        @pmi0("mini_app_vk_connect_launch_screen_view_permissions")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS;

        @pmi0("mini_app_vk_connect_launch_screen_view_service_policy")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY;

        @pmi0("mini_app_vk_connect_launch_screen_view_service_terms")
        public static final Action MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS;

        @pmi0("mini_app_vk_connect_start_screen_app_close")
        public static final Action MINI_APP_VK_CONNECT_START_SCREEN_APP_CLOSE;

        static {
            Action action = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER", 0);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER = action;
            Action action2 = new Action("MINI_APP_VK_CONNECT_START_SCREEN_APP_CLOSE", 1);
            MINI_APP_VK_CONNECT_START_SCREEN_APP_CLOSE = action2;
            Action action3 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED", 2);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED = action3;
            Action action4 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS", 3);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS = action4;
            Action action5 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY", 4);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY = action5;
            Action action6 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS", 5);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS = action6;
            Action action7 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY", 6);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY = action7;
            Action action8 = new Action("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS", 7);
            MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS = action8;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem(Action action, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem) {
        this.action = action;
        this.appId = mobileOfficialAppsMiniappsStat$AppIdItem;
        this.trackCode = commonStat$TypeTrackCodeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem = (MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem) obj;
        return this.action == mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.action && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.appId) && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem = this.appId;
        int hashCode2 = (hashCode + (mobileOfficialAppsMiniappsStat$AppIdItem == null ? 0 : mobileOfficialAppsMiniappsStat$AppIdItem.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        return hashCode2 + (commonStat$TypeTrackCodeItem != null ? commonStat$TypeTrackCodeItem.a.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMiniAppPolicyItem(action=" + this.action + ", appId=" + this.appId + ", trackCode=" + this.trackCode + ')';
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem(Action action, MobileOfficialAppsMiniappsStat$AppIdItem mobileOfficialAppsMiniappsStat$AppIdItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, int i, zcl zclVar) {
        this(action, (i & 2) != 0 ? null : mobileOfficialAppsMiniappsStat$AppIdItem, (i & 4) != 0 ? null : commonStat$TypeTrackCodeItem);
    }
}
