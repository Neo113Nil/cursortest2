package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l0.AbstractC5338c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f37943a;

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f37944d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f37945a;

        /* renamed from: b, reason: collision with root package name */
        public final String f37946b;

        /* renamed from: c, reason: collision with root package name */
        public final long f37947c;

        public a(String str, String str2, long j10) {
            this.f37945a = str;
            this.f37946b = str2;
            this.f37947c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(EventKeys.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(EventKeys.TIMESTAMP));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.f37947c + f37944d || !str.equals(this.f37946b);
        }
    }

    public e0(Context context) {
        this.f37943a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    public final void a(Context context, String str) {
        File file = new File(AbstractC5338c.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e10.getMessage();
            }
        }
    }

    public final String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f37943a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b10 = b(str, str2);
        SharedPreferences.Editor edit = this.f37943a.edit();
        edit.remove(b10);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f37943a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f37943a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f37943a.edit();
        edit.putString(b(str, str2), a10);
        edit.commit();
    }
}
