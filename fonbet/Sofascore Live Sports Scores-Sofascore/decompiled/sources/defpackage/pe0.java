package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class pe0 implements ne0 {
    private final oe0 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private of0 currentAppState = of0.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<ne0> appStateCallback = new WeakReference<>(this);

    public pe0(oe0 oe0Var) {
        this.appStateMonitor = oe0Var;
    }

    public of0 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<ne0> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.h.addAndGet(i);
    }

    @Override // defpackage.ne0
    public void onUpdateAppState(of0 of0Var) {
        of0 of0Var2 = this.currentAppState;
        of0 of0Var3 = of0.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (of0Var2 == of0Var3) {
            this.currentAppState = of0Var;
        } else {
            if (of0Var2 == of0Var || of0Var == of0Var3) {
                return;
            }
            this.currentAppState = of0.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        oe0 oe0Var = this.appStateMonitor;
        this.currentAppState = oe0Var.n;
        WeakReference<ne0> weakReference = this.appStateCallback;
        synchronized (oe0Var.f) {
            oe0Var.f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            oe0 oe0Var = this.appStateMonitor;
            WeakReference<ne0> weakReference = this.appStateCallback;
            synchronized (oe0Var.f) {
                oe0Var.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
