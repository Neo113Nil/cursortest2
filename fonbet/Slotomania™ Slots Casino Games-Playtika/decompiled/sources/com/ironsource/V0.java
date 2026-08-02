package com.ironsource;

import com.ironsource.F0;
import com.ironsource.L8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class V0 extends C2588p0 {
    private final C2588p0 g;
    private final S0 h;
    private InterfaceC2500k2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C2588p0 adTools, AbstractC2731x0 adUnitData, F0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adTools;
        S0 a = Ff.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(a, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.h = a;
    }

    public final void a(InterfaceC2500k2 interfaceC2500k2) {
        this.i = interfaceC2500k2;
    }

    public final void c(AbstractRunnableC2512ke task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Gf.a.b(task);
    }

    public final String e(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String c = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().getDynamic…romServerData(serverData)");
        return c;
    }

    public final S0 h() {
        return this.h;
    }

    public final InterfaceC2500k2 i() {
        return this.i;
    }

    public final String j() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    public final C2329aa k() {
        return Ff.a();
    }

    public final L8.a l() {
        return Jb.u.a().i();
    }

    public final BaseAdAdapter<?, ?> a(C instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.v(), instanceData.i(), instanceData.j().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(V0 adUnitTools, F0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.g = adUnitTools.g;
        this.h = adUnitTools.h;
        this.i = adUnitTools.i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.a adFormat, UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long j, String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String a = IronSourceUtils.a(j, instanceName);
        Intrinsics.checkNotNullExpressionValue(a, "getTransId(timeStamp, instanceName)");
        return a;
    }
}
