package com.mbridge.msdk.config.component.animation;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private final e a;
    private String b;
    private boolean c;

    public c(String str) {
        this.a = new e("animation");
        this.b = "";
        this.b = str == null ? "" : str;
    }

    private List<e> a(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof c) {
                    arrayList.addAll(((c) obj).a());
                } else if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (gVar.b() != null) {
                        Iterator<e> it = gVar.b().iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(it.next()));
                        }
                    }
                } else if (obj instanceof e) {
                    arrayList.add(a((e) obj));
                }
            }
        }
        return arrayList;
    }

    private c b(String str, Map<String, Object> map) {
        e eVar = new e(str);
        eVar.a(map);
        this.a.a().add(eVar);
        return this;
    }

    private Map<String, Object> c(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null) {
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        value = c((Map<String, Object>) value);
                    } else if (value instanceof List) {
                        value = new ArrayList((List) value);
                    }
                    hashMap.put(entry.getKey(), value);
                }
            }
        }
        return hashMap;
    }

    private Map<String, Object> g(Map<String, Object> map) {
        Map<String, Object> i = i(map);
        if (!i.containsKey("operators")) {
            i.put("operators", new ArrayList());
        }
        return i;
    }

    private Map<String, Object> h(Map<String, Object> map) {
        Map<String, Object> i = i(map);
        if (!i.containsKey("type") && i.containsKey("interpolatorType")) {
            i.put("type", i.get("interpolatorType"));
        }
        return i;
    }

    private Map<String, Object> i(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public c d(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("interpolatorType", obj);
        return f(hashMap);
    }

    public c e(Map<String, Object> map) {
        this.a.a(IronSourceConstants.EVENTS_DURATION, i(map));
        return this;
    }

    public c f(Map<String, Object> map) {
        this.a.a("interpolator", h(map));
        return this;
    }

    public c j(Map<String, Object> map) {
        return a("parallel", g(map));
    }

    public c k(Map<String, Object> map) {
        this.a.a("repeat", i(map));
        return this;
    }

    public c l(Map<String, Object> map) {
        return b("rotate", i(map));
    }

    public c m(Map<String, Object> map) {
        Map<String, Object> i = i(map);
        Object obj = i.get("maintainAspectRatio");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            if (i.containsKey("scaleX") && !i.containsKey("scaleY")) {
                i.put("scaleY", i.get("scaleX"));
            } else if (i.containsKey("scaleY") && !i.containsKey("scaleX")) {
                i.put("scaleX", i.get("scaleY"));
            }
        }
        return b("scale", i);
    }

    public c n(Map<String, Object> map) {
        return a("sequence", g(map));
    }

    public c o(Map<String, Object> map) {
        return a("stagger", g(map));
    }

    public c p(Map<String, Object> map) {
        return b("translate", i(map));
    }

    public c d(Map<String, Object> map) {
        this.a.a("delay", i(map));
        return this;
    }

    public c b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("delay", obj);
        return d((Map<String, Object>) hashMap);
    }

    public g b() {
        this.c = true;
        return c();
    }

    public c() {
        this.a = new e("animation");
        this.b = "";
    }

    public c b(Map<String, Object> map) {
        return b("color", i(map));
    }

    public g c() {
        g gVar = new g();
        gVar.a(this.b);
        gVar.a(this.c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.a));
        gVar.a(arrayList);
        return gVar;
    }

    public c c(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, obj);
        return e(hashMap);
    }

    public List<e> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(this.a));
        return arrayList;
    }

    private c a(String str, Map<String, Object> map) {
        e eVar = new e(str);
        Object remove = map.remove("operators");
        eVar.a(map);
        eVar.a(a(a(remove)));
        this.a.a().add(eVar);
        return this;
    }

    public c a(Map<String, Object> map) {
        return b("alpha", i(map));
    }

    private List<Object> a(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        ArrayList arrayList = new ArrayList();
        if (obj != null) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    private e a(e eVar) {
        e eVar2 = new e(eVar.c());
        eVar2.a(c(eVar.b()));
        ArrayList arrayList = new ArrayList();
        if (eVar.a() != null) {
            Iterator<e> it = eVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
        }
        eVar2.a(arrayList);
        return eVar2;
    }
}
