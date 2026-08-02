package com.unity3d.ads.core.utils;

import xsna.eyx;
import xsna.gzs;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.s7i;
import xsna.vhn0;
import xsna.whn0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: CommonCoroutineTimer.kt */
/* loaded from: classes14.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final ovj dispatcher;
    private final s7i job;
    private final yvj scope;

    public CommonCoroutineTimer(ovj ovjVar) {
        this.dispatcher = ovjVar;
        vhn0 a = whn0.a();
        this.job = a;
        this.scope = zvj.a(ovjVar.plus(a));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public eyx start(long j, long j2, gzs<s3q0> gzsVar) {
        return myc0.h(this.scope, this.dispatcher, null, new CommonCoroutineTimer$start$1(j, gzsVar, j2, null), 2);
    }
}
