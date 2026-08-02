package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.zzcu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class Z5 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public final T5 f33782c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3241e2 f33783d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f33784e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3381w f33785f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f33786g;

    /* renamed from: h, reason: collision with root package name */
    public final C3380v6 f33787h;

    /* renamed from: i, reason: collision with root package name */
    public final List f33788i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC3381w f33789j;

    public Z5(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33788i = new ArrayList();
        this.f33787h = new C3380v6(c3298l3.e());
        this.f33782c = new T5(this);
        this.f33785f = new C3411z5(this, c3298l3);
        this.f33789j = new D5(this, c3298l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f33787h.a();
        this.f33578a.w();
        this.f33785f.b(((Long) AbstractC3209a2.f33850Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        T5 t52 = this.f33782c;
        t52.b();
        try {
            J9.b.b().c(this.f33578a.d(), t52);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f33783d = null;
    }

    public final void B(zzcu zzcuVar, zzbg zzbgVar, String str) {
        h();
        j();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.C().X(AbstractC3175h.f32612a) == 0) {
            T(new C5(this, zzbgVar, str, zzcuVar));
        } else {
            c3298l3.a().r().a("Not bundling data. Service unavailable or out of date");
            c3298l3.C().d0(zzcuVar, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.f33578a.C().W() >= ((Integer) AbstractC3209a2.f33821K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.f33578a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        InterfaceC3241e2 interfaceC3241e2 = this.f33783d;
        if (interfaceC3241e2 == null) {
            this.f33578a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr V10 = V(false);
            AbstractC3191o.m(V10);
            interfaceC3241e2.z(V10);
            J();
        } catch (RemoteException e10) {
            this.f33578a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void F() {
        InterfaceC3241e2 interfaceC3241e2 = this.f33783d;
        if (interfaceC3241e2 == null) {
            this.f33578a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr V10 = V(false);
            AbstractC3191o.m(V10);
            interfaceC3241e2.H(V10);
            J();
        } catch (RemoteException e10) {
            this.f33578a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        InterfaceC3241e2 interfaceC3241e2;
        synchronized (atomicReference) {
            try {
                interfaceC3241e2 = this.f33783d;
            } catch (RemoteException e10) {
                this.f33578a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC3241e2 == null) {
                this.f33578a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC3191o.m(zzrVar);
            interfaceC3241e2.h0(zzrVar, bundle, new BinderC3347r5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        InterfaceC3241e2 interfaceC3241e2;
        synchronized (atomicReference) {
            try {
                interfaceC3241e2 = this.f33783d;
            } catch (RemoteException e10) {
                this.f33578a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC3241e2 == null) {
                this.f33578a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC3191o.m(zzrVar);
            interfaceC3241e2.d(zzrVar, zzooVar, new BinderC3355s5(this, atomicReference));
            J();
        }
    }

    public final /* synthetic */ void I(zzr zzrVar, zzaf zzafVar) {
        InterfaceC3241e2 interfaceC3241e2 = this.f33783d;
        if (interfaceC3241e2 == null) {
            this.f33578a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC3241e2.l0(zzrVar, zzafVar);
            J();
        } catch (RemoteException e10) {
            this.f33578a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.f34419a), e10);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f33783d != null) {
            this.f33783d = null;
            this.f33578a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ T5 M() {
        return this.f33782c;
    }

    public final /* synthetic */ InterfaceC3241e2 N() {
        return this.f33783d;
    }

    public final /* synthetic */ void O(InterfaceC3241e2 interfaceC3241e2) {
        this.f33783d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.f33786g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f33786g = scheduledExecutorService;
    }

    public final boolean R() {
        this.f33578a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f33788i;
        long size = list.size();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.w();
        if (size >= 1000) {
            c3298l3.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f33789j.b(60000L);
        w();
    }

    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        C3376v2 w10 = this.f33578a.a().w();
        List list = this.f33788i;
        w10.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f33578a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f33788i.clear();
        this.f33789j.d();
    }

    public final zzr V(boolean z10) {
        Pair b10;
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.c();
        C3297l2 L10 = this.f33578a.L();
        String str = null;
        if (z10) {
            C3298l3 c3298l32 = c3298l3.a().f33578a;
            if (c3298l32.x().f33515e != null && (b10 = c3298l32.x().f33515e.b()) != null && b10 != L2.f33512A) {
                String valueOf = String.valueOf(b10.second);
                String str2 = (String) b10.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return L10.o(str);
    }

    public final boolean W() {
        h();
        j();
        return this.f33783d != null;
    }

    public final void X() {
        h();
        j();
        T(new E5(this, V(true)));
    }

    public final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new F5(this, V(false)));
        }
    }

    public final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.Y5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Z5.this.E();
            }
        });
    }

    public final void a0() {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.U5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Z5.this.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(InterfaceC3241e2 interfaceC3241e2, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        C3298l3 c3298l3;
        int i10;
        zzr zzrVar2;
        String str;
        long j10;
        long j11;
        AbstractSafeParcelable abstractSafeParcelable2 = abstractSafeParcelable;
        h();
        j();
        R();
        C3298l3 c3298l32 = this.f33578a;
        c3298l32.w();
        zzr zzrVar3 = zzrVar;
        int i11 = 100;
        int i12 = 0;
        for (int i13 = 100; i12 < 1001 && i11 == i13; i13 = 100) {
            C3298l3 c3298l33 = this.f33578a;
            ArrayList arrayList = new ArrayList();
            List t10 = c3298l33.E().t(i13);
            if (t10 != null) {
                arrayList.addAll(t10);
                i11 = t10.size();
            } else {
                i11 = 0;
            }
            if (abstractSafeParcelable2 != null && i11 < i13) {
                arrayList.add(new C3313n2(abstractSafeParcelable2, zzrVar3.f34464c, zzrVar3.f34471j));
            }
            String str2 = null;
            boolean H10 = c3298l32.w().H(null, AbstractC3209a2.f33831P0);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                C3313n2 c3313n2 = (C3313n2) arrayList.get(i14);
                AbstractSafeParcelable abstractSafeParcelable3 = c3313n2.f34171a;
                C3286k w10 = c3298l32.w();
                Z1 z12 = AbstractC3209a2.f33860c1;
                if (w10.H(str2, z12)) {
                    String str3 = c3313n2.f34172b;
                    if (!TextUtils.isEmpty(str3)) {
                        i10 = i14;
                        c3298l3 = c3298l32;
                        zzrVar2 = new zzr(zzrVar3.f34462a, zzrVar3.f34463b, str3, c3313n2.f34173c, zzrVar3.f34465d, zzrVar3.f34466e, zzrVar3.f34467f, zzrVar3.f34468g, zzrVar3.f34469h, zzrVar3.f34470i, zzrVar3.f34472k, zzrVar3.f34473l, zzrVar3.f34474m, zzrVar3.f34475n, zzrVar3.f34476o, zzrVar3.f34477p, zzrVar3.f34478q, zzrVar3.f34479r, zzrVar3.f34480s, zzrVar3.f34481t, zzrVar3.f34482u, zzrVar3.f34483v, zzrVar3.f34484w, zzrVar3.f34485x, zzrVar3.f34486y, zzrVar3.f34487z, zzrVar3.f34457A, zzrVar3.f34458B, zzrVar3.f34459C, zzrVar3.f34460D, zzrVar3.f34461E);
                        if (!(abstractSafeParcelable3 instanceof zzbg)) {
                            if (H10) {
                                try {
                                    C3298l3 c3298l34 = this.f33578a;
                                    long a10 = c3298l34.e().a();
                                    try {
                                        j11 = a10;
                                        j10 = c3298l34.e().b();
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        j11 = a10;
                                        j10 = 0;
                                        this.f33578a.a().o().b("Failed to send event to the service", e);
                                        if (H10 && j11 != 0) {
                                            C3298l3 c3298l35 = this.f33578a;
                                            C3360t2.a(c3298l35).b(36301, 13, j11, c3298l35.e().a(), (int) (c3298l35.e().b() - j10));
                                        }
                                        str = null;
                                        i14 = i10 + 1;
                                        zzrVar3 = zzrVar2;
                                        str2 = str;
                                        c3298l32 = c3298l3;
                                    }
                                } catch (RemoteException e11) {
                                    e = e11;
                                    j10 = 0;
                                    j11 = 0;
                                }
                            } else {
                                j10 = 0;
                                j11 = 0;
                            }
                            try {
                                interfaceC3241e2.E((zzbg) abstractSafeParcelable3, zzrVar2);
                                if (H10) {
                                    c3298l3.a().w().a("Logging telemetry for logEvent from database");
                                    C3298l3 c3298l36 = this.f33578a;
                                    C3360t2.a(c3298l36).b(36301, 0, j11, c3298l36.e().a(), (int) (c3298l36.e().b() - j10));
                                }
                            } catch (RemoteException e12) {
                                e = e12;
                                this.f33578a.a().o().b("Failed to send event to the service", e);
                                if (H10) {
                                    C3298l3 c3298l352 = this.f33578a;
                                    C3360t2.a(c3298l352).b(36301, 13, j11, c3298l352.e().a(), (int) (c3298l352.e().b() - j10));
                                }
                                str = null;
                                i14 = i10 + 1;
                                zzrVar3 = zzrVar2;
                                str2 = str;
                                c3298l32 = c3298l3;
                            }
                        } else if (abstractSafeParcelable3 instanceof zzpl) {
                            try {
                                interfaceC3241e2.M((zzpl) abstractSafeParcelable3, zzrVar2);
                            } catch (RemoteException e13) {
                                this.f33578a.a().o().b("Failed to send user property to the service", e13);
                            }
                        } else if (abstractSafeParcelable3 instanceof zzah) {
                            try {
                                interfaceC3241e2.k((zzah) abstractSafeParcelable3, zzrVar2);
                            } catch (RemoteException e14) {
                                this.f33578a.a().o().b("Failed to send conditional user property to the service", e14);
                            }
                        } else {
                            C3298l3 c3298l37 = this.f33578a;
                            str = null;
                            if (c3298l37.w().H(null, z12) && (abstractSafeParcelable3 instanceof zzbe)) {
                                try {
                                    interfaceC3241e2.r0(((zzbe) abstractSafeParcelable3).l(), zzrVar2);
                                } catch (RemoteException e15) {
                                    this.f33578a.a().o().b("Failed to send default event parameters to the service", e15);
                                }
                            } else {
                                c3298l37.a().o().a("Discarding data. Unrecognized parcel type.");
                            }
                            i14 = i10 + 1;
                            zzrVar3 = zzrVar2;
                            str2 = str;
                            c3298l32 = c3298l3;
                        }
                        str = null;
                        i14 = i10 + 1;
                        zzrVar3 = zzrVar2;
                        str2 = str;
                        c3298l32 = c3298l3;
                    }
                }
                c3298l3 = c3298l32;
                i10 = i14;
                zzrVar2 = zzrVar3;
                if (!(abstractSafeParcelable3 instanceof zzbg)) {
                }
                str = null;
                i14 = i10 + 1;
                zzrVar3 = zzrVar2;
                str2 = str;
                c3298l32 = c3298l3;
            }
            i12++;
            abstractSafeParcelable2 = abstractSafeParcelable;
        }
    }

    public final void c0(zzbg zzbgVar, String str) {
        AbstractC3191o.m(zzbgVar);
        h();
        j();
        R();
        T(new G5(this, true, V(true), this.f33578a.E().p(zzbgVar), zzbgVar, str));
    }

    public final void d0(zzah zzahVar) {
        AbstractC3191o.m(zzahVar);
        h();
        j();
        this.f33578a.c();
        T(new H5(this, true, V(true), this.f33578a.E().r(zzahVar), new zzah(zzahVar), zzahVar));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new I5(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(zzcu zzcuVar, String str, String str2) {
        h();
        j();
        T(new J5(this, str, str2, V(false), zzcuVar));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new K5(this, atomicReference, null, str2, str3, V(false), z10));
    }

    public final void h0(zzcu zzcuVar, String str, String str2, boolean z10) {
        h();
        j();
        T(new RunnableC3340q5(this, str, str2, V(false), z10, zzcuVar));
    }

    public final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final zzr V10 = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.V5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Z5.this.G(atomicReference, V10, bundle);
            }
        });
    }

    public final void j0(final AtomicReference atomicReference, final zzoo zzooVar) {
        h();
        j();
        final zzr V10 = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.W5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Z5.this.H(atomicReference, V10, zzooVar);
            }
        });
    }

    public final void k0(final zzaf zzafVar) {
        h();
        j();
        final zzr V10 = V(true);
        AbstractC3191o.m(V10);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.X5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Z5.this.I(V10, zzafVar);
            }
        });
    }

    public final zzao l0() {
        h();
        j();
        InterfaceC3241e2 interfaceC3241e2 = this.f33783d;
        if (interfaceC3241e2 == null) {
            w();
            this.f33578a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr V10 = V(false);
        AbstractC3191o.m(V10);
        try {
            zzao o02 = interfaceC3241e2.o0(V10);
            J();
            return o02;
        } catch (RemoteException e10) {
            this.f33578a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return false;
    }

    public final void o(zzpl zzplVar) {
        h();
        j();
        R();
        T(new RunnableC3363t5(this, V(true), this.f33578a.E().q(zzplVar), zzplVar));
    }

    public final void p() {
        h();
        j();
        zzr V10 = V(false);
        R();
        this.f33578a.E().o();
        T(new RunnableC3371u5(this, V10));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new RunnableC3379v5(this, atomicReference, V(false)));
    }

    public final void r(zzcu zzcuVar) {
        h();
        j();
        T(new RunnableC3387w5(this, V(false), zzcuVar));
    }

    public final void s() {
        h();
        j();
        zzr V10 = V(true);
        R();
        this.f33578a.w().H(null, AbstractC3209a2.f33860c1);
        this.f33578a.E().u();
        T(new RunnableC3395x5(this, V10, true));
    }

    public final void t() {
        h();
        j();
        T(new RunnableC3403y5(this, V(true)));
    }

    public final void u(C3268h5 c3268h5) {
        h();
        j();
        T(new A5(this, c3268h5));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        zzbe zzbeVar = new zzbe(bundle);
        R();
        T(new B5(this, true, V(false), this.f33578a.w().H(null, AbstractC3209a2.f33860c1) && this.f33578a.E().s(zzbeVar), zzbeVar, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f33782c.d();
            return;
        }
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.w().m()) {
            return;
        }
        c3298l3.c();
        List<ResolveInfo> queryIntentServices = c3298l3.d().getPackageManager().queryIntentServices(new Intent().setClassName(c3298l3.d(), "com.google.android.gms.measurement.AppMeasurementService"), PKIFailureInfo.notAuthorized);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            c3298l3.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context d10 = c3298l3.d();
        c3298l3.c();
        intent.setComponent(new ComponentName(d10, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f33782c.a(intent);
    }

    public final Boolean x() {
        return this.f33784e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y() {
        h();
        j();
        if (this.f33784e == null) {
            h();
            j();
            C3298l3 c3298l3 = this.f33578a;
            L2 x10 = c3298l3.x();
            x10.h();
            boolean z10 = false;
            Boolean valueOf = !x10.p().contains("use_service") ? null : Boolean.valueOf(x10.p().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                c3298l3.c();
                if (this.f33578a.L().v() != 1) {
                    c3298l3.a().w().a("Checking service availability");
                    int X10 = c3298l3.C().X(AbstractC3175h.f32612a);
                    if (X10 != 0) {
                        if (X10 == 1) {
                            c3298l3.a().w().a("Service missing");
                        } else if (X10 != 2) {
                            if (X10 == 3) {
                                c3298l3.a().r().a("Service disabled");
                            } else if (X10 == 9) {
                                c3298l3.a().r().a("Service invalid");
                            } else if (X10 != 18) {
                                c3298l3.a().r().b("Unexpected service status", Integer.valueOf(X10));
                            } else {
                                c3298l3.a().r().a("Service updating");
                            }
                            r2 = false;
                        } else {
                            c3298l3.a().v().a("Service container out of date");
                            if (c3298l3.C().W() >= 17443) {
                                z10 = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z10 && c3298l3.w().m()) {
                            c3298l3.a().o().a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            L2 x11 = c3298l3.x();
                            x11.h();
                            SharedPreferences.Editor edit = x11.p().edit();
                            edit.putBoolean("use_service", z10);
                            edit.apply();
                        }
                        r2 = z10;
                    } else {
                        c3298l3.a().w().a("Service available");
                    }
                }
                z10 = true;
                if (z10) {
                }
                if (r2) {
                }
                r2 = z10;
            }
            this.f33784e = Boolean.valueOf(r2);
        }
        return this.f33784e.booleanValue();
    }

    public final void z(InterfaceC3241e2 interfaceC3241e2) {
        h();
        AbstractC3191o.m(interfaceC3241e2);
        this.f33783d = interfaceC3241e2;
        J();
        L();
    }
}
