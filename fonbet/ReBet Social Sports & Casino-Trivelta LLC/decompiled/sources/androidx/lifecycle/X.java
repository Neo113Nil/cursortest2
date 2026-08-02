package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class X {
    public static final InterfaceC2193s a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(W0.a.f12962a);
            InterfaceC2193s interfaceC2193s = tag instanceof InterfaceC2193s ? (InterfaceC2193s) tag : null;
            if (interfaceC2193s != null) {
                return interfaceC2193s;
            }
            Object a10 = B0.b.a(view);
            view = a10 instanceof View ? (View) a10 : null;
        }
        return null;
    }

    public static final void b(View view, InterfaceC2193s interfaceC2193s) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(W0.a.f12962a, interfaceC2193s);
    }
}
