package kotlin.reflect.jvm.internal.impl.util;

import defpackage.xka;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeRegistry$getId$1 extends xka implements Function1<String, Integer> {
    final /* synthetic */ TypeRegistry<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeRegistry$getId$1(TypeRegistry<K, V> typeRegistry) {
        super(1);
        this.this$0 = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull String str) {
        AtomicInteger atomicInteger;
        str.getClass();
        atomicInteger = ((TypeRegistry) this.this$0).idCounter;
        return Integer.valueOf(atomicInteger.getAndIncrement());
    }
}
