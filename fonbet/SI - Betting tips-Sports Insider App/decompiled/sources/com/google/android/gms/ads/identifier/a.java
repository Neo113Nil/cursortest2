package com.google.android.gms.ads.identifier;

import android.net.Uri;
import androidx.appcompat.widget.c1;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f4232a;

    public a(HashMap hashMap) {
        this.f4232a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.f4232a;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    w0.m("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + uri);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e7) {
            e = e7;
            w0.n("HttpUrlPinger", c1.o("Error while pinging URL: ", uri, ". ", e.getMessage()), e);
        } catch (IndexOutOfBoundsException e9) {
            w0.n("HttpUrlPinger", c1.o("Error while parsing ping URL: ", uri, ". ", e9.getMessage()), e9);
        } catch (RuntimeException e10) {
            e = e10;
            w0.n("HttpUrlPinger", c1.o("Error while pinging URL: ", uri, ". ", e.getMessage()), e);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
