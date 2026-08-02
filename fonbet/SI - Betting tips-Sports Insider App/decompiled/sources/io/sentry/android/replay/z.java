package io.sentry.android.replay;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import s7.f1;
import s7.k1;
import s7.n0;
import s7.r3;
import s7.v3;
import s7.y2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16173a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16174b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16175c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16176d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16177e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16178f;

    public /* synthetic */ z(k1 k1Var, zzr zzrVar, Bundle bundle, s7.c0 c0Var, String str) {
        this.f16173a = 1;
        this.f16174b = k1Var;
        this.f16175c = zzrVar;
        this.f16176d = bundle;
        this.f16177e = c0Var;
        this.f16178f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        y2 y2Var;
        s7.a0 a0Var;
        v3 v3Var;
        s7.a0 a0Var2;
        switch (this.f16173a) {
            case 0:
                b6 b6Var = (b6) this.f16174b;
                if (!((AtomicBoolean) this.f16178f).get()) {
                    if (b6Var.getSessionReplay().f16410l) {
                        b6Var.getLogger().h(b5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                        return;
                    }
                    return;
                }
                try {
                    if (b6Var.getSessionReplay().f16410l) {
                        b6Var.getLogger().h(b5.DEBUG, "Capturing a frame.", new Object[0]);
                    }
                    u uVar = (u) this.f16176d;
                    if (uVar != null) {
                        uVar.b();
                    }
                } catch (Throwable th2) {
                    b6Var.getLogger().e(b5.ERROR, "Failed to capture a frame", th2);
                }
                if (b6Var.getSessionReplay().f16410l) {
                    ILogger logger = b6Var.getLogger();
                    b5 b5Var = b5.DEBUG;
                    StringBuilder sb2 = new StringBuilder("Posting the capture runnable again, frame rate is ");
                    v vVar = (v) this.f16177e;
                    logger.h(b5Var, r4.k.n(sb2, vVar != null ? vVar.f16141e : 1, " fps."), new Object[0]);
                }
                if (((f3.b) this.f16175c).f9329a.postDelayed(this, 1000 / (((v) this.f16177e) != null ? r4.f16141e : 1))) {
                    return;
                }
                b6Var.getLogger().h(b5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                return;
            case 1:
                k1 k1Var = (k1) this.f16174b;
                zzr zzrVar = (zzr) this.f16175c;
                Bundle bundle = (Bundle) this.f16176d;
                s7.c0 c0Var = (s7.c0) this.f16177e;
                String str = (String) this.f16178f;
                r3 r3Var = k1Var.f22848a;
                r3Var.B();
                try {
                    c0Var.H(r3Var.d0(bundle, zzrVar));
                    return;
                } catch (RemoteException e7) {
                    r3Var.a().f22903f.c(str, e7, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f16174b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            y2Var = (y2) this.f16178f;
                            a0Var = y2Var.f23257d;
                        } catch (RemoteException e9) {
                            n0 n0Var = ((f1) ((y2) this.f16178f).f3328a).f22745f;
                            f1.m(n0Var);
                            n0Var.f22903f.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f16175c, e9);
                            ((AtomicReference) this.f16174b).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f16174b;
                        }
                        if (a0Var == null) {
                            n0 n0Var2 = ((f1) y2Var.f3328a).f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22903f.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f16175c, (String) this.f16176d);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(a0Var.K((String) this.f16175c, (String) this.f16176d, (zzr) this.f16177e));
                        } else {
                            atomicReference2.set(a0Var.m(null, (String) this.f16175c, (String) this.f16176d));
                        }
                        y2Var.w();
                        atomicReference = (AtomicReference) this.f16174b;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f16174b).notify();
                        throw th3;
                    }
                }
            default:
                com.google.android.gms.internal.measurement.n0 n0Var3 = (com.google.android.gms.internal.measurement.n0) this.f16177e;
                String str2 = (String) this.f16175c;
                String str3 = (String) this.f16174b;
                y2 y2Var2 = (y2) this.f16178f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        a0Var2 = y2Var2.f23257d;
                    } catch (RemoteException e10) {
                        n0 n0Var4 = ((f1) y2Var2.f3328a).f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22903f.d("Failed to get conditional properties; remote exception", str3, str2, e10);
                    }
                    if (a0Var2 != null) {
                        arrayList = v3.a0(a0Var2.K(str3, str2, (zzr) this.f16176d));
                        y2Var2.w();
                        v3Var = ((f1) y2Var2.f3328a).f22748i;
                        f1.k(v3Var);
                        v3Var.Z(n0Var3, arrayList);
                        return;
                    }
                    f1 f1Var = (f1) y2Var2.f3328a;
                    n0 n0Var5 = f1Var.f22745f;
                    f1.m(n0Var5);
                    n0Var5.f22903f.c(str3, str2, "Failed to get conditional properties; not connected to service");
                    v3Var = f1Var.f22748i;
                    f1.k(v3Var);
                    v3Var.Z(n0Var3, arrayList);
                    return;
                } catch (Throwable th4) {
                    v3 v3Var2 = ((f1) y2Var2.f3328a).f22748i;
                    f1.k(v3Var2);
                    v3Var2.Z(n0Var3, arrayList);
                    throw th4;
                }
        }
    }

    public /* synthetic */ z(y2 y2Var, Serializable serializable, String str, Object obj, Object obj2, int i5) {
        this.f16173a = i5;
        this.f16174b = serializable;
        this.f16175c = str;
        this.f16176d = obj;
        this.f16177e = obj2;
        this.f16178f = y2Var;
    }

    public z(b6 options, f3.b mainLooperHandler) {
        this.f16173a = 0;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        this.f16174b = options;
        this.f16175c = mainLooperHandler;
        this.f16178f = new AtomicBoolean(true);
    }
}
