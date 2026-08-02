package com.ironsource;

import com.ironsource.AbstractC4379j3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import xsna.zcl;
import xsna.zr;

/* renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4487p3<Smash extends AbstractC4379j3<?>> extends ch<Smash> {
    private boolean h;

    public /* synthetic */ C4487p3(int i, boolean z, List list, boolean z2, int i2, zcl zclVar) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.ironsource.ch
    public void c(Smash smash) {
        String a;
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.h = true;
        if (d() == 0) {
            a = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            a = zr.a("Advanced Loading: Won't start loading bidder ", smash.c(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + a);
        IronSourceUtils.i(a);
    }

    @Override // com.ironsource.ch
    public boolean e() {
        return super.e() || this.h;
    }

    public C4487p3(int i, boolean z, List<? extends Smash> list, boolean z2) {
        super(i, z, list);
        this.h = z2;
    }
}
