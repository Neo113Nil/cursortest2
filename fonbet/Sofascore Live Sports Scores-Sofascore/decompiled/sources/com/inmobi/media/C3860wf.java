package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ljg;
import defpackage.ogj;
import defpackage.w45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3860wf {
    public final F9 a;

    public C3860wf(AdConfig.PingsV2Config pingsV2Config) {
        pingsV2Config.getClass();
        w45 w45Var = new w45();
        int high = pingsV2Config.getMaxBatchSize().getHigh();
        if (high < 1) {
            ogj.h(ljg.j(high, "max < 1: "));
            throw null;
        }
        synchronized (w45Var) {
            w45Var.a = high;
            Unit unit = Unit.a;
        }
        w45.c(w45Var, null, null, null, 7);
        this.a = D9.a(null, w45Var, null, new Ok(pingsV2Config.getConnectTimeout(), pingsV2Config.getReadTimeout(), pingsV2Config.getCallTimeout()), 5);
    }
}
