package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC2574o4 implements Runnable {
    private final JSONObject a;

    public RunnableC2574o4(JSONObject stringToSend) {
        Intrinsics.checkNotNullParameter(stringToSend, "stringToSend");
        this.a = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection openConnection = new URL(C2556n4.d().h).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", B5.M);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
            dataOutputStream.writeBytes(this.a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection)));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            ironLog.verbose("sent crash report for type " + this.a.get("crashType") + " and date " + this.a.get("crashDate"));
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
        }
    }
}
