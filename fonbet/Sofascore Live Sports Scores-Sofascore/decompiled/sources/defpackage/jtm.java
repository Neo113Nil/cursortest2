package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jtm implements Handler.Callback {
    public final String a;
    public final jwm b;
    public final String c;
    public final ydm d;
    public final SparseIntArray e = new SparseIntArray();
    public Handler f;

    public jtm(jwm jwmVar, String str, ydm ydmVar) {
        this.a = jwmVar.b.gm();
        this.b = jwmVar;
        this.c = str;
        this.d = ydmVar;
    }

    public final SharedPreferences a() {
        return mha.e.getSharedPreferences("event_monitor_" + this.a + "_" + this.c + "_" + c90.H(), 0);
    }

    public final void b(int i, int i2) {
        synchronized (this.e) {
            this.e.put(i, this.e.get(i) + i2);
        }
    }

    public final void c(Looper looper, lum lumVar) {
        long j = a().getLong("last_upload_time", 0L);
        long pcc = this.d.pcc();
        if (j <= 0 || System.currentTimeMillis() - j <= pcc) {
            SharedPreferences a = a();
            String string = a.getString("event_counts", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    synchronized (this.e) {
                        while (keys.hasNext()) {
                            try {
                                String next = keys.next();
                                this.e.put(Integer.parseInt(next), jSONObject.getInt(next));
                            } finally {
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (j == 0) {
                a.edit().putLong("last_upload_time", System.currentTimeMillis()).apply();
            }
            Objects.toString(this.e);
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("instance_id", this.a);
                jSONObject2.putOpt("event_type", this.c);
                jSONObject2.putOpt("db_data_count", Integer.valueOf(lumVar.a(this.b.c())));
                SharedPreferences a2 = a();
                Map<String, ?> all = a2.getAll();
                for (String str : all.keySet()) {
                    if (!"last_upload_time".equals(str)) {
                        jSONObject2.put(str, all.get(str));
                    }
                }
                this.d.pcc(jSONObject2.toString());
                a2.edit().clear().putLong("last_upload_time", System.currentTimeMillis()).apply();
            } catch (Throwable unused2) {
            }
        }
        this.f = new Handler(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 10000) {
            return true;
        }
        Objects.toString(this.e);
        JSONObject jSONObject = new JSONObject();
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    jSONObject.putOpt(String.valueOf(this.e.keyAt(i)), Integer.valueOf(this.e.valueAt(i)));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONObject.length() <= 0) {
            return true;
        }
        SharedPreferences.Editor edit = a().edit();
        edit.putString("event_counts", jSONObject.toString());
        edit.apply();
        return true;
    }
}
