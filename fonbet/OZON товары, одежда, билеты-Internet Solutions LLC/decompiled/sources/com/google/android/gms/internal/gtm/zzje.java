package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import g.C6594f;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class zzje {
    private static volatile zzje zzb;
    private final Context zzd;
    private final com.google.android.gms.tagmanager.zzcp zze;
    private final com.google.android.gms.tagmanager.zzcg zzf;
    private final zzjn zzg;
    private final ExecutorService zzh;
    private final ScheduledExecutorService zzi;
    private final zzhs zzj;
    private final zziz zzk;
    private String zzm;
    private String zzn;
    private static final Pattern zza = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static final zzjd zzc = new zzio();
    private final Object zzl = new Object();
    private int zzo = 1;
    private final Queue<Runnable> zzp = new LinkedList();
    private volatile boolean zzq = false;
    private volatile boolean zzr = false;

    @VisibleForTesting
    zzje(Context context, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar, zzjn zzjnVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzhs zzhsVar, zziz zzizVar) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(zzcpVar);
        this.zzd = context;
        this.zze = zzcpVar;
        this.zzf = zzcgVar;
        this.zzg = zzjnVar;
        this.zzh = executorService;
        this.zzi = scheduledExecutorService;
        this.zzj = zzhsVar;
        this.zzk = zzizVar;
    }

    public static zzje zzf(Context context, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar) {
        zzje zzjeVar;
        ScheduledExecutorService scheduledExecutorService;
        Preconditions.checkNotNull(context);
        zzje zzjeVar2 = zzb;
        if (zzjeVar2 != null) {
            return zzjeVar2;
        }
        synchronized (zzje.class) {
            try {
                zzjeVar = zzb;
                if (zzjeVar == null) {
                    zzjn zzjnVar = new zzjn(context, ConnectionTracker.getInstance());
                    ExecutorService zza2 = zzjk.zza(context);
                    scheduledExecutorService = zzjm.zza;
                    zzje zzjeVar3 = new zzje(context, zzcpVar, zzcgVar, zzjnVar, zza2, scheduledExecutorService, zzhs.zza(), new zziz(context));
                    zzb = zzjeVar3;
                    zzjeVar = zzjeVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzjeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, String> zzp(String[] strArr) {
        String str;
        zzhl.zzd("Looking up container asset.");
        String str2 = this.zzm;
        if (str2 != null && (str = this.zzn) != null) {
            return Pair.create(str2, str);
        }
        try {
            String[] zzb2 = this.zzk.zzb("containers");
            boolean z11 = false;
            for (int i11 = 0; i11 < zzb2.length; i11++) {
                Pattern pattern = zza;
                Matcher matcher = pattern.matcher(zzb2[i11]);
                if (!matcher.matches()) {
                    zzhl.zze("Ignoring container asset " + zzb2[i11] + " (does not match " + pattern.pattern() + ")");
                } else if (z11) {
                    String valueOf = String.valueOf(zzb2[i11]);
                    zzhl.zze(valueOf.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(valueOf) : new String("Extra container asset found, will not be loaded: "));
                } else {
                    this.zzm = matcher.group(1);
                    String str3 = File.separator;
                    String str4 = zzb2[i11];
                    this.zzn = C6594f.a("containers", str3, str4, new StringBuilder(String.valueOf(str3).length() + 10 + String.valueOf(str4).length()));
                    String valueOf2 = String.valueOf(this.zzm);
                    zzhl.zzd(valueOf2.length() != 0 ? "Asset found for container ".concat(valueOf2) : new String("Asset found for container "));
                    z11 = true;
                }
            }
            if (!z11) {
                zzhl.zze("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] zza2 = this.zzk.zza();
                    boolean z12 = false;
                    for (int i12 = 0; i12 < zza2.length; i12++) {
                        Matcher matcher2 = zza.matcher(zza2[i12]);
                        if (matcher2.matches()) {
                            if (z12) {
                                String valueOf3 = String.valueOf(zza2[i12]);
                                zzhl.zze(valueOf3.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(valueOf3) : new String("Extra container asset found, will not be loaded: "));
                            } else {
                                String group = matcher2.group(1);
                                this.zzm = group;
                                this.zzn = zza2[i12];
                                String valueOf4 = String.valueOf(group);
                                zzhl.zzd(valueOf4.length() != 0 ? "Asset found for container ".concat(valueOf4) : new String("Asset found for container "));
                                zzhl.zze("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z12 = true;
                            }
                        }
                    }
                } catch (IOException e11) {
                    zzhl.zzb("Failed to enumerate assets.", e11);
                    return Pair.create(null, null);
                }
            }
            return Pair.create(this.zzm, this.zzn);
        } catch (IOException e12) {
            zzhl.zzb("Failed to enumerate assets in folder containers", e12);
            return Pair.create(null, null);
        }
    }

    @VisibleForTesting
    public final void zzm(String[] strArr) {
        zzhl.zzd("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzl) {
            if (this.zzq) {
                return;
            }
            try {
                Context context = this.zzd;
                try {
                    ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService"), 0);
                    if (serviceInfo != null) {
                        if (serviceInfo.enabled) {
                            Pair<String, String> zzp = zzp(null);
                            String str = (String) zzp.first;
                            String str2 = (String) zzp.second;
                            if (str == null || str2 == null) {
                                zzhl.zze("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                            } else {
                                zzhl.zzc(str.length() != 0 ? "Loading container ".concat(str) : new String("Loading container "));
                                this.zzh.execute(new zzit(this, str, str2, null));
                                this.zzi.schedule(new zziv(this), 5000L, TimeUnit.MILLISECONDS);
                                if (!this.zzr) {
                                    zzhl.zzc("Installing Tag Manager event handler.");
                                    this.zzr = true;
                                    try {
                                        this.zze.zze(new zziq(this));
                                    } catch (RemoteException e11) {
                                        zzgt.zzb("Error communicating with measurement proxy: ", e11, this.zzd);
                                    }
                                    try {
                                        this.zze.zzd(new zzis(this));
                                    } catch (RemoteException e12) {
                                        zzgt.zzb("Error communicating with measurement proxy: ", e12, this.zzd);
                                    }
                                    this.zzd.registerComponentCallbacks(new zzix(this));
                                    zzhl.zzc("Tag Manager event handler installed.");
                                }
                            }
                            this.zzq = true;
                            long currentTimeMillis2 = System.currentTimeMillis();
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("Tag Manager initilization took ");
                            sb2.append(currentTimeMillis2 - currentTimeMillis);
                            sb2.append("ms");
                            zzhl.zzc(sb2.toString());
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                zzhl.zze("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                this.zzq = true;
            } catch (Throwable th2) {
                this.zzq = true;
                throw th2;
            }
        }
    }

    final void zzn(Uri uri) {
        this.zzh.execute(new zziy(this, uri));
    }
}
