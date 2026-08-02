package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.bf3;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class CallableC4210n3 implements Callable<C4281r3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC4246p3 d;
    private final InterfaceC4228o3 e;
    private final NetworkSettings f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.n3$a */
    public class a implements BiddingDataCallback {
        final /* synthetic */ C4051e5 a;
        final /* synthetic */ BlockingQueue b;

        public a(C4051e5 c4051e5, BlockingQueue blockingQueue) {
            this.a = c4051e5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.b.add(new C4281r3(CallableC4210n3.this.d(), CallableC4210n3.this.c(), null, C4051e5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.b.add(new C4281r3(CallableC4210n3.this.d(), CallableC4210n3.this.c(), map, C4051e5.a(this.a), null));
        }
    }

    public CallableC4210n3(int i, String str, AdData adData, InterfaceC4246p3 interfaceC4246p3, InterfaceC4228o3 interfaceC4228o3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC4246p3;
        this.e = interfaceC4228o3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4281r3 call() throws Exception {
        C4051e5 c4051e5 = new C4051e5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c4051e5, arrayBlockingQueue));
        } catch (Exception e) {
            C4157k4.d().a(e);
            String j = bf3.j(e, new StringBuilder("Exception while calling collectBiddingData - "));
            IronLog.INTERNAL.error(j);
            InterfaceC4228o3 interfaceC4228o3 = this.e;
            if (interfaceC4228o3 != null) {
                interfaceC4228o3.a(j);
            }
        } catch (NoClassDefFoundError e2) {
            C4157k4.d().a(e2);
            String str = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4228o3 interfaceC4228o32 = this.e;
            if (interfaceC4228o32 != null) {
                interfaceC4228o32.a(str);
            }
        }
        InterfaceC4228o3 interfaceC4228o33 = this.e;
        if (interfaceC4228o33 != null) {
            interfaceC4228o33.a(this.f);
        }
        return (C4281r3) arrayBlockingQueue.take();
    }

    public InterfaceC4246p3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
