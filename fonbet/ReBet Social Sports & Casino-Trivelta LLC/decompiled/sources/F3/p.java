package F3;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f3555a;

    public p(List list) {
        this.f3555a = list;
    }

    @Override // F3.o
    public List b() {
        return this.f3555a;
    }

    @Override // F3.o
    public boolean c() {
        return this.f3555a.isEmpty() || (this.f3555a.size() == 1 && ((G3.a) this.f3555a.get(0)).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f3555a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f3555a.toArray()));
        }
        return sb2.toString();
    }
}
