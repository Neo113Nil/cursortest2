package kotlin.jvm.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y extends x {
    public y(String str, String str2, kotlin.reflect.d dVar) {
        super(AbstractC7724f.NO_RECEIVER, ((InterfaceC7726h) dVar).c(), str, str2, !Objects.nonNull(dVar) ? 1 : 0);
    }

    @Override // kotlin.reflect.o
    public final Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // kotlin.reflect.k
    public final void y(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
