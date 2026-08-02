package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingClientAdapterFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapterFactory;", "", "()V", "createBillingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "context", "Landroid/content/Context;", "createV6Adapter", "fallbackVersion", "", "createV8Adapter", "Lkotlin/Result;", "createV8Adapter-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BillingClientAdapterFactory {
    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        BillingClientAdapter createV6Adapter$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Object m10580createV8AdapterIoAF18A = m10580createV8AdapterIoAF18A(context);
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10580createV8AdapterIoAF18A);
        if (m11183exceptionOrNullimpl != null) {
            if (m11183exceptionOrNullimpl instanceof FallbackException) {
                createV6Adapter$default = createV6Adapter(context, ((FallbackException) m11183exceptionOrNullimpl).getDetectedVersion());
            } else {
                createV6Adapter$default = createV6Adapter$default(this, context, 0, 2, null);
            }
            m10580createV8AdapterIoAF18A = createV6Adapter$default;
        }
        return (BillingClientAdapter) m10580createV8AdapterIoAF18A;
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m10580createV8AdapterIoAF18A(Context context) {
        try {
            Result.Companion companion = Result.INSTANCE;
            BillingClientAdapterFactory billingClientAdapterFactory = this;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(BillingClientBridge.INSTANCE.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return Result.m11180constructorimpl(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
    }

    static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    private final BillingClientAdapter createV6Adapter(Context context, int fallbackVersion) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            BillingClientAdapterFactory billingClientAdapterFactory = this;
            BillingClientBuilderBridge builder = com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(context);
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            m11180constructorimpl = Result.m11180constructorimpl(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, fallbackVersion));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        return (BillingClientAdapter) m11180constructorimpl;
    }
}
