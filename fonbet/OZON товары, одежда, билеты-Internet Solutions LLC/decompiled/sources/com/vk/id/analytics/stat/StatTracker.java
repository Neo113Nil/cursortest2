package com.vk.id.analytics.stat;

import He.b;
import Sc.InterfaceC4008j;
import We.InterfaceC4865g;
import We.L;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.network.InternalVKIDApiContract;
import fd.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f20\u0010\u0015\u001a,\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/vk/id/analytics/stat/StatTracker;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "", "clientId", "clientSecret", "LSc/j;", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "Lxe/I;", "dispatcher", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;LSc/j;Lxe/I;Landroid/content/Context;)V", "accessToken", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lorg/json/JSONObject;", "batchEvents", "Lkotlin/Function6;", "Lorg/json/JSONArray;", "LWe/g;", "apiMethod", "", "sendEvents", "(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Lfd/q;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "LSc/j;", "Lcom/vk/id/analytics/stat/AnalyticsStorage;", "storage", "Lcom/vk/id/analytics/stat/AnalyticsStorage;", "Lxe/M;", "trackerScope", "Lxe/M;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "anonymousBatchEvents", "Ljava/util/concurrent/LinkedBlockingQueue;", "personalizedBatchEvents", "Lcom/vk/id/analytics/stat/EventCounter;", "eventCounter", "Lcom/vk/id/analytics/stat/EventCounter;", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StatTracker implements VKIDAnalytics.Tracker {

    @NotNull
    private final LinkedBlockingQueue<JSONObject> anonymousBatchEvents;

    @NotNull
    private final InterfaceC4008j<InternalVKIDApiContract> api;

    @NotNull
    private final String clientId;

    @NotNull
    private final String clientSecret;

    @NotNull
    private final EventCounter eventCounter;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final LinkedBlockingQueue<JSONObject> personalizedBatchEvents;

    @NotNull
    private final AnalyticsStorage storage;

    @NotNull
    private final M trackerScope;

    /* JADX WARN: Multi-variable type inference failed */
    public StatTracker(@NotNull String clientId, @NotNull String clientSecret, @NotNull InterfaceC4008j<? extends InternalVKIDApiContract> api, @NotNull I dispatcher, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.api = api;
        this.storage = new AnalyticsStorage(context);
        this.trackerScope = N.a(dispatcher.plus(X0.b()));
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("StatTracker", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("StatTracker");
        this.anonymousBatchEvents = new LinkedBlockingQueue<>();
        this.personalizedBatchEvents = new LinkedBlockingQueue<>();
        this.eventCounter = new EventCounter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendEvents(String accessToken, LinkedBlockingQueue<JSONObject> batchEvents, q<? super String, ? super String, ? super String, ? super String, ? super JSONArray, ? super String, ? extends InterfaceC4865g> apiMethod) {
        String str;
        We.M c11;
        ArrayList arrayList = new ArrayList();
        batchEvents.drainTo(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        try {
            L execute = apiMethod.invoke(accessToken, this.clientId, this.clientSecret, "2.9.0", jSONArray, this.storage.getExternalDeviceId()).execute();
            this.logger.debug("Send events to stat '" + jSONArray + "': " + execute.m());
            c11 = execute.c();
        } catch (IOException e11) {
            this.logger.error("Network exception while sending events " + jSONArray, e11);
        }
        if (c11 != null) {
            str = c11.string();
            if (str == null) {
                try {
                    if (new JSONObject(str).has("error")) {
                        this.logger.error(str, null);
                    } else {
                        this.logger.debug(str);
                    }
                    return;
                } catch (JSONException unused) {
                    this.logger.debug(str);
                    return;
                }
            }
            return;
        }
        str = null;
        if (str == null) {
        }
    }

    public boolean equals(Object other) {
        return (other instanceof StatTracker) && Intrinsics.d(this.clientSecret, ((StatTracker) other).clientSecret);
    }

    public int hashCode() {
        return this.clientSecret.hashCode();
    }

    @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
    public void trackEvent(String accessToken, @NotNull String name, @NotNull VKIDAnalytics.EventParam... params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(N.a(b.f10879b), null, null, new StatTracker$trackEvent$1(name, params, this, accessToken, null), 3);
    }
}
