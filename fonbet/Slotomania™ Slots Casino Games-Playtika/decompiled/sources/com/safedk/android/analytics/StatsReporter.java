package com.safedk.android.analytics;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class StatsReporter implements AppLovinCommunicatorPublisher {
    private static final String a = "StatsReporter";
    private static StatsReporter b;
    private static final ExecutorService c = Executors.newSingleThreadExecutor();

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.a;
    }

    public static synchronized void a() {
        synchronized (StatsReporter.class) {
            b = new StatsReporter();
        }
    }

    public static synchronized StatsReporter b() {
        StatsReporter statsReporter;
        synchronized (StatsReporter.class) {
            statsReporter = b;
        }
        return statsReporter;
    }

    public void a(final ArrayList<Bundle> arrayList) {
        try {
            c.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (arrayList.size() > 0) {
                            Logger.d(StatsReporter.a, "Starting report stats events!", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                            AppLovinBridge.a((ArrayList<Bundle>) arrayList, StatsReporter.this);
                            PersistentConcurrentHashMap.a();
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsReporter.a, "Caught exception while creating json data", th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during report events: ", arrayList, th);
            new CrashReporter().caughtException(th);
        }
    }

    public ArrayList<Bundle> a(Set<StatsEvent> set) {
        boolean z;
        Object[] objArr = new Object[4];
        objArr[0] = "filters reports and bundle started, events to send : ";
        objArr[1] = set == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(set.size());
        objArr[2] = ", isOnUiThread = ";
        objArr[3] = Boolean.valueOf(n.c());
        Logger.d(a, objArr);
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            for (StatsEvent statsEvent : set) {
                if (SafeDK.b() && (statsEvent.a().equals(StatsCollector.EventType.BrandSafety) || statsEvent.a().equals(StatsCollector.EventType.redirect))) {
                    z = true;
                } else {
                    z = false;
                }
                Logger.d(a, "filters reports and bundle Event type = ", statsEvent.a(), "; should report = " + z);
                Bundle d = statsEvent.d();
                Logger.printFullVerboseLog(a, "filters reports and bundle ", statsEvent.a(), " event:", n.a(d));
                if (z) {
                    Set<String> e = statsEvent.e();
                    if (e != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : e) {
                            if (!d.containsKey(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (hashSet.size() > 0) {
                            Logger.d(a, "filters reports and bundle *** missing fields: ", hashSet);
                        }
                    }
                    arrayList.add(statsEvent.a(d));
                    Logger.printFullVerboseLog(a, "filters reports and bundle event to be reported : ", d.toString());
                }
            }
        } catch (Exception e2) {
            Logger.e(a, "Exception filtering events for report", e2);
        }
        return arrayList;
    }

    public synchronized boolean a(CreativeInfo creativeInfo, c cVar) {
        Bundle bundle = cVar.A;
        Logger.d(a, "notify Max started , CI = ", creativeInfo, ", applovin data = ", bundle, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        if (creativeInfo != null && creativeInfo.af() != null && bundle != null) {
            String z = com.safedk.android.analytics.brandsafety.b.a(cVar, creativeInfo) ? cVar.z() : creativeInfo.af();
            Logger.d(a, "Will notify Max about match, creative id = ", z);
            AppLovinBridge.reportMaxCreativeId(bundle, z, b());
            return true;
        }
        Logger.d(a, "Cannot notify Max about match");
        return false;
    }
}
