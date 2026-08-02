package ch;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends AbstractC2926c {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f27829a = new ConcurrentHashMap();

    @Override // ch.InterfaceC2925b
    public Object c(C2924a key, Function0 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object invoke = block.invoke();
        Object putIfAbsent = h().putIfAbsent(key, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    @Override // ch.AbstractC2926c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap h() {
        return this.f27829a;
    }
}
