package v0;

import S0.C3991w0;
import androidx.compose.foundation.lazy.layout.o;
import c1.AbstractC5715f;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import v0.I;
import x0.b0;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10161a implements InterfaceC10160E {

    /* renamed from: a, reason: collision with root package name */
    private int f101519a = -1;

    /* renamed from: b, reason: collision with root package name */
    private o.b f101520b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f101521c;

    @Override // v0.InterfaceC10160E
    public final void a(@NotNull b0 b0Var, int i11) {
        for (int i12 = 0; i12 < 2; i12++) {
            b0Var.a(i11 + i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull I.c cVar, float f7, @NotNull y yVar) {
        o.b bVar;
        o.b bVar2;
        C3991w0 c3991w0;
        o.b bVar3;
        if (yVar.g().isEmpty()) {
            return;
        }
        boolean z11 = f7 < 0.0f;
        int index = z11 ? ((InterfaceC10174n) C7714v.X(yVar.g())).getIndex() + 1 : ((InterfaceC10174n) C7714v.K(yVar.g())).getIndex() - 1;
        if (index < 0 || index >= yVar.d()) {
            return;
        }
        if (index != this.f101519a) {
            if (this.f101521c != z11 && (bVar3 = this.f101520b) != null) {
                bVar3.cancel();
            }
            this.f101521c = z11;
            this.f101519a = index;
            I i11 = I.this;
            AbstractC5715f a11 = AbstractC5715f.a.a();
            Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
            AbstractC5715f b11 = AbstractC5715f.a.b(a11);
            try {
                c3991w0 = i11.f101474f;
                long k11 = ((C10157B) c3991w0.getValue()).k();
                AbstractC5715f.a.d(a11, b11, h11);
                this.f101520b = i11.z().e(index, k11);
            } catch (Throwable th2) {
                AbstractC5715f.a.d(a11, b11, h11);
                throw th2;
            }
        }
        if (!z11) {
            if (yVar.f() - ((InterfaceC10174n) C7714v.K(yVar.g())).getOffset() >= f7 || (bVar = this.f101520b) == null) {
                return;
            }
            bVar.a();
            return;
        }
        InterfaceC10174n interfaceC10174n = (InterfaceC10174n) C7714v.X(yVar.g());
        if (((interfaceC10174n.getSize() + interfaceC10174n.getOffset()) + yVar.e()) - yVar.h() >= (-f7) || (bVar2 = this.f101520b) == null) {
            return;
        }
        bVar2.a();
    }

    public final void c(@NotNull C10157B c10157b) {
        if (this.f101519a == -1 || c10157b.g().isEmpty()) {
            return;
        }
        if (this.f101519a != (this.f101521c ? ((InterfaceC10174n) C7714v.X(c10157b.g())).getIndex() + 1 : ((InterfaceC10174n) C7714v.K(c10157b.g())).getIndex() - 1)) {
            this.f101519a = -1;
            o.b bVar = this.f101520b;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f101520b = null;
        }
    }
}
