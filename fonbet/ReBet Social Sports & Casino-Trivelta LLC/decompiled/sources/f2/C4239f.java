package f2;

import e1.AbstractC4134a;
import e2.InterfaceC4169k;
import java.util.Collections;
import java.util.List;

/* renamed from: f2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4239f implements InterfaceC4169k {

    /* renamed from: a, reason: collision with root package name */
    public final List f46373a;

    public C4239f(List list) {
        this.f46373a = list;
    }

    @Override // e2.InterfaceC4169k
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // e2.InterfaceC4169k
    public List b(long j10) {
        return j10 >= 0 ? this.f46373a : Collections.EMPTY_LIST;
    }

    @Override // e2.InterfaceC4169k
    public long c(int i10) {
        AbstractC4134a.a(i10 == 0);
        return 0L;
    }

    @Override // e2.InterfaceC4169k
    public int d() {
        return 1;
    }
}
