package com.airbnb.lottie.network;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f28988a;

    public a(HttpURLConnection httpURLConnection) {
        this.f28988a = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28988a.disconnect();
    }

    public final String d(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.airbnb.lottie.network.d
    public String g0() {
        return this.f28988a.getContentType();
    }

    @Override // com.airbnb.lottie.network.d
    public boolean isSuccessful() {
        try {
            return this.f28988a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.d
    public InputStream o0() {
        return this.f28988a.getInputStream();
    }

    @Override // com.airbnb.lottie.network.d
    public String o1() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f28988a.getURL() + ". Failed with " + this.f28988a.getResponseCode() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + d(this.f28988a);
        } catch (IOException | NullPointerException e10) {
            com.airbnb.lottie.utils.g.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
