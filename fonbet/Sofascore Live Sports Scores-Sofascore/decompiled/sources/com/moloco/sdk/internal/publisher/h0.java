package com.moloco.sdk.internal.publisher;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.AccessToken;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.publisher.AdFormatType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a99;
import defpackage.apk;
import defpackage.ata;
import defpackage.av8;
import defpackage.b7k;
import defpackage.be5;
import defpackage.bkh;
import defpackage.cth;
import defpackage.dfj;
import defpackage.dh3;
import defpackage.dti;
import defpackage.dy9;
import defpackage.e12;
import defpackage.e1d;
import defpackage.e7k;
import defpackage.ema;
import defpackage.eqf;
import defpackage.fc6;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.ff5;
import defpackage.g12;
import defpackage.g28;
import defpackage.g30;
import defpackage.ga7;
import defpackage.h2;
import defpackage.ha5;
import defpackage.haa;
import defpackage.hf3;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hsk;
import defpackage.hz8;
import defpackage.if3;
import defpackage.ioi;
import defpackage.j2d;
import defpackage.jii;
import defpackage.joa;
import defpackage.joi;
import defpackage.k13;
import defpackage.km5;
import defpackage.kuj;
import defpackage.kx4;
import defpackage.lq9;
import defpackage.lu3;
import defpackage.luj;
import defpackage.lz;
import defpackage.mhb;
import defpackage.ml4;
import defpackage.mv1;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.njh;
import defpackage.nz;
import defpackage.o3a;
import defpackage.o3h;
import defpackage.o7g;
import defpackage.of3;
import defpackage.oyn;
import defpackage.p7j;
import defpackage.q50;
import defpackage.q9j;
import defpackage.r13;
import defpackage.r6g;
import defpackage.rd0;
import defpackage.rj2;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.s8l;
import defpackage.s9a;
import defpackage.sea;
import defpackage.sq3;
import defpackage.tc3;
import defpackage.td4;
import defpackage.u6b;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vdj;
import defpackage.waa;
import defpackage.wkn;
import defpackage.wnn;
import defpackage.wt3;
import defpackage.xd5;
import defpackage.xtc;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.yaa;
import defpackage.ypa;
import defpackage.yqo;
import defpackage.z45;
import defpackage.zg3;
import defpackage.zzl;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class h0 {
    public static boolean A(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static com.facebook.d0 B(AccessToken accessToken, String str, com.facebook.z zVar) {
        return new com.facebook.d0(accessToken, str, null, null, zVar);
    }

    public static com.facebook.d0 C(AccessToken accessToken, String str, JSONObject jSONObject, com.facebook.z zVar) {
        com.facebook.d0 d0Var = new com.facebook.d0(accessToken, str, null, com.facebook.h0.b, zVar);
        d0Var.c = jSONObject;
        return d0Var;
    }

    public static String D(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            a70.p("Unsupported parameter type.");
            return null;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        format.getClass();
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void E(JSONObject jSONObject, String str, com.facebook.b0 b0Var) {
        String str2;
        boolean z;
        Iterator<String> keys;
        Matcher matcher = com.facebook.d0.k.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str2.getClass();
        } else {
            str2 = str;
        }
        if (kotlin.text.c.v(str2, "me/", false) || kotlin.text.c.v(str2, "/me/", false)) {
            int P = StringsKt.P(str, ":", 0, false, 6);
            int P2 = StringsKt.P(str, "?", 0, false, 6);
            if (P > 3 && (P2 == -1 || P < P2)) {
                z = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    boolean z2 = z && kotlin.text.c.o(next, "image", true);
                    next.getClass();
                    opt.getClass();
                    F(next, opt, b0Var, z2);
                }
            }
        }
        z = false;
        keys = jSONObject.keys();
        while (keys.hasNext()) {
        }
    }

    public static void F(String str, Object obj, com.facebook.b0 b0Var, boolean z) {
        Class<?> cls = obj.getClass();
        if (!JSONObject.class.isAssignableFrom(cls)) {
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Object opt = jSONArray.opt(i);
                    opt.getClass();
                    F(format, opt, b0Var, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                b0Var.a(str, obj.toString());
                return;
            }
            if (!Date.class.isAssignableFrom(cls)) {
                String str2 = com.facebook.d0.j;
                com.facebook.w wVar = com.facebook.w.a;
                return;
            } else {
                String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                format2.getClass();
                b0Var.a(str, format2);
                return;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (z) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String format3 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                Object opt2 = jSONObject.opt(next);
                opt2.getClass();
                F(format3, opt2, b0Var, z);
            }
            return;
        }
        if (jSONObject.has("id")) {
            String optString = jSONObject.optString("id");
            optString.getClass();
            F(str, optString, b0Var, z);
        } else if (jSONObject.has("url")) {
            String optString2 = jSONObject.optString("url");
            optString2.getClass();
            F(str, optString2, b0Var, z);
        } else if (jSONObject.has("fbsdk:create_object")) {
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            F(str, jSONObject2, b0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static void G(com.facebook.f0 f0Var, com.facebook.internal.a0 a0Var, int i, URL url, FilterOutputStream filterOutputStream, boolean z) {
        String b;
        rj2 rj2Var = new rj2();
        rj2Var.c = filterOutputStream;
        ?? r1 = 1;
        rj2Var.a = true;
        rj2Var.b = z;
        int i2 = 0;
        if (i == 1) {
            com.facebook.d0 d0Var = (com.facebook.d0) f0Var.b.get(0);
            HashMap hashMap = new HashMap();
            for (String str : d0Var.d.keySet()) {
                Object obj = d0Var.d.get(str);
                if (z(obj)) {
                    str.getClass();
                    hashMap.put(str, new com.facebook.y(d0Var, obj));
                }
            }
            synchronized (com.facebook.w.b) {
            }
            Bundle bundle = d0Var.d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (A(obj2)) {
                    str2.getClass();
                    rj2Var.h(str2, obj2, d0Var);
                }
            }
            synchronized (com.facebook.w.b) {
            }
            I(hashMap, rj2Var);
            JSONObject jSONObject = d0Var.c;
            if (jSONObject != null) {
                String path = url.getPath();
                path.getClass();
                E(jSONObject, path, rj2Var);
                return;
            }
            return;
        }
        Iterator<E> it = f0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                AccessToken accessToken = ((com.facebook.d0) it.next()).a;
                if (accessToken != null) {
                    b = accessToken.h;
                    break;
                }
            } else {
                String str3 = com.facebook.d0.j;
                b = com.facebook.w.b();
                break;
            }
        }
        if (b.length() == 0) {
            com.facebook.t.a("App ID was not specified at the request or Settings.");
            return;
        }
        rj2Var.a("batch_app_id", b);
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = f0Var.iterator();
        while (it2.hasNext()) {
            com.facebook.d0 d0Var2 = (com.facebook.d0) it2.next();
            d0Var2.getClass();
            String str4 = com.facebook.d0.j;
            JSONObject jSONObject2 = new JSONObject();
            String h = d0Var2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.w.e()}, (int) r1)));
            d0Var2.a();
            Uri parse = Uri.parse(d0Var2.b(h, r1));
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            jSONObject2.put("relative_url", format);
            jSONObject2.put("method", d0Var2.h);
            AccessToken accessToken2 = d0Var2.a;
            if (accessToken2 != null) {
                com.facebook.internal.a0.a.m(accessToken2.e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = d0Var2.d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = d0Var2.d.get(it3.next());
                if (z(obj3)) {
                    String format2 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{U3.i.b, Integer.valueOf(hashMap2.size())}, 2));
                    arrayList.add(format2);
                    hashMap2.put(format2, new com.facebook.y(d0Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList));
            }
            JSONObject jSONObject3 = d0Var2.c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                E(jSONObject3, format, new com.facebook.c0(arrayList2, i2));
                jSONObject2.put("body", TextUtils.join(U3.j.c, arrayList2));
            }
            jSONArray.put(jSONObject2);
            r1 = 1;
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        rj2Var.a("batch", jSONArray2);
        synchronized (com.facebook.w.b) {
        }
        I(hashMap2, rj2Var);
    }

    public static void H(com.facebook.f0 f0Var, ArrayList arrayList) {
        ArrayList arrayList2 = f0Var.b;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            com.facebook.d0 d0Var = (com.facebook.d0) arrayList2.get(i);
            if (d0Var.g != null) {
                arrayList3.add(new Pair(d0Var.g, arrayList.get(i)));
            }
        }
        if (arrayList3.size() > 0) {
            com.facebook.v vVar = new com.facebook.v(1, arrayList3, f0Var);
            Handler handler = f0Var.a;
            if (handler != null) {
                handler.post(vVar);
            } else {
                vVar.run();
            }
        }
    }

    public static void I(HashMap hashMap, rj2 rj2Var) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = com.facebook.d0.j;
            if (z(((com.facebook.y) entry.getValue()).b)) {
                rj2Var.h((String) entry.getKey(), ((com.facebook.y) entry.getValue()).b, ((com.facebook.y) entry.getValue()).a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J(com.facebook.f0 f0Var, HttpURLConnection httpURLConnection) {
        boolean z;
        int i;
        Throwable th;
        FilterOutputStream filterOutputStream;
        FilterOutputStream gZIPOutputStream;
        com.facebook.h0 h0Var = com.facebook.h0.b;
        com.facebook.internal.a0 a0Var = new com.facebook.internal.a0();
        com.facebook.internal.h.j("Request", "tag");
        int size = f0Var.b.size();
        Iterator<E> it = f0Var.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                i = 0;
                z = true;
                break;
            }
            com.facebook.d0 d0Var = (com.facebook.d0) it.next();
            Iterator<String> it2 = d0Var.d.keySet().iterator();
            while (it2.hasNext()) {
                if (z(d0Var.d.get(it2.next()))) {
                    i = 0;
                    break loop0;
                }
            }
        }
        com.facebook.h0 h0Var2 = size == 1 ? ((com.facebook.d0) f0Var.b.get(i)).h : null;
        if (h0Var2 == null) {
            h0Var2 = h0Var;
        }
        httpURLConnection.setRequestMethod(h0Var2.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{com.facebook.d0.j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        HashSet hashSet = com.facebook.w.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        url.getClass();
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestMethod().getClass();
        synchronized (hashSet) {
        }
        String requestProperty = httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT);
        requestProperty.getClass();
        a0Var.a(requestProperty, Command.HTTP_HEADER_USER_AGENT);
        String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
        requestProperty2.getClass();
        a0Var.a(requestProperty2, "Content-Type");
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        if (h0Var2 != h0Var) {
            synchronized (hashSet) {
            }
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            FilterOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream != null) {
                        throw th;
                    }
                    filterOutputStream.close();
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
        } catch (Throwable th3) {
            th = th3;
            filterOutputStream = null;
        }
        try {
            Iterator it3 = f0Var.c.iterator();
            while (it3.hasNext()) {
            }
            Iterator<E> it4 = f0Var.iterator();
            while (it4.hasNext()) {
                com.facebook.z zVar = ((com.facebook.d0) it4.next()).g;
            }
            G(f0Var, a0Var, size, url, gZIPOutputStream, z);
            gZIPOutputStream.close();
            synchronized (com.facebook.w.b) {
            }
        } catch (Throwable th4) {
            th = th4;
            filterOutputStream = gZIPOutputStream;
            if (filterOutputStream != null) {
            }
        }
    }

    public static HttpURLConnection K(com.facebook.f0 f0Var) {
        Iterator<E> it = f0Var.iterator();
        while (it.hasNext()) {
            com.facebook.d0 d0Var = (com.facebook.d0) it.next();
            if (com.facebook.h0.a == d0Var.h && com.facebook.internal.k0.A(d0Var.d.getString("fields"))) {
                com.facebook.b bVar = com.facebook.internal.a0.a;
                synchronized (com.facebook.w.b) {
                }
            }
        }
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = t(f0Var.b.size() == 1 ? new URL(((com.facebook.d0) f0Var.b.get(0)).g()) : new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.w.e()}, 1))));
                J(f0Var, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e) {
                com.facebook.internal.k0.j(httpURLConnection);
                throw new com.facebook.q("could not construct request body", e);
            } catch (JSONException e2) {
                com.facebook.internal.k0.j(httpURLConnection);
                throw new com.facebook.q("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new com.facebook.q("could not construct URL for request", e3);
        }
    }

    public static final q0 a(Context context, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.internal.services.events.c cVar, String str, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, dy9 dy9Var, com.moloco.sdk.internal.d dVar, com.moloco.sdk.internal.x xVar, com.moloco.sdk.internal.services.z zVar, com.moloco.sdk.acm.recorder.c cVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 w0Var, AdFormatType adFormatType) {
        str.getClass();
        adFormatType.getClass();
        e0 e0Var = e0.b;
        f0 f0Var = f0.b;
        return new q0(context, rVar, cVar, str, z, t0Var, bVar, dy9Var, dVar, xVar, zVar, cVar2, w0Var, adFormatType);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0 b(com.moloco.sdk.internal.ortb.model.n0 n0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0 p0Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0 n0Var2;
        Integer num;
        String str;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0 n0Var3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0 r0Var;
        n0Var.getClass();
        com.moloco.sdk.internal.ortb.model.r0 r0Var2 = n0Var.i;
        String str2 = r0Var2 != null ? r0Var2.a : null;
        String str3 = n0Var.b;
        String str4 = n0Var.c;
        String str5 = str2;
        String str6 = n0Var.a;
        String str7 = n0Var.d;
        Integer num2 = r0Var2 != null ? r0Var2.b : null;
        com.moloco.sdk.internal.ortb.model.v0 v0Var = n0Var.f;
        if (v0Var != null) {
            Integer num3 = v0Var.a;
            String str8 = v0Var.b;
            Integer num4 = v0Var.c;
            Integer num5 = v0Var.d;
            com.moloco.sdk.internal.ortb.model.t0 t0Var = v0Var.e;
            p0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0(num3, str8, num4, num5, t0Var != null ? c(t0Var) : null, v0Var.f, v0Var.g);
        } else {
            p0Var = null;
        }
        com.moloco.sdk.internal.ortb.model.p0 p0Var2 = n0Var.g;
        if (p0Var2 != null) {
            Integer num6 = p0Var2.a;
            String str9 = p0Var2.b;
            com.moloco.sdk.internal.ortb.model.t0 t0Var2 = p0Var2.c;
            n0Var2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0(num6, str9, t0Var2 != null ? c(t0Var2) : null);
        } else {
            n0Var2 = null;
        }
        com.moloco.sdk.internal.ortb.model.x0 x0Var = n0Var.h;
        if (x0Var != null) {
            Float f = x0Var.a;
            String str10 = x0Var.b;
            if (str10 == null) {
                str10 = "#FFFFFF00";
            }
            String str11 = str10;
            String str12 = x0Var.c;
            if (str12 == null) {
                str12 = "#FF888888";
            }
            String str13 = str12;
            Integer num7 = x0Var.d;
            int intValue = num7 != null ? num7.intValue() : 12;
            Integer num8 = x0Var.e;
            num = num2;
            str = str3;
            n0Var3 = n0Var2;
            r0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0(f, str11, str13, intValue, num8 != null ? num8.intValue() : 9);
        } else {
            num = num2;
            str = str3;
            n0Var3 = n0Var2;
            r0Var = null;
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0(str5, str, str4, str6, str7, num, p0Var, n0Var3, r0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0 c(com.moloco.sdk.internal.ortb.model.t0 t0Var) {
        ?? r1;
        t0Var.getClass();
        List list = t0Var.b;
        if (list != null) {
            r1 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r1.add(((com.moloco.sdk.internal.ortb.model.d1) it.next()).a);
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = km5.a;
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0(t0Var.a, r1);
    }

    public static final Object d(j2d j2dVar, Function1 function1, sq3 sq3Var) {
        com.moloco.sdk.internal.utils.b bVar = new com.moloco.sdk.internal.utils.b(j2dVar);
        return sq3Var.getContext().get(bVar) != null ? function1.invoke(sq3Var) : xw3.R(new com.moloco.sdk.internal.utils.a(bVar), new kuj(j2dVar, function1, (rq3) null, 20), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Context context, List list, long j, sq3 sq3Var) {
        com.moloco.sdk.internal.publisher.nativead.parser.d dVar;
        lu3 lu3Var;
        int i;
        List list2;
        Object obj;
        long j2;
        Object r;
        List list3;
        Iterator it;
        try {
            if (sq3Var instanceof com.moloco.sdk.internal.publisher.nativead.parser.d) {
                dVar = (com.moloco.sdk.internal.publisher.nativead.parser.d) sq3Var;
                int i2 = dVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.v = i2 - Integer.MIN_VALUE;
                    Object obj2 = dVar.u;
                    lu3Var = lu3.a;
                    i = dVar.v;
                    if (i != 0) {
                        y6a.M(obj2);
                        Object b = ypa.b(new com.moloco.sdk.internal.publisher.nativead.parser.b(context, 0));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : list) {
                            Boolean valueOf = Boolean.valueOf(((com.moloco.sdk.internal.publisher.nativead.model.e) obj3).b);
                            Object obj4 = linkedHashMap.get(valueOf);
                            if (obj4 == null) {
                                obj4 = new ArrayList();
                                linkedHashMap.put(valueOf, obj4);
                            }
                            ((List) obj4).add(obj3);
                        }
                        Object obj5 = (List) linkedHashMap.get(Boolean.TRUE);
                        if (obj5 == null) {
                            obj5 = km5.a;
                        }
                        Object obj6 = obj5;
                        List list4 = (List) linkedHashMap.get(Boolean.FALSE);
                        if (list4 == null) {
                            list4 = km5.a;
                        }
                        list2 = list4;
                        h2 h2Var = new h2(obj6, b, j, (rq3) null, 11);
                        dVar.s = b;
                        dVar.t = list2;
                        dVar.r = j;
                        dVar.v = 1;
                        obj2 = s9a.r(h2Var, dVar);
                        if (obj2 == lu3Var) {
                            return lu3Var;
                        }
                        obj = b;
                        j2 = j;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list3 = (List) dVar.s;
                            y6a.M(obj2);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            ArrayList arrayList = new ArrayList();
                            it = CollectionsKt.w0((List) obj2, list3).iterator();
                            while (it.hasNext()) {
                                kotlin.Pair pair = (kotlin.Pair) it.next();
                                com.moloco.sdk.internal.publisher.nativead.model.e eVar = (com.moloco.sdk.internal.publisher.nativead.model.e) pair.a;
                                com.moloco.sdk.internal.l0 l0Var = (com.moloco.sdk.internal.l0) pair.b;
                                if (l0Var instanceof com.moloco.sdk.internal.j0) {
                                    arrayList.add(new kotlin.Pair(eVar, ((com.moloco.sdk.internal.j0) l0Var).a));
                                } else {
                                    if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                                        zzl.b();
                                        return null;
                                    }
                                    com.moloco.sdk.internal.publisher.nativead.model.m mVar = (com.moloco.sdk.internal.publisher.nativead.model.m) ((com.moloco.sdk.internal.k0) l0Var).a;
                                    if (mVar instanceof com.moloco.sdk.internal.publisher.nativead.model.i) {
                                        linkedHashMap2.put(new Integer(mVar.a.a), mVar);
                                    } else if (mVar instanceof com.moloco.sdk.internal.publisher.nativead.model.j) {
                                        linkedHashMap3.put(new Integer(mVar.a.a), mVar);
                                    } else if (mVar instanceof com.moloco.sdk.internal.publisher.nativead.model.k) {
                                        linkedHashMap4.put(new Integer(mVar.a.a), mVar);
                                    } else {
                                        if (!(mVar instanceof com.moloco.sdk.internal.publisher.nativead.model.l)) {
                                            zzl.b();
                                            return null;
                                        }
                                        linkedHashMap5.put(new Integer(mVar.a.a), mVar);
                                    }
                                }
                            }
                            return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.n(linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, arrayList));
                        }
                        long j3 = dVar.r;
                        list2 = dVar.t;
                        Object obj7 = (joa) dVar.s;
                        y6a.M(obj2);
                        j2 = j3;
                        obj = obj7;
                    }
                    List list5 = (List) obj2;
                    h2 h2Var2 = new h2(list2, obj, j2, (rq3) null, 10);
                    dVar.s = list5;
                    dVar.t = null;
                    dVar.v = 2;
                    r = s9a.r(h2Var2, dVar);
                    if (r != lu3Var) {
                        list3 = list5;
                        obj2 = r;
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap52 = new LinkedHashMap();
                        ArrayList arrayList2 = new ArrayList();
                        it = CollectionsKt.w0((List) obj2, list3).iterator();
                        while (it.hasNext()) {
                        }
                        return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.n(linkedHashMap22, linkedHashMap32, linkedHashMap42, linkedHashMap52, arrayList2));
                    }
                    return lu3Var;
                }
            }
            if (i != 0) {
            }
            List list52 = (List) obj2;
            h2 h2Var22 = new h2(list2, obj, j2, (rq3) null, 10);
            dVar.s = list52;
            dVar.t = null;
            dVar.v = 2;
            r = s9a.r(h2Var22, dVar);
            if (r != lu3Var) {
            }
            return lu3Var;
        } catch (com.moloco.sdk.internal.publisher.nativead.parser.a e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare required assets", e, false, 8, null);
            return new com.moloco.sdk.internal.j0(e);
        }
        dVar = new com.moloco.sdk.internal.publisher.nativead.parser.d(sq3Var);
        Object obj22 = dVar.u;
        lu3Var = lu3.a;
        i = dVar.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x011c, TryCatch #1 {all -> 0x011c, blocks: (B:19:0x0063, B:20:0x0090, B:22:0x0096, B:25:0x00a9, B:28:0x00b9, B:31:0x00d3, B:34:0x00df, B:36:0x00e8, B:45:0x00f4, B:48:0x00db, B:49:0x00c9, B:50:0x00b5, B:51:0x00a3), top: B:18:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0184 -> B:16:0x0185). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(com.moloco.sdk.acm.db.j jVar, rq3 rq3Var) {
        com.moloco.sdk.acm.db.d dVar;
        int i;
        List u;
        com.moloco.sdk.acm.db.j jVar2;
        MetricsDb_Impl metricsDb_Impl;
        r6g e;
        Cursor query;
        r6g r6gVar;
        ArrayList arrayList;
        int i2;
        int i3;
        List split$default;
        dti dtiVar = rd0.f;
        if (rq3Var instanceof com.moloco.sdk.acm.db.d) {
            dVar = (com.moloco.sdk.acm.db.d) rq3Var;
            int i4 = dVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.v = i4 - Integer.MIN_VALUE;
                Object obj = dVar.u;
                lu3 lu3Var = lu3.a;
                i = dVar.v;
                CancellationSignal cancellationSignal = null;
                if (i != 0) {
                    u = fc6.u(obj);
                    jVar2 = jVar;
                    com.facebook.b bVar = jVar2.c;
                    metricsDb_Impl = jVar2.a;
                    e = r6g.e(0, "SELECT * FROM events LIMIT 900");
                    metricsDb_Impl.assertNotSuspendingTransaction();
                    query = metricsDb_Impl.query(e, cancellationSignal);
                    int F = xw3.F(query, "id");
                    int F2 = xw3.F(query, "name");
                    int F3 = xw3.F(query, "timestamp");
                    int F4 = xw3.F(query, "eventType");
                    int F5 = xw3.F(query, "data");
                    int F6 = xw3.F(query, "tags");
                    arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                    }
                    query.close();
                    e.release();
                    if (arrayList.isEmpty()) {
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list = (List) dVar.r;
                    y6a.M(obj);
                    return list;
                }
                ArrayList arrayList2 = dVar.t;
                u = dVar.s;
                com.moloco.sdk.acm.db.j jVar3 = (com.moloco.sdk.acm.db.j) dVar.r;
                y6a.M(obj);
                boolean z = true;
                jVar2 = jVar3;
                char c = 2;
                CancellationSignal cancellationSignal2 = null;
                try {
                    u.addAll(arrayList2);
                    cancellationSignal = cancellationSignal2;
                    int F7 = xw3.F(query, "id");
                    int F22 = xw3.F(query, "name");
                    int F32 = xw3.F(query, "timestamp");
                    int F42 = xw3.F(query, "eventType");
                    int F52 = xw3.F(query, "data");
                    int F62 = xw3.F(query, "tags");
                    arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(F7);
                        String string = query.isNull(F22) ? null : query.getString(F22);
                        long j2 = query.getLong(F32);
                        String string2 = query.isNull(F42) ? null : query.getString(F42);
                        string2.getClass();
                        com.moloco.sdk.acm.db.c valueOf = com.moloco.sdk.acm.db.c.valueOf(string2);
                        Long valueOf2 = query.isNull(F52) ? null : Long.valueOf(query.getLong(F52));
                        String string3 = query.isNull(F62) ? null : query.getString(F62);
                        string3.getClass();
                        if (string3.length() == 0) {
                            split$default = km5.a;
                            i2 = F62;
                            i3 = F52;
                            r6gVar = e;
                        } else {
                            i2 = F62;
                            i3 = F52;
                            r6gVar = e;
                            split$default = StringsKt__StringsKt.split$default(string3, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                        }
                        try {
                            arrayList.add(new com.moloco.sdk.acm.db.b(j, string, j2, valueOf, valueOf2, split$default));
                            F62 = i2;
                            F52 = i3;
                            e = r6gVar;
                        } catch (Throwable th) {
                            th = th;
                            query.close();
                            r6gVar.release();
                            throw th;
                        }
                    }
                    query.close();
                    e.release();
                    if (arrayList.isEmpty()) {
                        dVar.r = u;
                        dVar.s = null;
                        dVar.t = null;
                        dVar.v = 2;
                        if (dtiVar.m(metricsDb_Impl, true, new com.moloco.sdk.acm.db.h(jVar2), dVar) != lu3Var) {
                            return u;
                        }
                    } else {
                        cancellationSignal2 = null;
                        c = 2;
                        ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new Long(((com.moloco.sdk.acm.db.b) it.next()).a));
                        }
                        dVar.r = jVar2;
                        dVar.s = u;
                        dVar.t = arrayList;
                        z = true;
                        dVar.v = 1;
                        if (dtiVar.m(metricsDb_Impl, true, new com.moloco.sdk.acm.db.i(jVar2, arrayList3), dVar) != lu3Var) {
                            arrayList2 = arrayList;
                            u.addAll(arrayList2);
                            cancellationSignal = cancellationSignal2;
                            com.facebook.b bVar2 = jVar2.c;
                            metricsDb_Impl = jVar2.a;
                            e = r6g.e(0, "SELECT * FROM events LIMIT 900");
                            metricsDb_Impl.assertNotSuspendingTransaction();
                            query = metricsDb_Impl.query(e, cancellationSignal);
                            int F72 = xw3.F(query, "id");
                            int F222 = xw3.F(query, "name");
                            int F322 = xw3.F(query, "timestamp");
                            int F422 = xw3.F(query, "eventType");
                            int F522 = xw3.F(query, "data");
                            int F622 = xw3.F(query, "tags");
                            arrayList = new ArrayList(query.getCount());
                            while (query.moveToNext()) {
                            }
                            query.close();
                            e.release();
                            if (arrayList.isEmpty()) {
                            }
                        }
                    }
                    return lu3Var;
                } catch (Throwable th2) {
                    th = th2;
                    r6gVar = e;
                }
                com.facebook.b bVar22 = jVar2.c;
                metricsDb_Impl = jVar2.a;
                e = r6g.e(0, "SELECT * FROM events LIMIT 900");
                metricsDb_Impl.assertNotSuspendingTransaction();
                query = metricsDb_Impl.query(e, cancellationSignal);
            }
        }
        dVar = new com.moloco.sdk.acm.db.d(rq3Var);
        Object obj2 = dVar.u;
        lu3 lu3Var2 = lu3.a;
        i = dVar.v;
        CancellationSignal cancellationSignal3 = null;
        if (i != 0) {
        }
    }

    public static final void g(int i, of3 of3Var, xtc xtcVar, Function1 function1) {
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1037954372);
        int i2 = 16;
        if ((((av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.g("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") ? 32 : 16) | (av8Var.g(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.e0(-363689698);
            boolean g = av8Var.g("Ad Badge");
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new com.appsflyer.internal.a(17);
                av8Var.n0(O);
            }
            av8Var.s(false);
            xtc i3 = bkh.i(o3h.a(xtcVar, false, (Function1) O), 12.0f);
            av8Var.e0(-363682862);
            boolean g2 = av8Var.g("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") | av8Var.g(function1);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new com.moloco.sdk.acm.services.d(function1, i2);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            lq9.a(3120, r13.i, av8Var, oyn.v(i3, null, (Function0) O2, 7), haa.t(R.drawable.info_badge, 0, av8Var), "Ad Badge");
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new com.moloco.sdk.internal.k(xtcVar, function1, i, 1);
        }
    }

    public static final void h(int i, of3 of3Var, xtc xtcVar, Function1 function1, Function1 function12) {
        int i2;
        Function1 function13;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-459026854);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html") ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(function12) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
            function13 = function1;
        } else {
            function13 = function1;
            com.facebook.appevents.n.j(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.g, function13, yqo.y(-1810395910, av8Var, new com.moloco.sdk.internal.publisher.nativead.ui.a(1, xtcVar, function12)), av8Var, ((i2 << 6) & 896) | 3120, 1);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ga7(function13, xtcVar, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    public static final void i(final long j, final long j2, final xtc xtcVar, float f, final float f2, final Function0 function0, u6b u6bVar, final int i, final int i2, of3 of3Var, final int i3) {
        int i4;
        u6b u6bVar2;
        int i5;
        float f3;
        Object fVar;
        float f4;
        u6b u6bVar3;
        int i6;
        ?? r2;
        q50 q50Var;
        av8 av8Var;
        int i7;
        av8 av8Var2;
        u6b u6bVar4;
        Object obj;
        boolean z;
        float f5;
        av8 av8Var3;
        final u6b u6bVar5;
        final float f6;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-562864551);
        if ((i3 & 6) == 0) {
            i4 = (av8Var4.f(j) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var4.f(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var4.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i8 |= av8Var4.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i8 |= av8Var4.g(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            i8 |= 524288;
        }
        if ((12582912 & i3) == 0) {
            i8 |= av8Var4.e(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i8 |= av8Var4.e(i2) ? 67108864 : 33554432;
        }
        if ((38347923 & i8) == 38347922 && av8Var4.D()) {
            av8Var4.W();
            f6 = f;
            u6bVar5 = u6bVar;
            av8Var3 = av8Var4;
        } else {
            av8Var4.Y();
            if ((i3 & 1) == 0 || av8Var4.B()) {
                ff5 ff5Var = nz.a;
                u6bVar2 = (u6b) av8Var4.k(mhb.a);
                i5 = i8 & (-3670017);
                f3 = 7.0f;
            } else {
                av8Var4.W();
                u6bVar2 = u6bVar;
                i5 = i8 & (-3670017);
                f3 = f;
            }
            av8Var4.t();
            av8Var4.e0(1215960328);
            boolean g = av8Var4.g(u6bVar2);
            Object O = av8Var4.O();
            Object obj2 = nf3.a;
            if (g || O == obj2) {
                O = androidx.compose.runtime.e.f(Boolean.TRUE);
                av8Var4.n0(O);
            }
            e1d e1dVar = (e1d) O;
            av8Var4.s(false);
            Object[] objArr = new Object[0];
            av8Var4.e0(1215963943);
            boolean e = av8Var4.e(i2);
            Object O2 = av8Var4.O();
            int i9 = 1;
            if (e || O2 == obj2) {
                O2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a(i2, i9);
                av8Var4.n0(O2);
            }
            av8Var4.s(false);
            e1d e1dVar2 = (e1d) o3a.L(objArr, null, null, (Function0) O2, av8Var4, 0, 6);
            av8Var4.e0(1215966697);
            Object O3 = av8Var4.O();
            if (O3 == obj2) {
                O3 = ml4.b(com.facebook.appevents.j.a(i2, i));
                av8Var4.n0(O3);
            }
            q50 q50Var2 = (q50) O3;
            u6b u6bVar6 = u6bVar2;
            av8Var4.s(false);
            y7k y7kVar = new y7k(i2);
            av8Var4.e0(1215977122);
            boolean g2 = av8Var4.g(e1dVar2) | av8Var4.e(i2) | av8Var4.e(i) | av8Var4.g(q50Var2) | av8Var4.g(function0);
            Object O4 = av8Var4.O();
            if (g2 || O4 == obj2) {
                f4 = f3;
                u6bVar3 = u6bVar6;
                i6 = 2;
                r2 = 0;
                q50Var = q50Var2;
                av8 av8Var5 = av8Var4;
                fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f(i2, i, q50Var, function0, e1dVar2, null, 1);
                av8Var5.n0(fVar);
                av8Var = av8Var5;
            } else {
                q50Var = q50Var2;
                fVar = O4;
                f4 = f3;
                av8Var = av8Var4;
                u6bVar3 = u6bVar6;
                i6 = 2;
                r2 = 0;
            }
            av8Var.s(r2);
            hz8.o(av8Var, y7kVar, (Function2) fVar);
            Boolean bool = (Boolean) e1dVar.getValue();
            bool.getClass();
            av8Var.e0(1216010844);
            boolean g3 = av8Var.g(e1dVar) | av8Var.g(q50Var);
            Object O5 = av8Var.O();
            if (g3 || O5 == obj2) {
                O5 = new cth(q50Var, e1dVar, null, i6);
                av8Var.n0(O5);
            }
            av8Var.s(r2);
            hz8.o(av8Var, bool, (Function2) O5);
            av8Var.e0(1216015257);
            boolean g4 = av8Var.g(e1dVar) | av8Var.g(q50Var) | av8Var.g(u6bVar3);
            Object O6 = av8Var.O();
            if (g4 || O6 == obj2) {
                i7 = 1;
                O6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b(u6bVar3, q50Var, e1dVar, i7);
                av8Var.n0(O6);
            } else {
                i7 = 1;
            }
            av8Var.s(r2);
            hz8.d(u6bVar3, (Function1) O6, av8Var);
            mv1 mv1Var = uxf.g;
            xtc q = n9e.q(wnn.A(bkh.l(xtcVar, f2), o7g.a(20.0f)), r13.c(r13.d, 0.9f), o7g.a);
            av8Var.e0(1216045352);
            boolean g5 = av8Var.g("timer_container");
            Object O7 = av8Var.O();
            if (g5 || O7 == obj2) {
                O7 = new com.appsflyer.internal.a(22);
                av8Var.n0(O7);
            }
            av8Var.s(r2);
            xtc a = o3h.a(q, r2, (Function1) O7);
            av8Var.e0(733328855);
            g12 e2 = e12.e(mv1Var, av8Var, 6);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(a);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = r2;
            waa.K(av8Var, e2, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, Integer.valueOf((int) r2));
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            g28 g28Var = bkh.c;
            av8Var.e0(1205651458);
            boolean f7 = av8Var.f(j) | av8Var.d(f4) | av8Var.g(q50Var) | av8Var.f(j2);
            Object O8 = av8Var.O();
            if (f7 || O8 == obj2) {
                av8Var2 = av8Var;
                u6bVar4 = u6bVar3;
                final q50 q50Var3 = q50Var;
                obj = obj2;
                final float f8 = f4;
                z = false;
                Object obj3 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ha5 ha5Var = (ha5) obj4;
                        ha5Var.getClass();
                        long f9 = yaa.f(njh.f(ha5Var.n()), njh.d(ha5Var.n()));
                        float f10 = f8;
                        ha5.L(ha5Var, j, 360.0f, 360.0f, 0L, f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(ha5Var.H0(f10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 848);
                        q50 q50Var4 = q50Var3;
                        float floatValue = ((Number) q50Var4.d()).floatValue();
                        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float floatValue2 = ((Number) q50Var4.d()).floatValue();
                            if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f11 = floatValue2;
                            }
                            long f12 = yaa.f(njh.f(ha5Var.n()), njh.d(ha5Var.n()));
                            jii jiiVar = new jii(ha5Var.H0(f10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26);
                            ha5.L(ha5Var, j2, 270.0f, f11 * (-360.0f), 0L, f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar, 848);
                        }
                        return Unit.a;
                    }
                };
                f5 = f8;
                av8Var2.n0(obj3);
                O8 = obj3;
            } else {
                obj = obj2;
                av8Var2 = av8Var;
                u6bVar4 = u6bVar3;
                f5 = f4;
                z = false;
            }
            av8Var2.s(z);
            lz.d(6, av8Var2, g28Var, (Function1) O8);
            String unsignedString = Integer.toUnsignedString(i2);
            dfj dfjVar = ((b7k) av8Var2.k(e7k.b)).k;
            long j3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a;
            av8Var2.e0(1205686792);
            boolean g6 = av8Var2.g("countdown_timer_text");
            Object O9 = av8Var2.O();
            if (g6 || O9 == obj) {
                O9 = new com.appsflyer.internal.a(23);
                av8Var2.n0(O9);
            }
            av8Var2.s(z);
            av8 av8Var6 = av8Var2;
            vdj.c(unsignedString, o3h.a(utc.a, z, (Function1) O9), j2, j3, null, null, 0L, new p7j(3), 0L, 0, false, 1, null, dfjVar, av8Var6, ((i5 << 3) & 896) | 3072, 3072, 24048);
            av8Var3 = av8Var6;
            com.appsflyer.internal.i.p(av8Var3, false, false, true, false);
            av8Var3.s(false);
            u6bVar5 = u6bVar4;
            f6 = f5;
        }
        eqf u = av8Var3.u();
        if (u != null) {
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    h0.i(j, j2, xtcVar, f6, f2, function0, u6bVar5, i, i2, (of3) obj4, i3 | 1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final Activity activity, of3 of3Var, final int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-726701488);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(activity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && av8Var.D()) {
            av8Var.W();
        } else {
            boolean b = ((ata) ((s8l) av8Var.k(dh3.u))).b();
            Boolean valueOf = Boolean.valueOf(b);
            av8Var.e0(-1598620045);
            boolean h = av8Var.h(b) | av8Var.g(activity);
            Object O = av8Var.O();
            if (h || O == nf3.a) {
                O = new apk(b, activity, (rq3) null);
                av8Var.n0(O);
            }
            av8Var.s(false);
            hz8.o(av8Var, valueOf, (Function2) O);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i3 = i | 1;
                    h0.j(activity, (of3) obj, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar, final Function0 function0, final xtc xtcVar, of3 of3Var, final int i) {
        xtc z;
        xtc z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1013674470);
        if ((((av8Var.g(gVar) ? 4 : 2) | i | (av8Var.g(function0) ? 32 : 16)) & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            Unit unit = Unit.a;
            av8Var.e0(-1879727858);
            boolean g = av8Var.g(gVar);
            Object O = av8Var.O();
            rq3 rq3Var = null;
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new luj(gVar, rq3Var, 26);
                av8Var.n0(O);
            }
            av8Var.s(false);
            hz8.o(av8Var, unit, (Function2) O);
            av8Var.e0(-1879723537);
            boolean g2 = av8Var.g(gVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f(gVar, 1);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            hz8.d(unit, (Function1) O2, av8Var);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) sea.l((fdi) gVar.p, av8Var, 0).getValue();
            if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) {
                av8Var.e0(1858351850);
                av8Var.e0(-1879713188);
                boolean g3 = av8Var.g(gVar);
                Object O3 = av8Var.O();
                if (g3 || O3 == a99Var) {
                    O3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(gVar, rq3Var, 15);
                    av8Var.n0(O3);
                }
                av8Var.s(false);
                z2 = xtcVar.z(new ioi(unit, null, new joi((Function2) O3), 6));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.k((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) rVar, z2, av8Var, 0);
                av8Var.s(false);
            } else if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) {
                av8Var.e0(1858734483);
                av8Var.e0(-1879701076);
                boolean g4 = av8Var.g(gVar) | av8Var.g(function0);
                Object O4 = av8Var.O();
                if (g4 || O4 == a99Var) {
                    O4 = new fdl(gVar, function0, rq3Var, 14);
                    av8Var.n0(O4);
                }
                av8Var.s(false);
                z = xtcVar.z(new ioi(unit, null, new joi((Function2) O4), 6));
                l((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) rVar, z, av8Var, 0);
                av8Var.s(false);
            } else {
                if (rVar != null) {
                    av8Var.e0(-1879717243);
                    av8Var.s(false);
                    zzl.b();
                    return;
                }
                av8Var.e0(1859162717);
                av8Var.s(false);
            }
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(function0, xtcVar, i) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ xtc c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.moloco.sdk.internal.publisher.h0.k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g.this, this.b, this.c, (of3) obj, 385);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q qVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2103037730);
        int i2 = 2;
        int i3 = (av8Var.g(qVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if ((i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            mv1 mv1Var = uxf.g;
            av8Var.e0(733328855);
            g12 e = e12.e(mv1Var, av8Var, 6);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(xtcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, e, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            com.facebook.appevents.j.l(qVar, null, av8Var, i3 & 14, 2);
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new com.moloco.sdk.internal.k(qVar, xtcVar, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static final void m(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, xtc xtcVar, final long j, of3 of3Var, int i) {
        xtc xtcVar2;
        Object q9jVar;
        Object obj;
        ?? r11;
        final q50 q50Var;
        xtc xtcVar3;
        xtc xtcVar4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2 = oVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(632891183);
        if (((i | (av8Var.h(z) ? 4 : 2) | (av8Var.g(oVar2) ? 32 : 16) | 384 | (av8Var.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024)) & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
            xtcVar4 = xtcVar;
        } else {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                xtcVar2 = utc.a;
            } else {
                av8Var.W();
                xtcVar2 = xtcVar;
            }
            av8Var.t();
            Object[] objArr = new Object[0];
            av8Var.e0(-1652684781);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (O == obj2) {
                O = new com.moloco.sdk.service_locator.h(22);
                av8Var.n0(O);
            }
            av8Var.s(false);
            e1d e1dVar = (e1d) o3a.L(objArr, null, null, (Function0) O, av8Var, 3072, 6);
            float max = Math.max(s(oVar2), ((Number) e1dVar.getValue()).floatValue());
            av8Var.e0(-1652680550);
            Object O2 = av8Var.O();
            if (O2 == obj2) {
                O2 = ml4.b(max);
                av8Var.n0(O2);
            }
            q50 q50Var2 = (q50) O2;
            av8Var.s(false);
            e1dVar.setValue(Float.valueOf(((Number) q50Var2.d()).floatValue()));
            Boolean valueOf = Boolean.valueOf(z);
            av8Var.e0(-1652675684);
            boolean g = av8Var.g(q50Var2) | av8Var.d(max) | av8Var.h(z) | av8Var.g(oVar2);
            Object O3 = av8Var.O();
            if (g || O3 == obj2) {
                obj = obj2;
                r11 = 0;
                q50Var = q50Var2;
                xtcVar3 = xtcVar2;
                q9jVar = new q9j(q50Var, max, z, oVar, null, 1);
                oVar2 = oVar;
                av8Var.n0(q9jVar);
            } else {
                obj = obj2;
                q50Var = q50Var2;
                xtcVar3 = xtcVar2;
                q9jVar = O3;
                r11 = 0;
            }
            av8Var.s(r11);
            hz8.q(oVar2, valueOf, (Function2) q9jVar, av8Var);
            xtc e = bkh.e(xtcVar3, 4.0f);
            av8Var.e0(-1652659568);
            boolean d = av8Var.d(4.0f) | av8Var.g(q50Var) | av8Var.f(j);
            Object O4 = av8Var.O();
            if (d || O4 == obj) {
                O4 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ha5 ha5Var = (ha5) obj3;
                        ha5Var.getClass();
                        ha5.f0(ha5Var, j, 0L, yaa.f(njh.f(ha5Var.n()) * ((Number) q50.this.d()).floatValue(), njh.d(ha5Var.n())), (Float.floatToRawIntBits(4.0f) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L), null, 242);
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            }
            av8Var.s(r11);
            e12.a(r11, av8Var, td4.X(e, (Function1) O4));
            xtcVar4 = xtcVar3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new g30(z, oVar2, xtcVar4, j, i);
        }
    }

    public static void n(String str, String str2, Bundle bundle, com.facebook.appevents.p pVar) {
        str.getClass();
        str2.getClass();
        int C = wt3.C(y(str));
        if (C == 0) {
            bundle.putCharSequence(str, str2);
            return;
        }
        com.facebook.appevents.q qVar = com.facebook.appevents.q.a;
        if (C == 1) {
            pVar.a(qVar, str, str2);
        } else {
            if (C != 2) {
                return;
            }
            pVar.a(qVar, str, str2);
            bundle.putCharSequence(str, str2);
        }
    }

    public static kotlin.Pair o(String str, String str2, Bundle bundle, com.facebook.appevents.p pVar) {
        str.getClass();
        int C = wt3.C(y(str));
        if (C != 0) {
            com.facebook.appevents.q qVar = com.facebook.appevents.q.a;
            if (C == 1) {
                if (pVar == null) {
                    pVar = new com.facebook.appevents.p();
                }
                pVar.a(qVar, str, str2);
            } else if (C == 2) {
                if (pVar == null) {
                    pVar = new com.facebook.appevents.p();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                pVar.a(qVar, str, str2);
                bundle.putCharSequence(str, str2);
            }
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        }
        return new kotlin.Pair(bundle, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(com.moloco.sdk.internal.publisher.nativead.model.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, sq3 sq3Var) {
        com.moloco.sdk.internal.publisher.nativead.parser.c cVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h hVar;
        if (sq3Var instanceof com.moloco.sdk.internal.publisher.nativead.parser.c) {
            cVar = (com.moloco.sdk.internal.publisher.nativead.parser.c) sq3Var;
            int i2 = cVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.t = i2 - Integer.MIN_VALUE;
                Object obj = cVar.s;
                lu3 lu3Var = lu3.a;
                i = cVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    String str = bVar.c;
                    cVar.r = bVar;
                    cVar.t = 1;
                    jVar.getClass();
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i(str, jVar, rq3Var, 0), cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = cVar.r;
                    y6a.M(obj);
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) obj;
                if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to fetch image asset media", null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.b);
                }
                try {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully loaded image asset media", null, false, 12, null);
                    String absolutePath = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) hVar).a.getAbsolutePath();
                    absolutePath.getClass();
                    Uri parse = Uri.parse(absolutePath);
                    parse.getClass();
                    return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.j(bVar, parse));
                } catch (Exception e) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to prepare image asset", e, false, 8, null);
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.c);
                }
            }
        }
        cVar = new com.moloco.sdk.internal.publisher.nativead.parser.c(sq3Var);
        Object obj2 = cVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) obj2;
        if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(com.moloco.sdk.internal.publisher.nativead.model.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar, long j, sq3 sq3Var) {
        com.moloco.sdk.internal.publisher.nativead.parser.e eVar;
        int i;
        long j2;
        com.moloco.sdk.internal.l0 l0Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar2 = uVar;
        if (sq3Var instanceof com.moloco.sdk.internal.publisher.nativead.parser.e) {
            eVar = (com.moloco.sdk.internal.publisher.nativead.parser.e) sq3Var;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj = eVar.u;
                lu3 lu3Var = lu3.a;
                i = eVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    String str = dVar.c;
                    eVar.r = dVar;
                    eVar.s = uVar2;
                    eVar.t = j;
                    eVar.v = 1;
                    obj = uVar2.i(str, "UNKNOWN_MTID", true, eVar);
                    if (obj != lu3Var) {
                        j2 = j;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = eVar.r;
                    y6a.M(obj);
                    com.moloco.sdk.internal.l0 l0Var2 = (com.moloco.sdk.internal.l0) obj;
                    if (l0Var2 instanceof com.moloco.sdk.internal.k0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Successfully loaded video asset media", null, false, 12, null);
                        return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.l(dVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.k0) l0Var2).a));
                    }
                    if (!(l0Var2 instanceof com.moloco.sdk.internal.j0)) {
                        zzl.b();
                        return null;
                    }
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to fetch video asset media: " + ((com.moloco.sdk.internal.j0) l0Var2).a, null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.d);
                }
                j2 = eVar.t;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar3 = eVar.s;
                com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = eVar.r;
                y6a.M(obj);
                uVar2 = uVar3;
                dVar = dVar2;
                l0Var = (com.moloco.sdk.internal.l0) obj;
                if (l0Var instanceof com.moloco.sdk.internal.k0) {
                    if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
                        zzl.b();
                        return null;
                    }
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "PrepareNativeAssets", "Failed to fetch video asset media: " + ((com.moloco.sdk.internal.j0) l0Var).a, null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.e);
                }
                long Q = wkn.Q(xd5.e(j2) * 0.9d, be5.MILLISECONDS);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.k0) l0Var).a;
                eVar.r = dVar;
                eVar.s = null;
                eVar.v = 2;
                obj = uVar2.h(aVar, Q, eVar);
            }
        }
        eVar = new com.moloco.sdk.internal.publisher.nativead.parser.e(sq3Var);
        Object obj2 = eVar.u;
        lu3 lu3Var2 = lu3.a;
        i = eVar.v;
        if (i != 0) {
        }
        l0Var = (com.moloco.sdk.internal.l0) obj2;
        if (l0Var instanceof com.moloco.sdk.internal.k0) {
        }
    }

    public static final Object r(com.moloco.sdk.internal.publisher.nativead.model.e eVar, joa joaVar, long j, hoi hoiVar) {
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.a) {
            return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.i((com.moloco.sdk.internal.publisher.nativead.model.a) eVar));
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b) {
            return p((com.moloco.sdk.internal.publisher.nativead.model.b) eVar, com.moloco.sdk.service_locator.g.a(), hoiVar);
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c) {
            return new com.moloco.sdk.internal.k0(new com.moloco.sdk.internal.publisher.nativead.model.k((com.moloco.sdk.internal.publisher.nativead.model.c) eVar));
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.d) {
            return q((com.moloco.sdk.internal.publisher.nativead.model.d) eVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u) joaVar.getValue(), j, hoiVar);
        }
        zzl.b();
        return null;
    }

    public static final float s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar) {
        if (oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) {
            return 100.0f;
        }
        if (oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) {
            long j = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) oVar).b;
            if (j != 0) {
                return (float) (r6.a / j);
            }
        } else if (!(oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) && !Intrinsics.c(oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a)) {
            zzl.b();
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static HttpURLConnection t(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        uRLConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        if (com.facebook.d0.l == null) {
            com.facebook.d0.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.3.0"}, 2));
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, com.facebook.d0.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static final int u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar) {
        int i;
        if (!(oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k)) {
            if (oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) oVar;
                long j = mVar.b;
                if (j != 0 && (i = (int) (j - mVar.a)) >= 0) {
                    return i;
                }
                return 0;
            }
            if (!(oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) && !Intrinsics.c(oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a)) {
                zzl.b();
            }
        }
        return 0;
    }

    public static ArrayList v(com.facebook.f0 f0Var) {
        Exception exc;
        HttpURLConnection httpURLConnection;
        ArrayList arrayList;
        com.facebook.internal.h.i(f0Var);
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = K(f0Var);
            exc = null;
        } catch (Exception e) {
            exc = e;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
            com.facebook.internal.k0.j(httpURLConnection2);
            throw th;
        }
        try {
            if (httpURLConnection != null) {
                arrayList = w(f0Var, httpURLConnection);
            } else {
                ArrayList p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.p(f0Var.b, null, new com.facebook.q(exc));
                H(f0Var, p);
                arrayList = p;
            }
            com.facebook.internal.k0.j(httpURLConnection);
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            com.facebook.internal.k0.j(httpURLConnection2);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
    
        if (0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList w(com.facebook.f0 f0Var, HttpURLConnection httpURLConnection) {
        ArrayList p;
        InputStream inputStream = null;
        try {
            try {
                if (!com.facebook.w.g()) {
                    throw new com.facebook.q("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.r(inputStream, httpURLConnection, f0Var);
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (com.facebook.q e) {
            com.facebook.b bVar = com.facebook.internal.a0.a;
            synchronized (com.facebook.w.b) {
                p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.p(f0Var, httpURLConnection, e);
            }
        } catch (Exception e2) {
            com.facebook.b bVar2 = com.facebook.internal.a0.a;
            synchronized (com.facebook.w.b) {
                p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.p(f0Var, httpURLConnection, new com.facebook.q(e2));
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                com.facebook.internal.k0.j(httpURLConnection);
                int size = f0Var.b.size();
                if (size != p.size()) {
                    throw new com.facebook.q(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(p.size()), Integer.valueOf(size)}, 2)));
                }
                H(f0Var, p);
                com.facebook.i i = com.facebook.i.f.i();
                AccessToken accessToken = i.c;
                if (accessToken != null) {
                    long time = new Date().getTime();
                    if (accessToken.f.a && time - i.e.getTime() > 3600000 && time - accessToken.g.getTime() > 86400000) {
                        if (Intrinsics.c(Looper.getMainLooper(), Looper.myLooper())) {
                            i.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new com.appsflyer.b(i, 6));
                        }
                    }
                }
                return p;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object x(String str, Bundle bundle, com.facebook.appevents.p pVar) {
        Object obj;
        Map map;
        str.getClass();
        if (pVar != null) {
            LinkedHashMap linkedHashMap = pVar.a;
            com.facebook.appevents.q qVar = com.facebook.appevents.q.a;
            if (linkedHashMap.containsKey(qVar) && (map = (Map) linkedHashMap.get(qVar)) != null) {
                obj = map.get(str);
                return obj != null ? bundle != null ? bundle.getCharSequence(str) : null : obj;
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    public static int y(String str) {
        str.getClass();
        Map map = com.facebook.appevents.p.b;
        com.facebook.appevents.q qVar = com.facebook.appevents.q.a;
        kotlin.Pair pair = (kotlin.Pair) map.get(qVar);
        Set set = pair != null ? (Set) pair.a : null;
        kotlin.Pair pair2 = (kotlin.Pair) map.get(qVar);
        Set set2 = pair2 != null ? (Set) pair2.b : null;
        if (set == null || !set.contains(str)) {
            return (set2 == null || !set2.contains(str)) ? 1 : 3;
        }
        return 2;
    }

    public static boolean z(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest$ParcelableResourceWithMimeType);
    }
}
