package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes6.dex */
public abstract class AFj1qSDK extends Observable {
    public final String component1;
    public final String component3;
    long component4;
    final Runnable getRevenue;
    public final Map<String, Object> AFAdRevenueData = new HashMap();
    public AFa1vSDK component2 = AFa1vSDK.NOT_STARTED;

    public enum AFa1vSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void getMonetizationNetwork(Context context);

    public AFj1qSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.component3 = str2;
        this.component1 = str;
    }

    /* renamed from: com.appsflyer.internal.AFj1qSDK$3, reason: invalid class name */
    final class AnonymousClass3 implements Observer {
        AnonymousClass3() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1qSDK.this.getRevenue.run();
        }
    }

    public final void getRevenue() {
        this.AFAdRevenueData.put("source", this.component3);
        this.AFAdRevenueData.put("type", this.component1);
        this.AFAdRevenueData.put("latency", Long.valueOf(System.currentTimeMillis() - this.component4));
        this.component2 = AFa1vSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
