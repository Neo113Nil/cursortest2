package e6;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final e f8751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8752b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8753c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8754d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8755e;

    public t(e eVar, int i5, a aVar, long j, long j6) {
        this.f8751a = eVar;
        this.f8752b = i5;
        this.f8753c = aVar;
        this.f8754d = j;
        this.f8755e = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ConnectionTelemetryConfiguration a(p pVar, g6.e eVar, int i5) {
        zzj zzjVar = eVar.f9824w;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.f4556d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.f4498b) {
            int[] iArr = connectionTelemetryConfiguration.f4500d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f4502f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i5) {
                            break;
                        }
                        i10++;
                    }
                }
                if (pVar.f8745p >= connectionTelemetryConfiguration.f4501e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i5) {
                        i10++;
                    } else if (pVar.f8745p >= connectionTelemetryConfiguration.f4501e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j6;
        e eVar = this.f8751a;
        if (eVar.g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) g6.h.b().f9846a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f4528b) {
                p pVar = (p) eVar.j.get(this.f8753c);
                if (pVar != null) {
                    Object obj = pVar.f8736f;
                    if (obj instanceof g6.e) {
                        g6.e eVar2 = (g6.e) obj;
                        long j10 = this.f8754d;
                        int i14 = 0;
                        boolean z5 = j10 > 0;
                        int i15 = eVar2.q;
                        if (rootTelemetryConfiguration != null) {
                            z5 &= rootTelemetryConfiguration.f4529c;
                            i5 = rootTelemetryConfiguration.f4530d;
                            i11 = rootTelemetryConfiguration.f4531e;
                            i10 = rootTelemetryConfiguration.f4527a;
                            if (eVar2.f9824w != null && !eVar2.r()) {
                                ConnectionTelemetryConfiguration a7 = a(pVar, eVar2, this.f8752b);
                                if (a7 == null) {
                                    return;
                                }
                                boolean z7 = a7.f4499c && j10 > 0;
                                i11 = a7.f4501e;
                                z5 = z7;
                            }
                        } else {
                            i5 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i16 = i5;
                        int i17 = -1;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else if (task.j()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof d6.e) {
                                Status status = ((d6.e) exception).f8245a;
                                i12 = status.f4466a;
                                ConnectionResult connectionResult = status.f4469d;
                                if (connectionResult != null) {
                                    i13 = i12;
                                    i14 = connectionResult.f4441b;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z5) {
                            long j11 = this.f8755e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i17 = (int) (SystemClock.elapsedRealtime() - j11);
                            j6 = currentTimeMillis;
                            j = j10;
                        } else {
                            j = 0;
                            j6 = 0;
                        }
                        u uVar = new u(new MethodInvocation(this.f8752b, i13, i14, j, j6, null, null, i15, i17), i10, i16, i11);
                        com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
                        h0Var.sendMessage(h0Var.obtainMessage(18, uVar));
                    }
                }
            }
        }
    }
}
