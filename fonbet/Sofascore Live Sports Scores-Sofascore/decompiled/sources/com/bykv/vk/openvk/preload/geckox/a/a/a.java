package com.bykv.vk.openvk.preload.geckox.a.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    final int a;
    final c b;
    private final b c;

    private a(C0024a c0024a) {
        this.a = c0024a.a;
        this.c = c0024a.b;
        this.b = c0024a.c;
    }

    public final b a() {
        return this.c;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0024a {
        private int a;
        private b b = b.a;
        private c c;

        public final C0024a a(b bVar) {
            if (bVar == null) {
                bVar = b.a;
            }
            this.b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0024a a() {
            this.a = 20;
            return this;
        }
    }

    public /* synthetic */ a(C0024a c0024a, byte b) {
        this(c0024a);
    }
}
