package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2447h2 implements Uc {
    private final V0 a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C2447h2(V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Uc
    public void a(B instance, String str, C2526la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Uc
    public void a(List<? extends B> waterfallInstances, B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        C2608q2 h = winnerInstance.h();
        this.b.a(h, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C2608q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b : waterfallInstances) {
            arrayList.add(b.p());
            concurrentHashMap.put(b.p(), b.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), h);
    }

    private final void a(C2526la c2526la, B b) {
        final V8 v8 = new V8(b.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c2526la.a())) {
            this.a.e(new Runnable() { // from class: com.ironsource.h2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2447h2.a(C2447h2.this, impressionDataListener, v8);
                }
            });
            this.a.e().h().a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2447h2 this$0, ImpressionDataListener listener, V8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C2588p0.a(this$0.a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
