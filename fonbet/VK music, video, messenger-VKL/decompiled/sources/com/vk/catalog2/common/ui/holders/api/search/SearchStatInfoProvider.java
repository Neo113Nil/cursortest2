package com.vk.catalog2.common.ui.holders.api.search;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* compiled from: SearchStatInfoProvider.kt */
/* loaded from: classes16.dex */
public final class SearchStatInfoProvider {
    public boolean a;
    public Mode b = Mode.Disabled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchStatInfoProvider.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Disabled;
        public static final Mode Enabled;
        public static final Mode EnabledOnlyForLocal;

        static {
            Mode mode = new Mode(PeerConnectionFactory.TRIAL_ENABLED, 0);
            Enabled = mode;
            Mode mode2 = new Mode("EnabledOnlyForLocal", 1);
            EnabledOnlyForLocal = mode2;
            Mode mode3 = new Mode("Disabled", 2);
            Disabled = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public final boolean a() {
        Mode mode = this.b;
        return mode == Mode.Enabled || mode == Mode.EnabledOnlyForLocal;
    }

    public final SearchStatsLoggingInfo b(SchemeStat$EventItem.Type type, String str, boolean z) {
        Mode mode = this.b;
        if (mode == Mode.Disabled) {
            return null;
        }
        Mode mode2 = Mode.EnabledOnlyForLocal;
        if (mode == mode2 && !z) {
            return null;
        }
        UiTracker uiTracker = UiTracker.a;
        return new SearchStatsLoggingInfo(null, 0, type, 0L, str, UiTracker.c(), null, this.a || !z, this.b == mode2, 75, null);
    }
}
