package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePushesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings implements SchemeStat$TypeAction.b {

    @pmi0("app_state")
    private final AppState appState;

    @pmi0("channels_settings")
    private final List<MobileOfficialAppsCorePushesStat$PushChannelItem> channelsSettings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class AppState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppState[] $VALUES;

        @pmi0(L2.g)
        public static final AppState BACKGROUND;

        @pmi0("foreground")
        public static final AppState FOREGROUND;

        @pmi0("not_running")
        public static final AppState NOT_RUNNING;

        static {
            AppState appState = new AppState("FOREGROUND", 0);
            FOREGROUND = appState;
            AppState appState2 = new AppState("BACKGROUND", 1);
            BACKGROUND = appState2;
            AppState appState3 = new AppState("NOT_RUNNING", 2);
            NOT_RUNNING = appState3;
            AppState[] appStateArr = {appState, appState2, appState3};
            $VALUES = appStateArr;
            $ENTRIES = new asp(appStateArr);
        }

        private AppState(String str, int i) {
        }

        public static AppState valueOf(String str) {
            return (AppState) Enum.valueOf(AppState.class, str);
        }

        public static AppState[] values() {
            return (AppState[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings(AppState appState, List<MobileOfficialAppsCorePushesStat$PushChannelItem> list) {
        this.appState = appState;
        this.channelsSettings = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings)) {
            return false;
        }
        MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings = (MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings) obj;
        return this.appState == mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings.appState && epx.f(this.channelsSettings, mobileOfficialAppsCorePushesStat$TypePushNotificationsSettings.channelsSettings);
    }

    public final int hashCode() {
        int hashCode = this.appState.hashCode() * 31;
        List<MobileOfficialAppsCorePushesStat$PushChannelItem> list = this.channelsSettings;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePushNotificationsSettings(appState=");
        sb.append(this.appState);
        sb.append(", channelsSettings=");
        return ms9.a(')', sb, this.channelsSettings);
    }

    public /* synthetic */ MobileOfficialAppsCorePushesStat$TypePushNotificationsSettings(AppState appState, List list, int i, zcl zclVar) {
        this(appState, (i & 2) != 0 ? null : list);
    }
}
