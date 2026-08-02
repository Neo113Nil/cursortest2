package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfte;
import defpackage.bf3;
import defpackage.hsn;
import defpackage.me4;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class TaggingLibraryJsInterface {
    public final Context a;
    public final WebView b;
    public final zzbbd c;
    public final zzfma d;
    public final int e;
    public final zzeao f;
    public final boolean g;
    public final hsn h = zzcgj.f;
    public final zzfte i;
    public final zzj j;
    public final zza k;
    public final zze l;

    public TaggingLibraryJsInterface(WebView webView, zzbbd zzbbdVar, zzeao zzeaoVar, zzfte zzfteVar, zzfma zzfmaVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = zzbbdVar;
        this.f = zzeaoVar;
        zzbjg.a(context);
        this.e = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jb)).intValue();
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.kb)).booleanValue();
        this.i = zzfteVar;
        this.d = zzfmaVar;
        this.j = zzjVar;
        this.k = zzaVar;
        this.l = zzeVar;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(@NonNull String str) {
        try {
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            String zzg = this.c.b.zzg(this.a, str, this.b);
            if (this.g) {
                zzv.zze(this.f, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a() - a)));
            }
            return zzg;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(@NonNull final String str, int i) {
        if (i <= 0) {
            String g = me4.g(i, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 51));
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(g);
            return "";
        }
        try {
            return (String) zzcgj.a.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        final Bundle f = bf3.f("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, uuid);
        if (((Boolean) zzblm.e.c()).booleanValue()) {
            this.j.zzb(this.b, zzbfVar);
            return uuid;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.mb)).booleanValue()) {
            this.h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
                    TaggingLibraryJsInterface taggingLibraryJsInterface = TaggingLibraryJsInterface.this;
                    Context context = taggingLibraryJsInterface.a;
                    CookieManager zza = zzf.zza(context);
                    boolean acceptThirdPartyCookies = zza != null ? zza.acceptThirdPartyCookies(taggingLibraryJsInterface.b) : false;
                    Bundle bundle = f;
                    bundle.putBoolean("accept_3p_cookie", acceptThirdPartyCookies);
                    QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfVar);
                }
            });
            return uuid;
        }
        QueryInfo.generate(this.a, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, f).build(), zzbfVar);
        return uuid;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            String zzj = this.c.b.zzj(this.a, this.b, null);
            if (this.g) {
                zzv.zze(this.f, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a() - a)));
            }
            return zzj;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String g = me4.g(i, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 50));
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(g);
            return "";
        }
        try {
            return (String) zzcgj.a.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ob)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcgj.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfma zzfmaVar;
                TaggingLibraryJsInterface taggingLibraryJsInterface = TaggingLibraryJsInterface.this;
                WebView webView = taggingLibraryJsInterface.b;
                Context context = taggingLibraryJsInterface.a;
                Uri parse = Uri.parse(str);
                try {
                    parse = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hd)).booleanValue() || (zzfmaVar = taggingLibraryJsInterface.d) == null) ? taggingLibraryJsInterface.c.b(parse, context, webView, null) : zzfmaVar.a(parse, context, webView, null);
                } catch (zzbbe e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e);
                    com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.recordClick", e);
                }
                taggingLibraryJsInterface.i.b(parse.toString(), null, null, null);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(@NonNull String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i = 1;
                if (i5 != 1) {
                    i = 2;
                    if (i5 != 2) {
                        i = 3;
                        if (i5 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.c.b.zzd(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (JSONException e) {
                e = e;
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
        }
    }
}
