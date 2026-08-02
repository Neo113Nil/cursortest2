package io.seon.androidsdk.service;

import android.net.TrafficStats;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.Constants;

/* renamed from: io.seon.androidsdk.service.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC4898c3 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final Lh.a f53254d = Lh.a.d(CallableC4898c3.class);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f53255e = Pattern.compile("[A-Za-z0-9](?:[A-Za-z0-9\\-]{0,61}[A-Za-z0-9])?");

    /* renamed from: a, reason: collision with root package name */
    public final C5001p2 f53256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53257b;

    /* renamed from: c, reason: collision with root package name */
    public C5016r2 f53258c;

    public CallableC4898c3(C5001p2 c5001p2, int i10) {
        this.f53256a = c5001p2;
        this.f53257b = i10;
    }

    public final HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        httpURLConnection.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        httpURLConnection.setRequestProperty(Constants.ACCEPT_HEADER, "*/*");
        httpURLConnection.setConnectTimeout(this.f53257b);
        httpURLConnection.setReadTimeout(this.f53257b);
        return httpURLConnection;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(10:(2:7|(19:9|10|11|12|13|(4:15|16|17|18)|26|(5:28|(1:30)|31|32|33)|34|35|36|37|(2:38|(1:40)(1:41))|42|(2:46|47)|51|31|32|33))|36|37|(3:38|(0)(0)|40)|42|(3:44|46|47)|51|31|32|33)|67|11|12|13|(0)|26|(0)|34|35) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: Exception -> 0x0117, TRY_LEAVE, TryCatch #4 {Exception -> 0x0117, blocks: (B:13:0x0048, B:15:0x0056, B:18:0x007e, B:22:0x0088, B:23:0x0091, B:26:0x0092, B:31:0x00b6, B:61:0x0113, B:62:0x0116, B:17:0x006b, B:25:0x0076, B:35:0x00ba, B:51:0x0104, B:56:0x0112, B:59:0x010f, B:37:0x00ca, B:38:0x00cf, B:40:0x00d5, B:42:0x00df, B:44:0x00ed, B:47:0x00f3, B:49:0x0101, B:55:0x010a), top: B:12:0x0048, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[Catch: all -> 0x00dd, LOOP:0: B:38:0x00cf->B:40:0x00d5, LOOP_END, TryCatch #6 {all -> 0x00dd, blocks: (B:37:0x00ca, B:38:0x00cf, B:40:0x00d5, B:42:0x00df, B:44:0x00ed, B:47:0x00f3, B:49:0x0101), top: B:36:0x00ca, outer: #3, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[EDGE_INSN: B:41:0x00df->B:42:0x00df BREAK  A[LOOP:0: B:38:0x00cf->B:40:0x00d5], SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String str;
        HttpURLConnection a10;
        int responseCode;
        BufferedReader bufferedReader;
        StringBuilder sb2;
        String readLine;
        String sb3;
        C5016r2 c5016r2 = new C5016r2();
        this.f53258c = c5016r2;
        C5001p2 c5001p2 = this.f53256a;
        if (c5001p2 == null) {
            return c5016r2;
        }
        String str2 = c5001p2.f53462a;
        String str3 = c5001p2.f53463b;
        try {
            try {
                if (str2 != null) {
                    Matcher matcher = f53255e.matcher(str2.replaceAll("[^a-zA-Z0-9-]", ""));
                    if (matcher.find()) {
                        try {
                            str = matcher.group();
                        } catch (Exception e10) {
                            f53254d.b(e10);
                        }
                        a10 = a("https://" + str + ".seondnsresolve.com/android");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(EventKeys.DATA, str3);
                        if (str3 != null) {
                            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                            DataOutputStream dataOutputStream = new DataOutputStream(a10.getOutputStream());
                            try {
                                try {
                                    dataOutputStream.writeBytes(jSONObject.toString());
                                } catch (Throwable th2) {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    TrafficStats.clearThreadStatsTag();
                                    throw th2;
                                }
                            } catch (Exception e11) {
                                f53254d.b(e11);
                                dataOutputStream.close();
                            }
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            TrafficStats.clearThreadStatsTag();
                        }
                        a10.connect();
                        responseCode = a10.getResponseCode();
                        f53254d.a(String.format("Status code: %s", String.valueOf(responseCode)), 4);
                        if (responseCode != 202) {
                            if (responseCode != 200) {
                            }
                            return this.f53258c;
                        }
                        bufferedReader = new BufferedReader(new InputStreamReader(a10.getInputStream(), "utf-8"));
                        sb2 = new StringBuilder();
                        while (true) {
                            readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                break;
                            }
                            sb2.append(readLine.trim());
                        }
                        this.f53258c.getClass();
                        sb3 = sb2.toString();
                        bufferedReader.close();
                        if (sb3 != null && !sb3.isEmpty()) {
                            try {
                                this.f53258c.f53479a = new JSONObject(sb3).getString(EventKeys.DATA);
                            } catch (JSONException unused) {
                                a10.disconnect();
                            }
                        }
                        bufferedReader.close();
                        return this.f53258c;
                    }
                }
                sb2 = new StringBuilder();
                while (true) {
                    readLine = bufferedReader.readLine();
                    if (readLine != null) {
                    }
                    sb2.append(readLine.trim());
                }
                this.f53258c.getClass();
                sb3 = sb2.toString();
                bufferedReader.close();
                if (sb3 != null) {
                    this.f53258c.f53479a = new JSONObject(sb3).getString(EventKeys.DATA);
                }
                bufferedReader.close();
                return this.f53258c;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(a10.getInputStream(), "utf-8"));
        } finally {
            a10.disconnect();
        }
        str = com.facebook.hermes.intl.Constants.COLLATION_DEFAULT;
        a10 = a("https://" + str + ".seondnsresolve.com/android");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(EventKeys.DATA, str3);
        if (str3 != null) {
        }
        a10.connect();
        responseCode = a10.getResponseCode();
        f53254d.a(String.format("Status code: %s", String.valueOf(responseCode)), 4);
        if (responseCode != 202) {
        }
    }
}
