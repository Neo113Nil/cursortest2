package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import defpackage.d7a;
import defpackage.dmi;
import defpackage.s80;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\r*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "()Z", "Ljava/net/HttpURLConnection;", "", "AFKeystoreWrapper", "(Ljava/net/HttpURLConnection;J)Z", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "[B", "unregisterClient", "Ljava/util/Map;", "AFLogger", "I", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", "registerClient", "()Lcom/appsflyer/internal/AFd1pSDK;", "Z", "v"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFc1bSDK {

    @NotNull
    public byte[] AFKeystoreWrapper;
    public int AFLogger;

    /* renamed from: registerClient, reason: from kotlin metadata */
    private final boolean v;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> d;

    public AFc1bSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        bArr.getClass();
        this.AFKeystoreWrapper = bArr;
        this.d = map;
        this.AFLogger = i;
        this.v = true;
    }

    private final boolean AFKeystoreWrapper(HttpURLConnection httpURLConnection, long j) {
        httpURLConnection.setRequestMethod(C4094gc.b);
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.AFKeystoreWrapper, Charsets.UTF_8).length());
        Map<String, String> map = this.d;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, d("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb)), getUnregisterClient());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFLogger);
        httpURLConnection.setConnectTimeout(this.AFLogger);
        httpURLConnection.addRequestProperty("Content-Type", getD().AFKeystoreWrapper);
        Map<String, String> map2 = this.d;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFKeystoreWrapper.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.getClass();
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.AFKeystoreWrapper);
        bufferedOutputStream.close();
        String d = d(httpURLConnection);
        long currentTimeMillis = System.currentTimeMillis() - j;
        StringBuilder t = dmi.t(httpURLConnection.getResponseCode(), "response code:", " ", httpURLConnection.getResponseMessage(), "\n\tbody:");
        i.n(currentTimeMillis, d, "\n\ttook ", t);
        t.append("ms");
        String sb2 = t.toString();
        AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, d("HTTP: [" + httpURLConnection.hashCode() + "] " + sb2), getUnregisterClient());
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    @NotNull
    public abstract String AFLogger();

    @NotNull
    public abstract String d(@NotNull String str);

    public final boolean d() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFLogger = AFLogger();
            AFLogger.getClass();
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(AFLogger).openConnection());
            uRLConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                boolean AFKeystoreWrapper = AFKeystoreWrapper(httpURLConnection, currentTimeMillis);
                httpURLConnection.disconnect();
                return AFKeystoreWrapper;
            } catch (Throwable th2) {
                th = th2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - currentTimeMillis) + "ms\n\t" + th.getMessage();
                    AFLogger.INSTANCE.v(LogTag.REMOTE_CONTROL, this.d("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str), this.getUnregisterClient());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th3) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            httpURLConnection = null;
            th = th4;
        }
    }

    @NotNull
    /* renamed from: registerClient */
    public abstract AFd1pSDK getD();

    /* renamed from: unregisterClient, reason: from getter */
    public boolean getUnregisterClient() {
        return this.v;
    }

    private static String d(HttpURLConnection p0) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p0.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.HTTP_CLIENT;
            String message = th.getMessage();
            AFLoggerBase.e$default(aFLogger, logTag, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p0.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        ArrayList arrayList = new ArrayList();
        d7a.u(bufferedReader, new s80(arrayList, 6));
        String f0 = CollectionsKt.f0(arrayList, null, null, null, null, 63);
        bufferedReader.close();
        return f0;
    }
}
