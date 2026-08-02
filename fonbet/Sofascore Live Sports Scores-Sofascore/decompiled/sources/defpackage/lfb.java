package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lfb {
    public static final AtomicLong g = new AtomicLong();
    public final xe4 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public lfb(xe4 xe4Var, Uri uri, Map map, long j, long j2, long j3) {
        this.a = xe4Var;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public lfb(xe4 xe4Var, long j) {
        this(xe4Var, xe4Var.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }
}
