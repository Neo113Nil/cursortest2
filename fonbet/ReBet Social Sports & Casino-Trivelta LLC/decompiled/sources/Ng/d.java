package Ng;

import Qg.h;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8088a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f8089b;

    static {
        h factory;
        ServiceLoader load = ServiceLoader.load(c.class, c.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(load, "load(it, it.classLoader)");
        List list = CollectionsKt.toList(load);
        f8088a = list;
        c cVar = (c) CollectionsKt.firstOrNull(list);
        if (cVar == null || (factory = cVar.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f8089b = factory;
    }

    public static final a a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return e.a(f8089b, block);
    }
}
