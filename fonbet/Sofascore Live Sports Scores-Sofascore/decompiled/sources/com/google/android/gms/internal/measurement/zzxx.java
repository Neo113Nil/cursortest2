package com.google.android.gms.internal.measurement;

import defpackage.fcp;
import defpackage.scp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxx {
    public static final scp f;
    public static final scp h;
    public static final zzyl a = new zzyl("cause", Throwable.class, false, false);
    public static final zzyl b = new zzyl("ratelimit_count", Integer.class, false, false);
    public static final zzyl c = new zzyl("sampling_count", Integer.class, false, false);
    public static final zzyl d = new zzyl("ratelimit_period", fcp.class, false, false);
    public static final zzyl e = new zzyl("skipped", Integer.class, false, false);
    public static final zzyl g = new zzyl("forced", Boolean.class, false, false);
    public static final zzyl i = new zzyl("stack_size", zzyv.class, false, false);

    static {
        boolean z = true;
        f = new scp("group_by", Object.class, z, z, 0);
        h = new scp("tags", zzabe.class, false, z, 1);
    }
}
