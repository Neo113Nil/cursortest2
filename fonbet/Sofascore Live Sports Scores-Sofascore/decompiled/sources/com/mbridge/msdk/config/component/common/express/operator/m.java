package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.wt3;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class m {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) ? a() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) ? d(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) ? f(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) ? c(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) ? a(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) ? e(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) ? e(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) ? d(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) ? g(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) ? a(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) ? b(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) ? b(obj) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("898")) ? c(obj) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e) {
            StringBuilder q = wt3.q("Error handling map operation: ", str, ", ");
            q.append(e.getMessage());
            q0.b("MapOperator", q.toString(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String valueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(valueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) valueOf)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(valueOf)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String valueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(valueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b((Object) valueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(valueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj) {
        ?? r2;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z) {
            r2 = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                r2.put(entry.getKey(), entry.getValue());
            }
        } else {
            r2 = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject((Map) r2).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003f, B:15:0x004d, B:17:0x0053, B:19:0x005b, B:21:0x0063, B:24:0x0086), top: B:13:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj) {
        Map map;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            if (z) {
                HashMap hashMap = new HashMap();
                Iterator<Map.Entry<String, Object>> it = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a().iterator();
                while (true) {
                    map = hashMap;
                    if (it.hasNext()) {
                        Map.Entry<String, Object> next = it.next();
                        hashMap.put(next.getKey(), next.getValue());
                    }
                }
                StringBuilder sb = new StringBuilder();
                boolean z2 = true;
                for (Map.Entry entry : map.entrySet()) {
                    if (!z2) {
                        sb.append(U3.j.c);
                    }
                    sb.append(URLEncoder.encode((String) entry.getKey(), C.UTF8_NAME));
                    sb.append(U3.j.b);
                    sb.append(URLEncoder.encode(String.valueOf(entry.getValue()), C.UTF8_NAME));
                    z2 = false;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
            }
            map = (Map) obj;
            StringBuilder sb2 = new StringBuilder();
            boolean z22 = true;
            while (r0.hasNext()) {
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
        } catch (Throwable th) {
            q0.b("MapOperator", "Error encoding URL parameters: " + th.getMessage(), th);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String valueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(valueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(valueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(valueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if ("or".equals(java.lang.String.valueOf(r5.get(0)).trim().toLowerCase()) != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        ?? r3;
        boolean z = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z) {
            r3 = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                r3.put(entry.getKey(), entry.getValue());
            }
        } else {
            r3 = (Map) obj;
        }
        String str = (list == null || list.isEmpty()) ? "and" : "or";
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry2 : r3.entrySet()) {
            if (!z2) {
                wt3.A(" ", str, sb, " ");
            }
            sb.append((String) entry2.getKey());
            sb.append(U3.j.b);
            sb.append(entry2.getValue());
            z2 = false;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Collection<Object> g = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).g();
            if (!g.isEmpty()) {
                arrayList.addAll(g);
            }
        }
        if (obj instanceof Map) {
            Collection values = ((Map) obj).values();
            if (!values.isEmpty()) {
                arrayList.addAll(values);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a(str)) {
            return a(str, obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        String str;
        Map<String, Object> map;
        if (list != null && !list.isEmpty()) {
            str = String.valueOf(list.get(0));
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                map = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(str));
            } catch (JSONException e) {
                q0.b("MapOperator", e.getMessage());
                map = null;
            }
            if (map != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Set<String> e = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e();
            if (!e.isEmpty()) {
                arrayList.addAll(e);
            }
        }
        if (obj instanceof Map) {
            Set keySet = ((Map) obj).keySet();
            if (!keySet.isEmpty()) {
                arrayList.addAll(keySet);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String str;
        if (list != null && !list.isEmpty()) {
            str = String.valueOf(list.get(0));
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c(str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).f()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("898"));
    }
}
