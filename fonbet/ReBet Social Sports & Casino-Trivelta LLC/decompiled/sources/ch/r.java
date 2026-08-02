package ch;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends AbstractC2926c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f27838a = new HashMap();

    @Override // ch.InterfaceC2925b
    public Object c(C2924a key, Function0 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object invoke = block.invoke();
        Object put = h().put(key, invoke);
        if (put != null) {
            invoke = put;
        }
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return invoke;
    }

    @Override // ch.AbstractC2926c
    public Map h() {
        return this.f27838a;
    }
}
