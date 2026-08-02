package com.vk.billing;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.billing.StorePurchasesManager;
import com.vk.core.preference.Preference;
import com.vk.dto.common.PaymentType;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.ang;
import xsna.gt8;
import xsna.i0q0;
import xsna.j27;
import xsna.j9k;
import xsna.kw6;
import xsna.mge0;
import xsna.n6j;
import xsna.o27;
import xsna.qge0;
import xsna.sd;
import xsna.uno;
import xsna.zq70;

/* compiled from: GoogleStorePurchasesManagerImpl.kt */
/* loaded from: classes.dex */
public final class GoogleStorePurchasesManagerImpl implements StorePurchasesManager {
    public final com.vk.billing.d a;
    public final o27 b;
    public final String c;

    /* compiled from: GoogleStorePurchasesManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class PayNotAvailableException extends Exception {
    }

    /* compiled from: GoogleStorePurchasesManagerImpl.kt */
    public static final class a {
        public static int a(Purchase purchase) {
            String str;
            String developerPayload = purchase.getDeveloperPayload();
            if (developerPayload.length() == 0) {
                AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                if (accountIdentifiers == null || (str = accountIdentifiers.getObfuscatedAccountId()) == null) {
                    str = "";
                }
                developerPayload = str;
            }
            if (new Regex("[0-9]+,[0-9]+,[0-9A-Za-z_]+").f(developerPayload)) {
                return Integer.parseInt(((String[]) n6j.a(0, StringUtils.COMMA, developerPayload).toArray(new String[0]))[1]);
            }
            if (new Regex("[0-9]+,1,[0-9]+,[0-9A-Za-z_]+").f(developerPayload)) {
                return Integer.parseInt(((String[]) n6j.a(0, StringUtils.COMMA, developerPayload).toArray(new String[0]))[2]);
            }
            return -1;
        }
    }

