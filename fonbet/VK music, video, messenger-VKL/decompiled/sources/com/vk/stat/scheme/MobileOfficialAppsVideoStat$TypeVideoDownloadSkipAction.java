package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction implements SchemeStat$TypeAction.b {

    @pmi0("skip_reason")
    private final SkipReason skipReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class SkipReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SkipReason[] $VALUES;

        @pmi0("already_downloaded")
        public static final SkipReason ALREADY_DOWNLOADED;

        @pmi0("user_action_skip")
        public static final SkipReason USER_ACTION_SKIP;

        static {
            SkipReason skipReason = new SkipReason("ALREADY_DOWNLOADED", 0);
            ALREADY_DOWNLOADED = skipReason;
            SkipReason skipReason2 = new SkipReason("USER_ACTION_SKIP", 1);
            USER_ACTION_SKIP = skipReason2;
            SkipReason[] skipReasonArr = {skipReason, skipReason2};
            $VALUES = skipReasonArr;
            $ENTRIES = new asp(skipReasonArr);
        }

        private SkipReason(String str, int i) {
        }

        public static SkipReason valueOf(String str) {
            return (SkipReason) Enum.valueOf(SkipReason.class, str);
        }

        public static SkipReason[] values() {
            return (SkipReason[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction(SkipReason skipReason) {
        this.skipReason = skipReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction) && this.skipReason == ((MobileOfficialAppsVideoStat$TypeVideoDownloadSkipAction) obj).skipReason;
    }

    public final int hashCode() {
        return this.skipReason.hashCode();
    }

    public final String toString() {
        return "TypeVideoDownloadSkipAction(skipReason=" + this.skipReason + ')';
    }
}
