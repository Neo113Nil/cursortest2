package androidx.work.impl.background.systemjob;

import Q2.AbstractC1508t;
import Q2.C1493d;
import Q2.EnumC1490a;
import Q2.EnumC1509u;
import Q2.InterfaceC1491b;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23848d = AbstractC1508t.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f23849a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1491b f23850b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23851c;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;

        static {
            int[] iArr = new int[EnumC1509u.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr;
            try {
                iArr[EnumC1509u.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[EnumC1509u.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[EnumC1509u.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[EnumC1509u.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[EnumC1509u.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k(Context context, InterfaceC1491b interfaceC1491b, boolean z10) {
        this.f23850b = interfaceC1491b;
        this.f23849a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f23851c = z10;
    }

    public static JobInfo.TriggerContentUri b(C1493d.b bVar) {
        return new JobInfo.TriggerContentUri(bVar.a(), bVar.b() ? 1 : 0);
    }

    public static int c(EnumC1509u enumC1509u) {
        int i10 = a.$SwitchMap$androidx$work$NetworkType[enumC1509u.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        AbstractC1508t.e().a(f23848d, "API version too low. Cannot convert network type value " + enumC1509u);
        return 1;
    }

    public static void d(JobInfo.Builder builder, EnumC1509u enumC1509u) {
        if (Build.VERSION.SDK_INT < 30 || enumC1509u != EnumC1509u.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(enumC1509u));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(WorkSpec workSpec, int i10) {
        String traceTag;
        C1493d c1493d = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.n());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f23849a).setRequiresCharging(c1493d.i()).setRequiresDeviceIdle(c1493d.j()).setExtras(persistableBundle);
        NetworkRequest d10 = c1493d.d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || d10 == null) {
            d(extras, c1493d.f());
        } else {
            l.a(extras, d10);
        }
        if (!c1493d.j()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == EnumC1490a.LINEAR ? 0 : 1);
        }
        long max = Math.max(workSpec.c() - this.f23850b.a(), 0L);
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited && this.f23851c) {
            extras.setImportantWhileForeground(true);
        }
        if (c1493d.g()) {
            Iterator it = c1493d.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C1493d.b) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c1493d.b());
            extras.setTriggerContentMaxDelay(c1493d.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(c1493d.h());
            extras.setRequiresStorageNotLow(c1493d.k());
        }
        boolean z10 = workSpec.runAttemptCount > 0;
        boolean z11 = max > 0;
        if (i12 >= 31 && workSpec.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (traceTag = workSpec.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}
