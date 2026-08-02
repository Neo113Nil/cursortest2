package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import kotlin.Result;

/* compiled from: BillingClientAdapterFactory.kt */
/* loaded from: classes14.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i) {
        Object failure;
        try {
            failure = new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(BillingClientBridge.newBuilder(context), i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (BillingClientAdapter) failure;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m77createV8AdapterIoAF18A(Context context) {
        try {
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return billingClientAdapter;
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        Object m77createV8AdapterIoAF18A = m77createV8AdapterIoAF18A(context);
        Throwable a = Result.a(m77createV8AdapterIoAF18A);
        if (a != null) {
            m77createV8AdapterIoAF18A = a instanceof FallbackException ? createV6Adapter(context, ((FallbackException) a).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) m77createV8AdapterIoAF18A;
    }
}
