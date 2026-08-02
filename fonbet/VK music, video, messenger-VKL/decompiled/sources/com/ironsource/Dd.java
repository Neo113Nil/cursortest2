package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes13.dex */
public final class Dd {
    private final V0 a;
    private final List<C4657yc> b;
    private final AbstractC4627x0 c;
    private final IronSource.a d;

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

    public static final class b extends AbstractRunnableC4408ke {
        final /* synthetic */ NetworkSettings c;
        final /* synthetic */ AdapterBaseInterface d;
        final /* synthetic */ AdData e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.c = networkSettings;
            this.d = adapterBaseInterface;
            this.e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            Dd.this.a(this.c, this.d, this.e);
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a(Throwable th) {
            Dd.this.a.d().h().g("initProvider - exception while calling networkAdapter.init with " + this.c.getProviderName() + " - " + th);
        }
    }

    public Dd(V0 v0, LevelPlay.AdFormat adFormat, List<C4657yc> list, AbstractC4627x0 abstractC4627x0) {
        this.a = v0;
        this.b = list;
        this.c = abstractC4627x0;
        this.d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a, (String) null, (String) null, 3, (Object) null));
        UUID randomUUID = UUID.randomUUID();
        Iterator<C4657yc> it = this.b.iterator();
        while (it.hasNext()) {
            NetworkSettings f = it.next().f();
            AdapterBaseInterface b2 = com.ironsource.mediationsdk.c.b().b(f, this.d, randomUUID);
            if (a(f, b2)) {
                Jf.a.b(new b(f, b2, this.c.a(f)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a, String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2)), (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null || this.a.a(adapterBaseInterface, this.d, networkSettings.getProviderInstanceName())) {
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
        throw new NoWhenBranchMatchedException();
    }
}
