package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcak;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class QueryInfo {
    public final zzex a;

    public QueryInfo(zzex zzexVar) {
        this.a = zzexVar;
    }

    public static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbjg.a(context);
        if (((Boolean) zzblf.j.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        new zzcak(context, adFormat, adRequest2 == null ? null : adRequest2.zza(), str).b(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzcak(context, adFormat, adRequest == null ? null : adRequest.zza(), str).b(queryInfoGenerationCallback);
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull String str, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.j(str, "AdUnitId cannot be null.");
        a(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }

    @NonNull
    public String getQuery() {
        return this.a.zza();
    }

    @NonNull
    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.a.zzc();
    }

    @NonNull
    @KeepForSdk
    public String getRequestId() {
        return this.a.zzb();
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        a(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }
}
