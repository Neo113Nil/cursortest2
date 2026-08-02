package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zztw;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nn4 {
    public Exception a;
    public long b = C.TIME_UNSET;
    public long c = C.TIME_UNSET;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == C.TIME_UNSET && pn4.c0.get() <= 0) {
            this.b = 200 + elapsedRealtime;
        }
        long j = this.b;
        if (j == C.TIME_UNSET || elapsedRealtime < j) {
            this.c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.a;
        this.a = null;
        this.b = C.TIME_UNSET;
        this.c = C.TIME_UNSET;
        throw exc3;
    }

    public void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == C.TIME_UNSET && zztw.Y.get() <= 0) {
            this.b = 200 + elapsedRealtime;
        }
        long j = this.b;
        if (j == C.TIME_UNSET || elapsedRealtime < j) {
            this.c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.a;
        this.a = null;
        this.b = C.TIME_UNSET;
        this.c = C.TIME_UNSET;
        throw exc3;
    }
}
