package s7;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22945a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f22948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2 f22950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22951g;

    public p2(y2 y2Var, String str, String str2, zzr zzrVar, boolean z5, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f22946b = str;
        this.f22947c = str2;
        this.f22948d = zzrVar;
        this.f22949e = z5;
        this.f22951g = n0Var;
        this.f22950f = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v3 v3Var;
        a0 a0Var;
        f1 f1Var;
        AtomicReference atomicReference;
        y2 y2Var;
        a0 a0Var2;
        switch (this.f22945a) {
            case 0:
                String str = this.f22947c;
                String str2 = this.f22946b;
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.f22951g;
                y2 y2Var2 = this.f22950f;
                Bundle bundle = new Bundle();
                try {
                    try {
                        a0Var = y2Var2.f23257d;
                        f1Var = (f1) y2Var2.f3328a;
                    } catch (RemoteException e7) {
                        e = e7;
                    }
                    if (a0Var == null) {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.c(str2, str, "Failed to get user properties; not connected to service");
                        v3Var = f1Var.f22748i;
                        f1.k(v3Var);
                        v3Var.Y(n0Var, bundle);
                        return;
                    }
                    List<zzpl> I = a0Var.I(str2, str, this.f22949e, this.f22948d);
                    Bundle bundle2 = new Bundle();
                    if (I != null) {
                        for (zzpl zzplVar : I) {
                            String str3 = zzplVar.f5817e;
                            String str4 = zzplVar.f5814b;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l6 = zzplVar.f5816d;
                                if (l6 != null) {
                                    bundle2.putLong(str4, l6.longValue());
                                } else {
                                    Double d10 = zzplVar.f5819g;
                                    if (d10 != null) {
                                        bundle2.putDouble(str4, d10.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        y2Var2.w();
                        v3 v3Var2 = f1Var.f22748i;
                        f1.k(v3Var2);
                        v3Var2.Y(n0Var, bundle2);
                        return;
                    } catch (RemoteException e9) {
                        e = e9;
                        bundle = bundle2;
                        n0 n0Var3 = ((f1) y2Var2.f3328a).f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22903f.c(str2, e, "Failed to get user properties; remote exception");
                        v3Var = ((f1) y2Var2.f3328a).f22748i;
                        f1.k(v3Var);
                        v3Var.Y(n0Var, bundle);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                        v3 v3Var3 = ((f1) y2Var2.f3328a).f22748i;
                        f1.k(v3Var3);
                        v3Var3.Y(n0Var, bundle);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f22951g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            y2Var = this.f22950f;
                            a0Var2 = y2Var.f23257d;
                        } catch (RemoteException e10) {
                            n0 n0Var4 = ((f1) this.f22950f.f3328a).f22745f;
                            f1.m(n0Var4);
                            n0Var4.f22903f.d("(legacy) Failed to get user properties; remote exception", null, this.f22946b, e10);
                            ((AtomicReference) this.f22951g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f22951g;
                        }
                        if (a0Var2 == null) {
                            n0 n0Var5 = ((f1) y2Var.f3328a).f22745f;
                            f1.m(n0Var5);
                            n0Var5.f22903f.d("(legacy) Failed to get user properties; not connected to service", null, this.f22946b, this.f22947c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(a0Var2.I(this.f22946b, this.f22947c, this.f22949e, this.f22948d));
                        } else {
                            atomicReference2.set(a0Var2.g(null, this.f22946b, this.f22947c, this.f22949e));
                        }
                        y2Var.w();
                        atomicReference = (AtomicReference) this.f22951g;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th4) {
                        ((AtomicReference) this.f22951g).notify();
                        throw th4;
                    }
                }
        }
    }

    public p2(y2 y2Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z5) {
        this.f22951g = atomicReference;
        this.f22946b = str;
        this.f22947c = str2;
        this.f22948d = zzrVar;
        this.f22949e = z5;
        this.f22950f = y2Var;
    }
}
