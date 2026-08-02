package com.vk.reefton;

import android.net.Uri;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import one.video.player.error.OneVideoPlaybackException;
import xsna.asp;
import xsna.bh10;
import xsna.e630;
import xsna.efz;
import xsna.epx;
import xsna.eq0;
import xsna.fp;
import xsna.jr;
import xsna.odj;
import xsna.pnf0;
import xsna.qlb0;
import xsna.qnf0;
import xsna.shy;
import xsna.tj0;
import xsna.urd0;
import xsna.ymf0;
import xsna.zrp;

/* compiled from: ReefEvent.kt */
/* loaded from: classes5.dex */
public abstract class ReefEvent {
    public final long a = System.currentTimeMillis();

    /* compiled from: ReefEvent.kt */
    public static final class PlayerQualityChange extends ReefEvent {
        public final ReefContentQuality b;
        public final Reason c;
        public final ReefContentQuality d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ReefEvent.kt */
        public static final class Reason {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            public static final Reason ACTUAL;
            public static final Reason AUTO;
            public static final Reason MANUAL;

            static {
                Reason reason = new Reason("AUTO", 0);
                AUTO = reason;
                Reason reason2 = new Reason("MANUAL", 1);
                MANUAL = reason2;
                Reason reason3 = new Reason("ACTUAL", 2);
                ACTUAL = reason3;
                Reason[] reasonArr = {reason, reason2, reason3};
                $VALUES = reasonArr;
                $ENTRIES = new asp(reasonArr);
            }

            public Reason() {
                throw null;
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }
        }

        public PlayerQualityChange(ReefContentQuality reefContentQuality, Reason reason, ReefContentQuality reefContentQuality2) {
            this.b = reefContentQuality;
            this.c = reason;
            this.d = reefContentQuality2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayerQualityChange)) {
                return false;
            }
            PlayerQualityChange playerQualityChange = (PlayerQualityChange) obj;
            return this.b == playerQualityChange.b && this.c == playerQualityChange.c && this.d == playerQualityChange.d;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            ReefContentQuality reefContentQuality = this.d;
            return hashCode + (reefContentQuality == null ? 0 : reefContentQuality.hashCode());
        }

        public final String toString() {
            return "PlayerQualityChange(quality=" + this.b + ", reason=" + this.c + ", maxQuality=" + this.d + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class a extends ReefEvent {
    }

    /* compiled from: ReefEvent.kt */
    public static final class b extends ReefEvent {
    }

    /* compiled from: ReefEvent.kt */
    public static final class c extends ReefEvent {
        public final ymf0 b;

        public c(ymf0 ymf0Var) {
            this.b = ymf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AudioFragmentLoaded(metrics=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class d extends ReefEvent {
        public final ymf0 b;

        public d(ymf0 ymf0Var) {
            this.b = ymf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AudioFragmentStalled(metrics=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class e extends ReefEvent {
        public final long b;
        public final int c;
        public final long d;
        public final long e;

        public e(int i, long j, long j2, long j3) {
            this.b = j;
            this.c = i;
            this.d = j2;
            this.e = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + bh10.a(shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder a = eq0.a(this.c, "BandwidthEstimate(position=", ", sampleTimeMs=", this.b);
            tj0.d(a, ", sampleBytesLoaded=", this.d, ", bitrateEstimate=");
            return efz.b(this.e, ")", a);
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class f extends ReefEvent {
        public final long b;

        public f(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return qlb0.a(this.b, "BytesTransferred(bytes=", ")");
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class g extends ReefEvent {
        public final Throwable b;

        public g(OneVideoPlaybackException oneVideoPlaybackException) {
            this.b = oneVideoPlaybackException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class h extends ReefEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ExoPlayerStateChanged(state=null, playWhenReady=false, position=0, duration=0)";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class i extends ReefEvent {
        public final pnf0 b;

        public i(pnf0 pnf0Var) {
            this.b = pnf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HttpRequestMetrics(metrics=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class j extends ReefEvent {
        public final qnf0 b;

        public j(qnf0 qnf0Var) {
            this.b = qnf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ImagesLoaded(metrics=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class k extends ReefEvent {
    }

    /* compiled from: ReefEvent.kt */
    public static final class l extends ReefEvent {
        public final long b;
        public final long c;

        public l(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.b == lVar.b && this.c == lVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return efz.b(this.c, ")", fp.b(this.b, "PlayerBufferingStart(position=", ", duration="));
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class m extends ReefEvent {
        public final long b;
        public final long c;

        public m(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.c == mVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return efz.b(this.c, ")", fp.b(this.b, "PlayerBufferingStop(position=", ", duration="));
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class n extends ReefEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "PlayerBufferingUpdate(position=0, duration=0)";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class o extends ReefEvent {
        public final Uri b;

        public o(Uri uri) {
            this.b = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PlayerLoadStart(uri=" + this.b + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class p extends ReefEvent {
        public final long b;
        public final long c;

        public p(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.b == pVar.b && this.c == pVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return efz.b(this.c, ")", fp.b(this.b, "PlayerPause(position=", ", duration="));
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class q extends ReefEvent {
        public final long b;
        public final long c;

        public q(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.b == qVar.b && this.c == qVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return efz.b(this.c, ")", fp.b(this.b, "PlayerPlay(position=", ", duration="));
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class r extends ReefEvent {
    }

    /* compiled from: ReefEvent.kt */
    public static final class s extends ReefEvent {
        public final long b;

        public s(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.b == ((s) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return qlb0.a(this.b, "PlayerPositionChange(position=", ")");
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class t extends ReefEvent {
        public final int b;
        public final long c;
        public final long d;

        public t(int i, long j, long j2) {
            this.b = i;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.b == tVar.b && this.c == tVar.c && this.d == tVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            return e630.c(jr.b(this.b, "PlayerPositionDiscontinuity(reason=", ", position=", this.c), ", duration=", this.d, ")");
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class u extends ReefEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            ((u) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "PlayerResume(position=0, duration=0)";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class v extends ReefEvent {
        public final long b;
        public final long c;

        public v(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.b == vVar.b && this.c == vVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return efz.b(this.c, ")", fp.b(this.b, "PlayerSeekEnd(position=", ", duration="));
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class w extends ReefEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            ((w) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "PlayerSeekStart(position=0, duration=0)";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class x extends ReefEvent {
        public final ReefContentType b;
        public final String c;
        public final Uri d;

        public x(ReefContentType reefContentType, String str, Uri uri) {
            this.b = reefContentType;
            this.c = str;
            this.d = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.b == xVar.b && epx.f(this.c, xVar.c) && epx.f(this.d, xVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "PlayerSessionStart(type=" + this.b + ", id=" + this.c + ", uri=" + this.d + ")";
        }
    }

    /* compiled from: ReefEvent.kt */
    public static final class y extends ReefEvent {
    }

    /* compiled from: ReefEvent.kt */
    public static final class z extends ReefEvent {
        public final int b;
        public final int c;
        public final long d;

        public z(int i, int i2, long j) {
            this.b = i;
            this.c = i2;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.b == zVar.b && this.c == zVar.c && this.d == zVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            return efz.b(this.d, ")", odj.a(this.b, this.c, "PlayerTrackChange(bitrate=", ", height=", ", duration="));
        }
    }
}
