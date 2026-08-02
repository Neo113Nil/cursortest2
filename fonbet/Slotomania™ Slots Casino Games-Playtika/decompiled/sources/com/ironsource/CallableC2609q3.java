package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class CallableC2609q3 implements Callable<C2680u3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC2644s3 d;
    private final InterfaceC2626r3 e;
    private final NetworkSettings f;

    /* renamed from: com.ironsource.q3$a */
    class a implements BiddingDataCallback {
        final /* synthetic */ C2432g5 a;
        final /* synthetic */ BlockingQueue b;

        a(C2432g5 c2432g5, BlockingQueue blockingQueue) {
            this.a = c2432g5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new C2680u3(CallableC2609q3.this.d(), CallableC2609q3.this.c(), null, C2432g5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new C2680u3(CallableC2609q3.this.d(), CallableC2609q3.this.c(), map, C2432g5.a(this.a), null));
        }
    }

    public CallableC2609q3(int i, String str, AdData adData, InterfaceC2644s3 interfaceC2644s3, InterfaceC2626r3 interfaceC2626r3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC2644s3;
        this.e = interfaceC2626r3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2680u3 call() throws Exception {
        C2432g5 c2432g5 = new C2432g5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c2432g5, arrayBlockingQueue));
        } catch (Exception e) {
            C2556n4.d().a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC2626r3 interfaceC2626r3 = this.e;
            if (interfaceC2626r3 != null) {
                interfaceC2626r3.a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C2556n4.d().a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC2626r3 interfaceC2626r32 = this.e;
            if (interfaceC2626r32 != null) {
                interfaceC2626r32.a(str2);
            }
        }
        InterfaceC2626r3 interfaceC2626r33 = this.e;
        if (interfaceC2626r33 != null) {
            interfaceC2626r33.a(this.f);
        }
        return (C2680u3) arrayBlockingQueue.take();
    }

    public InterfaceC2644s3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
