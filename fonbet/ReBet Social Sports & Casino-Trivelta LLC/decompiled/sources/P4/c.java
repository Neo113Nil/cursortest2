package P4;

/* loaded from: classes2.dex */
public abstract class c {

    public static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f8812a;

        public b() {
            super();
        }

        @Override // P4.c
        public void b(boolean z10) {
            this.f8812a = z10;
        }

        @Override // P4.c
        public void c() {
            if (this.f8812a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    public abstract void b(boolean z10);

    public abstract void c();

    public c() {
    }
}
