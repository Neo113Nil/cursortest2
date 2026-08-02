package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements io.sentry.h1, t0, ILogger, io.sentry.logger.c, io.sentry.metrics.b {

    /* renamed from: b, reason: collision with root package name */
    public static final v f15862b = new v(0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f15863c = new v(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15864a;

    public /* synthetic */ v(int i5) {
        this.f15864a = i5;
    }

    @Override // io.sentry.h1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.ILogger
    public void b(b5 b5Var, Throwable th2, String str, Object... objArr) {
        switch (this.f15864a) {
            case 2:
                if (objArr.length != 0) {
                    e(b5Var, String.format(str, objArr), th2);
                    break;
                } else {
                    e(b5Var, str, th2);
                    break;
                }
            default:
                if (objArr.length != 0) {
                    e(b5Var, String.format(str, objArr), th2);
                    break;
                } else {
                    e(b5Var, str, th2);
                    break;
                }
        }
    }

    @Override // io.sentry.logger.c
    public io.sentry.logger.b c(b6 b6Var, com.android.billingclient.api.x0 x0Var) {
        m mVar = new m(b6Var, x0Var);
        h0.f15617e.c(mVar);
        return mVar;
    }

    @Override // io.sentry.h1
    public void d() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.ILogger
    public void e(b5 b5Var, String str, Throwable th2) {
        switch (this.f15864a) {
            case 2:
                Log.wtf("Sentry", str, th2);
                break;
            default:
                int i5 = k.f15767a[b5Var.ordinal()];
                if (i5 == 1) {
                    Log.i("Sentry", str, th2);
                    break;
                } else if (i5 == 2) {
                    Log.w("Sentry", str, th2);
                    break;
                } else if (i5 == 3) {
                    Log.e("Sentry", str, th2);
                    break;
                } else if (i5 == 4) {
                    Log.wtf("Sentry", str, th2);
                    break;
                } else {
                    Log.d("Sentry", str, th2);
                    break;
                }
        }
    }

    @Override // io.sentry.ILogger
    public void h(b5 b5Var, String str, Object... objArr) {
        switch (this.f15864a) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                    break;
                } else {
                    Log.println(7, "Sentry", str);
                    break;
                }
            default:
                int i5 = 5;
                if (objArr.length != 0) {
                    int i10 = k.f15767a[b5Var.ordinal()];
                    if (i10 == 1) {
                        i5 = 4;
                    } else if (i10 != 2) {
                        i5 = i10 != 4 ? 3 : 7;
                    }
                    Log.println(i5, "Sentry", String.format(str, objArr));
                    break;
                } else {
                    int i11 = k.f15767a[b5Var.ordinal()];
                    if (i11 == 1) {
                        i5 = 4;
                    } else if (i11 != 2) {
                        i5 = i11 != 4 ? 3 : 7;
                    }
                    Log.println(i5, "Sentry", str);
                    break;
                }
        }
    }

    @Override // io.sentry.ILogger
    public boolean i(b5 b5Var) {
        switch (this.f15864a) {
        }
        return true;
    }

    @Override // io.sentry.metrics.b
    /* renamed from: c, reason: collision with other method in class */
    public io.sentry.metrics.a mo103c(b6 b6Var, com.android.billingclient.api.x0 x0Var) {
        o oVar = new o(b6Var, x0Var);
        h0.f15617e.c(oVar);
        return oVar;
    }
}
