package com.vk.im.engine.commands.messages;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.d040;
import xsna.epx;
import xsna.i0r;
import xsna.i5g;
import xsna.iq;
import xsna.le6;
import xsna.leq;
import xsna.rli0;
import xsna.shy;
import xsna.w2w;
import xsna.zrp;

/* compiled from: GetRecentClipIdsCmd.kt */
/* loaded from: classes2.dex */
public final class GetRecentClipIdsCmd extends le6<List<? extends String>> {
    public final long b;
    public final int c;
    public final RecentClipsFilter d;
    public final Long e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetRecentClipIdsCmd.kt */
    public static final class RecentClipsFilter {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RecentClipsFilter[] $VALUES;
        public static final RecentClipsFilter RECENT_ALL_CLIPS;
        public static final RecentClipsFilter RECENT_INC_AND_OUT_CLIPS;

        static {
            RecentClipsFilter recentClipsFilter = new RecentClipsFilter("RECENT_ALL_CLIPS", 0);
            RECENT_ALL_CLIPS = recentClipsFilter;
            RecentClipsFilter recentClipsFilter2 = new RecentClipsFilter("RECENT_INC_AND_OUT_CLIPS", 1);
            RECENT_INC_AND_OUT_CLIPS = recentClipsFilter2;
            RecentClipsFilter[] recentClipsFilterArr = {recentClipsFilter, recentClipsFilter2};
            $VALUES = recentClipsFilterArr;
            $ENTRIES = new asp(recentClipsFilterArr);
        }

        public RecentClipsFilter() {
            throw null;
        }

        public static RecentClipsFilter valueOf(String str) {
            return (RecentClipsFilter) Enum.valueOf(RecentClipsFilter.class, str);
        }

        public static RecentClipsFilter[] values() {
            return (RecentClipsFilter[]) $VALUES.clone();
        }
    }

    /* compiled from: GetRecentClipIdsCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecentClipsFilter.values().length];
            try {
                iArr[RecentClipsFilter.RECENT_ALL_CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecentClipsFilter.RECENT_INC_AND_OUT_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GetRecentClipIdsCmd(long j, int i, RecentClipsFilter recentClipsFilter, Long l) {
        this.b = j;
        this.c = i;
        this.d = recentClipsFilter;
        this.e = l;
    }

    @Override // xsna.le6
    public final List<? extends String> e(w2w w2wVar) {
        d040 o = w2wVar.I0().o();
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        int i2 = this.c;
        if (i == 1) {
            return rli0.A(rli0.t(new i5g(o.E(i2, this.b, this.e)), new leq(7)));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = i2 > 2 ? i2 / 2 : 1;
        return rli0.A(rli0.t(new i5g(o.N(this.b, i3, i2 - i3, this.e)), new i0r(3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRecentClipIdsCmd)) {
            return false;
        }
        GetRecentClipIdsCmd getRecentClipIdsCmd = (GetRecentClipIdsCmd) obj;
        return this.b == getRecentClipIdsCmd.b && this.c == getRecentClipIdsCmd.c && this.d == getRecentClipIdsCmd.d && epx.f(this.e, getRecentClipIdsCmd.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b) * 31, 31)) * 31;
        Long l = this.e;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetRecentClipIdsCmd(dialogId=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", clipsFilter=");
        sb.append(this.d.name());
        sb.append(", maxDateMs=");
        return iq.b(sb, this.e, ')');
    }
}
