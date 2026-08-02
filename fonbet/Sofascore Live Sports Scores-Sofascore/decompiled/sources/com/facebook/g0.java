package com.facebook;

import defpackage.wt3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g0 {
    public static final /* synthetic */ int e = 0;
    public final HttpURLConnection a;
    public final JSONObject b;
    public final FacebookRequestError c;
    public final JSONObject d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(d0 d0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(d0Var, httpURLConnection, jSONObject, null, null);
        d0Var.getClass();
        str.getClass();
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder q = wt3.q("{Response:  responseCode: ", str, ", graphObject: ");
        q.append(this.b);
        q.append(", error: ");
        q.append(this.c);
        q.append("}");
        return q.toString();
    }

    public g0(d0 d0Var, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        d0Var.getClass();
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = facebookRequestError;
        this.d = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(d0 d0Var, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(d0Var, httpURLConnection, null, null, facebookRequestError);
        d0Var.getClass();
    }
}
