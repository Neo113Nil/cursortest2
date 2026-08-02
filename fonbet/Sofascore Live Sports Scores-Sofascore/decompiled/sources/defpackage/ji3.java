package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.DateUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgia;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.consent_sdk.zzcf;
import com.google.android.gms.internal.consent_sdk.zzcg;
import com.google.android.gms.internal.consent_sdk.zzch;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.consent_sdk.zzck;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzcn;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ji3 implements zzgia {
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ ji3(Object obj, Object obj2, Executor executor, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = executor;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public /* bridge */ /* synthetic */ ji3 a(Context context) {
        context.getClass();
        this.c = context;
        return this;
    }

    public void b(int i, long j2) {
        if (i == 0) {
            i(new l58("Unable to fetch the latest version of the template."));
        } else {
            ((ScheduledExecutorService) this.g).schedule(new ci3(this, i, j2, 0), ((Random) this.e).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public ii3 c(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b = ((ConfigFetchHttpClient) this.g).b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.g;
            HashMap f = f();
            String string = ((qi3) this.h).a.getString("last_fetch_etag", null);
            iu iuVar = (iu) ((vff) this.b).get();
            ii3 fetch = configFetchHttpClient.fetch(b, str, str2, f, string, hashMap, iuVar != null ? (Long) iuVar.e(true).get("_fot") : null, date, ((qi3) this.h).b());
            fi3 fi3Var = fetch.b;
            if (fi3Var != null) {
                qi3 qi3Var = (qi3) this.h;
                long j2 = fi3Var.f;
                synchronized (qi3Var.b) {
                    qi3Var.a.edit().putLong("last_template_version", j2).apply();
                }
            }
            String str4 = fetch.c;
            if (str4 != null) {
                qi3 qi3Var2 = (qi3) this.h;
                synchronized (qi3Var2.b) {
                    qi3Var2.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((qi3) this.h).d(0, qi3.f);
            return fetch;
        } catch (l58 e) {
            int i = e.a;
            qi3 qi3Var3 = (qi3) this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                qi3Var3.d(qi3Var3.a().a + 1, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(j[Math.min(r14, 8) - 1]) / 2) + ((Random) this.e).nextInt((int) r3)));
            }
            pi3 a = qi3Var3.a();
            int i2 = e.a;
            if (a.a > 1 || i2 == 429) {
                a.b.getTime();
                throw new h58("Fetch was throttled.");
            }
            if (i2 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i2 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i2 == 429) {
                    throw new f58("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i2 != 500) {
                    switch (i2) {
                        case 502:
                        case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                        case PglCryptUtils.BASE64_FAILED /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new l58(e.a, "Fetch failed: ".concat(str3), e);
        }
    }

    public Task d(Task task, long j2, HashMap hashMap) {
        ji3 ji3Var;
        Task continueWithTask;
        Executor executor = (Executor) this.c;
        l48 l48Var = (l48) this.a;
        qi3 qi3Var = (qi3) this.h;
        Date date = new Date(((Clock) this.d).a());
        if (task.isSuccessful()) {
            Date date2 = new Date(qi3Var.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(qi3.e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()))) {
                return Tasks.forResult(new ii3(2, null, null));
            }
        }
        Date date3 = qi3Var.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            continueWithTask = Tasks.forException(new h58(str));
            ji3Var = this;
        } else {
            k48 k48Var = (k48) l48Var;
            Task c = k48Var.c();
            Task d = k48Var.d();
            ji3Var = this;
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{c, d}).continueWithTask(executor, new hi3(ji3Var, c, d, date, hashMap, 0));
        }
        return continueWithTask.continueWithTask(executor, new o3(6, ji3Var, date));
    }

    public Task e(int i) {
        HashMap hashMap = new HashMap((Map) this.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return ((di3) this.f).b().continueWithTask((Executor) this.c, new o3(7, this, hashMap));
    }

    public HashMap f() {
        HashMap hashMap = new HashMap();
        iu iuVar = (iu) ((vff) this.b).get();
        if (iuVar != null) {
            for (Map.Entry entry : iuVar.e(false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public void g(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C4427z5.O));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = str.concat(readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                int lastIndexOf = str.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                str = (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e) {
                        i(new f58("Unable to parse config update message.", e.getCause()));
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((mi3) this.d).a(new l58("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.a).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j2 = ((qi3) ((ji3) this.c).h).a.getLong("last_template_version", 0L);
                        long j3 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j3 > j2) {
                            b(3, j3);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        j(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0413 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(jv0 jv0Var, int i) {
        byte[] bArr;
        uxj uxjVar;
        long j2;
        is0 is0Var;
        String str;
        is0 is0Var2;
        int i2;
        bm2 a;
        String str2;
        Integer num;
        long j3;
        ji3 ji3Var;
        int i3;
        final ji3 ji3Var2 = this;
        final jv0 jv0Var2 = jv0Var;
        byte[] bArr2 = jv0Var2.b;
        mlg mlgVar = (mlg) ji3Var2.f;
        uxj a2 = ((sic) ji3Var2.b).a(jv0Var2.a);
        long j4 = 0;
        while (true) {
            final int i4 = 0;
            if (!((Boolean) mlgVar.n(new lqi(ji3Var2) { // from class: cek
                public final /* synthetic */ ji3 b;

                {
                    this.b = ji3Var2;
                }

                @Override // defpackage.lqi
                public final Object v() {
                    Boolean bool;
                    int i5 = i4;
                    jv0 jv0Var3 = jv0Var2;
                    ji3 ji3Var3 = this.b;
                    switch (i5) {
                        case 0:
                            mlg mlgVar2 = (mlg) ji3Var3.d;
                            SQLiteDatabase h = mlgVar2.h();
                            h.beginTransaction();
                            try {
                                Long i6 = mlg.i(h, jv0Var3);
                                if (i6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = mlgVar2.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                h.setTransactionSuccessful();
                                return bool;
                            } finally {
                                h.endTransaction();
                            }
                        default:
                            mlg mlgVar3 = (mlg) ji3Var3.d;
                            mlgVar3.getClass();
                            return (Iterable) mlgVar3.j(new ow9(12, mlgVar3, jv0Var3));
                    }
                }
            })).booleanValue()) {
                mlgVar.n(new gi3(ji3Var2, jv0Var2, j4));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) mlgVar.n(new lqi(ji3Var2) { // from class: cek
                public final /* synthetic */ ji3 b;

                {
                    this.b = ji3Var2;
                }

                @Override // defpackage.lqi
                public final Object v() {
                    Boolean bool;
                    int i52 = i5;
                    jv0 jv0Var3 = jv0Var2;
                    ji3 ji3Var3 = this.b;
                    switch (i52) {
                        case 0:
                            mlg mlgVar2 = (mlg) ji3Var3.d;
                            SQLiteDatabase h = mlgVar2.h();
                            h.beginTransaction();
                            try {
                                Long i6 = mlg.i(h, jv0Var3);
                                if (i6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = mlgVar2.h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                h.setTransactionSuccessful();
                                return bool;
                            } finally {
                                h.endTransaction();
                            }
                        default:
                            mlg mlgVar3 = (mlg) ji3Var3.d;
                            mlgVar3.getClass();
                            return (Iterable) mlgVar3.j(new ow9(12, mlgVar3, jv0Var3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                d7a.t(jv0Var2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                is0Var2 = new is0(3, -1L);
                bArr = bArr2;
                uxjVar = a2;
                j2 = j4;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((su0) it.next()).c);
                }
                if (bArr2 != null) {
                    mlg mlgVar2 = (mlg) ji3Var2.i;
                    Objects.requireNonNull(mlgVar2);
                    qx2 qx2Var = (qx2) mlgVar.n(new bek(mlgVar2, i4));
                    c40 c40Var = new c40();
                    c40Var.g = new HashMap();
                    c40Var.e = Long.valueOf(((wy2) ji3Var2.g).getTime());
                    c40Var.f = Long.valueOf(((wy2) ji3Var2.h).getTime());
                    c40Var.b = "GDT_CLIENT_METRICS";
                    kn5 kn5Var = new kn5("proto");
                    qx2Var.getClass();
                    k1d k1dVar = xef.a;
                    k1dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        k1dVar.r(qx2Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c40Var.d = new dn5(kn5Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((cm2) a2).a(c40Var.i()));
                }
                cm2 cm2Var = (cm2) a2;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    du0 du0Var = (du0) it2.next();
                    String str3 = du0Var.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(du0Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(du0Var);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    du0 du0Var2 = (du0) ((List) entry.getValue()).get(0);
                    mif mifVar = mif.a;
                    long time = cm2Var.f.getTime();
                    long time2 = cm2Var.e.getTime();
                    ks0 ks0Var = new ks0(new hs0(Integer.valueOf(du0Var2.b("sdk-version")), du0Var2.a(L6.B), du0Var2.a("hardware"), du0Var2.a(U3.i.G), du0Var2.a("product"), du0Var2.a("os-uild"), du0Var2.a("manufacturer"), du0Var2.a("fingerprint"), du0Var2.a("locale"), du0Var2.a("country"), du0Var2.a("mcc_mnc"), du0Var2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (du0 du0Var3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        dn5 dn5Var = du0Var3.c;
                        uxj uxjVar2 = a2;
                        byte[] bArr4 = du0Var3.j;
                        kn5 kn5Var2 = dn5Var.a;
                        byte[] bArr5 = dn5Var.b;
                        if (kn5Var2.equals(new kn5("proto"))) {
                            ji3Var = new ji3();
                            ji3Var.e = bArr5;
                            j3 = j4;
                        } else {
                            j3 = j4;
                            if (kn5Var2.equals(new kn5("json"))) {
                                String str4 = new String(bArr5, Charset.forName(C.UTF8_NAME));
                                ji3 ji3Var3 = new ji3();
                                ji3Var3.f = str4;
                                ji3Var = ji3Var3;
                            } else {
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                    kn5Var2.toString();
                                }
                                bArr2 = bArr3;
                                a2 = uxjVar2;
                                j4 = j3;
                            }
                        }
                        ji3Var.a = Long.valueOf(du0Var3.d);
                        ji3Var.d = Long.valueOf(du0Var3.e);
                        String str5 = (String) du0Var3.f.get("tz-offset");
                        ji3Var.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        ji3Var.h = new ru0((w9d) w9d.a.get(du0Var3.b("net-type")), (v9d) v9d.a.get(du0Var3.b("mobile-subtype")));
                        Integer num2 = du0Var3.b;
                        if (num2 != null) {
                            ji3Var.b = num2;
                        }
                        Integer num3 = du0Var3.g;
                        if (num3 != null) {
                            hu0 hu0Var = new hu0(new gu0(num3));
                            gb3 gb3Var = gb3.a;
                            ji3Var.c = new ls0(hu0Var);
                        }
                        byte[] bArr6 = du0Var3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            ji3Var.i = new fu0(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String str6 = ((Long) ji3Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) ji3Var.d) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) ji3Var.g) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            a70.r("Missing required properties:".concat(str6));
                            return;
                        }
                        arrayList4.add(new ou0(((Long) ji3Var.a).longValue(), (Integer) ji3Var.b, (ls0) ji3Var.c, ((Long) ji3Var.d).longValue(), (byte[]) ji3Var.e, (String) ji3Var.f, ((Long) ji3Var.g).longValue(), (ru0) ji3Var.h, (fu0) ji3Var.i));
                        bArr2 = bArr3;
                        a2 = uxjVar2;
                        j4 = j3;
                    }
                    arrayList3.add(new pu0(time, time2, ks0Var, num, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                uxjVar = a2;
                j2 = j4;
                js0 js0Var = new js0(arrayList3);
                URL url = cm2Var.d;
                if (bArr != null) {
                    try {
                        zc2 a3 = zc2.a(bArr);
                        str = a3.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a3.a;
                        if (str7 != null) {
                            url = cm2.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        is0Var = new is0(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    l2a l2aVar = new l2a(5, url, js0Var, str);
                    l1 l1Var = new l1(cm2Var, 11);
                    int i6 = 5;
                    do {
                        a = l1Var.a(l2aVar);
                        URL url2 = (URL) a.d;
                        if (url2 != null) {
                            d7a.t(url2, "CctTransportBackend", "Following redirect to: %s");
                            l2aVar = new l2a(5, url2, (js0) l2aVar.c, (String) l2aVar.d);
                        } else {
                            l2aVar = null;
                        }
                        if (l2aVar == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = a.c;
                    if (i7 == 200) {
                        is0Var2 = new is0(1, a.b);
                    } else {
                        if (i7 >= 500 || i7 == 404) {
                            is0Var = new is0(2, -1L);
                        } else if (i7 == 400) {
                            try {
                                is0Var = new is0(4, -1L);
                            } catch (IOException unused4) {
                                d7a.A("CctTransportBackend");
                                i2 = 2;
                                is0Var2 = new is0(2, -1L);
                                i3 = is0Var2.a;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            is0Var = new is0(3, -1L);
                        }
                        is0Var2 = is0Var;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            i3 = is0Var2.a;
            if (i3 != i2) {
                mlgVar.n(new dw4(this, iterable, jv0Var, j2));
                ((sx2) this.e).J(jv0Var, i + 1, true);
                return;
            }
            ji3Var2 = this;
            jv0Var2 = jv0Var;
            long j5 = j2;
            mlgVar.n(new ow9(16, ji3Var2, iterable));
            if (i3 == 1) {
                j4 = Math.max(j5, is0Var2.b);
                if (bArr != null) {
                    mlgVar.n(new imf(ji3Var2, 26));
                }
            } else {
                if (i3 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        String str8 = ((su0) it3.next()).c.a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    mlgVar.n(new ow9(17, ji3Var2, hashMap2));
                }
                j4 = j5;
            }
            bArr2 = bArr;
            a2 = uxjVar;
        }
    }

    public synchronized void i(g58 g58Var) {
        Iterator it = ((LinkedHashSet) this.a).iterator();
        while (it.hasNext()) {
            ((mi3) it.next()).a(g58Var);
        }
    }

    public synchronized void j(int i) {
        ((DefaultClock) this.i).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (i * 1000));
        qi3 qi3Var = (qi3) this.h;
        synchronized (qi3Var.d) {
            qi3Var.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public ewm k() {
        zzioe.b(Context.class, (Context) this.c);
        zzioe.b(Map.class, (HashMap) this.g);
        zzioe.b(zzaya.class, (zzaya) this.h);
        zzioe.b(zzgff.class, (zzgff) this.i);
        return new ewm((vdf) this.a, (qpn) this.b, (Context) this.c, (View) this.d, (Activity) this.e, (String) this.f, (HashMap) this.g, (zzaya) this.h, (zzgff) this.i);
    }

    public /* bridge */ /* synthetic */ ji3 l(zzaya zzayaVar) {
        zzayaVar.getClass();
        this.h = zzayaVar;
        return this;
    }

    public zzcn m(zzcl zzclVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent((Application) this.a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(C4094gc.b);
            httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), C.UTF8_NAME);
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzclVar.a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    zzch zzchVar = zzclVar.b;
                    if (zzchVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzchVar.c;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = zzchVar.a;
                        if (str2 != null) {
                            jsonWriter.name(L6.B);
                            jsonWriter.value(str2);
                        }
                        Integer num = zzchVar.b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = zzclVar.c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = zzclVar.d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzclVar.e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzclVar.f;
                    if (zzcjVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcjVar.a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcjVar.b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzcjVar.c;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzci> list = zzcjVar.d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzci zzciVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzciVar.a;
                                if (num4 != null) {
                                    jsonWriter.name(PlayerKt.E_SPORTS_TOP);
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzciVar.b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzciVar.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzciVar.d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcf zzcfVar = zzclVar.g;
                    if (zzcfVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = zzcfVar.a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = zzcfVar.b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzcfVar.c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    zzck zzckVar = zzclVar.h;
                    if (zzckVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = zzckVar.a;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzclVar.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((zzcg) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcn a = zzcn.a(new JsonReader(new StringReader(headerField)));
                        a.a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C.UTF8_NAME));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcn a2 = zzcn.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return a2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new zzg(4, e, "The server timed out.");
        } catch (IOException e2) {
            throw new zzg(2, e2, "Error making request.");
        }
    }
}
