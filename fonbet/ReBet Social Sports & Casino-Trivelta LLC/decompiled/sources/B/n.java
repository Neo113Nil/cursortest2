package B;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final l f512a = new l();

    public static final void a(Object obj, Function2 function2, InterfaceC1028c interfaceC1028c, int i10) {
        if (AbstractC1030e.c()) {
            AbstractC1030e.e(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        CoroutineContext c10 = interfaceC1028c.c();
        boolean l10 = interfaceC1028c.l(obj);
        Object g10 = interfaceC1028c.g();
        if (l10 || g10 == InterfaceC1028c.f494a.a()) {
            g10 = new p(c10, function2);
            interfaceC1028c.d(g10);
        }
        if (AbstractC1030e.c()) {
            AbstractC1030e.d();
        }
    }
}
