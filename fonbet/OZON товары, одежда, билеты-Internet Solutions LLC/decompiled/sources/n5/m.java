package n5;

import n5.n;
import o5.InterfaceC8643a;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.D;
import sf.G;
import sf.InterfaceC9683i;
import sf.z;

/* loaded from: classes8.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f76531a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC9688n f76532b;

    /* renamed from: c, reason: collision with root package name */
    private final String f76533c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8643a.c f76534d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f76535e;

    /* renamed from: f, reason: collision with root package name */
    private G f76536f;

    public m(@NotNull D d11, @NotNull AbstractC9688n abstractC9688n, String str, InterfaceC8643a.c cVar) {
        super(0);
        this.f76531a = d11;
        this.f76532b = abstractC9688n;
        this.f76533c = str;
        this.f76534d = cVar;
    }

    @Override // n5.n
    public final n.a c() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f76535e = true;
            G g10 = this.f76536f;
            if (g10 != null) {
                A5.k.a(g10);
            }
            InterfaceC8643a.c cVar = this.f76534d;
            if (cVar != null) {
                A5.k.a(cVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // n5.n
    @NotNull
    public final synchronized InterfaceC9683i d() {
        if (this.f76535e) {
            throw new IllegalStateException("closed");
        }
        G g10 = this.f76536f;
        if (g10 != null) {
            return g10;
        }
        G d11 = z.d(this.f76532b.k(this.f76531a));
        this.f76536f = d11;
        return d11;
    }

    public final String j() {
        return this.f76533c;
    }
}
