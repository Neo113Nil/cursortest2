package com.playtika.pras.d;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.exoplayer2.audio.AacUtil;
import com.ironsource.B5;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes8.dex */
public final class h implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ d b;
    public final /* synthetic */ i c;

    public h(i iVar, c cVar, d dVar) {
        this.c = iVar;
        this.a = cVar;
        this.b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        HttpURLConnection httpURLConnection;
        StringBuilder sb;
        int responseCode;
        i iVar = this.c;
        c cVar = this.a;
        iVar.getClass();
        HttpURLConnection httpURLConnection2 = null;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(iVar.a).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, cVar.c);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("Accept", B5.M);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
            httpURLConnection.setReadTimeout(5000);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(cVar.a.toString().getBytes(B5.O));
            dataOutputStream.flush();
            dataOutputStream.close();
            sb = new StringBuilder("ES response: ");
            com.playtika.pras.c.d.a(sb.append(httpURLConnection.getResponseMessage()).toString());
            com.playtika.pras.c.d.a("@@@ response code: " + httpURLConnection.getResponseCode());
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            e = e2;
            httpURLConnection3 = httpURLConnection;
            Object jVar = new j(cVar, e);
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            obj = jVar;
            httpURLConnection2 = httpURLConnection3;
            g gVar = this.b.a;
            gVar.getClass();
            if (obj instanceof j) {
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        if (responseCode != 200) {
            throw new IOException("Invalid response from server: " + responseCode);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            } else {
                sb2.append(readLine.trim());
            }
        }
        Object kVar = new k(sb2.toString());
        httpURLConnection.disconnect();
        obj = kVar;
        httpURLConnection2 = sb;
        g gVar2 = this.b.a;
        gVar2.getClass();
        if (obj instanceof j) {
            return;
        }
        j jVar2 = (j) obj;
        com.playtika.pras.c.d.a("@@@ SendEventResult.Error: " + jVar2.b.getMessage());
        try {
            c cVar2 = (c) jVar2.a;
            cVar2.a(cVar2.b + 1);
            com.playtika.pras.c.d.a("### add to retry queue: request_id = " + cVar2.c);
            gVar2.j.add(cVar2);
            gVar2.c();
            if (gVar2.i) {
                return;
            }
            gVar2.i = true;
            gVar2.g.postDelayed(gVar2.h, gVar2.o);
        } catch (Exception e3) {
            com.playtika.pras.c.d.b(e3.getMessage());
        }
    }
}
