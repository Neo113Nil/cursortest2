package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.Ah;
import defpackage.dii;
import defpackage.hc5;
import defpackage.joa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ah {
    public Function1 a;
    public BillingClient b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final C3629nh d = new C3629nh();
    public final int e = 2;

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new hc5(26)).build();
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            joa joaVar2 = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 function1) {
        context.getClass();
        function1.getClass();
        try {
            this.a = function1;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new C3681ph((short) 2236), (C3629nh) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new C3681ph((short) 2233), (C3629nh) null);
            } else {
                this.b = billingClient;
                billingClient.startConnection(new C3862wh(new defpackage.bm(this, 1), this));
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
            a(new C3681ph((short) 2237), (C3629nh) null);
        }
    }

    public static final void b(BillingResult billingResult, List list) {
        billingResult.getClass();
    }

    public static final void b(Ah ah, Function1 function1, BillingResult billingResult, List list) {
        billingResult.getClass();
        list.getClass();
        C3629nh c3629nh = ah.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3629nh.a = arrayList.size();
        AbstractC3424fj.g.submit(new defpackage.am(0, ah, function1));
    }

    public static final void b(Function1 function1, Ah ah) {
        function1.invoke(ah.d);
    }

    public static final void a(BillingResult billingResult, List list) {
        billingResult.getClass();
    }

    public static final Unit a(Ah ah, AbstractC3836vh abstractC3836vh) {
        abstractC3836vh.getClass();
        if (abstractC3836vh instanceof C3784th) {
            ah.a(new C3655oh(String.valueOf(((C3784th) abstractC3836vh).a)), (C3629nh) null);
            return Unit.a;
        }
        ah.a(new defpackage.bm(ah, 0));
        return Unit.a;
    }

    public static final Unit a(Ah ah, C3629nh c3629nh) {
        c3629nh.getClass();
        if (ah.c.incrementAndGet() != ah.e) {
            return Unit.a;
        }
        int i = c3629nh.a;
        if (i == 0 && c3629nh.b == 0) {
            ah.a(new C3681ph((short) 2234), (C3629nh) null);
            return Unit.a;
        }
        dii.d("No of In-App Purchases: " + i + "\n                                    | and No of Subscriptions: " + c3629nh.b + "\n                                ");
        ah.a(C3707qh.a, c3629nh);
        return Unit.a;
    }

    public final void a(AbstractC3732rh abstractC3732rh, C3629nh c3629nh) {
        AbstractC3758sh.a(abstractC3732rh);
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(c3629nh);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new hc5(27)).build();
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            joa joaVar2 = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(final Function1 function1) {
        function1.getClass();
        QueryPurchasesParams.Builder newBuilder = QueryPurchasesParams.newBuilder();
        newBuilder.getClass();
        newBuilder.setProductType(BillingClient.ProductType.INAPP);
        QueryPurchasesParams.Builder newBuilder2 = QueryPurchasesParams.newBuilder();
        newBuilder2.getClass();
        newBuilder2.setProductType(BillingClient.ProductType.SUBS);
        BillingClient billingClient = this.b;
        if (billingClient != null) {
            final int i = 0;
            billingClient.queryPurchasesAsync(newBuilder.build(), new PurchasesResponseListener() { // from class: cm
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    int i2 = i;
                    Function1 function12 = function1;
                    Ah ah = this;
                    switch (i2) {
                        case 0:
                            Ah.b(ah, function12, billingResult, list);
                            break;
                        default:
                            Ah.a(ah, function12, billingResult, list);
                            break;
                    }
                }
            });
        }
        BillingClient billingClient2 = this.b;
        if (billingClient2 != null) {
            final int i2 = 1;
            billingClient2.queryPurchasesAsync(newBuilder2.build(), new PurchasesResponseListener() { // from class: cm
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    int i22 = i2;
                    Function1 function12 = function1;
                    Ah ah = this;
                    switch (i22) {
                        case 0:
                            Ah.b(ah, function12, billingResult, list);
                            break;
                        default:
                            Ah.a(ah, function12, billingResult, list);
                            break;
                    }
                }
            });
        }
    }

    public static final void a(Ah ah, Function1 function1, BillingResult billingResult, List list) {
        billingResult.getClass();
        list.getClass();
        C3629nh c3629nh = ah.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3629nh.b = arrayList.size();
        AbstractC3424fj.g.submit(new defpackage.am(1, ah, function1));
    }

    public final Function1 a(String str) {
        if (kotlin.text.c.v(str, "6", false)) {
            return new C3888xh(this);
        }
        if (kotlin.text.c.v(str, com.ironsource.Fc.e, false)) {
            return new C3914yh(this);
        }
        return new C3940zh(this);
    }

    public static final void a(Function1 function1, Ah ah) {
        function1.invoke(ah.d);
    }
}
