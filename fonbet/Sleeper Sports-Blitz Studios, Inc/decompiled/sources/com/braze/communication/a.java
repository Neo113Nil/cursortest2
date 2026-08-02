package com.braze.communication;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class a {
    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 == 2) {
            return StringsKt.equals("gzip", httpURLConnection.getContentEncoding(), true) ? new GZIPInputStream(httpURLConnection.getInputStream()) : new BufferedInputStream(httpURLConnection.getInputStream());
        }
        throw new com.braze.exceptions.a("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
    }
}
