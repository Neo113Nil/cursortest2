package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;

/* renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class RunnableC4470o4 implements Runnable {
    private final JSONObject a;

    public RunnableC4470o4(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C4452n4.d().h).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(Http.Header.ACCEPT, "application/json");
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
