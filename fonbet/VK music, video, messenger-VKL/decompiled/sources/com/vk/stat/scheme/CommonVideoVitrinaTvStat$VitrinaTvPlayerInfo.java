package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo {
    public final transient String a;

    @pmi0("programme_id")
    private final FilteredString filteredProgrammeId;

    @pmi0("is_fullscreen_mode")
    private final boolean isFullscreenMode;

    @pmi0("is_muted")
    private final boolean isMuted;

    @pmi0("is_subtitles_mode")
    private final boolean isSubtitlesMode;

    @pmi0("stream_ts")
    private final String streamTs;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo>, a9y<CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo(fai.m(x9yVar, "is_subtitles_mode"), fai.m(x9yVar, "is_fullscreen_mode"), fai.m(x9yVar, "is_muted"), fai.s(x9yVar, "stream_ts"), fai.s(x9yVar, "programme_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = (CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.m(Boolean.valueOf(commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.d()), "is_subtitles_mode");
            x9yVar.m(Boolean.valueOf(commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.b()), "is_fullscreen_mode");
            x9yVar.m(Boolean.valueOf(commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.c()), "is_muted");
            x9yVar.o("stream_ts", commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.a());
            x9yVar.o("programme_id", commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.a);
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo(boolean z, boolean z2, boolean z3, String str, String str2) {
        this.isSubtitlesMode = z;
        this.isFullscreenMode = z2;
        this.isMuted = z3;
        this.streamTs = str;
        this.a = str2;
        FilteredString filteredString = new FilteredString(lhg.b(100));
        this.filteredProgrammeId = filteredString;
        filteredString.a(str2);
    }

    public final String a() {
        return this.streamTs;
    }

    public final boolean b() {
        return this.isFullscreenMode;
    }

    public final boolean c() {
        return this.isMuted;
    }

    public final boolean d() {
        return this.isSubtitlesMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = (CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo) obj;
        return this.isSubtitlesMode == commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.isSubtitlesMode && this.isFullscreenMode == commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.isFullscreenMode && this.isMuted == commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.isMuted && epx.f(this.streamTs, commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.streamTs) && epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + urd0.a(qoy.b(qoy.b(Boolean.hashCode(this.isSubtitlesMode) * 31, 31, this.isFullscreenMode), 31, this.isMuted), 31, this.streamTs);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitrinaTvPlayerInfo(isSubtitlesMode=");
        sb.append(this.isSubtitlesMode);
        sb.append(", isFullscreenMode=");
        sb.append(this.isFullscreenMode);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", streamTs=");
        sb.append(this.streamTs);
        sb.append(", programmeId=");
        return ho8.a(sb, this.a, ')');
    }
}
