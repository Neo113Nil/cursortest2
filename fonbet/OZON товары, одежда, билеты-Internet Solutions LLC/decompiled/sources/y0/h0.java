package y0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;
import r0.InterfaceC9120V;
import r0.InterfaceC9138r;

/* loaded from: classes8.dex */
final class h0 implements InterfaceC9138r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9120V f105823a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f105824b;

    public h0(@NotNull InterfaceC9120V interfaceC9120V, @NotNull b0 b0Var) {
        this.f105823a = interfaceC9120V;
        this.f105824b = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // r0.InterfaceC9138r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C9112M.a aVar, float f7, @NotNull kotlin.coroutines.d dVar) {
        f0 f0Var;
        int i11;
        if (dVar instanceof f0) {
            f0Var = (f0) dVar;
            int i12 = f0Var.f105810f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                f0Var.f105810f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = f0Var.f105808d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = f0Var.f105810f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    g0 g0Var = new g0(this, aVar);
                    f0Var.f105810f = 1;
                    obj = this.f105823a.b(aVar, f7, g0Var, f0Var);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        f0Var = new f0(this, (kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = f0Var.f105808d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = f0Var.f105810f;
        if (i11 != 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }

    @NotNull
    public final b0 c() {
        return this.f105824b;
    }
}
