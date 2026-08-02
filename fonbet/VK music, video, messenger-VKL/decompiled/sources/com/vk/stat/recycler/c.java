package com.vk.stat.recycler;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.recycler.a;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.concurrent.Executor;
import xsna.yy;

/* compiled from: DevNullRecyclerScrollProfiler.kt */
/* loaded from: classes5.dex */
public final class c extends b {
    public static final yy i = new yy(21);
    public final String e;
    public final DevNullEventKey f;
    public final yy g;
    public final boolean h;

    public c() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Executor executor, String str) {
        super(executor);
        DevNullEventKey devNullEventKey = DevNullEventKey.RECYCLER_ADAPTER_STAT;
        boolean h = BuildInfo.h();
        this.e = str;
        this.f = devNullEventKey;
        this.g = i;
        this.h = h;
    }

    public final void D(a aVar, a.C1787a c1787a, boolean z) {
        String h = this.f.h();
        String str = aVar.c;
        int h2 = aVar.b.h();
        int i2 = aVar.a;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, this.e, Integer.valueOf(h2), str, Integer.valueOf(i2), null, c1787a != null ? Integer.valueOf(c1787a.a) : null, null, c1787a != null ? Integer.valueOf((int) c1787a.b) : null, null, c1787a != null ? Integer.valueOf((int) c1787a.c) : null, null, c1787a != null ? Integer.valueOf((int) c1787a.d) : null, null, c1787a != null ? Integer.valueOf((int) c1787a.e) : null, null, z ? 1 : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -174782, 3, null);
        this.g.invoke(schemeStat$TypeDevNullItem);
        if (this.h) {
            L.e("[recycler-profiler][dev-null-event]: " + schemeStat$TypeDevNullItem);
        }
    }
}
