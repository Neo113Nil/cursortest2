package G;

import B.InterfaceC1028c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3774a = new Object();

    public static final a a(InterfaceC1028c interfaceC1028c, int i10, boolean z10, Object obj) {
        b bVar;
        interfaceC1028c.i(Integer.rotateLeft(i10, 1), f3774a);
        Object g10 = interfaceC1028c.g();
        if (g10 == InterfaceC1028c.f494a.a()) {
            bVar = new b(i10, z10, obj);
            interfaceC1028c.d(bVar);
        } else {
            Intrinsics.checkNotNull(g10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) g10;
            bVar.v(obj);
        }
        interfaceC1028c.k();
        return bVar;
    }

    public static final a b(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }
}
