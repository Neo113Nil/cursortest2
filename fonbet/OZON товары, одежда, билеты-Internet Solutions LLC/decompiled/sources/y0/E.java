package y0;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;
import x0.InterfaceC10604i;

/* loaded from: classes8.dex */
public final class E implements InterfaceC10604i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b0 f105643a;

    E(b0 b0Var) {
        this.f105643a = b0Var;
    }

    @Override // x0.InterfaceC10604i
    public final int a() {
        return this.f105643a.u();
    }

    @Override // x0.InterfaceC10604i
    public final int b() {
        return ((InterfaceC10807n) C7714v.X(this.f105643a.z().f())).getIndex();
    }

    @Override // x0.InterfaceC10604i
    public final void c(int i11, int i12) {
        this.f105643a.V(i12 / r0.E(), i11);
    }

    @Override // x0.InterfaceC10604i
    public final float d(int i11) {
        InterfaceC10807n interfaceC10807n;
        b0 b0Var = this.f105643a;
        List<InterfaceC10807n> f7 = b0Var.z().f();
        int size = f7.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC10807n = null;
                break;
            }
            interfaceC10807n = f7.get(i12);
            if (interfaceC10807n.getIndex() == i11) {
                break;
            }
            i12++;
        }
        if (interfaceC10807n != null) {
            return r4.getOffset();
        }
        return ((i11 - b0Var.r()) * (b0Var.F() + b0Var.D())) - (b0Var.s() * b0Var.E());
    }

    @Override // x0.InterfaceC10604i
    public final Object e(@NotNull Function2<? super InterfaceC9106G, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = this.f105643a.d(EnumC8372M.Default, function2, (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // x0.InterfaceC10604i
    public final int f() {
        return this.f105643a.v();
    }

    @Override // x0.InterfaceC10604i
    public final int getItemCount() {
        return this.f105643a.C();
    }
}
