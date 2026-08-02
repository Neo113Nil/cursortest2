package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c15 extends Thread {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c15(ghh ghhVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = ghhVar;
        this.b = conditionVariable;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        DataOutputStream dataOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream2;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        int read;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                super.run();
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.facebook.com/adnw_logging/").openConnection()));
                    try {
                        httpURLConnection2.setRequestMethod(C4094gc.b);
                        httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection2.setRequestProperty("Accept", C4427z5.M);
                        httpURLConnection2.setRequestProperty("Accept-Charset", C.UTF8_NAME);
                        httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.connect();
                        String uuid = UUID.randomUUID().toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("attempt", "0");
                        DexLoadErrorReporter.a(context, jSONObject, uuid);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", "1");
                        jSONObject2.put("stacktrace", (String) this.c);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("id", UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        StringBuilder sb = new StringBuilder("");
                        httpURLConnection = httpURLConnection2;
                        try {
                            sb.append(System.currentTimeMillis() / 1000);
                            jSONObject3.put("session_time", sb.toString());
                            jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject3.put("session_id", uuid);
                            jSONObject3.put("data", jSONObject2);
                            jSONObject3.put("attempt", "0");
                            DexLoadErrorReporter.a(context, jSONObject2, uuid);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("data", jSONObject);
                            jSONObject4.put("events", jSONArray);
                            String jSONObject5 = jSONObject4.toString();
                            dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                            try {
                                dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(jSONObject5, C.UTF8_NAME));
                                dataOutputStream2.flush();
                                bArr = new byte[16384];
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection.getInputStream();
                            } catch (Throwable unused) {
                                dataOutputStream = dataOutputStream2;
                                inputStream = null;
                                if (dataOutputStream != null) {
                                }
                                if (inputStream != null) {
                                }
                                if (httpURLConnection == null) {
                                }
                                httpURLConnection.disconnect();
                                return;
                            }
                        } catch (Throwable unused2) {
                            dataOutputStream = null;
                            inputStream = null;
                            if (dataOutputStream != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (httpURLConnection == null) {
                            }
                            httpURLConnection.disconnect();
                            return;
                        }
                    } catch (Throwable unused3) {
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable unused4) {
                    dataOutputStream = null;
                    inputStream = null;
                    httpURLConnection = null;
                }
                while (true) {
                    try {
                        read = inputStream2.read(bArr);
                    } catch (Throwable unused5) {
                        inputStream = inputStream2;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Exception unused6) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused7) {
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        try {
                            dataOutputStream2.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            inputStream2.close();
                        } catch (Exception unused9) {
                        }
                        httpURLConnection.disconnect();
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            case 1:
                synchronized (((ghh) this.c)) {
                    ((ConditionVariable) this.b).open();
                    ((ghh) this.c).g();
                    ((ghh) this.c).b.getClass();
                }
                return;
            default:
                Process.setThreadPriority(((jun) this.c).b);
                ((Runnable) this.b).run();
                return;
        }
    }

    public c15(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c15(jun junVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.b = runnable2;
        this.c = junVar;
    }
}
