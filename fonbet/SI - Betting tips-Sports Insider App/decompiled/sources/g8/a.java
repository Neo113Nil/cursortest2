package g8;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.ProgressBar;
import androidx.appcompat.app.v0;
import b6.m;
import b6.n;
import b6.o;
import c6.c;
import c6.g;
import com.android.billingclient.api.e;
import com.android.billingclient.api.r;
import com.android.billingclient.api.t;
import com.android.billingclient.api.t0;
import com.android.billingclient.api.x;
import com.android.billingclient.api.x0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.play_billing.d0;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.signin.internal.zak;
import com.google.firebase.messaging.z;
import e3.f;
import e6.f0;
import e6.i;
import e6.j;
import e6.p;
import eg.c0;
import eg.l;
import eg.w;
import eg.y0;
import g6.i0;
import g6.k;
import g6.v;
import gf.q;
import i2.d;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import k2.a0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m7.h;
import s7.e2;
import s7.f1;
import s7.m1;
import s7.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9885a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9886b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9887c;

    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        this.f9885a = i5;
        this.f9886b = obj;
        this.f9887c = obj2;
    }

    private final void a() {
        m mVar = (m) this.f9886b;
        int i5 = ((n) this.f9887c).f3071a;
        synchronized (mVar) {
            n nVar = (n) mVar.f3069e.get(i5);
            if (nVar != null) {
                w0.m("MessengerIpcClient", "Timing out request: " + i5);
                mVar.f3069e.remove(i5);
                nVar.b(new o("Timed out waiting for response", null));
                mVar.c();
            }
        }
    }

    private final void b() {
        i iVar;
        j jVar = (j) this.f9886b;
        d dVar = (d) this.f9887c;
        i iVar2 = (i) jVar.f8719b;
        if (iVar2 == null) {
            return;
        }
        Object obj = iVar2.f8714a;
        switch (dVar.f10881a) {
            case 19:
                ((p7.b) obj).onLocationResult((LocationResult) dVar.f10882b);
                return;
            case 20:
                ((p7.b) obj).onLocationAvailability((LocationAvailability) dVar.f10882b);
                return;
            default:
                g4 g4Var = ((h) dVar.f10882b).f20459f;
                synchronized (g4Var) {
                    g4Var.f5057a = false;
                    iVar = (i) ((j) g4Var.f5058b).f8719b;
                }
                if (iVar != null) {
                    ((m7.a) g4Var.f5059c).b(iVar, 2441);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [e6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [e6.h, java.lang.Object] */
    private final void c() {
        e6.n nVar = (e6.n) this.f9887c;
        if (nVar.f8728b) {
            f0 f0Var = (f0) this.f9886b;
            ConnectionResult connectionResult = f0Var.f8709b;
            int i5 = connectionResult.f4441b;
            c cVar = nVar.f8731e;
            cVar.getClass();
            if (i5 != 9) {
                switch (i5) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        switch (i5) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                break;
                            default:
                                w0.m("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(connectionResult)));
                                nVar.d(connectionResult, f0Var.f8708a);
                                return;
                        }
                }
            }
            if (connectionResult.f4441b != 0 && connectionResult.f4442c != null) {
                ?? r32 = nVar.f8727a;
                Activity a7 = nVar.a();
                PendingIntent pendingIntent = connectionResult.f4442c;
                v.h(pendingIntent);
                int i10 = f0Var.f8708a;
                int i11 = GoogleApiActivity.f4457b;
                Intent intent = new Intent(a7, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                r32.startActivityForResult(intent, 1);
                return;
            }
            if (cVar.a(nVar.a(), connectionResult.f4441b, null) != null) {
                cVar.e(nVar.a(), nVar.f8727a, connectionResult.f4441b, nVar);
                cVar.g(nVar.a().getApplicationContext(), connectionResult, true);
                return;
            }
            if (connectionResult.f4441b != 18) {
                nVar.d(connectionResult, f0Var.f8708a);
                return;
            }
            Activity a10 = nVar.a();
            ProgressBar progressBar = new ProgressBar(a10, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(a10);
            builder.setView(progressBar);
            builder.setMessage(k.b(a10, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            c.h(a10, create, "GooglePlayServicesUpdatingDialog", nVar);
            Context applicationContext = nVar.a().getApplicationContext();
            l1.a aVar = new l1.a(12, this, create);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            z zVar = new z(aVar);
            d0.c.d(applicationContext, zVar, intentFilter);
            zVar.f6191b = applicationContext;
            if (!g.b(applicationContext)) {
                e6.n nVar2 = (e6.n) this.f9887c;
                nVar2.f8729c.set(null);
                h0 h0Var = nVar2.f8733g.f8705n;
                h0Var.sendMessage(h0Var.obtainMessage(3));
                if (create.isShowing()) {
                    create.dismiss();
                }
                synchronized (zVar) {
                    try {
                        Context context = zVar.f6191b;
                        if (context != null) {
                            context.unregisterReceiver(zVar);
                        }
                        zVar.f6191b = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cVar.g(nVar.a().getApplicationContext(), connectionResult, true);
        }
    }

    private final void d() {
        int i5 = 0;
        while (true) {
            try {
                ((Runnable) this.f9886b).run();
            } catch (Throwable th2) {
                c0.q(th2, kotlin.coroutines.g.f19227a);
            }
            Runnable i02 = ((jg.i) this.f9887c).i0();
            if (i02 == null) {
                return;
            }
            try {
                this.f9886b = i02;
                i5++;
                if (i5 >= 16) {
                    jg.i iVar = (jg.i) this.f9887c;
                    if (jg.h.h(iVar.f18506d, iVar)) {
                        jg.i iVar2 = (jg.i) this.f9887c;
                        jg.h.g(iVar2.f18506d, iVar2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                jg.i iVar3 = (jg.i) this.f9887c;
                synchronized (iVar3.f18509g) {
                    jg.i.f18504h.decrementAndGet(iVar3);
                    throw th3;
                }
            }
        }
    }

    private final void e() {
        m3.o c2 = ((l3.b) this.f9887c).f19340a.f9431f.c((String) this.f9886b);
        if (c2 == null || Intrinsics.areEqual(f.j, c2.j)) {
            return;
        }
        synchronized (((l3.b) this.f9887c).f19342c) {
            ((l3.b) this.f9887c).f19345f.put(m4.g.j(c2), c2);
            l3.b bVar = (l3.b) this.f9887c;
            ((l3.b) this.f9887c).f19346g.put(m4.g.j(c2), i3.k.a(bVar.f19347h, c2, (w) bVar.f19341b.f6183b, bVar));
        }
    }

    private final void f() {
        try {
            ((Runnable) this.f9887c).run();
            synchronized (((a0) this.f9886b).f18629e) {
                ((a0) this.f9886b).c();
            }
        } catch (Throwable th2) {
            synchronized (((a0) this.f9886b).f18629e) {
                ((a0) this.f9886b).c();
                throw th2;
            }
        }
    }

    private final void g() {
        try {
            h();
        } catch (Error e7) {
            synchronized (((p8.j) this.f9887c).f21557b) {
                ((p8.j) this.f9887c).f21558c = 1;
                throw e7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f9886b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f9886b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        p8.j.f21555f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f9886b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h() {
        boolean z5 = false;
        boolean z7 = false;
        while (true) {
            try {
                synchronized (((p8.j) this.f9887c).f21557b) {
                    if (!z5) {
                        p8.j jVar = (p8.j) this.f9887c;
                        if (jVar.f21558c != 4) {
                            jVar.f21559d++;
                            jVar.f21558c = 4;
                            z5 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((p8.j) this.f9887c).f21557b.poll();
                    this.f9886b = runnable;
                    if (runnable == null) {
                        ((p8.j) this.f9887c).f21558c = 1;
                    }
                }
                if (!z7) {
                    return;
                }
            } finally {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        g6.g gVar;
        g6.g i0Var;
        switch (this.f9885a) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f9887c;
                try {
                    com.google.android.play.core.appupdate.b.r((b) this.f9886b);
                    e2 e2Var = (e2) cVar.f16518c;
                    e2Var.j();
                    cVar.s();
                    e2Var.f22702i = false;
                    e2Var.j = 1;
                    n0 n0Var = ((f1) e2Var.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22909m.b(((zzoh) cVar.f16517b).f5801a, "Successfully registered trigger URI");
                    e2Var.I();
                    return;
                } catch (Error e7) {
                    e = e7;
                    cVar.o(e);
                    return;
                } catch (RuntimeException e9) {
                    e = e9;
                    cVar.o(e);
                    return;
                } catch (ExecutionException e10) {
                    cVar.o(e10.getCause());
                    return;
                }
            case 1:
                m mVar = (m) this.f9886b;
                IBinder iBinder = (IBinder) this.f9887c;
                synchronized (mVar) {
                    if (iBinder == null) {
                        mVar.a("Null service connection");
                    } else {
                        try {
                            mVar.f3067c = new l1.a(iBinder);
                            mVar.f3065a = 2;
                            ((ScheduledExecutorService) mVar.f3070f.f3080c).execute(new b6.k(mVar, r6));
                        } catch (RemoteException e11) {
                            mVar.a(e11.getMessage());
                        }
                    }
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((c0.b) this.f9886b).f3231a = this.f9887c;
                return;
            case 4:
                ((Application) this.f9886b).unregisterActivityLifecycleCallbacks((c0.b) this.f9887c);
                return;
            case 5:
                Object obj = this.f9887c;
                Object obj2 = this.f9886b;
                try {
                    Method method = c0.c.f3240d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        c0.c.f3241e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th2) {
                    w0.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 6:
                com.android.billingclient.api.d dVar = (com.android.billingclient.api.d) this.f9886b;
                e eVar = (e) this.f9887c;
                dVar.getClass();
                com.android.billingclient.api.k kVar = t0.f4091m;
                dVar.I(24, 8, kVar);
                eVar.e(kVar, null);
                return;
            case 7:
                com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) this.f9886b;
                com.android.billingclient.api.v vVar = (com.android.billingclient.api.v) this.f9887c;
                com.android.billingclient.api.k kVar2 = t0.f4091m;
                dVar2.I(24, 9, kVar2);
                com.google.android.gms.internal.play_billing.a0 a0Var = d0.f5420b;
                vVar.onQueryPurchasesResponse(kVar2, s0.f5567e);
                return;
            case 8:
                Future future = (Future) this.f9886b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f9887c;
                future.cancel(true);
                p1.g("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                com.android.billingclient.api.d dVar3 = (com.android.billingclient.api.d) this.f9886b;
                t tVar = (t) this.f9887c;
                dVar3.getClass();
                com.android.billingclient.api.k kVar3 = t0.f4091m;
                dVar3.I(24, 11, kVar3);
                tVar.onPurchaseHistoryResponse(kVar3, null);
                return;
            case 10:
                com.android.billingclient.api.d dVar4 = (com.android.billingclient.api.d) this.f9886b;
                r rVar = (r) this.f9887c;
                dVar4.getClass();
                com.android.billingclient.api.k kVar4 = t0.f4091m;
                dVar4.I(24, 7, kVar4);
                rVar.onProductDetailsResponse(kVar4, new ArrayList());
                return;
            case 11:
                com.android.billingclient.api.d dVar5 = (com.android.billingclient.api.d) this.f9886b;
                com.android.billingclient.api.k kVar5 = (com.android.billingclient.api.k) this.f9887c;
                if (((x) dVar5.f3985e.f4117c) != null) {
                    ((x) dVar5.f3985e.f4117c).onPurchasesUpdated(kVar5, null);
                    return;
                } else {
                    p1.g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 12:
                com.android.billingclient.api.d dVar6 = (com.android.billingclient.api.d) this.f9886b;
                e eVar2 = (e) this.f9887c;
                com.android.billingclient.api.k kVar6 = t0.f4091m;
                dVar6.I(24, 3, kVar6);
                eVar2.a(kVar6);
                return;
            case 13:
                com.android.billingclient.api.d dVar7 = (com.android.billingclient.api.d) this.f9886b;
                cc.b bVar = (cc.b) this.f9887c;
                com.android.billingclient.api.k kVar7 = t0.f4091m;
                dVar7.I(24, 13, kVar7);
                bVar.a(kVar7);
                return;
            case 14:
                d7.e eVar3 = (d7.e) this.f9886b;
                w7.g gVar2 = (w7.g) this.f9887c;
                Context context = (Context) eVar3.f8268b;
                String string = d7.e.g(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j = d7.e.g(context).getLong("app_set_id_last_used_time", -1L);
                long j6 = j != -1 ? 33696000000L + j : -1L;
                if (string == null || System.currentTimeMillis() > j6) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            w0.d("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new d7.d("Failed to store the app set ID.");
                        }
                        d7.e.j(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            w0.d("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new d7.d("Failed to store the app set ID creation time.");
                        }
                    } catch (d7.d e13) {
                        gVar2.a(e13);
                        return;
                    }
                } else {
                    try {
                        d7.e.j(context);
                    } catch (d7.d e14) {
                        gVar2.a(e14);
                        return;
                    }
                }
                gVar2.b(new q5.a(string, 1));
                return;
            case 15:
                ConnectionResult connectionResult = (ConnectionResult) this.f9886b;
                x0 x0Var = (x0) this.f9887c;
                e6.e eVar4 = (e6.e) x0Var.f4120f;
                d6.c cVar2 = (d6.c) x0Var.f4116b;
                p pVar = (p) eVar4.j.get((e6.a) x0Var.f4117c);
                if (pVar == null) {
                    return;
                }
                if (connectionResult.f4441b != 0) {
                    pVar.n(connectionResult, null);
                    return;
                }
                x0Var.f4115a = true;
                if (cVar2.b()) {
                    if (!x0Var.f4115a || (gVar = (g6.g) x0Var.f4118d) == null) {
                        return;
                    }
                    ((g6.e) cVar2).k(gVar, (Set) x0Var.f4119e);
                    return;
                }
                try {
                    g6.f fVar = (g6.f) cVar2;
                    ((g6.e) cVar2).k(null, fVar.b() ? fVar.f9833z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e15) {
                    w0.e("GoogleApiManager", "Failed to get service from broker. ", e15);
                    ((g6.e) cVar2).f("Failed to get service from broker.");
                    pVar.n(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 16:
                b();
                return;
            case 17:
                e6.a0 a0Var2 = (e6.a0) this.f9887c;
                zak zakVar = (zak) this.f9886b;
                a0Var2.getClass();
                ConnectionResult connectionResult2 = zakVar.f5852b;
                if (connectionResult2.f4441b == 0) {
                    zaaa zaaaVar = zakVar.f5853c;
                    v.h(zaaaVar);
                    ConnectionResult connectionResult3 = zaaaVar.f4536c;
                    if (connectionResult3.f4441b != 0) {
                        w0.o("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        a0Var2.f8677l.z(connectionResult3);
                        a0Var2.f8676k.e();
                        return;
                    }
                    x0 x0Var2 = a0Var2.f8677l;
                    IBinder iBinder2 = zaaaVar.f4535b;
                    if (iBinder2 == null) {
                        i0Var = null;
                    } else {
                        int i5 = g6.a.f9794f;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        i0Var = queryLocalInterface instanceof g6.g ? (g6.g) queryLocalInterface : new i0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 4);
                    }
                    Set set = a0Var2.f8675i;
                    x0Var2.getClass();
                    if (i0Var == null || set == null) {
                        w0.o("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        x0Var2.z(new ConnectionResult(4, null, null));
                    } else {
                        x0Var2.f4118d = i0Var;
                        x0Var2.f4119e = set;
                        if (x0Var2.f4115a) {
                            ((g6.e) ((d6.c) x0Var2.f4116b)).k(i0Var, set);
                        }
                    }
                } else {
                    a0Var2.f8677l.z(connectionResult2);
                }
                a0Var2.f8676k.e();
                return;
            case 18:
                c();
                return;
            case 19:
                e6.n nVar = (e6.n) this.f9886b;
                androidx.transition.n0 n0Var2 = (androidx.transition.n0) this.f9887c;
                if (n0Var2.f2733b > 0) {
                    Bundle bundle = (Bundle) n0Var2.f2735d;
                    nVar.b(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (n0Var2.f2733b >= 2) {
                    nVar.f8728b = true;
                    nVar.e();
                }
                if (n0Var2.f2733b >= 3) {
                    nVar.e();
                }
                if (n0Var2.f2733b >= 4) {
                    nVar.c();
                    return;
                }
                return;
            case 20:
                ((l) this.f9887c).C((y0) this.f9886b, Unit.f19194a);
                return;
            case 21:
                e3.x e16 = e3.x.e();
                String str = g3.a.f9713e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                m3.o oVar = (m3.o) this.f9886b;
                sb2.append(oVar.f20331a);
                e16.a(str, sb2.toString());
                ((g3.a) this.f9887c).f9714a.e(oVar);
                return;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                d();
                return;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                e();
                return;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                h9.c cVar3 = (h9.c) this.f9886b;
                Typeface typeface = (Typeface) this.f9887c;
                f0.j jVar = (f0.j) cVar3.f10430b;
                if (jVar != null) {
                    jVar.onFontRetrieved(typeface);
                    return;
                }
                return;
            case C0122e9.F /* 25 */:
                ((m0.f) this.f9886b).accept(this.f9887c);
                return;
            case C0122e9.G /* 26 */:
                f();
                return;
            case C0122e9.H /* 27 */:
                Continuation b10 = lf.d.b((oi.x) this.f9886b);
                gf.o oVar2 = q.f10031a;
                b10.resumeWith(h8.b.h((Throwable) this.f9887c));
                return;
            case 28:
                g();
                return;
            default:
                m1 m1Var = (m1) this.f9886b;
                m1Var.c();
                if (md.o.f()) {
                    m1Var.b().s(this);
                    return;
                }
                s7.k kVar8 = (s7.k) this.f9887c;
                r6 = kVar8.f22840c != 0 ? 1 : 0;
                kVar8.f22840c = 0L;
                if (r6 != 0) {
                    kVar8.a();
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f9885a) {
            case 0:
                v0 v0Var = new v0(a.class.getSimpleName(), 11);
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f9887c;
                l1.a aVar = new l1.a(13, false);
                ((l1.a) v0Var.f366d).f19315c = aVar;
                v0Var.f366d = aVar;
                aVar.f19314b = cVar;
                return v0Var.toString();
            case 28:
                Runnable runnable = (Runnable) this.f9886b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i5 = ((p8.j) this.f9887c).f21558c;
                sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i5, Object obj, Object obj2, boolean z5) {
        this.f9885a = i5;
        this.f9886b = obj2;
        this.f9887c = obj;
    }

    public a(e6.n nVar, f0 f0Var) {
        this.f9885a = 18;
        Objects.requireNonNull(nVar);
        this.f9887c = nVar;
        this.f9886b = f0Var;
    }

    public a(p8.j jVar) {
        this.f9885a = 28;
        this.f9887c = jVar;
    }
}
