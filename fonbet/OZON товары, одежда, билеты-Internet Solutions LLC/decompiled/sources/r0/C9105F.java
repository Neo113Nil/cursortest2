package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import m0.C8011q0;
import n0.EnumC8372M;
import n0.d0;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9105F {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull InterfaceC9108I interfaceC9108I, float f7, @NotNull C8011q0 c8011q0, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9101B c9101b;
        int i11;
        kotlin.jvm.internal.J j11;
        if (cVar instanceof C9101B) {
            c9101b = (C9101B) cVar;
            int i12 = c9101b.f82389f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9101b.f82389f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9101b.f82388e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9101b.f82389f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                    Function2 c9102c = new C9102C(f7, c8011q0, j12, null);
                    c9101b.f82387d = j12;
                    c9101b.f82389f = 1;
                    if (interfaceC9108I.d(EnumC8372M.Default, c9102c, c9101b) == obj2) {
                        return obj2;
                    }
                    j11 = j12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = c9101b.f82387d;
                    Sc.s.b(obj);
                }
                return new Float(j11.f71784a);
            }
        }
        c9101b = new C9101B(cVar);
        Object obj3 = c9101b.f82388e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9101b.f82389f;
        if (i11 != 0) {
        }
        return new Float(j11.f71784a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(@NotNull d0 d0Var, float f7, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9103D c9103d;
        int i11;
        kotlin.jvm.internal.J j11;
        if (cVar instanceof C9103D) {
            c9103d = (C9103D) cVar;
            int i12 = c9103d.f82399f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9103d.f82399f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9103d.f82398e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9103d.f82399f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                    Function2 c9104e = new C9104E(j12, f7, null);
                    c9103d.f82397d = j12;
                    c9103d.f82399f = 1;
                    if (d0Var.d(EnumC8372M.Default, c9104e, c9103d) == obj2) {
                        return obj2;
                    }
                    j11 = j12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = c9103d.f82397d;
                    Sc.s.b(obj);
                }
                return new Float(j11.f71784a);
            }
        }
        c9103d = new C9103D(cVar);
        Object obj3 = c9103d.f82398e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9103d.f82399f;
        if (i11 != 0) {
        }
        return new Float(j11.f71784a);
    }
}
