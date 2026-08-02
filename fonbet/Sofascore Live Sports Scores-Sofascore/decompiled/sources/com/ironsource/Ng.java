package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4085g3;
import com.ironsource.M0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.lnb;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Ng<Smash extends AbstractC4085g3<?>> {
    AbstractC4085g3<?> d;
    private final List<String> e;
    private final int f;
    Og h;
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> a = new ConcurrentHashMap<>();
    private String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends TimerTask {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.a + " from memory");
                Ng.this.a.remove(this.a);
                ironLog.verbose("waterfall size is currently " + Ng.this.a.size());
            } finally {
                cancel();
            }
        }
    }

    public Ng(List<String> list, int i, Og og) {
        this.e = list;
        this.f = i;
        this.h = og;
    }

    private synchronized boolean e() {
        boolean z;
        AbstractC4085g3<?> abstractC4085g3 = this.d;
        if (abstractC4085g3 != null && abstractC4085g3.C()) {
            z = this.d.h().equals(this.c);
        }
        return z;
    }

    public void a(M0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == M0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == M0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.c)) {
                if (e()) {
                    StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                    sb.append(this.c);
                    sb.append(" is still showing - the current waterfall ");
                    lnb.v(sb, this.b, " will be deleted instead", ironLog);
                    String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new a(this.c), this.f);
            }
        } else {
            this.a.clear();
            this.a.put(str, copyOnWriteArrayList);
        }
        this.c = this.b;
        this.b = str;
        if (this.a.size() > 5) {
            this.h.a(this.a.size());
        }
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String c() {
        return this.b;
    }

    public AbstractC4085g3<?> d() {
        return this.d;
    }

    public synchronized void b(AbstractC4085g3<?> abstractC4085g3) {
        IronLog.INTERNAL.verbose();
        this.d = abstractC4085g3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r0.e.contains(r3) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r0.d.n().equals(r3) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:8:0x004b, B:13:0x0008, B:15:0x000d, B:18:0x0014, B:20:0x0018, B:23:0x001f, B:25:0x0023, B:28:0x0030, B:30:0x0034, B:32:0x003c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(M0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z;
        try {
            if (!a(adapterBaseInterface, aVar2, str)) {
                z = true;
                if (aVar != M0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
                    if (aVar != M0.a.MANUAL_WITH_LOAD_ON_SHOW) {
                        if (!z) {
                            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                        }
                    }
                }
                AbstractC4085g3<?> abstractC4085g3 = this.d;
                if (abstractC4085g3 != null) {
                    if (abstractC4085g3.C()) {
                        if (loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                            if (this.d.c().equals(str)) {
                            }
                        }
                        if (loadWhileShowSupportState != LoadWhileShowSupportState.NONE) {
                        }
                    }
                }
                if (!z) {
                }
            }
            z = false;
            if (!z) {
            }
        } finally {
        }
        return z;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(Gf.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public synchronized void a(AbstractC4085g3<?> abstractC4085g3) {
        IronLog.INTERNAL.verbose();
        AbstractC4085g3<?> abstractC4085g32 = this.d;
        if (abstractC4085g32 != null && !abstractC4085g32.equals(abstractC4085g3)) {
            this.d.M();
        }
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.d)) {
                smash.M();
            }
        }
    }
}
