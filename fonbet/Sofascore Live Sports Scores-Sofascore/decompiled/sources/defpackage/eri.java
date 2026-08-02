package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eri {
    public final ComponentName a;

    static {
        rik.x("SystemJobInfoConverter");
    }

    public eri(Context context, bgf bgfVar) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(lcl lclVar, int i) {
        int i2;
        String str;
        zm3 zm3Var = lclVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", lclVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", lclVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", lclVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = zm3Var.c;
        Set<ym3> set = zm3Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = zm3Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a = zm3Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || a == null) {
            jbd jbdVar = zm3Var.a;
            if (i3 < 30 || jbdVar != jbd.f) {
                int ordinal = jbdVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4) {
                                    rik o = rik.o();
                                    jbdVar.toString();
                                    o.getClass();
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a);
        }
        if (!z2) {
            extras.setBackoffCriteria(lclVar.m, lclVar.l == zy0.b ? 0 : 1);
        }
        long max = Math.max(lclVar.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!lclVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (ym3 ym3Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(ym3Var.a, ym3Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(zm3Var.g);
            extras.setTriggerContentMaxDelay(zm3Var.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(zm3Var.e);
        extras.setRequiresStorageNotLow(zm3Var.f);
        Object[] objArr = lclVar.k > 0;
        boolean z3 = max > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && lclVar.q && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = lclVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
