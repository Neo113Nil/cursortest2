package com.android.billingclient.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.l5;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.concurrent.Callable;
import s7.k1;
import s7.r3;
import s7.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4016b;

    public /* synthetic */ f0(int i5, Object obj) {
        this.f4015a = i5;
        this.f4016b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028e  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        String str;
        int i5;
        int i10;
        String str2;
        boolean z5;
        int i11;
        com.google.android.gms.internal.play_billing.d dVar;
        switch (this.f4015a) {
            case 0:
                g0 g0Var = (g0) this.f4016b;
                synchronized (g0Var.f4021b.f3981a) {
                    try {
                        if (g0Var.f4021b.f3982b != 3) {
                            int i12 = g0Var.f4021b.f3982b;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                d dVar2 = g0Var.f4021b;
                                p1.b(bundle, dVar2.f3983c, dVar2.F.longValue());
                            }
                            try {
                                synchronized (g0Var.f4021b.f3981a) {
                                    try {
                                        try {
                                            dVar = g0Var.f4021b.f3988h;
                                        } catch (Exception e7) {
                                            e = e7;
                                            boolean z7 = i12 != 1;
                                            p1.h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            if (e instanceof DeadObjectException) {
                                                i10 = 101;
                                            } else if (e instanceof RemoteException) {
                                                i10 = 100;
                                            } else if (e instanceof SecurityException) {
                                                i10 = 102;
                                            } else {
                                                i5 = 42;
                                                String a7 = i5 != 42 ? r0.a(e) : str;
                                                g0Var.f4021b.t(0);
                                                boolean z10 = z7;
                                                str2 = a7;
                                                z5 = z10;
                                                i11 = 6;
                                                if (i11 == 0) {
                                                }
                                            }
                                            i5 = i10;
                                            if (i5 != 42) {
                                            }
                                            g0Var.f4021b.t(0);
                                            boolean z102 = z7;
                                            str2 = a7;
                                            z5 = z102;
                                            i11 = 6;
                                            if (i11 == 0) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                str = null;
                            }
                            if (dVar != null) {
                                String packageName = g0Var.f4021b.f3986f.getPackageName();
                                i11 = 3;
                                int i13 = 23;
                                while (true) {
                                    if (i13 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.b bVar = (com.google.android.gms.internal.play_billing.b) dVar;
                                            Parcel R = bVar.R();
                                            R.writeInt(i13);
                                            R.writeString(packageName);
                                            R.writeString("subs");
                                            Parcel S = bVar.S(R, 1);
                                            int readInt = S.readInt();
                                            S.recycle();
                                            i11 = readInt;
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.b) dVar).U(i13, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            StringBuilder sb2 = new StringBuilder();
                                            str = null;
                                            sb2.append("highestLevelSupportedForSubs: ");
                                            sb2.append(i13);
                                            p1.f("BillingClient", sb2.toString());
                                        } else {
                                            i13--;
                                        }
                                    } else {
                                        str = null;
                                        i13 = 0;
                                    }
                                }
                                d dVar3 = g0Var.f4021b;
                                dVar3.f3990k = i13 >= 5;
                                dVar3.j = i13 >= 3;
                                if (i13 < 3) {
                                    p1.f("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i5 = 9;
                                } else {
                                    i5 = 1;
                                }
                                int i14 = 23;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.b bVar2 = (com.google.android.gms.internal.play_billing.b) dVar;
                                            Parcel R2 = bVar2.R();
                                            R2.writeInt(i14);
                                            R2.writeString(packageName);
                                            R2.writeString("inapp");
                                            Parcel S2 = bVar2.S(R2, 1);
                                            i11 = S2.readInt();
                                            S2.recycle();
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.b) dVar).U(i14, packageName, "inapp", bundle);
                                        }
                                        if (i11 == 0) {
                                            g0Var.f4021b.f3991l = i14;
                                            p1.f("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                d dVar4 = g0Var.f4021b;
                                int i15 = dVar4.f3991l;
                                dVar4.A = i15 >= 23;
                                dVar4.f4004z = i15 >= 22;
                                dVar4.f4003y = i15 >= 21;
                                dVar4.f4002x = i15 >= 20;
                                dVar4.f4001w = i15 >= 19;
                                dVar4.f4000v = i15 >= 18;
                                dVar4.f3999u = i15 >= 17;
                                dVar4.f3998t = i15 >= 16;
                                dVar4.f3997s = i15 >= 15;
                                dVar4.f3996r = i15 >= 14;
                                dVar4.q = i15 >= 12;
                                dVar4.f3995p = i15 >= 10;
                                dVar4.f3994o = i15 >= 9;
                                dVar4.f3993n = i15 >= 8;
                                dVar4.f3992m = i15 >= 6;
                                if (i15 < 3) {
                                    p1.g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i5 = 36;
                                }
                                if (i11 == 0) {
                                    synchronized (g0Var.f4021b.f3981a) {
                                        try {
                                            if (g0Var.f4021b.f3982b == 3) {
                                                return str;
                                            }
                                            z5 = i12 != 1;
                                            g0Var.f4021b.t(2);
                                            x0 x0Var = g0Var.f4021b.f3985e != null ? g0Var.f4021b.f3985e : str;
                                            if (x0Var != 0) {
                                                x0Var.A(g0Var.f4021b.f4003y);
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    z5 = i12 != 1;
                                    g0Var.f4021b.t(0);
                                }
                                str2 = str;
                                if (i11 == 0) {
                                    try {
                                        if (true != z5) {
                                            g0Var.f4021b.K(6);
                                        } else {
                                            l1.a aVar = g0Var.f4021b.f3987g;
                                            k5 o3 = l5.o();
                                            t4 r5 = u4.r();
                                            r5.f(0);
                                            o3.e();
                                            l5.n((l5) o3.f5450b, (u4) r5.b());
                                            aVar.S((l5) o3.b());
                                        }
                                    } catch (Throwable th4) {
                                        p1.h("BillingClient", "Unable to log.", th4);
                                    }
                                    g0Var.a(t0.f4089k);
                                    return str;
                                }
                                k kVar = t0.f4080a;
                                try {
                                    if (true != z5) {
                                        g0Var.f4021b.J(i5, 6, kVar, str2);
                                    } else {
                                        t4 r6 = u4.r();
                                        r6.f(kVar.f4037a);
                                        String str3 = kVar.f4038b;
                                        r6.e();
                                        u4.o((u4) r6.f5450b, str3);
                                        r6.g(i5);
                                        if (str2 != null) {
                                            r6.e();
                                            u4.n((u4) r6.f5450b, str2);
                                        }
                                        l1.a aVar2 = g0Var.f4021b.f3987g;
                                        k5 o4 = l5.o();
                                        u4 u4Var = (u4) r6.b();
                                        o4.e();
                                        l5.n((l5) o4.f5450b, u4Var);
                                        aVar2.S((l5) o4.b());
                                    }
                                } catch (Throwable th5) {
                                    p1.h("BillingClient", "Unable to log.", th5);
                                }
                                g0Var.a(t0.f4080a);
                                return str;
                            }
                            g0Var.f4021b.t(0);
                            d dVar5 = g0Var.f4021b;
                            k kVar2 = t0.f4090l;
                            dVar5.I(119, 6, kVar2);
                            g0Var.a(kVar2);
                        }
                    } finally {
                    }
                }
                return null;
            case 1:
                return new i4(((z0) this.f4016b).f23270k);
            case 2:
                k1 k1Var = (k1) this.f4016b;
                k1Var.f22848a.B();
                s7.r0 r0Var = k1Var.f22848a.f22994h;
                r3.U(r0Var);
                r0Var.j();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                w1.a aVar3 = (w1.a) this.f4016b;
                aVar3.f24950d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.f24951e.d();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th6) {
                    try {
                        aVar3.f24949c.set(true);
                        throw th6;
                    } finally {
                        aVar3.a(null);
                    }
                }
        }
    }

    public f0(k1 k1Var, zzbg zzbgVar, String str) {
        this.f4015a = 2;
        this.f4016b = k1Var;
    }
}
