package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lxf implements k58 {
    public static final DefaultClock j = DefaultClock.a;
    public static final Random k = new Random();
    public static final HashMap l = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final r38 d;
    public final l48 e;
    public final l38 f;
    public final vff g;
    public final String h;
    public final HashMap a = new HashMap();
    public final HashMap i = new HashMap();

    public lxf(Context context, ScheduledExecutorService scheduledExecutorService, r38 r38Var, l48 l48Var, l38 l38Var, vff vffVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = r38Var;
        this.e = l48Var;
        this.f = l38Var;
        this.g = vffVar;
        r38Var.a();
        this.h = r38Var.c.b;
        AtomicReference atomicReference = kxf.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = kxf.a;
        if (atomicReference2.get() == null) {
            kxf kxfVar = new kxf();
            while (true) {
                if (atomicReference2.compareAndSet(null, kxfVar)) {
                    BackgroundDetector.b(application);
                    BackgroundDetector.e.a(kxfVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new ji2(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized e58 a(r38 r38Var, String str, l48 l48Var, l38 l38Var, Executor executor, di3 di3Var, di3 di3Var2, di3 di3Var3, ji3 ji3Var, ki3 ki3Var, qi3 qi3Var, g7h g7hVar) {
        l38 l38Var2;
        if (!this.a.containsKey(str)) {
            Context context = this.b;
            if (str.equals("firebase")) {
                r38Var.a();
                if (r38Var.b.equals("[DEFAULT]")) {
                    l38Var2 = l38Var;
                    Context context2 = this.b;
                    synchronized (this) {
                        e58 e58Var = new e58(context, l38Var2, executor, di3Var, di3Var2, di3Var3, ji3Var, ki3Var, qi3Var, new g7h(r38Var, l48Var, ji3Var, di3Var2, context2, str, qi3Var, this.c), g7hVar);
                        di3Var2.b();
                        di3Var3.b();
                        di3Var.b();
                        this.a.put(str, e58Var);
                        l.put(str, e58Var);
                    }
                }
            }
            l38Var2 = null;
            Context context22 = this.b;
            synchronized (this) {
            }
        }
        return (e58) this.a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:38:0x0054, B:40:0x005c, B:11:0x0065, B:12:0x006c, B:21:0x0077, B:14:0x006d, B:15:0x0072), top: B:37:0x0054, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized e58 b(String str) {
        lxf lxfVar;
        Throwable th;
        di3 c;
        di3 c2;
        di3 c3;
        qi3 qi3Var;
        ki3 ki3Var;
        final k1d k1dVar;
        g7h g7hVar;
        try {
            try {
                c = c(str, "fetch");
                c2 = c(str, "activate");
                c3 = c(str, "defaults");
                Context context = this.b;
                try {
                    boolean z = false;
                    qi3Var = new qi3(context.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
                    ki3Var = new ki3(this.c, c2, c3);
                    r38 r38Var = this.d;
                    vff vffVar = this.g;
                    r38Var.a();
                    if (r38Var.b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                k1dVar = new k1d(vffVar);
                                if (k1dVar != null) {
                                    BiConsumer biConsumer = new BiConsumer() { // from class: jxf
                                        @Override // com.google.android.gms.common.util.BiConsumer
                                        public final void accept(Object obj, Object obj2) {
                                            JSONObject optJSONObject;
                                            k1d k1dVar2 = k1d.this;
                                            String str2 = (String) obj;
                                            fi3 fi3Var = (fi3) obj2;
                                            iu iuVar = (iu) ((vff) k1dVar2.b).get();
                                            if (iuVar == null) {
                                                return;
                                            }
                                            JSONObject jSONObject = fi3Var.e;
                                            if (jSONObject.length() < 1) {
                                                return;
                                            }
                                            JSONObject jSONObject2 = fi3Var.b;
                                            if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                                String optString = optJSONObject.optString("choiceId");
                                                if (optString.isEmpty()) {
                                                    return;
                                                }
                                                synchronized (((Map) k1dVar2.c)) {
                                                    try {
                                                        if (optString.equals(((Map) k1dVar2.c).get(str2))) {
                                                            return;
                                                        }
                                                        ((Map) k1dVar2.c).put(str2, optString);
                                                        Bundle f = bf3.f("arm_key", str2);
                                                        f.putString("arm_value", jSONObject2.optString(str2));
                                                        f.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                                        f.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                                        f.putString("group", optJSONObject.optString("group"));
                                                        iuVar.b("fp", "personalization_assignment", f);
                                                        Bundle bundle = new Bundle();
                                                        bundle.putString("_fpid", optString);
                                                        iuVar.b("fp", "_fpc", bundle);
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    };
                                    synchronized (ki3Var.a) {
                                        ki3Var.a.add(biConsumer);
                                    }
                                }
                                y3g y3gVar = new y3g(1, z);
                                y3gVar.b = c2;
                                y3gVar.c = c3;
                                ScheduledExecutorService scheduledExecutorService = this.c;
                                g7hVar = new g7h(18, z);
                                g7hVar.e = Collections.newSetFromMap(new ConcurrentHashMap());
                                g7hVar.b = c2;
                                g7hVar.c = y3gVar;
                                g7hVar.d = scheduledExecutorService;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            lxfVar = this;
                            throw th;
                        }
                    }
                    k1dVar = null;
                    if (k1dVar != null) {
                    }
                    y3g y3gVar2 = new y3g(1, z);
                    y3gVar2.b = c2;
                    y3gVar2.c = c3;
                    ScheduledExecutorService scheduledExecutorService2 = this.c;
                    g7hVar = new g7h(18, z);
                    g7hVar.e = Collections.newSetFromMap(new ConcurrentHashMap());
                    g7hVar.b = c2;
                    g7hVar.c = y3gVar2;
                    g7hVar.d = scheduledExecutorService2;
                } catch (Throwable th3) {
                    lxfVar = this;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            lxfVar = this;
            th = th;
            throw th;
        }
        return a(this.d, str, this.e, this.f, this.c, c, c2, c3, d(str, c, qi3Var), ki3Var, qi3Var, g7hVar);
    }

    public final di3 c(String str, String str2) {
        ri3 ri3Var;
        di3 di3Var;
        String o = mz1.o(mz1.s("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap hashMap = ri3.c;
        synchronized (ri3.class) {
            try {
                HashMap hashMap2 = ri3.c;
                if (!hashMap2.containsKey(o)) {
                    hashMap2.put(o, new ri3(context, o));
                }
                ri3Var = (ri3) hashMap2.get(o);
            } finally {
            }
        }
        HashMap hashMap3 = di3.d;
        synchronized (di3.class) {
            try {
                String str3 = ri3Var.b;
                HashMap hashMap4 = di3.d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new di3(scheduledExecutorService, ri3Var));
                }
                di3Var = (di3) hashMap4.get(str3);
            } finally {
            }
        }
        return di3Var;
    }

    public final synchronized ji3 d(String str, di3 di3Var, qi3 qi3Var) {
        l48 l48Var;
        Object kc3Var;
        ScheduledExecutorService scheduledExecutorService;
        DefaultClock defaultClock;
        Random random;
        String str2;
        r38 r38Var;
        try {
            l48Var = this.e;
            r38 r38Var2 = this.d;
            r38Var2.a();
            kc3Var = r38Var2.b.equals("[DEFAULT]") ? this.g : new kc3(10);
            scheduledExecutorService = this.c;
            defaultClock = j;
            random = k;
            r38 r38Var3 = this.d;
            r38Var3.a();
            str2 = r38Var3.c.a;
            r38Var = this.d;
            r38Var.a();
        } catch (Throwable th) {
            throw th;
        }
        return new ji3(l48Var, kc3Var, scheduledExecutorService, defaultClock, random, di3Var, new ConfigFetchHttpClient(this.b, r38Var.c.b, str2, str, qi3Var.a.getLong("fetch_timeout_in_seconds", 60L), qi3Var.a.getLong("fetch_timeout_in_seconds", 60L)), qi3Var, this.i);
    }
}
