package kotlin.reflect.jvm.internal;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"useClassValue", "", "createCache", "Lkotlin/reflect/jvm/internal/CacheByClass;", "V", "", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheByClassKt {
    private static final boolean useClassValue = false;

    static {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            u2gVar = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (u2gVar instanceof u2g) {
            u2gVar = obj;
        }
    }

    @NotNull
    public static final <V> CacheByClass<V> createCache(@NotNull Function1<? super Class<?>, ? extends V> function1) {
        function1.getClass();
        return new ConcurrentHashMapCache(function1);
    }
}
