package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.L;

/* loaded from: classes5.dex */
public final class B extends D implements L {
    public B(int i10) {
        super(1, Integer.MAX_VALUE, Rh.d.f10308b);
        a(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.L
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i10) {
        boolean a10;
        synchronized (this) {
            a10 = a(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return a10;
    }
}
