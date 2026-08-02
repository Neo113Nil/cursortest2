package e3;

import Ae.InterfaceC2395h;
import Ae.M0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6285b {
    @NotNull
    public static final InterfaceC3978p0 a(@NotNull InterfaceC2395h interfaceC2395h, Object obj, InterfaceC3967k interfaceC3967k, int i11) {
        J j11 = (J) interfaceC3967k.m(r.a());
        return b(interfaceC2395h, obj, j11.getLifecycle(), AbstractC5434v.b.STARTED, kotlin.coroutines.g.f71771a, interfaceC3967k, i11 & 112);
    }

    @NotNull
    public static final InterfaceC3978p0 b(@NotNull InterfaceC2395h interfaceC2395h, Object obj, @NotNull AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, CoroutineContext coroutineContext, InterfaceC3967k interfaceC3967k, int i11) {
        Object[] objArr = {interfaceC2395h, abstractC5434v, bVar, coroutineContext};
        boolean F11 = ((((i11 & 7168) ^ 3072) > 2048 && interfaceC3967k.n(bVar)) || (i11 & 3072) == 2048) | interfaceC3967k.F(abstractC5434v) | interfaceC3967k.F(coroutineContext) | interfaceC3967k.F(interfaceC2395h);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C6284a c6284a = new C6284a(abstractC5434v, bVar, coroutineContext, interfaceC2395h, null);
            interfaceC3967k.x(c6284a);
            C11 = c6284a;
        }
        return n1.j(obj, objArr, (Function2) C11, interfaceC3967k);
    }

    @NotNull
    public static final InterfaceC3978p0 c(@NotNull M0 m02, InterfaceC3967k interfaceC3967k, int i11) {
        J j11 = (J) interfaceC3967k.m(r.a());
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        Object value = m02.getValue();
        AbstractC5434v lifecycle = j11.getLifecycle();
        int i12 = i11 & 14;
        int i13 = i11 << 3;
        return b(m02, value, lifecycle, bVar, gVar, interfaceC3967k, i12 | (i13 & 7168) | (i13 & 57344));
    }
}
