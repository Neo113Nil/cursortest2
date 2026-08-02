package com.mbridge.msdk.config.component.pipeline;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.base.c;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.ls2;

/* compiled from: PipelineManager.java */
/* loaded from: classes13.dex */
public class a implements c {
    private final String b;
    private Map<String, Object> c;
    private Handler e;
    private Handler g;
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a h;
    private d i;
    private final String a = "PipMg";
    private final HandlerThread d = new HandlerThread("FilterPipelineThread");
    private final HandlerThread f = new HandlerThread("ComponentThread");

    public a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.b("PipMg", "Pipeline can not be null");
        }
        this.h = aVar;
        this.b = com.mbridge.msdk.config.component.pipeline.util.a.a();
        this.i = new d();
        this.c = new e().a(str);
        a();
    }

    public void a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            q0.b("PipMg", "Pipeline can not be null");
        } else {
            this.c.putAll(map);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(b bVar) {
        try {
            String a = bVar.a();
            String c = bVar.c();
            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(c) && this.c != null) {
                String d = bVar.d();
                if (!a(bVar, d, a)) {
                    a(bVar, (Map<String, Object>) this.c.get(d), d);
                    return;
                }
                for (Map.Entry<String, Object> entry : this.c.entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof Map) {
                        a(bVar, (Map<String, Object>) value, key);
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
    }

    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a c(b bVar) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
        aVar.a(com.mbridge.msdk.config.component.common.util.c.c("50"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.c("50")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("50")) : bVar.b());
        aVar.a(com.mbridge.msdk.config.component.common.util.c.c("51"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.c("51")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("51")) : new com.mbridge.msdk.config.dynamic.binddata.wrapper.a());
        aVar.a("g0", this.h);
        aVar.a(com.mbridge.msdk.config.component.common.util.c.c("52"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.c("52")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("52")) : new HashMap());
        aVar.a(com.mbridge.msdk.config.component.common.util.c.c("sdk_context"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.c("sdk_context")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("sdk_context")) : new HashMap());
        return aVar;
    }

    private void a() {
        this.d.start();
        this.e = new Handler(this.d.getLooper());
        this.f.start();
        this.g = new Handler(this.f.getLooper());
    }

    private boolean a(b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || str2.equals(BundleUtil.UNDERLINE_TAG)) {
            return true;
        }
        try {
            if (bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.c("50"))) {
                Object obj = bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("50"));
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (map.containsKey(com.mbridge.msdk.config.component.common.util.c.c("18"))) {
                        Object obj2 = map.get(com.mbridge.msdk.config.component.common.util.c.c("18"));
                        if (obj2 instanceof String) {
                            return obj2.equals("1");
                        }
                        return (obj2 instanceof Integer) && ((Integer) obj2).intValue() == 1;
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
        return false;
    }

    private void a(b bVar, Map<String, Object> map, String str) {
        Object obj = map.get(bVar.c());
        List<Map> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return;
        }
        final com.mbridge.msdk.config.dynamic.binddata.wrapper.a c = c(bVar);
        String str2 = "";
        for (Map map2 : list) {
            Object obj2 = map2.get(com.mbridge.msdk.config.component.common.util.c.c("11"));
            Object obj3 = map2.get(com.mbridge.msdk.config.component.common.util.c.c("12"));
            boolean z = true;
            if (obj2 != null) {
                str2 = String.valueOf(obj2);
                if (!TextUtils.isEmpty(str2)) {
                    Object a = this.i.a(str2, c);
                    if (a instanceof Integer) {
                        if (((Integer) a).intValue() != 1) {
                            z = false;
                        }
                    } else if (a instanceof String) {
                        z = String.valueOf(a).equals("1");
                    }
                }
            }
            final String str3 = str2;
            if (z && obj3 != null && (obj3 instanceof List)) {
                List list2 = (List) obj3;
                if (!list2.isEmpty()) {
                    for (Object obj4 : list2) {
                        if (obj4 instanceof Map) {
                            final Map<?, ?> a2 = a((Map) obj4, c);
                            long a3 = com.mbridge.msdk.config.component.pipeline.util.a.a(String.valueOf(a2.get(com.mbridge.msdk.config.component.common.util.c.c("14"))));
                            if (a3 > 0) {
                                final b bVar2 = bVar;
                                final String str4 = str;
                                this.g.postDelayed(new Runnable() { // from class: xsna.j8y0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.mbridge.msdk.config.component.pipeline.a.this.b(bVar2, a2, c, str3, str4);
                                    }
                                }, a3);
                            } else {
                                final b bVar3 = bVar;
                                final String str5 = str;
                                this.g.post(new Runnable() { // from class: xsna.p8y0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.mbridge.msdk.config.component.pipeline.a.this.c(bVar3, a2, c, str3, str5);
                                    }
                                });
                                bVar = bVar3;
                            }
                        }
                    }
                }
            }
            bVar = bVar;
            str2 = str3;
            str = str;
        }
    }

    private Map<?, ?> a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> a = (map == null || map.isEmpty()) ? null : com.mbridge.msdk.config.component.common.util.c.a((Map<String, Object>) map, aVar);
        return a == null ? new LinkedHashMap() : a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(b bVar, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String valueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("15")));
                String concat = this.b.concat(".").concat(valueOf.toLowerCase()).concat(".").concat(valueOf).concat("Cpt");
                com.mbridge.msdk.config.component.base.a a = a(concat, map, aVar);
                if (a == null) {
                    a = (com.mbridge.msdk.config.component.base.a) Class.forName(concat).getDeclaredConstructor(null).newInstance(null);
                    a(concat, a, aVar);
                }
                a.a(this);
                a.a(map, aVar, str2);
                a.d();
            } catch (Throwable th) {
                q0.b("PipMg", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.config.component.base.a a(String str, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map map2;
        Map map3;
        List<com.mbridge.msdk.config.component.base.a> list;
        try {
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty() && (map2 = (Map) aVar.b((Object) com.mbridge.msdk.config.component.common.util.c.c("sdk_context"))) != null && !map2.isEmpty() && (map3 = (Map) map2.get(com.mbridge.msdk.config.component.common.util.c.c("component_cache"))) != null && !map3.isEmpty() && map3.containsKey(str) && (list = (List) map3.get(str)) != null && !list.isEmpty()) {
            for (com.mbridge.msdk.config.component.base.a aVar2 : list) {
                if ((aVar2 instanceof com.mbridge.msdk.config.component.base.d) && ((com.mbridge.msdk.config.component.base.d) aVar2).a(map)) {
                    return aVar2;
                }
            }
            return null;
        }
        return null;
    }

    private void a(String str, com.mbridge.msdk.config.component.base.a aVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2) {
        Map map;
        try {
            if ((aVar instanceof com.mbridge.msdk.config.component.base.d) && (map = (Map) aVar2.b((Object) com.mbridge.msdk.config.component.common.util.c.c("sdk_context"))) != null && !map.isEmpty()) {
                Map map2 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.c("component_cache"));
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("component_cache"), map2);
                }
                if (map2.containsKey(str)) {
                    List list = (List) map2.get(str);
                    if (list != null) {
                        list.add(aVar);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    map2.put(str, arrayList);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aVar);
                map2.put(str, arrayList2);
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.c
    public void a(b bVar) {
        this.e.post(new ls2(11, this, bVar));
    }
}
