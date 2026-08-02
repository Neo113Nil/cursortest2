package zh;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/* renamed from: zh.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7009q {
    public static Supplier a() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? EnumC6993a.INSTANCE : new Supplier() { // from class: zh.p
            @Override // java.util.function.Supplier
            public final Object get() {
                return ThreadLocalRandom.current();
            }
        };
    }
}
