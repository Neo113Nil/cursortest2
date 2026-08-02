package v0;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;
import x0.InterfaceC10604i;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10167g implements InterfaceC10604i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f101544a;

    public C10167g(@NotNull I i11) {
        this.f101544a = i11;
    }

    @Override // x0.InterfaceC10604i
    public final int a() {
        return this.f101544a.o();
    }

    @Override // x0.InterfaceC10604i
    public final int b() {
        InterfaceC10174n interfaceC10174n = (InterfaceC10174n) C7714v.Z(this.f101544a.t().g());
        if (interfaceC10174n != null) {
            return interfaceC10174n.getIndex();
        }
        return 0;
    }

    @Override // x0.InterfaceC10604i
    public final void c(int i11, int i12) {
        this.f101544a.H(i11, i12, true);
    }

    @Override // x0.InterfaceC10604i
    public final float d(int i11) {
        InterfaceC10174n interfaceC10174n;
        y t2 = this.f101544a.t();
        if (t2.g().isEmpty()) {
            return 0.0f;
        }
        List<InterfaceC10174n> g10 = t2.g();
        int size = g10.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC10174n = null;
                break;
            }
            interfaceC10174n = g10.get(i12);
            if (interfaceC10174n.getIndex() == i11) {
                break;
            }
            i12++;
        }
        if (interfaceC10174n != null) {
            return r6.getOffset();
        }
        List<InterfaceC10174n> g11 = t2.g();
        int size2 = g11.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            i13 += g11.get(i14).getSize();
        }
        return ((i11 - r0.o()) * (t2.e() + (i13 / g11.size()))) - r0.p();
    }

    @Override // x0.InterfaceC10604i
    public final Object e(@NotNull Function2<? super InterfaceC9106G, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = this.f101544a.d(EnumC8372M.Default, function2, (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // x0.InterfaceC10604i
    public final int f() {
        return this.f101544a.p();
    }

    @Override // x0.InterfaceC10604i
    public final int getItemCount() {
        return this.f101544a.t().d();
    }
}
