package com.ironsource;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class RunnableC4175l4 implements Runnable {

    @NotNull
    private final JSONObject a;

    public RunnableC4175l4(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(C4157k4.d().h).openConnection());
            uRLConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(C4094gc.b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", C4427z5.M);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            String.valueOf(httpURLConnection.getResponseCode());
            httpURLConnection.getResponseMessage();
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.a.get("crashType") + " and date " + this.a.get("crashDate"));
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
