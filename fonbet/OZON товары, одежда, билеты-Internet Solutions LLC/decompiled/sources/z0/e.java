package z0;

import D1.AbstractC2810k0;
import D1.B;
import D1.C2809k;
import D1.I0;
import androidx.compose.ui.e;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import r0.C9126f;
import xe.N;

/* loaded from: classes.dex */
public final class e extends e.c implements InterfaceC10968a, B, I0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f106854c = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C9126f f106855a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f106856b;

    public static final class a {
    }

    public e(@NotNull C9126f c9126f) {
        this.f106855a = c9126f;
    }

    public static final C7460f I1(e eVar, AbstractC2810k0 abstractC2810k0, Function0 function0) {
        C7460f c7460f;
        if (eVar.isAttached() && eVar.f106856b) {
            AbstractC2810k0 e11 = C2809k.e(eVar);
            if (!abstractC2810k0.I()) {
                abstractC2810k0 = null;
            }
            if (abstractC2810k0 != null && (c7460f = (C7460f) function0.invoke()) != null) {
                return c.a(e11, abstractC2810k0, c7460f);
            }
        }
        return null;
    }

    @NotNull
    public final d J1() {
        return this.f106855a;
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return f106854c;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // z0.InterfaceC10968a
    public final Object n1(@NotNull AbstractC2810k0 abstractC2810k0, @NotNull Function0 function0, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object d11 = N.d(new f(this, abstractC2810k0, function0, new g(this, abstractC2810k0, function0), null), cVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // D1.B
    public final void y(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f106856b = true;
    }
}
