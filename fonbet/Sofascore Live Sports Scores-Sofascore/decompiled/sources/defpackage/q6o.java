package defpackage;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q6o {
    public final ddb a;
    public final long b;
    public final Clock c;

    public q6o(ddb ddbVar, long j, Clock clock) {
        this.a = ddbVar;
        this.c = clock;
        this.b = clock.elapsedRealtime() + j;
    }
}
