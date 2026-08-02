package L4;

/* loaded from: classes2.dex */
public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f7002a;

        a(boolean z10) {
            this.f7002a = z10;
        }

        public boolean b() {
            return this.f7002a;
        }
    }

    boolean a();

    void b(d dVar);

    boolean c(d dVar);

    boolean d(d dVar);

    boolean f(d dVar);

    void g(d dVar);

    e getRoot();
}
