package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.unity3d.ads.BuildConfig;
import defpackage.a70;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    private com.bykv.vk.openvk.preload.falconx.a.a a;
    private Queue<String> b;
    private b c;
    private File d;

    private a(b bVar) {
        new ArrayList();
        this.a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.b = new LinkedBlockingQueue();
        this.c = bVar;
        File n = bVar.n();
        this.d = n;
        n.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.c);
    }

    private boolean a() {
        List<String> d = this.c.d();
        List<String> e = this.c.e();
        if (d == null || d.isEmpty() || e == null || e.isEmpty()) {
            return false;
        }
        for (String str : e) {
            Iterator<String> it = d.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> e = this.c.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = e.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.c.e());
        try {
            String a = new com.bykv.vk.openvk.preload.geckox.a.a(arrayList).a();
            if (aVar.c.p() != null && aVar.c.p().a()) {
                aVar.c.p();
            } else if (aVar.b.size() < 10) {
                aVar.b.add(a);
            }
        } catch (Throwable unused) {
        }
    }

    public static a a(b bVar) {
        List<String> e = bVar.e();
        if (e != null && !e.isEmpty()) {
            bVar.a();
            return new a(bVar);
        }
        a70.p("access key empty");
        return null;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.a.b.a aVar) {
        this.a.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            if (a()) {
                if (b(map)) {
                    final com.bykv.vk.openvk.preload.geckox.d.a aVar = null;
                    final Map map2 = null;
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVar;
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.c.b() != null) {
                                bVar = a.this.c.b().a();
                                bVar.a(a.this.c.b(), a.this.c.n(), a.this.c.e());
                            } else {
                                bVar = null;
                            }
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVar2 = bVar;
                            try {
                                try {
                                    a.this.c.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(aVar, a.this.d, a.this.c, a.this.a, map2, map, str).a((com.bykv.vk.openvk.preload.a.b<Object>) str));
                                    if (bVar2 != null) {
                                        bVar2.a();
                                    }
                                    JSONObject f = a.this.c.f();
                                    if (f == null) {
                                        f = new JSONObject();
                                    }
                                    try {
                                        f.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                                    } catch (Throwable unused) {
                                    }
                                    a.this.c.q().upload("download_gecko_end", f);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                } catch (Exception e) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("success", false);
                                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, e.toString());
                                        jSONObject.put("code", 2);
                                        a.this.c.a(jSONObject);
                                    } catch (Throwable unused2) {
                                    }
                                    GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e);
                                    if (bVar2 != null) {
                                        bVar2.a();
                                    }
                                    JSONObject f2 = a.this.c.f();
                                    if (f2 == null) {
                                        f2 = new JSONObject();
                                    }
                                    try {
                                        f2.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                                    } catch (Throwable unused3) {
                                    }
                                    a.this.c.q().upload("download_gecko_end", f2);
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                }
                                a.d(a.this);
                            } catch (Throwable th) {
                                if (bVar2 != null) {
                                    bVar2.a();
                                }
                                JSONObject f3 = a.this.c.f();
                                if (f3 == null) {
                                    f3 = new JSONObject();
                                }
                                try {
                                    f3.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                                } catch (Throwable unused4) {
                                }
                                a.this.c.q().upload("download_gecko_end", f3);
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                throw th;
                            }
                        }
                    });
                    return;
                }
                a70.p("target keys not in deployments keys");
                return;
            }
            a70.p("deployments keys not in local keys");
            return;
        }
        a70.p("groupType == null");
    }
}
