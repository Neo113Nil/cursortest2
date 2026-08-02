package h3;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import e3.e;
import e3.f;
import e3.l;
import e3.x;
import e3.y;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10345d = x.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f10346a;

    /* renamed from: b, reason: collision with root package name */
    public final l f10347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10348c;

    public b(Context context, l lVar, boolean z5) {
        this.f10347b = lVar;
        this.f10346a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f10348c = z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x007f, code lost:
    
        if (r3 < 26) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0082, code lost:
    
        if (r3 >= 24) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JobInfo a(o oVar, int i5) {
        int i10;
        String str;
        f fVar = oVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f20331a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", oVar.f20348t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i5, this.f10346a).setRequiresCharging(fVar.f8508c);
        boolean z5 = fVar.f8509d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z5).setExtras(persistableBundle);
        NetworkRequest a7 = fVar.a();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || a7 == null) {
            y yVar = fVar.f8506a;
            if (i11 < 30 || yVar != y.f8577f) {
                int ordinal = yVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i10 = 2;
                        if (ordinal != 2) {
                            i10 = 3;
                            if (ordinal != 3) {
                                i10 = 4;
                                if (ordinal == 4) {
                                }
                                x.e().a(f10345d, "API version too low. Cannot convert network type value " + yVar);
                            }
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                builder.setRequiredNetworkType(i10);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setRequiredNetwork(a7);
        }
        if (!z5) {
            builder.setBackoffCriteria(oVar.f20342m, oVar.f20341l == e3.a.f8472b ? 0 : 1);
        }
        long a10 = oVar.a();
        this.f10347b.getClass();
        long max = Math.max(a10 - System.currentTimeMillis(), 0L);
        if (i11 <= 28) {
            builder.setMinimumLatency(max);
        } else if (max > 0) {
            builder.setMinimumLatency(max);
        } else if (!oVar.q && this.f10348c) {
            builder.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && fVar.b()) {
            for (e eVar : fVar.f8514i) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(eVar.f8498a, eVar.f8499b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(fVar.f8512g);
            builder.setTriggerContentMaxDelay(fVar.f8513h);
        }
        builder.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            builder.setRequiresBatteryNotLow(fVar.f8510e);
            builder.setRequiresStorageNotLow(fVar.f8511f);
        }
        Object[] objArr = oVar.f20340k > 0;
        boolean z7 = max > 0;
        if (i12 >= 31 && oVar.q && objArr == false && !z7) {
            builder.setExpedited(true);
        }
        if (i12 >= 35 && (str = oVar.f20352x) != null) {
            builder.setTraceTag(str);
        }
        return builder.build();
    }
}
