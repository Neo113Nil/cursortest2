package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem implements SchemeStat$TypeAction.b {

    @pmi0("app_state")
    private final AppState appState;

    @pmi0("client_time")
    private final String clientTime;

    @pmi0("widgets")
    private final List<MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    public static final class AppState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppState[] $VALUES;

        @pmi0(L2.g)
        public static final AppState BACKGROUND;

        @pmi0("foreground")
        public static final AppState FOREGROUND;

        @pmi0("inactive")
        public static final AppState INACTIVE;

        static {
            AppState appState = new AppState("BACKGROUND", 0);
            BACKGROUND = appState;
            AppState appState2 = new AppState("FOREGROUND", 1);
            FOREGROUND = appState2;
            AppState appState3 = new AppState("INACTIVE", 2);
            INACTIVE = appState3;
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

    public MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem(List<MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity> list, AppState appState, String str) {
        this.widgets = list;
        this.appState = appState;
        this.clientTime = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem)) {
            return false;
        }
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem = (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem) obj;
        return epx.f(this.widgets, mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem.widgets) && this.appState == mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem.appState && epx.f(this.clientTime, mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetDisplayedEventItem.clientTime);
    }

    public final int hashCode() {
        return this.clientTime.hashCode() + ((this.appState.hashCode() + (this.widgets.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSystemWidgetDisplayedEventItem(widgets=");
        sb.append(this.widgets);
        sb.append(", appState=");
        sb.append(this.appState);
        sb.append(", clientTime=");
        return ho8.a(sb, this.clientTime, ')');
    }
}
