package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.exoplayer2.C;
import com.google.common.net.HttpHeaders;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class r0 {
    private static final List f = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;
    private final d4 c;
    private d d;
    private final Set e = Collections.synchronizedSet(new HashSet());

    public static class b {
        private long a;
        private long b;

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }

    private class c implements Consumer {
        private final String a;
        private final com.applovin.impl.sdk.network.a b;
        private final String c;
        private final Object d;
        private final boolean e;
        private final b f;
        private final e g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x0184: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:75:0x0183 */
        @Override // androidx.core.util.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(d4.d dVar) {
            MalformedURLException malformedURLException;
            int i;
            int i2;
            long e = dVar.e();
            Object obj = null;
            try {
                try {
                    i = dVar.c();
                    try {
                        if (i > 0) {
                            try {
                                if (i < 200 || i >= 400) {
                                    this.g.a(this.a, i, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f;
                                    if (bVar != null) {
                                        bVar.a(e);
                                    }
                                    r0.this.a(this.c, this.a, i, e);
                                    byte[] d = dVar.d();
                                    if (q7.h(com.applovin.impl.sdk.l.p()) && (!this.e || w4.b(d) != w4.a.V2)) {
                                        r0.this.a.u().a(d != null ? new String(dVar.d(), Charset.forName(C.UTF8_NAME)) : "", this.a, this.b.b() != null ? this.b.b().toString() : "");
                                    }
                                    if (d == null) {
                                        this.g.a(this.a, this.d, i);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName(C.UTF8_NAME));
                                    b bVar2 = this.f;
                                    if (bVar2 != null) {
                                        bVar2.b(d.length);
                                        if (this.b.r()) {
                                            r0.this.d = new d(this.b.f(), d.length, e);
                                        }
                                    }
                                    if (this.e) {
                                        String b = w4.b(d, r0.this.a);
                                        if (b == null) {
                                            HashMap<String, String> hashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.a));
                                            if (((Boolean) r0.this.a.a(z4.O5)).booleanValue()) {
                                                CollectionUtils.putStringIfValid("details", str, hashMap);
                                            }
                                            r0.this.a.E().d(f2.n1, hashMap);
                                        }
                                        str = b;
                                    }
                                    try {
                                        this.g.a(this.a, r0.this.a(str, this.d), i);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        com.applovin.impl.sdk.p unused = r0.this.b;
                                        if (com.applovin.impl.sdk.p.a()) {
                                            r0.this.b.a("ConnectionManager", str2, th);
                                        }
                                        r0.this.a.E().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.a)));
                                        this.g.a(this.a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e2) {
                                    e = e2;
                                }
                            } catch (MalformedURLException e3) {
                                malformedURLException = e3;
                                i = i2;
                            }
                        } else {
                            try {
                                r0.this.a(this.c, this.a, i, e, (Throwable) null);
                                this.g.a(this.a, i, null, null);
                                return;
                            } catch (MalformedURLException e4) {
                                e = e4;
                                i = i;
                            }
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                    }
                    malformedURLException = e;
                } catch (Throwable th2) {
                    int b2 = dVar.b();
                    try {
                        byte[] f = dVar.f();
                        String str3 = new String(f);
                        if (f != null) {
                            if (this.e) {
                                str3 = w4.b(f, r0.this.a);
                            }
                            obj = r0.this.a(str3, this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    r0.this.a(this.c, this.a, b2, e, th2);
                    this.g.a(this.a, b2, th2.getMessage(), obj);
                    return;
                }
            } catch (MalformedURLException e6) {
                malformedURLException = e6;
                i = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.d != null) {
                r0.this.a(this.c, this.a, i, e, malformedURLException2);
                this.g.a(this.a, -901, malformedURLException2.getMessage(), null);
            } else {
                r0.this.a(this.c, this.a, i, e);
                this.g.a(this.a, this.d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }
    }

    public static class d {
        private final long a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        public d(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.c;
        }

        public long c() {
            return this.a;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d = d();
            String d2 = dVar.d();
            return d != null ? d.equals(d2) : d2 == null;
        }

        public int hashCode() {
            long c = c();
            long b = b();
            int i = ((((int) (c ^ (c >>> 32))) + 59) * 59) + ((int) (b ^ (b >>> 32)));
            long a = a();
            String d = d();
            return (((i * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (d == null ? 43 : d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.d;
        }
    }

    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public r0(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        d4 d4Var = new d4(lVar);
        this.c = d4Var;
        d4Var.a();
    }

    private String c(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    public void b(String str) {
        if (((Boolean) this.a.a(z4.z3)).booleanValue()) {
            String hostAndPath = StringUtils.getHostAndPath(str);
            if (TextUtils.isEmpty(hostAndPath)) {
                return;
            }
            this.e.add(hostAndPath);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0209 A[Catch: all -> 0x013e, TRY_LEAVE, TryCatch #4 {all -> 0x013e, blocks: (B:96:0x00ff, B:99:0x012c, B:40:0x016d, B:42:0x017d, B:45:0x019e, B:48:0x01ef, B:51:0x01fe, B:53:0x0209, B:54:0x01a2, B:57:0x01aa, B:63:0x01c1, B:65:0x01c7, B:66:0x01dd, B:71:0x018b, B:74:0x0212, B:76:0x022a, B:77:0x0238, B:100:0x0128, B:60:0x01bb), top: B:95:0x00ff, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        String str;
        Throwable th;
        boolean z;
        d4.c.a a2;
        d4 d4Var;
        String str2;
        byte[] bytes;
        byte[] a3;
        if (aVar != null) {
            String f2 = aVar.f();
            String h = aVar.h();
            if (f2 == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (h == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!f2.toLowerCase().startsWith("http")) {
                    String str3 = "Requested postback submission to non HTTP endpoint " + f2 + "; skipping...";
                    com.applovin.impl.sdk.p.h("ConnectionManager", str3);
                    eVar.a(f2, AppLovinErrorCodes.INVALID_URL, str3, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(f2);
                HashMap hashMap = new HashMap(2);
                boolean m = aVar.m();
                w4.a a4 = ((Boolean) this.a.a(z4.t5)).booleanValue() ? w4.a.a(((Integer) this.a.a(z4.q5)).intValue()) : aVar.e();
                long a5 = q7.a(this.a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map i = aVar.i();
                    Boolean bool = (Boolean) this.a.a(z4.n3);
                    if (i != null && aVar.c() > 0) {
                        i.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (m) {
                        String a6 = q7.a(i, bool.booleanValue());
                        String b2 = w4.b(a6, a5, a4, this.a);
                        if (StringUtils.isValidString(a6) && TextUtils.isEmpty(b2)) {
                            CollectionUtils.putStringIfValid("query", a6, hashMap);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", b2);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, i, bool.booleanValue());
                    }
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(httpsString), f);
                    if (com.applovin.impl.sdk.p.a()) {
                        try {
                            z = m;
                            this.b.d("ConnectionManager", "Sending " + h + " request to id=#" + httpsString.hashCode() + " \"" + (endsWith.booleanValue() ? httpsString : StringUtils.getHostAndPath(httpsString)) + "\"...");
                        } catch (Throwable th2) {
                            th = th2;
                            str = h;
                            a(str, httpsString, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th);
                            eVar.a(httpsString, 0, th.getMessage(), null);
                            return;
                        }
                    } else {
                        z = m;
                    }
                    a2 = new d4.c.a().a(httpsString).b(h).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (z) {
                            bytes = w4.a(aVar.b().toString(), a5, a4, this.a);
                            if (bytes == null) {
                                CollectionUtils.putStringIfValid("body", aVar.b().toString(), hashMap);
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes(C.UTF8_NAME);
                        }
                        byte[] bArr = bytes;
                        if ((!z || a4 != w4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.a.a(z4.P5)).intValue()) {
                            try {
                                a3 = q7.a(bArr);
                            } catch (Throwable th3) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.b.a("ConnectionManager", "Failed to gzip POST body for request " + c(httpsString), th3);
                                }
                                this.a.E().a("ConnectionManager", "gzip", th3, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString)));
                            }
                            a2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && a3 != null) {
                                a2.a(HttpHeaders.CONTENT_ENCODING, "gzip");
                                a2.a(a3);
                            } else if (bArr != null) {
                                a2.a(bArr);
                            }
                        }
                        a3 = null;
                        a2.a("Content-Type", "application/json; charset=utf-8");
                        if (!aVar.o()) {
                        }
                        if (bArr != null) {
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        HashMap<String, String> hashMap2 = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString));
                        if (((Boolean) this.a.a(z4.O5)).booleanValue()) {
                            CollectionUtils.putStringIfValid("details", new JSONObject(hashMap).toString(), hashMap2);
                        }
                        this.a.E().a(f2.m1, UByte$$ExternalSyntheticBackport0.m(",", hashMap.keySet()), hashMap2);
                    }
                    d4Var = this.c;
                    str2 = httpsString;
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    c cVar = new c(str2, aVar, h, aVar.d(), z, bVar, eVar);
                    httpsString = str2;
                    str = h;
                    try {
                        d4Var.a(a2.a(cVar).a(this.a.s0().c()).a());
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        a(str, httpsString, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th);
                        eVar.a(httpsString, 0, th.getMessage(), null);
                        return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    httpsString = str2;
                    str = h;
                    th = th;
                    a(str, httpsString, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th);
                    eVar.a(httpsString, 0, th.getMessage(), null);
                    return;
                }
            }
            throw new IllegalArgumentException("No callback specified");
        }
        throw new IllegalArgumentException("No request specified");
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.contains(str);
    }

    public d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj != null) {
            if (str != null && str.length() >= 3) {
                if (obj instanceof JSONObject) {
                    return new JSONObject(str);
                }
                if (obj instanceof q8) {
                    return r8.a(str, this.a);
                }
                if (!(obj instanceof String)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
                    }
                }
            }
            return obj;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + s0.g(this.a) + " to " + c(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + s0.g(this.a) + " to " + c(str2), th);
        }
    }
}
