package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.OnSuccessListener;
import com.vk.core.preference.Preference;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.cm01;
import xsna.exc0;
import xsna.f5o0;
import xsna.fo8;
import xsna.hui0;
import xsna.ijp;
import xsna.o100;
import xsna.otb0;
import xsna.pop0;
import xsna.vu8;
import xsna.wyz0;
import xsna.xl5;
import xsna.zop0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzj {

    @Nullable
    pop0 zzb;
    private final Context zzd;
    private final cm01 zze;
    private final hui0 zzf;

    @Nullable
    private final zzce zzg;
    private final zzax zzh;
    private Long zzj;
    private final ExecutorService zzk;
    private zzcn zzl;
    private static final o100 zzc = new o100("ClientCastAnalytics", null);
    public static boolean zza = true;
    private int zzm = 1;
    private final String zzi = UUID.randomUUID().toString();

    private zzj(Context context, cm01 cm01Var, hui0 hui0Var, @Nullable zzce zzceVar, zzax zzaxVar) {
        this.zzd = context;
        this.zze = cm01Var;
        this.zzf = hui0Var;
        this.zzg = zzceVar;
        this.zzh = zzaxVar;
        zzfj.zza();
        this.zzk = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public static zzj zza(Context context, cm01 cm01Var, hui0 hui0Var, @Nullable zzce zzceVar, zzax zzaxVar) {
        return new zzj(context, cm01Var, hui0Var, zzceVar, zzaxVar);
    }

    public final void zzb(Bundle bundle) {
        final int i = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
        zza = z2;
        if (i == 0) {
            if (!z && !z2) {
                return;
            } else {
                i = 0;
            }
        }
        long j = bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L);
        Context context = this.zzd;
        this.zzl = new zzcn(context, j);
        final String packageName = context.getPackageName();
        Locale locale = Locale.ROOT;
        String a = fo8.a(packageName, ".client_cast_analytics_data");
        this.zzm = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
        zop0.b(context);
        this.zzb = zop0.a().c(vu8.e).a("CAST_SENDER_SDK", new ijp("proto"), zzf.zza);
        if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
            this.zzj = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
        }
        final SharedPreferences h = Preference.h(context.getApplicationContext(), 0, a);
        if (i != 0) {
            cm01 cm01Var = this.zze;
            cm01Var.getClass();
            f5o0.a a2 = f5o0.a();
            a2.a = new otb0(cm01Var, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
            a2.d = new Feature[]{wyz0.c};
            a2.c = true;
            a2.b = false;
            a2.e = 8426;
            cm01Var.doRead(a2.a()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzi
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    zzj.this.zzc(packageName, i, h, (Bundle) obj);
                }
            });
        }
        if (z) {
            zzr.zza(h, this, packageName).zzc();
            zzr.zzb(zzpm.CAST_CONTEXT);
        }
        if (zza) {
            zzu.zza(this, packageName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzc(String str, int i, SharedPreferences sharedPreferences, Bundle bundle) {
        hui0 hui0Var = this.zzf;
        exc0.i(hui0Var);
        zzce zzceVar = this.zzg;
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            if (i != 1 || i == 2) {
                zzn zznVar = new zzn(sharedPreferences, this, this.zzh, bundle, str);
                hui0Var.a(new zzl(zznVar));
                if (zzceVar == null) {
                    zzceVar.zzc(new zzm(zznVar));
                    return;
                }
                return;
            }
            return;
        }
        zzy zzyVar = new zzy(this, this.zzh, str);
        hui0Var.a(new zzw(zzyVar));
        if (zzceVar != null) {
            zzceVar.zzc(new zzx(zzyVar));
        }
        if (i != 1) {
        }
        zzn zznVar2 = new zzn(sharedPreferences, this, this.zzh, bundle, str);
        hui0Var.a(new zzl(zznVar2));
        if (zzceVar == null) {
        }
    }

    public final void zzd(final zzqr zzqrVar, final int i) {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.cast.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zze(zzqrVar, i);
            }
        });
    }

    public final /* synthetic */ void zze(final zzqr zzqrVar, final int i) {
        zzcn zzcnVar = this.zzl;
        if (zzcnVar == null) {
            return;
        }
        zzcnVar.zza().addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzh
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                zzj.this.zzf(zzqrVar, i, (Boolean) obj);
            }
        });
    }

    public final void zzf(zzqr zzqrVar, int i, Boolean bool) {
        if (bool.booleanValue()) {
            zzqq zzd = zzqr.zzd(zzqrVar);
            String str = this.zzi;
            zzd.zzc(str);
            zzd.zzd(str);
            Long l = this.zzj;
            if (l != null) {
                zzd.zze((int) l.longValue());
            }
            zzqr zzqrVar2 = (zzqr) zzd.zzu();
            int i2 = this.zzm;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i - 1;
            xl5 xl5Var = i3 != 0 ? i3 != 1 ? new xl5(Integer.valueOf(i4), zzqrVar2, Priority.VERY_LOW, null) : new xl5(Integer.valueOf(i4), zzqrVar2, Priority.DEFAULT, null) : new xl5(Integer.valueOf(i4), zzqrVar2, Priority.VERY_LOW, null);
            zzc.a("analytics event: %s", xl5Var);
            pop0 pop0Var = this.zzb;
            if (pop0Var != null) {
                pop0Var.b(xl5Var);
            }
        }
    }
}