    /* compiled from: GoogleStorePurchasesManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class b implements StorePurchasesManager.b {
        public final StorePurchasesManager.b a;

        public b(StorePurchasesManager.b bVar) {
            this.a = bVar;
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void a() {
            this.a.a();
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void b() {
            this.a.b();
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void c(mge0 mge0Var) {
            this.a.c(mge0Var);
        }

        @Override // com.vk.billing.StorePurchasesManager.b
        public final void d(int i) {
            this.a.d(i);
        }

        public final void e(final int i) {
            i0q0.j(new Runnable() { // from class: xsna.kau
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    GoogleStorePurchasesManagerImpl.b bVar = this;
                    if (i2 == 3) {
                        bVar.a.a();
                    } else {
                        bVar.a.b();
                    }
                }
            });
        }

        public final void f(mge0 mge0Var) {
            i0q0.j(new kw6(3, this, mge0Var));
        }
    }

    /* compiled from: GoogleStorePurchasesManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                iArr[PaymentType.Balance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentType.Subs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentType.Inapp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorePurchasesManager.ProrationMode.values().length];
            try {
                iArr2[StorePurchasesManager.ProrationMode.UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StorePurchasesManager.ProrationMode.IMMEDIATE_WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StorePurchasesManager.ProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StorePurchasesManager.ProrationMode.IMMEDIATE_WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StorePurchasesManager.ProrationMode.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StorePurchasesManager.ProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public GoogleStorePurchasesManagerImpl(Context context, com.vk.billing.d dVar) {
        this.a = dVar;
        o27 o27Var = o27.d;
        this.b = o27Var;
        o27Var.getClass();
        o27.e = BillingClient.newBuilder(context).setListener(o27Var).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        o27.f = Preference.f("BillingManagerPrefs");
        this.c = "https://pay.google.com/payments/u/0/home#settings";
    }

    public final <T extends mge0> void a(Map<String, ? extends T> map, String str, b bVar) {
        ArrayList arrayList = new ArrayList(new LinkedHashMap(map).keySet());
        int i = 0;
        int size = (arrayList.size() / 18) + (arrayList.size() % 18 == 0 ? 0 : 1);
        while (i < size) {
            int i2 = i * 18;
            i++;
            int i3 = i * 18;
            int size2 = arrayList.size();
            if (i3 > size2) {
                i3 = size2;
            }
            o27.d.g(new com.vk.billing.c(this, map, new ArrayList(arrayList.subList(i2, i3)), str, bVar));
        }
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final void b() {
        L.e("Billing : PurchasesManager", "#restoreLastPurchaseOnStartUp");
        this.b.g(new d());
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final q c(Context context) {
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        o27.d.g(new com.vk.billing.b(fVar, context));
        return fVar;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 d(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        boolean d1 = mge0Var.d1();
        com.vk.billing.d dVar = this.a;
        if (d1) {
            dVar.j(activity, aVar, mge0Var);
            return new zq70();
        }
        PaymentType u3 = mge0Var.u3();
        int i = u3 == null ? -1 : c.$EnumSwitchMapping$0[u3.ordinal()];
        if (i == 1) {
            dVar.k(activity, mge0Var, aVar, null, null);
            return new zq70();
        }
        if (i == 2) {
            h hVar = new h(activity, this.b, this.a, mge0Var, aVar);
            hVar.p(false);
            return hVar;
        }
        if (i != 3) {
            return new zq70();
        }
        h hVar2 = new h(activity, this.b, this.a, mge0Var, aVar);
        hVar2.n();
        return hVar2;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <T extends mge0> void e(Map<String, ? extends T> map, StorePurchasesManager.b bVar) {
        a(map, "inapp", bVar != null ? new b(bVar) : null);
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 f(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var) {
        if (mge0Var.d1() || mge0Var.u3() != PaymentType.Subs) {
            return new zq70();
        }
        h hVar = new h(activity, this.b, this.a, mge0Var, aVar);
        hVar.p(true);
        return hVar;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 g(Activity activity, ArrayList arrayList, ang.a aVar) {
        if (arrayList.size() == 1) {
            return d(activity, aVar, (mge0) arrayList.get(0));
        }
        if (!arrayList.isEmpty() && ((mge0) arrayList.get(0)).u3() != null) {
            mge0 mge0Var = (mge0) arrayList.get(0);
            PaymentType u3 = mge0Var.u3();
            int i = u3 == null ? -1 : c.$EnumSwitchMapping$0[u3.ordinal()];
            if (i == 1) {
                this.a.i(activity, arrayList, aVar, null, null);
            } else {
                if (i == 3) {
                    return d(activity, aVar, mge0Var);
                }
                L.l("Billing : PurchasesManager", "trying to purchase item with unknown payment type: " + mge0Var.u3());
            }
        }
        return new zq70();
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final <T extends mge0> void h(Map<String, ? extends T> map, StorePurchasesManager.b bVar) {
        a(map, "subs", new b(bVar));
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final qge0 l(Activity activity, mge0 mge0Var, StorePurchasesManager.ProrationMode prorationMode, gt8 gt8Var) {
        int i;
        if (mge0Var.d1() || mge0Var.u3() != PaymentType.Subs) {
            return new zq70();
        }
        h hVar = new h(activity, this.b, this.a, mge0Var, gt8Var);
        switch (c.$EnumSwitchMapping$1[prorationMode.ordinal()]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        hVar.o(i);
        return hVar;
    }

    @Override // com.vk.billing.StorePurchasesManager
    public final String m() {
        return this.c;
    }

    /* compiled from: GoogleStorePurchasesManagerImpl.kt */
    public static final class d implements j27 {
        public d() {
        }

        @Override // xsna.j27
        public final void b() {
            GoogleStorePurchasesManagerImpl googleStorePurchasesManagerImpl = GoogleStorePurchasesManagerImpl.this;
            try {
                if (!googleStorePurchasesManagerImpl.b.d(true)) {
                    L.G("Billing : PurchasesManager", "restoreLastPurchaseOnStartUp: billing is disabled");
                    return;
                }
                i0q0.j(new sd(googleStorePurchasesManagerImpl, 6));
                h hVar = new h(null, googleStorePurchasesManagerImpl.b, googleStorePurchasesManagerImpl.a, new uno(), null);
                hVar.k(new j9k(hVar, 18));
            } catch (Throwable unused) {
            }
        }

        @Override // xsna.j27
        public final String getName() {
            return "restoreLastPurchaseOnStartUp";
        }

        @Override // xsna.j27
        public final void a() {
        }
    }
}
