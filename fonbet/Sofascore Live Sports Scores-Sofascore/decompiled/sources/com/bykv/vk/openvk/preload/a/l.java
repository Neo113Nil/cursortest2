package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.h;
import defpackage.a70;
import defpackage.ilg;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {
    private Map<String, a> d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || (obj = objArr[0]) == null) {
            a70.r("args error");
            return;
        }
        try {
            this.d = (Map) obj;
        } catch (ClassCastException e) {
            ilg.k(e);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        List<h> a = new ArrayList();

        public final a a(h hVar) {
            this.a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.a.addAll(list);
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        private Map<String, a> a = new HashMap();
        private com.bykv.vk.openvk.preload.a.b.a b;

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.a).a(this.b).b();
        }

        public final a a(String str) {
            if (!this.a.containsKey(str)) {
                a aVar = new a();
                this.a.put(str, aVar);
                return aVar;
            }
            a70.p("duplicated branch name");
            return null;
        }
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) mz1.g(1, list)).a == f.class;
    }

    public final Map<String, a> a() {
        return this.d;
    }
}
