package com.ironsource.mediationsdk;

import com.ironsource.C3957a8;
import com.ironsource.C4352v2;
import com.ironsource.Ld;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class l {
    private static final l f = new l();
    private final Map<String, Long> a = new HashMap();
    private final Map<String, Boolean> b = new HashMap();
    private int c;
    private int d;
    private int e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ IronSource.a a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ String c;

        public a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.a = aVar;
            this.b = ironSourceError;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            l.this.a(this.a, this.b);
            l.this.b.put(this.c, Boolean.FALSE);
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            Ld.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            C3957a8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C4352v2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String aVar2 = aVar.toString();
        if (!this.a.containsKey(aVar2)) {
            a(aVar, ironSourceError);
            return;
        }
        long a2 = a(aVar) * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.a.get(aVar2).longValue();
        if (currentTimeMillis > a2) {
            a(aVar, ironSourceError);
            return;
        }
        this.b.put(aVar2, Boolean.TRUE);
        long j = a2 - currentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, aVar2), j);
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            lVar = f;
        }
        return lVar;
    }

    public void a(IronSource.a aVar, int i) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.d = i;
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.c = i;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.e = i;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.d;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return this.c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.b.containsKey(aVar.toString())) {
            return false;
        }
        return this.b.get(aVar.toString()).booleanValue();
    }
}
