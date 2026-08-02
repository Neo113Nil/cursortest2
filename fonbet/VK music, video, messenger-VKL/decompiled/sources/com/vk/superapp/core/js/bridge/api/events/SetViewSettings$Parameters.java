package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SetViewSettings.kt */
/* loaded from: classes6.dex */
public final class SetViewSettings$Parameters implements ad6 {

    @pmi0("action_bar_color")
    private final String actionBarColor;

    @pmi0("navigation_bar_color")
    private final String navigationBarColor;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("status_bar_style")
    private final StatusBarStyle statusBarStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetViewSettings.kt */
    public static final class StatusBarStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusBarStyle[] $VALUES;

        @pmi0("dark")
        public static final StatusBarStyle DARK;

        @pmi0("light")
        public static final StatusBarStyle LIGHT;

        static {
            StatusBarStyle statusBarStyle = new StatusBarStyle("LIGHT", 0);
            LIGHT = statusBarStyle;
            StatusBarStyle statusBarStyle2 = new StatusBarStyle("DARK", 1);
            DARK = statusBarStyle2;
            StatusBarStyle[] statusBarStyleArr = {statusBarStyle, statusBarStyle2};
            $VALUES = statusBarStyleArr;
            $ENTRIES = new asp(statusBarStyleArr);
        }

        private StatusBarStyle(String str, int i) {
        }

        public static StatusBarStyle valueOf(String str) {
            return (StatusBarStyle) Enum.valueOf(StatusBarStyle.class, str);
        }

        public static StatusBarStyle[] values() {
            return (StatusBarStyle[]) $VALUES.clone();
        }
    }

    public SetViewSettings$Parameters(StatusBarStyle statusBarStyle, String str, String str2, String str3) {
        this.statusBarStyle = statusBarStyle;
        this.actionBarColor = str;
        this.navigationBarColor = str2;
        this.requestId = str3;
    }

    public static final SetViewSettings$Parameters a(SetViewSettings$Parameters setViewSettings$Parameters) {
        return setViewSettings$Parameters.requestId == null ? new SetViewSettings$Parameters(setViewSettings$Parameters.statusBarStyle, setViewSettings$Parameters.actionBarColor, setViewSettings$Parameters.navigationBarColor, "default_request_id") : setViewSettings$Parameters;
    }

    public static final void b(SetViewSettings$Parameters setViewSettings$Parameters) {
        if (setViewSettings$Parameters.statusBarStyle == null) {
            throw new IllegalArgumentException("Value of non-nullable member statusBarStyle cannot\n                        be null");
        }
    }

    public final String c() {
        return this.actionBarColor;
    }

    public final String d() {
        return this.navigationBarColor;
    }

    public final StatusBarStyle e() {
        return this.statusBarStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetViewSettings$Parameters)) {
            return false;
        }
        SetViewSettings$Parameters setViewSettings$Parameters = (SetViewSettings$Parameters) obj;
        return this.statusBarStyle == setViewSettings$Parameters.statusBarStyle && epx.f(this.actionBarColor, setViewSettings$Parameters.actionBarColor) && epx.f(this.navigationBarColor, setViewSettings$Parameters.navigationBarColor) && epx.f(this.requestId, setViewSettings$Parameters.requestId);
    }

    public final int hashCode() {
        int hashCode = this.statusBarStyle.hashCode() * 31;
        String str = this.actionBarColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.navigationBarColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(statusBarStyle=");
        sb.append(this.statusBarStyle);
        sb.append(", actionBarColor=");
        sb.append(this.actionBarColor);
        sb.append(", navigationBarColor=");
        sb.append(this.navigationBarColor);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ SetViewSettings$Parameters(StatusBarStyle statusBarStyle, String str, String str2, String str3, int i, zcl zclVar) {
        this(statusBarStyle, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
