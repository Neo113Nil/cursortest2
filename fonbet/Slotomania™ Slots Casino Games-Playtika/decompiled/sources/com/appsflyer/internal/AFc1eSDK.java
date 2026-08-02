package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\f\u0010\u0011J\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0018R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFc1eSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getCurrencyIso4217Code", "()Z", "Ljava/net/HttpURLConnection;", "AFAdRevenueData", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/net/HttpURLConnection;J)Z", "getRevenue", "[B", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1kSDK;", "()Lcom/appsflyer/internal/AFd1kSDK;", "getMediationNetwork", "Ljava/util/Map;", "Z", "I", "()Ljava/lang/String;", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class AFc1eSDK {

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public int getRevenue;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final boolean AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public Map<String, String> getCurrencyIso4217Code;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public byte[] getMonetizationNetwork;

    /* renamed from: AFAdRevenueData */
    public abstract AFd1kSDK getGetMediationNetwork();

    public abstract String getCurrencyIso4217Code(String str);

    public abstract String getMediationNetwork();

    public AFc1eSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMonetizationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.getRevenue = i;
        this.AFAdRevenueData = true;
    }

    /* renamed from: getMonetizationNetwork, reason: from getter */
    public boolean getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    public final boolean getCurrencyIso4217Code() {
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String mediationNetwork = getMediationNetwork();
            Intrinsics.checkNotNullParameter(mediationNetwork, "");
            URLConnection openConnection = new URL(mediationNetwork).openConnection();
            Intrinsics.checkNotNull(openConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            try {
                boolean AFAdRevenueData = AFAdRevenueData(httpURLConnection2, currentTimeMillis);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return AFAdRevenueData;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + ("error: " + th + "\n\ttook " + (System.currentTimeMillis() - currentTimeMillis) + "ms\n\t" + th.getMessage()));
                    if (getAFAdRevenueData()) {
                        AFLogger.afRDLog(currencyIso4217Code);
                    } else {
                        AFLogger.afVerboseLog(currencyIso4217Code);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean AFAdRevenueData(HttpURLConnection httpURLConnection, long j) {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ").append(new String(this.getMonetizationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getRevenue);
        httpURLConnection.setConnectTimeout(this.getRevenue);
        httpURLConnection.addRequestProperty("Content-Type", getGetMediationNetwork().getRevenue);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(this.getMonetizationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMonetizationNetwork);
        bufferedOutputStream.close();
        String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ("response code:" + httpURLConnection.getResponseCode() + ServerSentEventKt.SPACE + httpURLConnection.getResponseMessage() + "\n\tbody:" + AFAdRevenueData(httpURLConnection) + "\n\ttook " + (System.currentTimeMillis() - j) + "ms"));
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code2);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code2);
        }
        return AFd1xSDK.getMediationNetwork(httpURLConnection);
    }

    private static String AFAdRevenueData(HttpURLConnection p0) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p0.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = p0.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String joinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return joinToString$default == null ? "" : joinToString$default;
    }
}
