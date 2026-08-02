package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    private String a;
    private Map<String, Object> b;
    private List<e> c;

    public e(String str) {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
        this.a = str;
    }

    public void a(String str, Object obj) {
        Map map = this.b;
        if (map == null) {
            map = new HashMap();
            this.b = map;
        }
        map.put(str, obj);
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public List<e> a() {
        return this.c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.c = list;
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.b = map;
    }

    public e() {
        this.a = "";
        this.b = new HashMap();
        this.c = new ArrayList();
    }
}
