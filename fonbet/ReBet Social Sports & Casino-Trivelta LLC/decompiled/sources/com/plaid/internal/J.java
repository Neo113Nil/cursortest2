package com.plaid.internal;

import android.net.Network;
import com.plaid.internal.AbstractC3782w7;
import com.twilio.voice.VoiceURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class J {
    @NotNull
    public final C3645h4 a(@NotNull String urlText, @NotNull Network network) {
        Intrinsics.checkNotNullParameter(urlText, "urlText");
        Intrinsics.checkNotNullParameter(network, "network");
        try {
            URLConnection openConnection = network.openConnection(new URL(urlText));
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            C3645h4 c3645h4 = new C3645h4(httpURLConnection.getResponseCode(), a(httpURLConnection));
            httpURLConnection.disconnect();
            return c3645h4;
        } catch (AbstractC3782w7.d e10) {
            throw e10;
        } catch (Exception e11) {
            throw new AbstractC3782w7.c(e11);
        }
    }

    public static String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return str;
            }
            str = str + readLine;
        }
    }
}
