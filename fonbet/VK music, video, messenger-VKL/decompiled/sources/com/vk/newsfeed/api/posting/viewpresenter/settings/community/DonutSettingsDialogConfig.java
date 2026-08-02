package com.vk.newsfeed.api.posting.viewpresenter.settings.community;

import com.vk.dto.posting.DonutPostingSettings;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.zrp;

/* compiled from: DonutSettingsDialogConfig.kt */
/* loaded from: classes3.dex */
public final class DonutSettingsDialogConfig {
    public final Mode a;
    public final Integer b;
    public final List<DonutPostingSettings.Duration> c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutSettingsDialogConfig.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode All;
        public static final Mode Dones;

        static {
            Mode mode = new Mode("All", 0);
            All = mode;
            Mode mode2 = new Mode("Dones", 1);
            Dones = mode2;
            Mode[] modeArr = {mode, mode2};
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

    public DonutSettingsDialogConfig(Mode mode, Integer num, List<DonutPostingSettings.Duration> list, boolean z) {
        this.a = mode;
        this.b = num;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutSettingsDialogConfig)) {
            return false;
        }
        DonutSettingsDialogConfig donutSettingsDialogConfig = (DonutSettingsDialogConfig) obj;
        return this.a == donutSettingsDialogConfig.a && epx.f(this.b, donutSettingsDialogConfig.b) && epx.f(this.c, donutSettingsDialogConfig.c) && this.d == donutSettingsDialogConfig.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.d) + fw3.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutSettingsDialogConfig(mode=");
        sb.append(this.a);
        sb.append(", paidDurationId=");
        sb.append(this.b);
        sb.append(", paidDurations=");
        sb.append(this.c);
        sb.append(", isAllowToChangeMode=");
        return q0.a(sb, this.d, ')');
    }
}
