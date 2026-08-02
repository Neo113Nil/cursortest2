package di;

import Zh.InterfaceC1901b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: di.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4124y implements V0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f45435a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f45436b;

    public C4124y(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f45435a = compute;
        this.f45436b = new ConcurrentHashMap();
    }

    @Override // di.V0
    public InterfaceC1901b a(KClass key) {
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f45436b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj = new C4101m((InterfaceC1901b) this.f45435a.invoke(key))))) != null) {
            obj = putIfAbsent;
        }
        return ((C4101m) obj).f45389a;
    }
}
