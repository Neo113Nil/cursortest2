package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DefaultClock;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzl {
    public static boolean c = false;
    public static boolean d = false;
    public static final /* synthetic */ int zza = 0;
    public final List a;
    public static final Object b = new Object();
    public static final DefaultClock e = DefaultClock.a;
    public static final HashSet f = new HashSet(Arrays.asList(new String[0]));

    public zzl(@Nullable String str) {
        this.a = !zzj() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static void a(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name(U3.i.X).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(U3.i.X).value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static void zzg() {
        synchronized (b) {
            c = false;
            d = false;
            zzo.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean zzi() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static boolean zzj() {
        boolean z;
        synchronized (b) {
            try {
                z = false;
                if (c && d) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void b(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            JsonWriter name = jsonWriter.name("timestamp");
            e.getClass();
            name.value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzo.zzg("unable to log", e2);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (zzl.class) {
            try {
                zzo.zzh("GMA Debug BEGIN");
                int i = 0;
                while (i < stringWriter2.length()) {
                    int i2 = i + 4000;
                    zzo.zzh("GMA Debug CONTENT ".concat(stringWriter2.substring(i, Math.min(i2, stringWriter2.length()))));
                    i = i2;
                }
                zzo.zzh("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        if (zzj()) {
            b("onNetworkRequest", new zzj(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void zzb(String str, String str2, @Nullable Map map, @Nullable byte[] bArr) {
        if (zzj()) {
            b("onNetworkRequest", new zzj(str, C4094gc.a, map, bArr));
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i) {
        if (zzj()) {
            String str = null;
            b("onNetworkResponse", new zzg(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    zzo.zzi("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                b("onNetworkRequestError", new zzi(str));
            }
        }
    }

    public final void zzd(@Nullable Map map, int i) {
        if (zzj()) {
            b("onNetworkResponse", new zzg(i, map));
            if (i < 200 || i >= 300) {
                b("onNetworkRequestError", new zzi(null));
            }
        }
    }

    public final void zze(@Nullable String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        b("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                Object obj = zzl.b;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(encodeToString);
                } else {
                    String zzg = zzf.zzg(encodeToString);
                    if (zzg != null) {
                        jsonWriter.name("bodydigest").value(zzg);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl() {
        throw null;
    }
}
