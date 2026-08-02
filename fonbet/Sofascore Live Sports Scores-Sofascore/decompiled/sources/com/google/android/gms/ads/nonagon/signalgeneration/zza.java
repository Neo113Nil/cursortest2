package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzgxw;
import defpackage.qio;
import defpackage.v0l;
import defpackage.y0l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zza {
    public final Context a;
    public final ApplicationInfo b;
    public final ArrayList c;
    public final VersionInfoParcel d;
    public final JSONObject e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zza(Context context, ArrayList arrayList, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = context.getApplicationInfo();
        this.c = arrayList;
        this.d = versionInfoParcel;
    }

    public final void zza(@Nullable WebView webView) {
        if (this.f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = this.b;
        if (applicationInfo != null) {
            try {
                packageInfo = Wrappers.a(this.a).b(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.e;
        if (packageInfo != null) {
            try {
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PawAppSignalGenerator.initialize", e);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ub)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.d.afmaVersion);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzblm.b.c()).booleanValue() && y0l.b("DOCUMENT_START_SCRIPT") && webView != null) {
            String format = String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.tb), zzb());
            int i = zzgxw.c;
            qio qioVar = new qio("*");
            int i2 = v0l.a;
            if (!y0l.g.b()) {
                throw y0l.a();
            }
        }
    }

    public final JSONObject zzb() {
        if (!this.f.get()) {
            zza(null);
        }
        return this.e;
    }
}
