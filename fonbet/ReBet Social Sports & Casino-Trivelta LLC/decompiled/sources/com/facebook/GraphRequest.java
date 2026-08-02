package com.facebook;

import T7.G;
import T7.J;
import T7.P;
import T7.Y;
import T7.Z;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.GraphRequest;
import com.facebook.react.devsupport.StackTraceHelper;
import com.orkestapay.orkestapay.core.clicktopay.WebviewActivity;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.EventKeys;
import g6.AsyncTaskC4337I;
import g6.C4331C;
import g6.C4338J;
import g6.C4339K;
import g6.C4346f;
import g6.C4357q;
import g6.EnumC4340L;
import g6.N;
import g6.S;
import g6.T;
import g6.U;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class GraphRequest {

    /* renamed from: n, reason: collision with root package name */
    public static final c f30314n = new c(null);

    /* renamed from: o, reason: collision with root package name */
    public static final String f30315o = GraphRequest.class.getSimpleName();

    /* renamed from: p, reason: collision with root package name */
    public static final String f30316p;

    /* renamed from: q, reason: collision with root package name */
    public static String f30317q;

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f30318r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile String f30319s;

    /* renamed from: a, reason: collision with root package name */
    public AccessToken f30320a;

    /* renamed from: b, reason: collision with root package name */
    public String f30321b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f30322c;

    /* renamed from: d, reason: collision with root package name */
    public String f30323d;

    /* renamed from: e, reason: collision with root package name */
    public String f30324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30325f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f30326g;

    /* renamed from: h, reason: collision with root package name */
    public Object f30327h;

    /* renamed from: i, reason: collision with root package name */
    public String f30328i;

    /* renamed from: j, reason: collision with root package name */
    public b f30329j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC4340L f30330k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30331l;

    /* renamed from: m, reason: collision with root package name */
    public String f30332m;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u0019*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "resource", "", "mimeType", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", com.google.crypto.tink.integration.android.b.f37029b, "Landroid/os/Parcelable;", "()Landroid/os/Parcelable;", "c", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String mimeType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Parcelable resource;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i10) {
                return new ParcelableResourceWithMimeType[i10];
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: b, reason: from getter */
        public final Parcelable getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable, String str) {
            this.mimeType = str;
            this.resource = parcelable;
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(C4331C.l().getClassLoader());
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final GraphRequest f30336a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f30337b;

        public a(GraphRequest request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f30336a = request;
            this.f30337b = obj;
        }

        public final GraphRequest a() {
            return this.f30336a;
        }

        public final Object b() {
            return this.f30337b;
        }
    }

    public interface b {
        void a(C4339K c4339k);
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void H(ArrayList callbacks, C4338J requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                bVar.a((C4339K) obj);
            }
            Iterator it2 = requests.m().iterator();
            while (it2.hasNext()) {
                ((C4338J.a) it2.next()).a(requests);
            }
        }

        public static final void z(d dVar, C4339K response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(response.c(), response);
        }

        public final GraphRequest A(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, EnumC4340L.POST, bVar, null, 32, null);
            graphRequest.G(jSONObject);
            return graphRequest;
        }

        public final GraphRequest B(AccessToken accessToken, String str, Bundle bundle, b bVar) {
            return new GraphRequest(accessToken, str, bundle, EnumC4340L.POST, bVar, null, 32, null);
        }

        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void D(JSONObject jSONObject, String str, e eVar) {
            boolean z10;
            Iterator<String> keys;
            if (u(str)) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, "?", 0, false, 6, (Object) null);
                if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                    z10 = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object value = jSONObject.opt(key);
                        boolean z11 = z10 && StringsKt.equals(key, "image", true);
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        E(key, value, eVar, z11);
                    }
                }
            }
            z10 = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        public final void E(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has(StackTraceHelper.ID_KEY)) {
                    String optString = jSONObject.optString(StackTraceHelper.ID_KEY);
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    E(str, optString, eVar, z10);
                    return;
                } else if (jSONObject.has(EventKeys.URL)) {
                    String optString2 = jSONObject.optString(EventKeys.URL);
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    E(str, optString2, eVar, z10);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                        E(str, jSONObject2, eVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    eVar.a(str, obj.toString());
                    return;
                }
                if (Date.class.isAssignableFrom(cls)) {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format2, "iso8601DateFormat.format(date)");
                    eVar.a(str, format2);
                    return;
                }
                Y y10 = Y.f11042a;
                Y.k0(GraphRequest.f30315o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i10);
                Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                E(format3, opt2, eVar, z10);
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        public final void F(C4338J c4338j, J j10, int i10, URL url, OutputStream outputStream, boolean z10) {
            f fVar = new f(outputStream, j10, z10);
            if (i10 != 1) {
                String p10 = p(c4338j);
                if (p10.length() == 0) {
                    throw new C4357q("App ID was not specified at the request or Settings.");
                }
                fVar.a("batch_app_id", p10);
                HashMap hashMap = new HashMap();
                K(fVar, c4338j, hashMap);
                if (j10 != null) {
                    j10.b("  Attachments:\n");
                }
                I(hashMap, fVar);
                return;
            }
            GraphRequest graphRequest = c4338j.get(0);
            HashMap hashMap2 = new HashMap();
            for (String key : graphRequest.u().keySet()) {
                Object obj = graphRequest.u().get(key);
                if (v(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, new a(graphRequest, obj));
                }
            }
            if (j10 != null) {
                j10.b("  Parameters:\n");
            }
            J(graphRequest.u(), fVar, graphRequest);
            if (j10 != null) {
                j10.b("  Attachments:\n");
            }
            I(hashMap2, fVar);
            JSONObject q10 = graphRequest.q();
            if (q10 != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                D(q10, path, fVar);
            }
        }

        public final void G(final C4338J requests, List responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    GraphRequest graphRequest = requests.get(i10);
                    if (graphRequest.o() != null) {
                        arrayList.add(new Pair(graphRequest.o(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: g6.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.c.H(arrayList, requests);
                    }
                };
                Handler l10 = requests.l();
                if ((l10 == null ? null : Boolean.valueOf(l10.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        public final void I(Map map, f fVar) {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.f30314n.v(((a) entry.getValue()).b())) {
                    fVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        public final void J(Bundle bundle, f fVar, GraphRequest graphRequest) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    fVar.j(key, obj, graphRequest);
                }
            }
        }

        public final void K(f fVar, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).C(jSONArray, map);
            }
            fVar.l("batch", jSONArray, collection);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void L(C4338J requests, HttpURLConnection connection) {
            Throwable th2;
            URL url;
            OutputStream outputStream;
            C4338J c4338j;
            c cVar;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            J j10 = new J(N.REQUESTS, "Request");
            int size = requests.size();
            boolean t10 = t(requests);
            OutputStream outputStream2 = null;
            EnumC4340L t11 = size == 1 ? requests.get(0).t() : null;
            if (t11 == null) {
                t11 = EnumC4340L.POST;
            }
            connection.setRequestMethod(t11.name());
            M(connection, t10);
            URL url2 = connection.getURL();
            j10.b("Request:\n");
            j10.d("Id", requests.n());
            Intrinsics.checkNotNullExpressionValue(url2, "url");
            j10.d(WebviewActivity.URL, url2);
            Object requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            j10.d("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty(Constants.USER_AGENT_HEADER_KEY);
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            j10.d(Constants.USER_AGENT_HEADER_KEY, requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            j10.d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.q());
            connection.setReadTimeout(requests.q());
            if (t11 != EnumC4340L.POST) {
                j10.e();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (t10) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th3) {
                        th2 = th3;
                        outputStream2 = bufferedOutputStream;
                        if (outputStream2 == null) {
                        }
                    }
                }
                try {
                    if (s(requests)) {
                        S s10 = new S(requests.l());
                        F(requests, null, size, url2, s10, t10);
                        url = url2;
                        OutputStream outputStream3 = bufferedOutputStream;
                        try {
                            outputStream = new T(outputStream3, requests, s10.B(), s10.r());
                            t10 = t10;
                            size = size;
                            cVar = this;
                            c4338j = requests;
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream2 = outputStream3;
                            th2 = th;
                            if (outputStream2 == null) {
                            }
                        }
                    } else {
                        url = url2;
                        outputStream = bufferedOutputStream;
                        c4338j = requests;
                        cVar = this;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    outputStream2 = bufferedOutputStream;
                }
                try {
                    cVar.F(c4338j, j10, size, url, outputStream, t10);
                    outputStream.close();
                    j10.e();
                } catch (Throwable th6) {
                    th = th6;
                    outputStream2 = outputStream;
                    th2 = th;
                    if (outputStream2 == null) {
                        throw th2;
                    }
                    outputStream2.close();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }

        public final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        public final HttpURLConnection N(C4338J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(P.h()));
                    L(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    Y.q(httpURLConnection);
                    throw new C4357q("could not construct request body", e10);
                } catch (JSONException e11) {
                    Y.q(httpURLConnection);
                    throw new C4357q("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new C4357q("could not construct URL for request", e12);
            }
        }

        public final void O(C4338J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<E> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (EnumC4340L.GET == graphRequest.t()) {
                    Y y10 = Y.f11042a;
                    if (Y.d0(graphRequest.u().getString("fields"))) {
                        J.a aVar = J.f10993e;
                        N n10 = N.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String r10 = graphRequest.r();
                        if (r10 == null) {
                            r10 = "";
                        }
                        sb2.append(r10);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(n10, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        public final HttpURLConnection g(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, r());
            httpURLConnection.setRequestProperty(Constants.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        public final C4339K h(GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List k10 = k(request);
            if (k10.size() == 1) {
                return (C4339K) k10.get(0);
            }
            throw new C4357q("invalid state: expected a single response");
        }

        public final List i(C4338J requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Z.l(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                Y.q(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = o(httpURLConnection, requests);
                } else {
                    List a10 = C4339K.f46964i.a(requests.o(), null, new C4357q(exc));
                    G(requests, a10);
                    list = a10;
                }
                Y.q(httpURLConnection);
                return list;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                Y.q(httpURLConnection2);
                throw th;
            }
        }

        public final List j(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return i(new C4338J(requests));
        }

        public final List k(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return j(ArraysKt.toList(requests));
        }

        public final AsyncTaskC4337I l(C4338J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Z.l(requests, "requests");
            AsyncTaskC4337I asyncTaskC4337I = new AsyncTaskC4337I(requests);
            asyncTaskC4337I.executeOnExecutor(C4331C.t(), new Void[0]);
            return asyncTaskC4337I;
        }

        public final AsyncTaskC4337I m(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return l(new C4338J(requests));
        }

        public final AsyncTaskC4337I n(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m(ArraysKt.toList(requests));
        }

        public final List o(HttpURLConnection connection, C4338J requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List f10 = C4339K.f46964i.f(connection, requests);
            Y.q(connection);
            int size = requests.size();
            if (size == f10.size()) {
                G(requests, f10);
                C4346f.f47052f.e().h();
                return f10;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f10.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new C4357q(format);
        }

        public final String p(C4338J c4338j) {
            String k10 = c4338j.k();
            if (k10 != null && !c4338j.isEmpty()) {
                return k10;
            }
            Iterator<E> it = c4338j.iterator();
            while (it.hasNext()) {
                AccessToken m10 = ((GraphRequest) it.next()).m();
                if (m10 != null) {
                    return m10.getApplicationId();
                }
            }
            String str = GraphRequest.f30317q;
            return (str == null || str.length() <= 0) ? C4331C.m() : str;
        }

        public final String q() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f30316p}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public final String r() {
            if (GraphRequest.f30319s == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.3.0"}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                GraphRequest.f30319s = format;
                String a10 = G.a();
                if (!Y.d0(a10)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f30319s, a10}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f30319s = format2;
                }
            }
            return GraphRequest.f30319s;
        }

        public final boolean s(C4338J c4338j) {
            for (C4338J.a aVar : c4338j.m()) {
            }
            Iterator<E> it = c4338j.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).o();
            }
            return false;
        }

        public final boolean t(C4338J c4338j) {
            Iterator<E> it = c4338j.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                Iterator<String> it2 = graphRequest.u().keySet().iterator();
                while (it2.hasNext()) {
                    if (v(graphRequest.u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean u(String str) {
            Matcher matcher = GraphRequest.f30318r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            return StringsKt.startsWith$default(str, "me/", false, 2, (Object) null) || StringsKt.startsWith$default(str, "/me/", false, 2, (Object) null);
        }

        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public final GraphRequest x(AccessToken accessToken, String str, b bVar) {
            return new GraphRequest(accessToken, str, null, null, bVar, null, 32, null);
        }

        public final GraphRequest y(AccessToken accessToken, final d dVar) {
            return new GraphRequest(accessToken, "me", null, null, new b(dVar) { // from class: g6.H
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    GraphRequest.c.z(null, c4339k);
                }
            }, null, 32, null);
        }

        public c() {
        }
    }

    public interface d {
        void a(JSONObject jSONObject, C4339K c4339k);
    }

    public interface e {
        void a(String str, String str2);
    }

    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f30338a;

        /* renamed from: b, reason: collision with root package name */
        public final J f30339b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f30340c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f30341d;

        public f(OutputStream outputStream, J j10, boolean z10) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f30338a = outputStream;
            this.f30339b = j10;
            this.f30340c = true;
            this.f30341d = z10;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            j10.d(Intrinsics.stringPlus("    ", key), value);
        }

        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void c(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.f30341d) {
                OutputStream outputStream = this.f30338a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f30340c) {
                OutputStream outputStream2 = this.f30338a;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f30338a;
                String str = GraphRequest.f30316p;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f30338a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f30340c = false;
            }
            OutputStream outputStream5 = this.f30338a;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(format, *args)");
            byte[] bytes5 = format3.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            f(key, key, ClipboardModule.MIMETYPE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f30338a);
            i("", new Object[0]);
            k();
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            j10.d(Intrinsics.stringPlus("    ", key), "<Image>");
        }

        public final void e(String key, byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f30338a.write(bytes);
            i("", new Object[0]);
            k();
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            j10.d(stringPlus, format);
        }

        public final void f(String str, String str2, String str3) {
            if (this.f30341d) {
                OutputStream outputStream = this.f30338a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                byte[] bytes = format.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(String key, Uri contentUri, String str) {
            int p10;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f30338a instanceof S) {
                ((S) this.f30338a).k(Y.z(contentUri));
                p10 = 0;
            } else {
                InputStream openInputStream = C4331C.l().getContentResolver().openInputStream(contentUri);
                Y y10 = Y.f11042a;
                p10 = Y.p(openInputStream, this.f30338a);
            }
            i("", new Object[0]);
            k();
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            j10.d(stringPlus, format);
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) {
            int p10;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f30338a;
            if (outputStream instanceof S) {
                ((S) outputStream).k(descriptor.getStatSize());
                p10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                Y y10 = Y.f11042a;
                p10 = Y.p(autoCloseInputStream, this.f30338a);
            }
            i("", new Object[0]);
            k();
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            j10.d(stringPlus, format);
        }

        public final void i(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f30341d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String key, Object obj, GraphRequest graphRequest) {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.f30338a;
            if (closeable instanceof U) {
                ((U) closeable).d(graphRequest);
            }
            c cVar = GraphRequest.f30314n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) resource, mimeType);
            }
        }

        public final void k() {
            if (!this.f30341d) {
                i("--%s", GraphRequest.f30316p);
                return;
            }
            OutputStream outputStream = this.f30338a;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.f30338a;
            if (!(closeable instanceof U)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                a(key, jSONArray);
                return;
            }
            U u10 = (U) closeable;
            f(key, null, null);
            c("[", new Object[0]);
            Iterator it = requests.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                GraphRequest graphRequest = (GraphRequest) it.next();
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                u10.d(graphRequest);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            J j10 = this.f30339b;
            if (j10 == null) {
                return;
            }
            String stringPlus = Intrinsics.stringPlus("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
            j10.d(stringPlus, jSONArray2);
        }
    }

    public static final class g implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30342a;

        public g(ArrayList arrayList) {
            this.f30342a = arrayList;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f30342a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < nextInt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        f30316p = sb3;
        f30318r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static final GraphRequest B(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
        return f30314n.A(accessToken, str, jSONObject, bVar);
    }

    public static final void b(b bVar, C4339K response) {
        int length;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject c10 = response.c();
        JSONObject optJSONObject = c10 == null ? null : c10.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    N n10 = N.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(optString2, "warning")) {
                        n10 = N.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Y.d0(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    J.a aVar = J.f10993e;
                    String TAG = f30315o;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.b(n10, TAG, optString);
                }
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.a(response);
    }

    public final boolean A() {
        if (Intrinsics.areEqual(C4331C.x(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    public final void C(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f30323d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f30325f);
        }
        String str2 = this.f30324e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v10 = v();
        jSONObject.put("relative_url", v10);
        jSONObject.put("method", this.f30330k);
        AccessToken accessToken = this.f30320a;
        if (accessToken != null) {
            J.f10993e.d(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f30326g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f30326g.get(it.next());
            if (f30314n.v(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f30322c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f30314n.D(jSONObject2, v10, new g(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public final void D(AccessToken accessToken) {
        this.f30320a = accessToken;
    }

    public final void E(final b bVar) {
        C4331C c4331c = C4331C.f46921a;
        if (C4331C.I(N.GRAPH_API_DEBUG_INFO) || C4331C.I(N.GRAPH_API_DEBUG_WARNING)) {
            this.f30329j = new b() { // from class: g6.F
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    GraphRequest.b(GraphRequest.b.this, c4339k);
                }
            };
        } else {
            this.f30329j = bVar;
        }
    }

    public final void F(boolean z10) {
        this.f30331l = z10;
    }

    public final void G(JSONObject jSONObject) {
        this.f30322c = jSONObject;
    }

    public final void H(String str) {
        this.f30321b = str;
    }

    public final void I(EnumC4340L enumC4340L) {
        if (this.f30332m != null && enumC4340L != EnumC4340L.GET) {
            throw new C4357q("Can't change HTTP method on request with overridden URL.");
        }
        if (enumC4340L == null) {
            enumC4340L = EnumC4340L.GET;
        }
        this.f30330k = enumC4340L;
    }

    public final void J(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.f30326g = bundle;
    }

    public final void K(Object obj) {
        this.f30327h = obj;
    }

    public final void L(String str) {
        this.f30328i = str;
    }

    public final boolean M() {
        String n10 = n();
        boolean contains$default = n10 == null ? false : StringsKt.contains$default((CharSequence) n10, (CharSequence) "|", false, 2, (Object) null);
        if (n10 == null || !StringsKt.startsWith$default(n10, "IG", false, 2, (Object) null) || contains$default || !z()) {
            return (A() || contains$default) ? false : true;
        }
        return true;
    }

    public final void i() {
        Bundle bundle = this.f30326g;
        if (M()) {
            bundle.putString("access_token", p());
        } else {
            String n10 = n();
            if (n10 != null) {
                bundle.putString("access_token", n10);
            }
        }
        if (!bundle.containsKey("access_token")) {
            Y y10 = Y.f11042a;
            if (Y.d0(C4331C.r())) {
                Log.w(f30315o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", com.twilio.voice.Constants.PLATFORM_ANDROID);
        bundle.putString("format", "json");
        C4331C c4331c = C4331C.f46921a;
        if (C4331C.I(N.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C4331C.I(N.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    public final String j(String str, boolean z10) {
        if (!z10 && this.f30330k == EnumC4340L.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f30326g.keySet()) {
            Object obj = this.f30326g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f30314n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f30330k != EnumC4340L.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final C4339K k() {
        return f30314n.h(this);
    }

    public final AsyncTaskC4337I l() {
        return f30314n.n(this);
    }

    public final AccessToken m() {
        return this.f30320a;
    }

    public final String n() {
        AccessToken accessToken = this.f30320a;
        if (accessToken != null) {
            if (!this.f30326g.containsKey("access_token")) {
                String token = accessToken.getToken();
                J.f10993e.d(token);
                return token;
            }
        } else if (!this.f30326g.containsKey("access_token")) {
            return p();
        }
        return this.f30326g.getString("access_token");
    }

    public final b o() {
        return this.f30329j;
    }

    public final String p() {
        String m10 = C4331C.m();
        String r10 = C4331C.r();
        if (m10.length() <= 0 || r10.length() <= 0) {
            Y y10 = Y.f11042a;
            Y.k0(f30315o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return m10 + '|' + r10;
    }

    public final JSONObject q() {
        return this.f30322c;
    }

    public final String r() {
        return this.f30321b;
    }

    public final String s() {
        if (f30318r.matcher(this.f30321b).matches()) {
            return this.f30321b;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f30328i, this.f30321b}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final EnumC4340L t() {
        return this.f30330k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f30320a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f30321b);
        sb2.append(", graphObject: ");
        sb2.append(this.f30322c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f30330k);
        sb2.append(", parameters: ");
        sb2.append(this.f30326g);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    public final Bundle u() {
        return this.f30326g;
    }

    public final String v() {
        if (this.f30332m != null) {
            throw new C4357q("Can't override URL for a batch request");
        }
        String y10 = y(P.h());
        i();
        Uri parse = Uri.parse(j(y10, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final Object w() {
        return this.f30327h;
    }

    public final String x() {
        String i10;
        String str = this.f30332m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f30321b;
        if (this.f30330k == EnumC4340L.POST && str2 != null && StringsKt.endsWith$default(str2, "/videos", false, 2, (Object) null)) {
            i10 = P.j();
        } else {
            P p10 = P.f11032a;
            i10 = P.i(C4331C.x());
        }
        String y10 = y(i10);
        i();
        return j(y10, false);
    }

    public final String y(String str) {
        if (!A()) {
            str = P.f();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final boolean z() {
        if (this.f30321b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(C4331C.m());
        sb2.append("/?.*");
        return this.f30331l || Pattern.matches(sb2.toString(), this.f30321b) || Pattern.matches("^/?app/?.*", this.f30321b);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC4340L enumC4340L, b bVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : accessToken, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : enumC4340L, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC4340L enumC4340L, b bVar, String str2) {
        this.f30325f = true;
        this.f30320a = accessToken;
        this.f30321b = str;
        this.f30328i = str2;
        E(bVar);
        I(enumC4340L);
        if (bundle != null) {
            this.f30326g = new Bundle(bundle);
        } else {
            this.f30326g = new Bundle();
        }
        if (this.f30328i == null) {
            this.f30328i = C4331C.w();
        }
    }
}
