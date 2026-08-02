package l6;

/* loaded from: classes8.dex */
public interface f {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z11) {
            this.isComplete = z11;
        }

        final boolean a() {
            return this.isComplete;
        }
    }

    boolean a();

    void c(InterfaceC7882e interfaceC7882e);

    boolean f(InterfaceC7882e interfaceC7882e);

    void g(InterfaceC7882e interfaceC7882e);

    f getRoot();

    boolean h(InterfaceC7882e interfaceC7882e);

    boolean i(InterfaceC7882e interfaceC7882e);
}
