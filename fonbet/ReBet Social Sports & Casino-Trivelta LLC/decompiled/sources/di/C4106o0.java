package di;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4106o0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f45400a = new SoftReference(null);

    public final synchronized Object a(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.f45400a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = factory.invoke();
        this.f45400a = new SoftReference(invoke);
        return invoke;
    }
}
