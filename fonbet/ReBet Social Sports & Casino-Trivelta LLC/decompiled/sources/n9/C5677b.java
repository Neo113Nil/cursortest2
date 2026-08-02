package n9;

import java.util.Map;
import q9.InterfaceC6129a;

/* renamed from: n9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5677b extends AbstractC5681f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6129a f57082a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f57083b;

    public C5677b(InterfaceC6129a interfaceC6129a, Map map) {
        if (interfaceC6129a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f57082a = interfaceC6129a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f57083b = map;
    }

    @Override // n9.AbstractC5681f
    public InterfaceC6129a e() {
        return this.f57082a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5681f) {
            AbstractC5681f abstractC5681f = (AbstractC5681f) obj;
            if (this.f57082a.equals(abstractC5681f.e()) && this.f57083b.equals(abstractC5681f.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.AbstractC5681f
    public Map h() {
        return this.f57083b;
    }

    public int hashCode() {
        return ((this.f57082a.hashCode() ^ 1000003) * 1000003) ^ this.f57083b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f57082a + ", values=" + this.f57083b + "}";
    }
}
