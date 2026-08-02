package com.ironsource;

import com.ironsource.E0;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class T0 extends C4243p0 {

    @NotNull
    private final C4243p0 f;

    @NotNull
    private final Q0 g;

    @Nullable
    private InterfaceC4120i2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(@NotNull C4243p0 c4243p0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull E0.b bVar) {
        super(c4243p0, bVar);
        c4243p0.getClass();
        abstractC4386x0.getClass();
        bVar.getClass();
        this.f = c4243p0;
        Q0 a = Gf.a(abstractC4386x0, abstractC4386x0.e().c());
        a.getClass();
        this.g = a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull C c) {
        c.getClass();
        return com.ironsource.mediationsdk.c.d().a(c.v(), c.i(), c.j().b().b());
    }

    @NotNull
    public final String e(@NotNull String str) {
        str.getClass();
        String c = com.ironsource.mediationsdk.d.b().c(str);
        c.getClass();
        return c;
    }

    @NotNull
    public final Q0 h() {
        return this.g;
    }

    @Nullable
    public final InterfaceC4120i2 i() {
        return this.h;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.p.g().f();
    }

    @Nullable
    public final C3959aa k() {
        return Gf.a();
    }

    @NotNull
    public final J8.a l() {
        return Ib.v.a().i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(@NotNull T0 t0, @NotNull E0.b bVar) {
        super(t0, bVar);
        t0.getClass();
        bVar.getClass();
        this.f = t0.f;
        this.g = t0.g;
        this.h = t0.h;
    }

    public final void a(@NotNull com.ironsource.environment.thread.a aVar) {
        aVar.getClass();
        Hf.a.b(aVar);
    }

    public final void a(@Nullable InterfaceC4120i2 interfaceC4120i2) {
        this.h = interfaceC4120i2;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar, @NotNull UUID uuid) {
        networkSettings.getClass();
        aVar.getClass();
        uuid.getClass();
        return com.ironsource.mediationsdk.c.d().a(networkSettings, aVar, uuid);
    }

    @NotNull
    public final String a(long j, @NotNull String str) {
        str.getClass();
        String a = IronSourceUtils.a(j, str);
        a.getClass();
        return a;
    }
}
