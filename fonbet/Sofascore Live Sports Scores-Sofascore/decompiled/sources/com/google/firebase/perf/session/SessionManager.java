package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.kdc;
import defpackage.l7h;
import defpackage.oe0;
import defpackage.of0;
import defpackage.pe0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class SessionManager extends pe0 {
    private static final SessionManager instance = new SessionManager();
    private final oe0 appStateMonitor;
    private final Set<WeakReference<l7h>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, oe0 oe0Var) {
        super(oe0.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = oe0Var;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.a, of0.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(of0 of0Var) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.a, of0Var);
        }
    }

    private void startOrStopCollectingGauges(of0 of0Var) {
        PerfSession perfSession = this.perfSession;
        boolean z = perfSession.c;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(perfSession, of0Var);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        of0 of0Var = of0.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(of0Var);
        startOrStopCollectingGauges(of0Var);
    }

    @Override // defpackage.pe0, defpackage.ne0
    public void onUpdateAppState(of0 of0Var) {
        super.onUpdateAppState(of0Var);
        if (this.appStateMonitor.p) {
            return;
        }
        if (of0Var == of0.FOREGROUND) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(of0Var);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<l7h> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new kdc(15, this, context, this.perfSession));
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<l7h> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.a == this.perfSession.a) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<l7h>> it = this.clients.iterator();
                while (it.hasNext()) {
                    l7h l7hVar = it.next().get();
                    if (l7hVar != null) {
                        l7hVar.a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.n);
        startOrStopCollectingGauges(this.appStateMonitor.n);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.c(UUID.randomUUID().toString()), oe0.a());
    }
}
