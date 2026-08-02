package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.SubscriptionManager;
import androidx.core.app.FrameMetricsAggregator;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class ap implements Rd, FunctionWithThrowable, InterfaceC0223i6, InterfaceC0265jn, zo, io.sentry.v1, io.sentry.util.e, io.sentry.q3, io.sentry.transport.f, io.sentry.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13362a;

    public /* synthetic */ ap(int i5) {
        this.f13362a = i5;
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public InterfaceC0031al a(G0 g02) {
        return Id.b(g02);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        List a7;
        Boolean a10;
        switch (this.f13362a) {
            case 1:
                return N7.a((UiModeManager) obj);
            case 2:
            case 3:
            default:
                a10 = C0519u2.a((ActivityManager) obj);
                return a10;
            case 4:
                return C0188gn.b((Activity) obj);
            case 5:
                a7 = C0389ol.a((SubscriptionManager) obj);
                return a7;
        }
    }

    @Override // io.sentry.util.e
    public Object b() {
        switch (this.f13362a) {
            case 11:
                return io.sentry.b6.empty();
            case 13:
                return new io.sentry.g4();
            case 14:
                byte[] bArr = new byte[8];
                io.sentry.util.j.a().b(bArr);
                byte b10 = (byte) (bArr[6] & 15);
                bArr[6] = b10;
                bArr[6] = (byte) (b10 | 64);
                long j = 0;
                for (int i5 = 0; i5 < 8; i5++) {
                    j = (j << 8) | (bArr[i5] & 255);
                }
                char[] cArr = new char[16];
                io.sentry.util.n.a(cArr, j);
                return new String(cArr);
            case 16:
                return new FrameMetricsAggregator();
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                try {
                    return Build.MODEL.split(" ", -1)[0];
                } catch (Throwable unused) {
                    io.sentry.b5 b5Var = io.sentry.b5.DEBUG;
                    return null;
                }
            default:
                return new Timer(true);
        }
    }

    @Override // io.sentry.v1
    public Object c() {
        return null;
    }

    @Override // io.sentry.transport.f
    public long d() {
        return SystemClock.uptimeMillis();
    }

    public Object e(Context context) {
        String string;
        switch (this.f13362a) {
            case 18:
                return io.sentry.android.core.m0.b(context);
            case 19:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 20:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i5 = applicationInfo.labelRes;
                    if (i5 == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i5);
                    }
                    return string;
                } catch (Throwable unused2) {
                    return null;
                }
            case 21:
                return io.sentry.android.core.m0.a(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.u3
    public void g(io.sentry.z0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.l(io.sentry.protocol.v.f16922b);
    }

    @Override // io.appmetrica.analytics.impl.zo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f13362a) {
            case 8:
                return wo.a(jSONObject, jSONObject2);
            default:
                return xo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0265jn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0487sk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0223i6
    public boolean a(Throwable th2) {
        return C0141f2.a(th2);
    }

    @Override // io.sentry.q3
    public void a(io.sentry.l6 l6Var) {
    }
}
