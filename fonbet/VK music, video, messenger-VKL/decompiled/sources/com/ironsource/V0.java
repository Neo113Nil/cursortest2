package com.ironsource;

import com.ironsource.F0;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;

/* loaded from: classes13.dex */
public class V0 extends C4484p0 {
    private final C4484p0 g;
    private final S0 h;
    private InterfaceC4396k2 i;

    public V0(C4484p0 c4484p0, AbstractC4627x0 abstractC4627x0, F0.b bVar) {
        super(c4484p0, bVar);
        this.g = c4484p0;
        this.h = If.a(abstractC4627x0, abstractC4627x0.e().c());
    }

    public final void a(InterfaceC4396k2 interfaceC4396k2) {
        this.i = interfaceC4396k2;
    }

    public final String e(String str) {
        return com.ironsource.mediationsdk.d.b().c(str);
    }

    public final S0 g() {
        return this.h;
    }

    public final InterfaceC4396k2 h() {
        return this.i;
    }

    public final String i() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    public final C4243ba j() {
        return If.a();
    }

    public final M8.a k() {
        return Kb.u.a().i();
    }

    public final void a(AbstractRunnableC4408ke abstractRunnableC4408ke) {
        Jf.a.b(abstractRunnableC4408ke);
    }

    public final BaseAdAdapter<?, ?> a(C c) {
        return com.ironsource.mediationsdk.c.b().a(c.v(), c.i(), c.j().b().b());
    }

    public V0(V0 v0, F0.b bVar) {
        super(v0, bVar);
        this.g = v0.g;
        this.h = v0.h;
        this.i = v0.i;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        return com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, uuid);
    }

    public final String a(long j, String str) {
        return IronSourceUtils.a(j, str);
    }
}
