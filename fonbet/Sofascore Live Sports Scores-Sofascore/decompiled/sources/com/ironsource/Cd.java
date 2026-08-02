package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import defpackage.zzl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cd {

    @NotNull
    private final T0 a;

    @NotNull
    private final List<C4398xc> b;

    @NotNull
    private final AbstractC4386x0 c;

    @NotNull
    private final IronSource.a d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public Cd(@NotNull T0 t0, @NotNull LevelPlay.AdFormat adFormat, @NotNull List<C4398xc> list, @NotNull AbstractC4386x0 abstractC4386x0) {
        t0.getClass();
        adFormat.getClass();
        list.getClass();
        abstractC4386x0.getClass();
        this.a = t0;
        this.b = list;
        this.c = abstractC4386x0;
        this.d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C4243p0.a(this.a, (String) null, (String) null, 3, (Object) null));
        UUID randomUUID = UUID.randomUUID();
        Iterator<C4398xc> it = this.b.iterator();
        while (it.hasNext()) {
            NetworkSettings f = it.next().f();
            AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.d().b(f, this.d, randomUUID);
            if (a(f, b2)) {
                Hf.a.b(new b(f, b2, this.c.a(f)));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends com.ironsource.environment.thread.a {
        final /* synthetic */ NetworkSettings c;
        final /* synthetic */ AdapterBaseInterface d;
        final /* synthetic */ AdData e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.c = networkSettings;
            this.d = adapterBaseInterface;
            this.e = adData;
        }

        @Override // com.ironsource.environment.thread.a
        public void a(@NotNull Throwable th) {
            th.getClass();
            Cd.this.a.f().h().g("initProvider - exception while calling networkAdapter.init with " + this.c.getProviderName() + " - " + th);
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            Cd cd = Cd.this;
            NetworkSettings networkSettings = this.c;
            AdapterBaseInterface adapterBaseInterface = this.d;
            adapterBaseInterface.getClass();
            cd.a(networkSettings, adapterBaseInterface, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.a, String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2)), (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        T0 t0 = this.a;
        IronSource.a aVar = this.d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        providerInstanceName.getClass();
        if (t0.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i == 4) {
            return IronSource.a.NATIVE_AD;
        }
        zzl.b();
        return null;
    }
}
