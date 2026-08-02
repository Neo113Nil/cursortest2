package com.google.firebase.messaging;

import android.text.TextUtils;
import com.sports.insider.data.room.general.table.AccountTable;
import io.sentry.android.core.w0;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final long f6186d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f6187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6189c;

    public y(long j, String str, String str2) {
        this.f6187a = str;
        this.f6188b = str2;
        this.f6189c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AccountTable.tokenColumn, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e7) {
            w0.m("FirebaseMessaging", "Failed to encode token: " + e7);
            return null;
        }
    }

    public static y b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new y(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new y(jSONObject.getLong("timestamp"), jSONObject.getString(AccountTable.tokenColumn), jSONObject.getString("appVersion"));
        } catch (JSONException e7) {
            w0.m("FirebaseMessaging", "Failed to parse token: " + e7);
            return null;
        }
    }
}
