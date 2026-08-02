package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c {
    protected CrashType a;
    protected Context b;
    private ICommonParams c = com.apm.insight.e.a().c();
    private b d;
    private d e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i, com.apm.insight.entity.a aVar);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.a = crashType;
        this.b = context;
        this.d = bVar;
        this.e = dVar;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Data fetch failed since source misstake:\n" + m.a(th), 0);
                aVar.a(hashMap);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        com.apm.insight.e.g();
        aVar.a("process_name", com.apm.insight.l.a.b());
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + m.a(th)));
            } catch (Throwable unused) {
            }
        }
        String k = com.apm.insight.e.k();
        if (k != null) {
            aVar.a("business", (Object) k);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a()));
        return aVar;
    }

    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i == 0) {
            b(aVar);
            return aVar;
        }
        if (i == 1) {
            c(aVar);
            List<AttachUserData> a2 = com.apm.insight.e.b().a(this.a);
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = aVar.c().optJSONObject(Payload.CUSTOM);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                aVar.a(Payload.CUSTOM, optJSONObject);
            }
            if (a2 != null) {
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    try {
                        AttachUserData attachUserData = a2.get(i2);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(optJSONObject, attachUserData.getUserData(this.a));
                        hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    } catch (Throwable th) {
                        com.apm.insight.entity.a.a(optJSONObject, th);
                    }
                }
            }
            try {
                optJSONObject.put("fd_count", com.apm.insight.a.f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> b = com.apm.insight.e.b().b(this.a);
            if (b != null) {
                JSONObject optJSONObject2 = aVar.c().optJSONObject("custom_long");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    aVar.a("custom_long", optJSONObject2);
                }
                while (r0 < b.size()) {
                    try {
                        AttachUserData attachUserData2 = b.get(r0);
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(optJSONObject2, attachUserData2.getUserData(this.a));
                        hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                    } catch (Throwable th2) {
                        com.apm.insight.entity.a.a(optJSONObject2, th2);
                    }
                    r0++;
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    optJSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (Throwable unused2) {
                }
            }
        } else {
            if (i == 2) {
                d dVar = this.e;
                aVar.a("battery", Integer.valueOf(dVar != null ? dVar.a() : 0));
                aVar.c(com.apm.insight.e.b().a());
                return aVar;
            }
            if (i == 5 && c()) {
                aVar.b(n.a());
                return aVar;
            }
        }
        return aVar;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public final com.apm.insight.entity.a a(@Nullable com.apm.insight.entity.a aVar, @Nullable a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i = 0; i < a(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i, aVar3);
                } catch (Throwable unused) {
                }
            }
            try {
                aVar3 = a(i, aVar3);
            } catch (Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i, aVar3);
                } catch (Throwable unused3) {
                }
                if (z) {
                    if (i != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(String.valueOf(i)), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return a(aVar);
    }

    public int a() {
        return 6;
    }
}
