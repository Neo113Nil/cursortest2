package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.vk.core.preference.Preference;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.fw3;

/* compiled from: Store.java */
/* loaded from: classes.dex */
public final class a {
    public final SharedPreferences a;

    /* compiled from: Store.java */
    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static class C0140a {
        public static final long d = TimeUnit.DAYS.toMillis(7);
        public static final /* synthetic */ int e = 0;
        public final String a;
        public final String b;
        public final long c;

        public C0140a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public static C0140a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0140a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0140a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                e2.toString();
                return null;
            }
        }
    }

    public a(Context context) {
        boolean isEmpty;
        SharedPreferences h = Preference.h(context, 0, "com.google.android.gms.appid");
        this.a = h;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = h.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                synchronized (this) {
                    h.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public static String a(String str, String str2) {
        return fw3.c(str, "|T|", str2, "|*");
    }
}
