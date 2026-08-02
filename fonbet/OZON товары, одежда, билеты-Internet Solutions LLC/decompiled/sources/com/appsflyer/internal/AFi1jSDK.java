package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class AFi1jSDK extends Observable {
    final Runnable AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    long registerClient;
    public final String unregisterClient;
    public final Map<String, Object> valueOf = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public AFa1tSDK f57489d = AFa1tSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFi1jSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements Observer {
        AnonymousClass4() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFi1jSDK.this.AFInAppEventParameterName.run();
        }
    }

    public enum AFa1tSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFi1jSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventParameterName = runnable;
        this.AFKeystoreWrapper = str2;
        this.unregisterClient = str;
    }

    public final void AFKeystoreWrapper() {
        this.valueOf.put("source", this.AFKeystoreWrapper);
        this.valueOf.put("type", this.unregisterClient);
        this.valueOf.put("latency", Long.valueOf(System.currentTimeMillis() - this.registerClient));
        this.f57489d = AFa1tSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void valueOf(Context context);
}
