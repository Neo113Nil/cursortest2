package j9;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f18351e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f18352f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f18353a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18354b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f18355c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f18356d = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f18353a = sharedPreferences;
    }

    public final l a() {
        l lVar;
        synchronized (this.f18355c) {
            int i5 = this.f18353a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f18353a.getLong("backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f18349a = i5;
            lVar.f18350b = date;
        }
        return lVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f18353a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final l c() {
        l lVar;
        synchronized (this.f18356d) {
            int i5 = this.f18353a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f18353a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f18349a = i5;
            lVar.f18350b = date;
        }
        return lVar;
    }

    public final void d(int i5, Date date) {
        synchronized (this.f18355c) {
            this.f18353a.edit().putInt("num_failed_fetches", i5).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f18354b) {
            this.f18353a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(Date date) {
        synchronized (this.f18356d) {
            this.f18353a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g(int i5, Date date) {
        synchronized (this.f18356d) {
            this.f18353a.edit().putInt("num_failed_realtime_streams", i5).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void h() {
        synchronized (this.f18354b) {
            this.f18353a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void i() {
        synchronized (this.f18354b) {
            this.f18353a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
