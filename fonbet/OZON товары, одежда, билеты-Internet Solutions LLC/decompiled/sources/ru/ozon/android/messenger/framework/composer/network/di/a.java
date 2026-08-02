package ru.ozon.android.messenger.framework.composer.network.di;

import Jb.e;
import K00.a;
import We.E;
import X00.c;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
public final class a implements e<K00.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f86740a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<U00.b> f86741b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<d> f86742c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.core.initialization.a> f86743d;

    public a(Pc.a<E> aVar, Pc.a<U00.b> aVar2, Pc.a<d> aVar3, Pc.a<ru.ozon.android.messenger.framework.core.initialization.a> aVar4) {
        this.f86740a = aVar;
        this.f86741b = aVar2;
        this.f86742c = aVar3;
        this.f86743d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        E composerNetworkClient = this.f86740a.get();
        U00.b composerJsonSerializer = this.f86741b.get();
        d messengerConfig = this.f86742c.get();
        ru.ozon.android.messenger.framework.core.initialization.a appVersionConfig = this.f86743d.get();
        Intrinsics.checkNotNullParameter(composerNetworkClient, "composerNetworkClient");
        Intrinsics.checkNotNullParameter(composerJsonSerializer, "composerJsonSerializer");
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        Intrinsics.checkNotNullParameter(appVersionConfig, "appVersionConfig");
        a.C0284a c0284a = new a.C0284a(new c(composerNetworkClient), new L00.a(appVersionConfig.getVersionName(), Integer.parseInt(appVersionConfig.getVersionCode()), appVersionConfig.getAppName(), appVersionConfig.getDeviceType().getType()));
        c0284a.a(messengerConfig.getNetworkConfig().a());
        c0284a.d(messengerConfig.getFeatureProvider().a("host_config_app_domain_enabled"));
        c0284a.g(composerJsonSerializer);
        return c0284a.c();
    }
}
