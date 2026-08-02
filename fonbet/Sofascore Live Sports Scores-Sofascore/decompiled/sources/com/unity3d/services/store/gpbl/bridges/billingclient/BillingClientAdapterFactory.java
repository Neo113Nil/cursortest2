package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapterFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lw2g;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "createV8Adapter-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "createV8Adapter", "", "fallbackVersion", "createV6Adapter", "(Landroid/content/Context;I)Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "createBillingClientAdapter", "(Landroid/content/Context;)Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int fallbackVersion) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            BillingClientBuilderBridge newBuilder = BillingClientBridge.newBuilder(context);
            newBuilder.getClass();
            u2gVar = new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(newBuilder, fallbackVersion);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (BillingClientAdapter) u2gVar;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m758createV8AdapterIoAF18A(Context context) {
        try {
            p2g p2gVar = w2g.b;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.INSTANCE.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return billingClientAdapter;
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            return new u2g(th);
        }
    }

    @Nullable
    public final BillingClientAdapter createBillingClientAdapter(@NotNull Context context) {
        context.getClass();
        Object m758createV8AdapterIoAF18A = m758createV8AdapterIoAF18A(context);
        Throwable a = w2g.a(m758createV8AdapterIoAF18A);
        if (a != null) {
            m758createV8AdapterIoAF18A = a instanceof FallbackException ? createV6Adapter(context, ((FallbackException) a).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) m758createV8AdapterIoAF18A;
    }
}
