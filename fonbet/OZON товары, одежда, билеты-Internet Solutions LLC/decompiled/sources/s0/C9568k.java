package s0;

import B0.C0;
import Sc.InterfaceC3999a;
import Sc.s;
import androidx.compose.foundation.gestures.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.C;
import m0.C8011q0;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;
import r0.InterfaceC9120V;
import xe.C10727i;

@InterfaceC3999a
/* renamed from: s0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9568k implements InterfaceC9120V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9562e f98065a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7976A<Float> f98066b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8011q0 f98067c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private J.b f98068d = J.e();

    public C9568k(@NotNull C9562e c9562e, @NotNull InterfaceC7976A interfaceC7976A, @NotNull C8011q0 c8011q0) {
        this.f98065a = c9562e;
        this.f98066b = interfaceC7976A;
        this.f98067c = c8011q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(C9568k c9568k, C9112M.a aVar, float f7, float f11, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9567j c9567j;
        int i11;
        c9568k.getClass();
        if (cVar instanceof C9567j) {
            c9567j = (C9567j) cVar;
            int i12 = c9567j.f98064f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9567j.f98064f = i12 - LinearLayoutManager.INVALID_OFFSET;
                C9567j c9567j2 = c9567j;
                Object obj = c9567j2.f98062d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9567j2.f98064f;
                if (i11 != 0) {
                    s.b(obj);
                    if (Math.abs(f7) == 0.0f || Math.abs(f11) == 0.0f) {
                        return C0.a(f7, 28, f11);
                    }
                    c9567j2.f98064f = 1;
                    InterfaceC7976A<Float> interfaceC7976A = c9568k.f98066b;
                    InterfaceC9559b c9560c = Math.abs(C.a(interfaceC7976A, 0.0f, f11)) >= Math.abs(f7) ? new C9560c(interfaceC7976A) : new C9575r(c9568k.f98067c);
                    int i13 = C9573p.f98089b;
                    obj = c9560c.a(aVar, new Float(f7), new Float(f11), function1, c9567j2);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((C9558a) obj).c();
            }
        }
        c9567j = new C9567j(c9568k, cVar);
        C9567j c9567j22 = c9567j;
        Object obj2 = c9567j22.f98062d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9567j22.f98064f;
        if (i11 != 0) {
        }
        return ((C9558a) obj2).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(C9112M.a aVar, float f7, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9564g c9564g;
        int i11;
        Function1 function12;
        if (cVar instanceof C9564g) {
            c9564g = (C9564g) cVar;
            int i12 = c9564g.f98048g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9564g.f98048g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9564g.f98046e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9564g.f98048g;
                if (i11 != 0) {
                    s.b(obj);
                    J.b bVar = this.f98068d;
                    C9565h c9565h = new C9565h(this, f7, function1, aVar, null);
                    c9564g.f98045d = function1;
                    c9564g.f98048g = 1;
                    obj = C10727i.f(bVar, c9565h, c9564g);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    function12 = function1;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = c9564g.f98045d;
                    s.b(obj);
                }
                C9558a c9558a = (C9558a) obj;
                function12.invoke(new Float(0.0f));
                return c9558a;
            }
        }
        c9564g = new C9564g(this, cVar);
        Object obj2 = c9564g.f98046e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9564g.f98048g;
        if (i11 != 0) {
        }
        C9558a c9558a2 = (C9558a) obj2;
        function12.invoke(new Float(0.0f));
        return c9558a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // r0.InterfaceC9120V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull C9112M.a aVar, float f7, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9566i c9566i;
        int i11;
        if (cVar instanceof C9566i) {
            c9566i = (C9566i) cVar;
            int i12 = c9566i.f98061f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9566i.f98061f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9566i.f98059d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9566i.f98061f;
                if (i11 != 0) {
                    s.b(obj);
                    c9566i.f98061f = 1;
                    obj = h(aVar, f7, function1, c9566i);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                C9558a c9558a = (C9558a) obj;
                return new Float(((Number) c9558a.a()).floatValue() != 0.0f ? ((Number) c9558a.b().o()).floatValue() : 0.0f);
            }
        }
        c9566i = new C9566i(this, cVar);
        Object obj3 = c9566i.f98059d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9566i.f98061f;
        if (i11 != 0) {
        }
        C9558a c9558a2 = (C9558a) obj3;
        return new Float(((Number) c9558a2.a()).floatValue() != 0.0f ? ((Number) c9558a2.b().o()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9568k)) {
            return false;
        }
        C9568k c9568k = (C9568k) obj;
        return c9568k.f98067c.equals(this.f98067c) && Intrinsics.d(c9568k.f98066b, this.f98066b) && c9568k.f98065a.equals(this.f98065a);
    }

    public final int hashCode() {
        return this.f98065a.hashCode() + ((this.f98066b.hashCode() + (this.f98067c.hashCode() * 31)) * 31);
    }
}
