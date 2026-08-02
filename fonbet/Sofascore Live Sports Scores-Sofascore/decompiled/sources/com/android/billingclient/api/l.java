package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkg;
import defpackage.axn;
import defpackage.bzn;
import defpackage.c0l;
import defpackage.dyn;
import defpackage.fsn;
import defpackage.ixn;
import defpackage.pyn;
import defpackage.uzn;
import defpackage.yn3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l extends a {
    public final Context O;
    public volatile int P;
    public volatile com.google.android.gms.internal.play_billing.zzba Q;
    public volatile k R;
    public volatile ScheduledExecutorService S;

    public l(Context context, BillingClient.Builder builder) {
        super(context, builder);
        this.P = 0;
        this.O = context;
    }

    public final synchronized boolean V() {
        if (this.P == 2 && this.Q != null) {
            if (this.R != null) {
                return true;
            }
        }
        return false;
    }

    public final zzdk W(final int i) {
        if (V()) {
            return com.google.android.gms.internal.play_billing.zzu.a(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzcr
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    l lVar = l.this;
                    int i2 = i;
                    try {
                        if (lVar.Q == null) {
                            throw null;
                        }
                        lVar.Q.F2(lVar.O.getPackageName(), i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new ixn(zzpVar));
                        return "billingOverrideService.getBillingOverride";
                    } catch (Exception unused) {
                        lVar.X(28, m.F, zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
                        int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                        zzpVar.a(0);
                        return "billingOverrideService.getBillingOverride";
                    }
                }
            });
        }
        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        X(28, m.a(-1, "Billing Override Service connection is disconnected."), zzjs.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
        return new bzn(0);
    }

    public final void X(int i, BillingResult billingResult, zzjs zzjsVar) {
        int i2 = zzdc.zza;
        zzjl zzb = zzdc.zzb(zzjsVar, i, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzb, "ApiFailure should not be null");
        this.h.o(zzb);
    }

    public final void Y(int i) {
        int i2 = zzdc.zza;
        zzjp zzc = zzdc.zzc(i, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzc, "ApiSuccess should not be null");
        c0l c0lVar = this.h;
        c0lVar.getClass();
        try {
            c0lVar.D(zzc, (zzkg) c0lVar.b);
        } catch (Throwable unused) {
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    public final void Z(int i, yn3 yn3Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        zzdk W = W(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.S == null) {
                    this.S = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.S;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!W.isDone()) {
            uzn uznVar = new uzn();
            uznVar.h = W;
            fsn fsnVar = new fsn();
            fsnVar.b = uznVar;
            uznVar.i = scheduledExecutorService.schedule(fsnVar, 28500L, timeUnit);
            W.a(fsnVar, dyn.a);
            W = uznVar;
        }
        axn axnVar = new axn(this, i, yn3Var, runnable);
        W.a(new pyn(0, W, axnVar), a());
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        Z(3, new yn3() { // from class: com.android.billingclient.api.zzcs
            @Override // defpackage.yn3
            public final void accept(Object obj) {
                AcknowledgePurchaseResponseListener.this.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzct
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        Z(4, new yn3() { // from class: com.android.billingclient.api.zzcp
            @Override // defpackage.yn3
            public final void accept(Object obj) {
                ConsumeResponseListener.this.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzcq
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.consumeAsync(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        synchronized (this) {
            Y(27);
            try {
                try {
                    if (this.R != null && this.Q != null) {
                        com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.O.unbindService(this.R);
                        this.R = new k(this);
                    }
                    this.Q = null;
                    if (this.S != null) {
                        this.S.shutdownNow();
                        this.S = null;
                    }
                } catch (RuntimeException unused) {
                    int i = com.google.android.gms.internal.play_billing.zzc.a;
                }
                this.P = 3;
            } catch (Throwable th) {
                this.P = 3;
                throw th;
            }
        }
        super.endConnection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        yn3 yn3Var = new yn3() { // from class: com.android.billingclient.api.zzcu
            @Override // defpackage.yn3
            public final void accept(Object obj) {
                l.this.Q((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzcv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingResult launchBillingFlow;
                launchBillingFlow = super/*com.android.billingclient.api.a*/.launchBillingFlow(activity, billingFlowParams);
                return launchBillingFlow;
            }
        };
        int i = 0;
        try {
            i = ((Integer) W(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            X(28, m.F, zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            X(28, m.F, zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            int i3 = com.google.android.gms.internal.play_billing.zzc.a;
        }
        if (i > 0) {
            BillingResult a = m.a(i, "Billing override value was set by a license tester.");
            X(2, a, zzjs.LICENSE_TESTER_BILLING_OVERRIDE);
            yn3Var.accept(a);
            return a;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception unused2) {
            BillingResult billingResult = m.h;
            X(2, billingResult, zzjs.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR);
            int i4 = com.google.android.gms.internal.play_billing.zzc.a;
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        Z(7, new yn3() { // from class: com.android.billingclient.api.zzcn
            @Override // defpackage.yn3
            public final void accept(Object obj) {
                QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
                ProductDetailsResponseListener.this.onProductDetailsResponse((BillingResult) obj, queryProductDetailsResult);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzco
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        synchronized (this) {
            if (V()) {
                com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                Y(26);
            } else if (this.P == 1) {
                int i = com.google.android.gms.internal.play_billing.zzc.a;
            } else if (this.P == 3) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                X(26, m.a(-1, "Billing Override Service connection is disconnected."), zzjs.BILLING_CLIENT_CLOSED);
            } else {
                this.P = 1;
                com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Starting Billing Override Service setup.");
                this.R = new k(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.O;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                zzjs zzjsVar = zzjs.REASON_UNSPECIFIED;
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    zzjsVar = zzjs.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, this.R, 1)) {
                                com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                            }
                        }
                    }
                }
                this.P = 0;
                com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Billing Override Service unavailable on device.");
                X(26, m.a(2, "Billing Override Service unavailable on device."), zzjsVar);
            }
        }
        L(billingClientStateListener, 0);
    }

    public l(PendingPurchasesParams pendingPurchasesParams, Context context, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, builder);
        this.P = 0;
        this.O = context;
    }

    public l(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, builder);
        this.P = 0;
        this.O = context;
    }

    public l(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, BillingClient.Builder builder) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, developerProvidedBillingListener, builder);
        this.P = 0;
        this.O = context;
    }
}
