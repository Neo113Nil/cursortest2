package k5;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.q4;
import com.appsflyer.AdRevenueScheme;
import d5.j;
import d5.t;
import d5.u;
import d5.w;
import e5.i;
import e5.l;
import e5.n;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18833a;

    /* renamed from: b, reason: collision with root package name */
    public final f5.d f18834b;

    /* renamed from: c, reason: collision with root package name */
    public final l5.d f18835c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f18836d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f18837e;

    /* renamed from: f, reason: collision with root package name */
    public final m5.c f18838f;

    /* renamed from: g, reason: collision with root package name */
    public final n5.a f18839g;

    /* renamed from: h, reason: collision with root package name */
    public final n5.a f18840h;

    /* renamed from: i, reason: collision with root package name */
    public final l5.c f18841i;

    public h(Context context, f5.d dVar, l5.d dVar2, v0 v0Var, Executor executor, m5.c cVar, n5.a aVar, n5.a aVar2, l5.c cVar2) {
        this.f18833a = context;
        this.f18834b = dVar;
        this.f18835c = dVar2;
        this.f18836d = v0Var;
        this.f18837e = executor;
        this.f18838f = cVar;
        this.f18839g = aVar;
        this.f18840h = aVar2;
        this.f18841i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i iVar, int i5) {
        byte[] bArr;
        long j;
        f5.a aVar;
        String str;
        f5.a aVar2;
        int i10;
        c5.b b10;
        String str2;
        Integer num;
        q4 q4Var;
        int i11;
        final h hVar = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.f8642b;
        f5.e a7 = hVar.f18834b.a(iVar2.f8641a);
        long j6 = 0;
        while (true) {
            final int i12 = 0;
            m5.b bVar = new m5.b(hVar) { // from class: k5.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f18826b;

                {
                    this.f18826b = hVar;
                }

                @Override // m5.b
                public final Object i() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar3 = iVar2;
                            l5.i iVar4 = (l5.i) this.f18826b.f18835c;
                            SQLiteDatabase c2 = iVar4.c();
                            c2.beginTransaction();
                            try {
                                Long k6 = l5.i.k(c2, iVar3);
                                if (k6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar4.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{k6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th2) {
                                        rawQuery.close();
                                        throw th2;
                                    }
                                }
                                c2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                c2.endTransaction();
                            }
                        default:
                            l5.i iVar5 = (l5.i) this.f18826b.f18835c;
                            iVar5.getClass();
                            return (Iterable) iVar5.n(new com.google.firebase.messaging.g(24, iVar5, iVar2));
                    }
                }
            };
            l5.i iVar3 = (l5.i) hVar.f18838f;
            if (!((Boolean) iVar3.w(bVar)).booleanValue()) {
                iVar3.w(new j9.f(j6, hVar, iVar2));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) iVar3.w(new m5.b(hVar) { // from class: k5.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f18826b;

                {
                    this.f18826b = hVar;
                }

                @Override // m5.b
                public final Object i() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            i iVar32 = iVar2;
                            l5.i iVar4 = (l5.i) this.f18826b.f18835c;
                            SQLiteDatabase c2 = iVar4.c();
                            c2.beginTransaction();
                            try {
                                Long k6 = l5.i.k(c2, iVar32);
                                if (k6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar4.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{k6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th2) {
                                        rawQuery.close();
                                        throw th2;
                                    }
                                }
                                c2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                c2.endTransaction();
                            }
                        default:
                            l5.i iVar5 = (l5.i) this.f18826b.f18835c;
                            iVar5.getClass();
                            return (Iterable) iVar5.n(new com.google.firebase.messaging.g(24, iVar5, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a7 == null) {
                ci.c.m(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new f5.a(3, -1L);
                bArr = bArr2;
                j = j6;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((l5.b) it.next()).f19373c);
                }
                if (bArr2 != null) {
                    l5.c cVar = hVar.f18841i;
                    Objects.requireNonNull(cVar);
                    h5.a aVar3 = (h5.a) iVar3.w(new io.sentry.android.core.internal.gestures.c(9, cVar));
                    a0 a0Var = new a0(7);
                    a0Var.f685g = new HashMap();
                    a0Var.f683e = Long.valueOf(hVar.f18839g.getTime());
                    a0Var.f684f = Long.valueOf(hVar.f18840h.getTime());
                    a0Var.f680b = "GDT_CLIENT_METRICS";
                    b5.c cVar2 = new b5.c("proto");
                    aVar3.getClass();
                    kh.g gVar = n.f8654a;
                    gVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        gVar.l(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    a0Var.f682d = new l(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((c5.c) a7).a(a0Var.p()));
                }
                c5.c cVar3 = (c5.c) a7;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    e5.h hVar2 = (e5.h) it2.next();
                    String str3 = hVar2.f8635a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    e5.h hVar3 = (e5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f8242a;
                    long time = cVar3.f3649f.getTime();
                    long time2 = cVar3.f3648e.getTime();
                    j jVar = new j(new d5.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a(CommonUrlParts.MODEL), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a(CommonUrlParts.MANUFACTURER), hVar3.a("fingerprint"), hVar3.a(CommonUrlParts.LOCALE), hVar3.a(AdRevenueScheme.COUNTRY), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (e5.h hVar4 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        l lVar = hVar4.f8637c;
                        b5.c cVar4 = lVar.f8651a;
                        byte[] bArr4 = lVar.f8652b;
                        long j10 = j6;
                        if (cVar4.equals(new b5.c("proto"))) {
                            q4Var = new q4(2);
                            q4Var.f895e = bArr4;
                        } else if (cVar4.equals(new b5.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            q4 q4Var2 = new q4(2);
                            q4Var2.f896f = str4;
                            q4Var = q4Var2;
                        } else {
                            String w10 = ci.c.w("CctTransportBackend");
                            if (Log.isLoggable(w10, 5)) {
                                w0.m(w10, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j6 = j10;
                        }
                        q4Var.f892b = Long.valueOf(hVar4.f8638d);
                        q4Var.f894d = Long.valueOf(hVar4.f8639e);
                        String str5 = (String) hVar4.f8640f.get("tz-offset");
                        q4Var.f897g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        q4Var.f898h = new d5.n((u) u.f8240a.get(hVar4.b("net-type")), (t) t.f8238a.get(hVar4.b("mobile-subtype")));
                        Integer num2 = hVar4.f8636b;
                        if (num2 != null) {
                            q4Var.f893c = num2;
                        }
                        String str6 = ((Long) q4Var.f892b) == null ? " eventTimeMs" : "";
                        if (((Long) q4Var.f894d) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) q4Var.f897g) == null) {
                            str6 = k.l(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new d5.k(((Long) q4Var.f892b).longValue(), (Integer) q4Var.f893c, ((Long) q4Var.f894d).longValue(), (byte[]) q4Var.f895e, (String) q4Var.f896f, ((Long) q4Var.f897g).longValue(), (d5.n) q4Var.f898h));
                        bArr2 = bArr3;
                        j6 = j10;
                    }
                    arrayList3.add(new d5.l(time, time2, jVar, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j6;
                d5.i iVar4 = new d5.i(arrayList3);
                URL url = cVar3.f3647d;
                if (bArr != null) {
                    try {
                        c5.a a10 = c5.a.a(bArr);
                        str = a10.f3640b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a10.f3639a;
                        if (str7 != null) {
                            url = c5.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new f5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    v0 v0Var = new v0(url, iVar4, str, 3);
                    androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar4 = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(1, cVar3);
                    int i14 = 5;
                    do {
                        b10 = aVar4.b(v0Var);
                        URL url2 = b10.f3642b;
                        if (url2 != null) {
                            ci.c.m(url2, "CctTransportBackend", "Following redirect to: %s");
                            v0Var = new v0(url2, (d5.i) v0Var.f365c, (String) v0Var.f366d, 3);
                        } else {
                            v0Var = null;
                        }
                        if (v0Var == null) {
                            break;
                        } else {
                            i14--;
                        }
                    } while (i14 >= 1);
                    int i15 = b10.f3641a;
                    if (i15 == 200) {
                        aVar2 = new f5.a(1, b10.f3643c);
                    } else {
                        if (i15 >= 500 || i15 == 404) {
                            aVar = new f5.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new f5.a(4, -1L);
                            } catch (IOException e7) {
                                e = e7;
                                ci.c.p("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new f5.a(2, -1L);
                                i11 = aVar2.f9462a;
                                if (i11 != i10) {
                                }
                            }
                        } else {
                            aVar = new f5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e9) {
                    e = e9;
                }
            }
            i10 = 2;
            i11 = aVar2.f9462a;
            if (i11 != i10) {
                iVar3.w(new g(this, iterable, iVar, j));
                this.f18836d.X(iVar, i5 + 1, true);
                return;
            }
            hVar = this;
            iVar2 = iVar;
            j6 = j;
            iVar3.w(new com.google.firebase.messaging.g(22, hVar, iterable));
            if (i11 == 1) {
                j6 = Math.max(j6, aVar2.f9463b);
                if (bArr != null) {
                    iVar3.w(new io.sentry.android.core.internal.gestures.c(11, hVar));
                }
            } else if (i11 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    String str8 = ((l5.b) it3.next()).f19373c.f8635a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                iVar3.w(new com.google.firebase.messaging.g(23, hVar, hashMap2));
            }
            bArr2 = bArr;
        }
    }
}
