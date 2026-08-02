package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xsna.kt80;
import xsna.txi;
import xsna.u93;
import xsna.vyi;
import xsna.wsi0;
import xsna.wv6;
import xsna.y93;

@Keep
/* loaded from: classes13.dex */
public class SessionManager extends y93 {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final u93 appStateMonitor;
    private final Set<WeakReference<wsi0>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.f(), u93.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.d) {
            this.gaugeManager.logGaugeMetadata(perfSession.b, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.d) {
            this.gaugeManager.logGaugeMetadata(perfSession.b, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.d) {
            this.gaugeManager.startCollectingGauges(perfSession, applicationProcessState);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    @Override // xsna.y93, xsna.u93.b
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (this.appStateMonitor.r) {
            return;
        }
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            updatePerfSession(applicationProcessState);
        } else {
            if (updatePerfSessionIfExpired()) {
                return;
            }
            startOrStopCollectingGauges(applicationProcessState);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<wsi0> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new wv6(this, context, this.perfSession, 4));
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void unregisterForSessionUpdates(WeakReference<wsi0> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
        synchronized (this.clients) {
            try {
                this.perfSession = PerfSession.f();
                Iterator<WeakReference<wsi0>> it = this.clients.iterator();
                while (it.hasNext()) {
                    wsi0 wsi0Var = it.next().get();
                    if (wsi0Var != null) {
                        wsi0Var.a(this.perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    public boolean updatePerfSessionIfExpired() {
        vyi vyiVar;
        long longValue;
        PerfSession perfSession = this.perfSession;
        perfSession.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(perfSession.c.d());
        txi e = txi.e();
        e.getClass();
        synchronized (vyi.class) {
            try {
                if (vyi.c == null) {
                    vyi.c = new vyi(0);
                }
                vyiVar = vyi.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        kt80<Long> j = e.j(vyiVar);
        if (!j.b() || j.a().longValue() <= 0) {
            kt80<Long> kt80Var = e.a.getLong("fpr_session_max_duration_min");
            if (!kt80Var.b() || kt80Var.a().longValue() <= 0) {
                kt80<Long> c = e.c(vyiVar);
                longValue = (!c.b() || c.a().longValue() <= 0) ? 240L : c.a().longValue();
            } else {
                e.c.e(kt80Var.a().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                longValue = kt80Var.a().longValue();
            }
        } else {
            longValue = j.a().longValue();
        }
        if (minutes <= longValue) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.p);
        return true;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, u93 u93Var) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = u93Var;
        registerForAppState();
    }
}
