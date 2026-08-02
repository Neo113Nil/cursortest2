package ru.ozon.android.messenger.framework.core.initialization.di;

import We.E;
import android.content.Context;
import ei0.InterfaceC6369b;
import gi.C6740b;
import ii.InterfaceC7081a;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.initialization.di.a;
import ru.ozon.android.messenger.framework.core.initialization.di.c;
import ru.ozon.android.messenger.framework.navigation.action.f;

/* loaded from: classes6.dex */
public final class d implements InterfaceC7081a<c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f87309a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d.f f87310b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f87311c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.d f87312d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.c f87313e;

    /* renamed from: f, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f87314f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final d.e f87315g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Set<ru.ozon.android.messenger.framework.core.a> f87316h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final d.g f87317i;

    /* renamed from: j, reason: collision with root package name */
    private final d.InterfaceC1560d f87318j;

    /* renamed from: k, reason: collision with root package name */
    private final i f87319k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final f f87320l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final d.b f87321m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.a f87322n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6369b f87323o;

    public d(@NotNull Context context, @NotNull d.f networkConfig, @NotNull E okHttpClient, @NotNull ru.ozon.android.messenger.framework.core.initialization.d messengerConfig, @NotNull ru.ozon.android.messenger.framework.core.c featureProvider, ru.ozon.android.messenger.framework.logger.b bVar, @NotNull d.e moshiAdapters, @NotNull Set<ru.ozon.android.messenger.framework.core.a> blocks, @NotNull d.g unreadMsgCountChangedListener, d.InterfaceC1560d interfaceC1560d, i iVar, @NotNull f messengerExternalActionHandler, @NotNull d.b blockCustomSettings, @NotNull ru.ozon.android.messenger.framework.core.initialization.a appVersionConfig, InterfaceC6369b interfaceC6369b) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        Intrinsics.checkNotNullParameter(featureProvider, "featureProvider");
        Intrinsics.checkNotNullParameter(moshiAdapters, "moshiAdapters");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(unreadMsgCountChangedListener, "unreadMsgCountChangedListener");
        Intrinsics.checkNotNullParameter(messengerExternalActionHandler, "messengerExternalActionHandler");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        Intrinsics.checkNotNullParameter(appVersionConfig, "appVersionConfig");
        this.f87309a = context;
        this.f87310b = networkConfig;
        this.f87311c = okHttpClient;
        this.f87312d = messengerConfig;
        this.f87313e = featureProvider;
        this.f87314f = bVar;
        this.f87315g = moshiAdapters;
        this.f87316h = blocks;
        this.f87317i = unreadMsgCountChangedListener;
        this.f87318j = interfaceC1560d;
        this.f87319k = iVar;
        this.f87320l = messengerExternalActionHandler;
        this.f87321m = blockCustomSettings;
        this.f87322n = appVersionConfig;
        this.f87323o = interfaceC6369b;
    }

    @Override // ii.InterfaceC7081a
    public final c create(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        c.a a11 = a.a();
        DeviceInfoManager.Companion companion = DeviceInfoManager.INSTANCE;
        Context context = this.f87309a;
        DeviceInfoManager invoke = companion.invoke(context);
        E e11 = this.f87311c;
        e11.getClass();
        E.a aVar = new E.a(e11);
        aVar.a(new ru.ozon.android.messenger.framework.data.remote.b());
        aVar.a(new ru.ozon.android.messenger.framework.data.remote.a(invoke));
        aVar.a(new ru.ozon.android.messenger.framework.network.a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.U(20L);
        return ((a.e) a11).a(context, this.f87310b, new E(aVar), this.f87312d, this.f87313e, this.f87314f, this.f87315g, this.f87316h, this.f87317i, this.f87318j, this.f87319k, this.f87320l, this.f87321m, this.f87322n, this.f87323o);
    }
}
