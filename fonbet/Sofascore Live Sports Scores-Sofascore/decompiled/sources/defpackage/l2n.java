package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l2n implements OnCompleteListener {
    public final GoogleApiManager a;
    public final int b;
    public final ApiKey c;
    public final long d;
    public final long e;

    public l2n(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2) {
        this.a = googleApiManager;
        this.b = i;
        this.c = apiKey;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration a(zabk zabkVar, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.d;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (zabkVar.l < telemetryConfiguration.e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        GoogleApiManager googleApiManager = this.a;
        if (googleApiManager.f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                zabk zabkVar = (zabk) googleApiManager.j.get(this.c);
                if (zabkVar != null) {
                    Object obj = zabkVar.b;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        long j3 = this.d;
                        boolean z = j3 > 0;
                        int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            int i7 = rootTelemetryConfiguration.d;
                            int i8 = rootTelemetryConfiguration.e;
                            i = rootTelemetryConfiguration.a;
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration a = a(zabkVar, baseGmsClient, this.b);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.c && j3 > 0;
                                i8 = a.e;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        int i9 = -1;
                        if (task.isSuccessful()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).a;
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = connectionResult.b;
                                    i6 = i4;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - this.e);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        m2n m2nVar = new m2n(new MethodInvocation(this.b, i6, i5, j, j2, null, null, gCoreServiceId, i9), i, i3, i2);
                        zao zaoVar = googleApiManager.n;
                        zaoVar.sendMessage(zaoVar.obtainMessage(18, m2nVar));
                    }
                }
            }
        }
    }
}
