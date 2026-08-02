package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e58 {
    public final Context a;
    public final l38 b;
    public final Executor c;
    public final di3 d;
    public final di3 e;
    public final di3 f;
    public final ji3 g;
    public final ki3 h;
    public final qi3 i;
    public final g7h j;
    public final g7h k;

    public e58(Context context, l38 l38Var, Executor executor, di3 di3Var, di3 di3Var2, di3 di3Var3, ji3 ji3Var, ki3 ki3Var, qi3 qi3Var, g7h g7hVar, g7h g7hVar2) {
        this.a = context;
        this.b = l38Var;
        this.c = executor;
        this.d = di3Var;
        this.e = di3Var2;
        this.f = di3Var3;
        this.g = ji3Var;
        this.h = ki3Var;
        this.i = qi3Var;
        this.j = g7hVar;
        this.k = g7hVar2;
    }

    public static e58 f() {
        return ((lxf) r38.c().b(lxf.class)).b("firebase");
    }

    public static ArrayList i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task a() {
        ji3 ji3Var = this.g;
        long j = ((qi3) ji3Var.h).a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap hashMap = new HashMap((Map) ji3Var.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return ((di3) ji3Var.f).b().continueWithTask((Executor) ji3Var.c, new gi3(ji3Var, j, hashMap)).onSuccessTask(u38.a, new hg6(16)).onSuccessTask(this.c, new d58(this));
    }

    public final HashMap b() {
        n58 n58Var;
        HashSet hashSet = new HashSet();
        ki3 ki3Var = this.h;
        di3 di3Var = ki3Var.c;
        hashSet.addAll(ki3.b(di3Var));
        di3 di3Var2 = ki3Var.d;
        hashSet.addAll(ki3.b(di3Var2));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String c = ki3.c(di3Var, str);
            if (c != null) {
                ki3Var.a(str, di3Var.c());
                n58Var = new n58(c, 2);
            } else {
                String c2 = ki3.c(di3Var2, str);
                n58Var = c2 != null ? new n58(c2, 1) : new n58("", 0);
            }
            hashMap.put(str, n58Var);
        }
        return hashMap;
    }

    public final boolean c(String str) {
        Pattern pattern = ki3.f;
        Pattern pattern2 = ki3.e;
        ki3 ki3Var = this.h;
        di3 di3Var = ki3Var.c;
        String c = ki3.c(di3Var, str);
        if (c != null) {
            if (pattern2.matcher(c).matches()) {
                ki3Var.a(str, di3Var.c());
                return true;
            }
            if (pattern.matcher(c).matches()) {
                ki3Var.a(str, di3Var.c());
                return false;
            }
        }
        String c2 = ki3.c(ki3Var.d, str);
        if (c2 != null) {
            if (pattern2.matcher(c2).matches()) {
                return true;
            }
            pattern.matcher(c2).matches();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double d(String str) {
        Double valueOf;
        ki3 ki3Var = this.h;
        di3 di3Var = ki3Var.c;
        fi3 c = di3Var.c();
        Double d = null;
        if (c != null) {
            try {
                valueOf = Double.valueOf(c.b.getDouble(str));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                ki3Var.a(str, di3Var.c());
                return valueOf.doubleValue();
            }
            fi3 c2 = ki3Var.d.c();
            if (c2 != null) {
                try {
                    d = Double.valueOf(c2.b.getDouble(str));
                } catch (JSONException unused2) {
                }
            }
            if (d != null) {
                return d.doubleValue();
            }
            Pattern pattern = ki3.e;
            return 0.0d;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public final zid e() {
        zid zidVar;
        qi3 qi3Var = this.i;
        synchronized (qi3Var.b) {
            try {
                qi3Var.a.getLong("last_fetch_time_in_millis", -1L);
                int i = qi3Var.a.getInt("last_fetch_status", 0);
                long j = qi3Var.a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j2 = qi3Var.a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                zidVar = new zid(i, 5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zidVar;
    }

    public final String g(String str) {
        ki3 ki3Var = this.h;
        di3 di3Var = ki3Var.c;
        String c = ki3.c(di3Var, str);
        if (c != null) {
            ki3Var.a(str, di3Var.c());
            return c;
        }
        String c2 = ki3.c(ki3Var.d, str);
        return c2 != null ? c2 : "";
    }

    public final void h(boolean z) {
        HttpURLConnection httpURLConnection;
        g7h g7hVar = this.j;
        synchronized (g7hVar) {
            ni3 ni3Var = (ni3) g7hVar.c;
            synchronized (ni3Var.q) {
                try {
                    ni3Var.e = z;
                    if (z && (httpURLConnection = ni3Var.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                g7hVar.g();
            }
        }
    }
}
