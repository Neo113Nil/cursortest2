package com.vk.billing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.billing.StorePurchasesManager;
import com.vk.billing.a;
import com.vk.dto.common.PaymentType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import xsna.am6;
import xsna.asu0;
import xsna.by5;
import xsna.cvk;
import xsna.e43;
import xsna.gl30;
import xsna.gzs;
import xsna.ii3;
import xsna.itb0;
import xsna.ivz;
import xsna.j03;
import xsna.j27;
import xsna.j5g;
import xsna.j9k;
import xsna.jsv;
import xsna.laq;
import xsna.lhg;
import xsna.m330;
import xsna.mge0;
import xsna.n3t;
import xsna.ner0;
import xsna.o27;
import xsna.qge0;
import xsna.rsg0;
import xsna.svh;
import xsna.tge0;
import xsna.uc00;
import xsna.vdq;
import xsna.vge0;
import xsna.wil0;
import xsna.x68;
import xsna.yr00;
import xsna.z1u0;

/* compiled from: PurchasesManagerSessionImpl.kt */
/* loaded from: classes15.dex */
public final class h<D extends mge0> implements qge0<D>, a.InterfaceC0423a {
    public final o27 b;
    public final com.vk.billing.d c;
    public final D d;
    public final StorePurchasesManager.a<D> e;
    public final WeakReference<Activity> f;
    public int h;
    public Purchase j;
    public boolean k;
    public final laq g = new laq(8, TimeUnit.MILLISECONDS.toMillis(500), 1.5f, TimeUnit.SECONDS.toMillis(30));
    public String i = "";

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                iArr[PaymentType.Subs.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentType.Inapp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final class c implements j27 {
        public final /* synthetic */ h<D> a;
        public final /* synthetic */ Purchase b;

        public c(h<D> hVar, Purchase purchase) {
            this.a = hVar;
            this.b = purchase;
        }

        @Override // xsna.j27
        public final void a() {
            cvk.u(R.string.error, false);
        }

        @Override // xsna.j27
        public final void b() {
            ner0 ner0Var;
            JSONObject jSONObject;
            String signature;
            String str;
            ExecutorService n;
            Purchase purchase = this.b;
            h<D> hVar = this.a;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            try {
                int id = hVar.d.getId();
                Purchase purchase2 = this.b;
                Activity activity = hVar.f.get();
                if (activity != null) {
                    ner0 ner0Var2 = new ner0(activity);
                    ner0Var2.setMessage(activity.getString(R.string.loading));
                    ner0Var2.setCancelable(false);
                    ner0Var2.show();
                    ner0Var = ner0Var2;
                } else {
                    ner0Var = null;
                }
                hVar.j(atomicInteger, id, purchase2, ner0Var, true);
                jSONObject = new JSONObject(purchase.getOriginalJson());
                signature = purchase.getSignature();
                String str2 = (String) j5g.a0(purchase.getProducts());
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
                atomicInteger.incrementAndGet();
                asu0.a.getClass();
                n = asu0.n();
            } catch (Exception e) {
                e = e;
            }
            try {
                svh svhVar = new svh(hVar, str, atomicInteger, jSONObject, signature);
                atomicInteger = atomicInteger;
                n.submit(svhVar);
            } catch (Exception e2) {
                e = e2;
                atomicInteger = atomicInteger;
                Exception exc = e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.w(l, L.LogType.e, exc, new Object[]{"Billing : PurchasesManager", "Error during processing billing result"}, null, null, 24);
                }
                com.vk.metrics.eventtracking.b.a.a(new InAppPurchaseManagerException(exc));
                h.r(atomicInteger, null);
            }
            h.r(atomicInteger, null);
        }

        @Override // xsna.j27
        public final String getName() {
            return "onBillingSuccess";
        }
    }

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final class d implements j27 {
        public final /* synthetic */ h<D> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ner0 c;

        public d(h<D> hVar, boolean z, ner0 ner0Var) {
            this.a = hVar;
            this.b = z;
            this.c = ner0Var;
        }

        @Override // xsna.j27
        public final void a() {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Billing unavailable during restore inapp #processRestore"});
            }
            if (this.b) {
                cvk.u(R.string.error_purchasing, false);
            }
            int i = z1u0.a;
            z1u0.a(this.c);
        }

