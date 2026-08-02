package com.appsflyer.internal;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class AFj1tSDK extends Observable {
    public final String areAllFieldsValid;
    long component1;
    public final String component3;
    final Runnable getRevenue;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1tSDK component4 = AFa1tSDK.NOT_STARTED;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    /* renamed from: com.appsflyer.internal.AFj1tSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Observer {
        public AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1tSDK.this.getRevenue.run();
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum AFa1tSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1tSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.component3 = str2;
        this.areAllFieldsValid = str;
    }

    public void AFAdRevenueData() {
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
    }

    public final void getMediationNetwork() {
        this.getMediationNetwork.put(AdRevenueConstants.SOURCE_KEY, this.component3);
        this.getMediationNetwork.put("type", this.areAllFieldsValid);
        AFAdRevenueData();
        this.component4 = AFa1tSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void getMonetizationNetwork(Context context);
}
