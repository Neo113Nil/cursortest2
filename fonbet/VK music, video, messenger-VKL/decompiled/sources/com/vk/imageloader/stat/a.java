package com.vk.imageloader.stat;

import com.vk.imageloader.stat.Metrics;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.epx;
import xsna.o360;
import xsna.qv10;

/* compiled from: FeedImageLoadingListener.kt */
/* loaded from: classes2.dex */
public final class a implements o360.b {
    public Long a;
    public Long b;
    public Boolean c;
    public Long d;
    public Boolean e;
    public qv10 f;
    public final Metrics g = new Metrics(0);

    @Override // xsna.o360.b
    public final void a(long j) {
        if (this.a == null) {
            this.a = Long.valueOf(j);
        }
    }

    @Override // xsna.o360.b
    public final void b(qv10 qv10Var) {
        this.f = qv10Var;
    }

    @Override // xsna.o360.b
    public final void c(long j, Boolean bool) {
        this.d = Long.valueOf(j);
        this.e = bool;
        if (bool.equals(Boolean.TRUE)) {
            g(j);
        }
    }

    @Override // xsna.o360.b
    public final void d(long j, Boolean bool) {
        this.b = Long.valueOf(j);
        this.c = bool;
    }

    public final Integer e() {
        Long l = this.d;
        Long l2 = this.a;
        if (l == null || l2 == null) {
            return null;
        }
        return Integer.valueOf((int) Math.max(l.longValue() - l2.longValue(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    }

    public final Metrics f() {
        String str;
        qv10 qv10Var = this.f;
        if (epx.f(this.c, Boolean.TRUE)) {
            return null;
        }
        Integer e = e();
        int intValue = e != null ? e.intValue() : 0;
        Metrics metrics = this.g;
        metrics.a = intValue;
        Long valueOf = (this.d == null || this.b == null) ? null : Long.valueOf((long) Math.max(r1.longValue() - r4.longValue(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
        metrics.b = valueOf != null ? valueOf.longValue() : 0L;
        metrics.c = qv10Var != null ? qv10Var.d : 0L;
        metrics.d = qv10Var != null ? qv10Var.e : 0L;
        Boolean bool = this.e;
        metrics.g = bool != null ? bool.booleanValue() ? Metrics.Status.OK : this.b == null ? Metrics.Status.REQUEST_ERROR : Metrics.Status.PROCESSING_ERROR : null;
        metrics.e = qv10Var != null ? qv10Var.j : null;
        if (qv10Var == null || (str = Long.valueOf(qv10Var.b).toString()) == null) {
            str = "0";
        }
        metrics.f = str;
        return metrics;
    }

    public final void g(long j) {
        this.e = Boolean.TRUE;
        this.b = this.a;
        this.d = Long.valueOf(j);
    }
}
