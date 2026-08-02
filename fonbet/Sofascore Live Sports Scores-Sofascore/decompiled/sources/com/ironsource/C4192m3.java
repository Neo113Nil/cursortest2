package com.ironsource;

import com.ironsource.AbstractC4085g3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.lnb;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4192m3<Smash extends AbstractC4085g3<?>> extends Zg<Smash> {
    private boolean h;

    public /* synthetic */ C4192m3(int i, boolean z, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.ironsource.Zg
    public void c(@NotNull Smash smash) {
        String o;
        smash.getClass();
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.h = true;
        if (d() == 0) {
            o = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            o = lnb.o("Advanced Loading: Won't start loading bidder ", smash.c(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + o);
        IronSourceUtils.i(o);
    }

    @Override // com.ironsource.Zg
    public boolean e() {
        return super.e() || this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4192m3(int i, boolean z, @NotNull List<? extends Smash> list, boolean z2) {
        super(i, z, list);
        list.getClass();
        this.h = z2;
    }
}
