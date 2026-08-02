package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import org.chromium.support_lib_boundary.util.Features;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick implements SchemeStat$TypeClick.b {

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("mute_audio")
        public static final Subtype MUTE_AUDIO;

        @pmi0("unmute_audio")
        public static final Subtype UNMUTE_AUDIO;

        static {
            Subtype subtype = new Subtype(Features.MUTE_AUDIO, 0);
            MUTE_AUDIO = subtype;
            Subtype subtype2 = new Subtype("UNMUTE_AUDIO", 1);
            UNMUTE_AUDIO = subtype2;
            Subtype[] subtypeArr = {subtype, subtype2};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick(Subtype subtype) {
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick) && this.subtype == ((MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick) obj).subtype;
    }

    public final int hashCode() {
        return this.subtype.hashCode();
    }

    public final String toString() {
        return "TypeVideoTopshelfMuteClick(subtype=" + this.subtype + ')';
    }
}
