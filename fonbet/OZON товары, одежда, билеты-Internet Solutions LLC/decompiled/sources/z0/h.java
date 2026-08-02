package z0;

import D1.AbstractC2810k0;
import D1.C2811l;
import D1.InterfaceC2807j;
import android.graphics.Rect;
import android.view.View;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class h implements InterfaceC10968a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2807j f106875a;

    h(InterfaceC2807j interfaceC2807j) {
        this.f106875a = interfaceC2807j;
    }

    @Override // z0.InterfaceC10968a
    public final Object n1(@NotNull AbstractC2810k0 abstractC2810k0, @NotNull Function0 function0, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        View a11 = C2811l.a(this.f106875a);
        long y11 = abstractC2810k0.y(0L);
        C7460f c7460f = (C7460f) function0.invoke();
        C7460f A11 = c7460f != null ? c7460f.A(y11) : null;
        if (A11 != null) {
            a11.requestRectangleOnScreen(new Rect((int) A11.n(), (int) A11.q(), (int) A11.o(), (int) A11.h()), false);
        }
        return Unit.f71690a;
    }
}
