package n5;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n5.n;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.InterfaceC9683i;
import sf.x;

/* loaded from: classes8.dex */
public final class s extends n {

    /* renamed from: a, reason: collision with root package name */
    private final n.a f76540a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f76541b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9683i f76542c;

    public s(@NotNull InterfaceC9683i interfaceC9683i, @NotNull Function0<? extends File> function0, n.a aVar) {
        super(0);
        this.f76540a = aVar;
        this.f76542c = interfaceC9683i;
    }

    @Override // n5.n
    public final n.a c() {
        return this.f76540a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f76541b = true;
        InterfaceC9683i interfaceC9683i = this.f76542c;
        if (interfaceC9683i != null) {
            A5.k.a(interfaceC9683i);
        }
    }

    @Override // n5.n
    @NotNull
    public final synchronized InterfaceC9683i d() {
        InterfaceC9683i interfaceC9683i;
        try {
            if (this.f76541b) {
                throw new IllegalStateException("closed");
            }
            interfaceC9683i = this.f76542c;
            if (interfaceC9683i == null) {
                x xVar = AbstractC9688n.f98744a;
                Intrinsics.f(null);
                xVar.k(null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return interfaceC9683i;
    }
}
