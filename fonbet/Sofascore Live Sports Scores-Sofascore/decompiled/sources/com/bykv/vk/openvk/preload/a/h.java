package com.bykv.vk.openvk.preload.a;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h {
    Class<? extends d> a;
    private com.bykv.vk.openvk.preload.a.b.a b;
    private Object[] c;

    private h(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.a != null) {
            return;
        }
        a70.p("Interceptor class == null");
        throw null;
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        private Class<? extends d> a;
        private com.bykv.vk.openvk.preload.a.b.a b;
        private Object[] c;

        private a() {
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.a = cls;
                return this;
            }
            a70.p("interceptor class == null");
            return null;
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public static a a() {
            return new a();
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }
}
