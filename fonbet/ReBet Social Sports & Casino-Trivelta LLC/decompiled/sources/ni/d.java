package ni;

import java.io.InvalidObjectException;
import mi.o;
import oi.AbstractC5909e;
import oi.p;
import oi.q;
import oi.x;

/* loaded from: classes5.dex */
public abstract class d extends net.time4j.format.d implements o {

    /* renamed from: b, reason: collision with root package name */
    public final transient char f58568b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f58569c;
    private final Class<q> chrono;

    public d(String str, Class cls, char c10, boolean z10) {
        super(str);
        this.chrono = cls;
        this.f58568b = c10;
        this.f58569c = z10;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return this.f58568b;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    public Object readResolve() {
        String name = name();
        for (p pVar : x.z(this.chrono).v()) {
            if (pVar.name().equals(name)) {
                return pVar;
            }
        }
        throw new InvalidObjectException(name);
    }

    @Override // oi.AbstractC5909e
    public boolean s(AbstractC5909e abstractC5909e) {
        return this.chrono == ((d) abstractC5909e).chrono;
    }

    public Class x() {
        return this.chrono;
    }
}
