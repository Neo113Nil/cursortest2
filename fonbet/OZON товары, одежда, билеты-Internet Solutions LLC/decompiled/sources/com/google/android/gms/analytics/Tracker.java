package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzfs;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@VisibleForTesting
/* loaded from: classes9.dex */
public class Tracker extends zzbs {
    private boolean zza;
    private final Map<String, String> zzb;
    private final Map<String, String> zzc;
    private final zzez zzd;
    private final zzv zze;
    private ExceptionReporter zzf;
    private zzfr zzg;

    Tracker(zzbv zzbvVar, String str, zzez zzezVar) {
        super(zzbvVar);
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        this.zzc = new HashMap();
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.zzd = new zzez(60, 2000L, "tracking", zzC());
        this.zze = new zzv(this, zzbvVar);
    }

    private static void zzZ(Map<String, String> map, Map<String, String> map2) {
        Preconditions.checkNotNull(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String zzn = zzn(entry);
            if (zzn != null) {
                map2.put(zzn, entry.getValue());
            }
        }
    }

    private static String zzn(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    public void enableAdvertisingIdCollection(boolean z11) {
        this.zza = z11;
    }

    public void enableAutoActivityTracking(boolean z11) {
        this.zze.zzc(z11);
    }

    public void enableExceptionReporting(boolean z11) {
        synchronized (this) {
            try {
                ExceptionReporter exceptionReporter = this.zzf;
                if ((exceptionReporter != null) == z11) {
                    return;
                }
                if (z11) {
                    ExceptionReporter exceptionReporter2 = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), zzo());
                    this.zzf = exceptionReporter2;
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter2);
                    zzO("Uncaught exceptions will be reported to Google Analytics");
                } else {
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter.zza());
                    zzO("Uncaught exceptions will not be reported to Google Analytics");
                }
            } finally {
            }
        }
    }

    @RecentlyNonNull
    public String get(@RecentlyNonNull String str) {
        zzW();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzb.containsKey(str)) {
            return this.zzb.get(str);
        }
        if (str.equals("&ul")) {
            return zzfs.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (str.equals("&aiid")) {
            return zzu().zza().zze();
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0128
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void send(@androidx.annotation.RecentlyNonNull java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.Tracker.send(java.util.Map):void");
    }

    public void set(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.put(str, str2);
    }

    public void setAnonymizeIp(boolean z11) {
        set("&aip", zzfs.zzc(z11));
    }

    public void setAppId(@RecentlyNonNull String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(@RecentlyNonNull String str) {
        set("&aiid", str);
    }

    public void setAppName(@RecentlyNonNull String str) {
        set("&an", str);
    }

    public void setAppVersion(@RecentlyNonNull String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(@RecentlyNonNull Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.zzc.put("&ci", queryParameter2);
        }
        String queryParameter3 = parse.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.zzc.put("&anid", queryParameter3);
        }
        String queryParameter4 = parse.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.zzc.put("&cn", queryParameter4);
        }
        String queryParameter5 = parse.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.zzc.put("&cc", queryParameter5);
        }
        String queryParameter6 = parse.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.zzc.put("&cm", queryParameter6);
        }
        String queryParameter7 = parse.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.zzc.put("&cs", queryParameter7);
        }
        String queryParameter8 = parse.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.zzc.put("&ck", queryParameter8);
        }
        String queryParameter9 = parse.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.zzc.put("&dclid", queryParameter9);
        }
        String queryParameter10 = parse.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.zzc.put("&gclid", queryParameter10);
        }
        String queryParameter11 = parse.getQueryParameter("aclid");
        if (queryParameter11 != null) {
            this.zzc.put("&aclid", queryParameter11);
        }
    }

    public void setClientId(@RecentlyNonNull String str) {
        set("&cid", str);
    }

    public void setEncoding(@RecentlyNonNull String str) {
        set("&de", str);
    }

    public void setHostname(@RecentlyNonNull String str) {
        set("&dh", str);
    }

    public void setLanguage(@RecentlyNonNull String str) {
        set("&ul", str);
    }

    public void setLocation(@RecentlyNonNull String str) {
        set("&dl", str);
    }

    public void setPage(@RecentlyNonNull String str) {
        set("&dp", str);
    }

    public void setReferrer(@RecentlyNonNull String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d11) {
        set("&sf", Double.toString(d11));
    }

    public void setScreenColors(@RecentlyNonNull String str) {
        set("&sd", str);
    }

    public void setScreenName(@RecentlyNonNull String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i11, int i12) {
        if (i11 < 0 && i12 < 0) {
            zzR("Invalid width or height. The values should be non-negative.");
            return;
        }
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i11);
        sb2.append("x");
        sb2.append(i12);
        set("&sr", sb2.toString());
    }

    public void setSessionTimeout(long j11) {
        this.zze.zze(j11 * 1000);
    }

    public void setTitle(@RecentlyNonNull String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z11) {
        set("useSecure", zzfs.zzc(z11));
    }

    public void setViewportSize(@RecentlyNonNull String str) {
        set("&vp", str);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zze.zzX();
        String zza = zzB().zza();
        if (zza != null) {
            set("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null) {
            set("&av", zzb);
        }
    }

    final void zzm(zzfr zzfrVar) {
        zzO("Loading Tracker config values");
        this.zzg = zzfrVar;
        String str = zzfrVar.zza;
        if (str != null) {
            set("&tid", str);
            zzP("trackingId loaded", str);
        }
        double d11 = zzfrVar.zzb;
        if (d11 >= 0.0d) {
            String d12 = Double.toString(d11);
            set("&sf", d12);
            zzP("Sample frequency loaded", d12);
        }
        int i11 = zzfrVar.zzc;
        if (i11 >= 0) {
            setSessionTimeout(i11);
            zzP("Session timeout loaded", Integer.valueOf(i11));
        }
        int i12 = zzfrVar.zzd;
        if (i12 != -1) {
            boolean z11 = 1 == i12;
            enableAutoActivityTracking(z11);
            zzP("Auto activity tracking loaded", Boolean.valueOf(z11));
        }
        int i13 = zzfrVar.zze;
        if (i13 != -1) {
            if (i13 != 0) {
                set("&aip", "1");
            }
            zzP("Anonymize ip loaded", Boolean.valueOf(1 == i13));
        }
        enableExceptionReporting(zzfrVar.zzf == 1);
    }
}
