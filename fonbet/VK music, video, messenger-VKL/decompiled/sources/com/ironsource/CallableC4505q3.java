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
import xsna.cqi;

/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class CallableC4505q3 implements Callable<C4576u3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC4540s3 d;
    private final InterfaceC4522r3 e;
    private final NetworkSettings f;

    /* renamed from: com.ironsource.q3$a */
    public class a implements BiddingDataCallback {
        final /* synthetic */ C4328g5 a;
        final /* synthetic */ BlockingQueue b;

        public a(C4328g5 c4328g5, BlockingQueue blockingQueue) {
            this.a = c4328g5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new C4576u3(CallableC4505q3.this.d(), CallableC4505q3.this.c(), null, C4328g5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new C4576u3(CallableC4505q3.this.d(), CallableC4505q3.this.c(), map, C4328g5.a(this.a), null));
        }
    }

    public CallableC4505q3(int i, String str, AdData adData, InterfaceC4540s3 interfaceC4540s3, InterfaceC4522r3 interfaceC4522r3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC4540s3;
        this.e = interfaceC4522r3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4576u3 call() throws Exception {
        C4328g5 c4328g5 = new C4328g5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c4328g5, arrayBlockingQueue));
        } catch (Exception e) {
            C4452n4.d().a(e);
            String b = cqi.b(e, new StringBuilder("Exception while calling collectBiddingData - "));
            IronLog.INTERNAL.error(b);
            InterfaceC4522r3 interfaceC4522r3 = this.e;
            if (interfaceC4522r3 != null) {
                interfaceC4522r3.a(b);
            }
        } catch (NoClassDefFoundError e2) {
            C4452n4.d().a(e2);
            String str = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4522r3 interfaceC4522r32 = this.e;
            if (interfaceC4522r32 != null) {
                interfaceC4522r32.a(str);
            }
        }
        InterfaceC4522r3 interfaceC4522r33 = this.e;
        if (interfaceC4522r33 != null) {
            interfaceC4522r33.a(this.f);
        }
        return (C4576u3) arrayBlockingQueue.take();
    }

    public InterfaceC4540s3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
