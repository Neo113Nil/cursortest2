package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC2483j3;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class Kg<Smash extends AbstractC2483j3<?>> {
    AbstractC2483j3<?> d;
    private final List<String> e;
    private final int f;
    Lg h;
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> a = new ConcurrentHashMap<>();
    private String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;

    class a extends TimerTask {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.a + " from memory");
                Kg.this.a.remove(this.a);
                ironLog.verbose("waterfall size is currently " + Kg.this.a.size());
            } finally {
                cancel();
            }
        }
    }

    public Kg(List<String> list, int i, Lg lg) {
        this.e = list;
        this.f = i;
        this.h = lg;
    }

    private synchronized boolean e() {
        boolean z;
        AbstractC2483j3<?> abstractC2483j3 = this.d;
        if (abstractC2483j3 != null && abstractC2483j3.C()) {
            z = this.d.h().equals(this.c);
        }
        return z;
    }

    public synchronized void a(AbstractC2483j3<?> abstractC2483j3) {
        IronLog.INTERNAL.verbose();
        AbstractC2483j3<?> abstractC2483j32 = this.d;
        if (abstractC2483j32 != null && !abstractC2483j32.equals(abstractC2483j3)) {
            this.d.M();
        }
    }

    public synchronized void b(AbstractC2483j3<?> abstractC2483j3) {
        IronLog.INTERNAL.verbose();
        this.d = abstractC2483j3;
    }

    public String c() {
        return this.b;
    }

    public AbstractC2483j3<?> d() {
        return this.d;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (r0.e.contains(r3) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r0.d.n().equals(r3) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0049, B:13:0x0008, B:15:0x000d, B:18:0x0012, B:20:0x0016, B:23:0x001d, B:25:0x0021, B:28:0x002e, B:30:0x0032, B:32:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean a(O0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z;
        if (!a(adapterBaseInterface, aVar2, str)) {
            z = true;
            if (aVar != O0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
                if (aVar != O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
                    if (!z) {
                        IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                    }
                }
            }
            AbstractC2483j3<?> abstractC2483j3 = this.d;
            if (abstractC2483j3 != null) {
                if (abstractC2483j3.C()) {
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
        return z;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(Ff.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(O0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.a.clear();
            this.a.put(str, copyOnWriteArrayList);
        } else {
            this.a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                this.g.schedule(new a(this.c), this.f);
            }
        }
        this.c = this.b;
        this.b = str;
        if (this.a.size() > 5) {
            this.h.a(this.a.size());
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
