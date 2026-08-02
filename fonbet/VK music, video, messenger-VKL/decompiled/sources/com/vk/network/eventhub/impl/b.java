package com.vk.network.eventhub.impl;

import android.os.SystemClock;
import com.vk.core.preference.Preference;
import com.vk.network.eventhub.api.ConnectionState;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import okio.ByteString;
import xsna.asu0;
import xsna.j1n;
import xsna.li0;
import xsna.s3q0;
import xsna.yni0;

/* compiled from: EventHubServiceClient.kt */
/* loaded from: classes3.dex */
public final class b {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ EventHubServiceClient b;
    public final /* synthetic */ a c;

    public b(EventHubServiceClient eventHubServiceClient, a aVar) {
        this.b = eventHubServiceClient;
        this.c = aVar;
    }

    public final void a() {
        this.a.set(true);
        this.b.q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis() / 1000;
        c.l = Long.valueOf(uptimeMillis);
        Preference.F(uptimeMillis, "master_service_perf_prefs", "connectedTime");
        c.g();
        this.b.n(ConnectionState.CONNECTED);
        this.c.O0();
    }

    public final void b(j1n j1nVar) {
        EventHubServiceClient eventHubServiceClient = this.b;
        eventHubServiceClient.q.getClass();
        c.f(SystemClock.uptimeMillis() / 1000, j1nVar);
        eventHubServiceClient.n(ConnectionState.DISCONNECTED);
        eventHubServiceClient.k(new EventHubServiceClient.Op.c(j1nVar, this.c, this.a));
    }

    public final void c(ByteString byteString) {
        Object failure;
        ExecutorService b;
        c cVar = this.b.q;
        int n = byteString.n();
        cVar.getClass();
        long addAndGet = c.e.addAndGet(n);
        long incrementAndGet = c.c.incrementAndGet();
        Preference.F(addAndGet, "master_service_perf_prefs", "receivedTraffic");
        Preference.F(incrementAndGet, "master_service_perf_prefs", "receivedMsgCount");
        c.g();
        this.c.R0();
        AtomicLong atomicLong = Message.e;
        Message.b bVar = new Message.b(byteString);
        yni0 yni0Var = this.b.o;
        if (yni0Var != null && bVar.b[0] == yni0Var.a) {
            this.b.k(new EventHubServiceClient.Op.NewMessage(bVar, EventHubServiceClient.Op.NewMessage.Type.INCOMING));
            return;
        }
        EventHubServiceClient eventHubServiceClient = this.b;
        try {
            byte b2 = bVar.b[0];
            ConcurrentHashMap<yni0, ExecutorService> concurrentHashMap = eventHubServiceClient.p;
            yni0 yni0Var2 = new yni0(b2);
            ExecutorService executorService = concurrentHashMap.get(yni0Var2);
            int i = 4;
            if (executorService == null) {
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "eventhub-guest-" + ((int) b2));
                ExecutorService putIfAbsent = concurrentHashMap.putIfAbsent(yni0Var2, b);
                executorService = putIfAbsent == null ? b : putIfAbsent;
            }
            executorService.execute(new li0(i, eventHubServiceClient, bVar));
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            this.b.k(new EventHubServiceClient.Op.NewMessage(bVar, EventHubServiceClient.Op.NewMessage.Type.INCOMING));
        }
    }
}