        @Override // xsna.j27
        public final void b() {
            boolean z = this.b;
            ner0 ner0Var = this.c;
            h<D> hVar = this.a;
            am6 am6Var = new am6(z, ner0Var, hVar, 2);
            try {
                o27 o27Var = hVar.b;
                yr00 yr00Var = new yr00(am6Var, 24);
                o27Var.getClass();
                o27.c("inapp", yr00Var);
            } catch (Exception e) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.w(l, L.LogType.e, e, new Object[]{"Billing : PurchasesManager", "Error during restore inapp #processRestore"}, null, null, 24);
                }
                if (z) {
                    cvk.u(R.string.error_purchasing, false);
                }
                com.vk.metrics.eventtracking.b.a.a(e);
                z1u0.a(ner0Var);
            }
        }

        @Override // xsna.j27
        public final String getName() {
            return "processRestoreInApp";
        }
    }

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final class e implements j27 {
        public final /* synthetic */ h<D> a;

        public e(h<D> hVar) {
            this.a = hVar;
        }

        @Override // xsna.j27
        public final void a() {
            new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
            h.q();
            h<D> hVar = this.a;
            StorePurchasesManager.a<D> aVar = hVar.e;
            if (aVar != null) {
                aVar.d(hVar.d);
            }
        }

        @Override // xsna.j27
        public final void b() {
            h<D> hVar = this.a;
            o27 o27Var = hVar.b;
            D d = hVar.d;
            try {
                if (!o27Var.e("inapp", true)) {
                    throw new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
                }
                hVar.i = "inapp";
                Activity activity = hVar.f.get();
                if (activity != null) {
                    o27.f(activity, "inapp", d.L4(), d.W6());
                }
            } catch (Exception unused) {
                h.q();
                StorePurchasesManager.a<D> aVar = hVar.e;
                if (aVar != null) {
                    aVar.d(d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // xsna.j27
        public final String getName() {
            return "purchaseInapp";
        }
    }

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final class f implements j27 {
        public final /* synthetic */ h<D> a;
        public final /* synthetic */ boolean b;

        public f(h<D> hVar, boolean z) {
            this.a = hVar;
            this.b = z;
        }

        @Override // xsna.j27
        public final void a() {
            new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
            h.q();
            h<D> hVar = this.a;
            StorePurchasesManager.a<D> aVar = hVar.e;
            if (aVar != null) {
                aVar.d(hVar.d);
            }
        }

        @Override // xsna.j27
        public final void b() {
            h<D> hVar = this.a;
            o27 o27Var = hVar.b;
            x68 x68Var = new x68(hVar, this.b, 3);
            try {
                if (!o27Var.e("subs", true)) {
                    throw new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
                }
                o27.c("subs", x68Var);
            } catch (Exception unused) {
                h.q();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // xsna.j27
        public final String getName() {
            return "purchaseSubs";
        }
    }

    public h(Activity activity, o27 o27Var, com.vk.billing.d dVar, D d2, StorePurchasesManager.a<D> aVar) {
        this.b = o27Var;
        this.c = dVar;
        this.d = d2;
        this.e = aVar;
        this.f = new WeakReference<>(activity);
    }

    public static void q() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error starting inapp #purchaseInapp"});
        }
        cvk.u(R.string.error_purchasing, false);
    }

    public static void r(AtomicInteger atomicInteger, Runnable runnable) {
        int decrementAndGet = atomicInteger.decrementAndGet();
        if (decrementAndGet == 0 && runnable != null) {
            runnable.run();
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"Billing : PurchasesManager", "tryDisconnect: disconnected"});
            return;
        }
        if (decrementAndGet < 0) {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.w, new Object[]{"Billing : PurchasesManager", lhg.a(decrementAndGet, "tryDisconnect: activeConnections = ")});
            return;
        }
        if (decrementAndGet > 0) {
            L l3 = L.a;
            l3.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l3, L.LogType.i, new Object[]{"Billing : PurchasesManager", lhg.a(decrementAndGet, "tryDisconnect: activeConnections = ")});
        }
    }

    public final void a(boolean z, ner0 ner0Var, Throwable th) {
        StorePurchasesManager.a<D> aVar;
        if (z) {
            if (th instanceof VKApiExecutionException) {
                j03.i(this.f.get(), (VKApiExecutionException) th);
            } else {
                cvk.u(R.string.error_purchasing, false);
            }
            z1u0.a(ner0Var);
        }
        this.h = 0;
        this.g.c();
        D d2 = this.d;
        if (d2 == null || (aVar = this.e) == null) {
            return;
        }
        aVar.d(d2);
    }

    @Override // com.vk.billing.a.InterfaceC0423a
    public final void b() {
        cvk.u(R.string.error, false);
        StorePurchasesManager.a<D> aVar = this.e;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.vk.billing.a.InterfaceC0423a
    public final void c(int i) {
        if (i == 6) {
            cvk.u(R.string.error, false);
        }
    }

    @Override // com.vk.billing.a.InterfaceC0423a
    public final void d(Purchase purchase) {
        D d2 = this.d;
        PaymentType u3 = d2.u3();
        int i = u3 == null ? -1 : a.$EnumSwitchMapping$0[u3.ordinal()];
        if (i == 1) {
            if (purchase == null && (purchase = this.j) == null) {
                return;
            }
            m(true, purchase);
            return;
        }
        if (i == 2) {
            l(true);
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.e, new Object[]{"Billing : PurchasesManager", "onItemAlreadyOwned shouldn't be called in regards to item with payment type " + d2.u3()});
    }

    @Override // com.vk.billing.a.InterfaceC0423a
    public final void e(Purchase purchase) {
        this.b.g(new c(this, purchase));
    }

    @Override // com.vk.billing.a.InterfaceC0423a
    public final void f() {
        StorePurchasesManager.a<D> aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
        this.b.g(new b(this));
    }

    @Override // xsna.qge0
    public final void g() {
        this.k = true;
    }

    @SuppressLint({"CheckResult"})
    public final void h(AtomicInteger atomicInteger, final int i, final Purchase purchase, String str, ner0 ner0Var, boolean z) {
        String str2 = (String) j5g.a0(purchase.getProducts());
        if (str2 == null) {
            str2 = "";
        }
        final String str3 = str2;
        L.n("Billing : PurchasesManager", new gzs() { // from class: xsna.sge0
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder b2 = ji.b(i, "consumePurchase: id: ", ", orderId: ");
                b2.append(purchase.getOrderId());
                b2.append(", productId: ");
                b2.append(str3);
                b2.append(", consumeRetriesCount: ");
                b2.append(this.h);
                return b2.toString();
            }
        });
        atomicInteger.incrementAndGet();
        this.h++;
        wil0 wil0Var = new wil0(str3, purchase.getOrderId(), purchase.getPurchaseToken(), this.d.getType(), i, str, null);
        wil0Var.p = this.k;
        new a0(rsg0.T(wil0Var).A(this.g.g, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new vdq(this, atomicInteger)).subscribe(new m330(new tge0(this, atomicInteger, i, purchase, str, ner0Var, z), 16), new gl30(new ii3(this, z, ner0Var), 17));
    }

    @Override // xsna.qge0
    public final void i(int i, int i2) {
        if (i != 1002 || i2 != -1) {
            this.b.getClass();
            L.G("Currently employed billing doesn't rely on activity results");
            return;
        }
        Activity activity = this.f.get();
        if (activity != null) {
            this.c.k(activity, this.d, this.e, null, null);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void j(AtomicInteger atomicInteger, int i, Purchase purchase, ner0 ner0Var, boolean z) {
        uc00 uc00Var = uc00.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        f0 q = new v(new ivz(context, 1)).q(io.reactivex.rxjava3.schedulers.a.b());
        vge0 vge0Var = new vge0(this, atomicInteger, i, purchase, ner0Var, z);
        int i2 = 19;
        q.subscribe(new jsv(vge0Var, i2), new n3t(new itb0(z, ner0Var), i2));
    }

    public final void k(j9k j9kVar) {
        by5 by5Var = new by5(23, j9kVar, this);
        this.b.getClass();
        o27.c("subs", by5Var);
    }

    public final void l(boolean z) {
        ner0 ner0Var;
        Activity activity = this.f.get();
        if (activity != null) {
            ner0Var = new ner0(activity);
            if (z) {
                ner0Var.setMessage(activity.getString(R.string.loading));
                ner0Var.setCancelable(false);
                ner0Var.show();
            }
        } else {
            ner0Var = null;
        }
        this.b.g(new d(this, z, ner0Var));
    }

    public final void m(boolean z, Purchase purchase) {
        ner0 ner0Var;
        Activity activity = this.f.get();
        if (activity != null) {
            ner0Var = new ner0(activity);
            if (z) {
                ner0Var.setMessage(activity.getString(R.string.loading));
                ner0Var.setCancelable(false);
                ner0Var.show();
            }
        } else {
            ner0Var = null;
        }
        ner0 ner0Var2 = ner0Var;
        try {
            this.i = "subs";
            j(new AtomicInteger(0), GoogleStorePurchasesManagerImpl.a.a(purchase), purchase, ner0Var2, true);
        } catch (Exception unused) {
            if (z) {
                cvk.u(R.string.error_purchasing, false);
                z1u0.a(ner0Var2);
            }
        }
    }

    public final void n() {
        o27 o27Var = this.b;
        o27Var.getClass();
        o27Var.b = new WeakReference<>(this);
        o27Var.g(new e(this));
    }

    public final void o(int i) {
        o27 o27Var = this.b;
        o27Var.getClass();
        o27Var.b = new WeakReference<>(this);
        o27Var.g(new i(this, i));
    }

    public final void p(boolean z) {
        o27 o27Var = this.b;
        o27Var.getClass();
        o27Var.b = new WeakReference<>(this);
        o27Var.g(new f(this, z));
    }

    /* compiled from: PurchasesManagerSessionImpl.kt */
    public static final class b implements j27 {
        public final /* synthetic */ h<D> a;

        public b(h<D> hVar) {
            this.a = hVar;
        }

        @Override // xsna.j27
        public final void b() {
            this.a.l(true);
        }

        @Override // xsna.j27
        public final String getName() {
            return "onBillingCancelled";
        }

        @Override // xsna.j27
        public final void a() {
        }
    }
}
