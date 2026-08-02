package uh;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public enum n implements InterfaceC6581e {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    public static final Logger f66737b = Logger.getLogger(n.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f66738c = new ThreadLocal();

    public class c implements InterfaceC6587k {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6579c f66740a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC6579c f66741b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f66742c;

        @Override // uh.InterfaceC6587k, java.lang.AutoCloseable
        public void close() {
            if (this.f66742c || n.this.current() != this.f66741b) {
                n.f66737b.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
            } else {
                this.f66742c = true;
                n.f66738c.set(this.f66740a);
            }
        }

        public c(InterfaceC6579c interfaceC6579c, InterfaceC6579c interfaceC6579c2) {
            this.f66740a = interfaceC6579c;
            this.f66741b = interfaceC6579c2;
        }
    }

    @Override // uh.InterfaceC6581e
    public InterfaceC6579c current() {
        return (InterfaceC6579c) f66738c.get();
    }

    @Override // uh.InterfaceC6581e
    public InterfaceC6587k r(InterfaceC6579c interfaceC6579c) {
        if (interfaceC6579c == null) {
            return b.INSTANCE;
        }
        InterfaceC6579c current = current();
        if (interfaceC6579c == current) {
            return b.INSTANCE;
        }
        f66738c.set(interfaceC6579c);
        return new c(current, interfaceC6579c);
    }

    public enum b implements InterfaceC6587k {
        INSTANCE;

        @Override // uh.InterfaceC6587k, java.lang.AutoCloseable
        public void close() {
        }
    }
}
