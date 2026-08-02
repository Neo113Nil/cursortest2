package com.google.firebase.remoteconfig.internal;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.c;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ex1;
import xsna.f9e0;
import xsna.ixi;
import xsna.uir;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
public final class b {
    public static final long i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};
    public final uir a;
    public final f9e0<ex1> b;
    public final Executor c;
    public final Random d;
    public final ixi e;
    public final ConfigFetchHttpClient f;
    public final c g;
    public final Map<String, String> h;

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes13.dex */
    public static class a {
        public final int a;
        public final com.google.firebase.remoteconfig.internal.a b;

        @Nullable
        public final String c;

        public a(int i, com.google.firebase.remoteconfig.internal.a aVar, @Nullable String str) {
            this.a = i;
            this.b = aVar;
            this.c = str;
        }

        public static a a() {
            return new a(1, null, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.a aVar, String str) {
            return new a(0, aVar, str);
        }

        public static a c() {
            return new a(2, null, null);
        }

        public final com.google.firebase.remoteconfig.internal.a d() {
            return this.b;
        }

        @Nullable
        public final String e() {
            return this.c;
        }

        public final int f() {
            return this.a;
        }
    }

    public b(uir uirVar, f9e0 f9e0Var, Executor executor, Random random, ixi ixiVar, ConfigFetchHttpClient configFetchHttpClient, c cVar, HashMap hashMap) {
        this.a = uirVar;
        this.b = f9e0Var;
        this.c = executor;
        this.d = random;
        this.e = ixiVar;
        this.f = configFetchHttpClient;
        this.g = cVar;
        this.h = hashMap;
    }

    public final a a(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        Date date2;
        String str3;
        HttpURLConnection b;
        ConfigFetchHttpClient configFetchHttpClient;
        HashMap b2;
        String string;
        Map<String, String> map;
        ex1 ex1Var;
        try {
            b = this.f.b();
            configFetchHttpClient = this.f;
            b2 = b();
            string = this.g.a.getString("last_fetch_etag", null);
            map = this.h;
            ex1Var = this.b.get();
            date2 = date;
        } catch (FirebaseRemoteConfigServerException e) {
            e = e;
            date2 = date;
        }
        try {
            a fetch = configFetchHttpClient.fetch(b, str, str2, b2, string, map, ex1Var != null ? (Long) ex1Var.c(true).get("_fot") : null, date2);
            if (fetch.e() != null) {
                c cVar = this.g;
                String e2 = fetch.e();
                synchronized (cVar.b) {
                    cVar.a.edit().putString("last_fetch_etag", e2).apply();
                }
            }
            this.g.b(0, c.e);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e3) {
            e = e3;
            FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
            int d = firebaseRemoteConfigServerException.d();
            c cVar2 = this.g;
            if (d == 429 || d == 502 || d == 503 || d == 504) {
                int i2 = cVar2.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                cVar2.b(i2, new Date(date2.getTime() + (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.d.nextInt((int) r2)));
            }
            c.a a2 = cVar2.a();
            int d2 = firebaseRemoteConfigServerException.d();
            if (a2.a > 1 || d2 == 429) {
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.", a2.b.getTime());
            }
            int d3 = firebaseRemoteConfigServerException.d();
            if (d3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (d3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (d3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (d3 != 500) {
                    switch (d3) {
                        case 502:
                        case 503:
                        case ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.d(), "Fetch failed: ".concat(str3), firebaseRemoteConfigServerException);
        }
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        ex1 ex1Var = this.b.get();
        if (ex1Var != null) {
            for (Map.Entry<String, Object> entry : ex1Var.c(false).entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
