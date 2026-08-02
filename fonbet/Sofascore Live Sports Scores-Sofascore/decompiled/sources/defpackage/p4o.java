package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p4o implements g5o {
    public final mqn a;
    public final Context b;
    public final ExecutorService c;
    public ddb d = null;
    public final h4o e;
    public final t6o f;

    public p4o(mqn mqnVar, Context context, ExecutorService executorService, h4o h4oVar, t6o t6oVar) {
        this.a = mqnVar;
        this.b = context;
        this.c = executorService;
        this.e = h4oVar;
        this.f = t6oVar;
    }

    public final ddb a() {
        if (this.d == null) {
            this.f.d(InstrumentationData.Component.IDENTITY_MANAGER, InstrumentationData.Method.GET_IDLESS_STATE, new IllegalStateException("idLessState must be defined"));
            this.d = c();
            a5f.d(this.b.getApplicationContext()).registerOnSharedPreferenceChangeListener(new w3o(this, 0));
        }
        ddb ddbVar = this.d;
        ddbVar.getClass();
        return ddbVar;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        SharedPreferences d = a5f.d(this.b);
        if (d != null) {
            q5p it = this.e.b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (d.contains(str)) {
                    try {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1950496919) {
                            if (hashCode != -1808118735) {
                                if (hashCode == 1729365000 && str2.equals("Boolean")) {
                                    hashMap.put(str, String.valueOf(d.getBoolean(str, false)));
                                }
                            } else if (str2.equals("String")) {
                                hashMap.put(str, d.getString(str, ""));
                            }
                        } else if (str2.equals("Number")) {
                            hashMap.put(str, String.valueOf(d.getInt(str, -1)));
                        }
                    } catch (ClassCastException e) {
                        this.f.d(InstrumentationData.Component.IDENTITY_MANAGER, InstrumentationData.Method.GET_CONSENT_SETTINGS, e);
                    }
                }
            }
        }
        return hashMap;
    }

    public final ddb c() {
        if (!this.e.a) {
            return new e8p(Boolean.FALSE);
        }
        HashMap b = b();
        mqn mqnVar = this.a;
        mqnVar.getClass();
        String d = new h9p().d(b);
        String m = wt3.m("google.ima.NativeBridge.calculateIdlessState(", d, new StringBuilder(d.length() + 46), ")");
        vdb vdbVar = mqnVar.b;
        n8p q = n8p.q();
        ((Handler) vdbVar.d).post(new lv4(vdbVar, m, q, false, 21));
        f4o f4oVar = new x1p() { // from class: f4o
            @Override // defpackage.x1p
            public final /* synthetic */ Object apply(Object obj) {
                return (Boolean) ((b2p) obj).j(new x1p() { // from class: b4o
                    @Override // defpackage.x1p
                    public final /* synthetic */ Object apply(Object obj2) {
                        return new Boolean(Boolean.parseBoolean((String) obj2));
                    }
                }).h(Boolean.TRUE);
            }
        };
        int i = f7p.k;
        e7p e7pVar = new e7p(q, f4oVar);
        Executor executor = this.c;
        executor.getClass();
        if (executor != q7p.a) {
            executor = new irb(executor, e7pVar, 4);
        }
        q.addListener(e7pVar, executor);
        return e7pVar;
    }
}
