package ch;

import ch.InterfaceC2925b;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ch.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2926c implements InterfaceC2925b {
    @Override // ch.InterfaceC2925b
    public final List a() {
        return CollectionsKt.toList(h().keySet());
    }

    @Override // ch.InterfaceC2925b
    public final void b(C2924a key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        h().put(key, value);
    }

    @Override // ch.InterfaceC2925b
    public final boolean d(C2924a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h().containsKey(key);
    }

    @Override // ch.InterfaceC2925b
    public final void e(C2924a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        h().remove(key);
    }

    @Override // ch.InterfaceC2925b
    public final Object f(C2924a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h().get(key);
    }

    @Override // ch.InterfaceC2925b
    public Object g(C2924a c2924a) {
        return InterfaceC2925b.a.a(this, c2924a);
    }

    public abstract Map h();
}
